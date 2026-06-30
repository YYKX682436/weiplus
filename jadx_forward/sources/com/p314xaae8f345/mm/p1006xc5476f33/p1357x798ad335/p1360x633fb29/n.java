package com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class n implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    private n() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13217x9736d853 c13217x9736d853 = new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13217x9736d853();
        if (bundle == null) {
            c13217x9736d853.f178468d = false;
            if (rVar != null) {
                rVar.a(c13217x9736d853);
                return;
            }
            return;
        }
        java.lang.String string = bundle.getString("download_url");
        java.lang.String string2 = bundle.getString("main_url");
        java.lang.String string3 = bundle.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            c13217x9736d853.f178468d = false;
            if (rVar != null) {
                rVar.a(c13217x9736d853);
                return;
            }
            return;
        }
        c02.p pVar = new c02.p();
        pVar.f119148d = string;
        pVar.f119149e = string2;
        pVar.f119150f = string3;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = pVar;
        lVar.f152198b = new c02.q();
        lVar.f152199c = "/cgi-bin/mmgame-bin/getdownloadinterceptinfo";
        lVar.f152200d = 2884;
        com.p314xaae8f345.mm.p944x882e457a.z2.d(lVar.a(), new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.k(string, string2, string3, rVar), false);
    }
}
