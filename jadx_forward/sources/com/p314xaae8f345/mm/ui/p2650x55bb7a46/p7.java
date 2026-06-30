package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes11.dex */
public final class p7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21617x40566a2b f283618d;

    public p7(com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21617x40566a2b activityC21617x40566a2b) {
        this.f283618d = activityC21617x40566a2b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/ChattingSendDataToDeviceForOpenMsgUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f283618d.finish();
        yj0.a.h(this, "com/tencent/mm/ui/chatting/ChattingSendDataToDeviceForOpenMsgUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
