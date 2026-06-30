package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10331xedbf864d f145676d;

    public f(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10331xedbf864d activityC10331xedbf864d) {
        this.f145676d = activityC10331xedbf864d;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/ChatRoomOpenErrorInfoUI$setupView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f145676d.finish();
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/ChatRoomOpenErrorInfoUI$setupView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
