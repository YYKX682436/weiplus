package com.tencent.mm.plugin.component.editor;

/* loaded from: classes12.dex */
public class k0 implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.component.editor.EditorImageUI f96582d;

    public k0(com.tencent.mm.plugin.component.editor.EditorImageUI editorImageUI) {
        this.f96582d = editorImageUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public void onDismiss() {
        com.tencent.mm.plugin.component.editor.EditorImageUI editorImageUI = this.f96582d;
        editorImageUI.f96485n = null;
        ((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) editorImageUI.f96490s).n();
    }
}
