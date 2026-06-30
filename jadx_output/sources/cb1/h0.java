package cb1;

/* loaded from: classes7.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi1.j2 f40247d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eb1.d f40248e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f40249f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cb1.i f40250g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ km5.b f40251h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(vi1.j2 j2Var, eb1.d dVar, com.tencent.mm.plugin.appbrand.page.v5 v5Var, cb1.i iVar, km5.b bVar) {
        super(1);
        this.f40247d = j2Var;
        this.f40248e = dVar;
        this.f40249f = v5Var;
        this.f40250g = iVar;
        this.f40251h = bVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.jv5 jv5Var;
        com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem phoneItem = (com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem) obj;
        kotlin.jvm.internal.o.g(phoneItem, "phoneItem");
        phoneItem.toString();
        vi1.j2 j2Var = this.f40247d;
        eb1.d dVar = this.f40248e;
        if (j2Var != null) {
            j2Var.f437355d++;
        }
        boolean z17 = phoneItem.f87404i;
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f40249f;
        km5.b bVar = this.f40251h;
        if (z17) {
            cb1.g0 g0Var = new cb1.g0(phoneItem, j2Var, v5Var, bVar);
            java.lang.String appId = v5Var.getAppId();
            kotlin.jvm.internal.o.f(appId, "getAppId(...)");
            si1.i0 b17 = dVar.b(v5Var, appId, j2Var, phoneItem, g0Var);
            if (b17 != null) {
                b17.r(v5Var);
            } else {
                vi1.g0 a17 = vi1.l1.f437399a.a();
                android.content.Context f147807d = v5Var.getF147807d();
                kotlin.jvm.internal.o.f(f147807d, "getContext(...)");
                java.lang.String appId2 = v5Var.getAppId();
                kotlin.jvm.internal.o.f(appId2, "getAppId(...)");
                cb1.i iVar = this.f40250g;
                java.lang.String str = (iVar == null || (jv5Var = iVar.f40252a) == null) ? null : jv5Var.f378134g;
                if (str == null) {
                    str = "";
                }
                a17.Ei(f147807d, appId2, str, j2Var, phoneItem, g0Var);
            }
        } else {
            if (phoneItem.f87406n) {
                if (j2Var != null) {
                    j2Var.f437358g++;
                }
            } else if (j2Var != null) {
                j2Var.f437359h++;
            }
            java.lang.String appId3 = v5Var.getAppId();
            kotlin.jvm.internal.o.f(appId3, "getAppId(...)");
            j2Var.getClass();
            j2Var.A = appId3;
            java.lang.String a18 = com.tencent.mm.sdk.platformtools.w2.a(com.tencent.mm.sdk.platformtools.w2.a(phoneItem.f87399d));
            kotlin.jvm.internal.o.f(a18, "getMD5String(...)");
            j2Var.B = a18;
            com.tencent.mm.plugin.appbrand.jsapi.j0 j0Var = new com.tencent.mm.plugin.appbrand.jsapi.j0("ok", new java.lang.Object[0]);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("encryptedData", phoneItem.f87401f);
            hashMap.put("iv", phoneItem.f87402g);
            hashMap.put("cloud_id", phoneItem.f87403h);
            hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, phoneItem.f87408p);
            ((java.util.HashMap) j0Var.f81319a).putAll(hashMap);
            bVar.c(j0Var);
            vi1.o0.f437416a.e(phoneItem);
        }
        return jz5.f0.f302826a;
    }
}
