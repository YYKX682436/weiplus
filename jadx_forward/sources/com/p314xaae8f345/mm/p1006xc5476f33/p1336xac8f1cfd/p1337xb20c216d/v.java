package com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d;

/* loaded from: classes3.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f178171d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f178172e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.w f178173f;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.w wVar, android.graphics.Bitmap bitmap, java.lang.String str) {
        this.f178173f = wVar;
        this.f178171d = bitmap;
        this.f178172e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.w wVar = this.f178173f;
        android.widget.ImageView imageView = (android.widget.ImageView) wVar.f178175d.findViewById(com.p314xaae8f345.mm.R.id.f569099p12);
        imageView.setImageBitmap(this.f178171d);
        imageView.setVisibility(0);
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("android.intent.action.VIEW");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.i1.f(wVar.f178175d.mo55332x76847179(), intent, new com.p314xaae8f345.mm.vfs.r6(this.f178172e), "video/*", false);
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.ActivityC13154xb3ef6cfd activityC13154xb3ef6cfd = wVar.f178175d;
            android.content.Intent createChooser = android.content.Intent.createChooser(intent, activityC13154xb3ef6cfd.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cdy));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(createChooser);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activityC13154xb3ef6cfd, arrayList.toArray(), "com/tencent/mm/plugin/component/editor/EditorFileUI$8$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC13154xb3ef6cfd.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activityC13154xb3ef6cfd, "com/tencent/mm/plugin/component/editor/EditorFileUI$8$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EditorFileUI", "startActivity fail, activity not found");
            db5.e1.i(wVar.f178175d.mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.cbm, com.p314xaae8f345.mm.R.C30867xcad56011.cbn);
        }
    }
}
