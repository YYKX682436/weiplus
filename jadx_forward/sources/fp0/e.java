package fp0;

/* loaded from: classes10.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fp0.o f346781d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fp0.d f346782e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f346783f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fp0.p f346784g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(fp0.o oVar, fp0.d dVar, boolean z17, fp0.p pVar) {
        super(0);
        this.f346781d = oVar;
        this.f346782e = dVar;
        this.f346783f = z17;
        this.f346784g = pVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object obj;
        fp0.d dVar;
        java.lang.Object obj2;
        fp0.o oVar = this.f346781d;
        java.util.Iterator it = oVar.f346806e.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            obj = null;
            dVar = this.f346782e;
            if (!hasNext) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((fp0.d) ((fp0.q) obj2).f346808a).d(), dVar.d())) {
                break;
            }
        }
        fp0.q qVar = (fp0.q) obj2;
        fp0.p pVar = this.f346784g;
        if (qVar != null) {
            boolean c17 = ((fp0.d) qVar.f346808a).c(dVar);
            java.util.Queue queue = qVar.f346809b;
            if (c17) {
                queue.clear();
            }
            if (pVar != null) {
                queue.add(pVar);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Loader.DefaultTaskLoader", oVar.f() + "this task already in task in mPendingQueue " + dVar + ' ' + dVar.d() + " callback=" + pVar + " callback size=" + queue.size());
            oVar.c();
        } else {
            java.util.LinkedList linkedList = oVar.f346807f;
            java.util.Iterator it6 = linkedList.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                java.lang.Object next = it6.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((fp0.d) ((fp0.q) next).f346808a).d(), dVar.d())) {
                    obj = next;
                    break;
                }
            }
            fp0.q qVar2 = (fp0.q) obj;
            if (qVar2 != null) {
                boolean c18 = ((fp0.d) qVar2.f346808a).c(dVar);
                java.util.Queue queue2 = qVar2.f346809b;
                if (c18) {
                    queue2.clear();
                }
                if (pVar != null) {
                    queue2.add(pVar);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Loader.DefaultTaskLoader", oVar.f() + "this task already in task in mRunningQueue " + dVar + ' ' + dVar.d() + " callback=" + pVar + " callback size=" + queue2.size());
                oVar.c();
            } else {
                java.lang.String str = oVar.f() + " task in mRunningQueue %s %s, %d, %d";
                java.lang.String d17 = dVar.d();
                java.util.LinkedList linkedList2 = oVar.f346806e;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Loader.DefaultTaskLoader", str, dVar, d17, java.lang.Integer.valueOf(linkedList2.size()), java.lang.Integer.valueOf(linkedList.size()));
                java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = new java.util.concurrent.ConcurrentLinkedQueue();
                if (pVar != null) {
                    concurrentLinkedQueue.add(pVar);
                }
                if (this.f346783f) {
                    linkedList2.addFirst(new fp0.q(dVar, concurrentLinkedQueue));
                } else {
                    linkedList2.add(new fp0.q(dVar, concurrentLinkedQueue));
                }
                oVar.c();
            }
        }
        return jz5.f0.f384359a;
    }
}
