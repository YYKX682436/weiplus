package v72;

/* loaded from: classes12.dex */
public class d extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final long f515184n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v72.i f515185o;

    public d(v72.i iVar, long j17) {
        this.f515185o = iVar;
        this.f515184n = j17;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "DeleteFavItemTask";
    }

    @Override // p13.c
    public boolean i() {
        this.f515185o.f515200h.F(o13.d.f423749b, this.f515184n);
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return java.lang.String.format("{favItemId: %d}", java.lang.Long.valueOf(this.f515184n));
    }
}
