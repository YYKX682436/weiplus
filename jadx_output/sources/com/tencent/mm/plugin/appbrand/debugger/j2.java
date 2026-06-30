package com.tencent.mm.plugin.appbrand.debugger;

/* loaded from: classes7.dex */
public class j2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f77776d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.debugger.l2 f77777e;

    public j2(com.tencent.mm.plugin.appbrand.debugger.l2 l2Var, java.lang.String str) {
        this.f77777e = l2Var;
        this.f77776d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.debugger.l2.a(this.f77777e, this.f77776d);
    }
}
