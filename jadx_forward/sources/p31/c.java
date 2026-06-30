package p31;

/* loaded from: classes13.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final p31.c f432983a = new p31.c();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.LinkedHashMap f432984b = new java.util.LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f432985c = new java.util.LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f432986d = new byte[0];

    /* renamed from: e, reason: collision with root package name */
    public static int f432987e = -1;

    /* renamed from: f, reason: collision with root package name */
    public static final android.media.AudioManager f432988f;

    static {
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("audio");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        f432988f = (android.media.AudioManager) systemService;
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5175x3ee93aa3>(a0Var) { // from class: com.tencent.mm.msgsubscription.voice.MsgSubscriptionVoicePlayHelperMM$mAudioPlayerEventListener$1
            {
                this.f39173x3fe91575 = 1218151603;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5175x3ee93aa3 c5175x3ee93aa3) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5175x3ee93aa3 event = c5175x3ee93aa3;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                int i17 = event.f135523g.f88249a;
                if (i17 != 2 && i17 != 4 && i17 != 5) {
                    return false;
                }
                synchronized (p31.c.f432986d) {
                    java.lang.Long l17 = (java.lang.Long) ((java.util.LinkedHashMap) p31.c.f432985c).get(event.f135523g.f88251c);
                    n01.c.b(event.f135523g.f88251c);
                    if (l17 != null) {
                        p31.c.f432984b.remove(l17);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgSubscriptionVoicePlayer", "[player event] action[" + event.f135523g.f88249a + "]  id[" + l17 + ']');
                    java.util.LinkedHashMap linkedHashMap = p31.c.f432984b;
                    if (linkedHashMap.entrySet().size() > 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgSubscriptionVoicePlayer", "[player event] play next audio, waiting to play size[" + linkedHashMap.size() + ']');
                        java.util.Set entrySet = linkedHashMap.entrySet();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(entrySet, "<get-entries>(...)");
                        java.lang.Object W = kz5.n0.W(entrySet);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(W, "first(...)");
                        java.util.Map.Entry entry = (java.util.Map.Entry) W;
                        p31.c cVar = p31.c.f432983a;
                        java.lang.Object value = entry.getValue();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(value, "<get-value>(...)");
                        java.lang.Object key = entry.getKey();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(key, "<get-key>(...)");
                        cVar.a((java.lang.String) value, ((java.lang.Number) key).longValue());
                    } else {
                        int i18 = p31.c.f432987e;
                        if (i18 != -1) {
                            p31.c.f432988f.setStreamVolume(3, i18, 4);
                            p31.c.f432987e = -1;
                        }
                    }
                }
                return false;
            }
        }.mo48813x58998cd();
    }

    public final void a(java.lang.String str, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgSubscriptionVoicePlayer", "[innerPlay] id[" + j17 + "]  url[" + str + ']');
        n01.b bVar = new n01.b();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        sb6.append(f432983a.hashCode());
        java.lang.String a17 = n01.c.a(sb6.toString(), dl3.h.a());
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.util.Map map = f432985c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
        map.put(a17, valueOf);
        bVar.f415369a = a17;
        bVar.f415370b = str;
        bVar.f415375g = true;
        android.media.AudioManager audioManager = f432988f;
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        if ((streamVolume * 1.0f) / streamMaxVolume < 0.4d) {
            if (f432987e == -1) {
                f432987e = streamVolume;
            }
            audioManager.setStreamVolume(3, (int) (streamMaxVolume * 0.4d), 5);
        }
        n01.c.g(bVar);
    }
}
