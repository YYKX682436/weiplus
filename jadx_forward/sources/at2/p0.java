package at2;

/* loaded from: classes3.dex */
public final class p0 implements db5.s4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f95263a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o25.y1 f95264b;

    public p0(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var, o25.y1 y1Var) {
        this.f95263a = k0Var;
        this.f95264b = y1Var;
    }

    @Override // db5.s4
    public final void a(android.view.MenuItem menuItem, int i17) {
        mm2.c1 c1Var = (mm2.c1) dk2.ef.f314905a.i(mm2.c1.class);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = c1Var != null ? c1Var.f410379n : null;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f95263a;
        if (k0Var == null || c19792x256d2725 == null) {
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(menuItem, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMMenuItem");
        ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) this.f95264b).bj(k0Var, (db5.h4) menuItem);
    }
}
