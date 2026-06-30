package at2;

/* loaded from: classes2.dex */
public final class o0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ at2.q0 f95258d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o25.y1 f95259e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f95260f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f95261g;

    public o0(at2.q0 q0Var, o25.y1 y1Var, android.content.Context context, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var) {
        this.f95258d = q0Var;
        this.f95259e = y1Var;
        this.f95260f = context;
        this.f95261g = k0Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = ((mm2.c1) this.f95258d.S0().a(mm2.c1.class)).f410379n;
        if (c19792x256d2725 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(menuItem, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMMenuItem");
            ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) this.f95259e).aj((db5.h4) menuItem, new at2.n0(this.f95260f, this.f95261g, c19792x256d2725, menuItem));
        }
    }
}
