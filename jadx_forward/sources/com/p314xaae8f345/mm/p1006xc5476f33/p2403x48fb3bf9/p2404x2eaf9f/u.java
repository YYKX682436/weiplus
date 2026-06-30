package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f;

/* loaded from: classes8.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f263521d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 f263522e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263523f;

    public u(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 r0Var, java.lang.String str) {
        this.f263521d = i17;
        this.f263522e = r0Var;
        this.f263523f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 r0Var = this.f263522e;
        int i17 = this.f263521d;
        java.lang.String str2 = this.f263523f;
        if (r0Var.F(i17, str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0Var.T(), "checkStatus:" + i17 + ' ' + str2 + " to [" + kz5.n0.g0(r0Var.C0, ",", null, null, 0, null, null, 62, null) + "] [" + kz5.n0.g0(r0Var.B0, ",", null, null, 0, null, null, 62, null) + "] [" + kz5.n0.g0(r0Var.D0, ",", null, null, 0, null, null, 62, null) + ']');
            r0Var.B0.add(java.lang.Integer.valueOf(i17));
            r0Var.a1(r0Var.A0, r0Var.D0, r0Var.D);
            return;
        }
        java.lang.String T = r0Var.T();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkStatus skip: ");
        sb6.append(i17);
        sb6.append(", url=");
        sb6.append(str2);
        sb6.append(", startUrl=");
        sb6.append(r0Var.D);
        sb6.append(' ');
        if (r0Var.f263492v0.contains(java.lang.Integer.valueOf(i17))) {
            str = ", spaUrl=" + r0Var.F;
        } else {
            str = "";
        }
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(T, sb6.toString());
    }
}
