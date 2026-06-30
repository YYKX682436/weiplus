package com.tencent.mm.plugin.account.ui;

/* loaded from: classes11.dex */
public class ee implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.MobileVerifyUI f73826d;

    public ee(com.tencent.mm.plugin.account.ui.MobileVerifyUI mobileVerifyUI) {
        this.f73826d = mobileVerifyUI;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 6 && i17 != 5) {
            return false;
        }
        int i18 = com.tencent.mm.plugin.account.ui.MobileVerifyUI.B;
        this.f73826d.U6();
        return true;
    }
}
