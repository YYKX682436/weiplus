package hd5;

/* loaded from: classes9.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final hd5.n f362175d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f362176e;

    /* renamed from: f, reason: collision with root package name */
    public final hd5.p f362177f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f362178g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ hd5.v f362179h;

    public t(hd5.v vVar, hd5.n nVar, boolean z17, hd5.p pVar, java.util.concurrent.atomic.AtomicBoolean atomicBoolean) {
        this.f362179h = vVar;
        this.f362175d = nVar;
        this.f362176e = z17;
        this.f362177f = pVar;
        this.f362178g = atomicBoolean;
    }

    public int a() {
        hd5.n nVar = this.f362175d;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f362178g;
        hd5.v vVar = this.f362179h;
        hd5.q qVar = new hd5.q(nVar, atomicBoolean, vVar);
        ke5.b bVar = (ke5.b) this.f362177f;
        android.os.Bundle bundle = bVar.f388591a;
        qVar.f362162a = bundle;
        he5.t e17 = bVar.f388593c.e(bVar.f388592b, bundle, qVar);
        hd5.m mVar = vVar.f362187e;
        hd5.n nVar2 = this.f362175d;
        hd5.u uVar = new hd5.u(this, qVar);
        hd5.j jVar = (hd5.j) mVar;
        jVar.getClass();
        yd5.j jVar2 = yd5.j.f542636b;
        int ordinal = nVar.ordinal();
        int[] iArr = jVar2.f542637a;
        if (ordinal == 0) {
            iArr[1] = iArr[1] + 1;
        } else if (ordinal == 1) {
            iArr[0] = iArr[0] + 1;
        } else if (ordinal == 2) {
            iArr[2] = iArr[2] + 1;
        } else if (ordinal == 4) {
            android.os.Bundle bundle2 = qVar.f362162a;
            if (bundle2 == null || bundle2.getInt("SCENE") != 1) {
                iArr[4] = iArr[4] + 1;
            } else {
                iArr[3] = iArr[3] + 1;
            }
        }
        if (e17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingLoader.ChattingDataCallbackV2", "[load] null == source!");
            uVar.mo133232x338af3();
        } else {
            e17.c(new hd5.g(e17, qVar, jVar, nVar2, uVar));
        }
        return qVar.f362165d;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((tb5.d0) ((tb5.n0) this.f362179h.f362188f.f542241c.a(tb5.n0.class))).m0("loadTaskStart", this.f362175d);
        ((java.util.LinkedHashMap) sd5.p.f488258a).clear();
        java.lang.System.currentTimeMillis();
        try {
            a();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChattingLoader.ListDataLoader", th6, "", new java.lang.Object[0]);
            ((ku5.t0) ku5.t0.f394148d).g(new java.lang.Runnable() { // from class: hd5.t$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6423x452b9f7c c6423x452b9f7c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6423x452b9f7c();
                    c6423x452b9f7c.r(android.util.Log.getStackTraceString(th6).replace(",", ";"));
                    c6423x452b9f7c.s(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
                    c6423x452b9f7c.f137646e = 1042L;
                    c6423x452b9f7c.k();
                }
            });
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        }
        java.lang.System.currentTimeMillis();
    }
}
