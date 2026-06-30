package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class w implements si1.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.j f90926a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.k0 f90927b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f90928c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f90929d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f90930e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.x f90931f;

    public w(com.tencent.mm.plugin.appbrand.x xVar, com.tencent.mm.plugin.appbrand.jsapi.j jVar, com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var, java.lang.String str, java.lang.String str2, int i17) {
        this.f90931f = xVar;
        this.f90926a = jVar;
        this.f90927b = k0Var;
        this.f90928c = str;
        this.f90929d = str2;
        this.f90930e = i17;
    }

    @Override // si1.k
    public void a(si1.j jVar) {
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f90931f.f92365c;
        if (lVar == null || !lVar.isRunning()) {
            return;
        }
        int i17 = jVar.f408270a;
        com.tencent.mm.plugin.appbrand.jsapi.j jVar2 = this.f90926a;
        if (i17 == 0) {
            jVar2.a();
            return;
        }
        java.lang.String str = jVar.f408271b;
        if (android.text.TextUtils.isEmpty(str)) {
            str = "fail:internal error";
        }
        jVar2.b(this.f90927b.r(str, jVar.f408272c, null));
    }

    @Override // si1.k
    public void b(int i17) {
        this.f90931f.f(this.f90927b, this.f90928c, this.f90929d, this.f90930e, i17);
    }
}
