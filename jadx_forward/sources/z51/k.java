package z51;

/* loaded from: classes10.dex */
public final class k implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z51.p f551724d;

    public k(z51.p pVar) {
        this.f551724d = pVar;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    public void T4(int i17, int i18) {
        this.f551724d.f("onGetVideoSize >> width " + i17 + " height: " + i18);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onCompletion */
    public void mo9755xa6db431b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCompletion ");
        z51.p pVar = this.f551724d;
        sb6.append(pVar.f551741o);
        pVar.f(sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18697xb57c3465 c18697xb57c3465 = pVar.f551733g;
        if (c18697xb57c3465 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tpPlayerView");
            throw null;
        }
        c18697xb57c3465.mo69303x360802();
        ((z51.w) pVar.a(z51.w.class)).f551766k = false;
        if (pVar.f551741o) {
            return;
        }
        ((z51.g) pVar.a(z51.g.class)).k();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onError */
    public void mo9756xaf8aa769(int i17, int i18) {
        this.f551724d.e("onError " + i17 + ' ' + i18);
        f65.q.f341492a.a("play_local_live_photo", -2, 0L, "what: " + i17 + " extra: " + i18);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onPrepared */
    public void mo9757x58d5b73c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPrepared isPaused:");
        z51.p pVar = this.f551724d;
        sb6.append(pVar.f551741o);
        sb6.append(" isMuted: ");
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18697xb57c3465 c18697xb57c3465 = pVar.f551733g;
        if (c18697xb57c3465 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tpPlayerView");
            throw null;
        }
        sb6.append(c18697xb57c3465.getF256144z());
        pVar.f(sb6.toString());
        if (pVar.f551741o) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18697xb57c3465 c18697xb57c34652 = pVar.f551733g;
        if (c18697xb57c34652 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tpPlayerView");
            throw null;
        }
        c18697xb57c34652.mo69330x68ac462();
        z51.g gVar = (z51.g) pVar.a(z51.g.class);
        gVar.f("aniToPlayView");
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18697xb57c3465 c18697xb57c34653 = ((z51.p) gVar.a(z51.p.class)).f551733g;
        if (c18697xb57c34653 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tpPlayerView");
            throw null;
        }
        android.widget.FrameLayout frameLayout = ((z51.p) gVar.a(z51.p.class)).f551732f;
        if (frameLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("videoViewContainer");
            throw null;
        }
        c18697xb57c34653.setVisibility(0);
        frameLayout.post(new z51.d(gVar, c18697xb57c34653, frameLayout));
        boolean z17 = ((z51.w) pVar.a(z51.w.class)).f551766k;
        pVar.f("start isLongClickToPlay: " + z17);
        if (!z17) {
            android.widget.FrameLayout frameLayout2 = pVar.f551732f;
            if (frameLayout2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("videoViewContainer");
                throw null;
            }
            frameLayout2.performHapticFeedback(4);
        }
        f65.q.b(f65.q.f341492a, "play_local_live_photo", 0, 0L, null, 12, null);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    public int q(int i17, int i18) {
        this.f551724d.f("onPlayTime >> playTime " + i17 + " videoTime: " + i18);
        return 0;
    }
}
