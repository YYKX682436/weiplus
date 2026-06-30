package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.p4 f91730d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f91731e;

    public z0(com.tencent.mm.plugin.appbrand.widget.input.a1 a1Var, com.tencent.mm.plugin.appbrand.widget.input.p4 p4Var, int i17) {
        this.f91730d = p4Var;
        this.f91731e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f91730d.f(this.f91731e);
    }
}
