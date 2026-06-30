package s4;

/* loaded from: classes15.dex */
public class k extends android.view.animation.Animation {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p110x7d9e8ccb.p111xd1075a44.C1170xe46664eb f484421d;

    public k(p012xc85e97e9.p110x7d9e8ccb.p111xd1075a44.C1170xe46664eb c1170xe46664eb) {
        this.f484421d = c1170xe46664eb;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f17, android.view.animation.Transformation transformation) {
        p012xc85e97e9.p110x7d9e8ccb.p111xd1075a44.C1170xe46664eb c1170xe46664eb = this.f484421d;
        c1170xe46664eb.getClass();
        int abs = c1170xe46664eb.B - java.lang.Math.abs(c1170xe46664eb.A);
        c1170xe46664eb.m8257x53592b33((c1170xe46664eb.f93906z + ((int) ((abs - r0) * f17))) - c1170xe46664eb.f93904x.getTop());
        s4.e eVar = c1170xe46664eb.D;
        float f18 = 1.0f - f17;
        s4.d dVar = eVar.f484408d;
        if (f18 != dVar.f484399p) {
            dVar.f484399p = f18;
        }
        eVar.invalidateSelf();
    }
}
