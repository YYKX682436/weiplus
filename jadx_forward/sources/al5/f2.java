package al5;

/* loaded from: classes10.dex */
public class f2 extends android.view.animation.Animation {

    /* renamed from: d, reason: collision with root package name */
    public int f87436d = 0;

    /* renamed from: e, reason: collision with root package name */
    public float f87437e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public long f87438f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 f87439g;

    public f2(com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8, al5.b2 b2Var) {
        this.f87439g = viewOnClickListenerC22631x1cc07cc8;
        setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        setAnimationListener(new al5.e2(this, viewOnClickListenerC22631x1cc07cc8));
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f17, android.view.animation.Transformation transformation) {
        int i17 = this.f87436d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = this.f87439g;
        if (i17 == 0) {
            viewOnClickListenerC22631x1cc07cc8.A.left = this.f87437e - (f17 * ((float) this.f87438f));
        } else {
            viewOnClickListenerC22631x1cc07cc8.A.left = this.f87437e + (f17 * ((float) this.f87438f));
        }
        int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8.Q;
        viewOnClickListenerC22631x1cc07cc8.b(false);
        viewOnClickListenerC22631x1cc07cc8.invalidate();
    }
}
