package gt4;

/* loaded from: classes9.dex */
public class c1 implements x51.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f356939a;

    /* renamed from: b, reason: collision with root package name */
    public final x51.n0 f356940b = new gt4.b1(this);

    public c1(java.lang.String str) {
        this.f356939a = str;
    }

    @Override // x51.o0
    public boolean a() {
        return true;
    }

    @Override // x51.o0
    public x51.n0 b() {
        return this.f356940b;
    }

    @Override // x51.o0
    public java.lang.String c() {
        return this.f356939a;
    }

    @Override // x51.o0
    public java.lang.String d() {
        return this.f356939a;
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
        return this.f356939a;
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
        return dt4.b.a(this.f356939a);
    }

    @Override // x51.o0
    public android.graphics.Bitmap l(android.graphics.Bitmap bitmap, x51.m0 m0Var, java.lang.String str) {
        if (x51.m0.NET == m0Var) {
            if (bitmap != null && bitmap.getNinePatchChunk() != null) {
                com.p314xaae8f345.mm.vfs.w6.c(str, k());
                return bitmap;
            }
            try {
                try {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.PNG, k(), false);
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WalletGetPicStrategy", e17, "", new java.lang.Object[0]);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletGetPicStrategy", "save bitmap fail");
                }
            } catch (java.io.IOException unused) {
                com.p314xaae8f345.mm.vfs.w6.u(dt4.b.f324761a);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletGetPicStrategy", " retry saving bitmap");
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.PNG, k(), false);
            }
        }
        m0Var.toString();
        return bitmap;
    }
}
