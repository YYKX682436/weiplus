package w11;

/* loaded from: classes11.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Boolean f523554a;

    public f1(android.content.Context context, w11.e1 e1Var, boolean z17) {
        java.lang.Boolean bool = null;
        this.f523554a = null;
        try {
            java.lang.Boolean bool2 = (java.lang.Boolean) android.os.PowerManager.class.getMethod("isScreenOn", new java.lang.Class[0]).invoke((android.os.PowerManager) context.getSystemService("power"), new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenState", "reflectScreenOn: byReflect:%s isScreenOn:%s", bool2, this.f523554a);
            bool = bool2;
        } catch (java.lang.Exception e17) {
            jx3.f.INSTANCE.mo68477x336bdfd8(99, 154L, 1L, false);
            java.lang.Boolean bool3 = this.f523554a;
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScreenState", "reflectScreenOn invoke ERROR use isScreenOn:%s e:%s", bool3, com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
        this.f523554a = bool;
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.registerReceiver(new w11.d1(this, e1Var, z17), intentFilter);
    }
}
