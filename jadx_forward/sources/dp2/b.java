package dp2;

/* loaded from: classes2.dex */
public final class b implements ss5.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f323718a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f323719b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f323720c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f323721d;

    public b(java.lang.String str, long j17, java.lang.String str2, yz5.l lVar) {
        this.f323718a = str;
        this.f323719b = j17;
        this.f323720c = str2;
        this.f323721d = lVar;
    }

    @Override // ss5.d0
    public void a() {
        pp2.a aVar = pp2.a.f438999a;
        long j17 = this.f323719b;
        aVar.a(this.f323718a, 0, java.lang.String.valueOf(j17), dp2.e.a(dp2.e.f323725a, j17, this.f323720c));
    }

    @Override // ss5.d0
    /* renamed from: onFailed */
    public void mo125864x428b6afc(int i17) {
        yz5.l lVar = this.f323721d;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Integer.valueOf(i17));
        }
        pp2.a aVar = pp2.a.f438999a;
        long j17 = this.f323719b;
        aVar.a(this.f323718a, i17, java.lang.String.valueOf(j17), dp2.e.a(dp2.e.f323725a, j17, this.f323720c));
    }
}
