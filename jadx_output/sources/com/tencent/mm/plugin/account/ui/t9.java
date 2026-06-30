package com.tencent.mm.plugin.account.ui;

/* loaded from: classes5.dex */
public final class t9 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.MMLoginVerifyPwdUI f74223d;

    public t9(com.tencent.mm.plugin.account.ui.MMLoginVerifyPwdUI mMLoginVerifyPwdUI) {
        this.f74223d = mMLoginVerifyPwdUI;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 5 && i17 != 6) {
            return false;
        }
        com.tencent.mm.plugin.account.ui.MMLoginVerifyPwdUI.Z6(this.f74223d);
        return true;
    }
}
