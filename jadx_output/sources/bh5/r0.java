package bh5;

/* loaded from: classes14.dex */
public final class r0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment f20958d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment mMHalfScreenDialogFragment) {
        super(0);
        this.f20958d = mMHalfScreenDialogFragment;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.fragment.app.FragmentManager childFragmentManager = this.f20958d.getChildFragmentManager();
        kotlin.jvm.internal.o.f(childFragmentManager, "getChildFragmentManager(...)");
        return new tk5.c(childFragmentManager, com.tencent.mm.R.id.gwe);
    }
}
