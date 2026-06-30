package wn4;

/* loaded from: classes11.dex */
public final class d implements w73.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wn4.f f529066a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f529067b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.r6 f529068c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f529069d;

    public d(wn4.f fVar, java.lang.String str, com.p314xaae8f345.mm.vfs.r6 r6Var, long j17) {
        this.f529066a = fVar;
        this.f529067b = str;
        this.f529068c = r6Var;
        this.f529069d = j17;
    }

    @Override // w73.d
    public final void a(boolean z17) {
        wn4.f fVar = this.f529066a;
        java.util.HashMap hashMap = fVar.f529074g;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        java.lang.String str = this.f529067b;
        hashMap.put(str, bool);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.f529076i, "HdiffApk, onPatchResult, result.isSuccess = %s, isPatchFileRead = %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(fVar.f529078n));
        if (fVar.f529078n) {
            wn4.x.f529104a.d(this.f529068c, this.f529069d, fVar.f529071d);
            fVar.f529074g.remove(str);
        }
    }
}
