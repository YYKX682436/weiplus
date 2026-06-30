package c04;

/* loaded from: classes13.dex */
public final class w implements km5.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanGoodsMaskView f37695a;

    public w(com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanGoodsMaskView scanGoodsMaskView) {
        this.f37695a = scanGoodsMaskView;
    }

    @Override // km5.f
    public void a(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanGoodsMaskView", "showCustomView finish result: %b", (java.lang.Boolean) obj);
        com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanGoodsMaskView scanGoodsMaskView = this.f37695a;
        scanGoodsMaskView.E = true;
        android.widget.LinearLayout linearLayout = scanGoodsMaskView.I;
        if (linearLayout == null) {
            kotlin.jvm.internal.o.o("customTipsImageContainer");
            throw null;
        }
        linearLayout.setVisibility(0);
        android.widget.ImageView imageView = scanGoodsMaskView.F;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("customMaskView");
            throw null;
        }
        imageView.setVisibility(0);
        scanGoodsMaskView.Q = scanGoodsMaskView.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a9b);
        android.view.View view = scanGoodsMaskView.f159642y;
        if (view == null) {
            kotlin.jvm.internal.o.o("successMarkView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanGoodsMaskView$onSetCustomBackgroundSuccess$5", "onTerminate", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanGoodsMaskView$onSetCustomBackgroundSuccess$5", "onTerminate", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.ImageView imageView2 = scanGoodsMaskView.G;
        if (imageView2 != null) {
            scanGoodsMaskView.f159642y = imageView2;
        } else {
            kotlin.jvm.internal.o.o("customSuccessView");
            throw null;
        }
    }
}
