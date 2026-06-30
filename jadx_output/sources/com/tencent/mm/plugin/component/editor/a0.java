package com.tencent.mm.plugin.component.editor;

/* loaded from: classes12.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.component.editor.b0 f96520d;

    public a0(com.tencent.mm.plugin.component.editor.b0 b0Var) {
        this.f96520d = b0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.component.editor.EditorImageUI editorImageUI = this.f96520d.f96533g;
        com.tencent.mm.ui.widget.snackbar.j.c(editorImageUI.getString(com.tencent.mm.R.string.f490553yc), null, editorImageUI, null, null);
    }
}
