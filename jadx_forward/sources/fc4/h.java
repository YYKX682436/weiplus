package fc4;

/* loaded from: classes4.dex */
public final class h extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public float f342692d;

    /* renamed from: e, reason: collision with root package name */
    public float f342693e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f342694f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f342692d = -1.0f;
        this.f342693e = -1.0f;
        this.f342694f = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_hdr_high_light, false);
    }

    public final void O6(float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAppScreenBrightness", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleBrightnessUIC");
        if (this.f342693e <= this.f342692d) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAppScreenBrightness", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleBrightnessUIC");
            return;
        }
        android.view.Window window = m80379x76847179().getWindow();
        android.view.WindowManager.LayoutParams attributes = window.getAttributes();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(attributes, "getAttributes(...)");
        float f18 = this.f342692d;
        float f19 = f18 + ((this.f342693e - f18) * f17);
        attributes.screenBrightness = f19 > 0.0f ? f19 / 255.0f : -1.0f;
        window.setAttributes(attributes);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAppScreenBrightness", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleBrightnessUIC");
    }
}
