package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class u1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f229012d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f229013e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d f229014f;

    public u1(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d activityC16363x8a0a619d) {
        this.f229014f = activityC16363x8a0a619d;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        if (c1163xf1deaba4.mo7946xf939df19().mo1894x7e414b06() == 0) {
            yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
            return;
        }
        if (i17 != 0) {
            this.f229012d = true;
        } else {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) c1163xf1deaba4.getLayoutManager();
            int y17 = c1162x665295de.y();
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d activityC16363x8a0a619d = this.f229014f;
            if (y17 == activityC16363x8a0a619d.T1.size() || c1162x665295de.y() == c1163xf1deaba4.mo7946xf939df19().mo1894x7e414b06() - 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.r4 r4Var = activityC16363x8a0a619d.f227505d;
                if (!((r4Var.f227111g.isEmpty() && r4Var.f227110f.isEmpty()) ? false : true)) {
                    activityC16363x8a0a619d.J1 = false;
                }
                if (activityC16363x8a0a619d.I1 && !activityC16363x8a0a619d.J1) {
                    activityC16363x8a0a619d.J1 = true;
                    activityC16363x8a0a619d.P = db5.e1.P(activityC16363x8a0a619d.mo55332x76847179(), null, 3, activityC16363x8a0a619d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.y1(activityC16363x8a0a619d));
                    if (activityC16363x8a0a619d.f227608l2 == 1) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyDetailUI", "do get hk recordlist");
                        wb3.a aVar = new wb3.a(activityC16363x8a0a619d.O1, activityC16363x8a0a619d.N1, 11, activityC16363x8a0a619d.M, 1, activityC16363x8a0a619d.getIntent().getIntExtra("key_hk_scene", 0));
                        activityC16363x8a0a619d.f227599h3 = aVar;
                        aVar.l().h(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.z1(activityC16363x8a0a619d)).f(activityC16363x8a0a619d);
                    } else {
                        if (activityC16363x8a0a619d.M > 0) {
                            java.util.LinkedList linkedList = (java.util.LinkedList) activityC16363x8a0a619d.R1;
                            if (linkedList.size() > 0 && linkedList.get(linkedList.size() - 1) != null) {
                                activityC16363x8a0a619d.m66165x5406100e(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.t(activityC16363x8a0a619d.f227611m2) ? new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.w5(activityC16363x8a0a619d.N1, 11, activityC16363x8a0a619d.M, activityC16363x8a0a619d.O1, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h5) linkedList.get(linkedList.size() - 1)).f226848g, 0L), "v1.0", activityC16363x8a0a619d.V1) : activityC16363x8a0a619d.f227602i3 == 3 ? new yb3.d(activityC16363x8a0a619d.N1, 11, activityC16363x8a0a619d.M, activityC16363x8a0a619d.O1, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h5) linkedList.get(linkedList.size() - 1)).f226848g, 0L), "v1.0", activityC16363x8a0a619d.V1, activityC16363x8a0a619d.f227604j3, activityC16363x8a0a619d.f227606k3, activityC16363x8a0a619d.f227624q2) : new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.v5(activityC16363x8a0a619d.N1, 11, activityC16363x8a0a619d.M, activityC16363x8a0a619d.O1, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h5) linkedList.get(linkedList.size() - 1)).f226848g, 0L), "v1.0", activityC16363x8a0a619d.V1), false);
                            }
                        }
                        activityC16363x8a0a619d.V1 = "";
                        activityC16363x8a0a619d.m66165x5406100e(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.t(activityC16363x8a0a619d.f227611m2) ? new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.w5(activityC16363x8a0a619d.N1, 11, activityC16363x8a0a619d.M, activityC16363x8a0a619d.O1, "v1.0", activityC16363x8a0a619d.V1) : activityC16363x8a0a619d.f227602i3 == 3 ? new yb3.d(activityC16363x8a0a619d.N1, 11, activityC16363x8a0a619d.M, activityC16363x8a0a619d.O1, "v1.0", activityC16363x8a0a619d.V1, activityC16363x8a0a619d.f227604j3, activityC16363x8a0a619d.f227606k3, activityC16363x8a0a619d.f227624q2) : new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.v5(activityC16363x8a0a619d.N1, 11, activityC16363x8a0a619d.M, activityC16363x8a0a619d.O1, "v1.0", activityC16363x8a0a619d.V1, ""), false);
                    }
                }
            }
            this.f229012d = false;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        if (c1163xf1deaba4.mo7946xf939df19().mo1894x7e414b06() == 0 || !this.f229012d) {
            yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) c1163xf1deaba4.getLayoutManager();
        boolean z17 = true;
        if (c1162x665295de.w() <= 0) {
            android.view.View mo7935xa188593e = c1162x665295de.mo7935xa188593e(c1162x665295de.w());
            if ((mo7935xa188593e != null ? 0 - mo7935xa188593e.getTop() : 0) <= 100) {
                z17 = false;
            }
        }
        if (this.f229013e != z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d activityC16363x8a0a619d = this.f229014f;
            if (z17) {
                activityC16363x8a0a619d.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563469c91);
                activityC16363x8a0a619d.getClass();
            } else {
                activityC16363x8a0a619d.getClass();
            }
            this.f229013e = z17;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
