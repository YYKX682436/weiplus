package com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui;

/* loaded from: classes5.dex */
public class o implements x51.o0 {

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f234853b = com.p314xaae8f345.mm.p2802xd031a825.f.a();

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f234854a;

    public o(java.lang.String str) {
        this.f234854a = str;
    }

    public static java.lang.String m(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletGetPicStrategy", "getStoragePath: but url is null");
            return null;
        }
        return java.lang.String.format("%s/%s", f234853b, kk.k.g(str.getBytes()));
    }

    @Override // x51.o0
    public boolean a() {
        return true;
    }

    @Override // x51.o0
    public x51.n0 b() {
        return null;
    }

    @Override // x51.o0
    public java.lang.String c() {
        return this.f234854a;
    }

    @Override // x51.o0
    public java.lang.String d() {
        return this.f234854a;
    }

    @Override // x51.o0
    public android.graphics.Bitmap e() {
        return null;
    }

    @Override // x51.o0
    public void f() {
    }

    @Override // x51.o0
    public java.lang.String g() {
        return this.f234854a;
    }

    @Override // x51.o0
    public void h(x51.m0 m0Var, java.lang.String str) {
    }

    @Override // x51.o0
    public boolean i() {
        return false;
    }

    @Override // x51.o0
    public void j(java.lang.String str, boolean z17) {
    }

    @Override // x51.o0
    public java.lang.String k() {
        return m(this.f234854a);
    }

    @Override // x51.o0
    public android.graphics.Bitmap l(android.graphics.Bitmap bitmap, x51.m0 m0Var, java.lang.String str) {
        if (x51.m0.NET == m0Var) {
            try {
                try {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.PNG, k(), false);
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WalletGetPicStrategy", e17, "", new java.lang.Object[0]);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletGetPicStrategy", "save bitmap fail");
                }
            } catch (java.io.IOException unused) {
                com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(f234853b);
                java.lang.String str2 = a17.f294812f;
                if (str2 != null) {
                    java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                    if (!str2.equals(l17)) {
                        a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                    }
                }
                com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
                if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b))) {
                    com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, m17);
                    if (m18.a()) {
                        m18.f294799a.r(m18.f294800b);
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletGetPicStrategy", " retry saving bitmap");
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.PNG, k(), false);
            }
        }
        m0Var.toString();
        return bitmap;
    }
}
