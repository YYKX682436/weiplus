package bh5;

/* loaded from: classes8.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2710x1c644e5f.ActivityC22413xb8aa5962 f102469d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.p314xaae8f345.mm.ui.p2710x1c644e5f.ActivityC22413xb8aa5962 activityC22413xb8aa5962) {
        super(0);
        this.f102469d = activityC22413xb8aa5962;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.os.Bundle bundleExtra = this.f102469d.getIntent().getBundleExtra("INTENT_KEY_HALFSCREEN_BUNDLE");
        if (bundleExtra == null) {
            bundleExtra = new android.os.Bundle();
        }
        dh5.a aVar = new dh5.a();
        java.lang.String string = bundleExtra.getString("KEY_BUNDLE_DIALOG_FRAGMENT_START_PARAM");
        if (string == null) {
            string = "";
        }
        aVar.m126728xdc93280d(string);
        android.os.Bundle bundle = bundleExtra.getBundle("KEY_BUNDLE_BUNDLE");
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        aVar.f314151d = bundle;
        java.io.Serializable serializable = bundleExtra.getSerializable("KEY_BUNDLE_DIALOG_FRAGMENT_CLS");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(serializable, "null cannot be cast to non-null type java.lang.Class<out com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment?>");
        aVar.f314152e = (java.lang.Class) serializable;
        return aVar;
    }
}
