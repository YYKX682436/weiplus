package kh;

/* loaded from: classes12.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kh.p f389384d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.animation.Animator f389385e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(kh.p pVar, android.animation.Animator animator) {
        super(0);
        this.f389384d = pVar;
        this.f389385e = animator;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        this.f389384d.f389415d.onAnimationCancel(this.f389385e);
        return jz5.f0.f384359a;
    }
}
