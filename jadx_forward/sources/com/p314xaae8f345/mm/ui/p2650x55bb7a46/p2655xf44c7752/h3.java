package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public class h3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f282513d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k3 f282514e;

    public h3(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k3 k3Var, int i17) {
        this.f282514e = k3Var;
        this.f282513d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 b17;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.f2 B;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k3 k3Var = this.f282514e;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.g1 g1Var = k3Var.f282662m;
        if (g1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImageGalleryLazyLoader", "loader is null!");
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.t2 t2Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.t2) g1Var;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var = t2Var.f282419d;
        android.graphics.Bitmap bitmap = null;
        if (k1Var != null && (b17 = k1Var.f282626h.b(this.f282513d)) != null && (B = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.B(b17)) != com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.f2.video && B != com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.f2.sight) {
            java.util.HashMap hashMap = t2Var.f282922n;
            java.lang.String str = (java.lang.String) hashMap.get(b17);
            if (str == null) {
                str = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).mj(b17, b17.z0(), true);
                hashMap.put(b17, str);
            }
            java.lang.String concat = str.concat("hd");
            bitmap = com.p314xaae8f345.mm.vfs.w6.j(concat) ? com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.t2.r(concat) : com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.t2.r(str);
        }
        if (bitmap == null) {
            return;
        }
        k3Var.f282672w.mo50293x3498a0(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.g3(this, bitmap));
    }
}
