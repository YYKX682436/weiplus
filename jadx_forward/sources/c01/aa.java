package c01;

/* loaded from: classes11.dex */
public class aa implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f118589d = 100;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f118590e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f118591f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f118592g;

    public aa(java.util.List list, long j17, java.lang.Runnable runnable) {
        this.f118590e = list;
        this.f118591f = j17;
        this.f118592g = runnable;
    }

    /* JADX WARN: Finally extract failed */
    public final void a() {
        l75.k0 k0Var = gm0.j1.u().f354686f;
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.lang.String str : this.f118590e) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5297xfbfc3e84 c5297xfbfc3e84 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5297xfbfc3e84();
            am.y3 y3Var = c5297xfbfc3e84.f135619g;
            y3Var.f89958a = Long.MIN_VALUE;
            y3Var.f89960c = str;
            y3Var.f89961d = 0;
            c5297xfbfc3e84.e();
        }
        try {
            k0Var.b();
            for (java.lang.String str2 : this.f118590e) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 D5 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().D5(str2, this.f118591f);
                long mo78012x3fdd41df = D5 == null ? 0L : D5.mo78012x3fdd41df();
                hashMap.put(str2, java.lang.Long.valueOf(mo78012x3fdd41df));
                ((com.p314xaae8f345.mm.p2621x8fb0427b.x4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).u0(str2, mo78012x3fdd41df);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgInfoStorageLogic", "summerdel deleteMsgByTalker run currentThread[%s, %d] lastMsg[%s] lastMsgCreateTime[%s]", java.lang.Thread.currentThread().getName(), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()), D5, java.lang.Long.valueOf(mo78012x3fdd41df));
            }
            k0Var.r();
            k0Var.t();
            if (k0Var.G()) {
                k0Var.t();
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(this.f118592g);
            ((ku5.t0) ku5.t0.f394148d).h(new c01.z9(this, hashMap), "AsyncDeleteMessageStage2");
        } catch (java.lang.Throwable th6) {
            if (k0Var.G()) {
                k0Var.t();
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(this.f118592g);
            throw th6;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            a();
        } catch (c01.c e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MsgInfoStorageLogic", e17, "", new java.lang.Object[0]);
        }
    }
}
