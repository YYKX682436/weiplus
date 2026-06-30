package com.p314xaae8f345.p3006xb8ff1437.p3022xfd16d1d7;

/* renamed from: com.tencent.thumbplayer.caputure.TPSysPlayerImageCapture */
/* loaded from: classes16.dex */
public class C26255x5e285b7d {

    /* renamed from: EV_CAP_IMAGE */
    private static final int f51365x1b43a460 = 1;

    /* renamed from: EV_STOP_CAP_IMAGE */
    private static final int f51366x45f437bf = 2;
    private static final java.lang.String TAG = "TPSysPlayerImageCapture";

    /* renamed from: gInstance */
    private static com.p314xaae8f345.p3006xb8ff1437.p3022xfd16d1d7.C26255x5e285b7d f51367xcc79a21c;

    /* renamed from: _hellAccFlag_ */
    private byte f51368x7f11beae;

    /* renamed from: mCapHandler */
    private com.p314xaae8f345.p3006xb8ff1437.p3022xfd16d1d7.C26255x5e285b7d.EventHandler f51370x818e5765;

    /* renamed from: mHandlerThread */
    private android.os.HandlerThread f51371x3e0f3a87;

    /* renamed from: mRetriever */
    private android.media.MediaMetadataRetriever f51372x3dda11c9 = null;

    /* renamed from: mBaseID */
    private int f51369xfc33c679 = 0;

    /* renamed from: com.tencent.thumbplayer.caputure.TPSysPlayerImageCapture$CaptureMediaImageListener */
    /* loaded from: classes16.dex */
    public interface CaptureMediaImageListener {
        /* renamed from: onCaptureFailed */
        void mo101551x90bd1f84(int i17, int i18);

        /* renamed from: onCaptureSucceed */
        void mo101552x58601bdb(int i17, long j17, int i18, int i19, android.graphics.Bitmap bitmap, long j18);
    }

    /* renamed from: com.tencent.thumbplayer.caputure.TPSysPlayerImageCapture$CaptureMsg */
    /* loaded from: classes16.dex */
    public static class CaptureMsg {

        /* renamed from: assetFileDescriptor */
        private android.content.res.AssetFileDescriptor f51373xb24cd1b;

        /* renamed from: fileDescriptor */
        private java.io.FileDescriptor f51374x197efa0b;

        /* renamed from: height */
        private int f51375xb7389127;

        /* renamed from: id, reason: collision with root package name */
        private int f297075id;
        protected com.p314xaae8f345.p3006xb8ff1437.p3022xfd16d1d7.C26255x5e285b7d.CaptureMediaImageListener lis;

        /* renamed from: positionMs */
        private long f51376x5250fcaf;
        private java.lang.String url;

        /* renamed from: width */
        private int f51377x6be2dc6;

        private CaptureMsg() {
        }
    }

    /* renamed from: com.tencent.thumbplayer.caputure.TPSysPlayerImageCapture$EventHandler */
    /* loaded from: classes16.dex */
    public class EventHandler extends android.os.Handler {
        public EventHandler(android.os.Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            int i17 = message.what;
            if (i17 == 1) {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(com.p314xaae8f345.p3006xb8ff1437.p3022xfd16d1d7.C26255x5e285b7d.TAG, "eventHandler EV_CAP_IMAGE");
                com.p314xaae8f345.p3006xb8ff1437.p3022xfd16d1d7.C26255x5e285b7d.this.m101549xe188991e((com.p314xaae8f345.p3006xb8ff1437.p3022xfd16d1d7.C26255x5e285b7d.CaptureMsg) message.obj);
            } else {
                if (i17 != 2) {
                    com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(com.p314xaae8f345.p3006xb8ff1437.p3022xfd16d1d7.C26255x5e285b7d.TAG, "eventHandler unknow msg");
                    return;
                }
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(com.p314xaae8f345.p3006xb8ff1437.p3022xfd16d1d7.C26255x5e285b7d.TAG, "eventHandler EV_STOP_CAP_IMAGE");
                if (com.p314xaae8f345.p3006xb8ff1437.p3022xfd16d1d7.C26255x5e285b7d.this.f51372x3dda11c9 != null) {
                    com.p314xaae8f345.p3006xb8ff1437.p3022xfd16d1d7.C26255x5e285b7d.this.f51372x3dda11c9.release();
                    com.p314xaae8f345.p3006xb8ff1437.p3022xfd16d1d7.C26255x5e285b7d.this.f51372x3dda11c9 = null;
                }
            }
        }
    }

