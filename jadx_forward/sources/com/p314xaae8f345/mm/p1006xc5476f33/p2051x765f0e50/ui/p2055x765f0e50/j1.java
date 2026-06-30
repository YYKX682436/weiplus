package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public class j1 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public int f242707d = 60;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f242708e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17371x5d66fcc2 f242709f;

    public j1(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17371x5d66fcc2 activityC17371x5d66fcc2, java.lang.String str) {
        this.f242709f = activityC17371x5d66fcc2;
        this.f242708e = str;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        boolean z17 = !editable.toString().equals(this.f242708e);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17371x5d66fcc2 activityC17371x5d66fcc2 = this.f242709f;
        activityC17371x5d66fcc2.m78501x43e00957(z17);
        int b17 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.b(60, editable.toString());
        this.f242707d = b17;
        if (b17 < 0) {
            this.f242707d = 0;
        }
        android.widget.TextView textView = activityC17371x5d66fcc2.f241673e;
        if (textView != null) {
            textView.setText("" + (this.f242707d / 2));
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
