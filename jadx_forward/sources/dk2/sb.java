package dk2;

/* loaded from: classes12.dex */
public final class sb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f315607d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.tb f315608e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f315609f;

    public sb(int i17, dk2.tb tbVar, int i18) {
        this.f315607d = i17;
        this.f315608e = tbVar;
        this.f315609f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("update Req Interval for ");
        int i17 = this.f315607d;
        sb6.append(i17);
        sb6.append(' ');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLivePollingService", sb6.toString());
        dk2.tb tbVar = this.f315608e;
        java.util.Iterator it = tbVar.f315653a.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it.next();
                if (((dk2.bb) obj2).f314781d == i17) {
                    break;
                }
            }
        }
        dk2.bb bbVar = (dk2.bb) obj2;
        int i18 = this.f315609f;
        if (bbVar != null) {
            bbVar.f314784g = i18;
        }
        java.util.Iterator it6 = tbVar.f315653a.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            java.lang.Object next = it6.next();
            if (((dk2.bb) next).f314781d == i17) {
                obj = next;
                break;
            }
        }
        dk2.bb bbVar2 = (dk2.bb) obj;
        if (bbVar2 != null) {
            bbVar2.f314785h = android.os.SystemClock.uptimeMillis() + (i18 * 1000);
        }
        dk2.bb bbVar3 = (dk2.bb) tbVar.f315654b.get(java.lang.Integer.valueOf(i17));
        if (bbVar3 != null) {
            bbVar3.f314784g = i18;
        }
        dk2.bb bbVar4 = (dk2.bb) tbVar.f315654b.get(java.lang.Integer.valueOf(i17));
        if (bbVar4 != null) {
            bbVar4.f314785h = android.os.SystemClock.uptimeMillis() + (i18 * 1000);
        }
        dk2.tb.b(tbVar);
    }
}
