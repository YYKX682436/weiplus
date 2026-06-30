package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public class a3 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.b3 f160220a;

    public a3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.b3 b3Var) {
        this.f160220a = b3Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u
    /* renamed from: onReceiveResult */
    public void mo50331x8a4d1541(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11888x1a859600 abstractC11888x1a859600) {
        if (abstractC11888x1a859600 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11915xd8f50f14) {
            int i17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11915xd8f50f14) abstractC11888x1a859600).f160044d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.b3 b3Var = this.f160220a;
            if (i17 == 0) {
                b3Var.f161351a.a(b3Var.f161357g, b3Var.f161358h.o("ok"));
            } else {
                b3Var.f161351a.a(b3Var.f161357g, b3Var.f161358h.o(java.lang.String.format("fail internal error:%d", java.lang.Integer.valueOf(i17))));
            }
        }
    }
}
