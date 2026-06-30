package el2;

/* loaded from: classes3.dex */
public final class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f335306d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ el2.i1 f335307e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f335308f;

    public d1(android.view.View view, el2.i1 i1Var, float f17) {
        this.f335306d = view;
        this.f335307e = i1Var;
        this.f335308f = f17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewPropertyAnimator duration = this.f335306d.animate().setDuration(this.f335307e.f335357s);
        float f17 = this.f335308f;
        duration.scaleX(f17).scaleY(f17).start();
    }
}
