package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036;

/* loaded from: classes8.dex */
public class r0 implements com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc f221496a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sd.o0 f221497b;

    public r0(com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc c10723x8ab106bc, sd.o0 o0Var) {
        this.f221496a = c10723x8ab106bc;
        this.f221497b = o0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.a
    public void a(int i17, java.lang.String str, java.lang.String str2) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.a
    public void c(int i17, java.lang.String str, int i18, int i19, java.lang.String str2) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.a
    public void d(int i17, java.lang.String str) {
        this.f221496a.G = java.lang.System.currentTimeMillis();
        sx4.d0.h(str, java.lang.System.currentTimeMillis());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.a
    public /* bridge */ /* synthetic */ void e(int i17, java.lang.String str, java.lang.String str2, java.lang.Object obj) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.a
    public void f(int i17, java.lang.String str) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.a
    public /* bridge */ /* synthetic */ boolean g(int i17, java.lang.String str, java.lang.Object obj) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.a
    public void h(int i17, boolean z17, java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageGetA8KeyUtil", "getA8Key end, time: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        java.util.Map g17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.d.g(((r45.s83) obj).f467095x);
        this.f221496a.H = java.lang.System.currentTimeMillis();
        sx4.d0.g(str, java.lang.System.currentTimeMillis());
        sd.o0 o0Var = this.f221497b;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59) o0Var.h();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || c22633x83752a59 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuggageGetA8KeyUtil", "url is null");
        } else {
            com.p314xaae8f345.mm.p794xb0fa9b5e.w0.c(true, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.u0(str2, g17, c22633x83752a59));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.v0.a(o0Var, str2);
    }
}
