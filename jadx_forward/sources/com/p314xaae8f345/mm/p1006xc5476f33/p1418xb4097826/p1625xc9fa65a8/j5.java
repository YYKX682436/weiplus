package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

/* loaded from: classes2.dex */
public final class j5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.k5 f207268d;

    public j5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.k5 k5Var) {
        this.f207268d = k5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArr;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9 e9Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183665a;
        sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183678n);
        sb6.append("ringtone-search-history.info");
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(sb7);
        synchronized (this.f207268d) {
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.k5 k5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.k5.f207280a;
                bArr = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.k5.f207281b.mo14344x5f01b1f6();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.FinderSearchHistoryLogic", e17, "", new java.lang.Object[0]);
                bArr = null;
            }
        }
        if (bArr == null) {
            return;
        }
        if (!com.p314xaae8f345.mm.vfs.w6.j(java.lang.String.valueOf(r6Var.s()))) {
            com.p314xaae8f345.mm.vfs.w6.u(java.lang.String.valueOf(r6Var.s()));
        }
        com.p314xaae8f345.mm.vfs.w6.S(sb7, bArr, 0, bArr.length);
    }
}
