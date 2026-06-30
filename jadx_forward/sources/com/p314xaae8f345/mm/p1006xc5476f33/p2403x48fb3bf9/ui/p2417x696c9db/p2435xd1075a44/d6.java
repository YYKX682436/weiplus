package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* loaded from: classes8.dex */
public final class d6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.n f268691d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.w f268692e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f268693f;

    public d6(nw4.n nVar, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.w wVar, android.os.Bundle bundle) {
        this.f268691d = nVar;
        this.f268692e = wVar;
        this.f268693f = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.w wVar;
        nw4.n nVar = this.f268691d;
        if (nVar == null || (wVar = this.f268692e) == null || !wVar.c().f(42)) {
            return;
        }
        nVar.D(this.f268693f, "download_fail");
    }
}
