package m90;

/* loaded from: classes8.dex */
public class q1 extends tg3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f406439e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f406440f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f406441g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f406442h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(m90.r1 r1Var, int i17, r35.m3 m3Var, java.lang.ref.WeakReference weakReference, java.lang.String str, java.lang.String str2, long j17) {
        super(i17, m3Var);
        this.f406439e = weakReference;
        this.f406440f = str;
        this.f406441g = str2;
        this.f406442h = j17;
    }

    @Override // tg3.a
    public void a(android.view.View view) {
        try {
            if (this.f406439e.get() != null) {
                en0.g gVar = new en0.g();
                gVar.f336779a = 2;
                gVar.f336780b = this.f406440f;
                gVar.f336784f = this.f406441g;
                gVar.f336781c = this.f406442h;
                gVar.f336785g = 1;
                gVar.a();
            }
        } catch (java.lang.Throwable unused) {
        }
    }
}
