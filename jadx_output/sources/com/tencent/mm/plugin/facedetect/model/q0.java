package com.tencent.mm.plugin.facedetect.model;

/* loaded from: classes5.dex */
public class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f100031d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f100032e;

    public q0(android.graphics.Bitmap bitmap, java.lang.String str) {
        this.f100031d = bitmap;
        this.f100032e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.lang.String str = this.f100032e;
        android.graphics.Bitmap bitmap = this.f100031d;
        try {
            if (bitmap == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FaceUtils", "hy: bm is null. abort");
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FaceUtils", "hy: username is null or nil. return");
            } else {
                java.lang.String str2 = com.tencent.mm.plugin.facedetect.model.a.f99985a;
                com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str2);
                java.lang.String str3 = a17.f213279f;
                if (str3 != null) {
                    java.lang.String l17 = com.tencent.mm.vfs.e8.l(str3, false, false);
                    if (!str3.equals(l17)) {
                        a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                    }
                }
                com.tencent.mm.vfs.b3 b3Var = com.tencent.mm.vfs.a3.f212781a;
                com.tencent.mm.vfs.z2 m17 = b3Var.m(a17, null);
                if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
                    com.tencent.mm.vfs.z2 m18 = b3Var.m(a17, m17);
                    if (m18.a()) {
                        m18.f213266a.r(m18.f213267b);
                    }
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(str2);
                char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
                sb6.append(com.tencent.mm.sdk.platformtools.w2.b(str.getBytes()));
                java.lang.String sb7 = sb6.toString();
                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(sb7);
                if (!r6Var.m()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FaceUtils", "hy: last file already exists. del");
                    r6Var.k();
                }
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 85, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                if (byteArray != null) {
                    byte[] a18 = com.tencent.mm.plugin.facedetect.model.r0.a(byteArray, com.tencent.mm.plugin.facedetect.model.s0.j(str));
                    if (a18.length <= 0) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.FaceUtils", "hy: enc err. return null");
                    } else {
                        com.tencent.mm.vfs.w6.S(sb7, a18, 0, a18.length);
                    }
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.FaceUtils", "hy: nothing in stream");
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FaceUtils", e17, "hy: err in encrypt", new java.lang.Object[0]);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceUtils", "hy: saving blur bm using: %d ms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
    }
}
