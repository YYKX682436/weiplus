package com.tencent.mm.plugin.ball.service;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.ball.service.g f93161a = new com.tencent.mm.plugin.ball.service.g();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f93162b;

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f93163c;

    static {
        jz5.g b17 = jz5.h.b(com.tencent.mm.plugin.ball.service.e.f93148d);
        f93162b = b17;
        f93163c = jz5.h.b(com.tencent.mm.plugin.ball.service.f.f93156d);
        if (com.tencent.mm.vfs.w6.j((java.lang.String) ((jz5.n) b17).getValue())) {
            return;
        }
        com.tencent.mm.vfs.w6.u((java.lang.String) ((jz5.n) b17).getValue());
    }

    public final java.lang.String a(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append((java.lang.String) ((jz5.n) f93162b).getValue());
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        sb6.append(com.tencent.mm.sdk.platformtools.w2.b(str.getBytes()));
        return sb6.toString();
    }

    public final java.lang.String b(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        return ((java.lang.String) ((jz5.n) f93163c).getValue()) + com.tencent.mm.sdk.platformtools.w2.a(ballInfo.e());
    }

    public final void c(android.graphics.Bitmap bitmap, java.lang.String str) {
        if (bitmap != null) {
            if (com.tencent.mm.vfs.w6.j(str)) {
                com.tencent.mm.vfs.w6.h(str);
            }
            try {
                com.tencent.mm.sdk.platformtools.x.D0(bitmap, 70, android.graphics.Bitmap.CompressFormat.JPEG, str, false);
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FloatBallImageStorage", e17, "", new java.lang.Object[0]);
            }
        }
    }
}
