package s65;

/* loaded from: classes12.dex */
public class d1 implements s65.w {
    public d1(s65.b1 b1Var) {
        pv1.c cVar;
        com.p314xaae8f345.mm.p2829xfa87f9de.y0.c();
        synchronized (pv1.c.class) {
            if (pv1.c.f440102c == null) {
                pv1.c.f440102c = new pv1.c();
            }
            hv1.d.f();
            cVar = pv1.c.f440102c;
        }
        by5.c4.f("WXFileDownloaderBridge", "setFileDownloaderProxy:" + cVar);
        rx5.c.f482883b = cVar;
    }

    @Override // s65.w
    public boolean d() {
        boolean l17 = com.p314xaae8f345.p3210x3857dc.a3.l();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XWeb.MM.WCWebDownloadMgr", "isBusy = " + l17);
        return l17;
    }

    @Override // s65.w
    public boolean e(android.content.Intent intent) {
        if (intent == null) {
            return false;
        }
        int intExtra = intent.getIntExtra("intent_extra_download_type", 4);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XWeb.MM.WCWebDownloadMgr", "handleCommand, downloadType:%d [4:timer/5:notify/6:config/7:auto]", java.lang.Integer.valueOf(intExtra));
        java.util.HashMap hashMap = new java.util.HashMap();
        if (intExtra == 5) {
            hashMap.put("UpdaterCheckType", "1");
        } else if (intExtra == 6) {
            hashMap.put("UpdaterCheckType", "5");
        } else if (intExtra == 7) {
            hashMap.put("UpdaterCheckType", "7");
        } else {
            hashMap.put("UpdaterCheckType", "0");
        }
        com.p314xaae8f345.p3210x3857dc.a3.A(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, hashMap);
        return true;
    }

    @Override // s65.w
    public void g(boolean z17) {
    }

    @Override // s65.w
    /* renamed from: onDestroy */
    public void mo163944xac79a11b() {
    }
}
