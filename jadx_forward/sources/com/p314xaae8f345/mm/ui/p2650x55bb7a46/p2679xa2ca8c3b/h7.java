package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes4.dex */
public class h7 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yb5.d f285621a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zy2.i f285622b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285623c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f285624d;

    public h7(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.i7 i7Var, yb5.d dVar, zy2.i iVar, java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f285621a = dVar;
        this.f285622b = iVar;
        this.f285623c = str;
        this.f285624d = f9Var;
    }

    @Override // ym5.n0
    /* renamed from: getExposedId */
    public long mo55681x18a217a5(android.view.View view) {
        return this.f285624d.m124847x74d37ac6() + view.hashCode();
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        if (z17) {
            zy2.eb ebVar = (zy2.eb) i95.n0.c(zy2.eb.class);
            r45.qt2 wi6 = ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).wi(this.f285621a.g());
            zy2.i iVar = this.f285622b;
            ((vr2.f) ebVar).Bi(pm0.v.Z(iVar.f558944b.m75945x2fec8307(0)), iVar.f558944b.m75945x2fec8307(8), 4, wi6, null, false, null);
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f285624d;
            boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(f9Var.Q0());
            java.lang.String str = this.f285623c;
            if (R4) {
                str = str + "-" + f9Var.Q0();
            }
            java.lang.String str2 = str;
            int i17 = R4 ? 2 : com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(f9Var.Q0()) ? 58 : 1;
            ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.m0.f206653d.c(i17, 1, str2, null, iVar.f558944b.m75945x2fec8307(0), iVar.f558944b.m75939xb282bd08(29), this.f285623c, null, f9Var.mo78012x3fdd41df(), pm0.v.u(f9Var.I0()));
        }
    }
}
