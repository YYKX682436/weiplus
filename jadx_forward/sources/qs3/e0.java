package qs3;

/* loaded from: classes8.dex */
public final class e0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16951xe88fa290 f447877d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16951xe88fa290 c16951xe88fa290) {
        super(0);
        this.f447877d = c16951xe88fa290;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(this.f447877d.getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559396dl);
        loadAnimation.setAnimationListener(new qs3.d0());
        return loadAnimation;
    }
}
