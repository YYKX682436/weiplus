package com.tencent.mm.plugin.account.ui;

/* loaded from: classes5.dex */
public class ri implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.SimpleLoginUI f74175d;

    public ri(com.tencent.mm.plugin.account.ui.SimpleLoginUI simpleLoginUI) {
        this.f74175d = simpleLoginUI;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 6 && i17 != 5) {
            return false;
        }
        int i18 = com.tencent.mm.plugin.account.ui.SimpleLoginUI.f73660v;
        this.f74175d.Z6();
        return true;
    }
}
