package pc0;

/* loaded from: classes10.dex */
public final class d2 implements p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f434778a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pc0.e2 f434779b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.b f434780c;

    public d2(java.lang.String str, pc0.e2 e2Var, p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.b bVar) {
        this.f434778a = str;
        this.f434779b = e2Var;
        this.f434780c = bVar;
    }

    @Override // p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.b
    public void a(java.lang.Object obj) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("restoreCallback callback key:");
        java.lang.String str = this.f434778a;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaOptService", sb6.toString());
        this.f434779b.f434782d.remove(str);
        this.f434780c.a((qc0.m1) obj);
    }
}
