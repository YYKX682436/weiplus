package k42;

/* loaded from: classes4.dex */
public class a extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f385591d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f385592e;

    /* renamed from: f, reason: collision with root package name */
    public final u42.c f385593f;

    public a(java.util.List list, u42.c cVar) {
        this.f385592e = list;
        this.f385593f = cVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f385591d = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.vh0();
        lVar.f152198b = new r45.wh0();
        lVar.f152199c = "/cgi-bin/mmfddataecappsvr/edgerealtimereport";
        lVar.f152200d = 4871;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        ((r45.vh0) a17.f152243a.f152217a).f469765d.addAll(this.f385592e);
        return mo9409x10f9447a(sVar, a17, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 4871;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        java.util.LinkedList linkedList;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneEdgeComputingRtReport", "[onGYNetEnd] netId[%d] errType[%d] errCode[%d] errMsg[%s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        java.util.List<r45.uh0> list = this.f385592e;
        u42.c cVar = this.f385593f;
        if (i18 == 0 && i19 == 0) {
            r45.wh0 wh0Var = (r45.wh0) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
            long j17 = wh0Var.f470687d;
            java.util.LinkedList<r45.th0> linkedList2 = wh0Var.f470688e;
            u42.a aVar = (u42.a) cVar;
            aVar.getClass();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 e17 = g42.i.e();
            if (e17 != null) {
                e17.putLong("mmkv_key_realtime_report_period", j17);
            }
            aVar.f506172b = j17;
            if (linkedList2 != null && list != null) {
                boolean z17 = false;
                for (r45.th0 th0Var : linkedList2) {
                    java.util.Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            r45.uh0 uh0Var = (r45.uh0) it.next();
                            if (u46.l.c(uh0Var.f468908d, th0Var.f467954d) && uh0Var.f468909e == th0Var.f467955e) {
                                if (th0Var.f467956f != 0 && (linkedList = uh0Var.f468910f) != null) {
                                    java.util.Iterator it6 = linkedList.iterator();
                                    while (it6.hasNext()) {
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(uh0Var.f468909e, (java.lang.String) it6.next());
                                    }
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EdgeComputingReporter", "report realtimeReport svr reject configID : " + uh0Var.f468908d + ", logID : " + uh0Var.f468909e + ", dropFlag : " + th0Var.f467956f + ", contents size : " + linkedList.size());
                                    z17 = true;
                                }
                            }
                        }
                    }
                }
                if (z17) {
                    t42.a.d(4);
                } else {
                    t42.a.d(5);
                }
            }
            t42.a.d(2);
        } else {
            ((u42.a) cVar).getClass();
            if (list != null && list.size() > 0) {
                for (r45.uh0 uh0Var2 : list) {
                    java.util.Iterator it7 = uh0Var2.f468910f.iterator();
                    while (it7.hasNext()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(uh0Var2.f468909e, (java.lang.String) it7.next());
                    }
                }
                t42.a.d(3);
            }
        }
        this.f385591d.mo815x76e0bfae(i18, i19, str, this);
    }
}
