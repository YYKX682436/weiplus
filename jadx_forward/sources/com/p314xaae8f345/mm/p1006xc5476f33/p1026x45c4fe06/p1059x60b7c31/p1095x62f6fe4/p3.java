package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes10.dex */
public class p3 implements p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y3 f163523d;

    public p3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y3 y3Var) {
        this.f163523d = y3Var;
    }

    @Override // p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57
    /* renamed from: getContext */
    public oz5.l mo48699x76847179() {
        return oz5.m.f431862d;
    }

    @Override // p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57
    /* renamed from: resumeWith */
    public void mo48700xdecd0e93(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12163xa32fed7c c12163xa32fed7c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12163xa32fed7c c12163xa32fed7c2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12163xa32fed7c c12163xa32fed7c3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12163xa32fed7c c12163xa32fed7c4;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12163xa32fed7c c12163xa32fed7c5;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12163xa32fed7c c12163xa32fed7c6;
        boolean z17 = obj instanceof qc0.m1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y3 y3Var = this.f163523d;
        if (!z17) {
            c12163xa32fed7c = y3Var.f163680d;
            c12163xa32fed7c.f163180d = -2;
            c12163xa32fed7c2 = y3Var.f163680d;
            y3Var.m50420x7b736e5c(c12163xa32fed7c2);
            return;
        }
        qc0.m1 m1Var = (qc0.m1) obj;
        y3Var.f163687n = m1Var.f442943a;
        int i17 = m1Var.f442944b;
        if (i17 == 0) {
            c12163xa32fed7c5 = y3Var.f163680d;
            c12163xa32fed7c5.f163180d = 0;
            c12163xa32fed7c6 = y3Var.f163680d;
            y3Var.m50420x7b736e5c(c12163xa32fed7c6);
            return;
        }
        if (i17 != -1 || m1Var.f442945c != 0) {
            c12163xa32fed7c3 = y3Var.f163680d;
            c12163xa32fed7c3.f163180d = -2;
            c12163xa32fed7c4 = y3Var.f163680d;
            y3Var.m50420x7b736e5c(c12163xa32fed7c4);
            return;
        }
        qc0.l1 a17 = m1Var.a();
        boolean a18 = a17.a();
        java.lang.String str = a17.f442929b;
        if (a18) {
            y3Var.Y(str, new android.content.Intent());
        } else {
            y3Var.X(str, a17.f442930c);
        }
    }
}
