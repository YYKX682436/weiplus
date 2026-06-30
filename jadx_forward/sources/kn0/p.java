package kn0;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public boolean f391114a;

    /* renamed from: b, reason: collision with root package name */
    public kn0.l f391115b = kn0.l.f391102d;

    /* renamed from: c, reason: collision with root package name */
    public kn0.j f391116c = kn0.j.f391095d;

    /* renamed from: d, reason: collision with root package name */
    public kn0.m f391117d;

    /* renamed from: e, reason: collision with root package name */
    public long f391118e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f391119f;

    /* renamed from: g, reason: collision with root package name */
    public kn0.k f391120g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f391121h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f391122i;

    /* renamed from: j, reason: collision with root package name */
    public int f391123j;

    /* renamed from: k, reason: collision with root package name */
    public int f391124k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f391125l;

    public p() {
        kn0.o[] oVarArr = kn0.o.f391113d;
        kn0.n[] nVarArr = kn0.n.f391112d;
        this.f391117d = kn0.m.f391106d;
        this.f391118e = -1L;
        this.f391119f = "";
        this.f391120g = kn0.k.f391099d;
        new java.util.ArrayList();
        this.f391123j = 0;
        this.f391124k = -1;
        this.f391125l = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LIVE_DEBUG_VIEW_INT_SYNC, 0) == 1;
    }

    public final void a() {
        this.f391117d = kn0.m.f391106d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveStatus", "liveStatusModeChange changeToNormalMode");
    }

    public final java.lang.String b() {
        return this.f391119f;
    }

    public final int c() {
        return this.f391123j;
    }

    public final int d() {
        return this.f391124k;
    }

    public final boolean e() {
        return this.f391120g == kn0.k.f391100e;
    }

    public final boolean f() {
        return this.f391117d == kn0.m.f391107e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001c, code lost:
    
        if (r6.f391115b == kn0.l.f391103e) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0008, code lost:
    
        if (r6.f391115b == kn0.l.f391103e) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000b, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(java.lang.Long r7) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            if (r7 != 0) goto Le
            kn0.l r7 = r6.f391115b
            kn0.l r2 = kn0.l.f391103e
            if (r7 != r2) goto Lb
            goto Lc
        Lb:
            r0 = r1
        Lc:
            r1 = r0
            goto L1f
        Le:
            long r2 = r6.f391118e
            long r4 = r7.longValue()
            int r7 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r7 != 0) goto L1f
            kn0.l r7 = r6.f391115b
            kn0.l r2 = kn0.l.f391103e
            if (r7 != r2) goto Lb
            goto Lc
        L1f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kn0.p.g(java.lang.Long):boolean");
    }

    public final boolean h() {
        return this.f391115b == kn0.l.f391103e;
    }

    public final boolean i() {
        return this.f391117d == kn0.m.f391106d;
    }

    public final boolean j() {
        return this.f391122i;
    }

    public final boolean k() {
        return this.f391117d == kn0.m.f391108f;
    }

    public final void l() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveStatus", "switchAudioMode,pause:" + this.f391121h);
        this.f391121h = false;
        this.f391120g = kn0.k.f391100e;
    }

    public final void m() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveStatus", "switchVideoMode,pause:" + this.f391121h);
        this.f391121h = false;
        this.f391120g = kn0.k.f391099d;
    }
}
