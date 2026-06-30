package be1;

/* loaded from: classes7.dex */
public class a1 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 230;
    public static final java.lang.String NAME = "vibrateShort";

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        boolean z17;
        char c17;
        java.lang.String str;
        if (lVar.getAppState() != u81.b.FOREGROUND) {
            lVar.a(i17, o("fail:not allowed in background"));
            return;
        }
        if (jSONObject != null && jSONObject.has("style")) {
            java.lang.String optString = jSONObject.optString("style");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                optString.getClass();
                switch (optString.hashCode()) {
                    case -1078030475:
                        if (optString.equals(ya.b.MEDIUM)) {
                            z17 = false;
                            break;
                        }
                        z17 = -1;
                        break;
                    case 99152071:
                        if (optString.equals("heavy")) {
                            z17 = true;
                            break;
                        }
                        z17 = -1;
                        break;
                    case 102970646:
                        if (optString.equals("light")) {
                            z17 = 2;
                            break;
                        }
                        z17 = -1;
                        break;
                    default:
                        z17 = -1;
                        break;
                }
                switch (z17) {
                    case false:
                        c17 = 2;
                        break;
                    case true:
                        c17 = 3;
                        break;
                    case true:
                        c17 = 1;
                        break;
                }
            }
            c17 = 65534;
        } else {
            c17 = 65535;
        }
        try {
            android.os.Vibrator vibrator = (android.os.Vibrator) lVar.getContext().getSystemService("vibrator");
            if (vibrator == null) {
                lVar.a(i17, o("fail: vibrate is not support"));
                return;
            }
            if (65534 == c17) {
                vibrator.vibrate(15L);
                str = "fail: style is illegal";
            } else {
                if (65535 == c17) {
                    vibrator.vibrate(15L);
                } else if (android.os.Build.VERSION.SDK_INT < 26 || !vibrator.hasAmplitudeControl()) {
                    vibrator.vibrate(15L);
                    str = "fail: style is not support";
                } else {
                    int i18 = c17 != 1 ? c17 != 2 ? c17 != 3 ? -1 : 255 : 192 : 128;
                    if (-1 == i18) {
                        vibrator.vibrate(15L);
                    } else {
                        vibrator.vibrate(android.os.VibrationEffect.createOneShot(15L, i18));
                    }
                }
                str = "ok";
            }
            lVar.a(i17, o(str));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiVibrateShort", "vibrateShort exception %s", e17.getMessage());
            lVar.a(i17, o("fail: system internal error"));
        }
    }
}
