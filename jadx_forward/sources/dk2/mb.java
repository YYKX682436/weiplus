package dk2;

/* loaded from: classes12.dex */
public final class mb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f315301d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.tb f315302e;

    public mb(boolean z17, dk2.tb tbVar) {
        this.f315301d = z17;
        this.f315302e = tbVar;
    }

    public static final boolean a(int i17, java.util.List list) {
        java.util.Iterator it = list.iterator();
        boolean z17 = false;
        while (it.hasNext()) {
            if (((java.lang.Number) it.next()).intValue() == i17) {
                z17 = true;
            }
        }
        return z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("release force:");
        boolean z17 = this.f315301d;
        sb6.append(z17);
        sb6.append(" before ");
        dk2.tb tbVar = this.f315302e;
        sb6.append(tbVar.c());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLivePollingService", sb6.toString());
        tbVar.f315660h.mo50300x3fa464aa(tbVar.f315661i);
        if (!(!tbVar.f315658f.isEmpty()) || z17) {
            tbVar.f315659g = null;
            tbVar.f315653a.clear();
            java.util.Iterator it = tbVar.f315654b.values().iterator();
            while (it.hasNext()) {
                az2.j jVar = ((dk2.bb) it.next()).f314786i;
                if (jVar != null) {
                    jVar.j();
                }
            }
            ((java.util.concurrent.ConcurrentHashMap) tbVar.f315655c).clear();
            tbVar.f315654b.clear();
            tbVar.f315656d.clear();
            ((java.util.LinkedList) tbVar.f315657e).clear();
            ((java.util.LinkedList) tbVar.f315658f).clear();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLivePollingService", "releaseAll after ".concat(tbVar.c()));
            return;
        }
        java.util.List list = tbVar.f315658f;
        kz5.h0.A(tbVar.f315653a, new dk2.kb(list));
        java.util.Iterator it6 = tbVar.f315654b.entrySet().iterator();
        while (it6.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it6.next();
            if (!a(((dk2.bb) entry.getValue()).f314781d, list)) {
                az2.j jVar2 = ((dk2.bb) entry.getValue()).f314786i;
                if (jVar2 != null) {
                    jVar2.j();
                }
                it6.remove();
            }
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        android.util.SparseArray sparseArray = tbVar.f315656d;
        int size = sparseArray.size();
        for (int i17 = 0; i17 < size; i17++) {
            int keyAt = sparseArray.keyAt(i17);
            if (!a(keyAt, list)) {
                linkedList.add(java.lang.Integer.valueOf(keyAt));
            }
        }
        java.util.Iterator it7 = linkedList.iterator();
        while (it7.hasNext()) {
            sparseArray.remove(((java.lang.Number) it7.next()).intValue());
        }
        kz5.h0.B(tbVar.f315657e, new dk2.lb(list));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLivePollingService", "releaseIgnoreCmdId after ".concat(tbVar.c()));
    }
}
