package od2;

/* loaded from: classes12.dex */
public class g extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f426145n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ od2.k f426146o;

    public g(od2.k kVar, java.lang.String str) {
        this.f426146o = kVar;
        this.f426145n = str;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "DeleteFinderFollowTask";
    }

    @Override // p13.c
    public boolean i() {
        java.lang.String str = this.f426145n;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchFinderFollowerLogic", "delete we app info id=%s", str);
        this.f426146o.f426154f.m0(o13.d.f423753f, str);
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return java.lang.String.format("{id: %s}", this.f426145n);
    }
}
