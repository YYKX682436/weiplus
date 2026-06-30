package q22;

/* loaded from: classes10.dex */
public final class b extends es0.c {

    /* renamed from: b, reason: collision with root package name */
    public static final q22.b f441338b = new q22.b();

    /* renamed from: c, reason: collision with root package name */
    public static boolean f441339c = true;

    @Override // es0.c
    public int c(java.lang.String key, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d(key), i17);
        }
        java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d(key);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiCapture", "getDynamicConfig, key: %s, value: %s", key, d17);
        if (d17 == null) {
            d17 = "";
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(d17, i17);
    }

    @Override // es0.c
    public java.lang.Object d() {
        return new q22.a(0, false, 0, 0, false, 31, null);
    }

    @Override // es0.c
    public void e() {
        ((q22.a) b()).f441334b = false;
        if (z65.c.a()) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                ((q22.a) b()).f441334b = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_SPRING_FESTIVAL_CROP_TYPE_INT, 1) == 0;
            } else {
                q22.a aVar = (q22.a) b();
                com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_SPRING_FESTIVAL_CROP_TYPE_INT;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiCapture", "getInt %s %s", u3Var, 1);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiCapture", "getConfigStorage, %s %s", u3Var, 1);
                java.lang.Object m17 = gm0.j1.u().c().m(u3Var, 1);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiCapture", "getInt %s %s and get val %s", u3Var, 1, m17);
                aVar.f441334b = (m17 == null ? 1 : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(m17.toString(), 1)) == 0;
            }
        }
        if (((q22.a) b()).f441334b) {
            ((q22.a) b()).f441333a = com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf;
        } else {
            ((q22.a) b()).f441333a = 1080;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiCameraElementConfig", "config resolution:" + ((q22.a) b()).f441333a + ", useCpuCrop:" + ((q22.a) b()).f441334b);
    }
}
