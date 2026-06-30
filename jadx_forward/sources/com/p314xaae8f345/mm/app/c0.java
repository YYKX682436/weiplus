package com.p314xaae8f345.mm.app;

/* loaded from: classes11.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f134888a = com.p314xaae8f345.mm.p2621x8fb0427b.v3.f277806a + "channel_history.cfg";

    public static void a(android.content.Context context) {
        int i17;
        uk.b b17;
        uk.c cVar;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.e(context);
        try {
            java.lang.String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.sourceDir;
            if (context.getApplicationInfo().targetSdkVersion <= 29 && (b17 = uk.b.b(str)) != null && (cVar = b17.f510015b) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChannelHistory", "apk external info not null");
                int i18 = cVar.f510017e;
                if (i18 != 0) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273972b = i18;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChannelHistory", "read channelId from apk external");
                }
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChannelHistory", "NameNotFoundException");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChannelHistory", "Exception in initChannel, %s", e17.getMessage());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChannelHistory", "now channel id = %d, proce name = %s", java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273972b), bm5.f1.a());
        if (!b()) {
            java.io.RandomAccessFile randomAccessFile = null;
            try {
                try {
                    randomAccessFile = com.p314xaae8f345.mm.vfs.w6.B(f134888a, true);
                    randomAccessFile.write(java.lang.String.format("%d\n", java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273972b)).getBytes());
                    try {
                        randomAccessFile.close();
                    } catch (java.lang.Exception e18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChannelHistory", e18, "Close ChannelHistory History file failed.", "");
                    }
                } catch (java.lang.Exception e19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChannelHistory", e19, "Open ChannelHistory History file failed.", "");
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (java.lang.Exception e27) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChannelHistory", e27, "Close ChannelHistory History file failed.", "");
                        }
                    }
                }
            } catch (java.lang.Throwable th6) {
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (java.lang.Exception e28) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChannelHistory", e28, "Close ChannelHistory History file failed.", "");
                    }
                }
                throw th6;
            }
        }
        com.p314xaae8f345.mm.p642xad8b531f.s b18 = com.p314xaae8f345.mm.p642xad8b531f.s.b(context);
        if (b18 == null || (i17 = b18.f145095a) == -1) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273972b = i17;
    }

    public static boolean b() {
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(f134888a);
        java.lang.String str = a17.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (m17.a()) {
            return m17.f294799a.F(m17.f294800b);
        }
        return false;
    }
}
