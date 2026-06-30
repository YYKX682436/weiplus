package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public class q1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f91622d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.t4 f91623e;

    public q1(com.tencent.mm.plugin.appbrand.page.v5 v5Var, com.tencent.mm.plugin.appbrand.widget.input.t4 t4Var) {
        this.f91622d = v5Var;
        this.f91623e = t4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.widget.input.r1.h(this.f91622d, this.f91623e);
    }
}
