package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class o3 implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86945d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.wd f86946e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.i3 f86947f;

    public o3(com.tencent.mm.plugin.appbrand.page.i3 i3Var, java.lang.String str, com.tencent.mm.plugin.appbrand.page.wd wdVar) {
        this.f86947f = i3Var;
        this.f86945d = str;
        this.f86946e = wdVar;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        com.tencent.mm.plugin.appbrand.page.i3 i3Var = this.f86947f;
        return i3Var.f0(this.f86945d, this.f86946e) ? new com.tencent.mm.plugin.appbrand.page.y1(i3Var.getContext(), i3Var) : new com.tencent.mm.plugin.appbrand.page.s8(i3Var.getContext(), i3Var);
    }
}
