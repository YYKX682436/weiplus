package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class f6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86613d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f86614e;

    public f6(com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        this.f86614e = v5Var;
        this.f86613d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f86614e;
        if (v5Var.r1() == null) {
            return;
        }
        v5Var.r1().setMainTitle(this.f86613d);
    }
}
