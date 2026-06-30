package s75;

/* loaded from: classes5.dex */
public class c implements wu5.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f486165d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f486166e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f486167f;

    public c(s75.d dVar, boolean z17, java.lang.String str, java.lang.Runnable runnable) {
        this.f486165d = z17;
        this.f486166e = str;
        this.f486167f = runnable;
    }

    @Override // wu5.f
    public boolean a() {
        return this.f486165d;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return this.f486166e;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f486167f.run();
    }
}
