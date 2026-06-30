package xt2;

/* loaded from: classes3.dex */
public final class f5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14980xd3f2584a f538278d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14980xd3f2584a c14980xd3f2584a) {
        super(0);
        this.f538278d = c14980xd3f2584a;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        return android.animation.ObjectAnimator.ofFloat(this.f538278d.getMaskView(), "alpha", 0.0f, 1.0f);
    }
}
