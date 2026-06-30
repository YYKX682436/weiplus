package bh5;

/* loaded from: classes8.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment f20957d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment mMHalfScreenDialogFragment) {
        super(4);
        this.f20957d = mMHalfScreenDialogFragment;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        android.view.View v17 = (android.view.View) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        int intValue2 = ((java.lang.Number) obj4).intValue();
        kotlin.jvm.internal.o.g(v17, "v");
        com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment mMHalfScreenDialogFragment = this.f20957d;
        java.lang.String str = mMHalfScreenDialogFragment.f208805f;
        android.view.ViewGroup.LayoutParams layoutParams = mMHalfScreenDialogFragment.y0().getLayoutParams();
        if (intValue2 == 0) {
            layoutParams.height = 0;
        }
        if (intValue > 0) {
            layoutParams.height = intValue;
        }
        mMHalfScreenDialogFragment.y0().setLayoutParams(layoutParams);
        return jz5.f0.f302826a;
    }
}
