package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class y6 extends com.tencent.mm.plugin.appbrand.g3 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f92417b;

    public y6(com.tencent.mm.plugin.appbrand.o6 o6Var) {
        this.f92417b = o6Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.g3
    public java.lang.String b() {
        return "warmUpBackgroundFetchDataStorage";
    }

    @Override // com.tencent.mm.plugin.appbrand.g3
    public void c() {
        d();
        com.tencent.mm.plugin.appbrand.backgroundfetch.s1 s1Var = (com.tencent.mm.plugin.appbrand.backgroundfetch.s1) i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundfetch.s1.class);
        if (s1Var instanceof com.tencent.mm.plugin.appbrand.backgroundfetch.l) {
            java.lang.String str = this.f92417b.u0().f47278x;
            com.tencent.mm.plugin.appbrand.backgroundfetch.l lVar = (com.tencent.mm.plugin.appbrand.backgroundfetch.l) s1Var;
            lVar.wi(str, 1);
            lVar.wi(str, 0);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.g3
    public boolean e() {
        return true;
    }
}
