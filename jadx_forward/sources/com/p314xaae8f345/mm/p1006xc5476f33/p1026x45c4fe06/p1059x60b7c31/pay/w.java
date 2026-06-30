package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay;

/* loaded from: classes.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6236xbc6b9a5 f164223d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f164224e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f164225f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.x f164226g;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.x xVar, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6236xbc6b9a5 c6236xbc6b9a5, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17) {
        this.f164226g = xVar;
        this.f164223d = c6236xbc6b9a5;
        this.f164224e = lVar;
        this.f164225f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6236xbc6b9a5 c6236xbc6b9a5 = this.f164223d;
        int i17 = c6236xbc6b9a5.f136485h.f88159a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.x xVar = this.f164226g;
        int i18 = this.f164225f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f164224e;
        if (i17 == 0) {
            new java.util.HashMap().put("buffer", c6236xbc6b9a5.f136485h.f88160b);
            lVar.a(i18, xVar.o("ok"));
        } else if (i17 == -2) {
            lVar.a(i18, xVar.o("null"));
        } else {
            lVar.a(i18, xVar.o("fail"));
        }
    }
}
