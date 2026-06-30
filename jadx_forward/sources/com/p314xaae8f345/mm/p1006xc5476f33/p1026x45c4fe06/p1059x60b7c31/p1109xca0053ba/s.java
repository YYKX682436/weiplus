package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba;

/* loaded from: classes7.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f4 f164575d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.t f164576e;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.t tVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f4 f4Var) {
        this.f164576e = tVar;
        this.f164575d = f4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.b0 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.b0.a(this.f164576e.f164577a, false);
        if (a17 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f4 f4Var = this.f164575d;
            a17.f164520e = f4Var;
            if (a17.f164516a) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f4 f4Var2 = a17.f164521f;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f4 f4Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f4.LANDSCAPE;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f4 f4Var4 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f4.REVERSE_LANDSCAPE;
                if (f4Var2 == f4Var3 || f4Var2 == f4Var4) {
                    if (f4Var == f4Var4 || f4Var == f4Var3) {
                        a17.d(f4Var);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OrientationConfigListenerHelper", "onFourOrientationsChange mAppid:" + a17.f164517b + "; mOrientation:" + f4Var.name());
                    }
                }
            }
        }
    }
}
