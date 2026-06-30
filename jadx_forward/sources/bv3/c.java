package bv3;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public bv3.c f106259a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f106260b;

    /* renamed from: c, reason: collision with root package name */
    public long f106261c;

    /* renamed from: d, reason: collision with root package name */
    public long f106262d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f106263e;

    public c(long j17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        j17 = (i17 & 1) != 0 ? 0L : j17;
        this.f106260b = new java.util.LinkedList();
        this.f106262d = j17;
        this.f106263e = true;
    }

    public final long a() {
        if (this.f106263e) {
            bv3.c cVar = this.f106259a;
            this.f106262d = (cVar != null ? cVar.a() : 0L) + this.f106261c;
            b(false);
        }
        return this.f106262d;
    }

    public final void b(boolean z17) {
        if (this.f106263e != z17) {
            this.f106263e = z17;
            if (z17) {
                java.util.Iterator it = this.f106260b.iterator();
                while (it.hasNext()) {
                    ((bv3.c) it.next()).b(z17);
                }
            }
        }
    }

    public final void c(long j17) {
        if (this.f106261c != j17) {
            this.f106261c = j17;
            b(true);
        }
    }

    public final void d(bv3.c cVar) {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f106259a, cVar)) {
            return;
        }
        bv3.c cVar2 = this.f106259a;
        if (cVar2 != null && (linkedList2 = cVar2.f106260b) != null) {
            linkedList2.remove(this);
        }
        this.f106259a = cVar;
        if (cVar != null && (linkedList = cVar.f106260b) != null) {
            linkedList.add(this);
        }
        b(true);
    }
}
