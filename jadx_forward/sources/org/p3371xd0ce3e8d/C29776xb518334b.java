package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.FileVideoCapturer */
/* loaded from: classes15.dex */
public class C29776xb518334b implements org.p3371xd0ce3e8d.InterfaceC29885x1cc01f67 {
    private static final java.lang.String TAG = "FileVideoCapturer";

    /* renamed from: capturerObserver */
    private org.p3371xd0ce3e8d.InterfaceC29751x4bd47102 f75388x7e102ce2;

    /* renamed from: videoReader */
    private final org.p3371xd0ce3e8d.C29776xb518334b.VideoReader f75391x3b99d11e;

    /* renamed from: timer */
    private final java.util.Timer f75390x6940745 = new java.util.Timer();

    /* renamed from: tickTask */
    private final java.util.TimerTask f75389x7371e4c2 = new java.util.TimerTask() { // from class: org.webrtc.FileVideoCapturer.1
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            org.p3371xd0ce3e8d.C29776xb518334b.this.m155530x36519d();
        }
    };

    /* renamed from: org.webrtc.FileVideoCapturer$VideoReader */
    /* loaded from: classes15.dex */
    public interface VideoReader {
        /* renamed from: close */
        void mo155531x5a5ddf8();

        /* renamed from: getNextFrame */
        org.p3371xd0ce3e8d.C29904x150215d2 mo155532x46997f84();
    }

    /* renamed from: org.webrtc.FileVideoCapturer$VideoReaderY4M */
    /* loaded from: classes15.dex */
    public static class VideoReaderY4M implements org.p3371xd0ce3e8d.C29776xb518334b.VideoReader {

        /* renamed from: FRAME_DELIMETER_LENGTH */
        private static final int f75393x9a289dec = 6;
        private static final java.lang.String TAG = "VideoReaderY4M";

        /* renamed from: Y4M_FRAME_DELIMETER */
        private static final java.lang.String f75394x90e0da6c = "FRAME";

        /* renamed from: frameHeight */
        private final int f75395xe414a0f4;

        /* renamed from: frameWidth */
        private final int f75396xef6a7059;

        /* renamed from: mediaFile */
        private final java.io.RandomAccessFile f75397x7f8e4780;

        /* renamed from: mediaFileChannel */
        private final java.nio.channels.FileChannel f75398x77fe5d63;

        /* renamed from: videoStart */
        private final long f75399x9ee854a7;

        public VideoReaderY4M(java.lang.String str) {
            java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(str, "r");
            this.f75397x7f8e4780 = randomAccessFile;
            this.f75398x77fe5d63 = randomAccessFile.getChannel();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            while (true) {
                int read = this.f75397x7f8e4780.read();
                if (read == -1) {
                    throw new java.lang.RuntimeException("Found end of file before end of header for file: " + str);
                }
                if (read == 10) {
                    this.f75399x9ee854a7 = this.f75398x77fe5d63.position();
                    java.lang.String str2 = "";
                    int i17 = 0;
                    int i18 = 0;
                    for (java.lang.String str3 : sb6.toString().split("[ ]")) {
                        char charAt = str3.charAt(0);
                        if (charAt == 'C') {
                            str2 = str3.substring(1);
                        } else if (charAt == 'H') {
                            i18 = java.lang.Integer.parseInt(str3.substring(1));
                        } else if (charAt == 'W') {
                            i17 = java.lang.Integer.parseInt(str3.substring(1));
                        }
                    }
                    org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Color space: " + str2);
                    if (!str2.equals("420") && !str2.equals("420mpeg2")) {
                        throw new java.lang.IllegalArgumentException("Does not support any other color space than I420 or I420mpeg2");
                    }
                    if (i17 % 2 == 1 || i18 % 2 == 1) {
                        throw new java.lang.IllegalArgumentException("Does not support odd width or height");
                    }
                    this.f75396xef6a7059 = i17;
                    this.f75395xe414a0f4 = i18;
                    org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "frame dim: (" + i17 + ", " + i18 + ")");
                    return;
                }
                sb6.append((char) read);
            }
        }

        @Override // org.p3371xd0ce3e8d.C29776xb518334b.VideoReader
        /* renamed from: close */
        public void mo155531x5a5ddf8() {
            try {
                this.f75397x7f8e4780.close();
            } catch (java.io.IOException e17) {
                org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "Problem closing file", e17);
            }
        }

        @Override // org.p3371xd0ce3e8d.C29776xb518334b.VideoReader
        /* renamed from: getNextFrame */
        public org.p3371xd0ce3e8d.C29904x150215d2 mo155532x46997f84() {
            long nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(android.os.SystemClock.elapsedRealtime());
            org.p3371xd0ce3e8d.C29794x1389e1eb m155631x6c090f3d = org.p3371xd0ce3e8d.C29794x1389e1eb.m155631x6c090f3d(this.f75396xef6a7059, this.f75395xe414a0f4);
            java.nio.ByteBuffer mo155640x744cac39 = m155631x6c090f3d.mo155640x744cac39();
            java.nio.ByteBuffer mo155638x744cac35 = m155631x6c090f3d.mo155638x744cac35();
            java.nio.ByteBuffer mo155639x744cac36 = m155631x6c090f3d.mo155639x744cac36();
            int i17 = (this.f75395xe414a0f4 + 1) / 2;
            m155631x6c090f3d.mo155644xcda3b86a();
            m155631x6c090f3d.mo155642xcda3b866();
            m155631x6c090f3d.mo155643xcda3b867();
            try {
                int i18 = f75393x9a289dec;
                java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(i18);
                if (this.f75398x77fe5d63.read(allocate) < i18) {
                    this.f75398x77fe5d63.position(this.f75399x9ee854a7);
                    if (this.f75398x77fe5d63.read(allocate) < i18) {
                        throw new java.lang.RuntimeException("Error looping video");
                    }
                }
                java.lang.String str = new java.lang.String(allocate.array(), java.nio.charset.Charset.forName("US-ASCII"));
                if (str.equals("FRAME\n")) {
                    this.f75398x77fe5d63.read(mo155640x744cac39);
                    this.f75398x77fe5d63.read(mo155638x744cac35);
                    this.f75398x77fe5d63.read(mo155639x744cac36);
                    return new org.p3371xd0ce3e8d.C29904x150215d2(m155631x6c090f3d, 0, nanos);
                }
                throw new java.lang.RuntimeException("Frames should be delimited by FRAME plus newline, found delimter was: '" + str + "'");
            } catch (java.io.IOException e17) {
                throw new java.lang.RuntimeException(e17);
            }
        }
    }

    public C29776xb518334b(java.lang.String str) {
        try {
            this.f75391x3b99d11e = new org.p3371xd0ce3e8d.C29776xb518334b.VideoReaderY4M(str);
        } catch (java.io.IOException e17) {
            org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Could not open video file: " + str);
            throw e17;
        }
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29885x1cc01f67
    /* renamed from: changeCaptureFormat */
    public void mo155151xb311390d(int i17, int i18, int i19) {
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29885x1cc01f67
    /* renamed from: dispose */
    public void mo155153x63a5261f() {
        this.f75391x3b99d11e.mo155531x5a5ddf8();
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29885x1cc01f67
    /* renamed from: initialize */
    public void mo155154x33ebcb90(org.p3371xd0ce3e8d.C29864x472c891c c29864x472c891c, android.content.Context context, org.p3371xd0ce3e8d.InterfaceC29751x4bd47102 interfaceC29751x4bd47102) {
        this.f75388x7e102ce2 = interfaceC29751x4bd47102;
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29885x1cc01f67
    /* renamed from: isScreencast */
    public boolean mo155155x68912275() {
        return false;
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29885x1cc01f67
    /* renamed from: startCapture */
    public void mo155157x18ec4884(int i17, int i18, int i19) {
        this.f75390x6940745.schedule(this.f75389x7371e4c2, 0L, 1000 / i19);
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29885x1cc01f67
    /* renamed from: stopCapture */
    public void mo155158xd45bb0e4() {
        this.f75390x6940745.cancel();
    }

    /* renamed from: tick */
    public void m155530x36519d() {
        org.p3371xd0ce3e8d.C29904x150215d2 mo155532x46997f84 = this.f75391x3b99d11e.mo155532x46997f84();
        this.f75388x7e102ce2.mo155344x962f56cc(mo155532x46997f84);
        mo155532x46997f84.mo155513x41012807();
    }
}
