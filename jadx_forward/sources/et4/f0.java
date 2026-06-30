package et4;

/* loaded from: classes9.dex */
public class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.DialogC19129x966bbd2f f338147d;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.DialogC19129x966bbd2f dialogC19129x966bbd2f) {
        this.f338147d = dialogC19129x966bbd2f;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.DialogC19129x966bbd2f dialogC19129x966bbd2f = this.f338147d;
        dialogC19129x966bbd2f.f261735f.sendAccessibilityEvent(128);
        android.widget.ImageView imageView = dialogC19129x966bbd2f.f261734e;
        if (imageView != null) {
            imageView.setContentDescription(dialogC19129x966bbd2f.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b9a));
        }
    }
}
