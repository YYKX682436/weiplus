package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes.dex */
public class m2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd.u0 f221247d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f221248e;

    public m2(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.j2 j2Var, sd.u0 u0Var, android.os.Bundle bundle) {
        this.f221247d = u0Var;
        this.f221248e = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        sd.x xVar = this.f221247d.f488145f;
        if (xVar == null || ((sd.u) xVar).f488186a == null) {
            return;
        }
        sd.w wVar = ((sd.u) xVar).f488186a;
        android.os.Bundle bundle = this.f221248e;
        wVar.g(bundle.getString("rawUrl"), bundle);
    }
}
