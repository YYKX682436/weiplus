package q12;

/* loaded from: classes12.dex */
public class p extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public p() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        int i17 = ((com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5320x1b9cab2e) abstractC20979x809547d1).f135635g.f89044a;
        if (i17 == 0) {
            y12.e b17 = y12.e.b();
            java.lang.String g17 = n22.m.g();
            b17.f540390a = true;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiFileCleanTaskManager", "filepath is empty.");
            } else {
                boolean z17 = java.lang.System.currentTimeMillis() - ((java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_CLEAN_TEMP_FILE_TASK_LONG, 0L)).longValue() >= 86400000;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiFileCleanTaskManager", "need clean emoji file:%B", java.lang.Boolean.valueOf(z17));
                if (z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiFileCleanTaskManager", "startClean");
                    cp.e.b("EmojiFileCleanMgr", new y12.d(b17, g17));
                }
            }
        } else if (i17 == 1) {
            y12.e.b().f540390a = false;
        }
        return false;
    }
}
