package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes14.dex */
public class be implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11457x794a57af f155285d;

    public be(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11457x794a57af activityC11457x794a57af) {
        this.f155285d = activityC11457x794a57af;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11457x794a57af activityC11457x794a57af = this.f155285d;
        if (activityC11457x794a57af.f155058e.getText() == null || activityC11457x794a57af.f155058e.getText().toString().length() <= 0) {
            activityC11457x794a57af.f155060g.setEnabled(false);
        } else {
            activityC11457x794a57af.f155060g.setEnabled(true);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
