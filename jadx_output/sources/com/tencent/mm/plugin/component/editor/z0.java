package com.tencent.mm.plugin.component.editor;

/* loaded from: classes12.dex */
public class z0 implements gh5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.component.editor.EditorUI f96665a;

    public z0(com.tencent.mm.plugin.component.editor.EditorUI editorUI) {
        this.f96665a = editorUI;
    }

    @Override // gh5.a
    public void c(boolean z17) {
        com.tencent.mm.plugin.component.editor.EditorUI editorUI = this.f96665a;
        editorUI.f96509s = editorUI.keyboardState() == 1;
        if (editorUI.f96509s) {
            editorUI.j7(1, 0L);
        }
        if (editorUI.f96504n) {
            editorUI.f96507q.postDelayed(new com.tencent.mm.plugin.component.editor.o0(this), 200L);
        }
    }
}
