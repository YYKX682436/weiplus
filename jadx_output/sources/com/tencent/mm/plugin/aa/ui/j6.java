package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes5.dex */
public final class j6 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.a6 f72699a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.PaylistAARemarkInputHalfPage f72700b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMEditText f72701c;

    public j6(com.tencent.mm.plugin.aa.ui.a6 a6Var, com.tencent.mm.plugin.aa.ui.PaylistAARemarkInputHalfPage paylistAARemarkInputHalfPage, com.tencent.mm.ui.widget.MMEditText mMEditText) {
        this.f72699a = a6Var;
        this.f72700b = paylistAARemarkInputHalfPage;
        this.f72701c = mMEditText;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        this.f72699a.getClass();
        com.tencent.mm.plugin.aa.ui.PaylistAARemarkInputHalfPage paylistAARemarkInputHalfPage = this.f72700b;
        paylistAARemarkInputHalfPage.f72535d.hideVKB(this.f72701c);
        paylistAARemarkInputHalfPage.a();
    }
}
