package cd0;

/* loaded from: classes5.dex */
public final class v implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f122127d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f122128e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yb5.d f122129f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f122130g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f122131h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f122132i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f122133m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f122134n;

    public v(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, yb5.d dVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, boolean z17, long j17, java.lang.String str2, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var) {
        this.f122127d = f9Var;
        this.f122128e = str;
        this.f122129f = dVar;
        this.f122130g = u3Var;
        this.f122131h = z17;
        this.f122132i = j17;
        this.f122133m = str2;
        this.f122134n = k0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        boolean z17;
        cd0.v vVar = this;
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = vVar.f122127d;
        cd0.b0 b0Var = cd0.b0.f122058a;
        if (itemId == 1) {
            b0Var.c(f9Var, vVar.f122128e, vVar.f122129f, vVar.f122130g, vVar.f122131h);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6737x6a91c12e c6737x6a91c12e = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6737x6a91c12e();
            c6737x6a91c12e.f140711d = 2L;
            c6737x6a91c12e.f140716i = vVar.f122132i;
            c6737x6a91c12e.f140717j = (c01.id.c() - f9Var.mo78012x3fdd41df()) / 1000;
            c6737x6a91c12e.p(vVar.f122133m);
            c6737x6a91c12e.k();
        } else {
            if (menuItem.getItemId() == 2) {
                java.lang.String str = vVar.f122128e;
                java.lang.String str2 = vVar.f122133m;
                long j17 = vVar.f122132i;
                boolean z18 = vVar.f122131h;
                if (f9Var != null) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = pt0.f0.f439742b1.n(f9Var.Q0(), f9Var.m124847x74d37ac6());
                    yb5.d dVar = vVar.f122129f;
                    if (!dVar.I()) {
                        cd0.b0.f122059b = new java.lang.ref.WeakReference(db5.e1.Q(dVar.g(), null, dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b5q), true, false, null));
                        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(dVar);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RevokeMsgHandler", "runBatchRevoke() called with: msgId:" + java.lang.Long.valueOf(n17.m124847x74d37ac6()) + " msgSvrId:" + java.lang.Long.valueOf(n17.I0()) + " type:" + java.lang.Integer.valueOf(n17.mo78013xfb85f7b0()) + " status:" + java.lang.Integer.valueOf(n17.P0()) + ", revokeTicket = " + str + ", synchFlag:" + java.lang.Integer.valueOf(n17.h2()));
                        dh3.c cVar = dh3.c.f314022a;
                        java.lang.String Q0 = n17.Q0();
                        boolean z19 = Q0 == null || Q0.length() == 0;
                        kz5.p0 p0Var = kz5.p0.f395529d;
                        if (z19) {
                            z17 = z18;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgBatchRevokeMgr", "getBatchSendForUser: talker is empty or recordMsg is null");
                        } else {
                            java.lang.String i18 = cVar.i(Q0, java.lang.Long.valueOf(n17.m124847x74d37ac6()), java.lang.Long.valueOf(n17.mo78012x3fdd41df()));
                            java.lang.String str3 = (java.lang.String) dh3.c.f314027f.b(i18);
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = dh3.c.f314023b;
                            if (str3 == null) {
                                str3 = o4Var.t(i18);
                            }
                            if (str3 == null || str3.length() == 0) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgBatchRevokeMgr", "getBatchSendForUser: revokeBatchId is null, talker: " + Q0 + ", msgId: " + n17.m124847x74d37ac6() + ", svrId: " + n17.I0());
                                z17 = z18;
                            } else {
                                dh3.e eVar = new dh3.e();
                                java.lang.String t17 = o4Var.t(str3);
                                if (t17 != null) {
                                    eVar.m126728xdc93280d(t17);
                                }
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                java.util.Iterator it = eVar.j().iterator();
                                while (it.hasNext()) {
                                    java.lang.Long l17 = (java.lang.Long) it.next();
                                    java.util.Iterator it6 = it;
                                    pt0.e0 e0Var = pt0.f0.f439742b1;
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l17);
                                    boolean z27 = z18;
                                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = e0Var.k(Q0, l17.longValue());
                                    if (k17 != null) {
                                        arrayList.add(k17);
                                    }
                                    it = it6;
                                    z18 = z27;
                                }
                                z17 = z18;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgBatchRevokeMgr", "getBatchSendForUser: revokeBatchId: " + str3 + ", talker: " + Q0 + ", msgId: " + n17.m124847x74d37ac6() + ", recordCount: " + eVar.j().size() + ", msgListSize: " + arrayList.size());
                                p0Var = arrayList;
                            }
                        }
                        b0Var.a(n17, p0Var, null, str, weakReference, str2, true, j17, z17);
                    }
                }
            }
            vVar = this;
        }
        vVar.f122134n.u();
    }
}
