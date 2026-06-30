package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes.dex */
public final class i7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f283369d;

    public i7(android.widget.FrameLayout frameLayout) {
        this.f283369d = frameLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/ChattingScheduleMsgFooterHandler$initFooter$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        c01.e2.n0("schedule_message");
        android.widget.FrameLayout frameLayout = this.f283369d;
        android.content.Intent intent = new android.content.Intent(frameLayout.getContext(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2732xa7e798a.ActivityC22473xe216760f.class);
        android.content.Context context = frameLayout.getContext();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/ui/chatting/ChattingScheduleMsgFooterHandler$initFooter$1$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/ui/chatting/ChattingScheduleMsgFooterHandler$initFooter$1$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        java.lang.String str = pj5.u.f436940a;
        if (str == null) {
            str = "";
        }
        ((cy1.a) rVar).Hj("future_reminder_btn", "view_clk", kz5.b1.e(new jz5.l("reminder_sessionid", str)), 35684);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/ChattingScheduleMsgFooterHandler$initFooter$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
