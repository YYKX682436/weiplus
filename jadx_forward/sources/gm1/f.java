package gm1;

/* loaded from: classes7.dex */
public final class f extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.v f354843d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxAssistantHeadlessUIC", "onDestroy");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.v vVar = this.f354843d;
        if (vVar != null) {
            vVar.E();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxAssistantHeadlessUIC", "onPause");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.v vVar = this.f354843d;
        if (vVar != null) {
            vVar.w();
        }
        super.mo2281xb01dfb57();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxAssistantHeadlessUIC", "onResume");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.v vVar = this.f354843d;
        if (vVar != null) {
            vVar.A();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onViewCreated */
    public void mo47092x594b1124(android.view.View contentView) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12354xf2fbb9c8 c12354xf2fbb9c8;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentView, "contentView");
        this.f354843d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.v(m158354x19263085());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4) m158359x1e885992().getParcelableExtra("KEY_INIT_CONFIG");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559) m158359x1e885992().getParcelableExtra("KEY_STAT_OBJECT");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("launch appId:");
        sb6.append(c11809xbc286be4 != null ? c11809xbc286be4.f158811d : null);
        sb6.append(" statObject:");
        sb6.append(c12559xbdae8559 != null ? java.lang.Integer.valueOf(c12559xbdae8559.f169323f) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxAssistantHeadlessUIC", sb6.toString());
        if (c11809xbc286be4 != null && c12559xbdae8559 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.v vVar = this.f354843d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(vVar);
            c11809xbc286be4.f128802b2 = c12559xbdae8559;
            vVar.j(null, c11809xbc286be4);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.v vVar2 = this.f354843d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(vVar2);
        ym5.v6.b(contentView, vVar2.mo50154xfb86a31b());
        if (c11809xbc286be4 == null || (c12354xf2fbb9c8 = c11809xbc286be4.f158846z2) == null) {
            return;
        }
        c12354xf2fbb9c8.f166009d.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0());
    }
}
