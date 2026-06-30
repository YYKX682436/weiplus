package zo1;

/* loaded from: classes5.dex */
public final class o4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f556253d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12873xf94c39e f556254e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f556255f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f556256g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12873xf94c39e activityC12873xf94c39e, boolean z17, yz5.l lVar) {
        super(2);
        this.f556253d = j17;
        this.f556254e = activityC12873xf94c39e;
        this.f556255f = z17;
        this.f556256g = lVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.util.ArrayList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g> packages = (java.util.ArrayList) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(packages, "packages");
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f556253d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectPackageUI", "getAllBackupPackage complete, error=" + intValue + ", packages.size=" + packages.size() + ", duration=" + currentTimeMillis);
        for (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar : packages) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectPackageUI", "Package(" + gVar.f297362d + "): displayName=" + go1.d.f355477a.a(gVar) + ", option=" + gVar.f297368m);
        }
        int size = packages.size();
        zo1.x3 x3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12873xf94c39e.f174397q;
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12873xf94c39e activityC12873xf94c39e = this.f556254e;
        activityC12873xf94c39e.getClass();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("duration", java.lang.Long.valueOf(currentTimeMillis));
        linkedHashMap.put("fromServer", java.lang.Long.valueOf(this.f556255f ? 1L : 0L));
        linkedHashMap.put("pkgListSize", java.lang.Long.valueOf(size));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectPackageUI", "reportLoadData, extraInfoMap = " + linkedHashMap);
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1 y1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1.f174470J;
        zo1.b5 b5Var = new zo1.b5(currentTimeMillis, linkedHashMap);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamReport28098", "start simple report for pageAction=" + y1Var);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6839x89375b51 c6839x89375b51 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6839x89375b51();
        c6839x89375b51.f141599d = 7L;
        c6839x89375b51.f141600e = 7L;
        b5Var.mo146xb9724478(c6839x89375b51);
        c6839x89375b51.k();
        pm0.v.X(new zo1.n4(activityC12873xf94c39e, packages, this.f556256g));
        return jz5.f0.f384359a;
    }
}
