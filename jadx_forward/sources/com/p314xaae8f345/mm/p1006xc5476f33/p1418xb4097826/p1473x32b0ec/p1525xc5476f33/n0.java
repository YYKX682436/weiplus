package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class n0 extends dk2.cb {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.q0 f195107b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.q0 q0Var, java.lang.Class cls) {
        super(cls);
        this.f195107b = q0Var;
    }

    @Override // dk2.cb
    public void b(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        r45.cd2 result = (r45.cd2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        if (result.m75941xfb821914(0).size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAdVideoPlugin", "startPolling poll no ad video");
            return;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = ((mm2.w) this.f195107b.P0(mm2.w.class)).f411031g;
        java.util.LinkedList<r45.ce2> m75941xfb821914 = result.m75941xfb821914(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getAd_infos(...)");
        for (r45.ce2 ce2Var : m75941xfb821914) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAdVideoPlugin", "startPolling onPollingSuccess live_ad_id:" + ce2Var.m75945x2fec8307(0) + " startTime:" + ce2Var.m75942xfb822ef2(1) + " duration:" + ce2Var.m75942xfb822ef2(2));
            java.util.Iterator it = copyOnWriteArrayList.iterator();
            int i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                }
                mm2.j jVar = (mm2.j) it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(jVar.f410683b.m75945x2fec8307(0), ce2Var.m75945x2fec8307(0)) && jVar.f410683b.m75942xfb822ef2(1) == ce2Var.m75942xfb822ef2(1)) {
                    break;
                } else {
                    i17++;
                }
            }
            if (i17 == -1) {
                copyOnWriteArrayList.add(new mm2.j(mm2.l.f410736d, ce2Var));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAdVideoPlugin", "startPolling add live_ad_id:" + ce2Var.m75945x2fec8307(0) + " startTime:" + ce2Var.m75942xfb822ef2(1) + " size:" + copyOnWriteArrayList.size());
            }
        }
    }
}
