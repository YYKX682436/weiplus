package nd1;

/* loaded from: classes7.dex */
public final class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 f417874d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f417875e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f417876f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f417877g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f417878h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f417879i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f417880m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ nd1.p0 f417881n;

    public n0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 i3Var, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, int i18, nd1.p0 p0Var) {
        this.f417874d = i3Var;
        this.f417875e = i17;
        this.f417876f = str;
        this.f417877g = str2;
        this.f417878h = str3;
        this.f417879i = yVar;
        this.f417880m = i18;
        this.f417881n = p0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nd1.p0 p0Var = this.f417881n;
        int i17 = this.f417880m;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = this.f417879i;
        try {
            yVar.a(i17, p0Var.o(this.f417874d.b0(this.f417875e, this.f417876f, this.f417877g, this.f417878h) ? "ok" : "fail"));
        } catch (java.lang.UnsupportedOperationException unused) {
            yVar.a(i17, p0Var.o("fail:not supported"));
        }
    }
}
