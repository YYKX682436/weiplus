package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class w60 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az2.f f201683d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f201684e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f201685f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ re2.h1 f201686g;

    public w60(az2.f fVar, int i17, java.lang.String str, re2.h1 h1Var) {
        this.f201683d = fVar;
        this.f201684e = i17;
        this.f201685f = str;
        this.f201686g = h1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f201683d.b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderStartLiveModeTabWidget", "showCoLiveSettingDialog: create failed, errCode=" + this.f201684e + ", errMsg=" + this.f201685f);
        if (re2.j1.f475971b == this.f201686g) {
            re2.e0 e0Var = re2.j1.f475971b;
            if (e0Var != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CoLiveTaskManager", "destroy: invitationId=" + e0Var.f475923c + ", phase=" + e0Var.f475922b);
                e0Var.a();
            }
            re2.j1.f475971b = null;
        }
    }
}
