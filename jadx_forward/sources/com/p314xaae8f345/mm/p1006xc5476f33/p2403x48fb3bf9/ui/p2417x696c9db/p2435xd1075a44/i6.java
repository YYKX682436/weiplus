package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* loaded from: classes8.dex */
public final class i6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.n f268803d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.w f268804e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f268805f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f268806g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f268807h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f268808i;

    public i6(nw4.n nVar, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.w wVar, java.lang.String str, long j17, int i17, float f17) {
        this.f268803d = nVar;
        this.f268804e = wVar;
        this.f268805f = str;
        this.f268806g = j17;
        this.f268807h = i17;
        this.f268808i = f17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.w wVar;
        if (this.f268803d == null || (wVar = this.f268804e) == null || !wVar.c().f(42)) {
            return;
        }
        this.f268803d.C(this.f268805f, this.f268806g, this.f268807h, this.f268808i);
    }
}
