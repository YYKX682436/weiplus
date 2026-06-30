package k5;

/* loaded from: classes13.dex */
public class r implements java.lang.Runnable {

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String f385686m = a5.a0.e("WorkForegroundRunnable");

    /* renamed from: d, reason: collision with root package name */
    public final l5.m f385687d = new l5.m();

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f385688e;

    /* renamed from: f, reason: collision with root package name */
    public final j5.w f385689f;

    /* renamed from: g, reason: collision with root package name */
    public final p012xc85e97e9.p125x37c711.AbstractC1260xfe49ee9f f385690g;

    /* renamed from: h, reason: collision with root package name */
    public final a5.p f385691h;

    /* renamed from: i, reason: collision with root package name */
    public final m5.a f385692i;

    public r(android.content.Context context, j5.w wVar, p012xc85e97e9.p125x37c711.AbstractC1260xfe49ee9f abstractC1260xfe49ee9f, a5.p pVar, m5.a aVar) {
        this.f385688e = context;
        this.f385689f = wVar;
        this.f385690g = abstractC1260xfe49ee9f;
        this.f385691h = pVar;
        this.f385692i = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!this.f385689f.f379313q || j3.b.b()) {
            this.f385687d.i(null);
            return;
        }
        l5.m mVar = new l5.m();
        m5.a aVar = this.f385692i;
        ((m5.b) ((m5.c) aVar).f405005c).execute(new k5.p(this, mVar));
        mVar.mo606x162a7075(new k5.q(this, mVar), ((m5.c) aVar).f405005c);
    }
}
