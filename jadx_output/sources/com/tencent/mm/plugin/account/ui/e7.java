package com.tencent.mm.plugin.account.ui;

/* loaded from: classes5.dex */
public class e7 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginUI f73819d;

    public e7(com.tencent.mm.plugin.account.ui.LoginUI loginUI) {
        this.f73819d = loginUI;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 6 && i17 != 5) {
            return false;
        }
        int i18 = com.tencent.mm.plugin.account.ui.LoginUI.K;
        this.f73819d.V6();
        return true;
    }
}
