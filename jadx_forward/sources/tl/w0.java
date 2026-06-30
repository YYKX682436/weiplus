package tl;

/* loaded from: classes12.dex */
public class w0 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f501707a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f501708b;

    static {
        a();
    }

    public static void a() {
        boolean z17 = j62.e.g().i("clicfg_load_silkso_ignore_cpu", 1, true, true) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkCodec", "load wechatvoicesilk, ignore cpu: %s", java.lang.Boolean.valueOf(z17));
        int a17 = wo.r.a();
        java.lang.String str = android.os.Build.CPU_ABI;
        java.lang.String str2 = android.os.Build.CPU_ABI2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkCodec", "abi: %s, abi2: %s, cpuFlag: %d", str, str2, java.lang.Integer.valueOf(a17));
        if (z17) {
            try {
                tl.i0.class.getClassLoader();
                fp.d0.n("wechatvoicesilk");
                f501707a = true;
                f501708b = true;
            } catch (java.lang.UnsatisfiedLinkError unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkCodec", "load library failed!");
                f501707a = false;
                f501708b = false;
            }
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || str.contains("armeabi") || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || str2.contains("armeabi")) {
            try {
                if ((a17 & 1024) != 0) {
                    tl.i0.class.getClassLoader();
                    fp.d0.n("wechatvoicesilk");
                    f501707a = true;
                    f501708b = true;
                } else if ((a17 & 512) != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("voice SilkCodec", "load library failed! silk don't support armv6!!!!");
                    f501707a = false;
                    f501708b = false;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("voice SilkCodec", "load library failed! silk don't support armv5!!!!");
                    f501707a = false;
                    f501708b = false;
                }
            } catch (java.lang.UnsatisfiedLinkError unused2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkCodec", "load library failed!");
                f501707a = false;
                f501708b = false;
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkCodec", "don't contains armeabi");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("voice SilkCodec", "load library failed! silk don't support armv5!!!!");
            f501707a = false;
            f501708b = false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkCodec", "finish load silk so, canUseSilkDecode: %b, canUseSilkEncode: %b", java.lang.Boolean.valueOf(f501707a), java.lang.Boolean.valueOf(f501708b));
    }
}
