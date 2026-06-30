package com.tencent.mm.plugin.component.editor;

/* loaded from: classes12.dex */
public class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.component.editor.x0 f96643d;

    public w0(com.tencent.mm.plugin.component.editor.x0 x0Var) {
        this.f96643d = x0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View currentFocus = this.f96643d.f96662e.getCurrentFocus();
        if (currentFocus != null) {
            currentFocus.requestFocusFromTouch();
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Boolean.valueOf(currentFocus != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.EditorActivityUI", "setVKBVisibility222 postDelayed requestFocusFromTouch[%s]", objArr);
    }
}
