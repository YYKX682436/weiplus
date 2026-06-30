package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public class x0 implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19317xf99f3265 f269170a;

    public x0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19317xf99f3265 activityC19317xf99f3265) {
        this.f269170a = activityC19317xf99f3265;
    }

    @Override // db5.c1
    public void e(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19317xf99f3265 activityC19317xf99f3265 = this.f269170a;
        if (i17 == 0) {
            activityC19317xf99f3265.f265377p0.j0(null, 0);
            return;
        }
        if (i17 != 1) {
            return;
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(activityC19317xf99f3265.F7()));
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19317xf99f3265 activityC19317xf99f32652 = this.f269170a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC19317xf99f32652, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/QRCodeIntroductionWebViewUI$3", "onClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC19317xf99f32652.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC19317xf99f32652, "com/tencent/mm/plugin/webview/ui/tools/QRCodeIntroductionWebViewUI$3", "onClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
