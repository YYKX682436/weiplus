package com.tencent.mm.plugin.component.editor;

/* loaded from: classes12.dex */
public class f0 implements com.tencent.mm.ui.tools.p5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.component.editor.EditorImageUI f96557a;

    public f0(com.tencent.mm.plugin.component.editor.EditorImageUI editorImageUI) {
        this.f96557a = editorImageUI;
    }

    @Override // com.tencent.mm.ui.tools.p5
    public void a() {
        com.tencent.mm.plugin.component.editor.EditorImageUI editorImageUI = this.f96557a;
        if (editorImageUI.f96489r.f101302d == 1) {
            return;
        }
        c01.l2 c17 = c01.n2.d().c("basescanui@datacenter", true);
        c17.i("key_basescanui_screen_position", java.lang.Boolean.TRUE);
        c17.i("key_basescanui_screen_x", java.lang.Float.valueOf(editorImageUI.f96480f.getXDown()));
        c17.i("key_basescanui_screen_y", java.lang.Float.valueOf(editorImageUI.f96480f.getYDown()));
        int i17 = editorImageUI.f96489r.f101302d;
        if (i17 == 0 || i17 == 2) {
            editorImageUI.U6(com.tencent.mm.plugin.scanner.k1.c());
        } else {
            editorImageUI.U6(false);
        }
    }
}
