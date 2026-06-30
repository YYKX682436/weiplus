package i52;

/* loaded from: classes15.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final b52.d f370009a;

    /* renamed from: c, reason: collision with root package name */
    public final i52.m f370011c = new i52.c(this);

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f370010b = new java.util.concurrent.CopyOnWriteArrayList();

    public d(b52.d dVar) {
        this.f370009a = dVar;
    }

    public static void a(i52.d dVar, int i17, long j17) {
        dVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.ChatUIFragmentProxy", "sendMsg, mChatUIStatusListener: %d", java.lang.Integer.valueOf(i17));
        d52.d.a().d(i17, java.lang.Long.valueOf(j17));
    }

    public final nm5.b b() {
        r45.b2 e17 = f52.c.b().e();
        if (e17 != null) {
            java.lang.String g17 = b52.b.g(e17.f451967d.f452433d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.ChatUIFragmentProxy", "getPage, topActivityName: %s", g17);
            if ("ChattingUI".equals(g17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HABBYGE-MALI.ChatUIFragmentProxy", "getPage, ChattingUI");
                return null;
            }
        }
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f f17 = b52.b.f();
        if (f17 == null) {
            return null;
        }
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 d17 = i52.l.d(f17);
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HABBYGE-MALI.ChatUIFragmentProxy", "getPage, curFragment NULL");
            return null;
        }
        java.lang.String canonicalName = d17.getClass().getCanonicalName();
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 f18 = i52.l.f(f17, "com.tencent.mm.ui.chatting.ChattingUIFragment");
        java.lang.String canonicalName2 = f18 == null ? null : f18.getClass().getCanonicalName();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.ChatUIFragmentProxy", "getPage, fragment: %s, %s", canonicalName, canonicalName2);
        boolean equals = "com.tencent.mm.ui.chatting.ChattingUIFragment".equals(canonicalName);
        boolean equals2 = "com.tencent.mm.ui.chatting.ChattingUIFragment".equals(canonicalName2);
        if (!equals && !equals2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HABBYGE-MALI.ChatUIFragmentProxy", "getPage, NOT ChattingUIFragment");
            return null;
        }
        if (!equals) {
            d17 = f18;
        }
        return nm5.j.c(f17, d17);
    }
}
