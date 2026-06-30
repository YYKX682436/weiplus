package com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e;

/* loaded from: classes8.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.u0 f232039a = new com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.u0();

    /* renamed from: b, reason: collision with root package name */
    public static final o11.g f232040b;

    static {
        o11.f fVar = new o11.f();
        fVar.f423610a = true;
        fVar.f423618i = 1;
        fVar.f423621l = android.graphics.Bitmap.Config.RGB_565;
        f232040b = fVar.a();
    }

    public final boolean a(android.graphics.Bitmap bmp, java.lang.String src, java.lang.String destPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bmp, "bmp");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(src, "src");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(destPath, "destPath");
        try {
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(bmp.getByteCount());
            bmp.copyPixelsToBuffer(allocate);
            return ((h12.z) ((k12.u) i95.n0.c(k12.u.class))).Zi(allocate.array(), src, destPath, bmp.getWidth(), bmp.getHeight(), bmp.getWidth(), bmp.getHeight(), 2, 0, new byte[0]) == 0;
        } catch (java.lang.OutOfMemoryError unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MultiTaskLogic", "convertBmp2Wxam bmp OutOfMemoryError!");
            return false;
        }
    }

    public final java.lang.String b(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.v0.f232145a;
        sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.v0.f232146b);
        sb6.append(str);
        return sb6.toString();
    }

    public final java.lang.String c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c) {
        java.lang.String str = c16601x7ed0e40c != null ? c16601x7ed0e40c.f66791xc8a07680 : null;
        if (str == null) {
            str = "";
        }
        return b(str);
    }
}
