package com.tencent.mm.plugin.account.ui;

/* loaded from: classes8.dex */
public class a6 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginIndepPass f73711d;

    public a6(com.tencent.mm.plugin.account.ui.LoginIndepPass loginIndepPass) {
        this.f73711d = loginIndepPass;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 6 && i17 != 5) {
            return false;
        }
        int i18 = com.tencent.mm.plugin.account.ui.LoginIndepPass.f73351t;
        this.f73711d.T6();
        return true;
    }
}
