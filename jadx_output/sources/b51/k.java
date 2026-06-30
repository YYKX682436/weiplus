package b51;

/* loaded from: classes10.dex */
public final class k implements fp0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b51.m f18035a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f18036b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f18037c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f18038d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v65.n f18039e;

    public k(b51.m mVar, java.lang.String str, java.lang.String str2, java.lang.String str3, v65.n nVar) {
        this.f18035a = mVar;
        this.f18036b = str;
        this.f18037c = str2;
        this.f18038d = str3;
        this.f18039e = nVar;
    }

    @Override // fp0.p
    public void a(fp0.d dVar, fp0.u status) {
        c51.e task = (c51.e) dVar;
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(status, "status");
        b51.m mVar = this.f18035a;
        java.lang.String str = mVar.f18041a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onLoaderFin] finished tag:");
        sb6.append(this.f18036b);
        sb6.append(", url:");
        sb6.append(this.f18037c);
        sb6.append(", path:");
        java.lang.String str2 = this.f18038d;
        sb6.append(str2);
        sb6.append('}');
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        boolean e17 = b51.m.e(mVar, str2);
        v65.n nVar = this.f18039e;
        if (e17) {
            nVar.a(com.tencent.mm.rfx.RfxPagFile.Load(str2));
        } else {
            nVar.a(null);
        }
    }
}
