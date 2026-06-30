package com.tencent.mm.chatroom.ui;

/* loaded from: classes14.dex */
public class g2 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.DayPickerView f64172d;

    public g2(com.tencent.mm.chatroom.ui.DayPickerView dayPickerView) {
        this.f64172d = dayPickerView;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/DayPickerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/DayPickerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/DayPickerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        if (((com.tencent.mm.chatroom.ui.le) recyclerView.getChildAt(0)) == null) {
            yj0.a.h(this, "com/tencent/mm/chatroom/ui/DayPickerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
            return;
        }
        com.tencent.mm.chatroom.ui.DayPickerView dayPickerView = this.f64172d;
        dayPickerView.getClass();
        dayPickerView.getClass();
        dayPickerView.getClass();
        com.tencent.mm.chatroom.ui.h2 h2Var = dayPickerView.f63745g2;
        if (h2Var != null) {
            com.tencent.mm.chatroom.ui.jc jcVar = (com.tencent.mm.chatroom.ui.jc) h2Var;
            jcVar.getClass();
            int i19 = com.tencent.mm.chatroom.ui.SelectDateUI.f63958o;
            com.tencent.mm.chatroom.ui.SelectDateUI selectDateUI = jcVar.f64259a;
            int[] T6 = selectDateUI.T6();
            if (T6 == null) {
                int[] nowDate = selectDateUI.f63959d.getNowDate();
                if (nowDate != null) {
                    selectDateUI.V6(nowDate[0], nowDate[1] + 1);
                    selectDateUI.f63965m.setVisibility(0);
                } else {
                    selectDateUI.f63965m.setVisibility(8);
                }
            } else if (T6.length == 2) {
                selectDateUI.V6(T6[0], T6[1]);
                selectDateUI.f63965m.setVisibility(0);
            }
        }
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/DayPickerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
