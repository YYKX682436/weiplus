package fg3;

/* loaded from: classes12.dex */
public final class m implements m34.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fg3.o f343971d;

    public m(fg3.o oVar) {
        this.f343971d = oVar;
    }

    @Override // m34.e
    public void a(int i17) {
        fg3.o oVar = this.f343971d;
        fg3.p pVar = (fg3.p) oVar.g(fg3.p.class);
        if (pVar != null) {
            ((fg3.v) pVar).W(i17 * 1000);
        }
        oVar.e(true);
    }

    @Override // m34.e
    public void b() {
        fg3.o oVar = this.f343971d;
        oVar.e(false);
    }

    @Override // m34.e
    public void d(int i17) {
        fg3.p pVar = (fg3.p) this.f343971d.g(fg3.p.class);
        if (pVar != null) {
            ((fg3.v) pVar).X(i17 * 1000);
        }
    }
}
