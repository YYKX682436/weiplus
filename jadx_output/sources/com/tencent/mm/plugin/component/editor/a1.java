package com.tencent.mm.plugin.component.editor;

/* loaded from: classes12.dex */
public class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.component.editor.EditorUI f96521d;

    public a1(com.tencent.mm.plugin.component.editor.EditorUI editorUI) {
        this.f96521d = editorUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText b17 = this.f96521d.f96503m.b();
        if (b17 != null) {
            b17.clearFocus();
        }
    }
}
