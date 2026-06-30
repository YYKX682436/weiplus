package com.tencent.mm.chatroom.ui;

/* loaded from: classes14.dex */
public class nc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.SelectDateUI f64397d;

    public nc(com.tencent.mm.chatroom.ui.SelectDateUI selectDateUI) {
        this.f64397d = selectDateUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/SelectDateUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.chatroom.ui.SelectDateUI selectDateUI = this.f64397d;
        int[] beginDate = selectDateUI.f63959d.getBeginDate();
        if (beginDate != null) {
            int[] nowDate = selectDateUI.f63959d.getNowDate();
            int[] T6 = selectDateUI.T6();
            int i17 = beginDate[0];
            int i18 = nowDate[0];
            if (i17 <= i18 && (i17 != i18 || beginDate[1] <= nowDate[1])) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                int i19 = nowDate[0];
                while (i19 >= beginDate[0]) {
                    arrayList2.add(java.lang.String.valueOf(i19));
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    int i27 = i19 == beginDate[0] ? beginDate[1] + 1 : 1;
                    for (int i28 = i19 == nowDate[0] ? nowDate[1] + 1 : 12; i28 >= i27; i28--) {
                        arrayList4.add(java.lang.String.valueOf(i28));
                    }
                    arrayList3.add(arrayList4);
                    i19--;
                }
                com.tencent.mm.ui.widget.picker.c0 c0Var = new com.tencent.mm.ui.widget.picker.c0(selectDateUI, arrayList2, arrayList3);
                c0Var.g(android.view.View.inflate(selectDateUI, com.tencent.mm.R.layout.f488701e44, null));
                int indexOf = arrayList2.indexOf(java.lang.String.valueOf(T6[0]));
                int indexOf2 = (indexOf < 0 || indexOf >= arrayList3.size() || arrayList3.get(indexOf) == null) ? -1 : ((java.util.List) arrayList3.get(indexOf)).indexOf(java.lang.String.valueOf(T6[1]));
                if (indexOf != -1 && indexOf2 != -1) {
                    c0Var.j(indexOf, indexOf2);
                } else if (indexOf != -1) {
                    c0Var.i(indexOf);
                }
                c0Var.f212259t = new com.tencent.mm.chatroom.ui.oc(selectDateUI, c0Var);
                c0Var.l();
            }
        }
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/SelectDateUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
