package x51;

/* loaded from: classes10.dex */
public class j implements java.lang.Runnable {
    public j(com.p314xaae8f345.mm.p1004x2137b148.C11324x73847af c11324x73847af) {
    }

    @Override // java.lang.Runnable
    public void run() {
        r75.d dVar = r75.d.f474787a;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("NetWorkCache", "initCache error ctx is null");
        } else {
            synchronized (dVar) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NetWorkCache", "registerNetWorkBroadCastReceiver = " + r75.d.f474788b);
                if (!r75.d.f474788b) {
                    ((ku5.t0) ku5.t0.f394148d).g(new r75.b(context));
                    r75.d.f474788b = true;
                }
            }
        }
        boolean i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().i("clicfg_network_cache_wifi", true);
        boolean i18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().i("clicfg_network_cache_wap", true);
        boolean i19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().i("clicfg_get_active_network_cache", true);
        r75.d.f474792f = i17;
        r75.d.f474793g = i18;
        r75.d.f474794h = i19;
    }
}
