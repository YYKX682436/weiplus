package qs3;

/* loaded from: classes8.dex */
public final class c0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16951xe88fa290 f447872d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16951xe88fa290 c16951xe88fa290) {
        super(0);
        this.f447872d = c16951xe88fa290;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16951xe88fa290 c16951xe88fa290 = this.f447872d;
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(c16951xe88fa290.getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559395dk);
        loadAnimation.setAnimationListener(new qs3.b0(c16951xe88fa290));
        return loadAnimation;
    }
}
