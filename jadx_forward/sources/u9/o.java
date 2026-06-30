package u9;

/* loaded from: classes15.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f507311d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f507312e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u9.s f507313f;

    public o(u9.s sVar, int i17, long j17) {
        this.f507313f = sVar;
        this.f507311d = i17;
        this.f507312e = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f507313f.f507324b.g(this.f507311d, this.f507312e);
    }
}
