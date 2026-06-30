package g42;

/* loaded from: classes15.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s42.b f350250d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g42.f f350251e;

    public d(g42.f fVar, s42.b bVar) {
        this.f350251e = fVar;
        this.f350250d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        g42.f fVar = this.f350251e;
        h42.c cVar = fVar.f350255e;
        s42.b bVar = this.f350250d;
        ((h42.a) cVar).a(bVar.f484464a);
        ((h42.a) fVar.f350256f).a(bVar.f484464a);
        x51.k0 k0Var = fVar.f350257g.f551629a;
        if (k0Var == null || bVar == null) {
            return;
        }
        new z42.a(k0Var, bVar.f484464a, bVar.f484468e).a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EdgeComputingDataStorage", "[EdgeComputingDataStorage] clearAllData configID : " + bVar.f484464a);
    }
}
