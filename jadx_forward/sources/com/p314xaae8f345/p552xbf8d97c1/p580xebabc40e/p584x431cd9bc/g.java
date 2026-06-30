package com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p584x431cd9bc;

/* loaded from: classes12.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p584x431cd9bc.i f134525d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f134526e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p584x431cd9bc.j f134527f;

    public g(com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p584x431cd9bc.j jVar, com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p584x431cd9bc.i iVar, int i17) {
        this.f134527f = jVar;
        this.f134525d = iVar;
        this.f134526e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p584x431cd9bc.h hVar;
        com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p584x431cd9bc.e eVar = (com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p584x431cd9bc.e) this.f134525d;
        if (eVar.f134510a.f134519k.isEmpty()) {
            oj.j.c("Matrix.ActivityRefWatcher", "DestroyedActivityInfo is empty! wait...", new java.lang.Object[0]);
            synchronized (eVar.f134510a.f134519k) {
                while (eVar.f134510a.f134519k.isEmpty()) {
                    try {
                        eVar.f134510a.f134519k.wait();
                    } catch (java.lang.Throwable unused) {
                    }
                }
            }
            oj.j.c("Matrix.ActivityRefWatcher", "DestroyedActivityInfo is NOT empty! resume check", new java.lang.Object[0]);
            hVar = com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p584x431cd9bc.h.RETRY;
        } else if (android.os.Debug.isDebuggerConnected()) {
            eVar.f134510a.f134513e.f134533h.getClass();
            oj.j.f("Matrix.ActivityRefWatcher", "debugger is connected, to avoid fake result, detection was delayed.", new java.lang.Object[0]);
            hVar = com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p584x431cd9bc.h.RETRY;
        } else {
            eVar.f134510a.d();
            java.util.Iterator it = eVar.f134510a.f134519k.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p581xc2f04ca6.p582x633fb29.C4706x164388f6 c4706x164388f6 = (com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p581xc2f04ca6.p582x633fb29.C4706x164388f6) it.next();
                com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p584x431cd9bc.f fVar = eVar.f134510a;
                wi.b bVar = fVar.f134521m;
                if (bVar == wi.b.NO_DUMP || bVar == wi.b.AUTO_DUMP) {
                    fVar.f134513e.f134533h.getClass();
                    if (eVar.f134510a.a(c4706x164388f6.f20017xf8a7db47)) {
                        oj.j.e("Matrix.ActivityRefWatcher", "activity with key [%s] was already published.", c4706x164388f6.f20017xf8a7db47);
                        it.remove();
                    }
                }
                eVar.f134510a.d();
                if (c4706x164388f6.f20018x73605057.get() == null) {
                    oj.j.e("Matrix.ActivityRefWatcher", "activity with key [%s] was already recycled.", c4706x164388f6.f20020x32b2b2);
                    it.remove();
                } else {
                    int i17 = c4706x164388f6.f20019x5dcb1440 + 1;
                    c4706x164388f6.f20019x5dcb1440 = i17;
                    if (i17 < (c4706x164388f6.f20016x623a1b78 ? eVar.f134510a.f134515g / 2 : eVar.f134510a.f134515g)) {
                        eVar.f134510a.f134513e.f134533h.getClass();
                        oj.j.c("Matrix.ActivityRefWatcher", "activity with key [%s] should be recycled but actually still exists in %s times, wait for next detection to confirm.", c4706x164388f6.f20020x32b2b2, java.lang.Integer.valueOf(c4706x164388f6.f20019x5dcb1440));
                        eVar.f134510a.d();
                    } else {
                        oj.j.c("Matrix.ActivityRefWatcher", "activity with key [%s] was suspected to be a leaked instance. mode[%s]", c4706x164388f6.f20020x32b2b2, eVar.f134510a.f134521m);
                        cj.c cVar = eVar.f134510a.f134520l;
                        if (cVar == null) {
                            throw new java.lang.NullPointerException("LeakProcessor not found!!!");
                        }
                        if (cVar.b(c4706x164388f6)) {
                            oj.j.c("Matrix.ActivityRefWatcher", "the leaked activity [%s] with key [%s] has been processed. stop polling", c4706x164388f6.f20017xf8a7db47, c4706x164388f6.f20020x32b2b2);
                            it.remove();
                        }
                    }
                }
            }
            hVar = com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p584x431cd9bc.h.RETRY;
        }
        if (hVar == com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p584x431cd9bc.h.RETRY) {
            this.f134527f.a(this.f134525d, this.f134526e + 1);
        }
    }
}
