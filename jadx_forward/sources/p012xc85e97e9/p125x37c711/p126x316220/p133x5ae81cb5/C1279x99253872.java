package p012xc85e97e9.p125x37c711.p126x316220.p133x5ae81cb5;

/* renamed from: androidx.work.impl.workers.ConstraintTrackingWorker */
/* loaded from: classes13.dex */
public class C1279x99253872 extends p012xc85e97e9.p125x37c711.AbstractC1260xfe49ee9f implements f5.c {

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.String f94029q = a5.a0.e("ConstraintTrkngWrkr");

    /* renamed from: i, reason: collision with root package name */
    public final p012xc85e97e9.p125x37c711.C1264xcd547028 f94030i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Object f94031m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f94032n;

    /* renamed from: o, reason: collision with root package name */
    public final l5.m f94033o;

    /* renamed from: p, reason: collision with root package name */
    public p012xc85e97e9.p125x37c711.AbstractC1260xfe49ee9f f94034p;

    public C1279x99253872(android.content.Context context, p012xc85e97e9.p125x37c711.C1264xcd547028 c1264xcd547028) {
        super(context, c1264xcd547028);
        this.f94030i = c1264xcd547028;
        this.f94031m = new java.lang.Object();
        this.f94032n = false;
        this.f94033o = new l5.m();
    }

    @Override // f5.c
    public void a(java.util.List list) {
        a5.a0.c().a(f94029q, java.lang.String.format("Constraints changed for %s", list), new java.lang.Throwable[0]);
        synchronized (this.f94031m) {
            this.f94032n = true;
        }
    }

    @Override // p012xc85e97e9.p125x37c711.AbstractC1260xfe49ee9f
    public boolean c() {
        p012xc85e97e9.p125x37c711.AbstractC1260xfe49ee9f abstractC1260xfe49ee9f = this.f94034p;
        return abstractC1260xfe49ee9f != null && abstractC1260xfe49ee9f.c();
    }

    @Override // p012xc85e97e9.p125x37c711.AbstractC1260xfe49ee9f
    public void d() {
        p012xc85e97e9.p125x37c711.AbstractC1260xfe49ee9f abstractC1260xfe49ee9f = this.f94034p;
        if (abstractC1260xfe49ee9f == null || abstractC1260xfe49ee9f.f93993f) {
            return;
        }
        this.f94034p.g();
    }

    @Override // p012xc85e97e9.p125x37c711.AbstractC1260xfe49ee9f
    public wa.a e() {
        this.f93992e.f94001d.execute(new n5.a(this));
        return this.f94033o;
    }

    @Override // f5.c
    public void f(java.util.List list) {
    }
}
