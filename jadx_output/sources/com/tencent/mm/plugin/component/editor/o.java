package com.tencent.mm.plugin.component.editor;

/* loaded from: classes12.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.component.editor.r f96617d;

    public o(com.tencent.mm.plugin.component.editor.r rVar) {
        this.f96617d = rVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.component.editor.r rVar = this.f96617d;
        rVar.f96628a.enableOptionMenu(true);
        com.tencent.mm.plugin.component.editor.EditorFileUI editorFileUI = rVar.f96628a;
        int i17 = com.tencent.mm.plugin.component.editor.EditorFileUI.A;
        editorFileUI.U6();
    }
}
