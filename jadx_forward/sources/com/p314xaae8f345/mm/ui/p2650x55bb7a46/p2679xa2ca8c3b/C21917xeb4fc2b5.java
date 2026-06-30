package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate */
/* loaded from: classes5.dex */
public class C21917xeb4fc2b5 extends com.p314xaae8f345.mm.ui.p2635x2dc211.p2636x38b73479.C21454xce35d788 {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 f284742e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f284743f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ProgressBar f284744g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f284745h;

    /* renamed from: i, reason: collision with root package name */
    public int f284746i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f284747m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f284748n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.ref.WeakReference f284749o;

    /* renamed from: p, reason: collision with root package name */
    public long f284750p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.f f284751q;

    /* renamed from: r, reason: collision with root package name */
    public final android.text.SpannableStringBuilder f284752r;

    /* renamed from: s, reason: collision with root package name */
    public final int f284753s;

    /* renamed from: t, reason: collision with root package name */
    public final android.text.style.CharacterStyle f284754t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.GestureDetector f284755u;

    public C21917xeb4fc2b5(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f284746i = 0;
        this.f284747m = false;
        this.f284748n = null;
        this.f284749o = null;
        this.f284750p = 0L;
        this.f284752r = new android.text.SpannableStringBuilder();
        this.f284753s = 3;
        this.f284754t = new android.text.style.ForegroundColorSpan(-5066062);
        this.f284755u = new android.view.GestureDetector(getContext(), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.fo(this));
    }

