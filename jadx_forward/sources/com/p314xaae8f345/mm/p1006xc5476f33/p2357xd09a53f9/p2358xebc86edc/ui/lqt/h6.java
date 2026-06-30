package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes9.dex */
public class h6 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb f259731d;

    public h6(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb activityC19020x7623dbfb) {
        this.f259731d = activityC19020x7623dbfb;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        if (editable.toString().startsWith(".")) {
            editable.insert(0, "0");
        }
        java.lang.String obj = editable.toString();
        int indexOf = obj.indexOf(".");
        int length = obj.length();
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb activityC19020x7623dbfb = this.f259731d;
        if (indexOf >= 0 && length - indexOf > 3) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2.g(activityC19020x7623dbfb.f259589h.m83169xe7297452(), obj, indexOf + 3, length);
        } else if (indexOf > 12) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2.g(activityC19020x7623dbfb.f259589h.m83169xe7297452(), obj, 12, indexOf);
        } else if (indexOf == -1 && length > 12) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2.g(activityC19020x7623dbfb.f259589h.m83169xe7297452(), obj, 12, length);
        }
        java.lang.String obj2 = editable.toString();
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb.R1;
        activityC19020x7623dbfb.s7(obj2, false);
        activityC19020x7623dbfb.f259610y1 = obj2;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(obj2)) {
            activityC19020x7623dbfb.B.setVisibility(8);
        } else {
            activityC19020x7623dbfb.B.setVisibility(0);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
