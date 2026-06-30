package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* renamed from: com.tencent.mm.pluginsdk.ui.VoiceInputLayout */
/* loaded from: classes15.dex */
public abstract class AbstractC19655xeb0f7722 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.u3 f271386d;

    /* renamed from: e, reason: collision with root package name */
    public z21.w f271387e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f271388f;

    /* renamed from: g, reason: collision with root package name */
    public int f271389g;

    /* renamed from: h, reason: collision with root package name */
    public int f271390h;

    /* renamed from: i, reason: collision with root package name */
    public final int f271391i;

    /* renamed from: m, reason: collision with root package name */
    public final int f271392m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.t3 f271393n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f271394o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f271395p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f271396q;

    public AbstractC19655xeb0f7722(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f271386d = null;
        this.f271388f = false;
        this.f271389g = 1;
        this.f271390h = 1;
        this.f271391i = 3000;
        this.f271392m = 10000;
        this.f271394o = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p3(this);
        this.f271395p = new com.p314xaae8f345.mm.p2470x93e71c27.ui.r3(this);
        this.f271396q = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.p2470x93e71c27.ui.s3(this), true);
    }

    public void a() {
        if (this.f271389g == 1) {
            return;
        }
        this.f271389g = 1;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.u3 u3Var = this.f271386d;
        if (u3Var != null) {
            u3Var.f();
        }
        z21.w wVar = this.f271387e;
        if (wVar != null) {
            wVar.mo48278xae7a2e7a(true);
        }
        f();
    }

    public void b(boolean z17) {
        if (iq.b.C(getContext()) || iq.b.v(getContext()) || iq.b.e(getContext())) {
            f();
            return;
        }
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.content.Context context = getContext();
        ((sb0.f) jVar).getClass();
        if (!j35.u.d(context, "android.permission.RECORD_AUDIO", true)) {
            if (getContext() instanceof android.app.Activity) {
                tb0.j jVar2 = (tb0.j) i95.n0.c(tb0.j.class);
                android.app.Activity activity = (android.app.Activity) getContext();
                ((sb0.f) jVar2).getClass();
                j35.u.i(activity, "android.permission.RECORD_AUDIO", 80);
                return;
            }
            return;
        }
        if (this.f271389g != 1) {
            return;
        }
        this.f271389g = 2;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.u3 u3Var = this.f271386d;
        if (u3Var != null) {
            u3Var.c();
        }
        this.f271396q.c(50L, 50L);
        g(z17);
        z21.w wVar = new z21.w(this.f271390h, 0, new com.p314xaae8f345.mm.p2470x93e71c27.ui.q3(this));
        this.f271387e = wVar;
        wVar.mo48296x68ac462();
    }

    public void c() {
        int i17 = this.f271389g;
        if (i17 == 1 || i17 != 2) {
            return;
        }
        this.f271389g = 3;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.u3 u3Var = this.f271386d;
        if (u3Var != null) {
            u3Var.b();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f271396q;
        if (b4Var != null) {
            b4Var.d();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f271394o;
        n3Var.mo50303x856b99f0(0);
        n3Var.mo50307xb9e94560(0, this.f271391i);
        n3Var.mo50307xb9e94560(1, this.f271392m);
        d(true);
        z21.w wVar = this.f271387e;
        if (wVar != null) {
            wVar.mo48299x360802(true);
        }
    }

    public abstract void d(boolean z17);

    public abstract void e(int i17);

    public abstract void f();

    public abstract void g(boolean z17);

    /* renamed from: getCurrentState */
    public int m75383xb7d72d0e() {
        return this.f271389g;
    }

    public void h(boolean z17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.u3 u3Var;
        if (this.f271389g == 1) {
            return;
        }
        this.f271389g = 1;
        f();
        if (!z17 || (u3Var = this.f271386d) == null) {
            return;
        }
        u3Var.d();
    }

    /* renamed from: setFromFullScreen */
    public void m75384xed728427(boolean z17) {
        this.f271388f = z17;
    }

    /* renamed from: setLangType */
    public void m75385x16568cca(int i17) {
        this.f271390h = i17;
    }

    /* renamed from: setLongClickLisnter */
    public void m75386xa5426eff(com.p314xaae8f345.mm.p2470x93e71c27.ui.t3 t3Var) {
        this.f271393n = t3Var;
    }

    /* renamed from: setVoiceDetectListener */
    public void m75387xc1b94687(com.p314xaae8f345.mm.p2470x93e71c27.ui.u3 u3Var) {
        this.f271386d = u3Var;
    }

    public AbstractC19655xeb0f7722(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f271386d = null;
        this.f271388f = false;
        this.f271389g = 1;
        this.f271390h = 1;
        this.f271391i = 3000;
        this.f271392m = 10000;
        this.f271394o = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p3(this);
        this.f271395p = new com.p314xaae8f345.mm.p2470x93e71c27.ui.r3(this);
        this.f271396q = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.p2470x93e71c27.ui.s3(this), true);
    }
}
