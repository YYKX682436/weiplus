package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class g8 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f197860a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f197861b;

    public g8(com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar, org.json.JSONObject jSONObject) {
        this.f197860a = rVar;
        this.f197861b = jSONObject;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = this.f197860a;
        if (i17 == 0 && fVar.f152149b == 0) {
            r45.ju1 ju1Var = (r45.ju1) ke2.o0.f388509v.a(fVar, new r45.ju1());
            if (ju1Var == null || !ju1Var.m75933x41a8a7f2(0)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveProductRecordPlayWidget", "resp is null or no replay");
                rVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(""));
            } else {
                java.lang.String m75945x2fec8307 = ju1Var.m75945x2fec8307(2);
                mn2.g1 g1Var = mn2.g1.f411508a;
                wo0.c b17 = g1Var.e().b(new mn2.q3(m75945x2fec8307, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e), g1Var.h(mn2.f1.f411498s));
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.f8 f8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.f8(this.f197861b, ju1Var, rVar);
                b17.getClass();
                b17.f529406d = f8Var;
                b17.f();
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveProductRecordPlayWidget", "cgi failed: type=" + fVar.f152148a + " code=" + fVar.f152149b);
            rVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(""));
        }
        return jz5.f0.f384359a;
    }
}
