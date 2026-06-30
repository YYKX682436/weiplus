package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes8.dex */
public class f4 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f221174a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f221175b;

    public f4(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.g4 g4Var, android.os.Bundle bundle, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        this.f221174a = bundle;
        this.f221175b = rVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5
    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        android.os.Bundle bundle = this.f221174a;
        if (jSONObject != null) {
            bundle.putString("ret", jSONObject.toString());
        } else {
            bundle.putBoolean(ya.b.f77504xbb80cbe3, false);
            bundle.putString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56296xc5686afb, str);
        }
        this.f221175b.a(bundle);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5
    public void b(java.lang.String str, org.json.JSONObject jSONObject) {
    }
}
