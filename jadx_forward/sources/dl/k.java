package dl;

/* loaded from: classes10.dex */
public class k implements bn5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dl.t f316641a;

    public k(dl.t tVar) {
        this.f316641a = tVar;
    }

    @Override // bn5.e
    public void b() {
        dl.t tVar = this.f316641a;
        if (tVar.d() == null) {
            return;
        }
        if (((um.d) tVar.d()).f510207f.isIdentity()) {
            um.d dVar = (um.d) tVar.d();
            dVar.f510207f.set(tVar.h());
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        l45.n nVar = (l45.n) tVar.f316572a;
        android.graphics.Bitmap bitmap = nVar.f397998f;
        if (bitmap == null) {
            rect.set(0, 0, nVar.f397993a.m177310x5143ab24().m10934x9faf4b34().width(), ((l45.n) tVar.f316572a).f397993a.m177310x5143ab24().m10934x9faf4b34().height());
        } else {
            rect.set(0, 0, bitmap.getWidth(), ((l45.n) tVar.f316572a).f397998f.getHeight());
        }
        ((l45.n) tVar.f316572a).f397993a.m177310x5143ab24().k(rect);
        dl.t.G(tVar, 200L, true, false);
        dl.t.H(tVar);
        tVar.s();
    }

    @Override // bn5.e
    /* renamed from: onStart */
    public void mo10932xb05099c3() {
        dl.t tVar = this.f316641a;
        tVar.E = false;
        tVar.P = false;
    }
}
