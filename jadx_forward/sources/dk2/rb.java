package dk2;

/* loaded from: classes12.dex */
public final class rb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f315562d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2495xc50a8b8b.f f315563e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.tb f315564f;

    public rb(int i17, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, dk2.tb tbVar) {
        this.f315562d = i17;
        this.f315563e = fVar;
        this.f315564f = tbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("update req for ");
        int i17 = this.f315562d;
        sb6.append(i17);
        sb6.append(' ');
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f315563e;
        sb6.append(fVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLivePollingService", sb6.toString());
        dk2.tb tbVar = this.f315564f;
        java.util.Iterator it = tbVar.f315653a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((dk2.bb) obj).f314781d == i17) {
                    break;
                }
            }
        }
        dk2.bb bbVar = obj instanceof dk2.bb ? (dk2.bb) obj : null;
        if (bbVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fVar, "<set-?>");
            bbVar.f314782e = fVar;
        }
        java.lang.Object obj2 = tbVar.f315654b.get(java.lang.Integer.valueOf(i17));
        dk2.bb bbVar2 = obj2 instanceof dk2.bb ? (dk2.bb) obj2 : null;
        if (bbVar2 == null) {
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fVar, "<set-?>");
        bbVar2.f314782e = fVar;
    }
}
