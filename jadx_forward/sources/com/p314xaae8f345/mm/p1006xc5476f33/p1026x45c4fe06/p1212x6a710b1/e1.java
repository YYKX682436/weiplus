package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1;

/* loaded from: classes7.dex */
public abstract class e1 extends k75.k {

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d1 f171942g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.c1 f171943h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f171944i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Queue f171945m;

    public e1(java.lang.String str, android.os.Looper looper) {
        super(str, looper);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d1 d1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d1(this, null);
        this.f171942g = d1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.c1 c1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.c1(this, null);
        this.f171943h = c1Var;
        this.f171945m = new java.util.LinkedList();
        this.f171944i = str;
        c(d1Var);
        c(c1Var);
        m(d1Var);
        n();
    }

    public static void q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.e1 e1Var) {
        java.lang.Object poll;
        synchronized (e1Var.f171945m) {
            poll = ((java.util.LinkedList) e1Var.f171945m).poll();
        }
        if (poll != null) {
            e1Var.o(e1Var.f171943h);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.j jVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.j) poll;
            jVar.toString();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.i iVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.i) jVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandAuthJsApiQueue", "about to call AuthInvoke, api[%s]", iVar.f161114e.f386379d);
            boolean mo50262x39e05d35 = iVar.f161110a.mo50262x39e05d35();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.l lVar = iVar.f161112c;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.n0 n0Var = iVar.f161111b;
            if (mo50262x39e05d35) {
                n0Var.C(iVar.f161113d, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.a(lVar));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandAuthJsApiQueue", "doAuth but component not running, api = %s", n0Var.k());
                lVar.l(2);
            }
        }
    }

    @Override // k75.k
    public void i() {
        synchronized (this.f171945m) {
            ((java.util.LinkedList) this.f171945m).clear();
        }
    }
}
