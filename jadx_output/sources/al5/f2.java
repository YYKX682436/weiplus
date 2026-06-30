package al5;

/* loaded from: classes10.dex */
public class f2 extends android.view.animation.Animation {

    /* renamed from: d, reason: collision with root package name */
    public int f5903d = 0;

    /* renamed from: e, reason: collision with root package name */
    public float f5904e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public long f5905f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMSwitchBtn f5906g;

    public f2(com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn, al5.b2 b2Var) {
        this.f5906g = mMSwitchBtn;
        setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        setAnimationListener(new al5.e2(this, mMSwitchBtn));
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f17, android.view.animation.Transformation transformation) {
        int i17 = this.f5903d;
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = this.f5906g;
        if (i17 == 0) {
            mMSwitchBtn.A.left = this.f5904e - (f17 * ((float) this.f5905f));
        } else {
            mMSwitchBtn.A.left = this.f5904e + (f17 * ((float) this.f5905f));
        }
        int i18 = com.tencent.mm.ui.widget.MMSwitchBtn.Q;
        mMSwitchBtn.b(false);
        mMSwitchBtn.invalidate();
    }
}
