package pa;

/* loaded from: classes15.dex */
public class a implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f434463d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f434464e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ da.a f434465f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.p244x11d36527.p264x9c651309.AbstractC2722x95223586 f434466g;

    public a(com.p176xb6135e39.p177xcca8366f.p244x11d36527.p264x9c651309.AbstractC2722x95223586 abstractC2722x95223586, android.view.View view, int i17, da.a aVar) {
        this.f434466g = abstractC2722x95223586;
        this.f434463d = view;
        this.f434464e = i17;
        this.f434465f = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        android.view.View view = this.f434463d;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p264x9c651309.AbstractC2722x95223586 abstractC2722x95223586 = this.f434466g;
        if (abstractC2722x95223586.f126156d == this.f434464e) {
            java.lang.Object obj = this.f434465f;
            abstractC2722x95223586.y((android.view.View) obj, view, ((com.p176xb6135e39.p177xcca8366f.p244x11d36527.p256x62a1d3ee.C2702x4197484e) obj).f126037u.f309260b, false);
        }
        return false;
    }
}
