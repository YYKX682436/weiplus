package sh2;

/* loaded from: classes3.dex */
public final class e implements fp0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sh2.g f489550a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sh2.a f489551b;

    public e(sh2.g gVar, sh2.a aVar) {
        this.f489550a = gVar;
        this.f489551b = aVar;
    }

    @Override // fp0.p
    public void a(fp0.d dVar, fp0.u status) {
        sh2.j task = (sh2.j) dVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        sh2.g gVar = sh2.g.f489553e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveLikeActionMgr", "task callback " + status);
        fp0.u uVar = fp0.u.f346823f;
        sh2.g gVar2 = this.f489550a;
        if (status != uVar) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(gVar2.f489557d);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(gVar2.f489557d, nv2.a.f421964a);
            return;
        }
        gVar2.getClass();
        sh2.a aVar = this.f489551b;
        boolean z17 = aVar instanceof sh2.c;
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = gVar2.f489555b;
        java.util.ArrayList<sh2.a> arrayList = null;
        if (z17) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                sh2.a aVar2 = (sh2.a) next;
                if ((aVar2 instanceof sh2.c ? (sh2.c) aVar2 : null) != null && aVar.f489543c > aVar2.f489543c) {
                    arrayList2.add(next);
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            for (sh2.a aVar3 : arrayList) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveLikeActionMgr", "drop action now action " + aVar + ' ' + aVar3);
                concurrentLinkedQueue.remove(aVar3);
            }
        }
        gVar2.a();
    }
}
