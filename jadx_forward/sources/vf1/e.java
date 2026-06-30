package vf1;

/* loaded from: classes7.dex */
public class e implements z2.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f517850d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tb1.a0 f517851e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vf1.f f517852f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vf1.g f517853g;

    public e(vf1.g gVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, tb1.a0 a0Var, vf1.f fVar) {
        this.f517853g = gVar;
        this.f517850d = lVar;
        this.f517851e = a0Var;
        this.f517852f = fVar;
    }

    @Override // z2.f
    /* renamed from: onRequestPermissionsResult */
    public void mo50562x953457f1(int i17, java.lang.String[] strArr, int[] iArr) {
        if (i17 == 16) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f517850d;
            tb1.a0 a0Var = this.f517851e;
            if (iArr != null && iArr.length > 0 && iArr[0] == 0) {
                tb1.b.f498422a.f498423a = true;
                this.f517853g.F(lVar, a0Var, this.f517852f);
                return;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("cameraId", java.lang.Integer.valueOf(a0Var.mo50746x72efd496()));
            java.lang.String jSONObject = new org.json.JSONObject(hashMap).toString();
            tb1.d0 d0Var = new tb1.d0();
            d0Var.p(lVar);
            d0Var.r(jSONObject);
            d0Var.m();
            tb1.b.f498422a.f498423a = false;
        }
    }
}
