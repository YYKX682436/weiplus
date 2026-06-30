package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

/* loaded from: classes.dex */
public final class q0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18571x56e85567 f254642d;

    public q0(com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18571x56e85567 activityC18571x56e85567) {
        this.f254642d = activityC18571x56e85567;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/teenmode/ui/BindGuardianMsgUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18571x56e85567.f254349q;
        com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18571x56e85567 activityC18571x56e85567 = this.f254642d;
        activityC18571x56e85567.getClass();
        if (activityC18571x56e85567 != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", "https://help.wechat.com/cgi-bin/newreadtemplate?t=help_center/feedback_form&plat=&Channel=TeenExpired");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() || !gm0.j1.a()) {
                intent.putExtra("neverGetA8Key", true);
            }
            j45.l.j(activityC18571x56e85567, "webview", ".ui.tools.WebViewUI", intent, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/teenmode/ui/BindGuardianMsgUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
