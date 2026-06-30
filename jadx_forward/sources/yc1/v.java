package yc1;

/* loaded from: classes15.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yc1.w f542346d;

    public v(yc1.w wVar) {
        this.f542346d = wVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f542346d.f542350g.f542356g) {
            yc1.w wVar = this.f542346d;
            yc1.z zVar = wVar.f542350g;
            if (!((java.util.concurrent.ConcurrentHashMap) zVar.f542356g).containsKey(zVar.C(wVar.f542347d, wVar.f542348e))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOperateLocalServicesScan", "scan task not exist, cancel auto stop");
                return;
            }
            uh1.o1.INSTANCE.a(this.f542346d.f542349f);
            yc1.w wVar2 = this.f542346d;
            yc1.z zVar2 = wVar2.f542350g;
            ((java.util.concurrent.ConcurrentHashMap) zVar2.f542356g).remove(zVar2.C(wVar2.f542347d, wVar2.f542348e));
            android.net.wifi.WifiManager.MulticastLock multicastLock = this.f542346d.f542350g.f542357h;
            if (multicastLock != null) {
                try {
                    if (multicastLock.isHeld()) {
                        multicastLock.release();
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiOperateLocalServicesScan", e17.getMessage());
                }
            }
        }
    }
}
