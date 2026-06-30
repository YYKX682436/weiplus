package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

/* loaded from: classes.dex */
public final class y5 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f254729d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18589x3dbac5d0 f254730e;

    public y5(android.widget.Button button, com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18589x3dbac5d0 activityC18589x3dbac5d0) {
        this.f254729d = button;
        this.f254730e = activityC18589x3dbac5d0;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18589x3dbac5d0.f254430g;
        com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18589x3dbac5d0 activityC18589x3dbac5d0 = this.f254730e;
        this.f254729d.setEnabled(((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22618x59d05a04) ((jz5.n) activityC18589x3dbac5d0.f254431e).mo141623x754a37bb()).length() > 0 && ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22618x59d05a04) ((jz5.n) activityC18589x3dbac5d0.f254432f).mo141623x754a37bb()).length() > 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18589x3dbac5d0.Z6(activityC18589x3dbac5d0, "");
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
