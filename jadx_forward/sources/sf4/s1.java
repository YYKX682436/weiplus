package sf4;

/* loaded from: classes4.dex */
public final class s1 implements dn.l {

    /* renamed from: d, reason: collision with root package name */
    public final long f489111d;

    public s1(long j17) {
        this.f489111d = j17;
    }

    @Override // dn.l
    public void x(java.lang.String str, dn.h hVar) {
        if4.h hVar2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryVideoPreloadMgr", hashCode() + " onPreloadCompleted, mediaId:" + str + ", sceneResult:" + hVar);
        boolean z17 = false;
        if (hVar != null && hVar.f69553xb5f54fe9 == -21112) {
            z17 = true;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryVideoPreloadMgr", hashCode() + " onPreloadCompleted, mediaId:" + str + ", video source change!");
            sf4.u1.a(sf4.u1.f489116a, str);
            return;
        }
        if (str == null || hVar == null) {
            return;
        }
        java.util.Map map = sf4.u1.f489121f;
        if (!map.containsKey(str) || (hVar2 = (if4.h) map.get(str)) == null) {
            return;
        }
        if (hVar.f69548xe026fea1 <= 0 || hVar.f69523x17c343e7 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.StoryVideoPreloadMgr", hashCode() + " onPreloadCompleted error, recvedBytes:" + hVar.f69548xe026fea1 + ", fileLength:" + hVar.f69523x17c343e7);
            return;
        }
        nf4.o b17 = ef4.k0.f333992a.b(hVar2);
        b17.f66549x799e9d9e = (int) hVar.f69548xe026fea1;
        b17.f66552x78351860 = (int) hVar.f69523x17c343e7;
        ef4.w.f334001t.k().D0(b17);
        sf4.u1.f489123h.add(str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(hashCode());
        sb6.append(" onPreloadCompleted update cacheSize:");
        sb6.append(b17.f66549x799e9d9e);
        sb6.append(", totalSize:");
        sb6.append(b17.f66552x78351860);
        sb6.append(", preloadCost:");
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(android.os.SystemClock.elapsedRealtime() - this.f489111d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryVideoPreloadMgr", sb6.toString());
        pm0.v.X(new sf4.r1(str));
    }
}
