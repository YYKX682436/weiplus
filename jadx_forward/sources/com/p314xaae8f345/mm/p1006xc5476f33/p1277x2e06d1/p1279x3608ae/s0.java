package com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae;

/* loaded from: classes9.dex */
public class s0 implements o25.k0, o25.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final o25.k0 f175322a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Runnable f175323b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f175324c = false;

    public s0(o25.k0 k0Var, java.lang.Runnable runnable) {
        this.f175322a = k0Var;
        this.f175323b = runnable;
    }

    @Override // o25.l0
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CustomSchemeDeepLinkCallBack", "markDeepLinkDoneWillBeCallback");
        this.f175324c = true;
    }

    @Override // o25.k0
    public void b(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CustomSchemeDeepLinkCallBack", "onSceneEndCallback");
        this.f175322a.b(i17, i18, str, m1Var, z17);
        if (this.f175324c) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CustomSchemeDeepLinkCallBack", "onDeepLinkDone#onSceneEndCallback");
        this.f175323b.run();
    }

    @Override // o25.l0
    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CustomSchemeDeepLinkCallBack", "onDeepLinkDone");
        this.f175323b.run();
    }
}
