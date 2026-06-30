package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes3.dex */
public final class ti extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.hp f190594d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ti(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        if (m158359x1e885992().hasExtra("liveContact")) {
            boolean booleanExtra = m158359x1e885992().getBooleanExtra("isDarkMode", false);
            java.lang.String stringExtra = m158359x1e885992().getStringExtra("fromUsername");
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
            r45.xn1 xn1Var = new r45.xn1();
            xn1Var.mo11468x92b714fd(m158359x1e885992().getByteArrayExtra("liveContact"));
            h0Var.f391656d = xn1Var;
            java.lang.String stringExtra2 = m158359x1e885992().getStringExtra("liveId");
            java.lang.String stringExtra3 = m158359x1e885992().getStringExtra("objectId");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveProfileWidgetJumpEmptyUIC", "liveIdStr:" + stringExtra2 + ", objectIdStr:" + stringExtra3);
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ri(booleanExtra, this, stringExtra, stringExtra2, stringExtra3, h0Var));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.hp hpVar = this.f190594d;
        if (hpVar != null) {
            hpVar.g0();
        }
    }
}
