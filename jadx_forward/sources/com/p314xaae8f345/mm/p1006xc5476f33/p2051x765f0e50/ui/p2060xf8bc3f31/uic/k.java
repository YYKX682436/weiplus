package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.uic;

/* loaded from: classes8.dex */
public final class k implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.uic.n f243534d;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.uic.n nVar) {
        this.f243534d = nVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.uic.n nVar = this.f243534d;
        long j17 = nVar.f243542h + 1;
        nVar.f243542h = j17;
        if (!(charSequence == null || r26.n0.N(charSequence))) {
            java.lang.String obj = charSequence.toString();
            p3325xe03a0797.p3326xc267989b.r2 r2Var = nVar.f243541g;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a O6 = nVar.O6();
            nVar.f243541g = O6 != null ? p3325xe03a0797.p3326xc267989b.l.d(O6, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.uic.j(this.f243534d, obj, j17, null), 3, null) : null;
            return;
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var2 = nVar.f243541g;
        if (r2Var2 != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
        }
        j75.f Q6 = nVar.Q6();
        if (Q6 != null) {
            Q6.B3(new r24.c("", kz5.p0.f395529d, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.uic.n.T6(nVar)));
        }
    }
}
