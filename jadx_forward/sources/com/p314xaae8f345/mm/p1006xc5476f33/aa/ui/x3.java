package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class x3 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 f154418d;

    public x3(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a7907) {
        this.f154418d = activityC11351x975a7907;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        if (editable.toString().startsWith(".")) {
            editable.insert(0, "0");
        }
        java.lang.String obj = editable.toString();
        int indexOf = obj.indexOf(".");
        int length = obj.length();
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a7907 = this.f154418d;
        if (indexOf >= 0 && length - indexOf > 3) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2.g(activityC11351x975a7907.D.m83169xe7297452(), obj, indexOf + 3, length);
        } else if (indexOf > 6) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2.g(activityC11351x975a7907.D.m83169xe7297452(), obj, 6, indexOf);
        } else if (indexOf == -1 && length > 6) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2.g(activityC11351x975a7907.D.m83169xe7297452(), obj, 6, length);
        }
        double F = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(editable.toString(), 0.0d);
        java.util.List list = activityC11351x975a7907.H;
        if (list == null || list.size() <= 0 || (F * 100.0d) / activityC11351x975a7907.H.size() <= activityC11351x975a7907.W.b()) {
            activityC11351x975a7907.f154042o = false;
        } else {
            activityC11351x975a7907.f154042o = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13722, 2);
        }
        if (by5.b.a(activityC11351x975a7907.mo55332x76847179()).b()) {
            if (obj.length() == 0) {
                activityC11351x975a7907.D.m83169xe7297452().setHint(activityC11351x975a7907.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g_r));
            } else {
                activityC11351x975a7907.D.m83169xe7297452().setHint((java.lang.CharSequence) null);
            }
        }
        activityC11351x975a7907.D.post(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.w3(this));
        activityC11351x975a7907.K7();
        activityC11351x975a7907.J7();
        activityC11351x975a7907.I7();
        activityC11351x975a7907.f7(3);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
