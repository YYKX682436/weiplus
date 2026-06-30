package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class p7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.n7 f86328d;

    public p7(com.tencent.mm.plugin.appbrand.n7 n7Var) {
        this.f86328d = n7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f86328d.f86036f.f85093b) {
            return;
        }
        com.tencent.mm.plugin.appbrand.c6.a(6, this.f86328d.f86038h.u0());
        this.f86328d.f86038h.z1(null, "updatedCommLibVersionInLaunch");
    }
}
