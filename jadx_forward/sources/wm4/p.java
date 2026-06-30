package wm4;

@j95.b
/* loaded from: classes2.dex */
public class p extends i95.w implements wm4.o {

    /* renamed from: e, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.m2 f528831e;

    /* renamed from: g, reason: collision with root package name */
    public wm4.n f528833g;

    /* renamed from: d, reason: collision with root package name */
    public int f528830d = 2;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f528832f = new java.util.HashMap();

    public void Ai() {
        if (((java.lang.Boolean) ((jz5.n) ((pg3.q) ((n40.m) i95.n0.c(n40.m.class))).f435750e).mo141623x754a37bb()).booleanValue()) {
            ((ku5.t0) ku5.t0.f394148d).A("MicroMsg.TopStory.PluginTopStoryUI");
            if (!((java.lang.Boolean) ((jz5.n) ((pg3.q) ((n40.m) i95.n0.c(n40.m.class))).f435752g).mo141623x754a37bb()).booleanValue()) {
                ku5.u0 u0Var = ku5.t0.f394148d;
                java.lang.Runnable runnable = new java.lang.Runnable() { // from class: wm4.p$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        wm4.p.this.Bi();
                    }
                };
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.z(runnable, 1000L, false);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.PluginTopStoryUI", "LongVideo-Trace, optimize thread wait");
            ku5.u0 u0Var2 = ku5.t0.f394148d;
            java.lang.Runnable runnable2 = new java.lang.Runnable() { // from class: wm4.p$$a
                @Override // java.lang.Runnable
                public final void run() {
                    wm4.p.this.Bi();
                }
            };
            ku5.t0 t0Var2 = (ku5.t0) u0Var2;
            t0Var2.getClass();
            t0Var2.z(runnable2, 500L, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Bi() {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wm4.p.Bi():void");
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        boolean z17;
        long t17 = gm0.j1.u().c().t(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TOP_STORY_HOME_UI_TIMESTAMP_LONG, 0L);
        if (c01.id.c() - t17 <= 259200000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.PluginTopStoryUI", "Use TopStory In Three Days %s", k35.m1.d(com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.f47897xee1ddd9f, t17 / 1000));
            su4.k3.e(23);
            z17 = true;
        } else {
            z17 = false;
        }
        if (z17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new wm4.r(this), 5000L);
        }
        s75.d.b(new wm4.q(this), "TopStory.LoadHomeCacheData");
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        this.f528831e = null;
        o11.g gVar = wm4.u.f528842a;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6172x8b8bc1ba c6172x8b8bc1ba = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6172x8b8bc1ba();
        c6172x8b8bc1ba.f136431g.f88042a = 4;
        c6172x8b8bc1ba.e();
        q25.b.c("//topstory");
        this.f528832f.clear();
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.m2 wi() {
        if (this.f528831e == null) {
            synchronized (this) {
                if (this.f528831e == null) {
                    this.f528831e = new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.m2();
                }
            }
        }
        return this.f528831e;
    }
}
