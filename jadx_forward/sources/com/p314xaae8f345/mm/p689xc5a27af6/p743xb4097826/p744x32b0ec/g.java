package com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec;

/* loaded from: classes3.dex */
public final class g implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f148246a;

    public g(com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        this.f148246a = rVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        boolean z17;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = this.f148246a;
        try {
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("CheckWidgetDisplayableTask", th6, "next callback exception", new java.lang.Object[0]);
            rVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d("false"));
        }
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            r45.ju1 ju1Var = (r45.ju1) ke2.o0.f388509v.a(fVar, new r45.ju1());
            if (ju1Var != null && ju1Var.m75933x41a8a7f2(0)) {
                z17 = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CheckWidgetDisplayableTask", "Check result: " + z17);
                rVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(java.lang.String.valueOf(z17)));
                return jz5.f0.f384359a;
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CheckWidgetDisplayableTask", "cgi failed: type=" + fVar.f152148a + " code=" + fVar.f152149b);
        }
        z17 = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CheckWidgetDisplayableTask", "Check result: " + z17);
        rVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(java.lang.String.valueOf(z17)));
        return jz5.f0.f384359a;
    }
}
