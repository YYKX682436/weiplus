package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class h2 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22295xcc682948 f288284d;

    public h2(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22295xcc682948 activityC22295xcc682948) {
        this.f288284d = activityC22295xcc682948;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        int f17 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.f(editable.toString());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.ContactRemarkInfoModUI", "afterTextChanged() MAX_REMARK_NAME_LENGTH:%s curLength:%s", 64, java.lang.Integer.valueOf(f17));
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22295xcc682948 activityC22295xcc682948 = this.f288284d;
        if (f17 >= 64) {
            activityC22295xcc682948.H1.setVisibility(8);
        }
        int i17 = com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22295xcc682948.T1;
        activityC22295xcc682948.Y6();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
