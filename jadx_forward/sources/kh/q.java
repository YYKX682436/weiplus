package kh;

/* loaded from: classes12.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kh.r f389422d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator f389423e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(kh.r rVar, android.animation.ValueAnimator valueAnimator) {
        super(0);
        this.f389422d = rVar;
        this.f389423e = valueAnimator;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        this.f389422d.f389432d.onAnimationUpdate(this.f389423e);
        return jz5.f0.f384359a;
    }
}
