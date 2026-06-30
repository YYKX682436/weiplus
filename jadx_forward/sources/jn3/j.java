package jn3;

/* loaded from: classes8.dex */
public final class j implements l92.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jn3.m f382320a;

    public j(jn3.m mVar) {
        this.f382320a = mVar;
    }

    @Override // l92.a
    public void a(int i17, int i18, java.lang.String str, r45.ny3 ny3Var, org.json.JSONObject reportExt) {
        r45.xb1 resp = (r45.xb1) ny3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportExt, "reportExt");
    }

    @Override // l92.a
    public int b() {
        return 3930;
    }

    @Override // l92.a
    public void c(int i17, int i18, java.lang.String str, r45.ny3 ny3Var, org.json.JSONObject reportExt) {
        r45.xb1 resp = (r45.xb1) ny3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportExt, "reportExt");
        this.f382320a.T6(4, 1006, 3, false, null);
        if (((en3.v) ((ra0.v) i95.n0.c(ra0.v.class))).wi()) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27379x973a84d7 m113806x9cf0d20b = com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27379x973a84d7.m113806x9cf0d20b();
            java.util.LinkedList m75941xfb821914 = resp.m75941xfb821914(3);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getCmdList(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
            java.util.Iterator it = m75941xfb821914.iterator();
            while (it.hasNext()) {
                arrayList.add(new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27398x1fd13c47().mo11468x92b714fd(((r45.hx0) it.next()).mo14344x5f01b1f6()));
            }
            m113806x9cf0d20b.m113807x1fa131cb(new java.util.ArrayList<>(arrayList), 1006);
        }
    }
}
