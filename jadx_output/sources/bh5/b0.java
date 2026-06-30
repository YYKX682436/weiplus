package bh5;

/* loaded from: classes14.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment f20921d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment mMHalfScreenDialogFragment) {
        super(0);
        this.f20921d = mMHalfScreenDialogFragment;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Intent intent = new android.content.Intent();
        android.os.Bundle bundle = this.f20921d.f208804e.f232618d;
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        intent.putExtras(bundle);
        return intent;
    }
}
