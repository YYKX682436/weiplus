package sn1;

/* loaded from: classes12.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sn1.f f491535d;

    public d(sn1.f fVar) {
        this.f491535d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = sn1.i.f491546g;
        synchronized (concurrentHashMap) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            int i17 = 0;
            for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
                if (entry != null) {
                    try {
                        com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1 c19764x527bffc1 = ((sn1.i) entry.getValue()).f491558e;
                        if (c19764x527bffc1 != null) {
                            sn1.e eVar = sn1.i.f491549m;
                            if (eVar != null) {
                                ((ln1.g) eVar).d(((java.lang.Integer) entry.getKey()).intValue(), c19764x527bffc1.f38861x6ac9171, ((sn1.i) entry.getValue()).mo808xfb85f7b0());
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupBaseScene", "resendSceneMap sceneSeq[%d], type[%d], sceneBuf[%d]", entry.getKey(), java.lang.Integer.valueOf(((sn1.i) entry.getValue()).mo808xfb85f7b0()), java.lang.Integer.valueOf(c19764x527bffc1.f38861x6ac9171.length));
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupBaseScene", "resendSceneMap engineSender null, sceneSeq[%d], type[%d], sceneBuf[%d]", entry.getKey(), java.lang.Integer.valueOf(((sn1.i) entry.getValue()).mo808xfb85f7b0()), java.lang.Integer.valueOf(c19764x527bffc1.f38861x6ac9171.length));
                            }
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupBaseScene", "resendSceneMap sceneBuf null, sceneSeq[%d]", entry.getKey());
                        }
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BackupBaseScene", e17, "req to buf fail: " + e17.toString(), new java.lang.Object[0]);
                    }
                    i17++;
                }
                if (i17 > 0 && i17 % 5 == 0) {
                    ((qn1.w) this.f491535d).a(false);
                }
            }
            ((qn1.w) this.f491535d).a(true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupBaseScene", "resendSceneMap finish, sceneMap[%d], time[%d]", java.lang.Integer.valueOf(sn1.i.f491546g.size()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        }
    }
}
