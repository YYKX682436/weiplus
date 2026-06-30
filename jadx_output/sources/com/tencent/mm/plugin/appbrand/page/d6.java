package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class d6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f86527d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f86528e;

    public d6(com.tencent.mm.plugin.appbrand.page.v5 v5Var, double d17) {
        this.f86528e = v5Var;
        this.f86527d = d17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f86528e;
        if (v5Var.r1() == null) {
            return;
        }
        v5Var.r1().setBackgroundAlpha(this.f86527d);
    }
}
