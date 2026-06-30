package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class d8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC f77573d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f77574e;

    public d8(com.tencent.mm.plugin.appbrand.o6 o6Var, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC) {
        this.f77574e = o6Var;
        this.f77573d = appBrandInitConfigWC;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.o6.J2(this.f77573d);
    }
}
