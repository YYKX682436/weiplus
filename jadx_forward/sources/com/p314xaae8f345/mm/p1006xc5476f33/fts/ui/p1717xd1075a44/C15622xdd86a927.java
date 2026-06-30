package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44;

/* renamed from: com.tencent.mm.plugin.fts.ui.widget.FTSVoiceInputLayoutImpl */
/* loaded from: classes15.dex */
public class C15622xdd86a927 extends com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.AbstractC15625xeb0f7722 {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f219755x = 0;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f219756q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f219757r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.x0 f219758s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f219759t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f219760u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View.OnLongClickListener f219761v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.View.OnTouchListener f219762w;

    public C15622xdd86a927(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f219759t = false;
        this.f219760u = false;
        this.f219761v = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.d1(this);
        this.f219762w = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.e1(this);
        m(context);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.AbstractC15625xeb0f7722
    public void e(boolean z17) {
        o(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.g1(this));
    }

    /* renamed from: getVoiceInputDrawable */
    public com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.x0 m63631x265a846c() {
        return this.f219758s;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.AbstractC15625xeb0f7722
    public void i(int i17) {
        o(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.i1(this, i17));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.AbstractC15625xeb0f7722
    public void j() {
        o(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.h1(this));
    }

    public void l(boolean z17, boolean z18) {
        int i17 = this.f219766f;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f219773p;
        if (i17 == 1) {
            if (z17 || z18) {
                if (!z17 || z18) {
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.x0 x0Var = this.f219758s;
                x0Var.f219891n = 2;
                x0Var.f219892o = 0;
                x0Var.invalidateSelf();
                return;
            }
            if (iq.b.C(getContext()) || iq.b.v(getContext()) || iq.b.e(getContext())) {
                j();
                return;
            }
            tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
            android.content.Context context = getContext();
            ((sb0.f) jVar).getClass();
            if (!j35.u.d(context, "android.permission.RECORD_AUDIO", true)) {
                android.app.Activity activity = !(getContext() instanceof android.app.Activity) ? this.f219767g : (android.app.Activity) getContext();
                if (activity != null) {
                    ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Di(activity, new java.lang.String[]{"android.permission.RECORD_AUDIO"}, 80, null, null);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceInputLayout", "context = " + activity);
                return;
            }
            if (this.f219766f != 1) {
                return;
            }
            this.f219766f = 2;
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.u1 u1Var = this.f219764d;
            if (u1Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.y0 y0Var = (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.y0) u1Var;
                y0Var.f219897a = "";
                y0Var.f219898b = "";
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15490, 3, java.lang.Long.valueOf(o13.p.f423783c), 1);
                com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.b1 b1Var = y0Var.f219899c;
                b1Var.f219781c = true;
                b1Var.f219780b.d();
            }
            b4Var.c(50L, 50L);
            n(true);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                ((x90.o) ((y90.i) i95.n0.c(y90.i.class))).getClass();
                this.f219765e = new z21.w();
            } else {
                ((x90.o) ((y90.i) i95.n0.c(y90.i.class))).getClass();
                this.f219765e = com.p314xaae8f345.mm.p964x2822171a.BinderC11153x6a3b619.m48277x9cf0d20b();
            }
            this.f219765e.mo48283x316510(1, 8, new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.q1(this));
            this.f219765e.mo48296x68ac462();
            return;
        }
        if (i17 != 2) {
            if (!z17 && !z18) {
                c();
                return;
            }
            if (!z17 || z18) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.x0 x0Var2 = this.f219758s;
            x0Var2.f219891n = 2;
            x0Var2.f219892o = 0;
            x0Var2.invalidateSelf();
            return;
        }
        if (!z18) {
            if (i17 == 1 || i17 != 2) {
                return;
            }
            this.f219766f = 3;
            if (b4Var != null) {
                b4Var.d();
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f219771n;
            n3Var.mo50303x856b99f0(0);
            n3Var.mo50307xb9e94560(0, this.f219768h);
            n3Var.mo50307xb9e94560(1, this.f219769i);
            e(true);
            z21.e eVar = this.f219765e;
            if (eVar != null) {
                eVar.mo48299x360802(true);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.x0 x0Var3 = this.f219758s;
        x0Var3.f219891n = 2;
        x0Var3.f219892o = 0;
        x0Var3.invalidateSelf();
        c();
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.t1 t1Var = this.f219770m;
        if (t1Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.b1 b1Var2 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.z0) t1Var).f219902a;
            android.widget.Toast toast = b1Var2.f219788j;
            if (toast != null) {
                toast.cancel();
            }
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = b1Var2.f219779a;
            android.widget.Toast m125854x26a183b = dp.a.m125854x26a183b(abstractActivityC21394xb3d2c0cf, abstractActivityC21394xb3d2c0cf.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fha), 0);
            b1Var2.f219788j = m125854x26a183b;
            m125854x26a183b.setGravity(17, 0, 0);
            b1Var2.f219788j.show();
            b1Var2.f219780b.c(true, false, "");
        }
    }

    public void m(android.content.Context context) {
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.bd8, this);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.f569150p71);
        this.f219756q = findViewById;
        findViewById.setLayerType(1, null);
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.x0 x0Var = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.x0(context);
        this.f219758s = x0Var;
        this.f219756q.setBackground(x0Var);
        this.f219756q.setEnabled(true);
        this.f219756q.setOnTouchListener(this.f219762w);
        this.f219756q.setOnLongClickListener(this.f219761v);
        this.f219757r = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.ggj);
        k(true);
        if (isInEditMode() || com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            return;
        }
        o(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.fts.ui.widget.FTSVoiceInputLayoutImpl$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.x0 x0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.C15622xdd86a927.this.f219758s;
                x0Var2.f219891n = 5;
                x0Var2.invalidateSelf();
            }
        });
        this.f219766f = 1;
        j();
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.u1 u1Var = this.f219764d;
        if (u1Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.y0) u1Var).a(12, -1, -1);
        }
    }

    public void n(boolean z17) {
        o(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.f1(this, z17));
    }

    public final void o(java.lang.Runnable runnable) {
        if (java.lang.Thread.currentThread() != android.os.Looper.getMainLooper().getThread()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(runnable);
        } else {
            runnable.run();
        }
    }

    /* renamed from: setFTSVoiceDetectListener */
    public void m63632xd6fbefa6(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.j1 j1Var) {
        super.m63637xc1b94687(j1Var);
    }

    public C15622xdd86a927(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f219759t = false;
        this.f219760u = false;
        this.f219761v = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.d1(this);
        this.f219762w = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.e1(this);
        m(context);
    }
}
