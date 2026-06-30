package j9;

/* loaded from: classes15.dex */
public abstract class h implements i9.e {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedList f379863a = new java.util.LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f379864b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.PriorityQueue f379865c;

    /* renamed from: d, reason: collision with root package name */
    public i9.i f379866d;

    /* renamed from: e, reason: collision with root package name */
    public long f379867e;

    public h() {
        for (int i17 = 0; i17 < 10; i17++) {
            this.f379863a.add(new i9.i());
        }
        this.f379864b = new java.util.LinkedList();
        for (int i18 = 0; i18 < 2; i18++) {
            this.f379864b.add(new j9.i(this));
        }
        this.f379865c = new java.util.PriorityQueue();
    }

    @Override // o8.e
    public java.lang.Object a() {
        t9.a.d(this.f379866d == null);
        java.util.LinkedList linkedList = this.f379863a;
        if (linkedList.isEmpty()) {
            return null;
        }
        i9.i iVar = (i9.i) linkedList.pollFirst();
        this.f379866d = iVar;
        return iVar;
    }

    @Override // i9.e
    public void b(long j17) {
        this.f379867e = j17;
    }

    @Override // o8.e
    public void c(java.lang.Object obj) {
        i9.i iVar = (i9.i) obj;
        t9.a.a(iVar == this.f379866d);
        if (iVar.k()) {
            iVar.l();
            this.f379863a.add(iVar);
        } else {
            this.f379865c.add(iVar);
        }
        this.f379866d = null;
    }

    public abstract i9.d d();

    @Override // o8.e
    /* renamed from: dequeueOutputBuffer */
    public java.lang.Object mo140477x436dd5f1() {
        java.util.LinkedList linkedList = this.f379864b;
        if (!linkedList.isEmpty()) {
            while (true) {
                java.util.PriorityQueue priorityQueue = this.f379865c;
                if (priorityQueue.isEmpty() || ((i9.i) priorityQueue.peek()).f425144g > this.f379867e) {
                    break;
                }
                i9.i iVar = (i9.i) priorityQueue.poll();
                boolean b17 = iVar.b(4);
                java.util.LinkedList linkedList2 = this.f379863a;
                if (b17) {
                    i9.j jVar = (i9.j) linkedList.pollFirst();
                    jVar.f425127d = 4 | jVar.f425127d;
                    iVar.l();
                    linkedList2.add(iVar);
                    return jVar;
                }
                e(iVar);
                if (f()) {
                    i9.d d17 = d();
                    if (!iVar.k()) {
                        i9.j jVar2 = (i9.j) linkedList.pollFirst();
                        long j17 = iVar.f425144g;
                        jVar2.f425146e = j17;
                        jVar2.f371204f = d17;
                        jVar2.f371205g = j17;
                        iVar.l();
                        linkedList2.add(iVar);
                        return jVar2;
                    }
                }
                iVar.l();
                linkedList2.add(iVar);
            }
        }
        return null;
    }

    public abstract void e(i9.i iVar);

    public abstract boolean f();

    @Override // o8.e
    /* renamed from: flush */
    public void mo140474x5d03b04() {
        java.util.LinkedList linkedList;
        this.f379867e = 0L;
        while (true) {
            java.util.PriorityQueue priorityQueue = this.f379865c;
            boolean isEmpty = priorityQueue.isEmpty();
            linkedList = this.f379863a;
            if (isEmpty) {
                break;
            }
            i9.i iVar = (i9.i) priorityQueue.poll();
            iVar.l();
            linkedList.add(iVar);
        }
        i9.i iVar2 = this.f379866d;
        if (iVar2 != null) {
            iVar2.l();
            linkedList.add(iVar2);
            this.f379866d = null;
        }
    }

    @Override // o8.e
    /* renamed from: release */
    public void mo140475x41012807() {
    }
}
