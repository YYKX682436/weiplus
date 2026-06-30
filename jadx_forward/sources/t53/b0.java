package t53;

/* loaded from: classes8.dex */
public final class b0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f497256a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f497257b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f497258c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f497259d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f497260e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f497261f;

    public b0(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, long j17, java.lang.String str4) {
        this.f497256a = str;
        this.f497257b = str2;
        this.f497258c = str3;
        this.f497259d = i17;
        this.f497260e = j17;
        this.f497261f = str4;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.lang.String str;
        y53.m Di = ((y53.x) ((u53.y) i95.n0.c(u53.y.class))).Di(this.f497256a);
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.d dVar = com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.e.f149727a;
        if (this.f497257b == null || (str = this.f497258c) == null) {
            dVar.c(this.f497259d, this.f497260e, "", Di.f67426x9f600742, this.f497256a, 0L, "", this.f497261f);
            return null;
        }
        if (((y53.x) ((u53.y) i95.n0.c(u53.y.class))).Di(str) == null) {
            return null;
        }
        dVar.c(this.f497259d, this.f497260e, this.f497257b, Di.f67426x9f600742, this.f497256a, r14.f67426x9f600742, this.f497258c, this.f497261f);
        return null;
    }
}
