package dk2;

/* loaded from: classes12.dex */
public final class hb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f315109d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.tb f315110e;

    public hb(java.util.List list, dk2.tb tbVar) {
        this.f315109d = list;
        this.f315110e = tbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.List list = this.f315109d;
        if (list.isEmpty()) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyCmdIds ");
        dk2.tb tbVar = this.f315110e;
        sb6.append(tbVar.d(list));
        sb6.append(' ');
        sb6.append(tbVar.c());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLivePollingService", sb6.toString());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            if (!((java.util.LinkedList) tbVar.f315657e).contains(java.lang.Integer.valueOf(intValue))) {
                ((java.util.LinkedList) tbVar.f315657e).add(java.lang.Integer.valueOf(intValue));
            }
            tbVar.g(intValue, false, true);
        }
        dk2.tb.b(tbVar);
    }
}
