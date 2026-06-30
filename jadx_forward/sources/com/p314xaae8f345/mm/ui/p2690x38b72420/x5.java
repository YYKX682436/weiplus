package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class x5 extends com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.s4 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22313x70d15e01 f288780e;

    public x5(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22313x70d15e01 activityC22313x70d15e01) {
        this.f288780e = activityC22313x70d15e01;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.s4, android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        super.onTextChanged(charSequence, i17, i18, i19);
        int f17 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.f(charSequence.toString());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.ModRemarkName", "afterTextChanged() MAX_REMARK_NAME_LENGTH:%s curLength:%s", 64, java.lang.Integer.valueOf(f17));
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22313x70d15e01 activityC22313x70d15e01 = this.f288780e;
        if (f17 >= 64) {
            activityC22313x70d15e01.S.setVisibility(8);
        }
        int i27 = com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22313x70d15e01.f287999y1;
        activityC22313x70d15e01.X6();
    }
}
