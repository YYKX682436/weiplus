package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes11.dex */
public class d2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.xv5 f265624d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19323xcd93a211 f265625e;

    public d2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19323xcd93a211 activityC19323xcd93a211, r45.xv5 xv5Var) {
        this.f265625e = activityC19323xcd93a211;
        this.f265624d = xv5Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SdkOAuthUI", "fillNewOauthPage click CreateAvatar");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19323xcd93a211 activityC19323xcd93a211 = this.f265625e;
        android.content.Intent intent = new android.content.Intent(activityC19323xcd93a211, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19307x65cbeee9.class);
        intent.putExtra("0", activityC19323xcd93a211.f265251d);
        intent.putExtra("default_fileid", activityC19323xcd93a211.f265268x);
        r45.xv5 xv5Var = this.f265624d;
        r45.qx4 qx4Var = xv5Var.f472064y;
        if (qx4Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qx4Var.f465869e)) {
            intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, xv5Var.f472064y.f465869e);
        }
        activityC19323xcd93a211.startActivityForResult(intent, 6);
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
