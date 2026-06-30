package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes15.dex */
public class k3 implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13057x768a6365 f176581d;

    public k3(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13057x768a6365 activityC13057x768a6365) {
        this.f176581d = activityC13057x768a6365;
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
        yj0.a.b("com/tencent/mm/plugin/card/ui/CardNewMsgUI$4", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardNewMsgUI$4", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/CardNewMsgUI$4", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13057x768a6365 activityC13057x768a6365 = this.f176581d;
        if (!activityC13057x768a6365.f176432i) {
            yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardNewMsgUI$4", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
            return;
        }
        if (absListView.getLastVisiblePosition() != absListView.getCount() - 1) {
            yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardNewMsgUI$4", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
            return;
        }
        if (xt1.t0.Vi().f() > 0) {
            xt1.t0.Vi().f538051d.A("CardMsgInfo", " update CardMsgInfo set read_state = 0  where read_state = 1");
        } else {
            activityC13057x768a6365.f176428e.t();
        }
        activityC13057x768a6365.f176428e.f();
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardNewMsgUI$4", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
