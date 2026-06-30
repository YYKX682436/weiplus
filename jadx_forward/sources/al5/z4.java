package al5;

/* loaded from: classes5.dex */
public class z4 extends android.view.animation.Animation {

    /* renamed from: d, reason: collision with root package name */
    public int f87639d = 0;

    /* renamed from: e, reason: collision with root package name */
    public float f87640e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public long f87641f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22656xc0bc43c2 f87642g;

    public z4(com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22656xc0bc43c2 viewOnClickListenerC22656xc0bc43c2, al5.v4 v4Var) {
        this.f87642g = viewOnClickListenerC22656xc0bc43c2;
        setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        setAnimationListener(new al5.y4(this, viewOnClickListenerC22656xc0bc43c2));
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f17, android.view.animation.Transformation transformation) {
        int i17 = this.f87639d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22656xc0bc43c2 viewOnClickListenerC22656xc0bc43c2 = this.f87642g;
        if (i17 == 0) {
            viewOnClickListenerC22656xc0bc43c2.A.left = this.f87640e - (f17 * ((float) this.f87641f));
        } else {
            viewOnClickListenerC22656xc0bc43c2.A.left = this.f87640e + (f17 * ((float) this.f87641f));
        }
        int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22656xc0bc43c2.N;
        viewOnClickListenerC22656xc0bc43c2.b(false);
        viewOnClickListenerC22656xc0bc43c2.invalidate();
    }
}
