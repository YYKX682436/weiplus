package yc1;

/* loaded from: classes7.dex */
public abstract class b extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1 implements gb1.m {

    /* renamed from: g, reason: collision with root package name */
    public final gb1.a f542294g = new gb1.a();

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1
    public java.lang.String A(final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, final org.json.JSONObject jSONObject, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0 c0Var) {
        final java.lang.String mo1076x30961476 = mo1076x30961476();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(a(), mo1076x30961476);
        this.f542294g.f351508a.put(mo1076x30961476, c0Var);
        B(lVar, mo1076x30961476);
        qu5.a mo50350x12b4fba4 = lVar.mo50350x12b4fba4();
        if (mo50350x12b4fba4 != null) {
            mo50350x12b4fba4.mo50293x3498a0(new java.lang.Runnable() { // from class: yc1.b$$a
                @Override // java.lang.Runnable
                public final void run() {
                    yc1.b.this.d(lVar, jSONObject, mo1076x30961476);
                }
            });
        } else {
            d(lVar, jSONObject, mo1076x30961476);
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        hashMap.put("errno", 0);
        return t("ok", hashMap);
    }

    public void B(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String str) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0
    public boolean m() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1
    public java.lang.String z(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject) {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return A(lVar, jSONObject, lVar.mo50357xcd94f799());
    }
}
