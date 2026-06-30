package com.tencent.mm.plugin.component.editor;

/* loaded from: classes12.dex */
public class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.component.editor.EditorUI f96629d;

    public r0(com.tencent.mm.plugin.component.editor.EditorUI editorUI) {
        this.f96629d = editorUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.component.editor.EditorUI editorUI = this.f96629d;
        android.app.ProgressDialog progressDialog = editorUI.f96515y;
        if (progressDialog != null) {
            progressDialog.dismiss();
            editorUI.f96515y = null;
        }
    }
}
