package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class n4 implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.j3 f86023a;

    public n4(com.tencent.mm.plugin.appbrand.j3 j3Var) {
        this.f86023a = j3Var;
    }

    @Override // km5.e
    public void a(java.lang.Object obj) {
        this.f86023a.f78456h = null;
        this.f86023a.g("service countDown by pipeline interrupted:%s", obj);
        this.f86023a.k();
    }
}
