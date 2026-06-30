package d9;

/* loaded from: classes15.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f308863d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 f308864e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f308865f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f308866g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f308867h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d9.g f308868i;

    public e(d9.g gVar, int i17, com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 c1601x7dc4e417, int i18, java.lang.Object obj, long j17) {
        this.f308868i = gVar;
        this.f308863d = i17;
        this.f308864e = c1601x7dc4e417;
        this.f308865f = i18;
        this.f308866g = obj;
        this.f308867h = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        d9.g gVar = this.f308868i;
        gVar.f308883b.a(this.f308863d, this.f308864e, this.f308865f, this.f308866g, d9.g.a(gVar, this.f308867h));
    }
}
