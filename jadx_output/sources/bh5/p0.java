package bh5;

/* loaded from: classes14.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment f20954d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment mMHalfScreenDialogFragment) {
        super(0);
        this.f20954d = mMHalfScreenDialogFragment;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        int i17 = com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment.F;
        com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment mMHalfScreenDialogFragment = this.f20954d;
        mMHalfScreenDialogFragment.getClass();
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new bh5.n0(mMHalfScreenDialogFragment));
        ofFloat.addListener(new bh5.o0(mMHalfScreenDialogFragment, ofFloat));
        return ofFloat;
    }
}
