package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes11.dex */
public final class e8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21618x43234cfd f281998d;

    public e8(com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21618x43234cfd activityC21618x43234cfd) {
        this.f281998d = activityC21618x43234cfd;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/ChattingSendDataToDeviceUI$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21618x43234cfd activityC21618x43234cfd = this.f281998d;
        android.view.ViewGroup viewGroup = activityC21618x43234cfd.f279757e;
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("deviceMainLayout");
            throw null;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21618x43234cfd.c7(activityC21618x43234cfd, viewGroup, 0, 0L, 2, null);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21618x43234cfd activityC21618x43234cfd2 = this.f281998d;
        android.view.ViewGroup viewGroup2 = activityC21618x43234cfd2.f279764n;
        if (viewGroup2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("otherDeviceLayout");
            throw null;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21618x43234cfd.c7(activityC21618x43234cfd2, viewGroup2, 8, 0L, 2, null);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/ChattingSendDataToDeviceUI$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
