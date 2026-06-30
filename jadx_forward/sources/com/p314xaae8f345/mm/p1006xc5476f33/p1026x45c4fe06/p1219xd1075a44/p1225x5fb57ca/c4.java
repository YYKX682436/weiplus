package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes7.dex */
public class c4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f172909d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f172910e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f172911f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f172912g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.d4 f172913h;

    public c4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.d4 d4Var, boolean z17, java.lang.String str, int i17, int i18) {
        this.f172913h = d4Var;
        this.f172909d = z17;
        this.f172910e = str;
        this.f172911f = i17;
        this.f172912g = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f172909d;
        java.lang.String str = this.f172910e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.d4 d4Var = this.f172913h;
        if (z17) {
            d4Var.f172933e.u(str);
        } else {
            d4Var.f172933e.setText(str);
        }
        try {
            d4Var.f172933e.setSelection(java.lang.Math.min(this.f172911f + this.f172912g, str.length()));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.WebEditText", "replace softBank to unicode, setSelection ", e17);
        }
    }
}
