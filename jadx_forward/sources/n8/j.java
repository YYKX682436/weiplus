package n8;

/* loaded from: classes15.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f417061d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f417062e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f417063f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n8.m f417064g;

    public j(n8.m mVar, int i17, long j17, long j18) {
        this.f417064g = mVar;
        this.f417061d = i17;
        this.f417062e = j17;
        this.f417063f = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f417064g.f417070b.x(this.f417061d, this.f417062e, this.f417063f);
    }
}
