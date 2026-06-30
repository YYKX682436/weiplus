package zo1;

/* loaded from: classes5.dex */
public final class k0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f556195d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12867x6b26c82f f556196e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12867x6b26c82f activityC12867x6b26c82f) {
        super(1);
        this.f556195d = j17;
        this.f556196e = activityC12867x6b26c82f;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.LinkedList linkedList;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.f fVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.f) obj;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f556195d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12867x6b26c82f activityC12867x6b26c82f = this.f556196e;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar = activityC12867x6b26c82f.f174341q;
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC12867x6b26c82f.f174332e, "reportLoadData, extraInfoMap = " + linkedHashMap);
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1 y1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1.X;
        zo1.q0 q0Var = new zo1.q0(currentTimeMillis, linkedHashMap);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamReport28098", "start simple report for pageAction=" + y1Var);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6839x89375b51 c6839x89375b51 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6839x89375b51();
        c6839x89375b51.f141599d = 9L;
        c6839x89375b51.f141600e = 6L;
        q0Var.mo146xb9724478(c6839x89375b51);
        c6839x89375b51.k();
        nf.e.f(new zo1.j0(activityC12867x6b26c82f, fVar));
        return jz5.f0.f384359a;
    }
}
