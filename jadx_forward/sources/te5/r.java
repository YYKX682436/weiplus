package te5;

/* loaded from: classes9.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f500261d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f500262e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f500263f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l15.c f500264g;

    public r(java.lang.String str, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, l15.c cVar) {
        this.f500261d = str;
        this.f500262e = dVar;
        this.f500263f = f9Var;
        this.f500264g = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String m75945x2fec8307;
        java.lang.String m75945x2fec83072;
        java.lang.String m75945x2fec83073;
        java.lang.String m75945x2fec83074;
        r05.g gVar;
        java.lang.String str3 = this.f500261d;
        yb5.d context = this.f500262e;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo = this.f500263f;
        l15.c commonMsg = this.f500264g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commonMsg, "commonMsg");
        v05.b k17 = commonMsg.k();
        if (k17 == null || (str = k17.m75945x2fec8307(k17.f513848e + 2)) == null) {
            str = "";
        }
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        long mo78012x3fdd41df = msgInfo.mo78012x3fdd41df();
        java.lang.String x17 = context.x();
        int a17 = c01.h2.a(str3, x17);
        v05.b k18 = commonMsg.k();
        int o17 = (k18 == null || (gVar = (r05.g) k18.m75936x14adae67(k18.f513848e + 25)) == null) ? -1 : gVar.o();
        zq1.a0 a0Var = (zq1.a0) gm0.j1.s(zq1.a0.class);
        v05.b k19 = commonMsg.k();
        if (k19 == null || (str2 = k19.m75945x2fec8307(k19.f513848e + 2)) == null) {
            str2 = "";
        }
        v05.b k27 = commonMsg.k();
        ((yq1.z) a0Var).c(str2, o17, 1, k27 != null ? k27.m75945x2fec8307(k27.f513848e + 11) : null, java.lang.Long.valueOf(msgInfo.I0()), x17, java.lang.Integer.valueOf(a17), str3, java.lang.Long.valueOf(mo78012x3fdd41df), java.lang.Long.valueOf(((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).h(x17)));
        zq1.m0 m0Var = (zq1.m0) gm0.j1.s(zq1.m0.class);
        v05.b k28 = commonMsg.k();
        java.lang.String str4 = (k28 == null || (m75945x2fec83074 = k28.m75945x2fec8307(k28.f513848e + 2)) == null) ? "" : m75945x2fec83074;
        v05.b k29 = commonMsg.k();
        java.lang.String str5 = (k29 == null || (m75945x2fec83073 = k29.m75945x2fec8307(k29.f449898d + 0)) == null) ? "" : m75945x2fec83073;
        v05.b k37 = commonMsg.k();
        java.lang.String str6 = (k37 == null || (m75945x2fec83072 = k37.m75945x2fec8307(k37.f449898d + 2)) == null) ? "" : m75945x2fec83072;
        v05.b k38 = commonMsg.k();
        ((yq1.x0) m0Var).e(str4, 1, str5, str6, (k38 == null || (m75945x2fec8307 = k38.m75945x2fec8307(k38.f449898d + 3)) == null) ? "" : m75945x2fec8307, context.D() ? "groupmessage" : "singlemessage", 2);
        sb5.f fVar = (sb5.f) context.f542241c.a(sb5.f.class);
        if (fVar != null) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a aVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) fVar;
            if (aVar.B || o17 == -1) {
                return;
            }
            ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.e(23)) {
                aVar.B = true;
                ((ku5.t0) ku5.t0.f394148d).B(new te5.q(1));
            }
        }
    }
}
