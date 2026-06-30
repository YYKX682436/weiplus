package ca4;

/* loaded from: classes4.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f39924d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i64.p0 f39925e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f39926f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f39927g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f39928h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f39929i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f39930m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f39931n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f39932o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f39933p;

    public g0(java.lang.String str, i64.p0 p0Var, java.lang.String str2, int i17, int i18, java.lang.String str3, java.lang.String str4, android.content.Context context, android.content.Intent intent, java.lang.String str5) {
        this.f39924d = str;
        this.f39925e = p0Var;
        this.f39926f = str2;
        this.f39927g = i17;
        this.f39928h = i18;
        this.f39929i = str3;
        this.f39930m = str4;
        this.f39931n = context;
        this.f39932o = intent;
        this.f39933p = str5;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.data.SnsAdUtil$1");
        java.lang.String str = this.f39924d;
        i64.p0 p0Var = this.f39925e;
        ca4.d dVar = new ca4.d(str, p0Var.f289275e, p0Var.f289276f, this.f39926f, p0Var.f289277g, p0Var.f289278h, p0Var.f289279i);
        if (this.f39927g == 1) {
            dVar.b(4);
        } else {
            dVar.b(1);
        }
        int i17 = p0Var.f289280j;
        if (i17 == 106) {
            dVar.c(i17);
        }
        if (p0Var.f289280j != 106) {
            l44.z.k(dVar);
        }
        if (this.f39928h != 2) {
            ca4.c0.e(this.f39929i, this.f39930m, 0, 2, this.f39924d, this.f39926f, this.f39927g);
            l44.z.j(dVar);
        }
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).cj(this.f39931n, this.f39932o, this.f39933p, this.f39928h, new ca4.f0(this, dVar), null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.data.SnsAdUtil$1");
    }
}
