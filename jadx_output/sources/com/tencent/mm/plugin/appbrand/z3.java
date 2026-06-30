package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class z3 implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.j3 f92442a;

    public z3(com.tencent.mm.plugin.appbrand.j3 j3Var) {
        this.f92442a = j3Var;
    }

    @Override // km5.e
    public void a(java.lang.Object obj) {
        this.f92442a.g("pageView onInterrupt %s, countdown", obj);
        this.f92442a.f78455g = null;
        this.f92442a.j();
    }
}
