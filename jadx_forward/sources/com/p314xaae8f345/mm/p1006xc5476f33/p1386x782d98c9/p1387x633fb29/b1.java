package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes13.dex */
public class b1 extends u32.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.c1 f180384d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.d1 f180385e;

    public b1(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.d1 d1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.c1 c1Var) {
        this.f180385e = d1Var;
        this.f180384d = c1Var;
    }

    @Override // u32.j0
    public void Y6(long j17, int i17, int i18, int i19, long j18) {
        int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.d1.f180404g;
        u32.v e17 = this.f180385e.f180406e.e(j17);
        if (e17 != null) {
            e17.f505916e = i18;
            e17.f505918g = j18;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("com.tencent.mm.plugin.exdevice.model.d1", "get connect state faild : %d", java.lang.Long.valueOf(j17));
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.i0) this.f180384d).a(j17, i17, i18, i19, j18);
    }
}
