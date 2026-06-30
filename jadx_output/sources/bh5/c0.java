package bh5;

/* loaded from: classes8.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment f20923d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment mMHalfScreenDialogFragment) {
        super(0);
        this.f20923d = mMHalfScreenDialogFragment;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17;
        tk5.a b17 = this.f20923d.u0().b();
        if (b17 != null) {
            b17.g0();
            z17 = true;
        } else {
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
