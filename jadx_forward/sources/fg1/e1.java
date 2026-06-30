package fg1;

/* loaded from: classes7.dex */
public class e1 implements bg.z0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fg1.f1 f343390a;

    public e1(fg1.f1 f1Var) {
        this.f343390a = f1Var;
    }

    public void a(boolean z17) {
        fg1.f1 f1Var = this.f343390a;
        ye1.e eVar = f1Var.f343397g.f343401a.f101297h;
        ye1.r rVar = !(eVar instanceof ye1.r) ? null : (ye1.r) eVar;
        if (rVar == null) {
            return;
        }
        f1Var.f343393c = z17;
        rVar.a(this.f343390a.f343394d);
        rVar.A(this.f343390a.f343395e);
        rVar.e(this.f343390a.f343396f);
    }
}
