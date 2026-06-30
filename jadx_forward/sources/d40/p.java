package d40;

/* loaded from: classes9.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f307902d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f307903e;

    public p(java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f307902d = str;
        this.f307903e = f9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a00.i iVar = (a00.i) i95.n0.c(a00.i.class);
        int mo78013xfb85f7b0 = this.f307903e.mo78013xfb85f7b0();
        java.lang.String str = this.f307902d;
        zz.b bj6 = ((t02.e) iVar).bj(str, mo78013xfb85f7b0, null, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileMsgFeatureService", "recordCheckDup:%s ret:%s hitCache:%s copyResult:%s replaceResult:%s", str, java.lang.Integer.valueOf(bj6.f559224a), java.lang.Boolean.valueOf(bj6.f559225b), java.lang.Boolean.valueOf(bj6.f559227d), java.lang.Long.valueOf(bj6.f559228e));
    }
}
