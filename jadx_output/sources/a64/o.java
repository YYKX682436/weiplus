package a64;

/* loaded from: classes4.dex */
public final class o extends a64.e {

    /* renamed from: n, reason: collision with root package name */
    public final a64.m f1793n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f1793n = new a64.m(0, 0, 0, 0, 0, 0, 0, 0, 0, 511, null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreateAfter", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC");
        super.onCreateAfter(bundle);
        android.view.ViewTreeObserver viewTreeObserver = h().getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new a64.n(this));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateAfter", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC");
    }
}
