package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes3.dex */
public class wp implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f252865d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f252866e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.yp f252867f;

    public wp(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.yp ypVar, android.graphics.Bitmap bitmap, java.lang.String str) {
        this.f252867f = ypVar;
        this.f252865d = bitmap;
        this.f252866e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$4$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.yp ypVar = this.f252867f;
        android.widget.ImageView imageView = (android.widget.ImageView) ypVar.f253173d.findViewById(com.p314xaae8f345.mm.R.id.f569099p12);
        if (imageView != null) {
            imageView.setImageBitmap(this.f252865d);
            imageView.setVisibility(0);
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("android.intent.action.VIEW");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.i1.f(ypVar.f253173d.mo55332x76847179(), intent, new com.p314xaae8f345.mm.vfs.r6(this.f252866e), "video/*", false);
        try {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = ypVar.f253173d.mo55332x76847179();
            android.content.Intent createChooser = android.content.Intent.createChooser(intent, ypVar.f253173d.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cdy));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(createChooser);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(mo55332x76847179, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsSightPlayerUI$4$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            mo55332x76847179.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(mo55332x76847179, "com/tencent/mm/plugin/sns/ui/SnsSightPlayerUI$4$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsSightPlayerUI", "startActivity fail, activity not found");
            db5.e1.i(ypVar.f253173d.mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.cbm, com.p314xaae8f345.mm.R.C30867xcad56011.cbn);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$4$1");
    }
}