    /* renamed from: com.tencent.thumbplayer.caputure.TPSysPlayerImageCapture$TPSysImageCaptureParams */
    /* loaded from: classes16.dex */
    public static class TPSysImageCaptureParams {

        /* renamed from: assetFileDescriptor */
        public android.content.res.AssetFileDescriptor f51379xb24cd1b;

        /* renamed from: fileDescriptor */
        public java.io.FileDescriptor f51380x197efa0b;

        /* renamed from: height */
        public int f51381xb7389127;

        /* renamed from: positionMs */
        public long f51382x5250fcaf;
        public java.lang.String url;

        /* renamed from: width */
        public int f51383x6be2dc6;
    }

    private C26255x5e285b7d() {
        this.f51371x3e0f3a87 = null;
        this.f51370x818e5765 = null;
        try {
            this.f51371x3e0f3a87 = com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26581x3df100e2.m104405x9cf0d20b().m104411x2a51c4e4();
            this.f51370x818e5765 = new com.p314xaae8f345.p3006xb8ff1437.p3022xfd16d1d7.C26255x5e285b7d.EventHandler(this.f51371x3e0f3a87.getLooper());
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, th6);
            this.f51370x818e5765 = new com.p314xaae8f345.p3006xb8ff1437.p3022xfd16d1d7.C26255x5e285b7d.EventHandler(android.os.Looper.getMainLooper());
        }
    }

    /* renamed from: GetImageCaptureInstance */
    public static synchronized com.p314xaae8f345.p3006xb8ff1437.p3022xfd16d1d7.C26255x5e285b7d m101545x51237b76() {
        com.p314xaae8f345.p3006xb8ff1437.p3022xfd16d1d7.C26255x5e285b7d c26255x5e285b7d;
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3022xfd16d1d7.C26255x5e285b7d.class) {
            if (f51367xcc79a21c == null) {
                f51367xcc79a21c = new com.p314xaae8f345.p3006xb8ff1437.p3022xfd16d1d7.C26255x5e285b7d();
            }
            c26255x5e285b7d = f51367xcc79a21c;
        }
        return c26255x5e285b7d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: doRealCaptureImage */
    public void m101549xe188991e(com.p314xaae8f345.p3006xb8ff1437.p3022xfd16d1d7.C26255x5e285b7d.CaptureMsg captureMsg) {
        android.media.MediaMetadataRetriever mediaMetadataRetriever;
        try {
            try {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                android.media.MediaMetadataRetriever mediaMetadataRetriever2 = this.f51372x3dda11c9;
                if (mediaMetadataRetriever2 != null) {
                    mediaMetadataRetriever2.release();
                    this.f51372x3dda11c9 = null;
                }
                this.f51372x3dda11c9 = new android.media.MediaMetadataRetriever();
                if (captureMsg.f51374x197efa0b != null) {
                    this.f51372x3dda11c9.setDataSource(captureMsg.f51374x197efa0b);
                } else if (captureMsg.f51373xb24cd1b != null) {
                    this.f51372x3dda11c9.setDataSource(captureMsg.f51373xb24cd1b.getFileDescriptor(), captureMsg.f51373xb24cd1b.getStartOffset(), captureMsg.f51373xb24cd1b.getLength());
                } else {
                    this.f51372x3dda11c9.setDataSource(captureMsg.url, new java.util.HashMap());
                }
                android.media.MediaMetadataRetriever mediaMetadataRetriever3 = this.f51372x3dda11c9;
                long j17 = captureMsg.f51376x5250fcaf * 1000;
                zj0.a aVar = new zj0.a();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                aVar.c(2);
                aVar.c(java.lang.Long.valueOf(j17));
                yj0.a.d(mediaMetadataRetriever3, aVar.b(), "com/tencent/thumbplayer/caputure/TPSysPlayerImageCapture", "doRealCaptureImage", "(Lcom/tencent/thumbplayer/caputure/TPSysPlayerImageCapture$CaptureMsg;)V", "Undefined", "getFrameAtTime", "(JI)Landroid/graphics/Bitmap;");
                zj0.c.f554818a.set(aVar);
                android.graphics.Bitmap frameAtTime = mediaMetadataRetriever3.getFrameAtTime(((java.lang.Long) aVar.a(0)).longValue(), ((java.lang.Integer) zj0.c.a().a(1)).intValue());
                yj0.a.e(mediaMetadataRetriever3, frameAtTime, "com/tencent/thumbplayer/caputure/TPSysPlayerImageCapture", "doRealCaptureImage", "(Lcom/tencent/thumbplayer/caputure/TPSysPlayerImageCapture$CaptureMsg;)V", "Undefined", "getFrameAtTime", "(JI)Landroid/graphics/Bitmap;");
                long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                if (frameAtTime != null) {
                    captureMsg.lis.mo101552x58601bdb(captureMsg.f297075id, captureMsg.f51376x5250fcaf, captureMsg.f51377x6be2dc6, captureMsg.f51375xb7389127, frameAtTime, currentTimeMillis2);
                } else {
                    captureMsg.lis.mo101551x90bd1f84(captureMsg.f297075id, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26301x695ae9c.f51906x7b29883d);
                }
                mediaMetadataRetriever = this.f51372x3dda11c9;
                if (mediaMetadataRetriever == null) {
                    return;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e17);
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "doRealCaptureImage, Exception: " + e17.toString());
                captureMsg.lis.mo101551x90bd1f84(captureMsg.f297075id, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26301x695ae9c.f51906x7b29883d);
                mediaMetadataRetriever = this.f51372x3dda11c9;
                if (mediaMetadataRetriever == null) {
                    return;
                }
            }
            mediaMetadataRetriever.release();
            this.f51372x3dda11c9 = null;
        } catch (java.lang.Throwable th6) {
            android.media.MediaMetadataRetriever mediaMetadataRetriever4 = this.f51372x3dda11c9;
            if (mediaMetadataRetriever4 != null) {
                mediaMetadataRetriever4.release();
                this.f51372x3dda11c9 = null;
            }
            throw th6;
        }
    }

    /* renamed from: captureImageWithPosition */
    public int m101550xffe58264(com.p314xaae8f345.p3006xb8ff1437.p3022xfd16d1d7.C26255x5e285b7d.TPSysImageCaptureParams tPSysImageCaptureParams, com.p314xaae8f345.p3006xb8ff1437.p3022xfd16d1d7.C26255x5e285b7d.CaptureMediaImageListener captureMediaImageListener) {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "captureImageWithPosition, position: " + tPSysImageCaptureParams.f51382x5250fcaf + ", width: " + tPSysImageCaptureParams.f51383x6be2dc6 + ", height: " + tPSysImageCaptureParams.f51381xb7389127);
        this.f51369xfc33c679 = this.f51369xfc33c679 + 1;
        if (!android.text.TextUtils.isEmpty(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101947x1ccda9f7()) && com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101947x1ccda9f7().equals("Lenovo+K900")) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "captureImageWithPosition, Lenovo+K900 no incompatible");
            return -1;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3022xfd16d1d7.C26255x5e285b7d.CaptureMsg captureMsg = new com.p314xaae8f345.p3006xb8ff1437.p3022xfd16d1d7.C26255x5e285b7d.CaptureMsg();
        captureMsg.f297075id = this.f51369xfc33c679;
        captureMsg.f51374x197efa0b = tPSysImageCaptureParams.f51380x197efa0b;
        captureMsg.f51373xb24cd1b = tPSysImageCaptureParams.f51379xb24cd1b;
        captureMsg.url = tPSysImageCaptureParams.url;
        captureMsg.f51376x5250fcaf = tPSysImageCaptureParams.f51382x5250fcaf;
        captureMsg.f51377x6be2dc6 = tPSysImageCaptureParams.f51383x6be2dc6;
        captureMsg.f51375xb7389127 = tPSysImageCaptureParams.f51381xb7389127;
        captureMsg.lis = captureMediaImageListener;
        android.os.Message message = new android.os.Message();
        message.what = 1;
        message.obj = captureMsg;
        if (!this.f51370x818e5765.sendMessage(message)) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "captureImageWithPosition, send msg failed ");
        }
        return this.f51369xfc33c679;
    }
}
