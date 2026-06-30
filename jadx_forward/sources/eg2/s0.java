package eg2;

/* loaded from: classes3.dex */
public final class s0 extends eg2.i0 {

    /* renamed from: e, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f334161e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f334162f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f334163g;

    /* renamed from: h, reason: collision with root package name */
    public int f334164h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f334165i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f334166j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f334167k;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f334168l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f334169m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(p3325xe03a0797.p3326xc267989b.y0 taskScope, android.content.Context taskContext) {
        super(taskScope);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskScope, "taskScope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskContext, "taskContext");
        this.f334161e = taskScope;
        this.f334162f = taskContext;
        this.f334163g = "";
        this.f334168l = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f334169m = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    @Override // eg2.i0
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveHDTaskChecker", "cancel called for url: " + this.f334165i);
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f334111c;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f334111c = null;
        this.f334165i = null;
        this.f334166j = null;
        this.f334167k = null;
        this.f334168l.set(false);
        this.f334169m.set(false);
        super.a();
    }

    @Override // eg2.i0
    public java.lang.String b() {
        return this.f334163g;
    }

    @Override // eg2.i0
    public int c() {
        return this.f334164h;
    }
}
