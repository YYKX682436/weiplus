package com.tencent.mm.plugin.component.editor;

/* loaded from: classes12.dex */
public class i1 implements com.tencent.mm.plugin.component.editor.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.component.editor.EditorUI f96574a;

    public i1(com.tencent.mm.plugin.component.editor.EditorUI editorUI) {
        this.f96574a = editorUI;
    }

    @Override // com.tencent.mm.plugin.component.editor.e
    public void a(com.tencent.mm.plugin.component.editor.c cVar, com.tencent.mm.plugin.component.editor.b bVar) {
        r45.gp0 gp0Var;
        java.lang.String str;
        com.tencent.mm.plugin.component.editor.b bVar2 = com.tencent.mm.plugin.component.editor.b.SUCC;
        com.tencent.mm.plugin.component.editor.EditorUI editorUI = this.f96574a;
        if (bVar == bVar2) {
            editorUI.f96507q.post(new com.tencent.mm.plugin.component.editor.g1(this, cVar));
        }
        if (cVar != null && (gp0Var = cVar.f96535a) != null && (str = gp0Var.P1) != null && str.equals("WeNoteHtmlFile")) {
            int i17 = com.tencent.mm.plugin.component.editor.EditorUI.f96496J;
            editorUI.a7();
        }
        if (bVar == com.tencent.mm.plugin.component.editor.b.ERR) {
            editorUI.U6();
            android.app.ProgressDialog progressDialog = editorUI.f96515y;
            if (progressDialog != null) {
                progressDialog.dismiss();
                editorUI.f96515y = null;
            }
            if (cVar.f96544j) {
                editorUI.f96507q.post(new com.tencent.mm.plugin.component.editor.h1(this));
            }
        }
    }
}
