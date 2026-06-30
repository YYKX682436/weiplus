package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class h6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86669d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f86670e;

    public h6(com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        this.f86670e = v5Var;
        this.f86669d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f86670e;
        if (v5Var.r1() == null) {
            return;
        }
        al1.b r17 = v5Var.r1();
        java.lang.String str = this.f86669d;
        r17.setForegroundStyle(str);
        v5Var.f3(str);
    }
}
