package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui;

/* loaded from: classes3.dex */
public class j1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f236955d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f236956e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.k1 f236957f;

    public j1(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.k1 k1Var, android.graphics.Bitmap bitmap, java.lang.String str) {
        this.f236957f = k1Var;
        this.f236955d = bitmap;
        this.f236956e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.k1 k1Var = this.f236957f;
        android.widget.ImageView imageView = (android.widget.ImageView) k1Var.f236963d.findViewById(com.p314xaae8f345.mm.R.id.f569099p12);
        imageView.setImageBitmap(this.f236955d);
        imageView.setVisibility(0);
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("android.intent.action.VIEW");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.i1.f(k1Var.f236963d.mo55332x76847179(), intent, new com.p314xaae8f345.mm.vfs.r6(this.f236956e), "video/*", false);
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16969x3ace7680 activityC16969x3ace7680 = k1Var.f236963d;
            android.content.Intent createChooser = android.content.Intent.createChooser(intent, activityC16969x3ace7680.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cdy));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(createChooser);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activityC16969x3ace7680, arrayList.toArray(), "com/tencent/mm/plugin/record/ui/RecordMsgFileUI$7$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC16969x3ace7680.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activityC16969x3ace7680, "com/tencent/mm/plugin/record/ui/RecordMsgFileUI$7$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RecordMsgFileUI", "startActivity fail, activity not found");
            db5.e1.i(k1Var.f236963d.mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.cbm, com.p314xaae8f345.mm.R.C30867xcad56011.cbn);
        }
    }
}
