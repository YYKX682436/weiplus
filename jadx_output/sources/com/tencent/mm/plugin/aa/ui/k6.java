package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes5.dex */
public final class k6 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.a6 f72713a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMEditText f72714b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.PaylistAARemarkInputHalfPage f72715c;

    public k6(com.tencent.mm.plugin.aa.ui.a6 a6Var, com.tencent.mm.ui.widget.MMEditText mMEditText, com.tencent.mm.plugin.aa.ui.PaylistAARemarkInputHalfPage paylistAARemarkInputHalfPage) {
        this.f72713a = a6Var;
        this.f72714b = mMEditText;
        this.f72715c = paylistAARemarkInputHalfPage;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f72714b;
        android.text.Editable text = mMEditText.getText();
        java.lang.String obj = text != null ? text.toString() : null;
        if (obj == null) {
            obj = "";
        }
        ((com.tencent.mm.plugin.aa.ui.c7) this.f72713a).a(false, obj);
        com.tencent.mm.plugin.aa.ui.PaylistAARemarkInputHalfPage paylistAARemarkInputHalfPage = this.f72715c;
        paylistAARemarkInputHalfPage.f72535d.hideVKB(mMEditText);
        paylistAARemarkInputHalfPage.a();
    }
}
