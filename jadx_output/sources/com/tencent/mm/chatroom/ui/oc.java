package com.tencent.mm.chatroom.ui;

/* loaded from: classes14.dex */
public class oc implements com.tencent.mm.ui.widget.picker.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.picker.c0 f64414a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.SelectDateUI f64415b;

    public oc(com.tencent.mm.chatroom.ui.SelectDateUI selectDateUI, com.tencent.mm.ui.widget.picker.c0 c0Var) {
        this.f64415b = selectDateUI;
        this.f64414a = c0Var;
    }

    @Override // com.tencent.mm.ui.widget.picker.a0
    public void onResult(boolean z17, java.lang.Object obj, java.lang.Object obj2) {
        if ((obj instanceof java.lang.String) && (obj2 instanceof java.lang.String)) {
            int parseInt = java.lang.Integer.parseInt((java.lang.String) obj);
            int parseInt2 = java.lang.Integer.parseInt((java.lang.String) obj2) - 1;
            com.tencent.mm.chatroom.ui.SelectDateUI selectDateUI = this.f64415b;
            gn.d dVar = selectDateUI.f63959d.f63740b2;
            int intValue = (((parseInt - dVar.f273566g.get(1)) * 12) + parseInt2) - dVar.f273569m.intValue();
            if (intValue < 0) {
                intValue = 0;
            }
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) selectDateUI.f63959d.getLayoutManager();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            arrayList.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(linearLayoutManager, arrayList.toArray(), "com/tencent/mm/chatroom/ui/SelectDateUI", "scrollToYearAndMonth", "(II)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            linearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(linearLayoutManager, "com/tencent/mm/chatroom/ui/SelectDateUI", "scrollToYearAndMonth", "(II)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
        this.f64414a.d();
    }
}
