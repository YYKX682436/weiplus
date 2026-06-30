package ig3;

/* loaded from: classes3.dex */
public final class i implements ig3.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f372961a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18697xb57c3465 f372962b;

    /* renamed from: c, reason: collision with root package name */
    public ig3.d f372963c;

    /* renamed from: d, reason: collision with root package name */
    public hg3.a f372964d;

    /* renamed from: e, reason: collision with root package name */
    public int f372965e;

    public i(java.lang.String holderLabel, com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18697xb57c3465 videoView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holderLabel, "holderLabel");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoView, "videoView");
        this.f372961a = holderLabel;
        this.f372962b = videoView;
        ig3.c cVar = ig3.c.f372949d;
    }

    public jz5.l a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18697xb57c3465 c18697xb57c3465 = this.f372962b;
        return new jz5.l(java.lang.Integer.valueOf(c18697xb57c3465.mo69307x9746038c()), java.lang.Integer.valueOf(c18697xb57c3465.mo69286x51e8b0a()));
    }

    public boolean b() {
        return this.f372962b.mo69311xc00617a4();
    }

    public final java.lang.String c(java.lang.String str) {
        return str + ("{holder@" + this.f372961a + '}');
    }

    public final void d(java.lang.String str, java.lang.Object... objArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.TPVideoStateController", c(str), java.util.Arrays.copyOf(objArr, objArr.length));
    }

    public void e(gg3.c cVar) {
        if (cVar == null) {
            d("setDataSource return, disposal", new java.lang.Object[0]);
            return;
        }
        hg3.a aVar = this.f372964d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18697xb57c3465 c18697xb57c3465 = this.f372962b;
        if (aVar != null) {
            aVar.a(c18697xb57c3465, cVar);
        }
        i(ig3.c.f372949d);
        java.lang.String f256131m = c18697xb57c3465.getF256131m();
        java.lang.String str = cVar.f353261c;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(f256131m, str) && c18697xb57c3465.mo69420xf582434a() && c18697xb57c3465.e()) {
            d("setDataSource return, same ready path: " + str, new java.lang.Object[0]);
        } else {
            c18697xb57c3465.mo69303x360802();
            c18697xb57c3465.mo69327xab3268fe(str);
            d("setDataSource set new path: " + str, new java.lang.Object[0]);
        }
    }

    public void f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18697xb57c3465 c18697xb57c3465 = this.f372962b;
        if (c18697xb57c3465.mo69311xc00617a4()) {
            d("tryPause, set currPlayTimeMs:" + this.f372965e, new java.lang.Object[0]);
            this.f372965e = c18697xb57c3465.mo69307x9746038c();
            c18697xb57c3465.mo69313x65825f6();
            i(ig3.c.f372952g);
        }
    }

    public void g() {
        ig3.f fVar = new ig3.f(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18697xb57c3465 videoView = this.f372962b;
        videoView.mo69322xfae314df(fVar);
        boolean z17 = false;
        if (!videoView.mo69420xf582434a() || !videoView.e()) {
            d("tryStart, wait video", new java.lang.Object[0]);
            videoView.mo69326x360a109e(new ig3.h(this));
            return;
        }
        d("tryStart, video is ready", new java.lang.Object[0]);
        videoView.mo69326x360a109e(new ig3.g(this));
        videoView.b(this.f372965e);
        hg3.a aVar = this.f372964d;
        if (aVar != null) {
            sh5.d dVar = (sh5.d) aVar;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoView, "videoView");
            f25.m0 m0Var = dVar.f489565a;
            if (m0Var != null) {
                ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var);
            }
            if (!videoView.getF256144z()) {
                f25.m0 m96 = ((f25.n0) i95.n0.c(f25.n0.class)).m9(f25.i.f340631c, new sh5.a(new java.lang.ref.WeakReference(videoView)));
                dVar.f489565a = m96;
                if (m96 != null && ((g25.e) m96).f349513c) {
                    z17 = true;
                }
                videoView.mo69318x764d819b(true ^ z17);
            }
        }
        videoView.mo69330x68ac462();
        i(ig3.c.f372950e);
    }

    public void h() {
        this.f372965e = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18697xb57c3465 videoView = this.f372962b;
        videoView.mo69303x360802();
        hg3.a aVar = this.f372964d;
        if (aVar != null) {
            sh5.d dVar = (sh5.d) aVar;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoView, "videoView");
            f25.m0 m0Var = dVar.f489565a;
            if (m0Var != null) {
                ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var);
            }
            dVar.f489565a = null;
        }
        i(ig3.c.f372954i);
    }

    public final void i(ig3.c cVar) {
        d("notify uiListener, onStateChanged:" + cVar.name(), new java.lang.Object[0]);
        ig3.d dVar = this.f372963c;
        if (dVar != null) {
            dVar.I(cVar);
        }
    }
}
