package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* loaded from: classes8.dex */
public final class f6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.n f268753d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.w f268754e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f268755f;

    public f6(nw4.n nVar, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.w wVar, android.os.Bundle bundle) {
        this.f268753d = nVar;
        this.f268754e = wVar;
        this.f268755f = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.w wVar;
        nw4.n nVar = this.f268753d;
        if (nVar == null || (wVar = this.f268754e) == null || !wVar.c().f(42)) {
            return;
        }
        nVar.D(this.f268755f, "download_pause");
    }
}
