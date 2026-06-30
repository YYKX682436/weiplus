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
    public boolean f966J;
    public a31.b M;
    public long N;

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f967a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMEditText f968b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.SpeechInputLayout f969c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f970d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f971e;

    /* renamed from: f, reason: collision with root package name */
    public int f972f;

    /* renamed from: g, reason: collision with root package name */
    public int f973g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f974h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f975i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f976j;

    /* renamed from: n, reason: collision with root package name */
    public int f980n;

    /* renamed from: r, reason: collision with root package name */
    public android.os.Vibrator f984r;

    /* renamed from: s, reason: collision with root package name */
    public z21.w f985s;

    /* renamed from: t, reason: collision with root package name */
    public e70.a0 f986t;

    /* renamed from: u, reason: collision with root package name */
    public kotlinx.coroutines.r2 f987u;

    /* renamed from: v, reason: collision with root package name */
    public int f988v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f989w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f990x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f991y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f992z;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f977k = "";

    /* renamed from: l, reason: collision with root package name */
    public final java.util.ArrayList f978l = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f979m = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final int[] f981o = new int[2];

    /* renamed from: p, reason: collision with root package name */
    public final int[] f982p = new int[2];

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f983q = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
    public java.lang.String B = "";
    public long D = 60;
    public int F = -1;
    public final java.lang.Runnable K = new a31.j(this);
    public final a31.d L = new a31.d(this);
    public final a31.l O = new a31.l(this);
    public final java.lang.Runnable P = new a31.c(this);

    public static final void a(a31.m mVar, java.lang.CharSequence charSequence) {
        com.tencent.mm.ui.widget.MMEditText mMEditText = mVar.f968b;
        if (mMEditText != null) {
            int selectionStart = mMEditText.getSelectionStart();
            int length = mMEditText.getText().length();
            if (selectionStart <= 3) {
                mVar.f975i = true;
            }
            int i17 = length - 3;
            if (i17 < 0) {
                i17 = 0;
            }
            if (selectionStart >= i17) {
                mVar.f976j = true;
            }
        }
        int c17 = b31.l.c(charSequence);
        if (c17 > 0) {
            mVar.f978l.add(java.lang.Integer.valueOf(c17));
        }
        int b17 = b31.l.b(charSequence);
        if (b17 > 0) {
            mVar.f979m.add(java.lang.Integer.valueOf(b17));
        }
    }

    public final void b(java.lang.Class cls) {
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f968b;
        if (mMEditText == null) {
            return;
        }
        java.lang.Object[] spans = mMEditText.getText().getSpans(0, mMEditText.getText().length(), cls);
        kotlin.jvm.internal.o.f(spans, "getSpans(...)");
        for (java.lang.Object obj : spans) {
            mMEditText.getText().removeSpan(obj);
        }
    }

    public final void c() {
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f968b;
        if (mMEditText != null) {
            mMEditText.removeTextChangedListener(this.L);
        }
        e70.a0 a0Var = this.f986t;
        if (a0Var != null) {
            ((d83.t0) a0Var).d();
        }
        this.f967a = null;
        this.f985s = null;
        this.f987u = null;
        this.f968b = null;
        this.f969c = null;
        this.f986t = null;
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f983q;
        n3Var.removeCallbacks(this.O);
        n3Var.removeCallbacks(this.K);
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
            com.tencent.mm.sdk.platformtools.n3 r0 = r8.f983q
            r0.postDelayed(r1, r9)
        L2a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a31.m.e(long):void");
    }

    public final void f(android.content.Context context, int i17, com.tencent.mm.ui.widget.MMEditText mMEditText, com.tencent.mm.pluginsdk.ui.SpeechInputLayout speechInputLayout, java.lang.String userName) {
        java.lang.Integer h17;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(userName, "userName");
        this.f967a = context;
        this.f972f = i17;
        this.f968b = mMEditText;
        this.f969c = speechInputLayout;
        this.f977k = userName;
        if (mMEditText != null) {
            mMEditText.addTextChangedListener(this.L);
        }
        b31.l lVar = b31.l.f17613a;
        lVar.i();
        lVar.a();
        java.lang.String f17 = j62.e.g().f(new com.tencent.mm.repairer.config.chatting.RepairerConfigVoiceInputStopFlush());
        int intValue = (f17 == null || (h17 = r26.h0.h(f17)) == null) ? 0 : h17.intValue();
        this.G = intValue;
        this.E = intValue > 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.SpeechInputHelper", "setSpeechInputListener voiceInputScene=" + i17 + ", stopFlush=" + this.E + '(' + this.G + ')');
        if (j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigVoiceInputIlink()) == 1) {
            this.f986t = ((i70.g) ((e70.b0) i95.n0.c(e70.b0.class))).wi(true);
        }
    }

    public final void g(float f17, float f18) {
        android.text.Layout layout;
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f968b;
        if (mMEditText == null || (layout = mMEditText.getLayout()) == null) {
            return;
        }
        this.F = layout.getOffsetForHorizontal(layout.getLineForVertical((int) e06.p.e((f18 - mMEditText.getTotalPaddingTop()) + mMEditText.getScrollY(), 0.0f, mMEditText.getHeight())), e06.p.e((f17 - mMEditText.getTotalPaddingLeft()) + mMEditText.getScrollX(), 0.0f, mMEditText.getWidth()));
    }

    public final void h() {
        android.content.Context context = this.f967a;
        if (context == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SpeechInputHelper", "showNetErrorTip: context is null, skip showing network error tip");
            return;
        }
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = context != null ? context.getString(com.tencent.mm.R.string.onc) : null;
        e4Var.c();
        b31.l.f17613a.f();
    }

    public final void i(int i17) {
        int selectionEnd;
        int selectionStart;
        this.f970d = false;
        this.f971e = false;
        java.lang.String str = "";
        this.B = "";
        this.H = 0L;
        this.I = 0L;
        this.f966J = false;
        this.F = -1;
        this.f989w = false;
        b(a31.n.class);
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f983q;
        n3Var.removeCallbacks(this.K);
        boolean z17 = this.G > 0;
        this.E = z17;
        if (z17) {
            n3Var.removeCallbacks(this.O);
            this.M = null;
            this.N = 0L;
        }
        if (iq.b.C(this.f967a) || iq.b.v(this.f967a) || iq.b.e(this.f967a) || iq.b.z(this.f967a)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SpeechInputHelper", "voip is running, cann't record voice");
            com.tencent.mm.pluginsdk.ui.SpeechInputLayout speechInputLayout = this.f969c;
            if (speechInputLayout != null) {
                speechInputLayout.c(i17);
                return;
            }
            return;
        }
        if (!com.tencent.mars.comm.NetStatusUtil.isConnected(this.f967a)) {
            h();
            com.tencent.mm.pluginsdk.ui.SpeechInputLayout speechInputLayout2 = this.f969c;
            if (speechInputLayout2 != null) {
                speechInputLayout2.c(i17);
                return;
            }
            return;
        }
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.content.Context context = this.f967a;
        ((sb0.f) jVar).getClass();
        if (!j35.u.d(context, "android.permission.RECORD_AUDIO", true)) {
            android.content.Context context2 = this.f967a;
            if (context2 instanceof android.app.Activity) {
                ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                j35.u.i((android.app.Activity) context2, "android.permission.RECORD_AUDIO", 80);
                return;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.SpeechInputHelper", "context !is Activity");
            com.tencent.mm.pluginsdk.ui.SpeechInputLayout speechInputLayout3 = this.f969c;
            if (speechInputLayout3 != null) {
                speechInputLayout3.c(i17);
                return;
            }
            return;
        }
        this.f990x = true;
        this.A = false;
        if (this.f984r == null) {
            android.content.Context context3 = this.f967a;
            java.lang.Object systemService = context3 != null ? context3.getSystemService("vibrator") : null;
            if (systemService != null) {
                this.f984r = (android.os.Vibrator) systemService;
            }
        }
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f968b;
        java.lang.String obj = (mMEditText == null || (selectionStart = mMEditText.getSelectionStart()) <= 0) ? "" : mMEditText.getText().subSequence(0, selectionStart).toString();
        com.tencent.mm.ui.widget.MMEditText mMEditText2 = this.f968b;
        if (mMEditText2 != null && (selectionEnd = mMEditText2.getSelectionEnd()) < mMEditText2.getText().length()) {
            str = mMEditText2.getText().subSequence(selectionEnd, mMEditText2.getText().length()).toString();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SpeechInputHelper", "initVoiceAddr() voiceInputScene = " + this.f972f);
        this.f985s = new z21.w(this.f972f, this.f973g, this.f977k, obj, str, this.f986t, new a31.h(this));
        com.tencent.mm.ui.widget.MMEditText mMEditText3 = this.f968b;
        if (mMEditText3 != null) {
            mMEditText3.f();
            mMEditText3.setInputListener(new a31.e(this, mMEditText3));
        }
        z21.w wVar = this.f985s;
        if (wVar != null) {
            wVar.start();
        }
    }

    public final void j() {
        z21.j0 j0Var;
        this.f970d = true;
        this.H = android.os.SystemClock.elapsedRealtime();
        this.f966J = false;
        this.C = 0L;
        this.A = false;
        if (!this.f991y) {
            this.f990x = false;
        }
        boolean z17 = this.E;
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f983q;
        if (z17) {
            z21.w wVar = this.f985s;
            if (wVar != null && wVar.C && (j0Var = wVar.A) != null) {
                j0Var.f469640w = true;
            }
            java.lang.Runnable runnable = this.K;
            n3Var.removeCallbacks(runnable);
            n3Var.postDelayed(runnable, this.G);
            com.tencent.mars.xlog.Log.i("MicroMsg.SpeechInputHelper", "stopRecord: stopFlush timeout=" + this.G + "ms");
        } else {
            this.B = "";
            b(a31.n.class);
        }
        z21.w wVar2 = this.f985s;
        if (wVar2 != null) {
            wVar2.cancel(true);
        }
        kotlinx.coroutines.r2 r2Var = this.f987u;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f987u = null;
        n3Var.removeCallbacks(this.O);
        this.M = null;
        if (this.E) {
            return;
        }
        this.N = 0L;
    }

    public final void k(java.lang.CharSequence charSequence, int i17, int i18) {
        java.lang.CharSequence charSequence2;
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f968b;
        if (mMEditText != null) {
            if (this.f970d) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SpeechInputHelper", "updateWordToWord() called with isStopRecord, skip !!");
                return;
            }
            if (i17 != -1 && this.f988v == 0) {
                this.f988v = i18 - i17;
            }
            int i19 = this.f988v;
            int length = charSequence.length();
            int i27 = this.f988v;
            int i28 = length - i27;
            if (2 <= i28 && i28 < 11) {
                int i29 = i27 + 1;
                this.f988v = i29;
                charSequence2 = charSequence.subSequence(0, i29).toString();
            } else {
                this.f988v = charSequence.length();
                charSequence2 = charSequence;
            }
            android.text.SpannableString spannableString = new android.text.SpannableString(charSequence2);
            spannableString.setSpan(new a31.n(), 0, spannableString.length(), 33);
            android.text.Editable text = mMEditText.getText();
            int length2 = text != null ? text.length() : 0;
            if (i17 != -1) {
                int f17 = e06.p.f(i17, 0, length2);
                int f18 = e06.p.f(i19 + i17, f17, length2);
                android.text.Editable text2 = mMEditText.getText();
                if (text2 != null) {
                    text2.replace(f17, f18, spannableString);
                }
            } else if (i19 == 0) {
                int f19 = e06.p.f(i18, 0, length2);
                android.text.Editable text3 = mMEditText.getText();
                if (text3 != null) {
                    text3.insert(f19, spannableString);
                }
            } else {
                int f27 = e06.p.f(i18, 0, length2);
                int f28 = e06.p.f(i19 + i18, f27, length2);
                if (f27 >= length2) {
                    android.text.Editable text4 = mMEditText.getText();
                    if (text4 != null) {
                        text4.insert(length2, spannableString);
                    }
                } else {
                    android.text.Editable text5 = mMEditText.getText();
                    if (text5 != null) {
                        text5.replace(f27, f28, spannableString);
                    }
                }
            }
            if (this.A) {
                mMEditText.setSelection(mMEditText.getText().length());
            }
            int length3 = charSequence.length() - this.f988v;
            if (length3 > 0) {
                this.f983q.postDelayed(new a31.k(this, charSequence, i17, i18), length3 > 3 ? 40L : 60L);
            }
        }
    }

    public final void l(int i17) {
        com.tencent.mm.pluginsdk.ui.SpeechInputLayout speechInputLayout = this.f969c;
        if ((speechInputLayout != null ? speechInputLayout.getCurV2TStatus() : 0) >= 2) {
            return;
        }
        this.f973g = i17;
        com.tencent.mm.pluginsdk.ui.SpeechInputLayout speechInputLayout2 = this.f969c;
        if (speechInputLayout2 != null) {
            speechInputLayout2.c(2);
        }
    }

    public final void m(int i17) {
        com.tencent.mm.ui.widget.MMEditText mMEditText;
        int selectionEnd;
        a31.l lVar = this.O;
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f983q;
        if (i17 == 101) {
            this.f971e = true;
            n3Var.removeCallbacks(lVar);
            this.M = null;
        }
        if (this.E && ((i17 == 54 || i17 == 53) && (mMEditText = this.f968b) != null)) {
            if (i17 == 54) {
                selectionEnd = this.F;
                this.F = -1;
            } else {
                selectionEnd = mMEditText.getSelectionEnd();
            }
            if (selectionEnd >= 0 && selectionEnd < mMEditText.getText().length()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SpeechInputHelper", "stopRecording: cursor not at end, disable stopFlush");
                n3Var.removeCallbacks(lVar);
                this.E = false;
                n3Var.removeCallbacks(this.K);
            } else {
                this.f989w = true;
            }
        }
        com.tencent.mm.pluginsdk.ui.SpeechInputLayout speechInputLayout = this.f969c;
        if ((speechInputLayout != null ? speechInputLayout.getCurV2TStatus() : 0) < 2) {
            return;
        }
        z21.w wVar = this.f985s;
        if (wVar != null) {
            wVar.e(i17);
        }
        com.tencent.mm.pluginsdk.ui.SpeechInputLayout speechInputLayout2 = this.f969c;
        if (speechInputLayout2 != null) {
            speechInputLayout2.c(1);
        }
    }
}
