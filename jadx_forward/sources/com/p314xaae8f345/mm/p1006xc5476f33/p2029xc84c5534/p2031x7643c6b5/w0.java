package com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5;

/* loaded from: classes2.dex */
public final class w0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.w0 f239852a = new com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.w0();

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar.f152149b == 0 && fVar.f152148a == 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("upload succ. size:");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.b1 b1Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.b1.f239681a;
            sb6.append(b1Var.e().f453081d.size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UserDataOperationReporter", sb6.toString());
            b1Var.e().f453081d = new java.util.LinkedList();
            b1Var.g();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UserDataOperationReporter", "upload err.");
        }
        return jz5.f0.f384359a;
    }
}
