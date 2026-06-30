package gr;

/* loaded from: classes10.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final gr.v f356229a = new gr.v();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Boolean[] f356230b = {java.lang.Boolean.FALSE};

    /* renamed from: c, reason: collision with root package name */
    public static final gr.u f356231c = new gr.u();

    public final void a(boolean z17) {
        java.lang.Boolean[] boolArr = f356230b;
        if (!boolArr[0].booleanValue() || z17) {
            synchronized (boolArr) {
                if (!boolArr[0].booleanValue() || z17) {
                    gr.u uVar = f356231c;
                    java.lang.Object obj = uVar.get();
                    java.lang.Boolean bool = java.lang.Boolean.TRUE;
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, bool)) {
                        return;
                    }
                    try {
                        uVar.set(bool);
                        java.util.ArrayList a17 = gr.t.g().a();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        for (java.lang.Object obj2 : a17) {
                            if (true ^ n22.m.l((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) obj2)) {
                                arrayList.add(obj2);
                            }
                        }
                        int size = arrayList.size();
                        boolean z18 = size >= gr.z.a();
                        gr.v vVar = f356229a;
                        vVar.b().putInt("normal_custom_size", size);
                        vVar.b().putBoolean("custom_full", z18);
                        int size2 = gr.t.g().b(false).size();
                        boolean z19 = size2 >= com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("CaptureEmojiMaxSize"), 300);
                        vVar.b().putInt("capture_custom_size", size2);
                        vVar.b().putBoolean("capture_full", z19);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiStorageState", "init: normal size is " + size + ' ' + z18 + "; capture size is " + size2 + ' ' + z19);
                    } finally {
                        f356231c.set(java.lang.Boolean.FALSE);
                    }
                }
            }
        }
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 b() {
        a(false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("emoji_stg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(M, "getMMKV(...)");
        return M;
    }

    public final boolean c() {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            return true;
        }
        boolean o17 = gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_STORE_IP_INTRO_SHOWN_BOOLEAN, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiStorageState", "hasShowIpIntro: " + o17);
        return o17;
    }

    public final void d() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiStorageState", "setIpIntroShow: ");
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_STORE_IP_INTRO_SHOWN_BOOLEAN, java.lang.Boolean.TRUE);
        }
    }
}
