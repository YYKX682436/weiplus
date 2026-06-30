package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes8.dex */
public class w implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21601xaeea84d6 f287710d;

    public w(com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21601xaeea84d6 activityC21601xaeea84d6) {
        this.f287710d = activityC21601xaeea84d6;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/AppAttachNewDownloadUI$27", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21601xaeea84d6.Y1;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21601xaeea84d6 activityC21601xaeea84d6 = this.f287710d;
        if (!activityC21601xaeea84d6.t7()) {
            yj0.a.h(this, "com/tencent/mm/ui/chatting/AppAttachNewDownloadUI$27", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        jt.a0 a0Var = (jt.a0) i95.n0.c(jt.a0.class);
        java.lang.String str = activityC21601xaeea84d6.E;
        ((ht.s) a0Var).getClass();
        if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.t3.l(str)) {
            jt.v vVar = (jt.v) i95.n0.c(jt.v.class);
            java.lang.String str2 = activityC21601xaeea84d6.B;
            ((ht.a) vVar).getClass();
            if (!((java.util.ArrayList) com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f.f273145a).contains(str2)) {
                activityC21601xaeea84d6.v7(true);
                yj0.a.h(this, "com/tencent/mm/ui/chatting/AppAttachNewDownloadUI$27", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        }
        ((sy.x) ((ty.m0) i95.n0.c(ty.m0.class))).wi(java.lang.Integer.toString(hashCode()), activityC21601xaeea84d6.E, com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(activityC21601xaeea84d6.C), 7L, activityC21601xaeea84d6.g7(), activityC21601xaeea84d6.i5());
        activityC21601xaeea84d6.Q = true;
        ((jb0.g) ((jt.x) i95.n0.c(jt.x.class))).Ri(activityC21601xaeea84d6, 3, new yz5.a() { // from class: com.tencent.mm.ui.chatting.w$$a
            @Override // yz5.a
            /* renamed from: invoke */
            public final java.lang.Object mo152xb9724478() {
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.o2 o2Var;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.w wVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.w.this;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21601xaeea84d6 activityC21601xaeea84d62 = wVar.f287710d;
                if (!activityC21601xaeea84d62.J1 || (o2Var = activityC21601xaeea84d62.C1) == null) {
                    jt.v vVar2 = (jt.v) i95.n0.c(jt.v.class);
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21601xaeea84d6 activityC21601xaeea84d63 = wVar.f287710d;
                    ((ht.a) vVar2).Di(activityC21601xaeea84d63, activityC21601xaeea84d63.B, activityC21601xaeea84d63.C, activityC21601xaeea84d63.E, 1);
                } else {
                    ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.u0) o2Var).n(activityC21601xaeea84d62);
                }
                activityC21601xaeea84d62.z7(false);
                return null;
            }
        });
        yj0.a.h(this, "com/tencent/mm/ui/chatting/AppAttachNewDownloadUI$27", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
