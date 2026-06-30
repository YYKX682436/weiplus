package ia2;

/* loaded from: classes2.dex */
public final class j0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28.IFetchDoneListener {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f371466a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ia2.n0 f371467b;

    public j0(ia2.n0 n0Var) {
        this.f371467b = n0Var;
        this.f371466a = new java.lang.ref.WeakReference(n0Var);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28.IFetchDoneListener
    /* renamed from: onFetchDone */
    public void mo56137xb461ee3d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa response) {
        com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.C23922xf4e16628 c23922xf4e16628;
        com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.C23922xf4e16628 c23922xf4e166282;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        java.lang.Object request = response.getRequest();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13879x1453fa95 c13879x1453fa95 = request instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13879x1453fa95 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13879x1453fa95) request : null;
        if (c13879x1453fa95 == null) {
            return;
        }
        if (response.getErrCode() != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPOIPlugin", "finderPOIFlutterInvalidWithErrorCode:" + response.getErrCode() + " tabIndex:" + c13879x1453fa95.f189072i);
            return;
        }
        boolean z17 = true;
        if (response.getPullType() != 1 && response.getPullType() != 0) {
            z17 = false;
        }
        java.lang.ref.WeakReference weakReference = this.f371466a;
        if (!z17 && !response.getHasMore()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPOIPlugin", "poistream has no more data");
            ia2.n0 n0Var = (ia2.n0) weakReference.get();
            if (n0Var != null && (c23922xf4e166282 = n0Var.f371488f) != null) {
                c23922xf4e166282.m88602xf460a654(c13879x1453fa95.f189072i, c13879x1453fa95.f189073m, ia2.q0.a("noMorePoiStream"));
            }
        }
        com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.C23966x2bb6c1fd b17 = this.f371467b.b(c13879x1453fa95.f189072i, c13879x1453fa95.f189073m, response, z17);
        ia2.n0 n0Var2 = (ia2.n0) weakReference.get();
        if (n0Var2 == null || (c23922xf4e16628 = n0Var2.f371488f) == null) {
            return;
        }
        c23922xf4e16628.m88600x4d373c70(c13879x1453fa95.f189072i, c13879x1453fa95.f189073m, b17, ia2.q0.a("appendPoiStream"));
    }
}
