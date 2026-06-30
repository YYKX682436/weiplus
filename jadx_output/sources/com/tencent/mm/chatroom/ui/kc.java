package com.tencent.mm.chatroom.ui;

/* loaded from: classes14.dex */
public class kc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.lc f64283d;

    public kc(com.tencent.mm.chatroom.ui.lc lcVar) {
        this.f64283d = lcVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.chatroom.ui.lc lcVar = this.f64283d;
        lcVar.f64312d.f63965m.setVisibility(8);
        com.tencent.mm.chatroom.ui.SelectDateUI selectDateUI = lcVar.f64312d;
        com.tencent.mm.chatroom.ui.DayPickerView dayPickerView = selectDateUI.f63959d;
        long j17 = selectDateUI.f63962g;
        if (j17 == -1) {
            j17 = java.lang.System.currentTimeMillis() * 1000;
        }
        dayPickerView.setBeginDate(j17);
        com.tencent.mm.chatroom.ui.SelectDateUI selectDateUI2 = lcVar.f64312d;
        com.tencent.mm.chatroom.ui.DayPickerView dayPickerView2 = selectDateUI2.f63959d;
        java.util.Collection<kn.a> values = selectDateUI2.f63961f.values();
        dayPickerView2.f63741c2 = selectDateUI2;
        dayPickerView2.setUpAdapter(values);
        dayPickerView2.setAdapter(dayPickerView2.f63740b2);
        int itemCount = dayPickerView2.f63740b2.getItemCount() - 1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(itemCount));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(dayPickerView2, arrayList.toArray(), "com/tencent/mm/chatroom/ui/DayPickerView", "setController", "(Lcom/tencent/mm/chatroom/adapter/DatePickerController;Ljava/util/Collection;)V", "Undefined", "scrollToPosition", "(I)V");
        dayPickerView2.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(dayPickerView2, "com/tencent/mm/chatroom/ui/DayPickerView", "setController", "(Lcom/tencent/mm/chatroom/adapter/DatePickerController;Ljava/util/Collection;)V", "Undefined", "scrollToPosition", "(I)V");
        dayPickerView2.f63740b2.notifyDataSetChanged();
        if (lcVar.f64312d.f63961f.size() == 0) {
            lcVar.f64312d.f63964i.setVisibility(0);
            lcVar.f64312d.f63959d.setVisibility(8);
            lcVar.f64312d.f63965m.setVisibility(8);
            com.tencent.mm.chatroom.ui.SelectDateUI selectDateUI3 = lcVar.f64312d;
            selectDateUI3.f63964i.setText(selectDateUI3.getString(com.tencent.mm.R.string.b5e));
            return;
        }
        lcVar.f64312d.f63964i.setVisibility(8);
        lcVar.f64312d.f63959d.setVisibility(0);
        int[] T6 = lcVar.f64312d.T6();
        if (T6 == null) {
            int[] nowDate = lcVar.f64312d.f63959d.getNowDate();
            lcVar.f64312d.V6(nowDate[0], nowDate[1] + 1);
            lcVar.f64312d.f63965m.setVisibility(0);
        } else if (T6.length == 2) {
            lcVar.f64312d.V6(T6[0], T6[1]);
            lcVar.f64312d.f63965m.setVisibility(0);
        }
    }
}
