package com.tencent.kinda.framework.sns_cross;

/* loaded from: classes5.dex */
class SnsTextUtil {
    public static java.lang.String getReceiverText(android.content.Context context, java.lang.String str, java.lang.String str2) {
        java.lang.String x17 = com.tencent.mm.wallet_core.ui.r1.x(str);
        if (x17 != null && x17.length() > 10) {
            x17 = x17.substring(0, 10) + context.getString(com.tencent.mm.R.string.kws);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return x17;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(x17)) {
            return str2;
        }
        return x17 + "(" + com.tencent.mm.wallet_core.ui.r1.y(str2) + ")";
    }
}
