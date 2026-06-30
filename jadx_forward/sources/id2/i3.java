package id2;

/* loaded from: classes2.dex */
public final class i3 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f372147a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ id2.u3 f372148b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.lo1 f372149c;

    public i3(java.lang.String str, id2.u3 u3Var, r45.lo1 lo1Var) {
        this.f372147a = str;
        this.f372148b = u3Var;
        this.f372149c = lo1Var;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (z17) {
            java.lang.String str2 = this.f372147a;
            int i17 = ((str2.length() > 0) && ll2.e.f400666a.h(str2)) ? 1 : 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4 a4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4.f183535a;
            android.app.Activity m80379x76847179 = this.f372148b.m80379x76847179();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa abstractActivityC15087xee12defa = m80379x76847179 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) m80379x76847179 : null;
            if (abstractActivityC15087xee12defa == null || (str = java.lang.Integer.valueOf(abstractActivityC15087xee12defa.getD()).toString()) == null) {
                str = "";
            }
            java.lang.String str3 = str;
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            java.lang.String b17 = b52.b.b();
            ml2.u1 u1Var = ml2.u1.f409573e;
            a4Var.a(str3, "", b17, "person_page_ext_entrance", "{\"entrance_id\":\"" + this.f372149c.m75939xb282bd08(2) + "\";\"is_reddot\":\"" + i17 + "\"}");
        }
    }
}
