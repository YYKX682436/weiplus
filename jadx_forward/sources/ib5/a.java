package ib5;

/* loaded from: classes13.dex */
public class a implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ib5.d f371778d;

    public a(ib5.d dVar) {
        this.f371778d = dVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        ib5.d dVar = this.f371778d;
        if (!dVar.f371792l) {
            dVar.f371792l = true;
            dVar.f371787g.invalidate();
        }
        return true;
    }
}
