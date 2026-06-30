package com.p314xaae8f345.p347x615374d.p349x208df1fe.p357xa8b0beb9;

/* renamed from: com.tencent.kinda.framework.sns_cross.SnsTextUtil */
/* loaded from: classes5.dex */
class C3276xa07b1c47 {
    /* renamed from: getReceiverText */
    public static java.lang.String m26014x33f1a632(android.content.Context context, java.lang.String str, java.lang.String str2) {
        java.lang.String x17 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.x(str);
        if (x17 != null && x17.length() > 10) {
            x17 = x17.substring(0, 10) + context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kws);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return x17;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x17)) {
            return str2;
        }
        return x17 + "(" + com.p314xaae8f345.mm.p2802xd031a825.ui.r1.y(str2) + ")";
    }
}
