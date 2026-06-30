package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public class z5 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.f0 {

    /* renamed from: j, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y5 f284122j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f284123k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f284124l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.b6 f284125m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.b6 b6Var, long j17, int i17, java.lang.String str, long j18, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        super(j17, i17, str, j18, str2, str3, str4, str5);
        this.f284125m = b6Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.f0
    public boolean d(java.lang.String str) {
        if (str == null) {
            return false;
        }
        java.lang.String lowerCase = str.toLowerCase();
        if (b(lowerCase)) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f284124l) && !this.f284124l.toLowerCase().equalsIgnoreCase(this.f284125m.f284074d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mes)) && this.f284124l.toLowerCase().contains(lowerCase)) {
                return true;
            }
        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f284124l) && c(lowerCase, this.f284124l.toLowerCase())) {
            return true;
        }
        return super.d(lowerCase);
    }
}
