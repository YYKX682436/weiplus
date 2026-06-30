package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class cf implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h11.e f73779d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f73780e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f73781f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f73782g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI f73783h;

    public cf(com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI regByMobileRegAIOUI, h11.e eVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f73783h = regByMobileRegAIOUI;
        this.f73779d = eVar;
        this.f73780e = str;
        this.f73781f = str2;
        this.f73782g = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap bitmap;
        synchronized (this.f73779d) {
            if (this.f73779d.isCanceled()) {
                return;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f73783h.I)) {
                ((o45.eh) this.f73779d.f278071d.getReqObj()).f342922a.f372501z = this.f73783h.I;
            }
            fo3.s sVar = fo3.s.INSTANCE;
            if (sVar.wf("ie_reg")) {
                sVar.E7("ie_reg");
            }
            r45.kn5 kn5Var = new r45.kn5();
            kn5Var.f378856d = this.f73780e;
            com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI regByMobileRegAIOUI = this.f73783h;
            if (regByMobileRegAIOUI.f73582z && (bitmap = regByMobileRegAIOUI.E) != null && !bitmap.isRecycled()) {
                kn5Var.f378858f = com.tencent.mm.sdk.platformtools.w2.b(com.tencent.mm.sdk.platformtools.x.a(this.f73783h.E));
            }
            kn5Var.f378859g = this.f73781f;
            kn5Var.f378857e = this.f73782g;
            kn5Var.f378860h = com.tencent.mm.sdk.platformtools.t8.k0();
            kn5Var.f378861i = java.util.TimeZone.getDefault().getID();
            synchronized (this.f73779d) {
                if (this.f73779d.isCanceled()) {
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.RegByMobileRegAIOUI", "%s,%s", kn5Var.f378860h, kn5Var.f378861i);
                r45.k57 k57Var = new r45.k57();
                r45.cu5 cu5Var = new r45.cu5();
                cu5Var.d(sVar.Ph("ie_reg"));
                k57Var.f378394d = cu5Var;
                r45.cu5 cu5Var2 = new r45.cu5();
                cu5Var2.d(sVar.Ci("ce_reg"));
                k57Var.f378395e = cu5Var2;
                r45.e40 e40Var = new r45.e40();
                e40Var.f373003f = 2L;
                r45.cu5 cu5Var3 = new r45.cu5();
                cu5Var3.d(sVar.Ec(1, e40Var.toByteArrayOrNull()));
                k57Var.f378396f = cu5Var3;
                r45.cu5 cu5Var4 = new r45.cu5();
                cu5Var4.d(sVar.L9());
                k57Var.f378400m = cu5Var4;
                java.lang.String Sf = sVar.Sf("ce_reg");
                if (Sf != null) {
                    r45.cu5 cu5Var5 = new r45.cu5();
                    cu5Var5.d(Sf.getBytes());
                    k57Var.f378401n = cu5Var5;
                }
                try {
                    r45.cu5 cu5Var6 = new r45.cu5();
                    cu5Var6.d(kn5Var.toByteArray());
                    k57Var.f378397g = cu5Var6;
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.RegByMobileRegAIOUI", e17, "convert to byte error ! %s", e17.getMessage());
                }
                this.f73779d.R(k57Var);
                synchronized (this.f73779d) {
                    if (this.f73779d.isCanceled()) {
                        return;
                    }
                    gm0.j1.d().g(this.f73779d);
                }
            }
        }
    }
}
