package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay;

/* loaded from: classes7.dex */
public class n2 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f164172a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f164173b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.o2 f164174c;

    public n2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.o2 o2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, int i17) {
        this.f164174c = o2Var;
        this.f164172a = c0Var;
        this.f164173b = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.h
    public void a(int i17, int i18, java.lang.String str, java.util.Map map) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.o2 o2Var = this.f164174c;
        int i19 = this.f164173b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = this.f164172a;
        if (i17 == 1) {
            c0Var.a(i19, o2Var.o("ok"));
            return;
        }
        if (i17 != 2) {
            c0Var.a(i19, o2Var.o("cancel"));
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            c0Var.a(i19, o2Var.o("fail"));
        } else {
            c0Var.a(i19, o2Var.o(java.lang.String.format("fail %s", str)));
        }
    }
}
