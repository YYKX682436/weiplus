package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* loaded from: classes8.dex */
public final class c6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f268669d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f268670e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.w f268671f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f268672g;

    public c6(android.app.Activity activity, nw4.n nVar, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.w wVar, android.os.Bundle bundle) {
        this.f268669d = activity;
        this.f268670e = nVar;
        this.f268671f = wVar;
        this.f268672g = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nw4.n nVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.w wVar;
        android.app.Activity activity = this.f268669d;
        if (activity == null || activity.isFinishing() || (nVar = this.f268670e) == null || (wVar = this.f268671f) == null || !wVar.c().f(42)) {
            return;
        }
        nVar.D(this.f268672g, "download_succ");
    }
}
