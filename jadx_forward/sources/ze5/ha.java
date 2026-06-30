package ze5;

/* loaded from: classes9.dex */
public class ha implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ze5.ia f553511d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f553512e;

    public ha(ze5.ia iaVar, boolean z17) {
        this.f553511d = iaVar;
        this.f553512e = z17;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        ze5.ia iaVar = this.f553511d;
        iaVar.f553548h.getViewTreeObserver().removeOnPreDrawListener(this);
        iaVar.f553549i.setGravity((iaVar.f553548h.getWidth() <= iaVar.f39493x8ad70635.getWidth() || this.f553512e) ? 3 : 5);
        return true;
    }
}
