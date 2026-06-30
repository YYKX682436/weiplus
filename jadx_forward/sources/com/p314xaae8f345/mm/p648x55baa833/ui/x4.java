package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes5.dex */
public class x4 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10348x266bd9bc f146179d;

    public x4(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10348x266bd9bc activityC10348x266bd9bc) {
        this.f146179d = activityC10348x266bd9bc;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10348x266bd9bc activityC10348x266bd9bc = this.f146179d;
        android.widget.Button button = activityC10348x266bd9bc.f145354h;
        java.lang.String trim = activityC10348x266bd9bc.f145350d.getText().toString().trim();
        boolean z17 = false;
        if (trim.equals(activityC10348x266bd9bc.f145360q)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemarkRoomNameUI", "new name equals old name");
        } else {
            java.lang.String f17 = ip.c.f();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f17)) {
                if (trim.matches(".*[" + f17 + "].*")) {
                    java.lang.String string = activityC10348x266bd9bc.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g1m, f17);
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                        activityC10348x266bd9bc.f145355i.setVisibility(8);
                    } else {
                        activityC10348x266bd9bc.f145355i.setVisibility(0);
                        activityC10348x266bd9bc.f145355i.setText(string);
                    }
                }
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0("")) {
                activityC10348x266bd9bc.f145355i.setVisibility(8);
            } else {
                activityC10348x266bd9bc.f145355i.setVisibility(0);
                activityC10348x266bd9bc.f145355i.setText("");
            }
            z17 = true;
        }
        button.setEnabled(z17);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        int length = charSequence.length();
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10348x266bd9bc activityC10348x266bd9bc = this.f146179d;
        if (length > 0) {
            activityC10348x266bd9bc.f145350d.setEllipsize(null);
        } else {
            activityC10348x266bd9bc.f145350d.setEllipsize(android.text.TextUtils.TruncateAt.END);
        }
        boolean z17 = charSequence.length() > 0;
        int i27 = com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10348x266bd9bc.f145349r;
        activityC10348x266bd9bc.T6(z17);
    }
}
