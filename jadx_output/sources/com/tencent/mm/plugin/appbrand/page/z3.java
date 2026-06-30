package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class z3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f87309d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.i3 f87310e;

    public z3(com.tencent.mm.plugin.appbrand.page.i3 i3Var, boolean z17) {
        this.f87310e = i3Var;
        this.f87309d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f87310e.P(this.f87309d);
    }
}
