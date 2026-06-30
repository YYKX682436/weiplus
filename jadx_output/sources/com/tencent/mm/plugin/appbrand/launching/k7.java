package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public class k7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f84716d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.ILaunchWxaAppInfoNotify$AppidABTestIpcWrapper f84717e;

    public k7(com.tencent.mm.plugin.appbrand.o6 o6Var, com.tencent.mm.plugin.appbrand.launching.ILaunchWxaAppInfoNotify$AppidABTestIpcWrapper iLaunchWxaAppInfoNotify$AppidABTestIpcWrapper) {
        this.f84716d = o6Var;
        this.f84717e = iLaunchWxaAppInfoNotify$AppidABTestIpcWrapper;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f84716d.X1.l(this.f84717e.f84429f);
    }
}
