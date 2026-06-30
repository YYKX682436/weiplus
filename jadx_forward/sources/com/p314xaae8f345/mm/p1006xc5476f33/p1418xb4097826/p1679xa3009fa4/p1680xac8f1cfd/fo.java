package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes3.dex */
public final class fo implements com.p314xaae8f345.mm.app.t2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.go f215949d;

    public fo(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.go goVar) {
        this.f215949d = goVar;
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppBackground */
    public void mo8889x3be51a90(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAppBackground activity: ");
        sb6.append(str);
        sb6.append(" isCurActDestroy: ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.go goVar = this.f215949d;
        sb6.append(goVar.f216074d.isDestroyed());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNotificationUIC", sb6.toString());
        if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) || goVar.f216074d.isDestroyed()) {
            return;
        }
        fo0.o oVar = fo0.o.f346366a;
        java.lang.String r17 = i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.f573929ge5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getString(...)");
        java.lang.String r18 = i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.ge6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r18, "getString(...)");
        java.lang.String r19 = i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.f573929ge5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r19, "getString(...)");
        oVar.a(r17, r18, r19, goVar.f216074d.getClass().getName());
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppForeground */
    public void mo8890x1952ea5(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNotificationUIC", "onAppForeground activity:" + str);
        fo0.o.f346366a.b();
    }
}
