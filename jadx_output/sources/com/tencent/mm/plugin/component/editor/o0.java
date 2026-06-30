package com.tencent.mm.plugin.component.editor;

/* loaded from: classes12.dex */
public class o0 implements java.lang.Runnable {
    public o0(com.tencent.mm.plugin.component.editor.z0 z0Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.PopupWindow popupWindow = ox1.s.h().f349632r;
        ox1.s.h().x(popupWindow != null && popupWindow.isShowing());
        android.widget.PopupWindow popupWindow2 = ox1.s.h().f349635u;
        ox1.s.h().z(popupWindow2 != null && popupWindow2.isShowing());
    }
}
