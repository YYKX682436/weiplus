package md2;

/* loaded from: classes8.dex */
public final class g implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f407377d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ md2.h f407378e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f407379f;

    public g(long j17, md2.h hVar, yz5.l lVar) {
        this.f407377d = j17;
        this.f407378e = hVar;
        this.f407379f = lVar;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        bw5.br req = (bw5.br) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        int i17 = req.f107330d;
        int i18 = (int) this.f407377d;
        yz5.l lVar = this.f407379f;
        if (i17 != i18) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE)));
            return;
        }
        if (i17 == 5 || i17 == 2) {
            java.lang.String str = i17 == 5 ? "person_recent_page_close_clear_pop_close" : "person_recent_page_close_pop_close";
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4 a4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4.f183535a;
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            a4Var.b("354", b52.b.b(), str, "");
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LIVE_RECENT_WATCH_SETTING_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
            android.content.Context context = this.f407378e.f407380d;
            db5.t7.h(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mao));
        }
        p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.TRUE)));
    }
}
