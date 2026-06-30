package com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui;

/* loaded from: classes15.dex */
public class y implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.ActivityC16731xe258a4be f233885d;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.ActivityC16731xe258a4be activityC16731xe258a4be) {
        this.f233885d = activityC16731xe258a4be;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.ActivityC16731xe258a4be activityC16731xe258a4be = this.f233885d;
        if (activityC16731xe258a4be.f233804i.getText().toString().trim().length() == 0 || activityC16731xe258a4be.f233805m.getText().toString().trim().length() == 0 || activityC16731xe258a4be.f233806n.getText().toString().trim().length() == 0) {
            activityC16731xe258a4be.m78500x43e00957(0, false);
        } else {
            activityC16731xe258a4be.m78500x43e00957(0, true);
        }
    }
}
