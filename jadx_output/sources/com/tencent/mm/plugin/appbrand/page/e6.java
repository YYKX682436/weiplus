package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class e6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f86563d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f86564e;

    public e6(com.tencent.mm.plugin.appbrand.page.v5 v5Var, int i17) {
        this.f86564e = v5Var;
        this.f86563d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f86564e;
        if (v5Var.r1() == null) {
            return;
        }
        v5Var.r1().setBackgroundColor(this.f86563d);
    }
}
