package bh5;

/* loaded from: classes8.dex */
public final class z implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment f20973d;

    public z(com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment mMHalfScreenDialogFragment) {
        this.f20973d = mMHalfScreenDialogFragment;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment mMHalfScreenDialogFragment = this.f20973d;
        mMHalfScreenDialogFragment.A0((com.tencent.mm.ui.vas.VASActivity) obj);
        com.tencent.mm.ui.halfscreen.HalfScreenPullDownCloseLayout halfScreenPullDownCloseLayout = mMHalfScreenDialogFragment.f208812p;
        if (halfScreenPullDownCloseLayout != null) {
            halfScreenPullDownCloseLayout.setDragFinishInterceptor(new bh5.y(mMHalfScreenDialogFragment));
        }
        return jz5.f0.f302826a;
    }
}
