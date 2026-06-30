package ho1;

/* loaded from: classes5.dex */
public final class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho1.a1 f364373d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f364374e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f364375f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f364376g;

    public w0(ho1.a1 a1Var, long j17, java.lang.String str, int i17) {
        this.f364373d = a1Var;
        this.f364374e = j17;
        this.f364375f = str;
        this.f364376g = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f364373d.f364155a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyProgressChanged pkgId=");
        long j17 = this.f364374e;
        sb6.append(j17);
        sb6.append(", transferStatus=");
        java.lang.String str2 = this.f364375f;
        sb6.append(str2);
        sb6.append(", progress=");
        int i17 = this.f364376g;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        ((nv.v1) i95.n0.c(nv.v1.class)).Bi(j17, str2, i17);
    }
}
