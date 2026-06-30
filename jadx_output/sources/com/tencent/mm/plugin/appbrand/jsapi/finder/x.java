package com.tencent.mm.plugin.appbrand.jsapi.finder;

/* loaded from: classes7.dex */
public class x implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f81226a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f81227b;

    public x(com.tencent.mm.plugin.appbrand.jsapi.finder.y yVar, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17) {
        this.f81226a = e9Var;
        this.f81227b = i17;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        int i19 = this.f81227b;
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f81226a;
        if (i17 == 0 && i18 == 0) {
            e9Var.a(i19, com.tencent.mm.plugin.appbrand.jsapi.finder.a.a("", 0, jSONObject));
        } else if (i17 == 4) {
            e9Var.a(i19, com.tencent.mm.plugin.appbrand.jsapi.finder.a.a(str, i18, jSONObject));
        } else {
            e9Var.a(i19, com.tencent.mm.plugin.appbrand.jsapi.finder.a.a(str, -1, jSONObject));
        }
    }
}
