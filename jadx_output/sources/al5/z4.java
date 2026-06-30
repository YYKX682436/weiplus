package al5;

/* loaded from: classes5.dex */
public class z4 extends android.view.animation.Animation {

    /* renamed from: d, reason: collision with root package name */
    public int f6106d = 0;

    /* renamed from: e, reason: collision with root package name */
    public float f6107e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public long f6108f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.WeSwitch f6109g;

    public z4(com.tencent.mm.ui.widget.WeSwitch weSwitch, al5.v4 v4Var) {
        this.f6109g = weSwitch;
        setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        setAnimationListener(new al5.y4(this, weSwitch));
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f17, android.view.animation.Transformation transformation) {
        int i17 = this.f6106d;
        com.tencent.mm.ui.widget.WeSwitch weSwitch = this.f6109g;
        if (i17 == 0) {
            weSwitch.A.left = this.f6107e - (f17 * ((float) this.f6108f));
        } else {
            weSwitch.A.left = this.f6107e + (f17 * ((float) this.f6108f));
        }
        int i18 = com.tencent.mm.ui.widget.WeSwitch.N;
        weSwitch.b(false);
        weSwitch.invalidate();
    }
}
