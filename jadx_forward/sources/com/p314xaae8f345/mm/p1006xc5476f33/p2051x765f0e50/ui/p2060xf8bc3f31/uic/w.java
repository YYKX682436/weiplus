package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.uic;

/* loaded from: classes.dex */
public final class w extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f243560d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        long c17 = c01.id.c();
        this.f243560d = c17;
        u24.n.a(c17);
        android.content.Intent intent = m158354x19263085().getIntent();
        java.lang.String stringExtra = intent.getStringExtra("page_name_kv");
        if (stringExtra == null) {
            stringExtra = "CommonSettingsUI";
        }
        java.lang.String str = stringExtra;
        int intExtra = intent.getIntExtra("ui_version", 1);
        int intExtra2 = intent.getIntExtra("setting_from_source", 2);
        int intExtra3 = intent.getIntExtra("setting_level", 1);
        java.lang.String b17 = u24.n.b();
        intent.putExtra("page_name_kv", str);
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        if (aVar.Zi(m158354x19263085()) <= 0) {
            aVar.Zj(m158354x19263085(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d.u.f34954x366c91de);
        }
        if (aVar.aj(m158354x19263085()) == null) {
            aVar.dk(m158354x19263085(), str);
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        java.lang.Integer REPORT_RULE = b24.a.f98927a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(REPORT_RULE, "REPORT_RULE");
        aVar.ik(m158354x19263085, 12, REPORT_RULE.intValue());
        aVar.Ai(m158354x19263085(), new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.uic.v(str, intExtra, intExtra2, intExtra3, b17));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        long j17 = this.f243560d;
        java.lang.Long l17 = u24.n.f505664b;
        if (l17 != null && j17 == l17.longValue()) {
            u24.n.f505663a = null;
        }
    }
}
