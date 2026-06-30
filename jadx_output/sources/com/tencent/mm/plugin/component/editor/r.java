package com.tencent.mm.plugin.component.editor;

/* loaded from: classes12.dex */
public class r implements com.tencent.mm.plugin.component.editor.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.component.editor.EditorFileUI f96628a;

    public r(com.tencent.mm.plugin.component.editor.EditorFileUI editorFileUI) {
        this.f96628a = editorFileUI;
    }

    @Override // com.tencent.mm.plugin.component.editor.e
    public void a(com.tencent.mm.plugin.component.editor.c cVar, com.tencent.mm.plugin.component.editor.b bVar) {
        com.tencent.mm.plugin.component.editor.EditorFileUI editorFileUI = this.f96628a;
        if (editorFileUI.f96470s.T.equals(cVar.f96536b)) {
            if (bVar == com.tencent.mm.plugin.component.editor.b.SUCC) {
                editorFileUI.f96469r.post(new com.tencent.mm.plugin.component.editor.o(this));
                return;
            }
            if (bVar == com.tencent.mm.plugin.component.editor.b.OUT_OF_DATE) {
                editorFileUI.f96469r.post(new com.tencent.mm.plugin.component.editor.p(this));
                return;
            }
            if (bVar == com.tencent.mm.plugin.component.editor.b.ERR) {
                editorFileUI.f96469r.post(new com.tencent.mm.plugin.component.editor.q(this));
                return;
            }
            editorFileUI.getClass();
            editorFileUI.f96469r.post(new com.tencent.mm.plugin.component.editor.i(editorFileUI, (int) ((((float) cVar.f96541g) / ((float) java.lang.Math.max(1L, cVar.f96540f))) * 100.0f), cVar.f96541g, cVar.f96540f));
        }
    }
}
