package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class v4 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f199005d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f199006e;

    /* renamed from: f, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f199007f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f199005d = "Finder.FinderLiveKeyboardUIC";
        this.f199007f = new p012xc85e97e9.p093xedfae76a.j0(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.s4(false, 0));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f199005d, "[LiveLifecycler]onPause " + this);
        super.mo2281xb01dfb57();
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.f199006e;
        if (f5Var != null) {
            f5Var.d();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f199005d, "[LiveLifecycler]onResume " + this);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.u4(this));
    }
}
