package com.tencent.mm.plugin.appbrand.menu;

/* loaded from: classes7.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f85865d;

    public b0(com.tencent.mm.plugin.appbrand.page.n7 n7Var) {
        this.f85865d = n7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f85865d.getRuntime().z1(null, "MenuDelegate_Restart");
    }
}
