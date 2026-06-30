package ca4;

/* loaded from: classes4.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f121457d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i64.p0 f121458e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f121459f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f121460g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f121461h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f121462i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f121463m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f121464n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f121465o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f121466p;

    public g0(java.lang.String str, i64.p0 p0Var, java.lang.String str2, int i17, int i18, java.lang.String str3, java.lang.String str4, android.content.Context context, android.content.Intent intent, java.lang.String str5) {
        this.f121457d = str;
        this.f121458e = p0Var;
        this.f121459f = str2;
        this.f121460g = i17;
        this.f121461h = i18;
        this.f121462i = str3;
        this.f121463m = str4;
        this.f121464n = context;
        this.f121465o = intent;
        this.f121466p = str5;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.data.SnsAdUtil$1");
        java.lang.String str = this.f121457d;
        i64.p0 p0Var = this.f121458e;
        ca4.d dVar = new ca4.d(str, p0Var.f370808e, p0Var.f370809f, this.f121459f, p0Var.f370810g, p0Var.f370811h, p0Var.f370812i);
        if (this.f121460g == 1) {
            dVar.b(4);
        } else {
            dVar.b(1);
        }
        int i17 = p0Var.f370813j;
        if (i17 == 106) {
            dVar.c(i17);
        }
        if (p0Var.f370813j != 106) {
            l44.z.k(dVar);
        }
        if (this.f121461h != 2) {
            ca4.c0.e(this.f121462i, this.f121463m, 0, 2, this.f121457d, this.f121459f, this.f121460g);
            l44.z.j(dVar);
        }
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).cj(this.f121464n, this.f121465o, this.f121466p, this.f121461h, new ca4.f0(this, dVar), null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.data.SnsAdUtil$1");
    }
}
