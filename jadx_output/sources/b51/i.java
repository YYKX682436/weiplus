package b51;

/* loaded from: classes10.dex */
public final class i implements fp0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b51.m f18025a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f18026b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f18027c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f18028d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v65.n f18029e;

    public i(b51.m mVar, java.lang.String str, java.lang.String str2, java.lang.String str3, v65.n nVar) {
        this.f18025a = mVar;
        this.f18026b = str;
        this.f18027c = str2;
        this.f18028d = str3;
        this.f18029e = nVar;
    }

    @Override // fp0.p
    public void a(fp0.d dVar, fp0.u status) {
        c51.e task = (c51.e) dVar;
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(status, "status");
        b51.m mVar = this.f18025a;
        java.lang.String str = mVar.f18041a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onLoaderFin] finished tag:");
        sb6.append(this.f18026b);
        sb6.append(", url:");
        sb6.append(this.f18027c);
        sb6.append(", path:");
        java.lang.String str2 = this.f18028d;
        sb6.append(str2);
        sb6.append('}');
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        boolean e17 = b51.m.e(mVar, str2);
        v65.n nVar = this.f18029e;
        if (e17) {
            nVar.a(org.libpag.PAGFile.Load(str2));
        } else {
            nVar.a(null);
        }
    }
}
