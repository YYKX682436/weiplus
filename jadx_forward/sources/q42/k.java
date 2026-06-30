package q42;

/* loaded from: classes15.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f441610d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f441611e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q42.l f441612f;

    public k(q42.l lVar, long j17, java.lang.String str) {
        this.f441612f = lVar;
        this.f441610d = j17;
        this.f441611e = str;
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
            if (bVar.f484465b == 9 && (mVar = this.f441612f.f441613a) != null) {
                ((g42.f) mVar).Di(this.f441610d, bVar, this.f441611e);
            }
        }
    }
}
