package com.tencent.mm.plugin.account.ui;

/* loaded from: classes5.dex */
public class rh implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.RegSetInfoUI f74174d;

    public rh(com.tencent.mm.plugin.account.ui.RegSetInfoUI regSetInfoUI) {
        this.f74174d = regSetInfoUI;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 6 && i17 != 5) {
            return false;
        }
        com.tencent.mm.plugin.account.ui.RegSetInfoUI.T6(this.f74174d);
        return true;
    }
}
