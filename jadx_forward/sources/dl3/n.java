package dl3;

/* loaded from: classes13.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dl3.i f316871d;

    public n(dl3.i iVar) {
        this.f316871d = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        dl3.i iVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "releaseAudioDelayRunnable, run");
        java.util.Iterator it = this.f316871d.f316846f.iterator();
        boolean z17 = false;
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (this.f316871d.p(str) == 0) {
                dl3.i iVar2 = this.f316871d;
                iVar2.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "destroyAllAudioPlayersAndSaveState, appId:%s", str);
                synchronized (iVar2.f316856p) {
                    java.util.LinkedList linkedList = (java.util.LinkedList) iVar2.f316848h.get(str);
                    if (linkedList != null && linkedList.size() != 0) {
                        java.util.Iterator it6 = linkedList.iterator();
                        while (it6.hasNext()) {
                            java.lang.String str2 = (java.lang.String) it6.next();
                            if (iVar2.B.f(str2)) {
                                iVar2.B.r(str2);
                            }
                            dl3.d0 d0Var = (dl3.d0) iVar2.f316842b.remove(str2);
                            iVar2.f316843c.remove(str2);
                            if (d0Var != null) {
                                iVar2.O(str2, d0Var);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "destroy player");
                                if (d0Var.f316819i) {
                                    iVar2.k(str2, d0Var);
                                } else {
                                    iVar2.k(str2, d0Var);
                                }
                            }
                        }
                        java.util.Iterator it7 = linkedList.iterator();
                        while (it7.hasNext()) {
                            java.lang.String str3 = (java.lang.String) it7.next();
                            if (iVar2.B.f(str3)) {
                                iVar2.B.r(str3);
                            }
                            dl3.d0 d0Var2 = (dl3.d0) iVar2.f316844d.remove(str3);
                            iVar2.f316845e.remove(str3);
                            if (d0Var2 != null) {
                                iVar2.O(str3, d0Var2);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "destroy recycled player");
                                if (d0Var2.f316819i) {
                                    iVar2.k(str3, d0Var2);
                                } else {
                                    iVar2.k(str3, d0Var2);
                                }
                            }
                        }
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.AudioPlayerMgr", "there is no audioIds and players for this appId to stop");
                }
                z17 = true;
            }
        }
        if (z17) {
            return;
        }
        synchronized (this.f316871d.f316856p) {
            iVar = this.f316871d;
            iVar.f316857q = true;
        }
        iVar.f316859s = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(this.f316871d.P, 1800000L);
    }
}
