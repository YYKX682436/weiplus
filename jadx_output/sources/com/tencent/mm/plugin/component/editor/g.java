package com.tencent.mm.plugin.component.editor;

/* loaded from: classes12.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.component.editor.h f96559d;

    public g(com.tencent.mm.plugin.component.editor.h hVar) {
        this.f96559d = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.component.editor.EditorFileUI editorFileUI = this.f96559d.f96566g;
        com.tencent.mm.ui.widget.snackbar.j.c(editorFileUI.getString(com.tencent.mm.R.string.f490553yc), null, editorFileUI, null, null);
    }
}
