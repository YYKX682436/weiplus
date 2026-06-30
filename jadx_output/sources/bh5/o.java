package bh5;

/* loaded from: classes14.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment f20950d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment mMHalfScreenDialogFragment) {
        super(0);
        this.f20950d = mMHalfScreenDialogFragment;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment mMHalfScreenDialogFragment = this.f20950d;
        mMHalfScreenDialogFragment.f208819w.c();
        ((android.animation.ValueAnimator) ((jz5.n) mMHalfScreenDialogFragment.f208821y).getValue()).start();
        return jz5.f0.f302826a;
    }
}
