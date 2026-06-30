package com.tencent.mm.plugin.account.ui;

/* loaded from: classes5.dex */
public class ac implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.MobileInputUI f73718d;

    public ac(com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI) {
        this.f73718d = mobileInputUI;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 6 || i17 == 5) {
            return this.f73718d.U6();
        }
        return false;
    }
}
