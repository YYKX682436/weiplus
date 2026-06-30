package kn4;

@j95.b
/* loaded from: classes12.dex */
public class t extends i95.w implements pf0.q {
    public void Ai(java.lang.String str, dn.g gVar, dn.h hVar) {
        if (kn4.q.f391277b || str == null) {
            return;
        }
        if (gVar == null && hVar == null) {
            return;
        }
        if (gVar == null) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) kn4.q.f391279d;
            kn4.s sVar = (kn4.s) concurrentHashMap.get(str);
            if (sVar == null) {
                sVar = new kn4.s();
                concurrentHashMap.put(str, sVar);
            }
            sVar.f391282a++;
            sVar.f391283b = java.lang.System.currentTimeMillis();
        }
        if (str.startsWith("finder")) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).g(new kn4.r(gVar, str));
    }

    public void wi(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FileTransportStatsService", "A download event from " + str + " is occurred.");
        java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p2313x6760d4bd.C18772x22e12a88.f256877a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2313x6760d4bd.C18772x22e12a88.f256879c = java.lang.System.currentTimeMillis();
    }
}
