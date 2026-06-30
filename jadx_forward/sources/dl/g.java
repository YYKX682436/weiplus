package dl;

/* loaded from: classes10.dex */
public class g implements hk0.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dl.t f316626a;

    public g(dl.t tVar) {
        this.f316626a = tVar;
    }

    @Override // hk0.b1
    public void a(float f17) {
        dl.t tVar = this.f316626a;
        int i17 = (int) (r1.f536468h * f17);
        tVar.D.f536467g = i17;
        xk0.c.f536461s.setAlpha(i17);
        tVar.r();
    }
}
