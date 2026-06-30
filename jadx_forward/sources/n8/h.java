package n8;

/* loaded from: classes15.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f417055d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f417056e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f417057f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n8.m f417058g;

    public h(n8.m mVar, java.lang.String str, long j17, long j18) {
        this.f417058g = mVar;
        this.f417055d = str;
        this.f417056e = j17;
        this.f417057f = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f417058g.f417070b.c(this.f417055d, this.f417056e, this.f417057f);
    }
}
