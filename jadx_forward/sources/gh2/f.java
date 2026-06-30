package gh2;

/* loaded from: classes10.dex */
public final class f extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f353403f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f353404g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f353403f = new java.util.concurrent.ConcurrentHashMap();
        this.f353404g = new java.util.concurrent.ConcurrentHashMap();
    }

    public final void N6(java.lang.String userId, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userId, "userId");
        if ((userId.length() == 0) || j17 <= 0) {
            return;
        }
        gh2.e eVar = (gh2.e) this.f353404g.get(userId);
        if (eVar == null) {
            eVar = new gh2.e(this, userId);
            this.f353404g.put(userId, eVar);
        }
        synchronized (eVar.f353402a) {
            eVar.f353402a.add(java.lang.Long.valueOf(j17));
            eVar.a();
        }
    }

    public final void O6(java.lang.String uniqueId, gh2.b resultType, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uniqueId, "uniqueId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resultType, "resultType");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("report: ");
        sb6.append(uniqueId);
        sb6.append(" resultType: ");
        sb6.append(resultType);
        sb6.append(" data: ");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f353403f;
        sb6.append(concurrentHashMap.get(uniqueId));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveKTVReportSlice", sb6.toString());
        gh2.d dVar = (gh2.d) concurrentHashMap.get(uniqueId);
        if (dVar != null) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6517xa6e83e44 c6517xa6e83e44 = dVar.f353400a;
            if (lVar != null) {
                lVar.mo146xb9724478(c6517xa6e83e44);
            }
            c6517xa6e83e44.f138693j = resultType.f353398d;
            c6517xa6e83e44.f138696m = (int) (java.lang.System.currentTimeMillis() - dVar.f353401b);
            c6517xa6e83e44.k();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveKTVReportSlice", "realReport: " + c6517xa6e83e44.n());
        }
        concurrentHashMap.remove(uniqueId);
    }

    @Override // p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        super.mo528x82b764cd();
    }
}
