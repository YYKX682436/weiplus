package com.tencent.mm.plugin.component.editor;

/* loaded from: classes12.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.component.editor.EditorImageUI f96547d;

    public c0(com.tencent.mm.plugin.component.editor.EditorImageUI editorImageUI) {
        this.f96547d = editorImageUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f96547d.f96481g.notifyDataSetChanged();
    }
}
