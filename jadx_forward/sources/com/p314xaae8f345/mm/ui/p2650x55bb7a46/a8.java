package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public final class a8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21618x43234cfd f279900d;

    public a8(com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21618x43234cfd activityC21618x43234cfd) {
        this.f279900d = activityC21618x43234cfd;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/ChattingSendDataToDeviceUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        l81.b1 b1Var = new l81.b1();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21618x43234cfd activityC21618x43234cfd = this.f279900d;
        r45.fu5 fu5Var = activityC21618x43234cfd.f279768p1;
        b1Var.f398547b = fu5Var != null ? fu5Var.f456134e : null;
        b1Var.f398555f = fu5Var != null ? fu5Var.f456135f : null;
        try {
            r45.fu5 fu5Var2 = activityC21618x43234cfd.f279768p1;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(fu5Var2);
            b1Var.f398561i = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.z7(new org.json.JSONObject(fu5Var2.f456136g));
        } catch (org.json.JSONException unused) {
        }
        b1Var.f398551d = 0;
        b1Var.f398549c = 2;
        b1Var.f398565k = 1226;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(activityC21618x43234cfd.mo55332x76847179(), b1Var);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/ChattingSendDataToDeviceUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
