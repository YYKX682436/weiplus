package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes12.dex */
public class lh implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11466x7d774b0 f155553d;

    public lh(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11466x7d774b0 activityC11466x7d774b0) {
        this.f155553d = activityC11466x7d774b0;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11466x7d774b0 activityC11466x7d774b0 = this.f155553d;
        java.lang.String trim = activityC11466x7d774b0.f155162d.getText().toString().trim();
        if (trim != null && trim.length() > 16) {
            activityC11466x7d774b0.f155162d.setText(trim.substring(0, 16));
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = activityC11466x7d774b0.U;
        if (!b4Var.e()) {
            b4Var.d();
        }
        activityC11466x7d774b0.f155164f.setEnabled(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC11466x7d774b0.f155162d.getText().toString().trim()));
        if (activityC11466x7d774b0.K) {
            return;
        }
        activityC11466x7d774b0.f155163e.setText(trim);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
