package eu1;

/* loaded from: classes4.dex */
public class b implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f338275d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public int f338276e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final int f338277f = 5;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f338278g = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Runnable f338279h = new eu1.a(this);

    public b() {
        gm0.j1.b().c();
        if (xt1.t0.fj().f538109n == null) {
            xt1.t0.fj().f538109n = new fu1.m(gm0.j1.u().f354686f);
        }
        fu1.m mVar = xt1.t0.fj().f538109n;
        mVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor f17 = mVar.f348394d.f("select * from ShareCardSyncItemInfo where retryCount < 10", null, 2);
        while (f17.moveToNext()) {
            fu1.l lVar = new fu1.l();
            lVar.mo9015xbf5d97fd(f17);
            arrayList.add(lVar);
        }
        f17.close();
        arrayList.size();
        new java.util.ArrayList();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareCardBatchGetCardMgr", "scsmgr <init>, init pending list size = %d", java.lang.Integer.valueOf(arrayList.size()));
        gm0.j1.n().f354821b.a(1132, this);
    }

    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareCardBatchGetCardMgr", "doShareCardSyncNetScene");
        int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
        int i17 = currentTimeMillis - this.f338276e;
        int i18 = this.f338277f;
        if (i18 <= 0) {
            i18 = 5;
        }
        if (i17 < i18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareCardBatchGetCardMgr", "sync interval is " + i17);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f338278g;
            java.lang.Runnable runnable = this.f338279h;
            n3Var.mo50300x3fa464aa(runnable);
            n3Var.mo50297x7c4d7ca2(runnable, i18 * 1000);
        }
        this.f338276e = currentTimeMillis;
    }

    public void b() {
        tt1.l lVar;
        if (this.f338275d == null) {
            return;
        }
        for (int i17 = 0; i17 < ((java.util.ArrayList) this.f338275d).size(); i17++) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.ArrayList) this.f338275d).get(i17);
            if (weakReference != null && (lVar = (tt1.l) weakReference.get()) != null) {
                lVar.W0();
            }
        }
    }

    public void c(tt1.l lVar) {
        if (this.f338275d == null) {
            this.f338275d = new java.util.ArrayList();
        }
        if (lVar != null) {
            this.f338275d.add(new java.lang.ref.WeakReference(lVar));
        }
    }

    public void d(tt1.l lVar) {
        tt1.l lVar2;
        if (this.f338275d == null || lVar == null) {
            return;
        }
        for (int i17 = 0; i17 < this.f338275d.size(); i17++) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) this.f338275d.get(i17);
            if (weakReference != null && (lVar2 = (tt1.l) weakReference.get()) != null && lVar2.equals(lVar)) {
                this.f338275d.remove(weakReference);
                return;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareCardBatchGetCardMgr", "scsmgr onSceneEnd, errType = %d, errCode = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 == 0 && i18 == 0) {
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(m1Var);
            throw null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareCardBatchGetCardMgr", "scsmgr onSceneEnd fail, stop batch get, errType = %d, errCode = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(m1Var);
        throw null;
    }
}
