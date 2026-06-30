package go2;

/* loaded from: classes2.dex */
public final class e extends fo2.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go2.g f355499d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(go2.g gVar, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, java.lang.String str) {
        super(activityC0065xcd7aa112, str);
        this.f355499d = gVar;
    }

    @Override // fo2.e
    public boolean A() {
        go2.g gVar = this.f355499d;
        r45.tr0 tr0Var = (r45.tr0) gVar.f534252d;
        if ((tr0Var != null ? java.lang.Long.valueOf(tr0Var.f468275z) : null) == null) {
            return false;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = gVar.f534252d;
        r45.tr0 tr0Var2 = (r45.tr0) fVar;
        if (tr0Var2 != null && tr0Var2.f468275z == 0) {
            return false;
        }
        r45.tr0 tr0Var3 = (r45.tr0) fVar;
        return tr0Var3 != null && tr0Var3.f468259g == 1;
    }

    @Override // fo2.e
    public void B() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_member_preview_mode", 1);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).Kk(this.f355499d.m80379x76847179(), intent, this.f346433c);
    }

    @Override // fo2.e
    public void C() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", "wxaliteb80deceef4f3f04a8643952c529d5471");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pages/detail/main?resourceId=");
        go2.g gVar = this.f355499d;
        r45.tr0 tr0Var = (r45.tr0) gVar.f534252d;
        sb6.append(pm0.v.u(tr0Var != null ? tr0Var.f468275z : 0L));
        sb6.append("&action=unsubscribe&scene=finder_member_topright");
        bundle.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, sb6.toString());
        bundle.putBoolean("isHalfScreen", false);
        bundle.putBoolean(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13307xd51ecb63, true);
        bundle.putDouble("heightPercent", 1.0d);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(gVar.m80379x76847179(), bundle, true, false, new go2.d());
    }

    @Override // fo2.e
    public boolean z() {
        r45.tr0 tr0Var = (r45.tr0) this.f355499d.f534252d;
        return tr0Var != null && tr0Var.f468259g == 2;
    }
}
