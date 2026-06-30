package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class x2 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f154415d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 f154416e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11348xdd034dc7 f154417f;

    public x2(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11348xdd034dc7 activityC11348xdd034dc7, java.lang.String str, com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c2) {
        this.f154417f = activityC11348xdd034dc7;
        this.f154415d = str;
        this.f154416e = viewOnFocusChangeListenerC22907xe18534c2;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        try {
            java.lang.String obj = editable.toString();
            if (obj.startsWith("0") && obj.charAt(1) != '0' && obj.charAt(1) != '.') {
                editable.delete(0, 1);
            }
            if (obj.startsWith(".")) {
                editable.insert(0, "0");
            }
            if (obj.startsWith("0") && obj.charAt(1) == '0') {
                editable.delete(1, obj.length());
            }
            java.lang.String obj2 = editable.toString();
            int indexOf = obj2.indexOf(".");
            int length = obj2.length();
            if (indexOf >= 0 && length - indexOf > 2) {
                editable.delete(indexOf + 3, length);
            }
            int lastIndexOf = obj2.lastIndexOf(".");
            if (lastIndexOf != indexOf && lastIndexOf > 0 && length > lastIndexOf) {
                editable.delete(lastIndexOf, length);
            }
        } catch (java.lang.Exception unused) {
        }
        boolean J0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(editable);
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11348xdd034dc7 activityC11348xdd034dc7 = this.f154417f;
        if (J0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(editable.toString(), 0.0d) <= 0.0d) {
            ((java.util.HashMap) activityC11348xdd034dc7.f154021q).remove(this.f154415d);
        } else {
            ((java.util.HashMap) activityC11348xdd034dc7.f154021q).put(this.f154415d, editable.toString());
        }
        com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c2 = this.f154416e;
        if (viewOnFocusChangeListenerC22907xe18534c2 == null || com.p314xaae8f345.mm.p2802xd031a825.ui.r1.h0(viewOnFocusChangeListenerC22907xe18534c2.m83183xfb85ada3(), "100", 2, java.math.RoundingMode.HALF_UP).doubleValue() <= activityC11348xdd034dc7.f154025u) {
            viewOnFocusChangeListenerC22907xe18534c2.m83194xb23f15e1(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c);
        } else {
            viewOnFocusChangeListenerC22907xe18534c2.m83194xb23f15e1(com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = activityC11348xdd034dc7.f154028x;
        java.lang.Runnable runnable = activityC11348xdd034dc7.B;
        n3Var.mo50300x3fa464aa(runnable);
        activityC11348xdd034dc7.f154028x.mo50297x7c4d7ca2(runnable, 50L);
        if (activityC11348xdd034dc7.f154029y == 6) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6641xe68217f2 c6641xe68217f2 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6641xe68217f2();
            c6641xe68217f2.f139928d = 3;
            c6641xe68217f2.k();
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
