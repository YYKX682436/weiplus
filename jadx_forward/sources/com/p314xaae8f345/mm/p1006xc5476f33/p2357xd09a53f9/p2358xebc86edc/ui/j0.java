package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui;

/* loaded from: classes9.dex */
public class j0 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC18999x8e4b0cb f259439d;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC18999x8e4b0cb activityC18999x8e4b0cb) {
        this.f259439d = activityC18999x8e4b0cb;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        if (editable.toString().startsWith(".")) {
            editable.insert(0, "0");
        }
        java.lang.String obj = editable.toString();
        int indexOf = obj.indexOf(".");
        int lastIndexOf = obj.lastIndexOf(".");
        int length = obj.length();
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC18999x8e4b0cb activityC18999x8e4b0cb = this.f259439d;
        if (indexOf >= 0 && length - indexOf > 3) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2.g(activityC18999x8e4b0cb.f259320i.m83169xe7297452(), obj, indexOf + 3, length);
        } else if (lastIndexOf != indexOf) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2.g(activityC18999x8e4b0cb.f259320i.m83169xe7297452(), obj, lastIndexOf, length);
        }
        activityC18999x8e4b0cb.f259317f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(editable.toString(), 0.0d);
        activityC18999x8e4b0cb.getClass();
        activityC18999x8e4b0cb.g7();
        activityC18999x8e4b0cb.f7();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
