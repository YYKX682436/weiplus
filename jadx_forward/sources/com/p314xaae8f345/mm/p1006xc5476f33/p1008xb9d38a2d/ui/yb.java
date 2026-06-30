package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes14.dex */
public class yb implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean[] f155874d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc f155875e;

    public yb(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activityC11453xa58e34bc, boolean[] zArr) {
        this.f155875e = activityC11453xa58e34bc;
        this.f155874d = zArr;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        d71.e eVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activityC11453xa58e34bc = this.f155875e;
        if (activityC11453xa58e34bc.f155014f.isEnabled() && (eVar = activityC11453xa58e34bc.K) != null && editable != null) {
            eVar.a(editable);
        }
        activityC11453xa58e34bc.f155023r.setEnabled(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC11453xa58e34bc.f155014f.getText().toString()));
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        boolean[] zArr = this.f155874d;
        boolean z17 = zArr[0];
        fo3.s sVar = fo3.s.INSTANCE;
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activityC11453xa58e34bc = this.f155875e;
        if (z17) {
            zArr[0] = false;
            int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc.W;
            if (activityC11453xa58e34bc.X6()) {
                sVar.Ab("ie_reg_eu");
            }
            if (activityC11453xa58e34bc.W6()) {
                sVar.Ab("ie_login");
            }
        }
        int i28 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc.W;
        if (activityC11453xa58e34bc.X6()) {
            sVar.a6("ie_reg_eu");
        }
        if (activityC11453xa58e34bc.W6()) {
            sVar.a6("ie_login");
        }
    }
}
