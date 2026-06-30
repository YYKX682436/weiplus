package bh5;

/* loaded from: classes8.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.halfscreen.HalfScreenTransparentActivity f20936d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.ui.halfscreen.HalfScreenTransparentActivity halfScreenTransparentActivity) {
        super(0);
        this.f20936d = halfScreenTransparentActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.os.Bundle bundleExtra = this.f20936d.getIntent().getBundleExtra("INTENT_KEY_HALFSCREEN_BUNDLE");
        if (bundleExtra == null) {
            bundleExtra = new android.os.Bundle();
        }
        dh5.a aVar = new dh5.a();
        java.lang.String string = bundleExtra.getString("KEY_BUNDLE_DIALOG_FRAGMENT_START_PARAM");
        if (string == null) {
            string = "";
        }
        aVar.fromXml(string);
        android.os.Bundle bundle = bundleExtra.getBundle("KEY_BUNDLE_BUNDLE");
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        aVar.f232618d = bundle;
        java.io.Serializable serializable = bundleExtra.getSerializable("KEY_BUNDLE_DIALOG_FRAGMENT_CLS");
        kotlin.jvm.internal.o.e(serializable, "null cannot be cast to non-null type java.lang.Class<out com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment?>");
        aVar.f232619e = (java.lang.Class) serializable;
        return aVar;
    }
}
