package a31;

/* loaded from: classes5.dex */
public final class m {
    public boolean A;
    public long C;
    public boolean E;
    public int G;
    public long H;
    public long I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f82499J;
    public a31.b M;
    public long N;

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f82500a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f82501b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.C19651x7fe9d32 f82502c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f82503d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f82504e;

    /* renamed from: f, reason: collision with root package name */
    public int f82505f;

    /* renamed from: g, reason: collision with root package name */
    public int f82506g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f82507h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f82508i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f82509j;

    /* renamed from: n, reason: collision with root package name */
    public int f82513n;

    /* renamed from: r, reason: collision with root package name */
    public android.os.Vibrator f82517r;

    /* renamed from: s, reason: collision with root package name */
    public z21.w f82518s;

    /* renamed from: t, reason: collision with root package name */
    public e70.a0 f82519t;

    /* renamed from: u, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f82520u;

    /* renamed from: v, reason: collision with root package name */
    public int f82521v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f82522w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f82523x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f82524y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f82525z;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f82510k = "";

    /* renamed from: l, reason: collision with root package name */
    public final java.util.ArrayList f82511l = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f82512m = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final int[] f82514o = new int[2];

    /* renamed from: p, reason: collision with root package name */
    public final int[] f82515p = new int[2];

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f82516q = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
    public java.lang.String B = "";
    public long D = 60;
    public int F = -1;
    public final java.lang.Runnable K = new a31.j(this);
    public final a31.d L = new a31.d(this);
    public final a31.l O = new a31.l(this);
    public final java.lang.Runnable P = new a31.c(this);

