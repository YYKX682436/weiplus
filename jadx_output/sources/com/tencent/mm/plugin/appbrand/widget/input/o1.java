package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public class o1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f91575d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.t4 f91576e;

    public o1(com.tencent.mm.plugin.appbrand.page.v5 v5Var, com.tencent.mm.plugin.appbrand.widget.input.t4 t4Var) {
        this.f91575d = v5Var;
        this.f91576e = t4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.widget.input.r1.f91643f.put(this.f91575d, this.f91576e);
    }
}
