package ea;

/* loaded from: classes15.dex */
public class e implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ea.l f332004d;

    public e(ea.l lVar) {
        this.f332004d = lVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        ea.l lVar = this.f332004d;
        float rotation = lVar.f332031s.getRotation();
        if (lVar.f332019g == rotation) {
            return true;
        }
        lVar.f332019g = rotation;
        lVar.getClass();
        fa.d dVar = lVar.f332022j;
        if (dVar == null) {
            return true;
        }
        float f17 = -lVar.f332019g;
        if (f17 == dVar.f342125m) {
            return true;
        }
        dVar.f342125m = f17;
        dVar.invalidateSelf();
        return true;
    }
}
