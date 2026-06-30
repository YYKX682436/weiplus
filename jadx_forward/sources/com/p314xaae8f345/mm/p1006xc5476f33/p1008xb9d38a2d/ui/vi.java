package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes5.dex */
public class vi implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11471xee777578 f155812d;

    public vi(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11471xee777578 activityC11471xee777578) {
        this.f155812d = activityC11471xee777578;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(editable.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11471xee777578 activityC11471xee777578 = this.f155812d;
        if (!K0) {
            activityC11471xee777578.f155211f.setEnabled(true);
        } else {
            activityC11471xee777578.f155211f.setEnabled(false);
            activityC11471xee777578.T6("");
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
