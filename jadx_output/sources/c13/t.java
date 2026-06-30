package c13;

/* loaded from: classes11.dex */
public final class t implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public static final c13.t f37921d = new c13.t();

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipService", "physicalOrientationObserver, " + num);
        c13.b0 b0Var = c13.b0.f37860d;
        kotlin.jvm.internal.o.d(num);
        int intValue = num.intValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipService", "onPhysicalOrientationChanged: " + intValue);
        com.tencent.pigeon.flutter_voip.VoIPFlutterApi voIPFlutterApi = c13.b0.f37861e;
        if (voIPFlutterApi != null) {
            voIPFlutterApi.onDevicePhysicalOrientationChanged(intValue, new c13.c("onPhysicalOrientationChanged: " + intValue + ", callback"));
        }
    }
}
