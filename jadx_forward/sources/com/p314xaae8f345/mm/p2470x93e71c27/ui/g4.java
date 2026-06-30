package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* loaded from: classes15.dex */
public class g4 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.ActivityC19658x8101466c f272392d;

    public g4(com.p314xaae8f345.mm.p2470x93e71c27.ui.ActivityC19658x8101466c activityC19658x8101466c) {
        this.f272392d = activityC19658x8101466c;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.ActivityC19658x8101466c activityC19658x8101466c = this.f272392d;
        boolean z17 = activityC19658x8101466c.f271413p;
        boolean z18 = activityC19658x8101466c.f271414q;
        if (activityC19658x8101466c.f271413p) {
            activityC19658x8101466c.f271413p = false;
        } else {
            activityC19658x8101466c.f271414q = true;
            activityC19658x8101466c.f271404d.requestLayout();
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
