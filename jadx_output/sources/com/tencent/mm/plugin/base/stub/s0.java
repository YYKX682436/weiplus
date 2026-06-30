package com.tencent.mm.plugin.base.stub;

/* loaded from: classes9.dex */
public class s0 implements o25.k0, o25.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final o25.k0 f93789a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Runnable f93790b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f93791c = false;

    public s0(o25.k0 k0Var, java.lang.Runnable runnable) {
        this.f93789a = k0Var;
        this.f93790b = runnable;
    }

    @Override // o25.l0
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CustomSchemeDeepLinkCallBack", "markDeepLinkDoneWillBeCallback");
        this.f93791c = true;
    }

    @Override // o25.k0
    public void b(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CustomSchemeDeepLinkCallBack", "onSceneEndCallback");
        this.f93789a.b(i17, i18, str, m1Var, z17);
        if (this.f93791c) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CustomSchemeDeepLinkCallBack", "onDeepLinkDone#onSceneEndCallback");
        this.f93790b.run();
    }

    @Override // o25.l0
    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CustomSchemeDeepLinkCallBack", "onDeepLinkDone");
        this.f93790b.run();
    }
}