    public static void a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21917xeb4fc2b5 c21917xeb4fc2b5) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.go goVar;
        if (c21917xeb4fc2b5.m80028xc2a54588() == null || (goVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.go) c21917xeb4fc2b5.m80028xc2a54588().getTag()) == null) {
            return;
        }
        int d17 = goVar.d();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemTranslate", "scrollToVisibility!! position:%s", java.lang.Integer.valueOf(d17));
        android.view.View P0 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) ((yb5.d) c21917xeb4fc2b5.f284749o.get()).f542241c.a(sb5.z.class))).P0(d17);
        if (P0 == null || P0.getTop() <= 0) {
            return;
        }
        yb5.d dVar = (yb5.d) c21917xeb4fc2b5.f284749o.get();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(d17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(dVar, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemTranslate", "scrollToVisibility", "()V", "Undefined", "scrollToPosition", "(I)V");
        dVar.O(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(dVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemTranslate", "scrollToVisibility", "()V", "Undefined", "scrollToPosition", "(I)V");
    }

    /* renamed from: getNewAnimationConfig */
    private boolean m80027x5a76d41c() {
        return true;
    }

    public final void b(java.lang.CharSequence charSequence, int i17, long j17, boolean z17) {
        if (i17 <= this.f284746i && !m80027x5a76d41c()) {
            this.f284746i = i17 - 2;
        }
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = java.lang.Integer.valueOf(this.f284742e.hashCode());
        objArr[1] = java.lang.Long.valueOf(j17);
        objArr[2] = charSequence != null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(charSequence.toString()) : "null";
        objArr[3] = java.lang.Integer.valueOf(i17);
        objArr[4] = java.lang.Integer.valueOf(this.f284746i);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemTranslate", "doVoiceTextAnimation(%s) %s %s %s %s", objArr);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.co(this, charSequence, j17, i17), true);
        this.f284748n = b4Var;
        b4Var.c(0L, m80027x5a76d41c() ? 150L : 200L);
    }

    public void c() {
        this.f284742e = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) findViewById(com.p314xaae8f345.mm.R.id.brv);
        this.f284744g = (android.widget.ProgressBar) findViewById(com.p314xaae8f345.mm.R.id.brw);
        this.f284743f = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.brt);
        this.f284745h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.brs);
        getSizeAnimController().f442660c = false;
    }

    public void d() {
        getSizeAnimController().f442660c = false;
        qa5.l sizeAnimController = getSizeAnimController();
        sizeAnimController.f442662e = false;
        sizeAnimController.f442665h = -1;
        sizeAnimController.f442666i = null;
        android.animation.ValueAnimator valueAnimator = sizeAnimController.f442667j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        sizeAnimController.f442667j = null;
    }

    public void e(java.lang.CharSequence charSequence, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io ioVar, long j17) {
        f(charSequence, ioVar, false, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ho.Text, j17, null);
    }

    public void f(java.lang.CharSequence charSequence, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io ioVar, boolean z17, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ho hoVar, long j17, yb5.d dVar) {
        int i17;
        int length;
        int i18;
        boolean J0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(charSequence);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io ioVar2 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io.Transforming;
        if (J0) {
            if (ioVar != com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io.NoTransform) {
                d();
                go.d dVar2 = go.d.f355229a;
                if ((!go.d.f355231c.containsKey(java.lang.Long.valueOf(j17))) & (j17 != go.d.f355237i)) {
                    this.f284744g.setVisibility(0);
                }
                this.f284744g.setEnabled(true);
                this.f284742e.setVisibility(8);
                g(false);
                if (ioVar != ioVar2) {
                    setVisibility(8);
                    return;
                }
                return;
            }
            return;
        }
        if (dVar != null) {
            this.f284749o = new java.lang.ref.WeakReference(dVar);
        }
        this.f284742e.m84176x8e6ff544(((int) (com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) / j65.f.f379476g)) - i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 5));
        this.f284742e.setVisibility(0);
        this.f284744g.setVisibility(8);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ho hoVar2 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ho.Voice;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io ioVar3 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io.Transformed;
        if (hoVar == hoVar2) {
            if (m80027x5a76d41c()) {
                getSizeAnimController().f442660c = true;
                getSizeAnimController().f442663f = 125;
                getSizeAnimController().f442664g = true;
            }
            g(false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemTranslate", "setContent(%s) msgId:%s currentMsgId:%s content:%s status:%s canAnimation:%s currentContentLength:%s", java.lang.Integer.valueOf(this.f284742e.hashCode()), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(this.f284750p), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(charSequence.toString()), ioVar, java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.f284746i));
            if (this.f284750p != j17) {
                this.f284742e.b("");
                this.f284746i = 0;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f284748n;
                if (b4Var != null) {
                    b4Var.d();
                }
                this.f284748n = null;
                this.f284747m = false;
            }
            this.f284750p = j17;
            if (z17) {
                this.f284742e.b("");
                this.f284746i = 0;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = this.f284748n;
                if (b4Var2 != null) {
                    b4Var2.d();
                }
                this.f284748n = null;
                this.f284747m = true;
            }
            if (ioVar == ioVar3 && z17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var3 = this.f284748n;
                if (b4Var3 != null) {
                    b4Var3.d();
                }
                i17 = 0;
                b(charSequence, charSequence.length(), j17, true);
                this.f284747m = false;
            } else {
                i17 = 0;
                if (ioVar == ioVar2 || z17) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var4 = this.f284748n;
                    if (b4Var4 != null) {
                        b4Var4.d();
                    }
                    if (m80027x5a76d41c()) {
                        b(charSequence, charSequence.length(), j17, true);
                    } else if (charSequence.length() > 3) {
                        b(charSequence, charSequence.length() - 3, j17, false);
                    } else {
                        this.f284742e.c(charSequence, android.widget.TextView.BufferType.SPANNABLE, null);
                    }
                } else if (ioVar != ioVar3 || this.f284748n == null) {
                    d();
                    this.f284742e.c(charSequence, android.widget.TextView.BufferType.SPANNABLE, null);
                } else if (this.f284746i == charSequence.length()) {
                    if (!this.f284742e.a().toString().equals(charSequence.toString())) {
                        this.f284742e.c(charSequence, android.widget.TextView.BufferType.SPANNABLE, null);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemTranslate", "no need update content");
                } else if (this.f284747m) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var5 = this.f284748n;
                    if (b4Var5 != null) {
                        b4Var5.d();
                    }
                    b(charSequence, charSequence.length(), j17, false);
                    this.f284747m = false;
                }
            }
        } else {
            i17 = 0;
            if (ioVar == ioVar2) {
                android.text.SpannableStringBuilder spannableStringBuilder = this.f284752r;
                spannableStringBuilder.clear();
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = this.f284742e;
                if (charSequence != null && charSequence.length() != 0) {
                    int length2 = charSequence.length();
                    int i19 = this.f284753s;
                    if (length2 < i19) {
                        length = charSequence.length();
                        i18 = 0;
                    } else {
                        length = charSequence.length();
                        i18 = length - i19;
                    }
                    spannableStringBuilder.append(charSequence).setSpan(this.f284754t, i18, length, 33);
                }
                c22624x85d69039.c(spannableStringBuilder, android.widget.TextView.BufferType.SPANNABLE, null);
            } else {
                this.f284742e.c(charSequence, android.widget.TextView.BufferType.SPANNABLE, null);
            }
            if (ioVar == ioVar3) {
                g(true);
            } else {
                g(false);
            }
        }
        setVisibility(i17);
    }

    public final void g(boolean z17) {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (context == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemTranslate", "showVoiceTransformFinishIcon: %s --%s", java.lang.Boolean.valueOf(z17), new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        if (z17) {
            this.f284742e.setPadding(i65.a.b(context, 10), i65.a.b(context, 8), i65.a.b(context, 10), i65.a.b(context, 4));
            this.f284743f.setVisibility(0);
        } else {
            this.f284742e.setPadding(i65.a.b(context, 10), i65.a.b(context, 8), i65.a.b(context, 10), i65.a.b(context, 8));
            this.f284743f.setVisibility(8);
        }
    }

    /* renamed from: getContentView */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 m80028xc2a54588() {
        return this.f284742e;
    }

    /* renamed from: getTouchListener */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y m80029x3b96155d() {
        return null;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.GestureDetector gestureDetector;
        motionEvent.getAction();
        boolean z17 = false;
        if (this.f284751q != null && (gestureDetector = this.f284755u) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(motionEvent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemTranslate", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            z17 = gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0));
            yj0.a.g(gestureDetector, z17, "com/tencent/mm/ui/chatting/viewitems/ChattingItemTranslate", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        }
        return !z17 ? super.onTouchEvent(motionEvent) : z17;
    }

    /* renamed from: setBrandWording */
    public void m80030x6e632093(java.lang.String str) {
        this.f284745h.setText(str);
    }

    /* renamed from: setOnDoubleClickListener */
    public void m80031x74caf26a(com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.f fVar) {
        this.f284751q = fVar;
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        super.setVisibility(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemTranslate", "ChattingItemTranslate setVisibility:%s currentMsg:%s -- %s", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(this.f284750p), new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        if (i17 == 8) {
            this.f284744g.setVisibility(8);
        }
    }
}
