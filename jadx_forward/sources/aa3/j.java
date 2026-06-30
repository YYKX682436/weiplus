package aa3;

/* loaded from: classes3.dex */
public final class j implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ aa3.e f84071a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f84072b;

    public j(aa3.e eVar, yz5.a aVar) {
        this.f84071a = eVar;
        this.f84072b = aVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        aa3.e eVar = this.f84071a;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(eVar.f84045b, animation)) {
            eVar.f84044a = false;
            eVar.f84047d = false;
            eVar.f84045b = null;
            yz5.a aVar = this.f84072b;
            if (aVar != null) {
                aVar.mo152xb9724478();
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
