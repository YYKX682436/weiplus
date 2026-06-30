package sc2;

/* loaded from: classes.dex */
public final class m1 extends wa2.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f487602d;

    public m1(yz5.a aVar) {
        this.f487602d = aVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        yz5.a aVar = this.f487602d;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }
}
