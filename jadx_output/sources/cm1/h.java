package cm1;

/* loaded from: classes14.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f43298d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f43299e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f43300f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f43301g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.bd f43302h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f43303i;

    public h(long j17, java.lang.String str, java.lang.String str2, int i17, com.tencent.mm.plugin.appbrand.launching.bd bdVar, android.content.Context context) {
        this.f43298d = j17;
        this.f43299e = str;
        this.f43300f = str2;
        this.f43301g = i17;
        this.f43302h = bdVar;
        this.f43303i = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cm1.f fVar = cm1.t.f43318c;
        long j17 = this.f43298d;
        boolean z17 = false;
        if (fVar != null && fVar.f43287f == j17) {
            z17 = true;
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WMPFVoip.WMPFVoipCallInManager", "[enterWxaVoipCallingPage] callingInstanceId is not match");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[enterWxaVoipCallingPage] appId=");
        java.lang.String str = this.f43299e;
        sb6.append(str);
        sb6.append("  enterPath=");
        java.lang.String str2 = this.f43300f;
        sb6.append(str2);
        sb6.append(" versionType=");
        int i17 = this.f43301g;
        sb6.append(i17);
        sb6.append(" callingInstanceId=");
        sb6.append(j17);
        com.tencent.mars.xlog.Log.i("MicroMsg.WMPFVoip.WMPFVoipCallInManager", sb6.toString());
        l81.b1 b1Var = new l81.b1();
        b1Var.f317014b = str;
        b1Var.f317016c = i17;
        b1Var.f317022f = str2;
        b1Var.X = k91.b1.f305542f;
        b1Var.f317032k = 1225;
        com.tencent.mm.plugin.appbrand.launching.bd bdVar = this.f43302h;
        if (bdVar != null) {
            b1Var.L = new com.tencent.mm.plugin.appbrand.launching.dd(bdVar);
        }
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(this.f43303i, b1Var);
        cm1.t.f43316a.d();
    }
}
