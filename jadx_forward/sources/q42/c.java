package q42;

/* loaded from: classes15.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f441584d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f441585e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f441586f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q42.l f441587g;

    public c(q42.l lVar, int i17, long j17, java.lang.String str) {
        this.f441587g = lVar;
        this.f441584d = i17;
        this.f441585e = j17;
        this.f441586f = str;
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
            if (bVar.f484465b == 1 && bVar.f484466c == this.f441584d && (mVar = this.f441587g.f441613a) != null) {
                ((g42.f) mVar).Di(this.f441585e, bVar, this.f441586f);
            }
        }
    }
}
