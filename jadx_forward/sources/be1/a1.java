package be1;

/* loaded from: classes7.dex */
public class a1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f4206x366c91de = 230;

    /* renamed from: NAME */
    public static final java.lang.String f4207x24728b = "vibrateShort";

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        boolean z17;
        char c17;
        java.lang.String str;
        if (lVar.mo48799xc0ccc466() != u81.b.FOREGROUND) {
            lVar.a(i17, o("fail:not allowed in background"));
            return;
        }
        if (jSONObject != null && jSONObject.has("style")) {
            java.lang.String optString = jSONObject.optString("style");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                optString.getClass();
                switch (optString.hashCode()) {
                    case -1078030475:
                        if (optString.equals(ya.b.f77490x87518375)) {
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
            android.os.Vibrator vibrator = (android.os.Vibrator) lVar.mo50352x76847179().getSystemService("vibrator");
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiVibrateShort", "vibrateShort exception %s", e17.getMessage());
            lVar.a(i17, o("fail: system internal error"));
        }
    }
}
