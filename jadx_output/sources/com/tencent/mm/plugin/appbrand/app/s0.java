package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes7.dex */
public class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f75266d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.app.r0 f75267e;

    public s0(com.tencent.mm.plugin.appbrand.app.r0 r0Var, java.lang.Class cls) {
        this.f75267e = r0Var;
        this.f75266d = cls;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f75267e.a(this.f75266d, com.tencent.mm.plugin.appbrand.app.v0.NO_ACTIVITIES_LEFT);
    }
}
