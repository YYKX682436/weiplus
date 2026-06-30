package y00;

/* loaded from: classes8.dex */
public final class e implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f540053a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y00.s f540054b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f540055c;

    public e(long j17, y00.s sVar, int i17) {
        this.f540053a = j17;
        this.f540054b = sVar;
        this.f540055c = i17;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public final void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        java.lang.Iterable iterable;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f540053a;
        boolean z17 = i17 == 0 && i18 == 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsKfProductCardFetcher", "sendCgi done: msgSvrId=" + this.f540054b.f540079b + ", errType=" + i17 + ", errCode=" + i18 + ", errMsg=" + str + ", cost=" + currentTimeMillis + "ms, success=" + z17);
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
        y00.a aVar = null;
        bw5.me0 me0Var = fVar instanceof bw5.me0 ? (bw5.me0) fVar : null;
        java.lang.String str2 = me0Var != null ? me0Var.f111750e[2] ? me0Var.f111749d : "" : null;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = str2;
        if (z17) {
            if (str3.length() > 0) {
                aVar = new y00.a(this.f540054b.f540079b, str3, java.lang.System.currentTimeMillis());
            }
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = y00.f.f540056a;
        y00.s sVar = this.f540054b;
        synchronized (concurrentHashMap) {
            iterable = (java.util.List) concurrentHashMap.remove(java.lang.Long.valueOf(sVar.f540079b));
            if (iterable == null) {
                iterable = kz5.p0.f395529d;
            }
        }
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) it.next()).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(aVar));
        }
        if (aVar != null) {
            ((ku5.t0) ku5.t0.f394148d).g(new y00.d(aVar, this.f540054b, this.f540055c));
        }
    }
}
