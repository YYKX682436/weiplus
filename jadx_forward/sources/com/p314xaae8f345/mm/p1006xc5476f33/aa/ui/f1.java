package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class f1 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11343xa72aeaf2 f154168d;

    public f1(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11343xa72aeaf2 activityC11343xa72aeaf2) {
        this.f154168d = activityC11343xa72aeaf2;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        java.lang.String obj = editable.toString();
        double F = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(obj, 0.0d);
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11343xa72aeaf2 activityC11343xa72aeaf2 = this.f154168d;
        if (!activityC11343xa72aeaf2.f153992o.n() || F < 0.01d) {
            activityC11343xa72aeaf2.f153989i.e(false);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = activityC11343xa72aeaf2.mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            ((h61.b) pf5.z.f435481a.a(activity).a(h61.b.class)).m42291x53d8522f("REMITTANCE_AA_MONEY_EDIT_FORM_VALUE_KEY", "");
            return;
        }
        activityC11343xa72aeaf2.f153989i.e(true);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = activityC11343xa72aeaf2.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
        ((h61.b) pf5.z.f435481a.a(activity2).a(h61.b.class)).m42291x53d8522f("REMITTANCE_AA_MONEY_EDIT_FORM_VALUE_KEY", "¥" + obj);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
