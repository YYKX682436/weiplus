package a64;

/* loaded from: classes4.dex */
public class e extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public int f1758d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1759e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f1760f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1761g;

    /* renamed from: h, reason: collision with root package name */
    public int f1762h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f1763i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f1764m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f1758d = -1;
        this.f1760f = "";
        this.f1763i = jz5.h.b(new a64.d(this));
        this.f1764m = jz5.h.b(new a64.c(this));
    }

    public final boolean O6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCanScrollToTop", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBaseGeneralPageUIC");
        boolean z17 = this.f1761g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCanScrollToTop", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBaseGeneralPageUIC");
        return z17;
    }

    public final boolean P6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isHalfScreen", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBaseGeneralPageUIC");
        boolean z17 = this.f1759e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isHalfScreen", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBaseGeneralPageUIC");
        return z17;
    }

    public final android.view.View h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRoot", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBaseGeneralPageUIC");
        java.lang.Object value = ((jz5.n) this.f1763i).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        android.view.View view = (android.view.View) value;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRoot", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBaseGeneralPageUIC");
        return view;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBaseGeneralPageUIC");
        this.f1758d = getIntent().getIntExtra("click_action_type", -1);
        java.lang.String stringExtra = getIntent().getStringExtra("ad_uxInfo");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f1760f = stringExtra;
        boolean z17 = false;
        this.f1762h = getIntent().getIntExtra("ad_source", 0);
        boolean z18 = getIntent().getIntExtra(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_IS_HALF_SCREEN, 0) == 1;
        this.f1759e = z18;
        if (z18 && getIntent().getIntExtra("scroll_to_top", 0) == 1) {
            z17 = true;
        }
        this.f1761g = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBaseGeneralPageUIC");
    }
}
