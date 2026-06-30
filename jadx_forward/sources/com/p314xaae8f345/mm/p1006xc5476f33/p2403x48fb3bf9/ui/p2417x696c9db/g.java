package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes5.dex */
public class g implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19307x65cbeee9 f266276d;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19307x65cbeee9 activityC19307x65cbeee9) {
        this.f266276d = activityC19307x65cbeee9;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19307x65cbeee9 activityC19307x65cbeee9 = this.f266276d;
        if (!activityC19307x65cbeee9.f265129s) {
            if (activityC19307x65cbeee9.f265118e.getText().toString().equals("")) {
                activityC19307x65cbeee9.m78501x43e00957(false);
                return;
            } else {
                activityC19307x65cbeee9.m78501x43e00957(true);
                return;
            }
        }
        if (!activityC19307x65cbeee9.f265118e.getText().toString().equals(activityC19307x65cbeee9.f265131u) || activityC19307x65cbeee9.f265132v) {
            activityC19307x65cbeee9.m78501x43e00957(true);
        } else {
            activityC19307x65cbeee9.m78501x43e00957(false);
        }
    }
}
