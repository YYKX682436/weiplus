package a84;

/* loaded from: classes4.dex */
public abstract class c0 {
    public static int a(java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseColor", "com.tencent.mm.plugin.sns.ad.utils.ColorUtil");
        try {
            if (!android.text.TextUtils.isEmpty(str)) {
                i17 = android.graphics.Color.parseColor(str);
            }
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.w("SnsAd.ColorUtil", "parse color from string failed, return default value!");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseColor", "com.tencent.mm.plugin.sns.ad.utils.ColorUtil");
        return i17;
    }

    public static java.lang.String b(float f17, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseColor", "com.tencent.mm.plugin.sns.ad.utils.ColorUtil");
        try {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#");
            sb6.append(java.lang.Integer.toHexString((int) (f17 * 255.0f)));
            if (str.startsWith("#")) {
                sb6.append(str.substring(1));
            } else {
                sb6.append(str);
            }
            java.lang.String sb7 = sb6.toString();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseColor", "com.tencent.mm.plugin.sns.ad.utils.ColorUtil");
            return sb7;
        } catch (java.lang.Throwable unused) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseColor", "com.tencent.mm.plugin.sns.ad.utils.ColorUtil");
            return "";
        }
    }

    public static java.lang.String c(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseColor", "com.tencent.mm.plugin.sns.ad.utils.ColorUtil");
        try {
            java.lang.String b17 = b(java.lang.Float.parseFloat(str), str2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseColor", "com.tencent.mm.plugin.sns.ad.utils.ColorUtil");
            return b17;
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.w("SnsAd.ColorUtil", "parse color from string failed");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseColor", "com.tencent.mm.plugin.sns.ad.utils.ColorUtil");
            return str2;
        }
    }
}
