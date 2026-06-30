package p012xc85e97e9.p125x37c711;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/ListenableWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime-ktx_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: androidx.work.CoroutineWorker */
/* loaded from: classes13.dex */
public abstract class AbstractC1259xaa333856 extends p012xc85e97e9.p125x37c711.AbstractC1260xfe49ee9f {

    /* renamed from: i, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.c0 f93988i;

    /* renamed from: m, reason: collision with root package name */
    public final l5.m f93989m;

    /* renamed from: n, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p0 f93990n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1259xaa333856(android.content.Context appContext, p012xc85e97e9.p125x37c711.C1264xcd547028 params) {
        super(appContext, params);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appContext, "appContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        this.f93988i = p3325xe03a0797.p3326xc267989b.v2.a(null, 1, null);
        l5.m mVar = new l5.m();
        this.f93989m = mVar;
        mVar.mo606x162a7075(new a5.i(this), ((m5.c) this.f93992e.f94002e).f405003a);
        this.f93990n = p3325xe03a0797.p3326xc267989b.q1.f392101a;
    }

    @Override // p012xc85e97e9.p125x37c711.AbstractC1260xfe49ee9f
    public final wa.a b() {
        p3325xe03a0797.p3326xc267989b.c0 a17 = p3325xe03a0797.p3326xc267989b.v2.a(null, 1, null);
        p3325xe03a0797.p3326xc267989b.y0 a18 = p3325xe03a0797.p3326xc267989b.z0.a(this.f93990n.mo7096x348d9a(a17));
        a5.u uVar = new a5.u(a17, null, 2, null);
        p3325xe03a0797.p3326xc267989b.l.d(a18, null, null, new a5.j(uVar, this, null), 3, null);
        return uVar;
    }

    @Override // p012xc85e97e9.p125x37c711.AbstractC1260xfe49ee9f
    public final void d() {
        this.f93989m.cancel(false);
    }

    @Override // p012xc85e97e9.p125x37c711.AbstractC1260xfe49ee9f
    public final wa.a e() {
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.a(this.f93990n.mo7096x348d9a(this.f93988i)), null, null, new a5.k(this, null), 3, null);
        return this.f93989m;
    }

    public abstract java.lang.Object h(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57);
}
