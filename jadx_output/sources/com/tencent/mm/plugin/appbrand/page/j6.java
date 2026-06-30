package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class j6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f86791d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f86792e;

    public j6(com.tencent.mm.plugin.appbrand.page.v5 v5Var, boolean z17) {
        this.f86792e = v5Var;
        this.f86791d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f86792e;
        if (v5Var.r1() == null) {
            return;
        }
        v5Var.r1().setLoadingIconVisibility(this.f86791d);
    }
}
