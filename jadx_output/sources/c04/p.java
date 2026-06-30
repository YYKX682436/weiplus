package c04;

/* loaded from: classes13.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanGoodsMaskView f37686d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f37687e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanGoodsMaskView scanGoodsMaskView, boolean z17) {
        super(0);
        this.f37686d = scanGoodsMaskView;
        this.f37687e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanGoodsMaskView.A1;
        com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanGoodsMaskView scanGoodsMaskView = this.f37686d;
        com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanAnimationDotsView scanAnimationDotsView = scanGoodsMaskView.f159639x;
        if (scanAnimationDotsView == null) {
            kotlin.jvm.internal.o.o("animationDotsView");
            throw null;
        }
        scanAnimationDotsView.setVisibility(0);
        com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanAnimationDotsView scanAnimationDotsView2 = scanGoodsMaskView.f159639x;
        if (scanAnimationDotsView2 == null) {
            kotlin.jvm.internal.o.o("animationDotsView");
            throw null;
        }
        scanAnimationDotsView2.startAnimation();
        android.widget.ImageView imageView = scanGoodsMaskView.C;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("blurView");
            throw null;
        }
        imageView.setVisibility(8);
        android.widget.ImageView imageView2 = scanGoodsMaskView.C;
        if (imageView2 == null) {
            kotlin.jvm.internal.o.o("blurView");
            throw null;
        }
        imageView2.setImageBitmap(null);
        android.widget.ImageView imageView3 = scanGoodsMaskView.A;
        if (imageView3 == null) {
            kotlin.jvm.internal.o.o("bottomBlurView");
            throw null;
        }
        imageView3.setVisibility(8);
        android.widget.ImageView imageView4 = scanGoodsMaskView.A;
        if (imageView4 == null) {
            kotlin.jvm.internal.o.o("bottomBlurView");
            throw null;
        }
        imageView4.setImageBitmap(null);
        android.widget.ImageView imageView5 = scanGoodsMaskView.B;
        if (imageView5 == null) {
            kotlin.jvm.internal.o.o(com.tencent.mm.plugin.appbrand.jsapi.media.i6.NAME);
            throw null;
        }
        imageView5.setVisibility(8);
        android.widget.ImageView imageView6 = scanGoodsMaskView.B;
        if (imageView6 == null) {
            kotlin.jvm.internal.o.o(com.tencent.mm.plugin.appbrand.jsapi.media.i6.NAME);
            throw null;
        }
        imageView6.setImageBitmap(null);
        scanGoodsMaskView.u(!this.f37687e);
        android.view.View view = scanGoodsMaskView.f159645z;
        if (view == null) {
            kotlin.jvm.internal.o.o("maskView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanGoodsMaskView$onPreviewReady$callback$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanGoodsMaskView$onPreviewReady$callback$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = scanGoodsMaskView.f159642y;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("successMarkView");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanGoodsMaskView$onPreviewReady$callback$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanGoodsMaskView$onPreviewReady$callback$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = scanGoodsMaskView.D;
        if (view3 != null) {
            view3.setTranslationY(0.0f);
        }
        scanGoodsMaskView.R = false;
        scanGoodsMaskView.S = false;
        scanGoodsMaskView.T = false;
        scanGoodsMaskView.V = null;
        scanGoodsMaskView.x();
        return jz5.f0.f302826a;
    }
}
