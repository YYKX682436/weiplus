package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes15.dex */
public final class j2 implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    private j2() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String string = bundle.getString("shortAppId");
        java.lang.String string2 = bundle.getString("type");
        java.lang.String string3 = bundle.getString("param");
        long j17 = bundle.getLong("timeout");
        if (j17 <= 0) {
            j17 = 20000;
        }
        bundle.getInt("from");
        bundle.getBoolean("syncCheckUpdate");
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().p();
        if (!string2.equals("game")) {
            rVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c(false));
            return;
        }
        kh0.g gVar = (kh0.g) i95.n0.c(kh0.g.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.i2 i2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.i2(this, rVar);
        jh0.v vVar = (jh0.v) gVar;
        vVar.getClass();
        vz4.d0.b(string3, string, j17 / 1000, true, new jh0.u(vVar, i2Var));
    }
}
