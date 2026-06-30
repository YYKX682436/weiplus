package b51;

/* loaded from: classes10.dex */
public final class i implements fp0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b51.m f99558a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f99559b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f99560c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f99561d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v65.n f99562e;

    public i(b51.m mVar, java.lang.String str, java.lang.String str2, java.lang.String str3, v65.n nVar) {
        this.f99558a = mVar;
        this.f99559b = str;
        this.f99560c = str2;
        this.f99561d = str3;
        this.f99562e = nVar;
    }

    @Override // fp0.p
    public void a(fp0.d dVar, fp0.u status) {
        c51.e task = (c51.e) dVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        b51.m mVar = this.f99558a;
        java.lang.String str = mVar.f99574a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onLoaderFin] finished tag:");
        sb6.append(this.f99559b);
        sb6.append(", url:");
        sb6.append(this.f99560c);
        sb6.append(", path:");
        java.lang.String str2 = this.f99561d;
        sb6.append(str2);
        sb6.append('}');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        boolean e17 = b51.m.e(mVar, str2);
        v65.n nVar = this.f99562e;
        if (e17) {
            nVar.a(org.p3363xbe4143f1.C29690xfae77312.m154716x243906(str2));
        } else {
            nVar.a(null);
        }
    }
}
