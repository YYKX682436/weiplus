package com.tencent.mm.plugin.appbrand.floatball;

/* loaded from: classes7.dex */
public class p1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f78132d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.floatball.q1 f78133e;

    public p1(com.tencent.mm.plugin.appbrand.floatball.q1 q1Var, int i17) {
        this.f78133e = q1Var;
        this.f78132d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f78133e.f78136d.b0(this.f78132d);
    }
}
