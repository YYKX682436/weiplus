package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420;

/* loaded from: classes7.dex */
public final class o implements nf.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.q f162125a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f162126b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f162127c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f162128d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f162129e;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.q qVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, android.app.Activity activity, org.json.JSONObject jSONObject, int i17) {
        this.f162125a = qVar;
        this.f162126b = lVar;
        this.f162127c = activity;
        this.f162128d = jSONObject;
        this.f162129e = i17;
    }

    @Override // nf.n
    public final void b(java.lang.String[] strArr, int[] iArr) {
        java.lang.Integer M;
        boolean z17 = false;
        if (iArr != null && (M = kz5.z.M(iArr)) != null && M.intValue() == 0) {
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.q qVar = this.f162125a;
        int i17 = this.f162129e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f162126b;
        if (z17) {
            qVar.C(lVar, this.f162127c, this.f162128d, i17);
        } else {
            lVar.a(i17, qVar.o("fail:system permission denied"));
        }
    }
}
