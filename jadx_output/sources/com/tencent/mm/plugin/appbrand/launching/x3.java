package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class x3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.me3[] f85391a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.z6 f85392b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.q4 f85393c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f85394d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.f4 f85395e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m81.c[] f85396f;

    public x3(r45.me3[] me3VarArr, com.tencent.mm.plugin.appbrand.launching.z6 z6Var, com.tencent.mm.plugin.appbrand.launching.q4 q4Var, int i17, com.tencent.mm.plugin.appbrand.launching.f4 f4Var, m81.c[] cVarArr) {
        this.f85391a = me3VarArr;
        this.f85392b = z6Var;
        this.f85393c = q4Var;
        this.f85394d = i17;
        this.f85395e = f4Var;
        this.f85396f = cVarArr;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.me3[] me3VarArr = this.f85391a;
        kotlin.jvm.internal.o.g(me3VarArr, "<this>");
        r45.me3 me3Var = me3VarArr[2];
        java.lang.String str = me3Var != null ? me3Var.f380399e : null;
        if (!(str == null || str.length() == 0)) {
            kotlin.jvm.internal.o.d(me3Var);
            km5.b c17 = km5.u.c();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Downloader.tryPatch with ");
            com.tencent.mm.plugin.appbrand.launching.z6 z6Var = this.f85392b;
            sb6.append(z6Var);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.CommonPkgFetcher", sb6.toString());
            m81.b[] bVarArr = new m81.b[1];
            com.tencent.mm.plugin.appbrand.launching.q4 q4Var = this.f85393c;
            java.lang.String a6Var = q4Var.f85067j.toString();
            int i17 = z6Var.f85468n;
            int i18 = this.f85394d;
            java.lang.String str2 = me3Var.f380399e;
            r45.y50 y50Var = q4Var.f85061d;
            com.tencent.mm.plugin.appbrand.launching.w3 w3Var = new com.tencent.mm.plugin.appbrand.launching.w3(q4Var, this.f85395e, this.f85396f, me3Var, c17, bVarArr);
            com.tencent.mm.plugin.appbrand.appcache.p8 p8Var = new com.tencent.mm.plugin.appbrand.appcache.p8(a6Var, i17, i18, str2, w3Var);
            p8Var.f324691o = y50Var;
            com.tencent.mm.plugin.appbrand.appcache.p8 p8Var2 = com.tencent.mm.plugin.appbrand.appcache.ua.Ui(p8Var, w3Var) ? p8Var : null;
            bVarArr[0] = p8Var2;
            if (p8Var2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.CommonPkgFetcher", "Downloader.tryPatch failed with " + z6Var);
                c17.resume();
            } else {
                q4Var.f85071n.add(p8Var2);
            }
        }
        return jz5.f0.f302826a;
    }
}
