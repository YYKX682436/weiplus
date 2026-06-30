package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1752xed08e3c8;

/* renamed from: com.tencent.mm.plugin.game.media.preview.GameVideoView */
/* loaded from: classes4.dex */
public class C15920x9de661ce extends android.widget.RelativeLayout implements com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 {
    public static final java.util.Set A = new java.util.HashSet();

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f221664d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f221665e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.e1 f221666f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f221667g;

    /* renamed from: h, reason: collision with root package name */
    public float f221668h;

    /* renamed from: i, reason: collision with root package name */
    public int f221669i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f221670m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f221671n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f221672o;

    /* renamed from: p, reason: collision with root package name */
    public int f221673p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.z0 f221674q;

    /* renamed from: r, reason: collision with root package name */
    public c01.k f221675r;

    /* renamed from: s, reason: collision with root package name */
    public k53.i0 f221676s;

    /* renamed from: t, reason: collision with root package name */
    public k53.j0 f221677t;

    /* renamed from: u, reason: collision with root package name */
    public k53.g f221678u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f221679v;

    /* renamed from: w, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.a1 f221680w;

    /* renamed from: x, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.c1 f221681x;

    /* renamed from: y, reason: collision with root package name */
    public final c01.i f221682y;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 f221683z;

    public C15920x9de661ce(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f221666f = com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.CONTAIN;
        this.f221667g = false;
        this.f221668h = -1.0f;
        this.f221673p = 0;
        this.f221679v = true;
        this.f221680w = new k53.e0(this);
        this.f221681x = new k53.f0(this);
        this.f221682y = new k53.g0(this);
        this.f221683z = new k53.h0(this);
        this.f221664d = getContext();
        this.f221675r = new c01.k();
    }

