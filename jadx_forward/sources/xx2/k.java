package xx2;

/* loaded from: classes3.dex */
public final class k extends android.view.animation.Animation {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xx2.l f539509d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f539510e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f539511f;

    public k(xx2.l lVar, float f17, float f18) {
        this.f539509d = lVar;
        this.f539510e = f17;
        this.f539511f = f18;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f17, android.view.animation.Transformation transformation) {
        float f18 = this.f539511f;
        float f19 = this.f539510e;
        this.f539509d.b(f19 + (f17 * (f18 - f19)));
    }
}
