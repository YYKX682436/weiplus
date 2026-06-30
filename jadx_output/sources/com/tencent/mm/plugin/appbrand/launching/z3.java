package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class z3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.me3[] f85453a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.z6 f85454b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.q4 f85455c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f85456d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.f4 f85457e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m81.c[] f85458f;

    public z3(r45.me3[] me3VarArr, com.tencent.mm.plugin.appbrand.launching.z6 z6Var, com.tencent.mm.plugin.appbrand.launching.q4 q4Var, int i17, com.tencent.mm.plugin.appbrand.launching.f4 f4Var, m81.c[] cVarArr) {
        this.f85453a = me3VarArr;
        this.f85454b = z6Var;
        this.f85455c = q4Var;
        this.f85456d = i17;
        this.f85457e = f4Var;
        this.f85458f = cVarArr;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.me3[] me3VarArr = this.f85453a;
        kotlin.jvm.internal.o.g(me3VarArr, "<this>");
        r45.me3 me3Var = me3VarArr[1];
        java.lang.String str = me3Var != null ? me3Var.f380399e : null;
        if (!(str == null || str.length() == 0)) {
            kotlin.jvm.internal.o.d(me3Var);
            km5.b c17 = km5.u.c();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.CommonPkgFetcher", "Downloader.tryZstd with " + this.f85454b);
            m81.b[] bVarArr = new m81.b[1];
            java.lang.String str2 = me3Var.f380399e;
            java.lang.String a6Var = this.f85455c.f85067j.toString();
            int i17 = this.f85456d;
            int i18 = this.f85454b.f85464g;
            com.tencent.mm.plugin.appbrand.launching.q4 q4Var = this.f85455c;
            r45.y50 y50Var = q4Var.f85061d;
            com.tencent.mm.plugin.appbrand.launching.y3 y3Var = new com.tencent.mm.plugin.appbrand.launching.y3(q4Var, this.f85457e, this.f85458f, me3Var, c17, bVarArr);
            int i19 = com.tencent.mm.plugin.appbrand.appcache.gc.f75557a;
            com.tencent.mm.plugin.appbrand.appcache.fc fcVar = new com.tencent.mm.plugin.appbrand.appcache.fc(str2, a6Var, i17, i18, y3Var);
            fcVar.f324691o = y50Var;
            com.tencent.mm.plugin.appbrand.appcache.fc fcVar2 = com.tencent.mm.plugin.appbrand.appcache.ua.Ui(fcVar, y3Var) ? fcVar : null;
            bVarArr[0] = fcVar2;
            if (fcVar2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.CommonPkgFetcher", "Downloader.tryZstd failed with " + this.f85454b);
                c17.resume();
            } else {
                fcVar2.f75539r = me3Var.f380407p;
                kotlin.jvm.internal.o.e(fcVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appcache.WxaZstdPkgDownloadRequest");
                java.lang.String c18 = com.tencent.mm.plugin.appbrand.launching.y6.c(this.f85453a);
                java.lang.String str3 = "";
                if (c18 == null) {
                    c18 = "";
                }
                fcVar2.f75540s = c18;
                m81.b bVar = bVarArr[0];
                kotlin.jvm.internal.o.e(bVar, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appcache.WxaZstdPkgDownloadRequest");
                com.tencent.mm.plugin.appbrand.appcache.fc fcVar3 = (com.tencent.mm.plugin.appbrand.appcache.fc) bVar;
                if (com.tencent.mm.plugin.appbrand.launching.y6.b(this.f85453a) != 0) {
                    str3 = java.lang.String.format("%08x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(com.tencent.mm.plugin.appbrand.launching.y6.b(this.f85453a))}, 1));
                    kotlin.jvm.internal.o.f(str3, "format(...)");
                }
                fcVar3.f75541t = str3;
                this.f85455c.f85071n.add(bVarArr[0]);
            }
        }
        return jz5.f0.f302826a;
    }
}
