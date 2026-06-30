package wo1;

/* loaded from: classes3.dex */
public final class m1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f529524d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(android.content.Context context) {
        super(0);
        this.f529524d = context;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(this.f529524d, com.p314xaae8f345.mm.R.C30854x2dc211.f559477fw);
        loadAnimation.setInterpolator(new android.view.animation.LinearInterpolator());
        return loadAnimation;
    }
}
