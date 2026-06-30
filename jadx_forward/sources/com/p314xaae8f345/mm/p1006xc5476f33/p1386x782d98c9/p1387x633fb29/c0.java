package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes13.dex */
public class c0 extends u32.q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f180390b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.d0 f180391c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.d0 d0Var, int i17, int i18) {
        super(i17);
        this.f180391c = d0Var;
        this.f180390b = i18;
    }

    @Override // u32.q
    public void a() {
        u32.n0 n0Var = u32.h1.c().f180539a;
        if (((u32.k1) n0Var).b(this.f180390b, this.f180391c.f180403f)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExdeviceConnectManager", "scan failed!!!");
    }
}
