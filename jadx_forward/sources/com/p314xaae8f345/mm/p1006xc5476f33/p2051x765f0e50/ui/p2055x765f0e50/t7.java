package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes8.dex */
public final class t7 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public int f243098d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17414x34d8ac5f f243099e;

    public t7(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17414x34d8ac5f activityC17414x34d8ac5f) {
        this.f243099e = activityC17414x34d8ac5f;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsAuthUI$onCreate$3$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAuthUI$onCreate$3$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsAuthUI$onCreate$3$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17414x34d8ac5f activityC17414x34d8ac5f = this.f243099e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.l7 l7Var = activityC17414x34d8ac5f.f241868n;
        boolean z17 = false;
        if (l7Var != null && l7Var.x()) {
            z17 = true;
        }
        float f17 = 0.0f;
        if (z17) {
            activityC17414x34d8ac5f.m78519xb1736e47().setAlpha(0.0f);
            yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAuthUI$onCreate$3$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
            return;
        }
        int i19 = this.f243098d + i18;
        this.f243098d = i19;
        if (i19 >= activityC17414x34d8ac5f.f241864g) {
            f17 = i19 > activityC17414x34d8ac5f.f241865h ? 1.0f : ((i19 - r9) * 1.0f) / (r4 - r9);
        }
        activityC17414x34d8ac5f.m78519xb1736e47().setAlpha(f17);
        java.lang.Integer num = activityC17414x34d8ac5f.f241870p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
        activityC17414x34d8ac5f.mo64405x4dab7448(com.p314xaae8f345.mm.ui.uk.a(num.intValue(), (int) (f17 * 100)));
        com.p314xaae8f345.mm.ui.ga mo78514x143f1b92 = activityC17414x34d8ac5f.mo78514x143f1b92();
        java.lang.Integer num2 = activityC17414x34d8ac5f.f241870p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num2);
        mo78514x143f1b92.G0(num2.intValue());
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAuthUI$onCreate$3$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
