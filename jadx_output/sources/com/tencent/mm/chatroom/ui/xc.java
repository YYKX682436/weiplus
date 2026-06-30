package com.tencent.mm.chatroom.ui;

/* loaded from: classes12.dex */
public class xc implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f64670d = new com.tencent.mm.sdk.platformtools.b4(gm0.j1.e().a(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.chatroom.ui.wc(this), false);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.SelectMemberUI f64671e;

    public xc(com.tencent.mm.chatroom.ui.SelectMemberUI selectMemberUI) {
        this.f64671e = selectMemberUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f64670d;
        b4Var.d();
        b4Var.c(500L, 500L);
    }
}
