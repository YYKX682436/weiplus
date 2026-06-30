package d5;

/* loaded from: classes13.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final d5.k f308026d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Intent f308027e;

    /* renamed from: f, reason: collision with root package name */
    public final int f308028f;

    public h(d5.k kVar, android.content.Intent intent, int i17) {
        this.f308026d = kVar;
        this.f308027e = intent;
        this.f308028f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f308026d.a(this.f308027e, this.f308028f);
    }
}
