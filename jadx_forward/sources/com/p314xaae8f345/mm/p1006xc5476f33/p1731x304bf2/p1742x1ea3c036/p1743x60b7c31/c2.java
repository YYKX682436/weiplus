package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes.dex */
public class c2 implements m33.h1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 f221135a;

    public c2(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.d2 d2Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        this.f221135a = q5Var;
    }

    @Override // m33.h1
    public void a(java.util.Map map) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiOpenGameDetail", "JsApiOpenGameDetail success");
        this.f221135a.a(null, null);
    }

    @Override // m33.h1
    public void b(java.util.Map map) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiOpenGameDetail", "JsApiOpenGameDetail fail");
        this.f221135a.a("openGameDetail:fail, " + map.get("error"), null);
    }
}
