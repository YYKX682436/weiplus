package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes12.dex */
public abstract class a8 {
    public static void a(android.content.Context context, int i17, java.lang.Number number) {
        com.p314xaae8f345.mm.app.p5.e("MicroMsg.StartupILogsReport", "reportNumericValue: typeId:%s, value:%s", java.lang.Integer.valueOf(i17), number);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.String W = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.W(context, android.os.Process.myPid());
        if (W == null) {
            W = "";
        }
        com.p314xaae8f345.mm.app.p5.b(21381, valueOf, W, number);
    }

    public static void b(android.content.Context context, int i17, java.lang.String str) {
        java.lang.String replace = str.replace(',', ';');
        com.p314xaae8f345.mm.app.p5.e("MicroMsg.StartupILogsReport", "reportStringValue: typeId:%s, value:%s", java.lang.Integer.valueOf(i17), replace);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.String W = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.W(context, android.os.Process.myPid());
        if (W == null) {
            W = "";
        }
        com.p314xaae8f345.mm.app.p5.b(21381, valueOf, W, 0, replace);
    }
}
