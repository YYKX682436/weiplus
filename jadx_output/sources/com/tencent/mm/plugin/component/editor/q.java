package com.tencent.mm.plugin.component.editor;

/* loaded from: classes12.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.component.editor.r f96624d;

    public q(com.tencent.mm.plugin.component.editor.r rVar) {
        this.f96624d = rVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.component.editor.r rVar = this.f96624d;
        com.tencent.mm.plugin.component.editor.EditorFileUI editorFileUI = rVar.f96628a;
        int i17 = com.tencent.mm.plugin.component.editor.EditorFileUI.A;
        editorFileUI.W6();
        db5.e1.T(rVar.f96628a.getContext(), rVar.f96628a.getString(com.tencent.mm.R.string.brf));
    }
}
