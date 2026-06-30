package k02;

/* loaded from: classes8.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f384622d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vz.w1 f384623e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c02.m f384624f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f384625g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f384626h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f384627i;

    public p(android.content.Context context, vz.w1 w1Var, c02.m mVar, java.lang.String str, java.lang.String str2, int i17) {
        this.f384622d = context;
        this.f384623e = w1Var;
        this.f384624f = mVar;
        this.f384625g = str;
        this.f384626h = str2;
        this.f384627i = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context = this.f384622d;
        vz.w1 w1Var = this.f384623e;
        c02.e app_info = this.f384624f.f119141f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(app_info, "app_info");
        k02.s.a(context, w1Var, app_info, this.f384625g, null, this.f384626h, this.f384627i);
    }
}
