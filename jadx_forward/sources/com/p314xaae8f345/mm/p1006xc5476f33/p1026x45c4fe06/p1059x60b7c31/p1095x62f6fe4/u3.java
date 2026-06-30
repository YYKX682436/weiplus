package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes10.dex */
public class u3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f163619d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f163620e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.v3 f163621f;

    public u3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.v3 v3Var, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        this.f163621f = v3Var;
        this.f163619d = arrayList;
        this.f163620e = arrayList2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12163xa32fed7c c12163xa32fed7c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12162xc2b17910 c12162xc2b17910;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12163xa32fed7c c12163xa32fed7c2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12163xa32fed7c c12163xa32fed7c3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12162xc2b17910 c12162xc2b179102;
        java.lang.String d07;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12163xa32fed7c c12163xa32fed7c4;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12163xa32fed7c c12163xa32fed7c5;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMedia", "handle image from album is ok");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.v3 v3Var = this.f163621f;
        c12163xa32fed7c = v3Var.f163635g.f163680d;
        c12163xa32fed7c.f163180d = -1;
        c12162xc2b17910 = v3Var.f163635g.f163681e;
        if (c12162xc2b17910.f163172i) {
            c12163xa32fed7c5 = v3Var.f163635g.f163680d;
            c12163xa32fed7c5.f163181e = "mix";
        } else {
            c12163xa32fed7c2 = v3Var.f163635g.f163680d;
            c12163xa32fed7c2.f163181e = "image";
        }
        c12163xa32fed7c3 = v3Var.f163635g.f163680d;
        c12162xc2b179102 = v3Var.f163635g.f163681e;
        d07 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y3.d0(this.f163619d, this.f163620e, c12162xc2b179102.f163172i);
        c12163xa32fed7c3.f163182f = d07;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y3 y3Var = v3Var.f163635g;
        c12163xa32fed7c4 = y3Var.f163680d;
        y3Var.m50420x7b736e5c(c12163xa32fed7c4);
    }
}
