package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class b6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f86428d;

    public b6(com.tencent.mm.plugin.appbrand.page.v5 v5Var) {
        this.f86428d = v5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f86428d;
        if (v5Var.r1() == null) {
            return;
        }
        v5Var.p1(false);
        v5Var.r1().setFullscreenMode(false);
    }
}
