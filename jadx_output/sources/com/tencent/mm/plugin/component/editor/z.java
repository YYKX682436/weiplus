package com.tencent.mm.plugin.component.editor;

/* loaded from: classes12.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f96664d;

    public z(com.tencent.mm.plugin.component.editor.EditorImageUI editorImageUI, android.app.Dialog dialog) {
        this.f96664d = dialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f96664d.dismiss();
    }
}
