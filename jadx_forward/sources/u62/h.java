package u62;

/* loaded from: classes12.dex */
public class h implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13503x6c65632c f506489d;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13503x6c65632c c13503x6c65632c) {
        this.f506489d = c13503x6c65632c;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof an3.f) {
            com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13503x6c65632c c13503x6c65632c = this.f506489d;
            if (c13503x6c65632c.f181435t == null) {
                return;
            }
            an3.f fVar = (an3.f) m1Var;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtControlProviderNearBy", "get lbsfriend errcode: " + i18 + ", errType: " + i17);
            if (i17 == 0 && i18 == 0) {
                c13503x6c65632c.f181431p = fVar.H();
                java.util.List list = c13503x6c65632c.f181431p;
                if (list == null || list.size() == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExtControlProviderNearBy", "get lbsfriend list size:0");
                    c13503x6c65632c.f181435t.countDown();
                } else {
                    if (c13503x6c65632c.f181431p.size() > 10) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtControlProviderNearBy", "get lbsfriend size > 10," + c13503x6c65632c.f181431p.size());
                        java.util.List list2 = c13503x6c65632c.f181431p;
                        list2.subList(10, list2.size()).clear();
                    }
                    c13503x6c65632c.f181436u = new java.util.concurrent.CountDownLatch(c13503x6c65632c.f181431p.size());
                    c13503x6c65632c.f181435t.countDown();
                    c13503x6c65632c.getClass();
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                    com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().d(c13503x6c65632c);
                    if (c13503x6c65632c.f181433r == null) {
                        c13503x6c65632c.f181433r = new d95.e(com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13503x6c65632c.f181429z);
                    }
                    java.util.Iterator it = c13503x6c65632c.f181431p.iterator();
                    while (it.hasNext()) {
                        c13503x6c65632c.o((r45.b64) it.next());
                    }
                    c13503x6c65632c.f181436u.countDown();
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExtControlProviderNearBy", "get lbsfriend failed: errCode = " + i18 + ", errType=" + i17);
                c13503x6c65632c.f181435t.countDown();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13503x6c65632c.n(c13503x6c65632c);
        }
    }
}
