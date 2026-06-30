package bv3;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public bv3.c f24726a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f24727b;

    /* renamed from: c, reason: collision with root package name */
    public long f24728c;

    /* renamed from: d, reason: collision with root package name */
    public long f24729d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f24730e;

    public c(long j17, int i17, kotlin.jvm.internal.i iVar) {
        j17 = (i17 & 1) != 0 ? 0L : j17;
        this.f24727b = new java.util.LinkedList();
        this.f24729d = j17;
        this.f24730e = true;
    }

    public final long a() {
        if (this.f24730e) {
            bv3.c cVar = this.f24726a;
            this.f24729d = (cVar != null ? cVar.a() : 0L) + this.f24728c;
            b(false);
        }
        return this.f24729d;
    }

    public final void b(boolean z17) {
        if (this.f24730e != z17) {
            this.f24730e = z17;
            if (z17) {
                java.util.Iterator it = this.f24727b.iterator();
                while (it.hasNext()) {
                    ((bv3.c) it.next()).b(z17);
                }
            }
        }
    }

    public final void c(long j17) {
        if (this.f24728c != j17) {
            this.f24728c = j17;
            b(true);
        }
    }

    public final void d(bv3.c cVar) {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        if (kotlin.jvm.internal.o.b(this.f24726a, cVar)) {
            return;
        }
        bv3.c cVar2 = this.f24726a;
        if (cVar2 != null && (linkedList2 = cVar2.f24727b) != null) {
            linkedList2.remove(this);
        }
        this.f24726a = cVar;
        if (cVar != null && (linkedList = cVar.f24727b) != null) {
            linkedList.add(this);
        }
        b(true);
    }
}
