package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

/* loaded from: classes.dex */
public class i7 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18591xe20dd59b f254568d;

    public i7(com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18591xe20dd59b activityC18591xe20dd59b) {
        this.f254568d = activityC18591xe20dd59b;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(editable.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18591xe20dd59b activityC18591xe20dd59b = this.f254568d;
        if (!K0) {
            activityC18591xe20dd59b.f254447g.setEnabled(true);
        } else {
            activityC18591xe20dd59b.f254447g.setEnabled(false);
            activityC18591xe20dd59b.Z6("");
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
