package zc;

/* loaded from: classes11.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.C3646xcf902238 f552892d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24283x2bd32ff8 f552893e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f552894f;

    public o(com.p314xaae8f345.p362xadfe2b3.C3646xcf902238 c3646xcf902238, com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24283x2bd32ff8 c24283x2bd32ff8, boolean z17) {
        this.f552892d = c3646xcf902238;
        this.f552893e = c24283x2bd32ff8;
        this.f552894f = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p362xadfe2b3.C3646xcf902238 c3646xcf902238 = this.f552892d;
        com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24244x84f3e062 c24244x84f3e062 = c3646xcf902238.f127507p;
        boolean z17 = this.f552894f;
        c24244x84f3e062.m89767x5189f8a6(this.f552893e, new zc.n(c3646xcf902238, z17));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("activityId", java.lang.String.valueOf(c3646xcf902238.f127498d));
        hashMap.put("enable", java.lang.Boolean.valueOf(z17));
        kx5.n.h().j(c3646xcf902238.f127500f, "setForbidRightGestureEnable", hashMap);
    }
}
