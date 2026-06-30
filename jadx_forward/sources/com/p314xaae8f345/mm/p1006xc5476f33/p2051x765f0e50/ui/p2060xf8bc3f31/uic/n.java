package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.uic;

/* loaded from: classes8.dex */
public final class n extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f243538d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f243539e;

    /* renamed from: f, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f243540f;

    /* renamed from: g, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f243541g;

    /* renamed from: h, reason: collision with root package name */
    public long f243542h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f243538d = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.uic.m.f243537d);
        this.f243539e = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.uic.i(activity));
    }

    public static final java.lang.String T6(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.uic.n nVar) {
        nVar.getClass();
        return gm0.j1.b().j() + '_' + java.lang.System.currentTimeMillis();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f243540f;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a O6 = O6();
        this.f243540f = O6 != null ? v65.i.b(O6, null, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.uic.l(this, null), 1, null) : null;
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22496x54525e2a.ActionBarEditText actionBarEditText = (com.p314xaae8f345.mm.ui.p2740x696c9db.C22496x54525e2a.ActionBarEditText) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.d98);
        if (actionBarEditText != null) {
            actionBarEditText.requestFocus();
            actionBarEditText.addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.uic.k(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f243540f;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var2 = this.f243541g;
        if (r2Var2 != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f243540f;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a O6 = O6();
        this.f243540f = O6 != null ? v65.i.b(O6, null, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.uic.l(this, null), 1, null) : null;
    }
}
