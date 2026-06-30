package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes12.dex */
public class ed implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.kd f145669d;

    public ed(com.p314xaae8f345.mm.p648x55baa833.ui.kd kdVar) {
        this.f145669d = kdVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p648x55baa833.ui.kd kdVar = this.f145669d;
        kdVar.notifyDataSetChanged();
        java.util.List list = kdVar.f145822i;
        if (list == null || list.size() != 0) {
            kdVar.f145825o.f145504d.setVisibility(0);
            android.view.View view = kdVar.f145825o.f145506f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/chatroom/ui/SelectMemberUI$SelectMemberAdapter$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/chatroom/ui/SelectMemberUI$SelectMemberAdapter$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        kdVar.f145825o.f145504d.setVisibility(8);
        android.view.View view2 = kdVar.f145825o.f145506f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/chatroom/ui/SelectMemberUI$SelectMemberAdapter$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/chatroom/ui/SelectMemberUI$SelectMemberAdapter$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
