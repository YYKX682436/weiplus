package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes8.dex */
public class n2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f263933d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sd.b f263934e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263935f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f263936g;

    public n2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.o2 o2Var, boolean z17, sd.b bVar, java.lang.String str, android.os.Bundle bundle) {
        this.f263933d = z17;
        this.f263934e = bVar;
        this.f263935f = str;
        this.f263936g = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f263933d;
        android.os.Bundle bundle = this.f263936g;
        java.lang.String str = this.f263935f;
        sd.b bVar = this.f263934e;
        if (!z17) {
            ((sd.u) ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) bVar.f488129a).f488145f).f488186a.g(str, bundle);
            return;
        }
        sd.w wVar = ((sd.u) ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) bVar.f488129a).f488145f).f488186a;
        sd.v vVar = wVar.f488196d;
        sd.k kVar = vVar.size() == 0 ? null : (sd.k) vVar.pop();
        if (kVar != null) {
            wVar.j(kVar);
        }
        wVar.h(str, bundle, false);
    }
}
