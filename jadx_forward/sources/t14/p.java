package t14;

/* loaded from: classes11.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t14.q f496120d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f496121e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(t14.q qVar, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112) {
        super(0);
        this.f496120d = qVar;
        this.f496121e = activityC0065xcd7aa112;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        t14.s sVar;
        t14.q qVar = this.f496120d;
        j75.f Q6 = qVar.Q6();
        if (Q6 == null || (sVar = (t14.s) Q6.mo140437x75286adb()) == null) {
            return null;
        }
        for (t14.u uVar : kz5.n0.S0(((java.util.LinkedHashMap) sVar.f496125e).values())) {
            java.lang.String str = uVar.f496127b;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = uVar.f496128c;
            if ((!r26.n0.N(str)) && (!r26.n0.N(str2)) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, str2)) {
                jz5.l[] lVarArr = new jz5.l[8];
                lVarArr[0] = new jz5.l("page_name_kv", qVar.T6());
                lVarArr[1] = new jz5.l("view_name_kv", uVar.f496126a);
                lVarArr[2] = new jz5.l("switch_status_before", str);
                lVarArr[3] = new jz5.l("switch_status_after", str2);
                lVarArr[4] = new jz5.l("setting_sessionid", u24.n.b());
                android.content.Intent m158359x1e885992 = qVar.m158359x1e885992();
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f496121e;
                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef abstractActivityC17500x57a60aef = activityC0065xcd7aa112 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef ? (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef) activityC0065xcd7aa112 : null;
                lVarArr[5] = new jz5.l("setting_level", java.lang.Integer.valueOf(m158359x1e885992.getIntExtra("setting_level", abstractActivityC17500x57a60aef != null ? abstractActivityC17500x57a60aef.V6() : 0)));
                lVarArr[6] = new jz5.l("ui_version", java.lang.Integer.valueOf(qVar.m158359x1e885992().getIntExtra("ui_version", 1)));
                lVarArr[7] = new jz5.l("switch_button_type", 0);
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("setting_switch_succeed", null, kz5.c1.l(lVarArr), 33328);
            }
        }
        return jz5.f0.f384359a;
    }
}
