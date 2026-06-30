package com.tencent.mm.plugin.component.editor;

/* loaded from: classes12.dex */
public class q1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.component.editor.EditorUI f96627d;

    public q1(com.tencent.mm.plugin.component.editor.EditorUI editorUI) {
        this.f96627d = editorUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f96627d.f96498e.notifyDataSetChanged();
    }
}
