package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public class k8 implements zh1.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f282681a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f282682b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k5 f282683c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f282684d;

    public k8(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k5 k5Var, bi1.g gVar, boolean z17) {
        this.f282681a = new java.lang.ref.WeakReference(viewOnClickListenerC21748xb3d38e6b);
        this.f282682b = str;
        this.f282683c = k5Var;
        this.f282684d = z17;
    }

    @Override // zh1.a1
    public void a(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 c12473xe2bfc4b5) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b) this.f282681a.get();
        if (viewOnClickListenerC21748xb3d38e6b == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryUI", "tryEnhanceBottomSheet#onMyOpenMaterialsGot, ui is null");
            return;
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryUI", "tryEnhanceBottomSheet#onMyOpenMaterialsGot, fail");
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = viewOnClickListenerC21748xb3d38e6b.f282184q2;
        if (k0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryUI", "tryEnhanceBottomSheet#onMyOpenMaterialsGot, bottomSheet is null");
            return;
        }
        viewOnClickListenerC21748xb3d38e6b.F3 = this.f282682b;
        viewOnClickListenerC21748xb3d38e6b.G3 = c12473xe2bfc4b5;
        if (!((zh1.p) this.f282683c).Zi(k0Var, c12473xe2bfc4b5)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryUI", "tryEnhanceBottomSheet#onMyOpenMaterialsGot, not need enhance");
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var = viewOnClickListenerC21748xb3d38e6b.f282144g;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.gb u17 = k1Var != null ? k1Var.u() : null;
        if (u17 == null || com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.gb.f282498d == u17) {
            return;
        }
        viewOnClickListenerC21748xb3d38e6b.w9(this.f282684d);
    }
}
