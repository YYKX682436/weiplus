package com.tencent.mm.app;

/* loaded from: classes11.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f53355a = com.tencent.mm.storage.v3.f196273a + "channel_history.cfg";

    public static void a(android.content.Context context) {
        int i17;
        uk.b b17;
        uk.c cVar;
        com.tencent.mm.sdk.platformtools.a0.e(context);
        try {
            java.lang.String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.sourceDir;
            if (context.getApplicationInfo().targetSdkVersion <= 29 && (b17 = uk.b.b(str)) != null && (cVar = b17.f428482b) != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChannelHistory", "apk external info not null");
                int i18 = cVar.f428484e;
                if (i18 != 0) {
                    com.tencent.mm.sdk.platformtools.a0.f192439b = i18;
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChannelHistory", "read channelId from apk external");
                }
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChannelHistory", "NameNotFoundException");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChannelHistory", "Exception in initChannel, %s", e17.getMessage());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChannelHistory", "now channel id = %d, proce name = %s", java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.a0.f192439b), bm5.f1.a());
        if (!b()) {
            java.io.RandomAccessFile randomAccessFile = null;
            try {
                try {
                    randomAccessFile = com.tencent.mm.vfs.w6.B(f53355a, true);
                    randomAccessFile.write(java.lang.String.format("%d\n", java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.a0.f192439b)).getBytes());
                    try {
                        randomAccessFile.close();
                    } catch (java.lang.Exception e18) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChannelHistory", e18, "Close ChannelHistory History file failed.", "");
                    }
                } catch (java.lang.Exception e19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChannelHistory", e19, "Open ChannelHistory History file failed.", "");
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (java.lang.Exception e27) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChannelHistory", e27, "Close ChannelHistory History file failed.", "");
                        }
                    }
                }
            } catch (java.lang.Throwable th6) {
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (java.lang.Exception e28) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChannelHistory", e28, "Close ChannelHistory History file failed.", "");
                    }
                }
                throw th6;
            }
        }
        com.tencent.mm.booter.s b18 = com.tencent.mm.booter.s.b(context);
        if (b18 == null || (i17 = b18.f63562a) == -1) {
            return;
        }
        com.tencent.mm.sdk.platformtools.a0.f192439b = i17;
    }

    public static boolean b() {
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(f53355a);
        java.lang.String str = a17.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (m17.a()) {
            return m17.f213266a.F(m17.f213267b);
        }
        return false;
    }
}
