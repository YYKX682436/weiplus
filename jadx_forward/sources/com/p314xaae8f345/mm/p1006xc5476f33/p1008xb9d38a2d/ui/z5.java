package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes8.dex */
public class z5 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11418xe15aceb2 f155889d;

    public z5(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11418xe15aceb2 activityC11418xe15aceb2) {
        this.f155889d = activityC11418xe15aceb2;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11418xe15aceb2 activityC11418xe15aceb2 = this.f155889d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC11418xe15aceb2.f154885d.getText().toString().trim())) {
            activityC11418xe15aceb2.m78501x43e00957(false);
        } else {
            activityC11418xe15aceb2.m78501x43e00957(true);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
