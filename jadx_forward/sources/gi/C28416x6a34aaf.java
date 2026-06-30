package gi;

/* renamed from: gi.w0$$h */
/* loaded from: classes12.dex */
public final /* synthetic */ class C28416x6a34aaf implements wh.u0 {
    @Override // wh.u0
    /* renamed from: apply */
    public final java.lang.Object mo40854x58b836e(java.lang.Object obj) {
        rh.c3 c3Var = (rh.c3) obj;
        android.os.SystemClock.uptimeMillis();
        rh.x2 b17 = rh.x2.b(-1L);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        android.content.Intent intent = null;
        try {
            intent = context.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        } catch (java.lang.Exception e17) {
            oj.j.f("MicroMsg.BatteryCurrentSnapshot", "get ACTION_BATTERY_CHANGED failed: " + e17.getMessage(), new java.lang.Object[0]);
        }
        if (intent != null) {
            b17 = rh.x2.b(java.lang.Long.valueOf(intent.getIntExtra("voltage", -1)));
        }
        long longValue = ((java.lang.Long) b17.f477085a).longValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.battery.MMCompositeMonitors", "onSampling " + c3Var.f476879g + " " + c3Var.f476873a + ", val = " + longValue);
        return java.lang.Long.valueOf(longValue);
    }
}
