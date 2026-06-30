package yt3;

/* loaded from: classes10.dex */
public final class o1 implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4 f547092d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f547093e;

    /* renamed from: f, reason: collision with root package name */
    public fp.e f547094f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f547095g;

    /* renamed from: h, reason: collision with root package name */
    public long f547096h;

    /* renamed from: i, reason: collision with root package name */
    public ct0.b f547097i;

    /* renamed from: m, reason: collision with root package name */
    public int f547098m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f547099n;

    /* renamed from: o, reason: collision with root package name */
    public int f547100o;

    /* renamed from: p, reason: collision with root package name */
    public int f547101p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f547102q;

    /* renamed from: r, reason: collision with root package name */
    public final int f547103r;

    /* renamed from: s, reason: collision with root package name */
    public final yt3.n1 f547104s;

    public o1(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4 c19745xad58a1a4, ju3.d0 status, android.widget.TextView textView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f547092d = c19745xad58a1a4;
        this.f547093e = textView;
        this.f547095g = c19745xad58a1a4 != null ? c19745xad58a1a4.getContext() : null;
        this.f547096h = -1L;
        this.f547098m = 10000;
        this.f547103r = 333;
        this.f547104s = new yt3.n1(this, status);
    }

    public final android.view.ViewGroup a() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4 c19745xad58a1a4 = this.f547092d;
        return (android.view.ViewGroup) (c19745xad58a1a4 != null ? c19745xad58a1a4.getParent() : null);
    }

    public final void b(boolean z17) {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator scaleX;
        android.view.ViewPropertyAnimator scaleY;
        this.f547099n = false;
        android.view.ViewGroup a17 = a();
        android.view.ViewPropertyAnimator translationY = (a17 == null || (animate = a17.animate()) == null || (scaleX = animate.scaleX(1.0f)) == null || (scaleY = scaleX.scaleY(1.0f)) == null) ? null : scaleY.translationY(0.0f);
        if (translationY != null) {
            translationY.setDuration(300L);
        }
        if (z17) {
            return;
        }
        this.f547100o = 0;
        ct0.b bVar = this.f547097i;
        this.f547101p = bVar != null ? bVar.f303741e : 10000;
    }

    @Override // yt3.r2
    /* renamed from: onDetach */
    public void mo10989x3f5eee52() {
        mo9065x41012807();
    }

    @Override // yt3.r2
    /* renamed from: onPause */
    public void mo11000xb01dfb57() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditVideoPlayPlugin", "onPause");
        fp.e eVar = this.f547094f;
        if (eVar != null) {
            eVar.a();
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4 c19745xad58a1a4 = this.f547092d;
        if (c19745xad58a1a4 != null) {
            c19745xad58a1a4.mo69313x65825f6();
        }
    }

    @Override // yt3.r2
    /* renamed from: onResume */
    public void mo11001x57429eec() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditVideoPlayPlugin", "onResume");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4 c19745xad58a1a4 = this.f547092d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19745xad58a1a4);
        if (c19745xad58a1a4.mo69311xc00617a4()) {
            return;
        }
        fp.e eVar = this.f547094f;
        if (eVar != null) {
            eVar.b();
        }
        if (c19745xad58a1a4 != null) {
            c19745xad58a1a4.mo69330x68ac462();
        }
    }

    @Override // yt3.r2
    /* renamed from: release */
    public void mo9065x41012807() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditVideoPlayPlugin", "release");
        fp.e eVar = this.f547094f;
        if (eVar != null) {
            eVar.a();
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4 c19745xad58a1a4 = this.f547092d;
        if (c19745xad58a1a4 != null) {
            c19745xad58a1a4.mo69303x360802();
        }
        if (c19745xad58a1a4 != null) {
            c19745xad58a1a4.mo69326x360a109e(null);
        }
    }

    @Override // yt3.r2
    /* renamed from: reset */
    public void mo9066x6761d4f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditVideoPlayPlugin", "release");
        fp.e eVar = this.f547094f;
        if (eVar != null) {
            eVar.a();
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4 c19745xad58a1a4 = this.f547092d;
        if (c19745xad58a1a4 != null) {
            c19745xad58a1a4.mo69303x360802();
        }
        if (c19745xad58a1a4 != null) {
            c19745xad58a1a4.mo69326x360a109e(null);
        }
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4 c19745xad58a1a4 = this.f547092d;
        if (c19745xad58a1a4 != null) {
            c19745xad58a1a4.setVisibility(i17);
        }
        android.widget.TextView textView = this.f547093e;
        if (textView == null) {
            return;
        }
        textView.setVisibility(i17);
    }
}
