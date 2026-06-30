package com.tencent.mm.modelimage.loader.impr;

/* loaded from: classes12.dex */
public class a implements p11.b {

    /* renamed from: a, reason: collision with root package name */
    public p11.g f71246a;

    public boolean a(java.lang.String str, o11.g gVar) {
        java.lang.String c17 = c(str, gVar);
        if (c17 == null) {
            return false;
        }
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(c17);
        java.lang.String str2 = a17.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        return m17.a() && m17.f213266a.d(m17.f213267b);
    }

    public java.io.InputStream b(java.lang.String str, o11.g gVar) {
        try {
            java.lang.String c17 = c(str, gVar);
            if (c17 == null) {
                return null;
            }
            return com.tencent.mm.vfs.w6.E(c17);
        } catch (java.io.FileNotFoundException unused) {
            return null;
        }
    }

    public final java.lang.String c(java.lang.String str, o11.g gVar) {
        java.lang.String str2 = gVar.f342107e;
        if ((str2 == null || str2.length() == 0) && (str2 = gVar.f342108f) != null && str2.length() != 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str2);
            sb6.append("/");
            ((com.tencent.mm.modelimage.loader.impr.e) this.f71246a).getClass();
            sb6.append(!com.tencent.mm.sdk.platformtools.t8.K0(str) ? kk.k.g(str.getBytes()) : null);
            str2 = sb6.toString();
        }
        if (gVar.f342104b && com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            java.lang.String str3 = t11.b.f414556a;
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            java.lang.String str4 = t11.b.f414556a;
            sb8.append(str4);
            sb8.append("/");
            sb8.append(new java.text.SimpleDateFormat("yyyyMMdd").format(new java.util.Date(java.lang.System.currentTimeMillis())));
            java.lang.String sb9 = sb8.toString();
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str4);
            java.lang.String str5 = a17.f213279f;
            if (str5 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str5, false, false);
                if (!str5.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.b3 b3Var = com.tencent.mm.vfs.a3.f212781a;
            com.tencent.mm.vfs.z2 m17 = b3Var.m(a17, null);
            if (!(m17.a() ? m17.f213266a.F(m17.f213267b) : false)) {
                com.tencent.mm.vfs.z2 m18 = b3Var.m(a17, m17);
                if (m18.a()) {
                    m18.f213266a.r(m18.f213267b);
                }
            }
            sb7.append(sb9);
            sb7.append("/");
            ((com.tencent.mm.modelimage.loader.impr.e) this.f71246a).getClass();
            sb7.append(!com.tencent.mm.sdk.platformtools.t8.K0(str) ? kk.k.g(str.getBytes()) : null);
            str2 = sb7.toString();
        }
        if (str2 == null || str2.length() == 0) {
            return null;
        }
        return str2;
    }

    public boolean d(java.lang.String str, byte[] bArr, o11.g gVar) {
        java.lang.String c17 = c(str, gVar);
        if (c17 == null) {
            return false;
        }
        com.tencent.mm.vfs.r6 s17 = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(c17)).s();
        if (s17 != null && !s17.m()) {
            s17.J();
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(c17));
        if (!r6Var.m()) {
            try {
                r6Var.k();
            } catch (java.lang.Exception e17) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.i("MicroMsg.imageloader.DefaultImageDiskCache", com.tencent.mm.sdk.platformtools.z3.c(e17));
            }
        }
        if (bArr != null && com.tencent.mm.vfs.w6.S(c17, bArr, 0, bArr.length) < 0) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.ImageLoader", "save image to disk success url:%s filePath:%s", str, c17);
        return true;
    }
}