    public static final void a(a31.m mVar, java.lang.CharSequence charSequence) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = mVar.f82501b;
        if (c22621x7603e017 != null) {
            int selectionStart = c22621x7603e017.getSelectionStart();
            int length = c22621x7603e017.getText().length();
            if (selectionStart <= 3) {
                mVar.f82508i = true;
            }
            int i17 = length - 3;
            if (i17 < 0) {
                i17 = 0;
            }
            if (selectionStart >= i17) {
                mVar.f82509j = true;
            }
        }
        int c17 = b31.l.c(charSequence);
        if (c17 > 0) {
            mVar.f82511l.add(java.lang.Integer.valueOf(c17));
        }
        int b17 = b31.l.b(charSequence);
        if (b17 > 0) {
            mVar.f82512m.add(java.lang.Integer.valueOf(b17));
        }
    }

    public final void b(java.lang.Class cls) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f82501b;
        if (c22621x7603e017 == null) {
            return;
        }
        java.lang.Object[] spans = c22621x7603e017.getText().getSpans(0, c22621x7603e017.getText().length(), cls);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(spans, "getSpans(...)");
        for (java.lang.Object obj : spans) {
            c22621x7603e017.getText().removeSpan(obj);
        }
    }

    public final void c() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f82501b;
        if (c22621x7603e017 != null) {
            c22621x7603e017.removeTextChangedListener(this.L);
        }
        e70.a0 a0Var = this.f82519t;
        if (a0Var != null) {
            ((d83.t0) a0Var).d();
        }
        this.f82500a = null;
        this.f82518s = null;
        this.f82520u = null;
        this.f82501b = null;
        this.f82502c = null;
        this.f82519t = null;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f82516q;
        n3Var.mo50300x3fa464aa(this.O);
        n3Var.mo50300x3fa464aa(this.K);
        this.M = null;
        this.N = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(int r30) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a31.m.d(int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0014, code lost:
    
        if (r6 < 0) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(long r9) {
        /*
            r8 = this;
            long r0 = android.os.SystemClock.uptimeMillis()
            long r2 = r8.N
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto Le
        Lc:
            r6 = r4
            goto L17
        Le:
            long r6 = r8.D
            long r0 = r0 - r2
            long r6 = r6 - r0
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 >= 0) goto L17
            goto Lc
        L17:
            long r9 = java.lang.Math.max(r9, r6)
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            a31.l r1 = r8.O
            if (r0 != 0) goto L25
            r1.run()
            goto L2a
        L25:
            com.tencent.mm.sdk.platformtools.n3 r0 = r8.f82516q
            r0.mo50297x7c4d7ca2(r1, r9)
        L2a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a31.m.e(long):void");
    }

    public final void f(android.content.Context context, int i17, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017, com.p314xaae8f345.mm.p2470x93e71c27.ui.C19651x7fe9d32 c19651x7fe9d32, java.lang.String userName) {
        java.lang.Integer h17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        this.f82500a = context;
        this.f82505f = i17;
        this.f82501b = c22621x7603e017;
        this.f82502c = c19651x7fe9d32;
        this.f82510k = userName;
        if (c22621x7603e017 != null) {
            c22621x7603e017.addTextChangedListener(this.L);
        }
        b31.l lVar = b31.l.f99146a;
        lVar.i();
        lVar.a();
        java.lang.String f17 = j62.e.g().f(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C20066xb33446ae());
        int intValue = (f17 == null || (h17 = r26.h0.h(f17)) == null) ? 0 : h17.intValue();
        this.G = intValue;
        this.E = intValue > 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SpeechInputHelper", "setSpeechInputListener voiceInputScene=" + i17 + ", stopFlush=" + this.E + '(' + this.G + ')');
        if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C20060x592fcc6f()) == 1) {
            this.f82519t = ((i70.g) ((e70.b0) i95.n0.c(e70.b0.class))).wi(true);
        }
    }

    public final void g(float f17, float f18) {
        android.text.Layout layout;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f82501b;
        if (c22621x7603e017 == null || (layout = c22621x7603e017.getLayout()) == null) {
            return;
        }
        this.F = layout.getOffsetForHorizontal(layout.getLineForVertical((int) e06.p.e((f18 - c22621x7603e017.getTotalPaddingTop()) + c22621x7603e017.getScrollY(), 0.0f, c22621x7603e017.getHeight())), e06.p.e((f17 - c22621x7603e017.getTotalPaddingLeft()) + c22621x7603e017.getScrollX(), 0.0f, c22621x7603e017.getWidth()));
    }

    public final void h() {
        android.content.Context context = this.f82500a;
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SpeechInputHelper", "showNetErrorTip: context is null, skip showing network error tip");
            return;
        }
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
        e4Var.f293309c = context != null ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.onc) : null;
        e4Var.c();
        b31.l.f99146a.f();
    }

    public final void i(int i17) {
        int selectionEnd;
        int selectionStart;
        this.f82503d = false;
        this.f82504e = false;
        java.lang.String str = "";
        this.B = "";
        this.H = 0L;
        this.I = 0L;
        this.f82499J = false;
        this.F = -1;
        this.f82522w = false;
        b(a31.n.class);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f82516q;
        n3Var.mo50300x3fa464aa(this.K);
        boolean z17 = this.G > 0;
        this.E = z17;
        if (z17) {
            n3Var.mo50300x3fa464aa(this.O);
            this.M = null;
            this.N = 0L;
        }
        if (iq.b.C(this.f82500a) || iq.b.v(this.f82500a) || iq.b.e(this.f82500a) || iq.b.z(this.f82500a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SpeechInputHelper", "voip is running, cann't record voice");
            com.p314xaae8f345.mm.p2470x93e71c27.ui.C19651x7fe9d32 c19651x7fe9d32 = this.f82502c;
            if (c19651x7fe9d32 != null) {
                c19651x7fe9d32.c(i17);
                return;
            }
            return;
        }
        if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(this.f82500a)) {
            h();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.C19651x7fe9d32 c19651x7fe9d322 = this.f82502c;
            if (c19651x7fe9d322 != null) {
                c19651x7fe9d322.c(i17);
                return;
            }
            return;
        }
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.content.Context context = this.f82500a;
        ((sb0.f) jVar).getClass();
        if (!j35.u.d(context, "android.permission.RECORD_AUDIO", true)) {
            android.content.Context context2 = this.f82500a;
            if (context2 instanceof android.app.Activity) {
                ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                j35.u.i((android.app.Activity) context2, "android.permission.RECORD_AUDIO", 80);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SpeechInputHelper", "context !is Activity");
            com.p314xaae8f345.mm.p2470x93e71c27.ui.C19651x7fe9d32 c19651x7fe9d323 = this.f82502c;
            if (c19651x7fe9d323 != null) {
                c19651x7fe9d323.c(i17);
                return;
            }
            return;
        }
        this.f82523x = true;
        this.A = false;
        if (this.f82517r == null) {
            android.content.Context context3 = this.f82500a;
            java.lang.Object systemService = context3 != null ? context3.getSystemService("vibrator") : null;
            if (systemService != null) {
                this.f82517r = (android.os.Vibrator) systemService;
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f82501b;
        java.lang.String obj = (c22621x7603e017 == null || (selectionStart = c22621x7603e017.getSelectionStart()) <= 0) ? "" : c22621x7603e017.getText().subSequence(0, selectionStart).toString();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172 = this.f82501b;
        if (c22621x7603e0172 != null && (selectionEnd = c22621x7603e0172.getSelectionEnd()) < c22621x7603e0172.getText().length()) {
            str = c22621x7603e0172.getText().subSequence(selectionEnd, c22621x7603e0172.getText().length()).toString();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SpeechInputHelper", "initVoiceAddr() voiceInputScene = " + this.f82505f);
        this.f82518s = new z21.w(this.f82505f, this.f82506g, this.f82510k, obj, str, this.f82519t, new a31.h(this));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0173 = this.f82501b;
        if (c22621x7603e0173 != null) {
            c22621x7603e0173.f();
            c22621x7603e0173.mo81360xbf01395c(new a31.e(this, c22621x7603e0173));
        }
        z21.w wVar = this.f82518s;
        if (wVar != null) {
            wVar.mo48296x68ac462();
        }
    }

    public final void j() {
        z21.j0 j0Var;
        this.f82503d = true;
        this.H = android.os.SystemClock.elapsedRealtime();
        this.f82499J = false;
        this.C = 0L;
        this.A = false;
        if (!this.f82524y) {
            this.f82523x = false;
        }
        boolean z17 = this.E;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f82516q;
        if (z17) {
            z21.w wVar = this.f82518s;
            if (wVar != null && wVar.C && (j0Var = wVar.A) != null) {
                j0Var.f551173w = true;
            }
            java.lang.Runnable runnable = this.K;
            n3Var.mo50300x3fa464aa(runnable);
            n3Var.mo50297x7c4d7ca2(runnable, this.G);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SpeechInputHelper", "stopRecord: stopFlush timeout=" + this.G + "ms");
        } else {
            this.B = "";
            b(a31.n.class);
        }
        z21.w wVar2 = this.f82518s;
        if (wVar2 != null) {
            wVar2.mo48278xae7a2e7a(true);
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f82520u;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f82520u = null;
        n3Var.mo50300x3fa464aa(this.O);
        this.M = null;
        if (this.E) {
            return;
        }
        this.N = 0L;
    }

    public final void k(java.lang.CharSequence charSequence, int i17, int i18) {
        java.lang.CharSequence charSequence2;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f82501b;
        if (c22621x7603e017 != null) {
            if (this.f82503d) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SpeechInputHelper", "updateWordToWord() called with isStopRecord, skip !!");
                return;
            }
            if (i17 != -1 && this.f82521v == 0) {
                this.f82521v = i18 - i17;
            }
            int i19 = this.f82521v;
            int length = charSequence.length();
            int i27 = this.f82521v;
            int i28 = length - i27;
            if (2 <= i28 && i28 < 11) {
                int i29 = i27 + 1;
                this.f82521v = i29;
                charSequence2 = charSequence.subSequence(0, i29).toString();
            } else {
                this.f82521v = charSequence.length();
                charSequence2 = charSequence;
            }
            android.text.SpannableString spannableString = new android.text.SpannableString(charSequence2);
            spannableString.setSpan(new a31.n(), 0, spannableString.length(), 33);
            android.text.Editable text = c22621x7603e017.getText();
            int length2 = text != null ? text.length() : 0;
            if (i17 != -1) {
                int f17 = e06.p.f(i17, 0, length2);
                int f18 = e06.p.f(i19 + i17, f17, length2);
                android.text.Editable text2 = c22621x7603e017.getText();
                if (text2 != null) {
                    text2.replace(f17, f18, spannableString);
                }
            } else if (i19 == 0) {
                int f19 = e06.p.f(i18, 0, length2);
                android.text.Editable text3 = c22621x7603e017.getText();
                if (text3 != null) {
                    text3.insert(f19, spannableString);
                }
            } else {
                int f27 = e06.p.f(i18, 0, length2);
                int f28 = e06.p.f(i19 + i18, f27, length2);
                if (f27 >= length2) {
                    android.text.Editable text4 = c22621x7603e017.getText();
                    if (text4 != null) {
                        text4.insert(length2, spannableString);
                    }
                } else {
                    android.text.Editable text5 = c22621x7603e017.getText();
                    if (text5 != null) {
                        text5.replace(f27, f28, spannableString);
                    }
                }
            }
            if (this.A) {
                c22621x7603e017.mo81549xf579a34a(c22621x7603e017.getText().length());
            }
            int length3 = charSequence.length() - this.f82521v;
            if (length3 > 0) {
                this.f82516q.mo50297x7c4d7ca2(new a31.k(this, charSequence, i17, i18), length3 > 3 ? 40L : 60L);
            }
        }
    }

    public final void l(int i17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19651x7fe9d32 c19651x7fe9d32 = this.f82502c;
        if ((c19651x7fe9d32 != null ? c19651x7fe9d32.getCurV2TStatus() : 0) >= 2) {
            return;
        }
        this.f82506g = i17;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19651x7fe9d32 c19651x7fe9d322 = this.f82502c;
        if (c19651x7fe9d322 != null) {
            c19651x7fe9d322.c(2);
        }
    }

    public final void m(int i17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017;
        int selectionEnd;
        a31.l lVar = this.O;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f82516q;
        if (i17 == 101) {
            this.f82504e = true;
            n3Var.mo50300x3fa464aa(lVar);
            this.M = null;
        }
        if (this.E && ((i17 == 54 || i17 == 53) && (c22621x7603e017 = this.f82501b) != null)) {
            if (i17 == 54) {
                selectionEnd = this.F;
                this.F = -1;
            } else {
                selectionEnd = c22621x7603e017.getSelectionEnd();
            }
            if (selectionEnd >= 0 && selectionEnd < c22621x7603e017.getText().length()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SpeechInputHelper", "stopRecording: cursor not at end, disable stopFlush");
                n3Var.mo50300x3fa464aa(lVar);
                this.E = false;
                n3Var.mo50300x3fa464aa(this.K);
            } else {
                this.f82522w = true;
            }
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19651x7fe9d32 c19651x7fe9d32 = this.f82502c;
        if ((c19651x7fe9d32 != null ? c19651x7fe9d32.getCurV2TStatus() : 0) < 2) {
            return;
        }
        z21.w wVar = this.f82518s;
        if (wVar != null) {
            wVar.e(i17);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19651x7fe9d32 c19651x7fe9d322 = this.f82502c;
        if (c19651x7fe9d322 != null) {
            c19651x7fe9d322.c(1);
        }
    }
}
