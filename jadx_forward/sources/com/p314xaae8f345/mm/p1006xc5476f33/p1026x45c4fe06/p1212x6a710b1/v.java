package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1;

/* loaded from: classes7.dex */
public final class v implements z2.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f172114d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f172115e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f172116f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.y3 f172117g;

    public v(int i17, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.y3 y3Var) {
        this.f172114d = i17;
        this.f172115e = str;
        this.f172116f = str2;
        this.f172117g = y3Var;
    }

    @Override // z2.f
    /* renamed from: onRequestPermissionsResult */
    public void mo50562x953457f1(int i17, java.lang.String[] permissions, int[] grantResults) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permissions, "permissions");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(grantResults, "grantResults");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onRequestPermissionsResult, requestCode: ");
        sb6.append(i17);
        sb6.append(", permissions: ");
        java.lang.String arrays = java.util.Arrays.toString(permissions);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrays, "toString(...)");
        sb6.append(arrays);
        sb6.append(", grantResults: ");
        java.lang.String arrays2 = java.util.Arrays.toString(grantResults);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrays2, "toString(...)");
        sb6.append(arrays2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandEnvExt", sb6.toString());
        if (i17 != this.f172114d) {
            return;
        }
        si1.e1.b(this.f172115e, this);
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f172116f, kz5.z.U(permissions, 0));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.y3 y3Var = this.f172117g;
        if (b17) {
            java.lang.Integer S = kz5.z.S(grantResults, 0);
            y3Var.a((S != null ? S.intValue() : -1) == 0 ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.i4.f172012e : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.i4.f172013f);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandEnvExt", "onRequestPermissionsResult, permission not found");
            y3Var.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.i4.f172013f);
        }
    }
}
