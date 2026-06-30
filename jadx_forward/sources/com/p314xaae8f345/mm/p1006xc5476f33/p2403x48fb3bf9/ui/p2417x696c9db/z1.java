package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes15.dex */
public class z1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f269244d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19322x56482c27 f269245e;

    public z1(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19322x56482c27 activityC19322x56482c27, boolean z17, int i17, int i18) {
        this.f269245e = activityC19322x56482c27;
        this.f269244d = z17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/SDKOAuthOtherUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        hy4.b bVar = hy4.b.INSTANCE;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19322x56482c27 activityC19322x56482c27 = this.f269245e;
        bVar.a(activityC19322x56482c27.f265233g, activityC19322x56482c27.f265238o, 0, activityC19322x56482c27.f265241r, 4, 1, 0);
        if (this.f269244d) {
            activityC19322x56482c27.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOAuthOtherUI", "user disagree + but must agree => cancel");
            activityC19322x56482c27.f265230d.d(-4, activityC19322x56482c27.f265243t, activityC19322x56482c27.f265245v, activityC19322x56482c27.f265247x, activityC19322x56482c27.f265244u);
        } else {
            activityC19322x56482c27.T6(false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthOtherUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
