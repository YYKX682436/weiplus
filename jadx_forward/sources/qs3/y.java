package qs3;

/* loaded from: classes8.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16950xf026cd07 f447940d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16950xf026cd07 c16950xf026cd07) {
        super(0);
        this.f447940d = c16950xf026cd07;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16950xf026cd07 c16950xf026cd07 = this.f447940d;
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(c16950xf026cd07.getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559393di);
        loadAnimation.setAnimationListener(new qs3.x(c16950xf026cd07));
        return loadAnimation;
    }
}
