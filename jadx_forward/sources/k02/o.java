package k02;

/* loaded from: classes8.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f384616d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vz.w1 f384617e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c02.m f384618f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f384619g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f384620h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f384621i;

    public o(android.content.Context context, vz.w1 w1Var, c02.m mVar, java.lang.String str, java.lang.String str2, int i17) {
        this.f384616d = context;
        this.f384617e = w1Var;
        this.f384618f = mVar;
        this.f384619g = str;
        this.f384620h = str2;
        this.f384621i = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context = this.f384616d;
        vz.w1 w1Var = this.f384617e;
        c02.m mVar = this.f384618f;
        c02.e app_info = mVar.f119141f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(app_info, "app_info");
        k02.s.a(context, w1Var, app_info, this.f384619g, mVar.f119140e, this.f384620h, this.f384621i);
    }
}
