package com.tencent.mm.chatroom.ui;

/* loaded from: classes12.dex */
public class cd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.dd f64092d;

    public cd(com.tencent.mm.chatroom.ui.dd ddVar) {
        this.f64092d = ddVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f64092d.f64119d.f64290m = false;
        android.view.View view = this.f64092d.f64119d.f64292o.f63974g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/chatroom/ui/SelectMemberUI$SelectMemberAdapter$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/chatroom/ui/SelectMemberUI$SelectMemberAdapter$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f64092d.f64119d.notifyDataSetChanged();
    }
}
