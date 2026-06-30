package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public class xg implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17437x244fdb47 f243290d;

    public xg(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17437x244fdb47 activityC17437x244fdb47) {
        this.f243290d = activityC17437x244fdb47;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        boolean z17 = (editable == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(editable.toString()) || editable.toString().length() < 6) ? false : true;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17437x244fdb47 activityC17437x244fdb47 = this.f243290d;
        activityC17437x244fdb47.f242055g.setEnabled(z17);
        if (z17) {
            return;
        }
        if (activityC17437x244fdb47.f242057i.getVisibility() == 0) {
            activityC17437x244fdb47.a7("");
        }
        activityC17437x244fdb47.f242058m.setTextColor(b3.l.m9702x7444d5ad(activityC17437x244fdb47.mo55332x76847179(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560053a84));
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
