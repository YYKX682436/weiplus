package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public class s1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19321x713255e3 f268362d;

    public s1(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19321x713255e3 activityC19321x713255e3) {
        this.f268362d = activityC19321x713255e3;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/SDKOAuthGetA8KeyUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19321x713255e3.f265222n;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19321x713255e3 activityC19321x713255e3 = this.f268362d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC19321x713255e3.f265228i;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        activityC19321x713255e3.f265228i = db5.e1.Q(activityC19321x713255e3, null, activityC19321x713255e3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.u1(activityC19321x713255e3));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOAuthGetA8KeyUI", "dealWithConfirm, start get a8 key, url = " + activityC19321x713255e3.f265223d);
        activityC19321x713255e3.f265227h = o45.cg.a();
        gm0.j1.d().g((com.p314xaae8f345.mm.p944x882e457a.m1) ((v60.u) ((w60.j) i95.n0.c(w60.j.class))).Ai(activityC19321x713255e3.f265223d, c01.z1.r(), 106, 0, activityC19321x713255e3.f265227h, new byte[0]));
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthGetA8KeyUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
