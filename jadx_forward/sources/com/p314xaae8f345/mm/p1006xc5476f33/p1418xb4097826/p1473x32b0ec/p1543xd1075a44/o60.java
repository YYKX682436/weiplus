package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class o60 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az2.f f200800d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f200801e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f200802f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ re2.h1 f200803g;

    public o60(az2.f fVar, int i17, java.lang.String str, re2.h1 h1Var) {
        this.f200800d = fVar;
        this.f200801e = i17;
        this.f200802f = str;
        this.f200803g = h1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f200800d.b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderStartLiveModeTabWidget", "openCoLiveSettingPanel: create failed, errCode=" + this.f200801e + ", errMsg=" + this.f200802f);
        if (re2.j1.f475971b == this.f200803g) {
            re2.e0 e0Var = re2.j1.f475971b;
            if (e0Var != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CoLiveTaskManager", "destroy: invitationId=" + e0Var.f475923c + ", phase=" + e0Var.f475922b);
                e0Var.a();
            }
            re2.j1.f475971b = null;
        }
    }
}
