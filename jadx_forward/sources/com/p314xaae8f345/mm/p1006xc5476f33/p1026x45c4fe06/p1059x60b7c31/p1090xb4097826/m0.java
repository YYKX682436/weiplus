package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826;

/* loaded from: classes7.dex */
public class m0 implements nf.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f162745a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f162746b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.n0 f162747c;

    public m0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.n0 n0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17) {
        this.f162747c = n0Var;
        this.f162745a = lVar;
        this.f162746b = i17;
    }

    @Override // nf.j
    /* renamed from: onResult */
    public void mo14598x57429edc(int i17, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.n0 n0Var = this.f162747c;
        try {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                int i18 = this.f162746b;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f162745a;
                if (i17 == -1) {
                    jSONObject.put("isSuccess", true);
                    jSONObject.put("isCancel", false);
                    lVar.a(i18, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.a.a("", 0, jSONObject));
                } else if (i17 == 0) {
                    jSONObject.put("isSuccess", false);
                    jSONObject.put("isCancel", true);
                    lVar.a(i18, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.a.a("", 1, jSONObject));
                } else {
                    jSONObject.put("isSuccess", false);
                    jSONObject.put("isCancel", false);
                    lVar.a(i18, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.a.a("", i17, jSONObject));
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Finder.JsApiShareFinderEndorsementToFriend", e17.getMessage());
            }
        } finally {
            n0Var.getClass();
        }
    }
}
