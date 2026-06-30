package dk2;

/* loaded from: classes3.dex */
public final class wg implements com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.xg f315823d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f315824e;

    public wg(dk2.xg xgVar, java.lang.Runnable runnable) {
        this.f315823d = xgVar;
        this.f315824e = runnable;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        int i17 = it.what;
        dk2.xg xgVar = this.f315823d;
        xgVar.getClass();
        if (i17 == 1) {
            java.lang.Object obj = it.obj;
            if (obj instanceof java.lang.Long) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.Long");
                long longValue = ((java.lang.Long) obj).longValue();
                this.f315823d.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SingleTaskLooper", this.f315823d.f315890a + " MSG_DISPATCH finish:" + this.f315823d.f315891b + " delay:" + longValue);
                if (this.f315823d.f315891b) {
                    this.f315823d.f315893d.mo50307xb9e94560(0, longValue);
                    this.f315823d.f315891b = false;
                }
            }
        } else if (i17 == 2) {
            xgVar.f315891b = true;
            this.f315823d.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SingleTaskLooper", this.f315823d.f315890a + " MSG_FINISH finish:" + this.f315823d.f315891b);
        } else if (i17 == 0) {
            this.f315823d.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SingleTaskLooper", this.f315823d.f315890a + " MSG_RUN finish:" + this.f315823d.f315891b);
            java.lang.Runnable runnable = this.f315824e;
            if (runnable != null) {
                runnable.run();
            }
        } else {
            this.f315823d.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SingleTaskLooper", this.f315823d.f315890a + " invalid msg:" + it.what);
        }
        return true;
    }
}
