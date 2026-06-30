package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72;

/* loaded from: classes14.dex */
public class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f231138d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f231139e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.j1 f231140f;

    public i1(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.j1 j1Var, int i17, byte[] bArr) {
        this.f231140f = j1Var;
        this.f231138d = i17;
        this.f231139e = bArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.j1 j1Var = this.f231140f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var = j1Var.f231195b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.INSTANCE;
        i4Var.w();
        int i17 = this.f231138d;
        int i18 = (i17 == 18 || i17 == 7 || i17 == 51) ? i17 : -5;
        j1Var.f231195b.r(j1Var.f231194a, -10086, i18, "join room callback failed: " + i17, this.f231139e);
    }
}
