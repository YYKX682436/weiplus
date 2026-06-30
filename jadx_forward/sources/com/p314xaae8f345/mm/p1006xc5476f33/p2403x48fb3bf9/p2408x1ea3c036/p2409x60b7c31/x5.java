package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes12.dex */
public class x5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.C19271x6213fc4 f264049d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.l6 f264050e;

    public x5(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.l6 l6Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.C19271x6213fc4 c19271x6213fc4) {
        this.f264050e = l6Var;
        this.f264049d = c19271x6213fc4;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.C19271x6213fc4 c19271x6213fc4 = this.f264049d;
        c19271x6213fc4.x();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.l6 l6Var = this.f264050e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.y1 y1Var = l6Var.f263920b.f263719t;
        if (y1Var != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = y1Var.f264238t;
            if (j0Var != null) {
                j0Var.dismiss();
                y1Var.f264238t = null;
            }
            l6Var.f263920b.f263719t.m74259x8e5d7968(null);
        }
        if (!c19271x6213fc4.f263780n) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.n5) l6Var.f263924f).a(false, null);
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String str = c19271x6213fc4.f263778i;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        hashMap.put("serverId", str);
        java.lang.String str2 = c19271x6213fc4.f263779m;
        hashMap.put("mediaUrl", str2 != null ? str2 : "");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.n5) l6Var.f263924f).a(true, hashMap);
    }
}
