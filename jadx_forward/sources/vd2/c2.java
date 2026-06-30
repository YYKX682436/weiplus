package vd2;

/* loaded from: classes10.dex */
public final class c2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vd2.e2 f517208d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f517209e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f517210f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.vk2 f517211g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(vd2.e2 e2Var, long j17, int i17, r45.vk2 vk2Var) {
        super(0);
        this.f517208d = e2Var;
        this.f517209e = j17;
        this.f517210f = i17;
        this.f517211g = vk2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        vd2.e2 e2Var = this.f517208d;
        java.util.HashMap hashMap = e2Var.f517246i;
        long j17 = this.f517209e;
        hashMap.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() + (this.f517210f * 1000)));
        r45.vk2 vk2Var = this.f517211g;
        if (vk2Var != null) {
            e2Var.f517247m.put(java.lang.Long.valueOf(j17), vk2Var);
            if (e2Var.f517243f != vk2Var.m75939xb282bd08(2)) {
                if (e2Var.f517243f == 0) {
                    e2Var.f517242e = vk2Var.m75939xb282bd08(2);
                }
                e2Var.f517243f = vk2Var.m75939xb282bd08(2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNotifyGetMoreLiveService", "addLiveInfoCache: update recommend max cnt = " + e2Var.f517243f);
            }
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) e2Var.f517245h.get(java.lang.Long.valueOf(j17));
        if (f9Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().m0(new xg3.l0(f9Var.Q0(), "update", f9Var, 0));
        }
        e2Var.Ai("addLiveInfoCache");
        return jz5.f0.f384359a;
    }
}
