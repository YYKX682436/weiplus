package com.tencent.mm.plugin.component.editor;

/* loaded from: classes12.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.component.editor.r f96619d;

    public p(com.tencent.mm.plugin.component.editor.r rVar) {
        this.f96619d = rVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.component.editor.EditorFileUI editorFileUI = this.f96619d.f96628a;
        int i17 = com.tencent.mm.plugin.component.editor.EditorFileUI.A;
        editorFileUI.V6();
    }
}
