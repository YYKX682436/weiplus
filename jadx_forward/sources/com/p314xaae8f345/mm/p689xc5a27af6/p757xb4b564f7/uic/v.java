package com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic;

/* loaded from: classes8.dex */
public final class v extends wm3.a {

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f148909f = jz5.h.b(com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.p.f148897d);

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f148910d;

    /* renamed from: e, reason: collision with root package name */
    public db0.j f148911e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f148910d = jz5.h.b(new com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.u(this));
    }

    public static final void T6(com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.v vVar, int i17) {
        android.view.ViewGroup.LayoutParams layoutParams = vVar.U6().b().getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = i17;
        vVar.U6().b().setLayoutParams(marginLayoutParams);
    }

    public final em.a U6() {
        return (em.a) ((jz5.n) this.f148910d).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(m158354x19263085(), new com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.t(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        db0.j jVar = this.f148911e;
        if (jVar != null) {
            jVar.f309367d.clear();
            jVar.f309365b = null;
        }
    }
}
