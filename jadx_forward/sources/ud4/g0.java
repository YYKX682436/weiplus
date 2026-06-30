package ud4;

/* loaded from: classes13.dex */
public class g0 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final int f508233d;

    /* renamed from: e, reason: collision with root package name */
    public final int f508234e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ud4.h0 f508235f;

    public g0(ud4.h0 h0Var, int i17, int i18) {
        this.f508235f = h0Var;
        this.f508233d = i17;
        this.f508234e = i18;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPreDraw", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$LSwitchCellAnimator$AnimateSwitchViewOnPreDrawListener");
        ud4.h0 h0Var = this.f508235f;
        h0Var.f508247c.getViewTreeObserver().removeOnPreDrawListener(this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1400", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$LSwitchCellAnimator");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1400", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$LSwitchCellAnimator");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8.C18379xb7ff44a.f251788y0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$712", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8.C18379xb7ff44a c18379xb7ff44a = h0Var.f508247c;
        c18379xb7ff44a.f251796m += h0Var.f508245a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$712", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1500", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$LSwitchCellAnimator");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1500", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$LSwitchCellAnimator");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$812", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        c18379xb7ff44a.f251797n += h0Var.f508246b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$812", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8.C18379xb7ff44a.c(c18379xb7ff44a, this.f508233d, this.f508234e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DynamicGridView", "id " + c18379xb7ff44a.n(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8.C18379xb7ff44a.b(c18379xb7ff44a)));
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8.C18379xb7ff44a.h(c18379xb7ff44a) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreDraw", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$LSwitchCellAnimator$AnimateSwitchViewOnPreDrawListener");
            return true;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8.C18379xb7ff44a.h(c18379xb7ff44a) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreDraw", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$LSwitchCellAnimator$AnimateSwitchViewOnPreDrawListener");
            return true;
        }
        android.view.View h17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8.C18379xb7ff44a.h(c18379xb7ff44a);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(h17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridView$LSwitchCellAnimator$AnimateSwitchViewOnPreDrawListener", "onPreDraw", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        h17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(h17, "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridView$LSwitchCellAnimator$AnimateSwitchViewOnPreDrawListener", "onPreDraw", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View o17 = c18379xb7ff44a.o(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8.C18379xb7ff44a.b(c18379xb7ff44a));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$902", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        c18379xb7ff44a.Q = o17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$902", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8.C18379xb7ff44a.h(c18379xb7ff44a) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreDraw", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$LSwitchCellAnimator$AnimateSwitchViewOnPreDrawListener");
            return true;
        }
        android.view.View h18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8.C18379xb7ff44a.h(c18379xb7ff44a);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(4);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(h18, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridView$LSwitchCellAnimator$AnimateSwitchViewOnPreDrawListener", "onPreDraw", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        h18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(h18, "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridView$LSwitchCellAnimator$AnimateSwitchViewOnPreDrawListener", "onPreDraw", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreDraw", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$LSwitchCellAnimator$AnimateSwitchViewOnPreDrawListener");
        return true;
    }
}
