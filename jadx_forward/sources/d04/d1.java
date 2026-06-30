package d04;

/* loaded from: classes3.dex */
public final class d1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17328xd29825bc f306937d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17328xd29825bc c17328xd29825bc) {
        super(0);
        this.f306937d = c17328xd29825bc;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17328xd29825bc.f241232z;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17328xd29825bc c17328xd29825bc = this.f306937d;
        android.view.animation.Animation animation = c17328xd29825bc.f241241o;
        if (animation != null) {
            animation.cancel();
        }
        android.view.View view = c17328xd29825bc.f241236g;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingIcon");
            throw null;
        }
        view.clearAnimation();
        if (c17328xd29825bc.f241241o == null) {
            c17328xd29825bc.f241241o = android.view.animation.AnimationUtils.loadAnimation(c17328xd29825bc.getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559264s);
            float dimensionPixelSize = c17328xd29825bc.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db) / 2.0f;
            android.view.animation.RotateAnimation rotateAnimation = new android.view.animation.RotateAnimation(0.0f, 360.0f, dimensionPixelSize, dimensionPixelSize);
            c17328xd29825bc.f241241o = rotateAnimation;
            rotateAnimation.setInterpolator(new android.view.animation.LinearInterpolator());
            rotateAnimation.setRepeatMode(-1);
            rotateAnimation.setRepeatCount(-1);
            rotateAnimation.setDuration(1000L);
        }
        android.view.View view2 = c17328xd29825bc.f241236g;
        if (view2 != null) {
            view2.startAnimation(c17328xd29825bc.f241241o);
            return jz5.f0.f384359a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingIcon");
        throw null;
    }
}
