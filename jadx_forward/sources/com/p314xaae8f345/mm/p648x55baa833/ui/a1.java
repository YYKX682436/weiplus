package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes11.dex */
public class a1 implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5 f145556d;

    public a1(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5 activityC10332x8a1129f5) {
        this.f145556d = activityC10332x8a1129f5;
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
        yj0.a.b("com/tencent/mm/chatroom/ui/ChatroomInfoUI$9", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        int i27 = i17 + i18;
        boolean z17 = com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5.Y;
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5 activityC10332x8a1129f5 = this.f145556d;
        android.view.View findViewById = activityC10332x8a1129f5.m79335xcc101dd9().findViewById(com.p314xaae8f345.mm.R.id.suy);
        if (findViewById == null) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f3 = activityC10332x8a1129f5.f145234s;
            if (c19662x4f7a67f3 != null) {
                if (i27 <= ((r35.u1) c19662x4f7a67f3.M).f450805d.size()) {
                    activityC10332x8a1129f5.q7();
                } else {
                    activityC10332x8a1129f5.l7();
                }
            }
        } else if (i27 > activityC10332x8a1129f5.m79335xcc101dd9().getPositionForView(findViewById)) {
            int[] iArr = new int[2];
            findViewById.getLocationOnScreen(iArr);
            if ((iArr[1] + findViewById.getHeight()) - com.p314xaae8f345.mm.ui.bl.h(activityC10332x8a1129f5) <= i65.a.k(activityC10332x8a1129f5)) {
                activityC10332x8a1129f5.l7();
            } else {
                activityC10332x8a1129f5.q7();
            }
        } else {
            activityC10332x8a1129f5.l7();
        }
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/ChatroomInfoUI$9", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/ChatroomInfoUI$9", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/ChatroomInfoUI$9", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
