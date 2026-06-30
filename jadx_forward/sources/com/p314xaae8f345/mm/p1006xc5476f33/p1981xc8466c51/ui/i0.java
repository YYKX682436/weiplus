package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui;

/* loaded from: classes4.dex */
public class i0 implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.AbstractActivityC16965x338d8695 f236951d;

    public i0(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.AbstractActivityC16965x338d8695 abstractActivityC16965x338d8695) {
        this.f236951d = abstractActivityC16965x338d8695;
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
        yj0.a.b("com/tencent/mm/plugin/record/ui/RecordMsgBaseUI$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.AbstractActivityC16965x338d8695 abstractActivityC16965x338d8695 = this.f236951d;
        if (i17 == 0) {
            android.view.View childAt = abstractActivityC16965x338d8695.f236799m.getChildAt(0);
            if ((childAt != null ? childAt.getTop() : 0) == 0) {
                abstractActivityC16965x338d8695.mo78530x8b45058f();
                yj0.a.h(this, "com/tencent/mm/plugin/record/ui/RecordMsgBaseUI$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
                return;
            }
        }
        abstractActivityC16965x338d8695.m78599xdf056fb4();
        yj0.a.h(this, "com/tencent/mm/plugin/record/ui/RecordMsgBaseUI$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/record/ui/RecordMsgBaseUI$2", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        if (i17 == 0) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6182x843a430c c6182x843a430c = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6182x843a430c();
            am.mz mzVar = c6182x843a430c.f136440g;
            mzVar.f88911a = 5;
            com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.AbstractActivityC16965x338d8695 abstractActivityC16965x338d8695 = this.f236951d;
            mzVar.f88912b = abstractActivityC16965x338d8695.f236799m.getFirstVisiblePosition();
            mzVar.f88913c = abstractActivityC16965x338d8695.f236799m.getLastVisiblePosition();
            mzVar.f88914d = abstractActivityC16965x338d8695.f236799m.getHeaderViewsCount();
            c6182x843a430c.e();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/record/ui/RecordMsgBaseUI$2", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
