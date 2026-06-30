package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes14.dex */
public class kf implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean[] f155519d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11461x47892174 f155520e;

    public kf(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11461x47892174 activityC11461x47892174, boolean[] zArr) {
        this.f155520e = activityC11461x47892174;
        this.f155519d = zArr;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11461x47892174.Y;
        this.f155520e.V6();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        boolean[] zArr = this.f155519d;
        boolean z17 = zArr[0];
        fo3.s sVar = fo3.s.INSTANCE;
        if (z17) {
            zArr[0] = false;
            sVar.Ab("ie_reg");
        }
        sVar.a6("ie_reg");
    }
}
