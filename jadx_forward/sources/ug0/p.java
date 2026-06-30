package ug0;

/* loaded from: classes8.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ug0.q f509002d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ug0.q qVar) {
        super(1);
        this.f509002d = qVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar;
        ug0.x state = (ug0.x) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        ug0.q qVar = this.f509002d;
        qVar.getClass();
        j75.d dVar = state.f379599d;
        tg0.u1 u1Var = qVar.f509008h;
        if (dVar != null && (dVar instanceof tg0.o2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearchCommonSyncRedDotFSC", "onObserveRedDotReceived");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar2 = ((tg0.o2) dVar).f500631b;
            if (jbVar2 != null) {
                java.util.Iterator it = jbVar2.L0().iterator();
                while (it.hasNext()) {
                    ((wg0.a) u1Var).a("red_dot_received", jbVar2, (r45.f03) it.next(), null);
                }
            }
            ((sg0.h3) ((su4.f1) i95.n0.c(su4.f1.class))).Di(20);
        }
        j75.d dVar2 = state.f379599d;
        if (dVar2 != null && (dVar2 instanceof tg0.l2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearchCommonSyncRedDotFSC", "onObserveRedDotExpired");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar3 = ((tg0.l2) dVar2).f500625b;
            if (jbVar3 != null) {
                ((wg0.a) u1Var).a("red_dot_expired", jbVar3, null, null);
            }
        }
        j75.d dVar3 = state.f379599d;
        jm0.o oVar = qVar.f381800d;
        if (dVar3 != null && (dVar3 instanceof tg0.j2)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onObserveRedDotUpdates, redDotResult: ");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a aVar = ((tg0.j2) dVar3).f500619b;
            sb6.append(aVar);
            sb6.append(", isShow: ");
            sb6.append(aVar != null ? java.lang.Boolean.valueOf(aVar.f186860a) : null);
            sb6.append(", path: ");
            sb6.append(aVar != null ? aVar.f186864e : null);
            sb6.append(", field_tips_uuid: ");
            java.lang.String str = (aVar == null || (jbVar = aVar.f186862c) == null) ? null : jbVar.f65882x5364c75d;
            if (str == null) {
                str = "null";
            }
            sb6.append(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearchCommonSyncRedDotFSC", sb6.toString());
            tg0.u1 aj6 = ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).aj();
            java.lang.String str2 = aVar != null ? aVar.f186864e : null;
            wg0.a aVar2 = (wg0.a) aj6;
            aVar2.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearchRedDotReporter", "resetExpose, path: " + str2);
            if (str2 != null) {
                ((java.util.concurrent.ConcurrentHashMap) aVar2.f527241a).remove(str2);
                ((java.util.concurrent.ConcurrentHashMap) aVar2.f527242b).remove(str2);
            }
            j75.f Ai = oVar.Ai();
            if (Ai != null) {
                Ai.B3(new tg0.i2(aVar));
            }
        }
        j75.d dVar4 = state.f379599d;
        if (dVar4 != null && (dVar4 instanceof tg0.k2)) {
            tg0.k2 k2Var = (tg0.k2) dVar4;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearchCommonSyncRedDotFSC", "onObserveRedDotErased");
            wg0.a aVar3 = (wg0.a) u1Var;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar4 = k2Var.f500620b;
            r45.f03 f03Var = k2Var.f500621c;
            if (jbVar4 == null) {
                aVar3.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebSearchRedDotReporter", "reportErased, invalid params, ctrInfo: " + jbVar4 + ", showInfo: " + f03Var);
            } else {
                aVar3.a("red_dot_erase", jbVar4, f03Var, null);
            }
        }
        j75.d dVar5 = state.f379599d;
        if (dVar5 != null && (dVar5 instanceof tg0.p2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearchCommonSyncRedDotFSC", "onObserveCheckDBRequest, fromBiz: " + ((tg0.p2) dVar5).f500635b);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a aVar4 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a(false, null, null, "");
            j75.f Ai2 = oVar.Ai();
            if (Ai2 != null) {
                Ai2.B3(new tg0.i2(aVar4));
            }
        }
        j75.d dVar6 = state.f379599d;
        if (dVar6 != null && (dVar6 instanceof tg0.q2)) {
            tg0.q2 q2Var = (tg0.q2) dVar6;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onObserveSyncRequest, syncScene: ");
            sb7.append(q2Var.f500636b);
            sb7.append(", cgiBizId: ");
            int i17 = q2Var.f500637c;
            sb7.append(i17);
            sb7.append(", shouldCheckConfig: false, ctxBuffer: ");
            byte[] bArr = q2Var.f500638d;
            sb7.append(bArr);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearchCommonSyncRedDotFSC", sb7.toString());
            qVar.U6(q2Var.f500636b, i17, false, bArr);
        }
        j75.d dVar7 = state.f379599d;
        if (dVar7 != null && (dVar7 instanceof tg0.n2)) {
            tg0.n2 n2Var = (tg0.n2) dVar7;
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("onObserveWebSearchPage, pageEvent: ");
            sb8.append(n2Var.f500629b);
            sb8.append(", scene: ");
            int i18 = n2Var.f500630c;
            sb8.append(i18);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearchCommonSyncRedDotFSC", sb8.toString());
            int[] iArr = ug0.i.f508992a;
            p012xc85e97e9.p093xedfae76a.m mVar = n2Var.f500629b;
            int i19 = iArr[mVar.ordinal()];
            if (i18 == 20) {
                if (mVar == p012xc85e97e9.p093xedfae76a.m.ON_CREATE) {
                    qVar.U6(3000, 8, false, null);
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().N("Search.Entrance");
                } else if (mVar == p012xc85e97e9.p093xedfae76a.m.ON_DESTROY) {
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().N("Search.Entrance");
                }
            }
        }
        j75.d dVar8 = state.f379599d;
        if (dVar8 != null && (dVar8 instanceof tg0.m2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearchCommonSyncRedDotFSC", "requestRedDotSync onFindMoreResume.");
            qVar.U6(com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25536x34648872.f46687xbf7f413d, 8, true, null);
        }
        return jz5.f0.f384359a;
    }
}
