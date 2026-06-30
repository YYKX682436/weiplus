package yc1;

/* loaded from: classes7.dex */
public abstract class c extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f implements gb1.m {

    /* renamed from: g, reason: collision with root package name */
    public final gb1.a f542309g = new gb1.a();

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        B(lVar, jSONObject, i17, lVar.mo50357xcd94f799());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void B(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0 c0Var) {
        java.lang.String mo1076x30961476 = mo1076x30961476();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(a(), mo1076x30961476);
        this.f542309g.f351508a.put(mo1076x30961476, c0Var);
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        hashMap.put("errno", 0);
        lVar.a(i17, t("ok", hashMap));
        d(lVar, jSONObject, mo1076x30961476);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0
    public boolean m() {
        return true;
    }
}
