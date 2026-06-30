package e80;

/* loaded from: classes12.dex */
public final class l implements s70.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r70.g f331564a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e80.r f331565b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f331566c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f331567d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f331568e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f331569f;

    public l(r70.g gVar, e80.r rVar, long j17, long j18, float f17, float f18) {
        this.f331564a = gVar;
        this.f331565b = rVar;
        this.f331566c = j17;
        this.f331567d = j18;
        this.f331568e = f17;
        this.f331569f = f18;
    }

    public void a(s70.e event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        r70.c cVar = new r70.c(this.f331564a, r70.d.f474617e);
        cVar.f474609c = this.f331566c;
        cVar.f474610d = this.f331567d;
        float f17 = this.f331569f;
        float f18 = this.f331568e;
        cVar.f474611e = f18 + ((f17 - f18) * event.f485468c);
        this.f331565b.V6(cVar);
    }
}
