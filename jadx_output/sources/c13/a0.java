package c13;

/* loaded from: classes11.dex */
public final class a0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public static final c13.a0 f37858d = new c13.a0();

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        c13.b0 b0Var = c13.b0.f37860d;
        kotlin.jvm.internal.o.d(bool);
        boolean booleanValue = bool.booleanValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipService", "onSystemRotateLockedChanged: " + booleanValue);
        com.tencent.pigeon.flutter_voip.VoIPFlutterApi voIPFlutterApi = c13.b0.f37861e;
        if (voIPFlutterApi != null) {
            voIPFlutterApi.onSystemRotateLockChanged(booleanValue, new c13.c("onSystemRotateLockedChanged: " + booleanValue + ", callback"));
        }
    }
}
