package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes15.dex */
public final class q7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2 f284148d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21618x43234cfd f284149e;

    public q7(com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2 c10597xb1f0d2, com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21618x43234cfd activityC21618x43234cfd) {
        this.f284148d = c10597xb1f0d2;
        this.f284149e = activityC21618x43234cfd;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/ChattingSendDataToDeviceUI$DeviceConverter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2 c10597xb1f0d2 = this.f284148d;
        boolean z17 = c10597xb1f0d2.f148127o;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21618x43234cfd activityC21618x43234cfd = this.f284149e;
        if (z17 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c10597xb1f0d2.f148119d, activityC21618x43234cfd.Q1)) {
            activityC21618x43234cfd.X6();
        } else {
            activityC21618x43234cfd.W6(c10597xb1f0d2);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/ChattingSendDataToDeviceUI$DeviceConverter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
