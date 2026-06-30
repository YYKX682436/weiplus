package com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df;

/* loaded from: classes8.dex */
public class e2 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.ActivityC18746x694b7935 f256496d;

    public e2(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.ActivityC18746x694b7935 activityC18746x694b7935) {
        this.f256496d = activityC18746x694b7935;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        o11.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.ActivityC18746x694b7935.D;
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.ActivityC18746x694b7935 activityC18746x694b7935 = this.f256496d;
        activityC18746x694b7935.W6();
        if (activityC18746x694b7935.f256465x.getText().toString().length() <= 200) {
            activityC18746x694b7935.m78500x43e00957(0, true);
        } else {
            activityC18746x694b7935.m78500x43e00957(0, false);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
