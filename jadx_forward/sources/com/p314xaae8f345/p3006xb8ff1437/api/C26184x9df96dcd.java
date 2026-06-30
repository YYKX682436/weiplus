package com.p314xaae8f345.p3006xb8ff1437.api;

/* renamed from: com.tencent.thumbplayer.api.TPPlayerFactory */
/* loaded from: classes15.dex */
public class C26184x9df96dcd {

    /* renamed from: LOG_TAG */
    private static final java.lang.String f50769x3f3d67df = "TPPlayerFactory";

    /* renamed from: createRichMediaASyncRequester */
    public static com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.InterfaceC26246x42ae6ca3 m101080xa4ce022c(android.content.Context context) {
        try {
            return new com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.p3057x58d027c.C26481xbbb5b8cc(context.getApplicationContext());
        } catch (java.lang.UnsupportedOperationException e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(f50769x3f3d67df, "Failed to create rich media async requester:" + e17.getMessage());
            return null;
        }
    }

    /* renamed from: createRichMediaSynchronizer */
    public static com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.InterfaceC26248xbe616625 m101081xd1e1220e(android.content.Context context) {
        try {
            return new com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.C26480xe1efa88e(context.getApplicationContext());
        } catch (java.lang.UnsupportedOperationException e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(f50769x3f3d67df, "Failed to create rich media synchronizer:" + e17.getMessage());
            return null;
        }
    }

    /* renamed from: createTPPlayer */
    public static com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 m101082x5f9ba979(android.content.Context context) {
        return (com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6) new com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26522x2e4c5bf1(new com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d(context)).m103639xceae316d();
    }

    /* renamed from: createTPSurface */
    public static com.p314xaae8f345.p3006xb8ff1437.api.C26196x1194f691 m101087x42ceb115(android.graphics.SurfaceTexture surfaceTexture) {
        return new com.p314xaae8f345.p3006xb8ff1437.api.C26196x1194f691(surfaceTexture);
    }

    /* renamed from: createTPPlayer */
    public static com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 m101086x5f9ba979(android.content.Context context, com.p314xaae8f345.p3006xb8ff1437.log.C26478xc50084e3 c26478xc50084e3) {
        return (com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6) new com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26522x2e4c5bf1(new com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d(context, null, null, c26478xc50084e3)).m103639xceae316d();
    }

    /* renamed from: createTPPlayer */
    public static com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 m101083x5f9ba979(android.content.Context context, android.os.Looper looper) {
        return (com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6) new com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26522x2e4c5bf1(new com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d(context, looper)).m103639xceae316d();
    }

    /* renamed from: createTPPlayer */
    public static com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 m101084x5f9ba979(android.content.Context context, android.os.Looper looper, android.os.Looper looper2) {
        return (com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6) new com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26522x2e4c5bf1(new com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d(context, looper, looper2)).m103639xceae316d();
    }

    /* renamed from: createTPPlayer */
    public static com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 m101085x5f9ba979(android.content.Context context, android.os.Looper looper, android.os.Looper looper2, com.p314xaae8f345.p3006xb8ff1437.log.C26478xc50084e3 c26478xc50084e3) {
        return (com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6) new com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26522x2e4c5bf1(new com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d(context, looper, looper2, c26478xc50084e3)).m103639xceae316d();
    }
}
