package df2;

/* loaded from: classes3.dex */
public final class ku implements ft.p4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ df2.mu f312133a;

    public ku(df2.mu muVar) {
        this.f312133a = muVar;
    }

    @Override // ft.p4
    public void a(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ga0 ga0Var;
        df2.mu muVar = this.f312133a;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, muVar.f312340n)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(muVar.f312339m, "appId not match, appId:" + str + ", lastAppId:" + muVar.f312340n);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(muVar.f312339m, "onDataCallback value:" + str2);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return;
        }
        try {
            boolean optBoolean = new cl0.g(str2).optBoolean("ignoreNextShopShelfOrderHintBeforeReopen");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = muVar.f372632e;
            boolean z17 = (ubVar == null || (ga0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ga0) ubVar.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ga0.class)) == null || ga0Var.w0() != 0) ? false : true;
            if (optBoolean && z17) {
                ((mm2.f6) muVar.m56788xbba4bfc0(mm2.f6.class)).Y6(true);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(muVar.f312339m, th6, "weAppDataCallback value invalid", new java.lang.Object[0]);
        }
    }
}
