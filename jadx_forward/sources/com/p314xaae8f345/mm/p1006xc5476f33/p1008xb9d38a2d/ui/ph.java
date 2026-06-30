package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes14.dex */
public class ph implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11466x7d774b0 f155650d;

    public ph(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11466x7d774b0 activityC11466x7d774b0) {
        this.f155650d = activityC11466x7d774b0;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11466x7d774b0 activityC11466x7d774b0 = this.f155650d;
        if (!activityC11466x7d774b0.U.e()) {
            activityC11466x7d774b0.U.d();
        }
        java.lang.String trim = activityC11466x7d774b0.f155163e.getText().toString().trim();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(trim)) {
            activityC11466x7d774b0.f155173r.setText(activityC11466x7d774b0.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hxy));
            activityC11466x7d774b0.a7(false, false);
            db5.d5 d5Var = activityC11466x7d774b0.I;
            if (d5Var != null) {
                d5Var.dismiss();
                activityC11466x7d774b0.I = null;
            }
            activityC11466x7d774b0.f155163e.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.oh(this), 50L);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(trim) && (activityC11466x7d774b0.X6() || !trim.equals(activityC11466x7d774b0.C))) {
            activityC11466x7d774b0.a7(false, false);
            activityC11466x7d774b0.U.c(500L, 500L);
        }
        activityC11466x7d774b0.C = trim;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
