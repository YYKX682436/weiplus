package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class v4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2 f229058d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f229059e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ym5.w1 f229060f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f229061g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p653x55bb7a46.p655xac8f1cfd.C10389xffc30b0 f229062h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ym5.w1 f229063i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f229064m;

    public v4(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16367x1189c620 activityC16367x1189c620, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2 k2Var, com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b, ym5.w1 w1Var, com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2, com.p314xaae8f345.mm.p653x55bb7a46.p655xac8f1cfd.C10389xffc30b0 c10389xffc30b0, ym5.w1 w1Var2, p3325xe03a0797.p3326xc267989b.y0 y0Var) {
        this.f229058d = k2Var;
        this.f229059e = c22789xd23e9a9b;
        this.f229060f = w1Var;
        this.f229061g = c22789xd23e9a9b2;
        this.f229062h = c10389xffc30b0;
        this.f229063i = w1Var2;
        this.f229064m = y0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f229058d.dismiss();
        ym5.w1 w1Var = this.f229060f;
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f229059e;
        if (c22789xd23e9a9b != null && c22789xd23e9a9b.getVisibility() == 0) {
            c22789xd23e9a9b.n();
            c22789xd23e9a9b.i(w1Var);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2 = this.f229061g;
        if (c22789xd23e9a9b2 != null && c22789xd23e9a9b2.getVisibility() == 0) {
            c22789xd23e9a9b2.n();
            c22789xd23e9a9b2.i(w1Var);
        }
        com.p314xaae8f345.mm.p653x55bb7a46.p655xac8f1cfd.C10389xffc30b0 c10389xffc30b0 = this.f229062h;
        if (c10389xffc30b0 != null && c10389xffc30b0.getVisibility() == 0) {
            c10389xffc30b0.n();
            c10389xffc30b0.i(this.f229063i);
        }
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z1.f295574a.a(this.f229064m);
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
