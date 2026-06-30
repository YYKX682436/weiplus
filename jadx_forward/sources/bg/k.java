package bg;

/* loaded from: classes7.dex */
public class k implements sf.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bg.f f101345a;

    public k(bg.f fVar) {
        this.f101345a = fVar;
    }

    @Override // sf.e
    public void a(int i17) {
        bg.f fVar = this.f101345a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "onBackground, type: " + i17);
        fVar.getClass();
        fVar.Q(new bg.n(fVar, i17));
    }

    @Override // sf.e
    public void b() {
        bg.f fVar = this.f101345a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "onForeground");
        fVar.getClass();
        fVar.Q(new bg.l(fVar));
    }

    @Override // sf.e
    /* renamed from: onDestroy */
    public void mo10362xac79a11b() {
        bg.f fVar = this.f101345a;
        fVar.getClass();
        fVar.Q(new bg.q(fVar));
    }
}
