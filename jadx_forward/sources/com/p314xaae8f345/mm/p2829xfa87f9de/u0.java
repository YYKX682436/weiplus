package com.p314xaae8f345.mm.p2829xfa87f9de;

/* loaded from: classes11.dex */
public abstract class u0 {
    public static void a(android.content.Context context, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XWeb.MM.XWebUpdateHelper", "checkUpdateNow, type:" + i17 + ", stack:" + android.util.Log.getStackTraceString(new java.lang.Throwable("please ignore this exception")));
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(context.getPackageName(), "com.tencent.mm.sandbox.updater.UpdaterService");
        intent.putExtra("intent_extra_download_type", i17);
        l85.h1.e(intent, "support", true, j45.l.e("support"));
    }
}
