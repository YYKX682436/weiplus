package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public abstract class m0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n0 {

    /* renamed from: e, reason: collision with root package name */
    public final android.app.Activity f163124e;

    /* renamed from: f, reason: collision with root package name */
    public final int f163125f;

    public m0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, org.json.JSONObject jSONObject, int i17) {
        super(k0Var, e9Var, v5Var, jSONObject, i17);
        android.app.Activity r07 = e9Var.t3().r0();
        this.f163124e = r07;
        if (r07 == null) {
            throw new java.lang.IllegalArgumentException("JsApiActivityResultRequest. Activity is null");
        }
        this.f163125f = k0Var.hashCode() & 65535;
    }

    public abstract boolean a(android.app.Activity activity, org.json.JSONObject jSONObject, int i17);

    public abstract void b(int i17, java.lang.String str);

    public abstract void c(int i17, android.content.Intent intent);

    public void d() {
        android.app.Activity activity = this.f163124e;
        nf.g.a(activity).f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l0(this));
        if (a(activity, this.f163889b, this.f163125f)) {
            return;
        }
        b(-1, "fail:system error {{launch fail}}");
    }
}
