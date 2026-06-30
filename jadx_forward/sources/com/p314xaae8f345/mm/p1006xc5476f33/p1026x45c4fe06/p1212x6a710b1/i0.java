package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1;

/* loaded from: classes7.dex */
public final class i0 implements d85.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f172002a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f172003b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f172004c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ si1.m0 f172005d;

    public i0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String str, int i17, si1.m0 m0Var) {
        this.f172002a = lVar;
        this.f172003b = str;
        this.f172004c = i17;
        this.f172005d = m0Var;
    }

    @Override // d85.l0
    public final void a(d85.h0 h0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPermissionDelegateLogic", "requestPermission appid:" + this.f172002a.mo48798x74292566() + " permission:" + this.f172003b + " business:" + this.f172004c + " grantResult:" + h0Var);
        int i17 = (h0Var == null ? -1 : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.h0.f171988a[h0Var.ordinal()]) == 1 ? 0 : -1;
        si1.m0 m0Var = this.f172005d;
        if (m0Var != null) {
            m0Var.a(i17);
        }
    }
}
