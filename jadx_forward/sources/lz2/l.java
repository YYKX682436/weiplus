package lz2;

/* loaded from: classes9.dex */
public class l implements pz2.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lz2.n f403874d;

    public l(lz2.n nVar) {
        this.f403874d = nVar;
    }

    @Override // pz2.b
    public void h(int i17, java.lang.String str) {
        lz2.n nVar = this.f403874d;
        if (i17 != 0) {
            nVar.f403879d.m83114xe5d7a18f();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletFaceIdAuthUI", "open fingerprintpay failed");
            com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.p1694xb393c038.p1695x2ddda8.ActivityC15521xdb435b6d activityC15521xdb435b6d = nVar.f403879d;
            activityC15521xdb435b6d.U6(activityC15521xdb435b6d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c8v));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.h6.f34350x366c91de, 2);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletFaceIdAuthUI", "open fingerprintpay success");
        nVar.f403879d.m83099x5406100e(new ss4.e0(null, 19), false);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Integer.valueOf(nVar.c() == 1 ? 1 : 2);
        g0Var.d(15817, objArr);
        g0Var.A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.h6.f34350x366c91de, 1);
    }
}
