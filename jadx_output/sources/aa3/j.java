package aa3;

/* loaded from: classes3.dex */
public final class j implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ aa3.e f2538a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f2539b;

    public j(aa3.e eVar, yz5.a aVar) {
        this.f2538a = eVar;
        this.f2539b = aVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        aa3.e eVar = this.f2538a;
        if (kotlin.jvm.internal.o.b(eVar.f2512b, animation)) {
            eVar.f2511a = false;
            eVar.f2514d = false;
            eVar.f2512b = null;
            yz5.a aVar = this.f2539b;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
