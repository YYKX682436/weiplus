package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes15.dex */
public final class v7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21618x43234cfd f284331d;

    public v7(com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21618x43234cfd activityC21618x43234cfd) {
        this.f284331d = activityC21618x43234cfd;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/ChattingSendDataToDeviceUI$backClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int id6 = view.getId();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21618x43234cfd activityC21618x43234cfd = this.f284331d;
        if (id6 == com.p314xaae8f345.mm.R.id.lsv) {
            android.view.ViewGroup viewGroup = activityC21618x43234cfd.f279765o;
            if (viewGroup == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sendingDeviceLayout");
                throw null;
            }
            if (viewGroup.getVisibility() == 0) {
                com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2 c10597xb1f0d2 = activityC21618x43234cfd.A1;
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c10597xb1f0d2 != null ? c10597xb1f0d2.f148125m : null, activityC21618x43234cfd.K1)) {
                    activityC21618x43234cfd.finish();
                    yj0.a.h(this, "com/tencent/mm/ui/chatting/ChattingSendDataToDeviceUI$backClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            }
        }
        activityC21618x43234cfd.onBackPressed();
        yj0.a.h(this, "com/tencent/mm/ui/chatting/ChattingSendDataToDeviceUI$backClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
