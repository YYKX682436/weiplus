package dl;

/* loaded from: classes10.dex */
public class l implements bn5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dl.t f316642a;

    public l(dl.t tVar) {
        this.f316642a = tVar;
    }

    @Override // bn5.e
    public void b() {
        android.graphics.Rect rect;
        dl.t tVar = this.f316642a;
        tVar.P = true;
        if (((l45.n) tVar.f316572a).f397998f == null) {
            rect = new android.graphics.Rect();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CropArtist", "getImageBitmap is null!");
        } else {
            rect = new android.graphics.Rect(0, 0, ((l45.n) tVar.f316572a).f397998f.getWidth(), ((l45.n) tVar.f316572a).f397998f.getHeight());
        }
        ((l45.n) tVar.f316572a).f397993a.m177310x5143ab24().k(rect);
        dl.t.G(tVar, 200L, true, false);
        dl.t.H(tVar);
    }

    @Override // bn5.e
    /* renamed from: onStart */
    public void mo10932xb05099c3() {
        dl.t tVar = this.f316642a;
        tVar.E = false;
        tVar.P = false;
        tVar.D.getClass();
        xk0.c.f536460r.setAlpha((int) (282 * 0.9019608f));
    }
}