    /* renamed from: getRootPath */
    public static java.lang.String m64620x71e6559d() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.m.b(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.l.ONE_WEEK) + "haowan/";
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    public boolean a(double d17, boolean z17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f221665e;
        if (f1Var != null) {
            return f1Var.a(d17, z17);
        }
        return false;
    }

    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1752xed08e3c8.C15918x218ad8ae c15918x218ad8ae = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1752xed08e3c8.C15918x218ad8ae(this.f221664d);
        c15918x218ad8ae.m75326x5d1e8363(this.f221681x);
        c15918x218ad8ae.mo61532x526554de(this.f221683z);
        c15918x218ad8ae.mo48221xf83edb22(this.f221680w);
        java.lang.String m64620x71e6559d = m64620x71e6559d();
        com.p314xaae8f345.mm.vfs.w6.u(m64620x71e6559d);
        c15918x218ad8ae.mo48224x6c9eb6a9(m64620x71e6559d);
        c15918x218ad8ae.mo48236x764cf626(this.f221679v);
        k53.g gVar = new k53.g(c15918x218ad8ae);
        this.f221678u = gVar;
        c15918x218ad8ae.m48235xbc2f47ad(gVar);
        return c15918x218ad8ae;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    public boolean c(float f17) {
        if (f17 <= 0.0f) {
            return false;
        }
        this.f221668h = f17;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f221665e;
        if (f1Var != null) {
            return f1Var.c(f17);
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    public void d() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f221665e;
        if (f1Var != null) {
            ((com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e) f1Var).d();
        }
        this.f221675r.a();
        setKeepScreenOn(false);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    public void e() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f221665e;
        if (f1Var != null) {
            this.f221673p = f1Var.mo61523x898ffe25();
            this.f221665e.e();
        }
        this.f221675r.a();
        setKeepScreenOn(false);
    }

    public final java.lang.String f(java.lang.String str) {
        return m64620x71e6559d() + "MMVideo_" + str.hashCode() + ".mp4";
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    public void g() {
        boolean z17;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var;
        java.lang.String f17;
        if (this.f221665e instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1752xed08e3c8.C15918x218ad8ae) {
            if (com.p314xaae8f345.mm.vfs.w6.j(this.f221672o)) {
                f17 = this.f221672o;
            } else if (com.p314xaae8f345.mm.vfs.w6.j(f(this.f221672o))) {
                f17 = f(this.f221672o);
            }
            this.f221665e.mo48239x360802();
            h(this.f221670m, f17, this.f221669i);
            z17 = true;
            this.f221665e.a(this.f221673p, true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameVideoView", "change to local video. currPosSec:%d", java.lang.Integer.valueOf(this.f221673p));
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new k53.d0(this), 1000L);
            if (!z17 || (f1Var = this.f221665e) == null) {
            }
            f1Var.g();
            return;
        }
        z17 = false;
        if (z17) {
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: getCacheTimeSec */
    public int mo48226x8a3f46d8() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f221665e;
        if (f1Var != null) {
            return f1Var.mo48226x8a3f46d8();
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: getCurrPosMs */
    public int mo64621x25784152() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f221665e;
        if (f1Var != null) {
            return f1Var.mo64621x25784152();
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: getCurrPosSec */
    public int mo61523x898ffe25() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f221665e;
        if (f1Var != null) {
            return f1Var.mo61523x898ffe25();
        }
        return 0;
    }

    /* renamed from: getFilePath */
    public java.lang.String m64622x5000ed37() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f221665e;
        return f1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1752xed08e3c8.C15918x218ad8ae ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1752xed08e3c8.C15918x218ad8ae) f1Var).m64618x5000ed37() : this.f221672o;
    }

    /* renamed from: getLocalPath */
    public java.lang.String m64623xb7957b7a() {
        return this.f221671n ? this.f221672o : f(this.f221672o);
    }

    /* renamed from: getMediaId */
    public java.lang.String m64624x75e04be9() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f221665e;
        if (f1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1752xed08e3c8.C15918x218ad8ae) {
            return ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1752xed08e3c8.C15918x218ad8ae) f1Var).mo48228x75e04be9();
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: getPlayerType */
    public int mo64625x6b2cfdb1() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f221665e;
        if (f1Var != null) {
            return f1Var.mo64625x6b2cfdb1();
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: getVideoDurationSec */
    public int mo61527x6d590e18() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f221665e;
        return f1Var != null ? f1Var.mo61527x6d590e18() : this.f221669i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x002e, code lost:
    
        if (com.p314xaae8f345.mm.vfs.w6.j(r5.f38869x6ac9171) != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(boolean r5, java.lang.String r6, int r7) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1752xed08e3c8.C15920x9de661ce.h(boolean, java.lang.String, int):void");
    }

    public final java.lang.String i(java.lang.String str) {
        return m64620x71e6559d() + "MMVideo_" + str.hashCode() + ".mp4.temp";
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: isPlaying */
    public boolean mo61531xc00617a4() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f221665e;
        if (f1Var != null) {
            return ((com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e) f1Var).mo61531xc00617a4();
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    public boolean j() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f221665e;
        if (f1Var != null) {
            return f1Var.j();
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: pause */
    public boolean mo48231x65825f6() {
        if (this.f221665e == null) {
            return false;
        }
        setKeepScreenOn(false);
        this.f221675r.a();
        return this.f221665e.mo48231x65825f6();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: play */
    public boolean mo48232x348b34() {
        if (this.f221665e == null) {
            return false;
        }
        setKeepScreenOn(true);
        this.f221675r.c(this.f221682y);
        return this.f221665e.mo48232x348b34();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: setCover */
    public void mo64626x52d31475(android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f221665e;
        if (f1Var != null) {
            f1Var.mo64626x52d31475(bitmap);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: setFullDirection */
    public void mo64627xfa24986e(int i17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f221665e;
        if (f1Var != null) {
            f1Var.mo64627xfa24986e(i17);
        }
    }

    /* renamed from: setIMMVideoViewCallback */
    public void m64628x526554de(com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 b1Var) {
        if (b1Var != null) {
            this.f221683z = b1Var;
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: setIsShowBasicControls */
    public void mo64629xc2e9d13b(boolean z17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f221665e;
        if (f1Var != null) {
            f1Var.mo64629xc2e9d13b(z17);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: setLoop */
    public void mo48236x764cf626(boolean z17) {
        this.f221679v = z17;
        this.f221665e.mo48236x764cf626(z17);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: setLoopCompletionCallback */
    public void mo64630x8fda8107(com.p314xaae8f345.mm.p2470x93e71c27.ui.d1 d1Var) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: setMute */
    public void mo61536x764d819b(boolean z17) {
        this.f221667g = z17;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f221665e;
        if (f1Var != null) {
            f1Var.mo61536x764d819b(z17);
        }
    }

    /* renamed from: setPlayerListener */
    public void m64631x2ccf87b7(k53.j0 j0Var) {
        this.f221677t = j0Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: setScaleType */
    public void mo48237xebd28962(com.p314xaae8f345.mm.p2470x93e71c27.ui.e1 e1Var) {
        this.f221666f = e1Var;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f221665e;
        if (f1Var != null) {
            f1Var.mo48237xebd28962(e1Var);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: setVideoFooterView */
    public void mo64632xb9405cf9(com.p314xaae8f345.mm.p2470x93e71c27.ui.z0 z0Var) {
        this.f221674q = z0Var;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f221665e;
        if (f1Var != null) {
            f1Var.mo64632xb9405cf9(z0Var);
        }
    }

    /* renamed from: setVideoPreparedListener */
    public void m64633x5875b76a(k53.i0 i0Var) {
        this.f221676s = i0Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: start */
    public void mo48238x68ac462() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f221665e;
        if (f1Var != null) {
            f1Var.mo48238x68ac462();
            setKeepScreenOn(true);
            this.f221675r.c(this.f221682y);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: stop */
    public void mo48239x360802() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.f1 f1Var = this.f221665e;
        if (f1Var != null) {
            f1Var.mo48239x360802();
            this.f221675r.a();
            setKeepScreenOn(false);
        }
    }

    public C15920x9de661ce(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f221666f = com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.CONTAIN;
        this.f221667g = false;
        this.f221668h = -1.0f;
        this.f221673p = 0;
        this.f221679v = true;
        this.f221680w = new k53.e0(this);
        this.f221681x = new k53.f0(this);
        this.f221682y = new k53.g0(this);
        this.f221683z = new k53.h0(this);
        this.f221664d = getContext();
        this.f221675r = new c01.k();
    }
}
