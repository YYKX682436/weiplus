package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes10.dex */
public class s3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f163571d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f163572e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f163573f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f163574g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f163575h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.t3 f163576i;

    public s3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.t3 t3Var, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.util.ArrayList arrayList3, java.util.ArrayList arrayList4, java.util.ArrayList arrayList5) {
        this.f163576i = t3Var;
        this.f163571d = arrayList;
        this.f163572e = arrayList2;
        this.f163573f = arrayList3;
        this.f163574g = arrayList4;
        this.f163575h = arrayList5;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12163xa32fed7c c12163xa32fed7c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12163xa32fed7c c12163xa32fed7c2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12162xc2b17910 c12162xc2b17910;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12163xa32fed7c c12163xa32fed7c3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12162xc2b17910 c12162xc2b179102;
        java.lang.String d07;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12163xa32fed7c c12163xa32fed7c4;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12163xa32fed7c c12163xa32fed7c5;
        java.lang.String c07;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMedia", "handle image from album is ok");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.t3 t3Var = this.f163576i;
        c12163xa32fed7c = t3Var.f163605h.f163680d;
        c12163xa32fed7c.f163180d = -1;
        c12163xa32fed7c2 = t3Var.f163605h.f163680d;
        c12163xa32fed7c2.f163181e = "image";
        c12162xc2b17910 = t3Var.f163605h.f163681e;
        boolean z17 = c12162xc2b17910.f163176p;
        java.util.ArrayList arrayList = this.f163572e;
        java.util.ArrayList arrayList2 = this.f163571d;
        if (z17) {
            c12163xa32fed7c5 = t3Var.f163605h.f163680d;
            c07 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y3.c0(arrayList2, arrayList, this.f163573f, this.f163574g, this.f163575h);
            c12163xa32fed7c5.f163182f = c07;
        } else {
            c12163xa32fed7c3 = t3Var.f163605h.f163680d;
            c12162xc2b179102 = t3Var.f163605h.f163681e;
            d07 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y3.d0(arrayList2, arrayList, c12162xc2b179102.f163172i);
            c12163xa32fed7c3.f163182f = d07;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y3 y3Var = t3Var.f163605h;
        c12163xa32fed7c4 = y3Var.f163680d;
        y3Var.m50420x7b736e5c(c12163xa32fed7c4);
    }
}
