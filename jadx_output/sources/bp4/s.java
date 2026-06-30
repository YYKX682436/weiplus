package bp4;

/* loaded from: classes5.dex */
public final class s implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f23368a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23369b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bp4.t f23370c;

    public s(androidx.recyclerview.widget.k3 k3Var, int i17, bp4.t tVar) {
        this.f23368a = k3Var;
        this.f23369b = i17;
        this.f23370c = tVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f23368a.itemView.setTag(null);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        androidx.recyclerview.widget.k3 k3Var = this.f23368a;
        k3Var.itemView.setTag(new java.lang.Object());
        if (this.f23369b == 2) {
            int adapterPosition = k3Var.getAdapterPosition();
            bp4.t tVar = this.f23370c;
            tVar.f23378c = adapterPosition;
            tVar.f23377b = tVar.f23378c;
            tVar.getClass();
            tVar.getClass();
        }
    }
}
