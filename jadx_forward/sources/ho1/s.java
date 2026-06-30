package ho1;

/* loaded from: classes15.dex */
public final class s implements ro1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ho1.v f364335a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f364336b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f364337c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f364338d;

    public s(ho1.v vVar, long j17, long j18, long j19) {
        this.f364335a = vVar;
        this.f364336b = j17;
        this.f364337c = j18;
        this.f364338d = j19;
    }

    @Override // ro1.d
    public void a(long j17) {
        ho1.v vVar = this.f364335a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(vVar.f364362a, "copyLocal2UDisk onCopied " + j17 + " taskId = " + this.f364336b + ", time = " + (java.lang.System.currentTimeMillis() - this.f364337c));
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.t0 t0Var = vVar.f364369h;
        if (t0Var != null) {
            t0Var.M0(this.f364338d, j17, 0L);
        }
    }
}
