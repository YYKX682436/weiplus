package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes5.dex */
public class ni implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11470xc22f6d8b f155602d;

    public ni(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11470xc22f6d8b activityC11470xc22f6d8b) {
        this.f155602d = activityC11470xc22f6d8b;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11470xc22f6d8b activityC11470xc22f6d8b = this.f155602d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC11470xc22f6d8b.f155196g.getText().toString()) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC11470xc22f6d8b.f155197h.getText().toString())) {
            activityC11470xc22f6d8b.f155204r.setEnabled(false);
        } else {
            activityC11470xc22f6d8b.f155204r.setEnabled(true);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
