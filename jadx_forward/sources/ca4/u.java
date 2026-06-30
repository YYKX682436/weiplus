package ca4;

/* loaded from: classes15.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f121561d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f121562e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ca4.v f121563f;

    public u(ca4.v vVar, java.lang.Object obj, int i17) {
        this.f121563f = vVar;
        this.f121561d = obj;
        this.f121562e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        ca4.v vVar = this.f121563f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper$4$1$1");
        try {
            byte[] bArr = (byte[]) this.f121561d;
            ca4.b0 b0Var = vVar.f121564a.f121591c;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            kd0.p2 p2Var = b0Var.f121362c;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            ca4.x xVar = vVar.f121564a;
            if (p2Var != null) {
                ca4.b0 b0Var2 = xVar.f121591c;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
                kd0.p2 p2Var2 = b0Var2.f121362c;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636) p2Var2).o(this.f121562e, bArr);
            }
            if (ca4.b0.a(xVar.f121591c) != null) {
                ca4.b0.a(xVar.f121591c).v();
            }
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdQRHelper", "there is something wrong in AdLandingPagesProxy call back");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper$4$1$1");
    }
}
