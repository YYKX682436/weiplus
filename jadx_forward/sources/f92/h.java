package f92;

/* loaded from: classes10.dex */
public final class h implements c01.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f341781d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qb2.t f341782e;

    public h(java.lang.String str, qb2.t tVar) {
        this.f341781d = str;
        this.f341782e = tVar;
    }

    @Override // c01.da
    public boolean a() {
        return false;
    }

    @Override // c01.da
    public void c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[deleteMyLocalAccountData] finderUsername=");
        sb6.append(this.f341781d);
        sb6.append(" delete msg end... ");
        qb2.t tVar = this.f341782e;
        sb6.append(tVar.F1);
        sb6.append(' ');
        sb6.append(tVar.f65866xbed8694c);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AccountLogicHandler", sb6.toString());
    }
}
