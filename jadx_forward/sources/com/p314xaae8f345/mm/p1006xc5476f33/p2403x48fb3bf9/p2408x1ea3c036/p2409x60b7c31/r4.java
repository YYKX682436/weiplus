package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes5.dex */
public class r4 implements sw4.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sd.b f263983a;

    public r4(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.j4 j4Var, sd.b bVar) {
        this.f263983a = bVar;
    }

    @Override // sw4.e
    public void a(android.os.Bundle bundle) {
        org.json.JSONObject jSONObject;
        java.lang.String string = bundle.getString("event");
        java.lang.String string2 = bundle.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
        sd.b bVar = this.f263983a;
        if (bVar.f488129a == null || android.text.TextUtils.isEmpty(string)) {
            return;
        }
        try {
            jSONObject = new org.json.JSONObject(string2);
        } catch (org.json.JSONException unused) {
            jSONObject = new org.json.JSONObject();
        }
        ((sd.a) bVar.f488129a).mo64556x9a3f0ba2().b(string, jSONObject);
    }

    @Override // sw4.e
    public void f(android.os.Bundle bundle) {
        this.f263983a.c(bundle.getString("err_msg", ""), null);
    }
}
