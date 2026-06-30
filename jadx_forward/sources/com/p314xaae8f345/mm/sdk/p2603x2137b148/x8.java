package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes12.dex */
public abstract class x8 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.b5 f274626a = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b5("wv_rss_rpt", java.util.concurrent.TimeUnit.HOURS.toMillis(24), true, true);

    public static java.io.File a(android.content.Context context) {
        java.io.File dir = context.getDir("wv_reserved_space_shinker", 0);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        return dir;
    }

    public static java.lang.String b(android.content.Context context, java.lang.String str) {
        java.lang.String a17 = bm5.f1.a();
        if (android.text.TextUtils.isEmpty(a17)) {
            a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.W(context, android.os.Process.myPid());
        }
        if (android.text.TextUtils.isEmpty(a17)) {
            return null;
        }
        return a17.replace('.', '_').replace(":", "__") + "_" + str;
    }

    public static void c(android.content.Context context) {
        try {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274648k) {
                java.lang.String b17 = b(context, "enabled");
                if (android.text.TextUtils.isEmpty(b17)) {
                    com.p314xaae8f345.mm.app.p5.c("MicroMsg.WVReservedSpaceShinkerWrapper", "[-] Fail to get marker file name, skip marking disabled.", new java.lang.Object[0]);
                    return;
                }
                java.io.File file = new java.io.File(a(context), b17);
                if (file.exists() && !file.delete()) {
                    com.p314xaae8f345.mm.app.p5.c("MicroMsg.WVReservedSpaceShinkerWrapper", "[-] Fail to mark disabled.", new java.lang.Object[0]);
                    return;
                }
                com.p314xaae8f345.mm.app.p5.e("MicroMsg.WVReservedSpaceShinkerWrapper", "[+] Mark disabled successfully.", new java.lang.Object[0]);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.mm.app.p5.d("MicroMsg.WVReservedSpaceShinkerWrapper", th6, "[-] Fail to mark disabled.", new java.lang.Object[0]);
        }
    }
}
