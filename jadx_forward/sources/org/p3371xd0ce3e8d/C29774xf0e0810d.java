package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.EncodedImage */
/* loaded from: classes16.dex */
public class C29774xf0e0810d implements org.p3371xd0ce3e8d.InterfaceC29846xbe8dd5fb {

    /* renamed from: buffer */
    public final java.nio.ByteBuffer f75368xaddb9440;

    /* renamed from: captureTimeMs */
    public final long f75369x76048439;

    /* renamed from: captureTimeNs */
    public final long f75370x76048458;

    /* renamed from: encodedHeight */
    public final int f75371xf96e7fd5;

    /* renamed from: encodedWidth */
    public final int f75372xe7d8b158;

    /* renamed from: frameType */
    public final org.p3371xd0ce3e8d.C29774xf0e0810d.FrameType f75373x207e2e47;

    /* renamed from: qp, reason: collision with root package name */
    public final java.lang.Integer f429444qp;

    /* renamed from: refCountDelegate */
    private final org.p3371xd0ce3e8d.C29845xdcc09601 f75374xefc51e1;

    /* renamed from: rotation */
    public final int f75375xfd990f7e;

    /* renamed from: org.webrtc.EncodedImage$Builder */
    /* loaded from: classes16.dex */
    public static class Builder {

        /* renamed from: buffer */
        private java.nio.ByteBuffer f75376xaddb9440;

        /* renamed from: captureTimeNs */
        private long f75377x76048458;

        /* renamed from: encodedHeight */
        private int f75378xf96e7fd5;

        /* renamed from: encodedWidth */
        private int f75379xe7d8b158;

        /* renamed from: frameType */
        private org.p3371xd0ce3e8d.C29774xf0e0810d.FrameType f75380x207e2e47;

        /* renamed from: qp, reason: collision with root package name */
        private java.lang.Integer f429445qp;

        /* renamed from: releaseCallback */
        private java.lang.Runnable f75381x68ceb56c;

        /* renamed from: rotation */
        private int f75382xfd990f7e;

        private Builder() {
        }

        /* renamed from: createEncodedImage */
        public org.p3371xd0ce3e8d.C29774xf0e0810d m155515x5dd08809() {
            return new org.p3371xd0ce3e8d.C29774xf0e0810d(this.f75376xaddb9440, this.f75381x68ceb56c, this.f75379xe7d8b158, this.f75378xf96e7fd5, this.f75377x76048458, this.f75380x207e2e47, this.f75382xfd990f7e, this.f429445qp);
        }

        /* renamed from: setBuffer */
        public org.p3371xd0ce3e8d.C29774xf0e0810d.Builder m155516x627eb42(java.nio.ByteBuffer byteBuffer, java.lang.Runnable runnable) {
            this.f75376xaddb9440 = byteBuffer;
            this.f75381x68ceb56c = runnable;
            return this;
        }

        @java.lang.Deprecated
        /* renamed from: setCaptureTimeMs */
        public org.p3371xd0ce3e8d.C29774xf0e0810d.Builder m155517xc63aa6f7(long j17) {
            this.f75377x76048458 = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(j17);
            return this;
        }

        /* renamed from: setCaptureTimeNs */
        public org.p3371xd0ce3e8d.C29774xf0e0810d.Builder m155518xc63aa716(long j17) {
            this.f75377x76048458 = j17;
            return this;
        }

        /* renamed from: setEncodedHeight */
        public org.p3371xd0ce3e8d.C29774xf0e0810d.Builder m155519x49a4a293(int i17) {
            this.f75378xf96e7fd5 = i17;
            return this;
        }

        /* renamed from: setEncodedWidth */
        public org.p3371xd0ce3e8d.C29774xf0e0810d.Builder m155520x7f143eda(int i17) {
            this.f75379xe7d8b158 = i17;
            return this;
        }

