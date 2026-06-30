package com.p314xaae8f345.mm.p951x7e023fd2.p952xbe953013.p953x316226;

/* loaded from: classes12.dex */
public class a implements p11.b {

    /* renamed from: a, reason: collision with root package name */
    public p11.g f152779a;

    public boolean a(java.lang.String str, o11.g gVar) {
        java.lang.String c17 = c(str, gVar);
        if (c17 == null) {
            return false;
        }
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(c17);
        java.lang.String str2 = a17.f294812f;
        if (str2 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        return m17.a() && m17.f294799a.d(m17.f294800b);
    }

    public java.io.InputStream b(java.lang.String str, o11.g gVar) {
        try {
            java.lang.String c17 = c(str, gVar);
            if (c17 == null) {
                return null;
            }
            return com.p314xaae8f345.mm.vfs.w6.E(c17);
        } catch (java.io.FileNotFoundException unused) {
            return null;
        }
    }

    public final java.lang.String c(java.lang.String str, o11.g gVar) {
        java.lang.String str2 = gVar.f423640e;
        if ((str2 == null || str2.length() == 0) && (str2 = gVar.f423641f) != null && str2.length() != 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str2);
            sb6.append("/");
            ((com.p314xaae8f345.mm.p951x7e023fd2.p952xbe953013.p953x316226.e) this.f152779a).getClass();
            sb6.append(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? kk.k.g(str.getBytes()) : null);
            str2 = sb6.toString();
        }
        if (gVar.f423637b && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            java.lang.String str3 = t11.b.f496089a;
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            java.lang.String str4 = t11.b.f496089a;
            sb8.append(str4);
            sb8.append("/");
            sb8.append(new java.text.SimpleDateFormat("yyyyMMdd").format(new java.util.Date(java.lang.System.currentTimeMillis())));
            java.lang.String sb9 = sb8.toString();
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str4);
            java.lang.String str5 = a17.f294812f;
            if (str5 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str5, false, false);
                if (!str5.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.b3 b3Var = com.p314xaae8f345.mm.vfs.a3.f294314a;
            com.p314xaae8f345.mm.vfs.z2 m17 = b3Var.m(a17, null);
            if (!(m17.a() ? m17.f294799a.F(m17.f294800b) : false)) {
                com.p314xaae8f345.mm.vfs.z2 m18 = b3Var.m(a17, m17);
                if (m18.a()) {
                    m18.f294799a.r(m18.f294800b);
                }
            }
            sb7.append(sb9);
            sb7.append("/");
            ((com.p314xaae8f345.mm.p951x7e023fd2.p952xbe953013.p953x316226.e) this.f152779a).getClass();
            sb7.append(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? kk.k.g(str.getBytes()) : null);
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
        com.p314xaae8f345.mm.vfs.r6 s17 = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(c17)).s();
        if (s17 != null && !s17.m()) {
            s17.J();
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(c17));
        if (!r6Var.m()) {
            try {
                r6Var.k();
            } catch (java.lang.Exception e17) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.imageloader.DefaultImageDiskCache", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            }
        }
        if (bArr != null && com.p314xaae8f345.mm.vfs.w6.S(c17, bArr, 0, bArr.length) < 0) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.ImageLoader", "save image to disk success url:%s filePath:%s", str, c17);
        return true;
    }
}
