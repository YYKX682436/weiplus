package ap1;

/* loaded from: classes5.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f94259d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ap1.w f94260e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f94261f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(long j17, ap1.w wVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var) {
        super(1);
        this.f94259d = j17;
        this.f94260e = wVar;
        this.f94261f = u3Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.LinkedList linkedList;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.f fVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.f) obj;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f94259d;
        ap1.w wVar = this.f94260e;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar = wVar.f94285i;
        if (gVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkgInfo");
            throw null;
        }
        int i17 = gVar.f297365g.f297521d;
        int size = (fVar == null || (linkedList = fVar.f297357d) == null) ? 0 : linkedList.size();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("duration", java.lang.Long.valueOf(currentTimeMillis));
        linkedHashMap.put("deviceType", java.lang.Long.valueOf(i17));
        linkedHashMap.put("conversationSize", java.lang.Long.valueOf(size));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "reportLoadData, extraInfoMap = " + linkedHashMap);
        ap1.d dVar = new ap1.d(ap1.e.f94173e, new ap1.v(currentTimeMillis, linkedHashMap));
        j75.f U6 = wVar.U6();
        if (U6 != null) {
            U6.B3(dVar);
        }
        if (fVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(pf5.o.TAG, "Get Restore Conversation Failed!");
            ap1.e2 e2Var = new ap1.e2(wVar.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.mvj), null, wVar.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.aby), new ap1.p(wVar));
            j75.f U62 = wVar.U6();
            if (U62 != null) {
                U62.B3(e2Var);
            }
        } else {
            ap1.w wVar2 = this.f94260e;
            pf5.e.m158343xd39de650(wVar2, null, null, new ap1.o(fVar, wVar2, null), 3, null);
        }
        this.f94261f.dismiss();
        return jz5.f0.f384359a;
    }
}
