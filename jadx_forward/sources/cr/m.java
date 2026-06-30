package cr;

/* loaded from: classes12.dex */
public abstract class m {
    public static final boolean a(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4) {
        return (c21053xdbf1e5f4 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c21053xdbf1e5f4.f68659x5efe714f) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c21053xdbf1e5f4.f68642xf11e6e15)) ? false : true;
    }

    public static final boolean b(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4) {
        boolean z17;
        boolean z18;
        if (c21053xdbf1e5f4 == null) {
            return false;
        }
        if (!gr.z.f356236a) {
            int b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EnableEmoticonExternUrl", 0);
            int m64962x130a215f = com.p314xaae8f345.mm.p1006xc5476f33.gif.C16080x6bc1f265.m64962x130a215f();
            if ((b17 & 1) == 1) {
                try {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageManager().getPackageInfo("com.google.android.wearable.app.cn", 1);
                    z17 = true;
                } catch (java.lang.Throwable unused) {
                    z17 = false;
                }
                if (!z17) {
                    try {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageManager().getPackageInfo("com.google.android.wearable.app", 1);
                        z18 = true;
                    } catch (android.util.AndroidException | java.lang.Exception unused2) {
                        z18 = false;
                    }
                    if (!z18) {
                        gr.z.f356239d = true;
                    }
                }
                gr.z.f356239d = false;
            } else {
                gr.z.f356239d = false;
            }
            if (m64962x130a215f < 0) {
                gr.z.f356239d = false;
                switch (m64962x130a215f) {
                    case -906:
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(711L, 10L, 1L, false);
                        break;
                    case -905:
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(711L, 9L, 1L, false);
                        break;
                    case -904:
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(711L, 8L, 1L, false);
                        break;
                    case -903:
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(711L, 7L, 1L, false);
                        break;
                    case -902:
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(711L, 6L, 1L, false);
                        break;
                    case -901:
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(711L, 5L, 1L, false);
                        break;
                }
            }
            gr.z.f356236a = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmotionDynamicConfigMgr", "isEnableHevcDownload:%b", java.lang.Boolean.valueOf(gr.z.f356239d));
        }
        return (!(gr.z.f356239d && ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).bj()) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c21053xdbf1e5f4.f68661x765114aa) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c21053xdbf1e5f4.f68642xf11e6e15)) ? false : true;
    }
}
