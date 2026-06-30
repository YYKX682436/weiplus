package com.tencent.mm.plugin.appbrand.jsapi.fakenative;

/* loaded from: classes7.dex */
public class a0 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f80933d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f80934e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f80935f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f80936g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f80937h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.fakenative.i0 f80938i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f80939m;

    public a0(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.tencent.mm.plugin.appbrand.jsapi.fakenative.i0 i0Var, java.lang.String str5) {
        this.f80933d = i17;
        this.f80934e = str;
        this.f80935f = str2;
        this.f80936g = str3;
        this.f80937h = str4;
        this.f80938i = i0Var;
        this.f80939m = str5;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        java.lang.String str;
        r45.bl blVar;
        com.tencent.mm.plugin.appbrand.jsapi.fakenative.OpenBusinessViewUtil$BusinessAppInfoParcel openBusinessViewUtil$BusinessAppInfoParcel = (com.tencent.mm.plugin.appbrand.jsapi.fakenative.OpenBusinessViewUtil$BusinessAppInfoParcel) obj;
        if (openBusinessViewUtil$BusinessAppInfoParcel == null || com.tencent.mm.sdk.platformtools.t8.K0(openBusinessViewUtil$BusinessAppInfoParcel.f80894d) || openBusinessViewUtil$BusinessAppInfoParcel.f80897g == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenBusinessViewUtil", "onCallback, data or cacheKey or respBuff is null");
            com.tencent.mm.plugin.appbrand.jsapi.fakenative.z.a(this.f80933d, this.f80934e, this.f80935f, this.f80936g, this.f80937h, this.f80938i, true, this.f80939m);
            return;
        }
        long H1 = com.tencent.mm.sdk.platformtools.t8.H1(openBusinessViewUtil$BusinessAppInfoParcel.f80896f);
        long j17 = openBusinessViewUtil$BusinessAppInfoParcel.f80895e;
        if (j17 <= 0) {
            j17 = 864000;
        }
        boolean z17 = false;
        boolean z18 = H1 > j17;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenBusinessViewUtil", "expireTime:%d, duration:%d", java.lang.Long.valueOf(H1), java.lang.Long.valueOf(openBusinessViewUtil$BusinessAppInfoParcel.f80895e));
        if (z18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenBusinessViewUtil", "onCallback, data exceed the expire time, it will be deleted!!!");
            com.tencent.mm.plugin.appbrand.jsapi.fakenative.z.a(this.f80933d, this.f80934e, this.f80935f, this.f80936g, this.f80937h, this.f80938i, true, this.f80939m);
            return;
        }
        r45.q54 q54Var = new r45.q54();
        try {
            q54Var.parseFrom(openBusinessViewUtil$BusinessAppInfoParcel.f80897g);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.OpenBusinessViewUtil", e17, "parse response from respBuff", new java.lang.Object[0]);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(q54Var.f383692i)) {
            str = (!com.tencent.mm.sdk.platformtools.t8.K0(q54Var.f383692i) || com.tencent.mm.sdk.platformtools.t8.K0(q54Var.f383688e)) ? "" : q54Var.f383688e;
        } else {
            str = q54Var.f383692i + "?" + this.f80935f;
        }
        java.lang.String str2 = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenBusinessViewUtil", "transBusinessAppInfo, request success, appId:%s, new path:%s, old path:%s", q54Var.f383687d, str2, q54Var.f383688e);
        com.tencent.mm.plugin.appbrand.jsapi.fakenative.i0 i0Var = this.f80938i;
        if (i0Var != null) {
            r45.ge7 ge7Var = q54Var.f383693m;
            if (ge7Var != null) {
                r45.bl blVar2 = ge7Var.f375180e;
                z17 = ge7Var.f375179d;
                blVar = blVar2;
            } else {
                blVar = null;
            }
            i0Var.b(q54Var.f383687d, str2, q54Var.f383689f, z17, blVar);
            com.tencent.mm.plugin.appbrand.jsapi.fakenative.z.a(this.f80933d, this.f80934e, this.f80935f, this.f80936g, this.f80937h, this.f80938i, false, this.f80939m);
        }
    }
}
