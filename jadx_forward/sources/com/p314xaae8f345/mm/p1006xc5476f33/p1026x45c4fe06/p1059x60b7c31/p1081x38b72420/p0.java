package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420;

/* loaded from: classes7.dex */
public class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f162134d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f162135e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f162136f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.q0 f162137g;

    public p0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.q0 q0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        this.f162137g = q0Var;
        this.f162134d = lVar;
        this.f162135e = jSONObject;
        this.f162136f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f162134d;
        si1.e1.a(lVar.mo48798x74292566(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.o0(this));
        android.content.Context mo50352x76847179 = lVar.mo50352x76847179();
        if (mo50352x76847179 == null || !(mo50352x76847179 instanceof android.app.Activity)) {
            lVar.a(this.f162136f, this.f162137g.o("fail:internal error invalid android context"));
        } else if (nf.t.a((android.app.Activity) mo50352x76847179, this.f162134d, "android.permission.READ_CONTACTS", 48, "", "")) {
            si1.e1.c(lVar.mo48798x74292566());
        }
    }
}
