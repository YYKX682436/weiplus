package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes.dex */
public class t2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263993d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sd.b f263994e;

    public t2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.u2 u2Var, java.lang.String str, sd.b bVar) {
        this.f263993d = str;
        this.f263994e = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String str = this.f263993d;
        bundle.putString("rawUrl", str);
        sd.b bVar = this.f263994e;
        bundle.putBoolean("from_find_more_friend", ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) bVar.f488129a).f488190n.getBoolean("from_find_more_friend", false));
        ((sd.u) ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) bVar.f488129a).f488145f).f488186a.g(str, bundle);
    }
}
