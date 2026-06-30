package com.tencent.mm.plugin.appbrand.jsapi.contact;

/* loaded from: classes7.dex */
public final class o implements nf.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.contact.q f80592a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f80593b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f80594c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f80595d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f80596e;

    public o(com.tencent.mm.plugin.appbrand.jsapi.contact.q qVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, android.app.Activity activity, org.json.JSONObject jSONObject, int i17) {
        this.f80592a = qVar;
        this.f80593b = lVar;
        this.f80594c = activity;
        this.f80595d = jSONObject;
        this.f80596e = i17;
    }

    @Override // nf.n
    public final void b(java.lang.String[] strArr, int[] iArr) {
        java.lang.Integer M;
        boolean z17 = false;
        if (iArr != null && (M = kz5.z.M(iArr)) != null && M.intValue() == 0) {
            z17 = true;
        }
        com.tencent.mm.plugin.appbrand.jsapi.contact.q qVar = this.f80592a;
        int i17 = this.f80596e;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f80593b;
        if (z17) {
            qVar.C(lVar, this.f80594c, this.f80595d, i17);
        } else {
            lVar.a(i17, qVar.o("fail:system permission denied"));
        }
    }
}
