package cp2;

/* loaded from: classes2.dex */
public final class f extends td2.b implements cp2.a {

    /* renamed from: g, reason: collision with root package name */
    public final r45.qt2 f302328g;

    /* renamed from: h, reason: collision with root package name */
    public final im5.c f302329h = new im5.c();

    /* renamed from: i, reason: collision with root package name */
    public cp2.e f302330i;

    public f(r45.qt2 qt2Var) {
        this.f302328g = qt2Var;
    }

    public final void E0(cp2.l request, cp2.e callback, cp2.g gVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f302330i = callback;
        tq2.c.f502753i.a(request.f302370d).f502758d = java.lang.System.currentTimeMillis();
        rq2.s sVar = rq2.s.f480412a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkPullType: ");
        int i17 = request.f302367a;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNearbyLiveLoadingReporter", sb6.toString());
        boolean z17 = (i17 == 1 || i17 == 0) ? false : true;
        int i18 = request.f302371e;
        if (z17) {
            rq2.s.f480418g.remove(java.lang.Integer.valueOf(i18));
        } else {
            rq2.q b17 = sVar.b(i18);
            if (b17 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNearbyLiveLoadingReporter", "startCgi tabType: " + i18);
                b17.f480394b = c01.id.c();
            }
        }
        new cp2.b(request, this, gVar, this.f302328g).l().f(this.f302329h);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveFriendsFeedFetcher", "fetchInternal request:" + request);
    }
}
