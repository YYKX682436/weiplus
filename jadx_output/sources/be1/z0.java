package be1;

/* loaded from: classes7.dex */
public class z0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 231;
    public static final java.lang.String NAME = "vibrateLong";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (lVar.getAppState() != u81.b.FOREGROUND) {
            lVar.a(i17, o("fail:not allowed in background"));
            return;
        }
        android.os.Vibrator vibrator = (android.os.Vibrator) lVar.getContext().getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.vibrate(400L);
        }
        lVar.a(i17, o("ok"));
    }
}
