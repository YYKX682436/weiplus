package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes12.dex */
public class rd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.sd f146020d;

    public rd(com.p314xaae8f345.mm.p648x55baa833.ui.sd sdVar) {
        this.f146020d = sdVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f146020d.f146048d.f146164i = false;
        android.view.View view = this.f146020d.f146048d.f146166n.f145523f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/chatroom/ui/SelectServiceNotifySenderUI$ServiceNotifyAdapter$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/chatroom/ui/SelectServiceNotifySenderUI$ServiceNotifyAdapter$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f146020d.f146048d.notifyDataSetChanged();
    }
}
