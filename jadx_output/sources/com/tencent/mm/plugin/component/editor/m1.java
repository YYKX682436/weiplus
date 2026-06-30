package com.tencent.mm.plugin.component.editor;

/* loaded from: classes12.dex */
public class m1 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.component.editor.EditorUI f96596d;

    public m1(com.tencent.mm.plugin.component.editor.EditorUI editorUI) {
        this.f96596d = editorUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.component.editor.EditorUI editorUI = this.f96596d;
        android.app.ProgressDialog progressDialog = editorUI.f96515y;
        if (progressDialog != null) {
            progressDialog.dismiss();
            editorUI.f96515y = null;
        }
    }
}
