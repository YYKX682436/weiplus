package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes8.dex */
public class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19366xa1004627 f266140d;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19366xa1004627 activityC19366xa1004627) {
        this.f266140d = activityC19366xa1004627;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/fts/BaseSOSWebViewUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19366xa1004627 activityC19366xa1004627 = this.f266140d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC19366xa1004627.f265779c4)) {
            activityC19366xa1004627.f265794s4.put("query", activityC19366xa1004627.N9());
        } else {
            activityC19366xa1004627.f265794s4.put("query", activityC19366xa1004627.f265779c4);
        }
        activityC19366xa1004627.f265794s4.put("exittype", "3");
        activityC19366xa1004627.na();
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/fts/BaseSOSWebViewUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
