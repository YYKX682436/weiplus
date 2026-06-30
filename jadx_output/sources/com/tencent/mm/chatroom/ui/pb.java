package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class pb implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.SeeRoomMemberUI f64430d;

    public pb(com.tencent.mm.chatroom.ui.SeeRoomMemberUI seeRoomMemberUI) {
        this.f64430d = seeRoomMemberUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        this.f64430d.f63936e.c(charSequence.toString());
    }
}
