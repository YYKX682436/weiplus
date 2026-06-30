package kh;

/* loaded from: classes12.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kh.p f389403d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.animation.Animator f389404e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(kh.p pVar, android.animation.Animator animator) {
        super(0);
        this.f389403d = pVar;
        this.f389404e = animator;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        this.f389403d.f389415d.onAnimationRepeat(this.f389404e);
        return jz5.f0.f384359a;
    }
}
