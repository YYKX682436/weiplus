package y73;

/* loaded from: classes11.dex */
public class l0 implements w73.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f541266a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.io.File f541267b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f541268c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y73.d0 f541269d;

    public l0(y73.d0 d0Var, java.lang.String str, java.io.File file, long j17) {
        this.f541269d = d0Var;
        this.f541266a = str;
        this.f541267b = file;
        this.f541268c = j17;
    }

    @Override // w73.d
    public void a(boolean z17) {
        this.f541269d.f541243h.put(this.f541266a, java.lang.Boolean.TRUE);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.SyncResponseProcessor", "HdiffApk, onPatchResult, result.isSuccess = %s, isPatchFileRead = %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(this.f541269d.f541246n));
        if (this.f541269d.f541246n) {
            this.f541269d.e(this.f541267b, this.f541268c);
            this.f541269d.f541243h.remove(this.f541266a);
        }
    }
}
