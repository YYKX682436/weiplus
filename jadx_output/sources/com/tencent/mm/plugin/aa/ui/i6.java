package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes5.dex */
public final class i6 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f72687d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.a6 f72688e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMEditText f72689f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.PaylistAARemarkInputHalfPage f72690g;

    public i6(com.tencent.mm.ui.widget.dialog.z2 z2Var, com.tencent.mm.plugin.aa.ui.a6 a6Var, com.tencent.mm.ui.widget.MMEditText mMEditText, com.tencent.mm.plugin.aa.ui.PaylistAARemarkInputHalfPage paylistAARemarkInputHalfPage) {
        this.f72687d = z2Var;
        this.f72688e = a6Var;
        this.f72689f = mMEditText;
        this.f72690g = paylistAARemarkInputHalfPage;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 6 && (keyEvent == null || keyEvent.getKeyCode() != 66 || keyEvent.getAction() != 1)) {
            return false;
        }
        android.widget.Button button = this.f72687d.f212069u;
        if (!(button != null && button.isEnabled())) {
            return true;
        }
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f72689f;
        android.text.Editable text = mMEditText.getText();
        java.lang.String obj = text != null ? text.toString() : null;
        if (obj == null) {
            obj = "";
        }
        ((com.tencent.mm.plugin.aa.ui.c7) this.f72688e).a(false, obj);
        com.tencent.mm.plugin.aa.ui.PaylistAARemarkInputHalfPage paylistAARemarkInputHalfPage = this.f72690g;
        paylistAARemarkInputHalfPage.f72535d.hideVKB(mMEditText);
        paylistAARemarkInputHalfPage.a();
        return true;
    }
}
