package gg4;

/* loaded from: classes11.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb f353290d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2249x93e6da0e.ActivityC18537x8ea3e013 f353291e;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2249x93e6da0e.ActivityC18537x8ea3e013 activityC18537x8ea3e013, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        this.f353291e = activityC18537x8ea3e013;
        this.f353290d = c21560x1fce98fb;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = "find_friends_by_brand_service".equals(this.f353290d.f279313q) ? 211 : 210;
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        android.content.Intent a17 = su4.r2.a();
        a17.putExtra("KRightBtn", true);
        a17.putExtra("ftsneedkeyboard", true);
        a17.putExtra("key_load_js_without_delay", true);
        a17.putExtra("ftsType", 33554499);
        a17.putExtra("ftsbizscene", i17);
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        java.util.Map b17 = su4.r2.b(i17, false, 33554499);
        tg0.o1 o1Var = (tg0.o1) i95.n0.c(tg0.o1.class);
        java.util.HashMap hashMap = (java.util.HashMap) b17;
        int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) hashMap.get(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811), 0);
        ((sg0.y3) o1Var).getClass();
        java.lang.String f17 = su4.r2.f(D1);
        hashMap.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, f17);
        hashMap.put("subSessionId", f17);
        a17.putExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, f17);
        a17.putExtra("subSessionId", f17);
        a17.putExtra("rawUrl", su4.r2.e(b17, 0));
        boolean C = com.p314xaae8f345.mm.ui.bk.C();
        com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2249x93e6da0e.ActivityC18537x8ea3e013 activityC18537x8ea3e013 = this.f353291e;
        j45.l.z(activityC18537x8ea3e013, a17, (C || activityC18537x8ea3e013.m81217xb3833cfe()) ? null : android.app.ActivityOptions.makeSceneTransitionAnimation(activityC18537x8ea3e013, new android.util.Pair[0]).toBundle());
        su4.k2.a(i17, f17, f17, false, "", 33554499, "", false, "");
    }
}
