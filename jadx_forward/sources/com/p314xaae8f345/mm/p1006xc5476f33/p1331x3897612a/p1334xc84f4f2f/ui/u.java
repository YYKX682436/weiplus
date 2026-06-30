package com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui;

/* loaded from: classes9.dex */
public class u implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public int f177866d = 0;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.ActivityC13135x13db66fd activityC13135x13db66fd) {
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        editable.toString();
        editable.length();
        java.lang.String obj = editable.toString();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(obj)) {
            this.f177866d = 0;
        } else if (this.f177866d == 0) {
            ((h12.b) ((k12.r) i95.n0.c(k12.r.class))).getClass();
            if (!com.p314xaae8f345.mm.p2614xca6eae71.x1.Di().Ai(obj)) {
                ((h12.b) ((k12.r) i95.n0.c(k12.r.class))).getClass();
                if (!com.p314xaae8f345.mm.p2614xca6eae71.x1.Di().Bi(obj)) {
                    this.f177866d = 1;
                }
            }
            this.f177866d = editable.length();
        }
        editable.delete(this.f177866d, editable.length());
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
