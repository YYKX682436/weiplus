package bg;

/* loaded from: classes7.dex */
public class k implements sf.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bg.f f19812a;

    public k(bg.f fVar) {
        this.f19812a = fVar;
    }

    @Override // sf.e
    public void a(int i17) {
        bg.f fVar = this.f19812a;
        com.tencent.mars.xlog.Log.i(fVar.A(), "onBackground, type: " + i17);
        fVar.getClass();
        fVar.Q(new bg.n(fVar, i17));
    }

    @Override // sf.e
    public void b() {
        bg.f fVar = this.f19812a;
        com.tencent.mars.xlog.Log.i(fVar.A(), "onForeground");
        fVar.getClass();
        fVar.Q(new bg.l(fVar));
    }

    @Override // sf.e
    public void onDestroy() {
        bg.f fVar = this.f19812a;
        fVar.getClass();
        fVar.Q(new bg.q(fVar));
    }
}
