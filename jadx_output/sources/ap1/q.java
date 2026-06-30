package ap1;

/* loaded from: classes5.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f12726d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ap1.w f12727e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f12728f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(long j17, ap1.w wVar, com.tencent.mm.ui.widget.dialog.u3 u3Var) {
        super(1);
        this.f12726d = j17;
        this.f12727e = wVar;
        this.f12728f = u3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.LinkedList linkedList;
        com.tencent.wechat.aff.affroam.f fVar = (com.tencent.wechat.aff.affroam.f) obj;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f12726d;
        ap1.w wVar = this.f12727e;
        com.tencent.wechat.aff.affroam.g gVar = wVar.f12752i;
        if (gVar == null) {
            kotlin.jvm.internal.o.o("pkgInfo");
            throw null;
        }
        int i17 = gVar.f215832g.f215988d;
        int size = (fVar == null || (linkedList = fVar.f215824d) == null) ? 0 : linkedList.size();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("duration", java.lang.Long.valueOf(currentTimeMillis));
        linkedHashMap.put("deviceType", java.lang.Long.valueOf(i17));
        linkedHashMap.put("conversationSize", java.lang.Long.valueOf(size));
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, "reportLoadData, extraInfoMap = " + linkedHashMap);
        ap1.d dVar = new ap1.d(ap1.e.f12640e, new ap1.v(currentTimeMillis, linkedHashMap));
        j75.f U6 = wVar.U6();
        if (U6 != null) {
            U6.B3(dVar);
        }
        if (fVar == null) {
            com.tencent.mars.xlog.Log.w(pf5.o.TAG, "Get Restore Conversation Failed!");
            ap1.e2 e2Var = new ap1.e2(wVar.getString(com.tencent.mm.R.string.mvj), null, wVar.getString(com.tencent.mm.R.string.aby), new ap1.p(wVar));
            j75.f U62 = wVar.U6();
            if (U62 != null) {
                U62.B3(e2Var);
            }
        } else {
            ap1.w wVar2 = this.f12727e;
            pf5.e.launch$default(wVar2, null, null, new ap1.o(fVar, wVar2, null), 3, null);
        }
        this.f12728f.dismiss();
        return jz5.f0.f302826a;
    }
}
