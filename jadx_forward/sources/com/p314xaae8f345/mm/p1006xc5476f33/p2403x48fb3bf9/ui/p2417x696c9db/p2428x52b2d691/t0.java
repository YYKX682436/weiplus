package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class t0 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.g9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.k f268066a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f268067b;

    public t0(nw4.k kVar, nw4.y2 y2Var) {
        this.f268066a = kVar;
        this.f268067b = y2Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.g9
    public void a(java.lang.String str) {
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        nw4.y2 y2Var = this.f268067b;
        nw4.k kVar = this.f268066a;
        if (K0) {
            kVar.f422396d.e(y2Var.f422546c, "downloadMediaByUrl failed", null);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m4.d(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Zi().a(d17);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(dm.i4.f66867x2a5c95c7, d17.f264269e);
        kVar.f422396d.e(y2Var.f422546c, "downloadMediaByUrl:ok", hashMap);
    }
}
