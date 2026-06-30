package bh5;

/* loaded from: classes14.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment f20963d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment mMHalfScreenDialogFragment) {
        super(0);
        this.f20963d = mMHalfScreenDialogFragment;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment mMHalfScreenDialogFragment = this.f20963d;
        java.lang.Integer num = mMHalfScreenDialogFragment.D;
        float intValue = num != null ? num.intValue() : mMHalfScreenDialogFragment.f208818v;
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(intValue, intValue - mMHalfScreenDialogFragment.f208818v);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new bh5.s(mMHalfScreenDialogFragment));
        ofFloat.addListener(new bh5.t(mMHalfScreenDialogFragment));
        return ofFloat;
    }
}
