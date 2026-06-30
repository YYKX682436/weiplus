package com.tencent.mm.plugin.component.editor;

/* loaded from: classes3.dex */
public class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.component.editor.EditorUI f96632d;

    public s0(com.tencent.mm.plugin.component.editor.EditorUI editorUI) {
        this.f96632d = editorUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.component.editor.EditorUI editorUI = this.f96632d;
        db5.e1.s(editorUI.getContext(), editorUI.getString(com.tencent.mm.R.string.jug), null);
    }
}
