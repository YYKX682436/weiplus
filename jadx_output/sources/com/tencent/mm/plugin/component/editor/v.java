package com.tencent.mm.plugin.component.editor;

/* loaded from: classes3.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f96638d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f96639e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.component.editor.w f96640f;

    public v(com.tencent.mm.plugin.component.editor.w wVar, android.graphics.Bitmap bitmap, java.lang.String str) {
        this.f96640f = wVar;
        this.f96638d = bitmap;
        this.f96639e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.component.editor.w wVar = this.f96640f;
        android.widget.ImageView imageView = (android.widget.ImageView) wVar.f96642d.findViewById(com.tencent.mm.R.id.f487566p12);
        imageView.setImageBitmap(this.f96638d);
        imageView.setVisibility(0);
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("android.intent.action.VIEW");
        com.tencent.mm.sdk.platformtools.i1.f(wVar.f96642d.getContext(), intent, new com.tencent.mm.vfs.r6(this.f96639e), "video/*", false);
        try {
            com.tencent.mm.plugin.component.editor.EditorFileUI editorFileUI = wVar.f96642d;
            android.content.Intent createChooser = android.content.Intent.createChooser(intent, editorFileUI.getString(com.tencent.mm.R.string.cdy));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(createChooser);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(editorFileUI, arrayList.toArray(), "com/tencent/mm/plugin/component/editor/EditorFileUI$8$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            editorFileUI.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(editorFileUI, "com/tencent/mm/plugin/component/editor/EditorFileUI$8$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.EditorFileUI", "startActivity fail, activity not found");
            db5.e1.i(wVar.f96642d.getContext(), com.tencent.mm.R.string.cbm, com.tencent.mm.R.string.cbn);
        }
    }
}
