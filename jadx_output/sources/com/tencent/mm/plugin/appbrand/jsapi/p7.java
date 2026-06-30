package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public class p7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f82489d;

    public p7(com.tencent.mm.plugin.appbrand.jsapi.x7 x7Var, com.tencent.mm.plugin.appbrand.e9 e9Var) {
        this.f82489d = e9Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f82489d;
        if (e9Var != null) {
            oe1.b2.a(e9Var.getAppId());
        }
    }
}
