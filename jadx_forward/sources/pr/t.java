package pr;

/* loaded from: classes12.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final int f439314a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f439315b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f439316c;

    public t(int i17, java.lang.String str, boolean z17) {
        this.f439314a = i17;
        this.f439315b = str;
        this.f439316c = z17;
    }

    public final void a() {
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var;
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var2;
        int i17 = this.f439314a;
        if (i17 == 1) {
            u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_SYNC_CAPTURE_EMOJI_BATCH_DOWNLOAD_BOOLEAN;
            u3Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_NEXT_CAPTURE_BATCH_DOWNLOAD_TIME_LONG;
        } else {
            u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_SYNC_CUSTOM_EMOJI_BATCH_DOWNLOAD_BOOLEAN;
            u3Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_NEXT_CUSTOM_BATCH_DOWNLOAD_TIME_LONG;
        }
        boolean z17 = this.f439316c;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiSyncFetchList", "forceUpdateAll");
        }
        new pr.t0(i17, this.f439315b, z17, new pr.s(u3Var2, u3Var, this));
    }
}
