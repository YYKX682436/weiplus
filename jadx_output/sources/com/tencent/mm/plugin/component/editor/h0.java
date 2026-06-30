package com.tencent.mm.plugin.component.editor;

/* loaded from: classes12.dex */
public class h0 implements kd0.n2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.component.editor.EditorImageUI f96567a;

    public h0(com.tencent.mm.plugin.component.editor.EditorImageUI editorImageUI) {
        this.f96567a = editorImageUI;
    }

    @Override // kd0.n2
    public void a() {
        com.tencent.mm.plugin.component.editor.EditorImageUI editorImageUI = this.f96567a;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = editorImageUI.f96485n;
        if (k0Var == null || !k0Var.i()) {
            return;
        }
        editorImageUI.U6(false);
    }
}
