package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class w implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public boolean f229158d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f229159e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16359x81eae2a6 f229160f;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16359x81eae2a6 activityC16359x81eae2a6) {
        this.f229160f = activityC16359x81eae2a6;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        if (i19 == 0 || !this.f229158d) {
            yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
            return;
        }
        boolean z17 = true;
        if (i17 <= 0) {
            android.view.View childAt = absListView.getChildAt(i17);
            if ((childAt != null ? 0 - childAt.getTop() : 0) <= 100) {
                z17 = false;
            }
        }
        if (this.f229159e != z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16359x81eae2a6 activityC16359x81eae2a6 = this.f229160f;
            if (z17) {
                activityC16359x81eae2a6.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563469c91);
                activityC16359x81eae2a6.getClass();
            } else {
                activityC16359x81eae2a6.getClass();
            }
            this.f229159e = z17;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        if (absListView.getCount() == 0) {
            yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
            return;
        }
        boolean z17 = true;
        if (i17 == 0) {
            if (absListView.getLastVisiblePosition() == absListView.getCount() - 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16359x81eae2a6 activityC16359x81eae2a6 = this.f229160f;
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.r4 r4Var = activityC16359x81eae2a6.f227505d;
                if (r4Var.f227111g.isEmpty() && r4Var.f227110f.isEmpty()) {
                    z17 = false;
                }
                if (!z17) {
                    activityC16359x81eae2a6.A = false;
                }
                if (activityC16359x81eae2a6.f227537z && !activityC16359x81eae2a6.A) {
                    activityC16359x81eae2a6.W6();
                }
            }
            this.f229158d = false;
        } else if (i17 == 1) {
            this.f229158d = true;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
