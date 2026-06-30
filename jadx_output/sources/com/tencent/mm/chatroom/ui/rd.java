package com.tencent.mm.chatroom.ui;

/* loaded from: classes12.dex */
public class rd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.sd f64487d;

    public rd(com.tencent.mm.chatroom.ui.sd sdVar) {
        this.f64487d = sdVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f64487d.f64515d.f64631i = false;
        android.view.View view = this.f64487d.f64515d.f64633n.f63990f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/chatroom/ui/SelectServiceNotifySenderUI$ServiceNotifyAdapter$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/chatroom/ui/SelectServiceNotifySenderUI$ServiceNotifyAdapter$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f64487d.f64515d.notifyDataSetChanged();
    }
}