        /* renamed from: setFrameType */
        public org.p3371xd0ce3e8d.C29774xf0e0810d.Builder m155521x7c3f6005(org.p3371xd0ce3e8d.C29774xf0e0810d.FrameType frameType) {
            this.f75380x207e2e47 = frameType;
            return this;
        }

        /* renamed from: setQp */
        public org.p3371xd0ce3e8d.C29774xf0e0810d.Builder m155522x6843621(java.lang.Integer num) {
            this.f429445qp = num;
            return this;
        }

        /* renamed from: setRotation */
        public org.p3371xd0ce3e8d.C29774xf0e0810d.Builder m155523x742bae00(int i17) {
            this.f75382xfd990f7e = i17;
            return this;
        }
    }

    /* renamed from: org.webrtc.EncodedImage$FrameType */
    /* loaded from: classes11.dex */
    public enum FrameType {
        EmptyFrame(0),
        VideoFrameKey(3),
        VideoFrameDelta(4);


        /* renamed from: nativeIndex */
        private final int f75387x67275efb;

        FrameType(int i17) {
            this.f75387x67275efb = i17;
        }

        /* renamed from: fromNativeIndex */
        public static org.p3371xd0ce3e8d.C29774xf0e0810d.FrameType m155525xde3460f1(int i17) {
            for (org.p3371xd0ce3e8d.C29774xf0e0810d.FrameType frameType : m155527xcee59d22()) {
                if (frameType.m155528x2659730d() == i17) {
                    return frameType;
                }
            }
            throw new java.lang.IllegalArgumentException("Unknown native frame type: " + i17);
        }

        /* renamed from: getNative */
        public int m155528x2659730d() {
            return this.f75387x67275efb;
        }
    }

    /* renamed from: builder */
    public static org.p3371xd0ce3e8d.C29774xf0e0810d.Builder m155505xdc3ef9b() {
        return new org.p3371xd0ce3e8d.C29774xf0e0810d.Builder();
    }

    /* renamed from: getBuffer */
    private java.nio.ByteBuffer m155506x12f2b736() {
        return this.f75368xaddb9440;
    }

    /* renamed from: getCaptureTimeNs */
    private long m155507x336440a2() {
        return this.f75370x76048458;
    }

    /* renamed from: getEncodedHeight */
    private int m155508xb6ce3c1f() {
        return this.f75371xf96e7fd5;
    }

    /* renamed from: getEncodedWidth */
    private int m155509x48cb43ce() {
        return this.f75372xe7d8b158;
    }

    /* renamed from: getFrameType */
    private int m155510x1feb9f91() {
        return this.f75373x207e2e47.m155528x2659730d();
    }

    /* renamed from: getQp */
    private java.lang.Integer m155511x5db1c15() {
        return this.f429444qp;
    }

    /* renamed from: getRotation */
    private int m155512x79734cf4() {
        return this.f75375xfd990f7e;
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29846xbe8dd5fb
    /* renamed from: release */
    public void mo155513x41012807() {
        this.f75374xefc51e1.mo155513x41012807();
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29846xbe8dd5fb
    /* renamed from: retain */
    public void mo155514xc84df105() {
        this.f75374xefc51e1.mo155514xc84df105();
    }

    private C29774xf0e0810d(java.nio.ByteBuffer byteBuffer, java.lang.Runnable runnable, int i17, int i18, long j17, org.p3371xd0ce3e8d.C29774xf0e0810d.FrameType frameType, int i19, java.lang.Integer num) {
        this.f75368xaddb9440 = byteBuffer;
        this.f75372xe7d8b158 = i17;
        this.f75371xf96e7fd5 = i18;
        this.f75369x76048439 = java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(j17);
        this.f75370x76048458 = j17;
        this.f75373x207e2e47 = frameType;
        this.f75375xfd990f7e = i19;
        this.f429444qp = num;
        this.f75374xefc51e1 = new org.p3371xd0ce3e8d.C29845xdcc09601(runnable);
    }
}
