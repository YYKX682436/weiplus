package kn4;

/* loaded from: classes12.dex */
public class r extends wu5.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dn.g f391280d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f391281e;

    public r(dn.g gVar, java.lang.String str) {
        this.f391280d = gVar;
        this.f391281e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f391281e;
        dn.g gVar = this.f391280d;
        if (gVar == null) {
            kn4.p pVar = (kn4.p) ((java.util.concurrent.ConcurrentHashMap) kn4.q.f391276a).remove(str);
            long p17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().p("FileTransportStats_accumulateSize");
            if (pVar != null) {
                long j17 = pVar.f391274c;
                long j18 = pVar.f391273b;
                if (j18 >= j17) {
                    p17 += j18 - j17;
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().B("FileTransportStats_accumulateSize", p17);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FileTransportStats", pVar.m143815x9616526c());
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FileTransportStats", "error: total len < finished len, fileInfo=%s", pVar.m143815x9616526c());
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FileTransportStats", "accumulate size = %d", java.lang.Long.valueOf(p17));
            return;
        }
        java.util.Map map = kn4.q.f391276a;
        kn4.p pVar2 = (kn4.p) ((java.util.concurrent.ConcurrentHashMap) map).get(str);
        long p18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().p("FileTransportStats_accumulateSize");
        if (pVar2 != null) {
            long j19 = gVar.f69496x83ec3dd;
            long j27 = pVar2.f391274c;
            if (j19 < j27) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FileTransportStats", "error: current finished len(%d) < last finished len(%d)", java.lang.Long.valueOf(j19), java.lang.Long.valueOf(pVar2.f391274c));
                return;
            } else {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().B("FileTransportStats_accumulateSize", p18 + (j19 - j27));
                pVar2.f391274c = gVar.f69496x83ec3dd;
                return;
            }
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().B("FileTransportStats_accumulateSize", p18 + gVar.f69496x83ec3dd);
        ((java.util.concurrent.ConcurrentHashMap) map).put(str, new kn4.p(this.f391281e, gVar.f69500x8ab84c59, gVar.f69496x83ec3dd, gVar.f69497x7f197b15));
        java.util.Map map2 = com.p314xaae8f345.mm.p1006xc5476f33.p2313x6760d4bd.C18772x22e12a88.f256877a;
        if (java.lang.System.currentTimeMillis() - com.p314xaae8f345.mm.p1006xc5476f33.p2313x6760d4bd.C18772x22e12a88.f256879c <= com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d) {
            return;
        }
        java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) kn4.o0.b().f391268a).values().iterator();
        while (it.hasNext()) {
            ((kn4.g0) it.next()).f391202e = str;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FileTransportStats", "abnormal file transport: mediaId=%s, info=[%s]", str, gVar.m125797x9616526c());
    }
}
