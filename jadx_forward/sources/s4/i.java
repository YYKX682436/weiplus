package s4;

/* loaded from: classes15.dex */
public class i extends android.view.animation.Animation {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f484417d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f484418e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p110x7d9e8ccb.p111xd1075a44.C1170xe46664eb f484419f;

    public i(p012xc85e97e9.p110x7d9e8ccb.p111xd1075a44.C1170xe46664eb c1170xe46664eb, int i17, int i18) {
        this.f484419f = c1170xe46664eb;
        this.f484417d = i17;
        this.f484418e = i18;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f17, android.view.animation.Transformation transformation) {
        this.f484419f.D.setAlpha((int) (this.f484417d + ((this.f484418e - r0) * f17)));
    }
}
