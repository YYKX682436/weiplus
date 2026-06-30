package com.tencent.mm.plugin.component.editor;

/* loaded from: classes12.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f96660d;

    public x(com.tencent.mm.plugin.component.editor.EditorFileUI editorFileUI, android.app.Dialog dialog) {
        this.f96660d = dialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f96660d.dismiss();
    }
}
