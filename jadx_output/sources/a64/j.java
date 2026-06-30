package a64;

/* loaded from: classes4.dex */
public class j extends a64.e {

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f1769n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f1770o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f1771p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f1772q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f1769n = jz5.h.b(new a64.g(this));
        this.f1770o = jz5.h.b(new a64.i(this));
        this.f1771p = jz5.h.b(new a64.h(this));
        this.f1772q = jz5.h.b(new a64.f(this));
    }

    public final android.widget.FrameLayout Q6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBottomComponent", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBottomComponentUIC");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ((jz5.n) this.f1772q).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBottomComponent", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBottomComponentUIC");
        return frameLayout;
    }

    public final com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout R6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBottomContainer", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBottomComponentUIC");
        com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout halfScreenScrollableFrameLayout = (com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout) ((jz5.n) this.f1769n).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBottomContainer", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBottomComponentUIC");
        return halfScreenScrollableFrameLayout;
    }
}
