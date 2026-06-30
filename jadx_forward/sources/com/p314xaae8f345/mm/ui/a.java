package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class a implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tm.a f278641d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f278642e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21337x7f9078ec f278643f;

    public a(com.p314xaae8f345.mm.ui.ActivityC21337x7f9078ec activityC21337x7f9078ec, tm.a aVar, android.content.Intent intent) {
        this.f278643f = activityC21337x7f9078ec;
        this.f278641d = aVar;
        this.f278642e = intent;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        tm.a aVar = this.f278641d;
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f501931a);
        com.p314xaae8f345.mm.ui.ActivityC21337x7f9078ec activityC21337x7f9078ec = this.f278643f;
        if (K0) {
            com.p314xaae8f345.mm.ui.ActivityC21337x7f9078ec activityC21337x7f9078ec2 = this.f278643f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(this.f278642e);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activityC21337x7f9078ec2, arrayList.toArray(), "com/tencent/mm/ui/AccountExpiredUI$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC21337x7f9078ec2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activityC21337x7f9078ec2, "com/tencent/mm/ui/AccountExpiredUI$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            db5.f.i(activityC21337x7f9078ec);
        } else {
            android.content.Intent intent = new android.content.Intent();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(aVar.f501931a);
            sb6.append("&wechat_real_lang=" + com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d());
            intent.putExtra("rawUrl", sb6.toString());
            intent.putExtra("showShare", false);
            intent.putExtra("show_bottom", false);
            intent.putExtra("needRedirect", false);
            intent.putExtra("neverGetA8Key", true);
            intent.putExtra("hardcode_jspermission", com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3.f273711h);
            intent.putExtra("hardcode_general_ctrl", com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e.f273708e);
            j45.l.j(activityC21337x7f9078ec, "webview", ".ui.tools.WebViewUI", intent, null);
            db5.f.i(activityC21337x7f9078ec);
        }
        activityC21337x7f9078ec.finish();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5180xccb1ebb1 c5180xccb1ebb1 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5180xccb1ebb1();
        c5180xccb1ebb1.f135526g.f88523a = true;
        c5180xccb1ebb1.e();
    }
}
