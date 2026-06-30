package com.p314xaae8f345.mm.p2614xca6eae71;

/* loaded from: classes12.dex */
public final class s1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f274902d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2614xca6eae71.t1 f274903e;

    public s1(java.util.ArrayList arrayList, com.p314xaae8f345.mm.p2614xca6eae71.t1 t1Var) {
        this.f274902d = arrayList;
        this.f274903e = t1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p2614xca6eae71.n1 n1Var = com.p314xaae8f345.mm.p2614xca6eae71.t1.f274908m;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = com.p314xaae8f345.mm.p2614xca6eae71.t1.f274911p;
        sb6.append(str);
        java.lang.String str2 = com.p314xaae8f345.mm.p2614xca6eae71.t1.f274916u;
        sb6.append(str2);
        java.lang.String sb7 = sb6.toString();
        if (com.p314xaae8f345.mm.vfs.w6.j(sb7)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QQSmileyManager", "saveSmileyResFile localNewSmileyConfig exists");
        } else {
            if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
                com.p314xaae8f345.mm.vfs.w6.u(str);
            }
            com.p314xaae8f345.mm.vfs.w6.c(com.p314xaae8f345.mm.p2614xca6eae71.t1.f274913r + str2, sb7);
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("saveSmileyResFile success, localNewSmileyConfig:");
            sb8.append(sb7);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QQSmileyManager", sb8.toString());
        }
        for (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21054xf494c2df c21054xf494c2df : this.f274902d) {
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            java.lang.String str3 = com.p314xaae8f345.mm.p2614xca6eae71.t1.f274911p;
            sb9.append(str3);
            sb9.append(c21054xf494c2df.f67252xf1e8cfcc);
            if (!com.p314xaae8f345.mm.vfs.w6.j(sb9.toString())) {
                com.p314xaae8f345.mm.vfs.w6.c(com.p314xaae8f345.mm.p2614xca6eae71.t1.f274913r + c21054xf494c2df.f67252xf1e8cfcc, str3 + c21054xf494c2df.f67252xf1e8cfcc);
            }
        }
        com.p314xaae8f345.mm.p2614xca6eae71.t1 t1Var = this.f274903e;
        if (t1Var.f274917a.length != t1Var.f274919c.length) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QQSmileyManager", "saveSmileyResFile read smiley array failed.");
            return;
        }
        java.lang.String str4 = com.p314xaae8f345.mm.p2614xca6eae71.t1.f274912q;
        if (com.p314xaae8f345.mm.vfs.w6.u(str4)) {
            com.p314xaae8f345.mm.vfs.w6.b(com.p314xaae8f345.mm.p2614xca6eae71.t1.f274914s, str4);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QQSmileyManager", "saveSmileyResFile success, localQQSmileyDir:" + str4);
        }
    }
}
