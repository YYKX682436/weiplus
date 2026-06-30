package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public class w2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11913xec00efba f165231d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f165232e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f165233f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.y2 f165234g;

    public w2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.y2 y2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11913xec00efba c11913xec00efba, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17) {
        this.f165234g = y2Var;
        this.f165231d = c11913xec00efba;
        this.f165232e = e9Var;
        this.f165233f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11913xec00efba c11913xec00efba = this.f165231d;
        c11913xec00efba.x();
        java.util.HashMap hashMap = new java.util.HashMap();
        int i17 = c11913xec00efba.f160024f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.y2 y2Var = this.f165234g;
        int i18 = this.f165233f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f165232e;
        if (i17 == 0) {
            e9Var.a(i18, y2Var.o("fail:cancel"));
            return;
        }
        if (i17 == 1) {
            e9Var.a(i18, y2Var.o("fail:download fail"));
        } else {
            if (i17 != 2) {
                return;
            }
            hashMap.put("download_id", java.lang.Long.valueOf(c11913xec00efba.f160025g));
            e9Var.a(i18, y2Var.p("ok", hashMap));
        }
    }
}
