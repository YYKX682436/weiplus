package com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class n1 implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    private n1() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String string = bundle.getString("url", "");
        java.lang.String string2 = bundle.getString("extInfo", "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppFeatureService", "OpenGameLiteAppTask, url: " + string + ", extInfo: " + string2);
        m33.l1 l1Var = (m33.l1) i95.n0.c(m33.l1.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.m1 m1Var = new com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.m1(this, rVar);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0) l1Var).getClass();
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.r0 r0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.r0();
        r0Var.f221963e = string;
        r0Var.f36743xf0cd21de = string;
        r53.f.s(context, r0Var, "", string2, m1Var);
    }
}
