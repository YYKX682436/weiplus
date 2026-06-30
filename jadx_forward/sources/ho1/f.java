package ho1;

/* loaded from: classes15.dex */
public final class f implements ro1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ho1.v f364196a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f364197b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f364198c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f364199d;

    public f(ho1.v vVar, long j17, long j18, long j19) {
        this.f364196a = vVar;
        this.f364197b = j17;
        this.f364198c = j18;
        this.f364199d = j19;
    }

    @Override // ro1.d
    public void a(long j17) {
        ho1.v vVar = this.f364196a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(vVar.f364362a, "copyUDisk2Local onCopied " + j17 + " taskId = " + this.f364197b + ", time = " + (java.lang.System.currentTimeMillis() - this.f364198c));
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.t0 t0Var = vVar.f364369h;
        if (t0Var != null) {
            t0Var.q1(this.f364199d, j17, 0L);
        }
    }
}
