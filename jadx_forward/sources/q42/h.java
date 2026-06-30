package q42;

/* loaded from: classes15.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f441601d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f441602e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q42.l f441603f;

    public h(q42.l lVar, long j17, java.lang.String str) {
        this.f441603f = lVar;
        this.f441601d = j17;
        this.f441602e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        q42.m mVar;
        java.util.ArrayList arrayList = (java.util.ArrayList) l42.n.Ai().Bi();
        if (arrayList.size() <= 0) {
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            s42.b bVar = (s42.b) it.next();
            if (bVar.f484465b == 5 && (mVar = this.f441603f.f441613a) != null) {
                ((g42.f) mVar).Di(this.f441601d, bVar, this.f441602e);
            }
        }
    }
}
