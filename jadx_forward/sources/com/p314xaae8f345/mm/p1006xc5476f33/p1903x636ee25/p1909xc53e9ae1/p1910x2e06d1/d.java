package com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1;

/* loaded from: classes13.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.j f232186a = new com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.C16627x78a2dbe7(null);

    /* renamed from: b, reason: collision with root package name */
    public static boolean f232187b = false;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f232188c = false;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Set f232189d = new java.util.HashSet(java.util.Arrays.asList(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.EnumC25335x2fd46b65.nlog.m93815xfb82e301(), com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.EnumC25335x2fd46b65.audioCommon.m93815xfb82e301()));

    public static synchronized boolean a() {
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.d.class) {
            if (f232187b) {
                return true;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.j jVar = f232186a;
            if (jVar == null) {
                return false;
            }
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.EnumC25335x2fd46b65 enumC25335x2fd46b65 = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.EnumC25335x2fd46b65.nlog;
            jVar.mo67215x32c4e6(enumC25335x2fd46b65.m93815xfb82e301());
            f232186a.mo67215x32c4e6(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.EnumC25335x2fd46b65.audioCommon.m93815xfb82e301());
            if (!f232186a.mo67213x21901b2d(enumC25335x2fd46b65.m93815xfb82e301())) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerUtils", "enableNativeLog fail");
                return false;
            }
            try {
                f232187b = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25317xab0afe6f.m93557x3f52cd6a(null);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Audio.AudioPlayerUtils", th6, "checkNLogLoad", new java.lang.Object[0]);
                if (!fp.h.a(20)) {
                    throw th6;
                }
                f232187b = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25317xab0afe6f.m93557x3f52cd6a(null);
            }
            if (f232187b) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerUtils", "enableNativeLog success");
            }
            return f232187b;
        }
    }

    public static void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerUtils", "configQQMusicSdkConfig");
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25317xab0afe6f.m93564xca027b82(new com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.a());
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25317xab0afe6f.m93565x1ff74af0(new com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.b());
        if (f232187b || f232188c) {
            return;
        }
        f232188c = true;
        s75.d.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.c(), "audio load NLog");
    }
}
