package com.tencent.mm.chatroom.ui;

/* loaded from: classes12.dex */
public class ed implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.kd f64136d;

    public ed(com.tencent.mm.chatroom.ui.kd kdVar) {
        this.f64136d = kdVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.chatroom.ui.kd kdVar = this.f64136d;
        kdVar.notifyDataSetChanged();
        java.util.List list = kdVar.f64289i;
        if (list == null || list.size() != 0) {
            kdVar.f64292o.f63971d.setVisibility(0);
            android.view.View view = kdVar.f64292o.f63973f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/chatroom/ui/SelectMemberUI$SelectMemberAdapter$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/chatroom/ui/SelectMemberUI$SelectMemberAdapter$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        kdVar.f64292o.f63971d.setVisibility(8);
        android.view.View view2 = kdVar.f64292o.f63973f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/chatroom/ui/SelectMemberUI$SelectMemberAdapter$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/chatroom/ui/SelectMemberUI$SelectMemberAdapter$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
