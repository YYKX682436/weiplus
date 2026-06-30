package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui;

/* loaded from: classes10.dex */
public class f1 implements ls0.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f230859a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f230860b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b f230861c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.l1 f230862d;

    public f1(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.l1 l1Var, java.lang.String str, long j17, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b bVar) {
        this.f230862d = l1Var;
        this.f230859a = str;
        this.f230860b = j17;
        this.f230861c = bVar;
    }

    @Override // ls0.m
    public void b(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightVideoEditor", "mediaCodecRemuxer remux onFinish");
        java.lang.Object obj = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.a2.D;
        synchronized (obj) {
            int i17 = 0;
            try {
                obj.notifyAll();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMSightVideoEditor", e17, "wait mediaCodecRemuxer error", new java.lang.Object[0]);
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.d1(this));
                com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.h1.a(this.f230862d.f230894e.f230810m.a());
                return;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f230862d.f230894e.f230820w)) {
                com.p314xaae8f345.mm.vfs.w6.w(this.f230859a, str);
            }
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.f230860b;
            boolean z17 = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightVideoEditor", "doRemuxVideo used %sms", java.lang.Long.valueOf(elapsedRealtime));
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.h1.b(1, elapsedRealtime);
            this.f230862d.f230894e.A = com.p314xaae8f345.mm.vfs.w6.p(str);
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.a2 a2Var = this.f230862d.f230894e;
            gi3.b bVar = a2Var.f230823z;
            int i18 = a2Var.f230801d;
            if (i18 < 0 || a2Var.f230802e <= 0) {
                z17 = false;
            }
            bVar.f353815g = z17;
            bVar.f353812d = a2Var.f230802e - i18;
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b bVar2 = this.f230861c;
            if (bVar2 != null) {
                i17 = bVar2.f243915a;
            }
            bVar.f353811c = i17;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.e1(this));
        }
    }
}
