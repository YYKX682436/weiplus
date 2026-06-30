package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class q4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f87030d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.i3 f87031e;

    public q4(com.tencent.mm.plugin.appbrand.page.i3 i3Var, java.lang.String str) {
        this.f87031e = i3Var;
        this.f87030d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f87030d;
        com.tencent.mm.plugin.appbrand.page.i3 i3Var = this.f87031e;
        i3Var.getClass();
        i3Var.c0(new com.tencent.mm.plugin.appbrand.page.j3(i3Var, 1, str, null, null));
    }
}
