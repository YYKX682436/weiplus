package com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui;

/* loaded from: classes11.dex */
public class j extends s35.b {

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f232284m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f232285n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f232286o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f232287p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f232288q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f232289r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f232290s;

    /* renamed from: t, reason: collision with root package name */
    public b66.g f232291t;

    public j(android.content.Context context) {
        super(context);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("MicroMsg.MusicBanner", "initPlayerListener", new java.lang.Object[0]);
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4> abstractC20980x9b9ad01d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4>(a0Var) { // from class: com.tencent.mm.plugin.music.ui.MusicBanner$3
            {
                this.f39173x3fe91575 = -1155728636;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 c5722xb16ab0f4) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 c5722xb16ab0f42 = c5722xb16ab0f4;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicBanner", "musicBanner.onMusicPlayerEvent %s", java.lang.Integer.valueOf(c5722xb16ab0f42.f136045g.f88569b));
                int i17 = c5722xb16ab0f42.f136045g.f88569b;
                if (i17 != 0 && i17 != 1 && i17 != 2 && i17 != 3 && i17 != 4 && i17 != 7) {
                    return false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.j.this.l();
                return false;
            }
        };
        this.f232285n = abstractC20980x9b9ad01d;
        abstractC20980x9b9ad01d.mo48813x58998cd();
    }

    @Override // s35.b
    public void a() {
        this.f232285n.mo48814x2efc64();
    }

    @Override // s35.b
    public int b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c4_;
    }

    @Override // s35.b
    public int c() {
        return 1;
    }

    @Override // s35.b
    public void h(android.view.View view) {
        this.f232284m = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.jy8);
        this.f232287p = view.findViewById(com.p314xaae8f345.mm.R.id.jy9);
        this.f232286o = view.findViewById(com.p314xaae8f345.mm.R.id.f564884af3);
        this.f232288q = view.findViewById(com.p314xaae8f345.mm.R.id.ryc);
        this.f232284m.setTextSize(0, i65.a.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561386h2));
        m(this.f232290s);
        view.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.k(this));
        this.f232288q.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.l(this));
    }

    @Override // s35.b
    public boolean i() {
        return l();
    }

    @Override // s35.b
    public void k(int i17) {
        if (!this.f484377i) {
            if (i17 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MusicBanner", "isViewInitialized() should not be false!");
                return;
            }
            return;
        }
        android.widget.LinearLayout linearLayout = this.f484376h;
        if (linearLayout != null) {
            android.view.View findViewById = linearLayout.findViewById(com.p314xaae8f345.mm.R.id.jy9);
            if (i17 != 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(i17));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/music/ui/MusicBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/music/ui/MusicBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            if (!((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MusicBanner", "isFloatWindowOpAllowed return false");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(java.lang.Integer.valueOf(i17));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/music/ui/MusicBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/music/ui/MusicBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MusicBanner", "isFloatWindowOpAllowed return true");
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/music/ui/MusicBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/music/ui/MusicBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (b21.m.c()) {
                final b21.r b17 = b21.m.b();
                if (b17 == null || !b17.N) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicBanner", "resume music to float ball can ");
                    ll3.q0.d(b17);
                    return;
                }
                boolean z17 = !((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).zk();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicBanner", "resume music to float ball can enter: " + z17);
                if (z17) {
                    ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.music.ui.j$$a
                        @Override // java.lang.Runnable
                        public final void run() {
                            ll3.q0.d(b21.r.this);
                        }
                    });
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x007f, code lost:
    
        if (r1 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x009b, code lost:
    
        if (r1 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0172, code lost:
    
        if (r0.f136043h.f88371b != false) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x018b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l() {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.j.l():boolean");
    }

    public void m(java.lang.String str) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f232290s = str == null ? "" : str;
        android.widget.TextView textView = this.f232284m;
        if (textView != null) {
            textView.setText(str);
        }
    }
}
