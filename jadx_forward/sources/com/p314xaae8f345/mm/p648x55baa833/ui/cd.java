package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes12.dex */
public class cd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.dd f145625d;

    public cd(com.p314xaae8f345.mm.p648x55baa833.ui.dd ddVar) {
        this.f145625d = ddVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f145625d.f145652d.f145823m = false;
        android.view.View view = this.f145625d.f145652d.f145825o.f145507g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/chatroom/ui/SelectMemberUI$SelectMemberAdapter$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/chatroom/ui/SelectMemberUI$SelectMemberAdapter$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f145625d.f145652d.notifyDataSetChanged();
    }
}
