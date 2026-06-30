package i53;

/* loaded from: classes15.dex */
public class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f370262d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f370263e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f370264f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f370265g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f370266h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f370267i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i53.u0 f370268m;

    public t0(i53.u0 u0Var, boolean z17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4) {
        this.f370268m = u0Var;
        this.f370262d = z17;
        this.f370263e = str;
        this.f370264f = str2;
        this.f370265g = str3;
        this.f370266h = i17;
        this.f370267i = str4;
    }

    @Override // java.lang.Runnable
    public void run() {
        m33.o1 o1Var;
        boolean z17 = this.f370262d;
        i53.u0 u0Var = this.f370268m;
        if (z17) {
            i53.v0 v0Var = u0Var.f370275a;
            v0Var.f370287f.add(this.f370263e);
            v0Var.f370288g.add(this.f370264f);
            v0Var.f370289h.add(this.f370265g);
        } else {
            m33.o1 o1Var2 = u0Var.f370275a.f370286e;
            if (o1Var2 != null) {
                ((u93.m) o1Var2).a(false, this.f370266h, null, null, null, null);
                i53.v0.b(u0Var.f370275a);
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameHaowanUploadTask", "upload list size : %d, hasPushAllUpload: %b", java.lang.Integer.valueOf(((java.util.HashSet) u0Var.f370275a.f370283b).size()), java.lang.Boolean.valueOf(u0Var.f370275a.f370285d));
        if (((java.util.HashSet) u0Var.f370275a.f370283b).isEmpty()) {
            i53.v0 v0Var2 = u0Var.f370275a;
            if (!v0Var2.f370285d || (o1Var = v0Var2.f370286e) == null) {
                return;
            }
            ((u93.m) o1Var).a(true, this.f370266h, v0Var2.f370287f, v0Var2.f370288g, v0Var2.f370289h, this.f370267i);
            i53.v0.b(u0Var.f370275a);
        }
    }
}
