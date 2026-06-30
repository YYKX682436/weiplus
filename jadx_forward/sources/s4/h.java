package s4;

/* loaded from: classes15.dex */
public class h extends android.view.animation.Animation {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p110x7d9e8ccb.p111xd1075a44.C1170xe46664eb f484416d;

    public h(p012xc85e97e9.p110x7d9e8ccb.p111xd1075a44.C1170xe46664eb c1170xe46664eb) {
        this.f484416d = c1170xe46664eb;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f17, android.view.animation.Transformation transformation) {
        this.f484416d.m8244x9a3118f(1.0f - f17);
    }
}
