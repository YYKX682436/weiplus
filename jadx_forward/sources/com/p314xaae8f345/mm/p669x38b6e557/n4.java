package com.p314xaae8f345.mm.p669x38b6e557;

/* loaded from: classes5.dex */
public class n4 implements com.p314xaae8f345.mm.p669x38b6e557.g5 {
    @Override // com.p314xaae8f345.mm.p669x38b6e557.g5
    public void a(android.content.Intent intent) {
        if (!z65.c.a() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274507b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
            return;
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.k5) ((s40.z0) i95.n0.c(s40.z0.class))).getClass();
        if (!z65.c.a() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274507b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FinderLiveShellService", "Environment denied: not coolassist or monkey env");
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("stream_id");
        r45.ok1 ok1Var = new r45.ok1();
        ok1Var.set(2, stringExtra);
        ((mm2.h7) dk2.ef.f314905a.i(mm2.h7.class)).f410651m.mo7808x76db6cb1(ok1Var);
    }
}
