package rx;

@j95.b
/* loaded from: classes12.dex */
public class l extends i95.w implements sx.e0 {
    public boolean Ai(dn.m mVar) {
        com.p314xaae8f345.mm.p947xba6de98f.h2 fj6 = com.p314xaae8f345.mm.p947xba6de98f.s1.fj();
        fj6.getClass();
        if (mVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CdnTransportService", "addRecvTask task info is null");
            return false;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mVar.f69601xaca5bdda)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CdnTransportService", "addRecvTask mediaId is null");
            return false;
        }
        if (mVar.f69591xf9dbbe9c == null) {
            mVar.f69591xf9dbbe9c = "";
        }
        if (mVar.f69575xf11df5f5 == null) {
            mVar.f69575xf11df5f5 = "";
        }
        mVar.f323319e = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnTransportService", "CdnTransportService cdn thread run %s", mVar.f69601xaca5bdda);
        ((java.util.LinkedList) fj6.f152526q).add(mVar.f69601xaca5bdda);
        ((java.util.HashMap) fj6.f152527r).put(mVar.f69601xaca5bdda, mVar);
        fj6.j(false);
        return true;
    }

    public boolean Bi(dn.m mVar) {
        return com.p314xaae8f345.mm.p947xba6de98f.s1.fj().d(mVar);
    }

    public boolean Di(java.lang.String str) {
        com.p314xaae8f345.mm.p947xba6de98f.h2 fj6 = com.p314xaae8f345.mm.p947xba6de98f.s1.fj();
        dn.m mVar = (dn.m) ((java.util.concurrent.ConcurrentHashMap) fj6.f152528s).remove(str);
        if (mVar != null) {
            int i17 = mVar.f69592xf1ebe47b;
            if (i17 == 30001 || i17 == 30003 || i17 == 30007 || i17 == 31000) {
                com.p314xaae8f345.mm.p947xba6de98f.s1.cj().w(str);
            } else if (mVar.F) {
                com.p314xaae8f345.mm.p947xba6de98f.s1.cj().v(str);
            } else {
                com.p314xaae8f345.mm.p947xba6de98f.s1.cj().getClass();
                ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37741x70920b1f(str);
            }
            jx3.f fVar = jx3.f.INSTANCE;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(mVar.f69592xf1ebe47b);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            fVar.d(10769, -10002, valueOf, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - mVar.f69615x1bb3b54a));
        }
        ((java.util.HashMap) fj6.f152527r).remove(str);
        ((java.util.HashMap) fj6.f152529t).remove(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnTransportService", "summersafecdn cdntra cancelRecvTask mediaid:%s mapremove:%s engine ret:%d", str, mVar, 0);
        return true;
    }

    public boolean Ni(java.lang.String str) {
        com.p314xaae8f345.mm.p947xba6de98f.h2 fj6 = com.p314xaae8f345.mm.p947xba6de98f.s1.fj();
        dn.m mVar = (dn.m) ((java.util.concurrent.ConcurrentHashMap) fj6.f152528s).remove(str);
        if (mVar != null) {
            com.p314xaae8f345.mm.p947xba6de98f.s1.cj().getClass();
            ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37741x70920b1f(str);
            jx3.f fVar = jx3.f.INSTANCE;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(mVar.f69592xf1ebe47b);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            fVar.d(10769, -10003, valueOf, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - mVar.f69615x1bb3b54a));
        }
        ((java.util.HashMap) fj6.f152527r).remove(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnTransportService", "summersafecdn cdntra cancelSendTask mediaid:%s mapremove:%s engine ret:%d", str, mVar, 0);
        return true;
    }

    public boolean Ri(int i17) {
        return com.p314xaae8f345.mm.p947xba6de98f.s1.fj().k(i17);
    }

    public boolean wi(dn.m mVar) {
        com.p314xaae8f345.mm.p947xba6de98f.h2 fj6 = com.p314xaae8f345.mm.p947xba6de98f.s1.fj();
        fj6.getClass();
        if (mVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CdnTransportService", "addRecvTask task info is null");
            return false;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mVar.f69601xaca5bdda)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CdnTransportService", "addRecvTask mediaId is null");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0 c4446x11b6e6e0 = (com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37501x76847179().m37619x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class);
        if (c4446x11b6e6e0 != null && c4446x11b6e6e0.m37796x95bf072(mVar.f69601xaca5bdda)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CdnTransportService", "addRecvTask task exist %s", mVar.f69601xaca5bdda);
            return false;
        }
        if (mVar.f69591xf9dbbe9c == null) {
            mVar.f69591xf9dbbe9c = "";
        }
        if (mVar.f69575xf11df5f5 == null) {
            mVar.f69575xf11df5f5 = "";
        }
        mVar.f323319e = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnTransportService", "addRecvTask id:%s appType:%s fileType:%s", mVar.f69601xaca5bdda, java.lang.Integer.valueOf(mVar.f69580x454032b6), java.lang.Integer.valueOf(mVar.f69580x454032b6));
        ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p947xba6de98f.b2(fj6, -1, mVar), "MicroMsg.Cdn.ThreadName");
        return true;
    }
}
