package t14;

/* loaded from: classes11.dex */
public final class k implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t14.q f496114a;

    public k(t14.q qVar) {
        this.f496114a = qVar;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        jz5.l[] lVarArr = new jz5.l[5];
        t14.q qVar = this.f496114a;
        lVarArr[0] = new jz5.l("page_name_kv", qVar.T6());
        lVarArr[1] = new jz5.l("setting_from_source", java.lang.Integer.valueOf(qVar.m158359x1e885992().getIntExtra("setting_from_source", 2)));
        lVarArr[2] = new jz5.l("ui_version", java.lang.Integer.valueOf(qVar.m158359x1e885992().getIntExtra("ui_version", 1)));
        android.content.Intent m158359x1e885992 = qVar.m158359x1e885992();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = qVar.m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef abstractActivityC17500x57a60aef = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef ? (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef) m158354x19263085 : null;
        lVarArr[3] = new jz5.l("setting_level", java.lang.Integer.valueOf(m158359x1e885992.getIntExtra("setting_level", abstractActivityC17500x57a60aef != null ? abstractActivityC17500x57a60aef.V6() : 0)));
        lVarArr[4] = new jz5.l("setting_sessionid", u24.n.b());
        return kz5.c1.k(lVarArr);
    }
}
