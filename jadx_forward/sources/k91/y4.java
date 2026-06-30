package k91;

/* loaded from: classes7.dex */
public class y4 implements km5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f387368a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f387369b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k91.h1 f387370c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k91.e5 f387371d;

    public y4(java.util.List list, java.util.List list2, k91.h1 h1Var, k91.e5 e5Var) {
        this.f387368a = list;
        this.f387369b = list2;
        this.f387370c = h1Var;
        this.f387371d = e5Var;
    }

    @Override // km5.c
    /* renamed from: call */
    public java.lang.Object mo47949x2e7a5e() {
        km5.b c17 = km5.u.c();
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = new java.util.concurrent.ConcurrentLinkedQueue();
        java.util.List list = this.f387368a;
        k91.v4 v4Var = new k91.v4(this, new java.util.concurrent.atomic.AtomicInteger(list.size()), concurrentLinkedQueue, c17);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((km5.q) ((km5.q) it.next()).a(new k91.x4(this, concurrentLinkedQueue, v4Var))).s(new k91.w4(this, v4Var));
        }
        return null;
    }
}
