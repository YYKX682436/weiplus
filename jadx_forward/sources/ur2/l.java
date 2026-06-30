package ur2;

/* loaded from: classes10.dex */
public final class l extends android.view.animation.Animation {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f511934d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ur2.o f511935e;

    public l(int i17, ur2.o oVar) {
        this.f511934d = i17;
        this.f511935e = oVar;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f17, android.view.animation.Transformation t17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(t17, "t");
        ur2.o oVar = this.f511935e;
        int i17 = ((int) (this.f511934d * f17)) + oVar.f511946m;
        android.view.View view = oVar.f511949p;
        view.setPadding(view.getPaddingLeft(), oVar.f511949p.getPaddingTop(), oVar.f511949p.getPaddingRight(), i17);
    }
}
