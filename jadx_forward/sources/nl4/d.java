package nl4;

/* loaded from: classes11.dex */
public final class d implements ll4.d, ll4.c {

    /* renamed from: a, reason: collision with root package name */
    public ll4.a f419729a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f419730b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f419731c;

    /* renamed from: d, reason: collision with root package name */
    public bw5.lp0 f419732d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f419733e;

    /* renamed from: f, reason: collision with root package name */
    public final mn0.b0 f419734f;

    /* renamed from: g, reason: collision with root package name */
    public final int f419735g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f419736h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.l f419737i;

    public d(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        mn0.b0 wi6 = ((v40.q) ((c50.q0) i95.n0.c(c50.q0.class))).wi(context);
        this.f419734f = wi6;
        int hashCode = hashCode();
        this.f419735g = hashCode;
        this.f419736h = "MicroMsg.TingFinderLivePlayerCore@" + hashCode;
        mn0.y yVar = (mn0.y) wi6;
        yVar.K(mn0.d0.A, 21);
        ls5.d dVar = yVar.f411340f;
        if (dVar != null) {
            dVar.f402661h = new nl4.a(this);
        }
        yVar.Q(0);
        yVar.J(new nl4.b(this));
    }

    @Override // ll4.c
    public yz5.l a() {
        return this.f419737i;
    }

    @Override // ll4.d
    public bw5.lp0 b() {
        bw5.lp0 lp0Var = this.f419732d;
        if (lp0Var == null) {
            bw5.lp0 lp0Var2 = bw5.lp0.f111423v;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lp0Var2, "getDefaultInstance(...)");
            return lp0Var2;
        }
        if (lp0Var != null) {
            return lp0Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayingItem");
        throw null;
    }

    @Override // ll4.d
    public void c(float f17) {
    }

    @Override // ll4.d
    public long d() {
        return 0L;
    }

    @Override // ll4.d
    public void e(ll4.a aVar) {
        this.f419729a = aVar;
    }

    @Override // ll4.d
    public void f(boolean z17) {
        this.f419731c = true;
        mn0.b0.C(this.f419734f, false, true, false, 4, null);
    }

    @Override // ll4.d
    public java.lang.String g() {
        return "TingFinderLivePlayerCore";
    }

    @Override // ll4.d
    public float h() {
        return 1.0f;
    }

    @Override // ll4.d
    public void i(ll4.b bVar) {
    }

    @Override // ll4.d
    public void j(bw5.kq0 tingPlayerContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tingPlayerContext, "tingPlayerContext");
        if (tingPlayerContext.f111027m[1]) {
            bw5.lp0 b17 = tingPlayerContext.b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getPlayingItem(...)");
            this.f419732d = b17;
            q();
            return;
        }
        ll4.a aVar = this.f419729a;
        if (aVar != null) {
            ll4.a.a(aVar, 12, null, 2, null);
        }
    }

    @Override // ll4.d
    public long k() {
        return 0L;
    }

    @Override // ll4.d
    public bw5.ap0 l() {
        return null;
    }

    @Override // ll4.d
    public long m() {
        return 0L;
    }

    @Override // ll4.d
    public void n(byte[] buffer, java.lang.String listenId, boolean z17, int i17, int i18, int i19, int i27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buffer, "buffer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listenId, "listenId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f419736h, "setAudioMixPcmBuffer sr:" + i18 + ", ch:" + i27 + ", format:" + i19 + ", len:" + buffer.length);
    }

    @Override // ll4.d
    public int o() {
        return this.f419735g;
    }

    @Override // ll4.c
    public void p(yz5.l lVar) {
        this.f419737i = lVar;
        if (lVar != null) {
            lVar.mo146xb9724478(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q() {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nl4.d.q():void");
    }

    @Override // ll4.d
    /* renamed from: release */
    public void mo145969x41012807() {
        mo145974x360802();
        ((mn0.y) this.f419734f).w();
    }

    @Override // ll4.d
    /* renamed from: reset */
    public void mo145970x6761d4f() {
    }

    @Override // ll4.d
    /* renamed from: resume */
    public void mo145971xc84dc82d() {
        this.f419731c = false;
        if (this.f419732d != null) {
            q();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f419736h, "resume but playingItem not initialized");
        }
    }

    @Override // ll4.d
    /* renamed from: seek */
    public void mo145972x35ce78(long j17) {
    }

    @Override // ll4.c
    /* renamed from: setSurface */
    public void mo145966x42c875eb(android.view.Surface surface) {
        if (surface != null) {
            ((nn0.c) this.f419734f).v(surface, 0, 0);
        }
    }

    @Override // ll4.d
    /* renamed from: setVolume */
    public void mo145973x27f73e1c(float f17) {
    }

    @Override // ll4.d
    /* renamed from: stop */
    public void mo145974x360802() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f419736h, "stop");
        this.f419729a = null;
        this.f419730b = true;
        mn0.b0.C(this.f419734f, true, false, false, 6, null);
    }

    @Override // ll4.c
    /* renamed from: videoHeight */
    public int mo145967x2a8d0982() {
        com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf o17 = ((mn0.y) this.f419734f).o();
        if (o17 != null) {
            return o17.getHeight();
        }
        return 0;
    }

    @Override // ll4.c
    /* renamed from: videoWidth */
    public int mo145968x9f1bbe0b() {
        com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf o17 = ((mn0.y) this.f419734f).o();
        if (o17 != null) {
            return o17.getWidth();
        }
        return 0;
    }
}
