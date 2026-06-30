package z51;

/* loaded from: classes10.dex */
public final class g extends z51.x {

    /* renamed from: f, reason: collision with root package name */
    public android.animation.AnimatorSet f551718f;

    /* renamed from: g, reason: collision with root package name */
    public android.animation.AnimatorSet f551719g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(y51.a pcContext) {
        super(pcContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pcContext, "pcContext");
    }

    @Override // z51.x
    public java.lang.String c() {
        return "MicroMsg.LivePhotoPlayAniPc";
    }

    @Override // z51.x
    public void h() {
        super.h();
        boolean k17 = ((z51.p) a(z51.p.class)).k();
        f("pause >> isPlaying: " + k17);
        if (k17) {
            k();
        }
    }

    @Override // z51.x
    public void j() {
        super.j();
        android.animation.AnimatorSet animatorSet = this.f551718f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        android.animation.AnimatorSet animatorSet2 = this.f551719g;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
    }

    public final void k() {
        f("aniToThumbView");
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18697xb57c3465 c18697xb57c3465 = ((z51.p) a(z51.p.class)).f551733g;
        if (c18697xb57c3465 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tpPlayerView");
            throw null;
        }
        android.widget.FrameLayout frameLayout = ((z51.p) a(z51.p.class)).f551732f;
        if (frameLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("videoViewContainer");
            throw null;
        }
        this.f551719g = new android.animation.AnimatorSet();
        frameLayout.post(new z51.f(c18697xb57c3465, this, frameLayout));
    }
}
