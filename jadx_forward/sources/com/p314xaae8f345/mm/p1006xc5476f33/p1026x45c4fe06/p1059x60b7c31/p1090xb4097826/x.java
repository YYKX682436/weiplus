package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826;

/* loaded from: classes7.dex */
public class x implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f162759a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f162760b;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.y yVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17) {
        this.f162759a = e9Var;
        this.f162760b = i17;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        int i19 = this.f162760b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f162759a;
        if (i17 == 0 && i18 == 0) {
            e9Var.a(i19, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.a.a("", 0, jSONObject));
        } else if (i17 == 4) {
            e9Var.a(i19, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.a.a(str, i18, jSONObject));
        } else {
            e9Var.a(i19, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.a.a(str, -1, jSONObject));
        }
    }
}
