package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes.dex */
public class u3 implements vz.z1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f264006a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g02.c f264007b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 f264008c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.v3 f264009d;

    public u3(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.v3 v3Var, boolean z17, g02.c cVar, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        this.f264009d = v3Var;
        this.f264006a = z17;
        this.f264007b = cVar;
        this.f264008c = q5Var;
    }

    @Override // vz.z1
    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        boolean z17 = this.f264006a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var = this.f264008c;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.v3.f(this.f264009d, str, jSONObject, this.f264007b, q5Var);
        } else {
            q5Var.a(str, jSONObject);
        }
    }
}
