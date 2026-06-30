package com.tencent.mm.plugin.component.editor;

/* loaded from: classes12.dex */
public class s implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.component.editor.u f96631d;

    public s(com.tencent.mm.plugin.component.editor.u uVar) {
        this.f96631d = uVar;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.component.editor.u uVar = this.f96631d;
        g4Var.f(0, uVar.f96636d.getString(com.tencent.mm.R.string.ccw));
        com.tencent.mm.plugin.component.editor.EditorFileUI editorFileUI = uVar.f96636d;
        java.lang.String n17 = com.tencent.mm.vfs.w6.n(hx1.b.c(editorFileUI.f96470s));
        if (((d73.i) i95.n0.c(d73.i.class)).Qg() && editorFileUI.f96471t != null && com.tencent.mm.plugin.handoff.model.AbsHandOffFile.Companion.a(n17)) {
            g4Var.f(1, editorFileUI.getString(com.tencent.mm.R.string.cff));
        }
    }
}
