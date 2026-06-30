package jn4;

/* loaded from: classes11.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn4.m f382346d;

    public l(jn4.m mVar, jn4.a aVar) {
        this.f382346d = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        long currentTimeMillis;
        jn4.m mVar = this.f382346d;
        synchronized (mVar) {
            mVar.f382349a = false;
        }
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.f47897xee1ddd9f);
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMTraceRoute", "mmtraceroute start time " + simpleDateFormat.format((java.util.Date) new java.sql.Date(currentTimeMillis2)));
        for (java.util.Map.Entry entry : ((java.util.HashMap) mVar.f382351c).entrySet()) {
            jn4.k kVar = new jn4.k(mVar, (java.lang.String) entry.getKey());
            jn4.p pVar = jn4.m.f382348j;
            if (pVar != null) {
                pVar.execute(kVar);
            }
            jn4.b bVar = new jn4.b(mVar, (java.lang.String) entry.getKey(), (java.util.Set) entry.getValue());
            jn4.p pVar2 = jn4.m.f382348j;
            if (pVar2 != null) {
                pVar2.execute(bVar);
            }
        }
        while (true) {
            synchronized (mVar) {
                z17 = mVar.f382349a;
            }
            if (z17 || jn4.m.f382348j.getActiveCount() <= 0) {
                break;
            }
            try {
                java.lang.String.valueOf(jn4.m.f382348j.getActiveCount());
                currentTimeMillis = java.lang.System.currentTimeMillis() - currentTimeMillis2;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMTraceRoute", "wait for command end err: " + e17.getMessage());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMTraceRoute", e17, "", new java.lang.Object[0]);
            }
            if (currentTimeMillis >= u04.d.f505010c) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMTraceRoute", "traceroute timeout: " + (currentTimeMillis / 1000));
                synchronized (mVar) {
                    mVar.f382349a = true;
                    mVar.d();
                    jn4.f fVar = mVar.f382353e;
                    if (fVar != null) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.w) fVar).f256873a.f256876a.f256850m.mo50307xb9e94560(1, 500L);
                        return;
                    }
                    return;
                }
            }
            java.lang.Thread.sleep(500L);
        }
        long currentTimeMillis3 = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMTraceRoute", "mmtraceroute end time " + simpleDateFormat.format(new java.util.Date(currentTimeMillis3)));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMTraceRoute", "mmtraceroute total time " + ((currentTimeMillis3 - currentTimeMillis2) / 1000));
        if (mVar.f382354f != null) {
            synchronized (mVar) {
                boolean z19 = mVar.f382349a;
                if (z19) {
                    return;
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.v) mVar.f382354f).f256872a.f256876a.f256850m.mo50307xb9e94560(2, 500L);
            }
        }
    }
}
