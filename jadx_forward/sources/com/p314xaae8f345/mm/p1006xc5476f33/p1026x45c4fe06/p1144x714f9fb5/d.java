package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1144x714f9fb5;

/* JADX INFO: Access modifiers changed from: package-private */
@mk0.a
/* loaded from: classes7.dex */
public class d implements com.p314xaae8f345.mm.p794xb0fa9b5e.i<com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1144x714f9fb5.C12398x24351782> {
    private d() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        boolean z17;
        java.lang.String requestAppId = ((com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) obj).f149939d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLocationReport", "QueryLocationCacheTask invoke appId:%s, currentAppIdInOfTemporary:%s", requestAppId, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1144x714f9fb5.a.f167033b);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestAppId, "requestAppId");
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1144x714f9fb5.a.f167043l || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(requestAppId) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1144x714f9fb5.a.f167033b)) {
            z17 = false;
        } else {
            java.lang.Object[] objArr = {requestAppId, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1144x714f9fb5.a.f167033b};
            int i17 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLocationInfoTemporaryStorage", "requestAppId:%s, appId:%s", objArr);
            z17 = requestAppId.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1144x714f9fb5.a.f167033b);
        }
        if (!z17) {
            if (rVar != null) {
                rVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1144x714f9fb5.C12398x24351782());
                return;
            }
            return;
        }
        if (rVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1144x714f9fb5.C12398x24351782 c12398x24351782 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1144x714f9fb5.C12398x24351782();
            c12398x24351782.f167021d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1144x714f9fb5.a.f167033b;
            c12398x24351782.f167022e = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1144x714f9fb5.a.f167034c;
            c12398x24351782.f167023f = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1144x714f9fb5.a.f167035d;
            c12398x24351782.f167024g = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1144x714f9fb5.a.f167037f;
            c12398x24351782.f167025h = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1144x714f9fb5.a.f167036e;
            c12398x24351782.f167026i = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1144x714f9fb5.a.f167038g;
            c12398x24351782.f167027m = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1144x714f9fb5.a.f167039h;
            c12398x24351782.f167028n = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1144x714f9fb5.a.f167040i;
            c12398x24351782.f167029o = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1144x714f9fb5.a.f167041j;
            c12398x24351782.f167030p = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1144x714f9fb5.a.f167042k;
            c12398x24351782.f167031q = true;
            rVar.a(c12398x24351782);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1144x714f9fb5.a.f167043l = false;
        }
    }
}
