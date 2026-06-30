package vd2;

/* loaded from: classes10.dex */
public final class d2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vd2.e2 f517233a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f517234b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f517235c;

    public d2(vd2.e2 e2Var, long j17, java.lang.String str) {
        this.f517233a = e2Var;
        this.f517234b = j17;
        this.f517235c = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        vd2.e2 e2Var = this.f517233a;
        java.util.HashSet hashSet = e2Var.f517249o;
        long j17 = this.f517234b;
        hashSet.remove(java.lang.Long.valueOf(j17));
        r45.uk2 uk2Var = (r45.uk2) fVar.f152151d;
        java.lang.String str = this.f517235c;
        if (uk2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveNotifyGetMoreLiveService", "cgiGetMoreLive: resp is null, source=" + str + ", feedId=" + pm0.v.u(j17));
        } else if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            e2Var.f517248n.put(java.lang.Long.valueOf(j17), new jz5.l(uk2Var, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() + (uk2Var.m75939xb282bd08(5) * 1000))));
            if (!uk2Var.m75933x41a8a7f2(12)) {
                e2Var.f517242e = 0;
            }
            if (e2Var.f517241d && (f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) e2Var.f517245h.get(java.lang.Long.valueOf(j17))) != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().m0(new xg3.l0(f9Var.Q0(), "update", f9Var, 0));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNotifyGetMoreLiveService", "cgiGetMoreLive: cgi success, source=" + str + ", feedId=" + pm0.v.u(j17) + ", hasEnterServiceNotify=" + e2Var.f517241d + ", req_interval=" + uk2Var.m75939xb282bd08(5) + ", is_enable=" + uk2Var.m75933x41a8a7f2(12));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveNotifyGetMoreLiveService", "cgiGetMoreLive: cgi fail, source=" + str + ", feedId=" + pm0.v.u(j17) + ", errType=" + fVar.f152148a + ", errCode=" + fVar.f152149b);
        }
        return jz5.f0.f384359a;
    }
}
