package t20;

/* loaded from: classes13.dex */
public final class a implements dy1.t {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t20.g f496197d;

    public a(t20.g gVar) {
        this.f496197d = gVar;
    }

    @Override // dy1.t
    public void B(android.view.View view, int i17) {
        t20.g gVar = this.f496197d;
        if (view == null) {
            gVar.getClass();
            return;
        }
        y02.n0 Ai = gVar.Ai(view);
        if (Ai == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Ecs.Oracle.EcsOracleService", "[handleExposure] session is null, view:%s", view);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Ecs.Oracle.EcsOracleService", "[handleExposure] view:%s", view);
        t20.d dVar = new t20.d(Ai);
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            dVar.mo152xb9724478();
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).i(new t20.f(dVar));
    }

    @Override // dy1.t
    public void E(android.view.View view, int i17) {
    }
}
