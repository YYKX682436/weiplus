package ln1;

/* loaded from: classes12.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ln1.l f401310d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f401311e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ln1.h f401312f;

    public k(ln1.h hVar, ln1.l lVar, java.util.LinkedList linkedList) {
        this.f401312f = hVar;
        this.f401310d = lVar;
        this.f401311e = linkedList;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            java.lang.Thread.sleep(bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2512xacc075c2.C19943x44f00475()));
        } catch (java.lang.InterruptedException unused) {
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new ln1.j(this));
    }
}
