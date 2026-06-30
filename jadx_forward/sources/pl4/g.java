package pl4;

/* loaded from: classes15.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pl4.k f438243d;

    public g(pl4.k kVar) {
        this.f438243d = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        pl4.k kVar = this.f438243d;
        synchronized (kVar.f438254e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingTPResourceLoader", "processPendingRequests fileCacheId:" + kVar.f438251b + ", mRequestQueue size " + kVar.f438265p.size());
            if (kVar.f438265p.isEmpty()) {
                return;
            }
            for (com.p314xaae8f345.p3006xb8ff1437.api.p3020x27f531a1.InterfaceC26244x6ec750ac interfaceC26244x6ec750ac : kVar.f438265p) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(interfaceC26244x6ec750ac);
                if (pl4.k.a(kVar, interfaceC26244x6ec750ac)) {
                    interfaceC26244x6ec750ac.mo101496xa1f73129();
                    linkedList.add(interfaceC26244x6ec750ac);
                }
            }
            pl4.k kVar2 = this.f438243d;
            kVar2.getClass();
            if (linkedList.isEmpty()) {
                return;
            }
            synchronized (kVar2.f438254e) {
                int size = kVar2.f438265p.size();
                kVar2.f438265p.removeAll(kz5.n0.X0(linkedList));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingTPResourceLoader", "removeRequestList fileCacheId:" + kVar2.f438251b + ", before:" + size + ", after:" + kVar2.f438265p.size());
                if (!kVar2.f438265p.isEmpty()) {
                    kVar2.g();
                }
            }
        }
    }
}
