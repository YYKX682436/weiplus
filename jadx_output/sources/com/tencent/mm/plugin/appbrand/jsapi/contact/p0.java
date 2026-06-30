package com.tencent.mm.plugin.appbrand.jsapi.contact;

/* loaded from: classes7.dex */
public class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f80601d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f80602e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f80603f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.contact.q0 f80604g;

    public p0(com.tencent.mm.plugin.appbrand.jsapi.contact.q0 q0Var, com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        this.f80604g = q0Var;
        this.f80601d = lVar;
        this.f80602e = jSONObject;
        this.f80603f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f80601d;
        si1.e1.a(lVar.getAppId(), new com.tencent.mm.plugin.appbrand.jsapi.contact.o0(this));
        android.content.Context context = lVar.getContext();
        if (context == null || !(context instanceof android.app.Activity)) {
            lVar.a(this.f80603f, this.f80604g.o("fail:internal error invalid android context"));
        } else if (nf.t.a((android.app.Activity) context, this.f80601d, "android.permission.READ_CONTACTS", 48, "", "")) {
            si1.e1.c(lVar.getAppId());
        }
    }
}
