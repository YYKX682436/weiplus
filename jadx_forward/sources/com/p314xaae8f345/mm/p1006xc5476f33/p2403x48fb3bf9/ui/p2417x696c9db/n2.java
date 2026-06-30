package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes11.dex */
public class n2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.px4 f267384d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.xv5 f267385e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19323xcd93a211 f267386f;

    public n2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19323xcd93a211 activityC19323xcd93a211, r45.px4 px4Var, r45.xv5 xv5Var) {
        this.f267386f = activityC19323xcd93a211;
        this.f267384d = px4Var;
        this.f267385e = xv5Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SdkOAuthUI", "fillNewOauthPage click disagreeBtn");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19323xcd93a211.T6(this.f267386f, this.f267384d, this.f267385e, false);
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
