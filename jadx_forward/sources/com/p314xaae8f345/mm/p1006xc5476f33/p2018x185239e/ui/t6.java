package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public class t6 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17135x4b12f675 f239488d;

    public t6(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17135x4b12f675 activityC17135x4b12f675) {
        this.f239488d = activityC17135x4b12f675;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17135x4b12f675 activityC17135x4b12f675 = this.f239488d;
        double F = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(activityC17135x4b12f675.f238947g.m83183xfb85ada3(), 0.0d);
        activityC17135x4b12f675.f238957t = F;
        if (F <= 0.0d) {
            com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 c22894x55bf3223 = activityC17135x4b12f675.f238948h;
            if (c22894x55bf3223 != null) {
                c22894x55bf3223.e(false);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 c22894x55bf32232 = activityC17135x4b12f675.f238948h;
        if (c22894x55bf32232 != null) {
            c22894x55bf32232.e(true);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
