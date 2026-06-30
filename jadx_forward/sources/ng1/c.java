package ng1;

/* loaded from: classes7.dex */
public abstract class c {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f418447c = {p3321xbce91901.jvm.p3324x21ffc6bd.i0.d(new p3321xbce91901.jvm.p3324x21ffc6bd.u(ng1.c.class, "qualitySession", "getQualitySession()Lcom/tencent/mm/plugin/appbrand/report/quality/QualitySession;", 0))};

    /* renamed from: a, reason: collision with root package name */
    public final pg1.a f418448a = new pg1.a("qualitySession", false, new ng1.b(this));

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f418449b = new java.util.LinkedList();

    public void a(jx3.a struct) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(struct, "struct");
        pg1.a aVar = this.f418448a;
        synchronized (aVar) {
            z17 = aVar.f435612d != null;
        }
        if (z17) {
            struct.k();
        } else {
            synchronized (this.f418449b) {
                this.f418449b.add(struct);
            }
        }
    }
}
