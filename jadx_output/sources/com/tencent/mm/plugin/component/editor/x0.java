package com.tencent.mm.plugin.component.editor;

/* loaded from: classes12.dex */
public class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f96661d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.component.editor.EditorUI f96662e;

    public x0(com.tencent.mm.plugin.component.editor.EditorUI editorUI, boolean z17) {
        this.f96662e = editorUI;
        this.f96661d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.component.editor.EditorUI editorUI = this.f96662e;
        boolean z17 = this.f96661d;
        if (z17 && !editorUI.f96509s) {
            editorUI.showVKB();
        } else if (z17 || !editorUI.f96509s) {
            return;
        } else {
            editorUI.hideVKB();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EditorActivityUI", "setVKBVisibility postDelayed setShow[%b]", java.lang.Boolean.valueOf(z17));
        editorUI.f96507q.postDelayed(new com.tencent.mm.plugin.component.editor.w0(this), 100L);
    }
}
