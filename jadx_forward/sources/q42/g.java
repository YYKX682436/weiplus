package q42;

/* loaded from: classes15.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f441597d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f441598e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f441599f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q42.l f441600g;

    public g(q42.l lVar, int i17, long j17, java.lang.String str) {
        this.f441600g = lVar;
        this.f441597d = i17;
        this.f441598e = j17;
        this.f441599f = str;
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
            if (bVar.f484465b == 4 && bVar.f484466c == this.f441597d && (mVar = this.f441600g.f441613a) != null) {
                ((g42.f) mVar).Di(this.f441598e, bVar, this.f441599f);
            }
        }
    }
}
