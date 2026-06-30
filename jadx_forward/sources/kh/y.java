package kh;

/* loaded from: classes5.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final kh.y f389480d = new kh.y();

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f389481e;

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f389482f;

    static {
        jz5.i iVar = jz5.i.f384362d;
        f389481e = jz5.h.a(iVar, kh.v.f389465d);
        f389482f = jz5.h.a(iVar, kh.u.f389456d);
    }

    public final java.lang.Object a(java.lang.String str, java.lang.String str2) {
        try {
            if (r26.n0.D(str, str2, false, 2, null)) {
                java.lang.String substring = str.substring(r26.n0.L(str, str2, 0, false, 6, null) + str2.length());
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                if (r26.n0.B(substring, " ", false)) {
                    java.lang.String substring2 = substring.substring(0, r26.n0.L(substring, " ", 0, false, 6, null));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "substring(...)");
                    return substring2;
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        throw new java.lang.IllegalArgumentException();
    }

    public final boolean b() {
        if (!((java.lang.Boolean) f389481e.mo141623x754a37bb()).booleanValue()) {
            return false;
        }
        try {
            java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("audio");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            return ((android.media.AudioManager) systemService).isMusicActive();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.battery.AudioPower", "isMusicActive err: " + e17.getMessage());
            return false;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        java.lang.String str;
        java.lang.Object obj;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        jz5.g gVar = f389482f;
        for (android.media.AudioPlaybackConfiguration audioPlaybackConfiguration : (java.util.List) gVar.mo141623x754a37bb()) {
            kh.y yVar = f389480d;
            try {
                try {
                    java.lang.reflect.Field declaredField = audioPlaybackConfiguration.getClass().getDeclaredField("mPlayerIId");
                    declaredField.setAccessible(true);
                    java.lang.Object obj2 = declaredField.get(audioPlaybackConfiguration);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.Int");
                    i17 = ((java.lang.Integer) obj2).intValue();
                } catch (java.lang.Throwable unused) {
                    java.lang.String audioPlaybackConfiguration2 = audioPlaybackConfiguration.toString();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(audioPlaybackConfiguration2, "toString(...)");
                    i17 = ((java.lang.Number) yVar.a(audioPlaybackConfiguration2, "piid:")).intValue();
                }
            } catch (java.lang.Throwable unused2) {
                i17 = -1;
            }
            arrayList.add(java.lang.Integer.valueOf(i17));
            try {
                try {
                    java.lang.reflect.Field declaredField2 = audioPlaybackConfiguration.getClass().getDeclaredField("mPlayerState");
                    declaredField2.setAccessible(true);
                    obj = declaredField2.get(audioPlaybackConfiguration);
                } catch (java.lang.Throwable unused3) {
                }
            } catch (java.lang.Throwable unused4) {
                java.lang.String audioPlaybackConfiguration3 = audioPlaybackConfiguration.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(audioPlaybackConfiguration3, "toString(...)");
                str = (java.lang.String) yVar.a(audioPlaybackConfiguration3, "state:");
            }
            if (obj != null) {
                str = obj.toString();
                arrayList2.add(str);
            }
            str = null;
            arrayList2.add(str);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.battery.AudioPower", "onPlaybackConfigChanged: " + ((java.util.List) gVar.mo141623x754a37bb()).size() + ", isAudioActive=" + b() + ", playerIds=" + kz5.n0.g0(arrayList, ",", null, null, 0, null, null, 62, null) + ", playerStates=" + kz5.n0.g0(arrayList2, ",", null, null, 0, null, null, 62, null));
        ((java.util.List) gVar.mo141623x754a37bb()).clear();
    }
}
