package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes14.dex */
public class cf implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h11.e f155312d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f155313e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f155314f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f155315g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11461x47892174 f155316h;

    public cf(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11461x47892174 activityC11461x47892174, h11.e eVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f155316h = activityC11461x47892174;
        this.f155312d = eVar;
        this.f155313e = str;
        this.f155314f = str2;
        this.f155315g = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap bitmap;
        synchronized (this.f155312d) {
            if (this.f155312d.m48006xc9602be3()) {
                return;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f155316h.I)) {
                ((o45.eh) this.f155312d.f359604d.mo47979x2d63726f()).f424455a.f454034z = this.f155316h.I;
            }
            fo3.s sVar = fo3.s.INSTANCE;
            if (sVar.wf("ie_reg")) {
                sVar.E7("ie_reg");
            }
            r45.kn5 kn5Var = new r45.kn5();
            kn5Var.f460389d = this.f155313e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11461x47892174 activityC11461x47892174 = this.f155316h;
            if (activityC11461x47892174.f155115z && (bitmap = activityC11461x47892174.E) != null && !bitmap.isRecycled()) {
                kn5Var.f460391f = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.a(this.f155316h.E));
            }
            kn5Var.f460392g = this.f155314f;
            kn5Var.f460390e = this.f155315g;
            kn5Var.f460393h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k0();
            kn5Var.f460394i = java.util.TimeZone.getDefault().getID();
            synchronized (this.f155312d) {
                if (this.f155312d.m48006xc9602be3()) {
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RegByMobileRegAIOUI", "%s,%s", kn5Var.f460393h, kn5Var.f460394i);
                r45.k57 k57Var = new r45.k57();
                r45.cu5 cu5Var = new r45.cu5();
                cu5Var.d(sVar.Ph("ie_reg"));
                k57Var.f459927d = cu5Var;
                r45.cu5 cu5Var2 = new r45.cu5();
                cu5Var2.d(sVar.Ci("ce_reg"));
                k57Var.f459928e = cu5Var2;
                r45.e40 e40Var = new r45.e40();
                e40Var.f454536f = 2L;
                r45.cu5 cu5Var3 = new r45.cu5();
                cu5Var3.d(sVar.Ec(1, e40Var.m75963xebb06ba0()));
                k57Var.f459929f = cu5Var3;
                r45.cu5 cu5Var4 = new r45.cu5();
                cu5Var4.d(sVar.L9());
                k57Var.f459933m = cu5Var4;
                java.lang.String Sf = sVar.Sf("ce_reg");
                if (Sf != null) {
                    r45.cu5 cu5Var5 = new r45.cu5();
                    cu5Var5.d(Sf.getBytes());
                    k57Var.f459934n = cu5Var5;
                }
                try {
                    r45.cu5 cu5Var6 = new r45.cu5();
                    cu5Var6.d(kn5Var.mo14344x5f01b1f6());
                    k57Var.f459930g = cu5Var6;
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.RegByMobileRegAIOUI", e17, "convert to byte error ! %s", e17.getMessage());
                }
                this.f155312d.R(k57Var);
                synchronized (this.f155312d) {
                    if (this.f155312d.m48006xc9602be3()) {
                        return;
                    }
                    gm0.j1.d().g(this.f155312d);
                }
            }
        }
    }
}
