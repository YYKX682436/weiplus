package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public class zd implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21642xe60a98f f287823d;

    public zd(com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21642xe60a98f activityC21642xe60a98f) {
        this.f287823d = activityC21642xe60a98f;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/TextPreviewUI$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21642xe60a98f activityC21642xe60a98f = this.f287823d;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = activityC21642xe60a98f.f279872u;
        activityC21642xe60a98f.getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 p17 = c01.d9.b().p();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_POSITION_REMIND_MSG_TIP_IN_BOOLEAN;
        if (((java.lang.Boolean) p17.m(u3Var, java.lang.Boolean.TRUE)).booleanValue()) {
            db5.e1.t(activityC21642xe60a98f.mo55332x76847179(), activityC21642xe60a98f.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hy8), activityC21642xe60a98f.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hy9), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.wd(activityC21642xe60a98f, f9Var));
            c01.d9.b().p().x(u3Var, java.lang.Boolean.FALSE);
        } else {
            pj5.k.f436919a.d(activityC21642xe60a98f.mo55332x76847179(), f9Var, 1);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/TextPreviewUI$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
