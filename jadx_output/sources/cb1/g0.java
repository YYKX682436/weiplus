package cb1;

/* loaded from: classes7.dex */
public final class g0 implements vi1.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem f40241a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vi1.j2 f40242b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f40243c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km5.b f40244d;

    public g0(com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem phoneItem, vi1.j2 j2Var, com.tencent.mm.plugin.appbrand.page.v5 v5Var, km5.b bVar) {
        this.f40241a = phoneItem;
        this.f40242b = j2Var;
        this.f40243c = v5Var;
        this.f40244d = bVar;
    }

    public void a(boolean z17, java.util.Map result) {
        kotlin.jvm.internal.o.g(result, "result");
        km5.b bVar = this.f40244d;
        if (!z17) {
            bVar.a(result.get("errMsg"));
            return;
        }
        com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem phoneItem = this.f40241a;
        boolean z18 = phoneItem.f87406n;
        vi1.j2 j2Var = this.f40242b;
        if (z18) {
            if (j2Var != null) {
                java.lang.Long valueOf = java.lang.Long.valueOf(j2Var.f437358g);
                kotlin.jvm.internal.o.d(valueOf);
                j2Var.f437358g = valueOf.longValue() + 1;
            }
        } else if (j2Var != null) {
            java.lang.Long valueOf2 = java.lang.Long.valueOf(j2Var.f437359h);
            kotlin.jvm.internal.o.d(valueOf2);
            j2Var.f437359h = valueOf2.longValue() + 1;
        }
        java.lang.String appId = this.f40243c.getAppId();
        kotlin.jvm.internal.o.f(appId, "getAppId(...)");
        j2Var.getClass();
        j2Var.A = appId;
        java.lang.String a17 = com.tencent.mm.sdk.platformtools.w2.a(com.tencent.mm.sdk.platformtools.w2.a(phoneItem.f87399d));
        kotlin.jvm.internal.o.f(a17, "getMD5String(...)");
        j2Var.B = a17;
        java.lang.Object[] objArr = new java.lang.Object[1];
        com.tencent.mm.plugin.appbrand.jsapi.j0 j0Var = new com.tencent.mm.plugin.appbrand.jsapi.j0("ok", new java.lang.Object[0]);
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String str = (java.lang.String) result.get("encryptedData");
        if (str == null) {
            str = "";
        }
        hashMap.put("encryptedData", str);
        java.lang.String str2 = (java.lang.String) result.get("iv");
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put("iv", str2);
        java.lang.String str3 = (java.lang.String) result.get("cloud_id");
        hashMap.put("cloud_id", str3 != null ? str3 : "");
        java.lang.Object obj = result.get(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        java.util.Map map = j0Var.f81319a;
        ((java.util.HashMap) map).put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, obj);
        ((java.util.HashMap) map).putAll(hashMap);
        objArr[0] = j0Var;
        bVar.c(objArr);
        vi1.o0.f437416a.e(phoneItem);
    }
}
