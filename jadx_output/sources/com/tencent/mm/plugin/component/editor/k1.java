package com.tencent.mm.plugin.component.editor;

/* loaded from: classes12.dex */
public class k1 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.component.editor.EditorUI f96583d;

    public k1(com.tencent.mm.plugin.component.editor.EditorUI editorUI) {
        this.f96583d = editorUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.component.editor.EditorUI editorUI = this.f96583d;
        android.app.ProgressDialog progressDialog = editorUI.f96515y;
        if (progressDialog != null) {
            progressDialog.dismiss();
            editorUI.f96515y = null;
        }
    }
}
