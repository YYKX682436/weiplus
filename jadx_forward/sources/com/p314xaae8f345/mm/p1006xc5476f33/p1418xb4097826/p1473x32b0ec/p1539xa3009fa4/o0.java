package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class o0 implements j35.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.a1 f198824a;

    public o0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.a1 a1Var) {
        this.f198824a = a1Var;
    }

    @Override // j35.b0
    /* renamed from: onRequestPermissionsResult */
    public final void mo2413x953457f1(int i17, java.lang.String[] strArr, int[] iArr) {
        java.lang.Integer M;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.a1 a1Var = this.f198824a;
        java.lang.String str = a1Var.f198404d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkLivePermission() requestCode=");
        sb6.append(i17);
        sb6.append(" permissions=");
        sb6.append(strArr);
        sb6.append(" grantResults=");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(iArr);
        sb6.append(kz5.z.M(iArr));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        if ((!(iArr.length == 0)) && (M = kz5.z.M(iArr)) != null && M.intValue() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.x2.f184205a.f(9, a1Var.f198417t);
            a1Var.a7();
        }
    }
}
