package com.p314xaae8f345.mm.p849xbf8d97c1;

/* loaded from: classes12.dex */
public class b0 implements li.e {
    public b0(com.p314xaae8f345.mm.p849xbf8d97c1.o oVar) {
    }

    public void a() {
        java.util.concurrent.TimeUnit timeUnit;
        long j17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1403L, 38L, 1L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("OpenglLeakPlugin.TAG", "onHookSuccess call & report");
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (z65.c.a()) {
            timeUnit = java.util.concurrent.TimeUnit.MINUTES;
            j17 = 2;
        } else {
            timeUnit = java.util.concurrent.TimeUnit.MINUTES;
            j17 = 15;
        }
        ni.i iVar = new ni.i(timeUnit.toMillis(j17));
        iVar.f418714g = new com.p314xaae8f345.mm.p849xbf8d97c1.z(this);
        iVar.a((android.app.Application) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getApplicationContext());
        iVar.f418715h = new com.p314xaae8f345.mm.p849xbf8d97c1.a0(this);
    }
}
