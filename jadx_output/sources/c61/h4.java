package c61;

/* loaded from: classes10.dex */
public final class h4 implements c01.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qb2.t f39012d;

    public h4(qb2.t tVar) {
        this.f39012d = tVar;
    }

    @Override // c01.da
    public boolean a() {
        return false;
    }

    @Override // c01.da
    public void c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("delete msg end... ");
        qb2.t tVar = this.f39012d;
        sb6.append(tVar.F1);
        sb6.append(' ');
        sb6.append(tVar.field_sessionId);
        com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", sb6.toString());
    }
}
