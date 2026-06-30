package ec1;

/* loaded from: classes7.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f332472d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f332473e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.t9 f332474f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f332475g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f332476h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f332477i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f332478m;

    public c(ec1.a aVar, java.util.concurrent.atomic.AtomicBoolean atomicBoolean, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.t9 t9Var, int i17, int i18, int i19, boolean z17) {
        this.f332472d = atomicBoolean;
        this.f332473e = context;
        this.f332474f = t9Var;
        this.f332475g = i17;
        this.f332476h = i18;
        this.f332477i = i19;
        this.f332478m = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f332475g;
        android.content.Context context = this.f332473e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.t9 t9Var = this.f332474f;
        boolean a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.u9.a(context, t9Var, i17, false);
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f332472d;
        atomicBoolean.set(a17);
        if (atomicBoolean.get()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(443L, 1L, 1L, false);
        }
        if (context == null || !atomicBoolean.get()) {
            return;
        }
        ae0.h hVar = (ae0.h) i95.n0.c(ae0.h.class);
        android.content.Context context2 = this.f332473e;
        int i18 = this.f332476h;
        int i19 = this.f332477i;
        boolean z17 = this.f332478m;
        java.lang.String str = t9Var.f170508d;
        ((zd0.e) hVar).getClass();
        xp1.d.h(context2, i18, i19, z17, str, true);
    }
}
