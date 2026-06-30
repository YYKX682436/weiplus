package com.tencent.mm.feature.ecs.nirvana.ui;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u001b\u0010\u000b\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/feature/ecs/nirvana/ui/MagicDebugPanelView;", "Landroid/widget/FrameLayout;", "Landroid/view/View;", "parent", "Ljz5/f0;", "setParentView", "", "F", "Ljz5/g;", "getTouchSlop", "()I", "touchSlop", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-nirvana_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class MagicDebugPanelView extends android.widget.FrameLayout {
    public static final /* synthetic */ int G = 0;
    public float A;
    public float B;
    public float C;
    public float D;
    public boolean E;

    /* renamed from: F, reason: from kotlin metadata */
    public final jz5.g touchSlop;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f65814d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f65815e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f65816f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Runnable f65817g;

    /* renamed from: h, reason: collision with root package name */
    public iq0.c f65818h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f65819i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f65820m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f65821n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f65822o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f65823p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.SeekBar f65824q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.Switch f65825r;

    /* renamed from: s, reason: collision with root package name */
    public f00.d f65826s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f65827t;

    /* renamed from: u, reason: collision with root package name */
    public int f65828u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f65829v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f65830w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f65831x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.LinearLayout f65832y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.LinearLayout f65833z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MagicDebugPanelView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    private final int getTouchSlop() {
        return ((java.lang.Number) ((jz5.n) this.touchSlop).getValue()).intValue();
    }

    public final int a(float f17) {
        return (int) ((f17 * getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final void b() {
        f00.d dVar = this.f65826s;
        if (dVar != null) {
            dVar.b();
        }
        this.f65826s = null;
    }

    public final void c(int i17, float f17, float f18) {
        int i18;
        try {
            android.view.View view = this.f65827t;
            if (view == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MagicDebugPanelView", "postCanvasTouchEvent failed: parentView is null");
                return;
            }
            if (i17 != 0) {
                i18 = 1;
                if (i17 != 1) {
                    i18 = 2;
                    if (i17 != 2) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.MagicDebugPanelView", "postCanvasTouchEvent failed: unknown action " + i17);
                        return;
                    }
                }
            } else {
                i18 = 0;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            view.dispatchTouchEvent(android.view.MotionEvent.obtain(currentTimeMillis, currentTimeMillis, i18, f17, f18, 0));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MagicDebugPanelView", "postCanvasTouchEvent failed: " + e17.getMessage(), e17);
        }
    }

    public final void d() {
        this.f65815e = !this.f65815e;
        e();
        if (this.f65815e) {
            iq0.c cVar = this.f65818h;
            if (cVar == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MagicDebugPanelView", "startProfile failed: bizHandle is null");
                b();
                return;
            }
            q10.k kVar = q10.k.f359520a;
            p10.t tVar = new p10.t(this);
            com.tencent.mars.xlog.Log.i("MicroMsg.MBProfileUtil", "startProfile: bizName=" + cVar.f293644a + ", instanceKey=" + cVar.f293645b);
            ((nq0.p) ((gq0.t) i95.n0.c(gq0.t.class))).bj(cVar, ";(function() {var g = (typeof globalThis !== 'undefined') ? globalThis : (0, eval)('this');var profiler = NativeGlobal.Profiler;var token = profiler.startCpuProfiling();g.__debug_v8_profiler = profiler;return token;})();", new q10.f(tVar));
            return;
        }
        iq0.c cVar2 = this.f65818h;
        if (cVar2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MagicDebugPanelView", "finishProfile failed: bizHandle is null");
            b();
            return;
        }
        if (this.f65826s == null) {
            f00.a aVar = f00.d.f258292d;
            android.content.Context context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            this.f65826s = f00.a.a(aVar, context, getContext().getString(com.tencent.mm.R.string.f490604zq), 500L, null, 8, null);
        }
        f00.d dVar = this.f65826s;
        if (dVar != null) {
            dVar.a();
        }
        java.lang.String token = this.f65816f;
        kotlin.jvm.internal.o.g(token, "token");
        java.lang.String format = java.lang.String.format(";(function() {var g = (typeof globalThis !== 'undefined') ? globalThis : (0, eval)('this');if (!g.__debug_v8_profiler) { g.__debug_v8_profiler = NativeGlobal.Profiler; }var token = %s;try {mb.JSBridge.invoke('stopCpuProfile', { token: token });} catch (e) { console.error('stopCpuProfile invoke failed', e); }return (typeof window !== 'undefined' && window.profileUploadUrl) || '';})();", java.util.Arrays.copyOf(new java.lang.Object[]{"\"" + r26.i0.t(r26.i0.t(r26.i0.t(r26.i0.t(token, "\\", "\\\\", false), "\"", "\\\"", false), "\n", "\\n", false), "\r", "\\r", false) + '\"'}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        q10.k kVar2 = q10.k.f359520a;
        java.lang.String bizName = this.f65819i;
        java.lang.String profileToken = this.f65816f;
        boolean z17 = this.f65829v;
        p10.p pVar = new p10.p(this);
        kotlin.jvm.internal.o.g(bizName, "bizName");
        kotlin.jvm.internal.o.g(profileToken, "profileToken");
        com.tencent.mars.xlog.Log.i("MicroMsg.MBProfileUtil", "finishProfile: bizName=" + bizName + ", token=" + profileToken + ", shouldUpload=" + z17);
        ((nq0.p) ((gq0.t) i95.n0.c(gq0.t.class))).bj(cVar2, format, new q10.d(z17, pVar));
    }

    public final void e() {
        android.widget.TextView textView = this.f65820m;
        if (textView != null) {
            textView.setText(this.f65815e ? "Stop Profile" : "Start Profile");
        } else {
            kotlin.jvm.internal.o.o("profileButton");
            throw null;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent ev6) {
        kotlin.jvm.internal.o.g(ev6, "ev");
        int action = ev6.getAction();
        if (action == 0) {
            this.C = ev6.getRawX();
            this.D = ev6.getRawY();
            this.A = ev6.getRawX();
            this.B = ev6.getRawY();
            this.E = false;
        } else if (action == 2) {
            float abs = java.lang.Math.abs(ev6.getRawX() - this.C);
            float abs2 = java.lang.Math.abs(ev6.getRawY() - this.D);
            if (abs > getTouchSlop() || abs2 > getTouchSlop()) {
                this.E = true;
                return true;
            }
        }
        return super.onInterceptTouchEvent(ev6);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent ev6) {
        float f17;
        int right;
        kotlin.jvm.internal.o.g(ev6, "ev");
        int action = ev6.getAction();
        if (action == 0) {
            this.A = ev6.getRawX();
            this.B = ev6.getRawY();
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                float rawX = ev6.getRawX() - this.A;
                float rawY = ev6.getRawY() - this.B;
                setTranslationX(getTranslationX() + rawX);
                setTranslationY(getTranslationY() + rawY);
                this.A = ev6.getRawX();
                this.B = ev6.getRawY();
                return true;
            }
            if (action != 3) {
                return super.onTouchEvent(ev6);
            }
        }
        if (this.E) {
            java.lang.Object parent = getParent();
            android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
            if (view != null) {
                int width = view.getWidth();
                if (getWidth() > 0 && width > 0) {
                    if (((getLeft() + getTranslationX()) + (getRight() + getTranslationX())) / 2 < width / 2.0f) {
                        f17 = 0;
                        right = getLeft();
                    } else {
                        f17 = width - 0;
                        right = getRight();
                    }
                    animate().translationX(f17 - right).setDuration(200L).start();
                }
            }
        }
        this.E = false;
        return true;
    }

    public final void setParentView(android.view.View view) {
        this.f65827t = view;
    }

    public /* synthetic */ MagicDebugPanelView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MagicDebugPanelView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f65814d = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f65816f = "";
        this.f65819i = "";
        this.f65828u = 1000;
        this.f65829v = true;
        this.touchSlop = jz5.h.b(new p10.x(context));
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388661;
        layoutParams.setMargins(a(16.0f), a(16.0f), a(16.0f), a(16.0f));
        setLayoutParams(layoutParams);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(a(12.0f), a(12.0f), a(12.0f), a(12.0f));
        linearLayout.setGravity(17);
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(a(12.0f));
        gradientDrawable.setColor(android.graphics.Color.parseColor("#CC000000"));
        linearLayout.setBackground(gradientDrawable);
        linearLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
        this.f65832y = linearLayout;
        android.widget.TextView textView = new android.widget.TextView(getContext());
        textView.setText("▶");
        textView.setTextColor(-1);
        textView.setTextSize(16.0f);
        textView.setGravity(17);
        textView.setPadding(a(8.0f), a(4.0f), a(8.0f), a(4.0f));
        android.graphics.drawable.GradientDrawable gradientDrawable2 = new android.graphics.drawable.GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(a(8.0f));
        gradientDrawable2.setColor(android.graphics.Color.parseColor("#333333"));
        textView.setBackground(gradientDrawable2);
        textView.setOnClickListener(new p10.m(this));
        this.f65831x = textView;
        android.widget.LinearLayout linearLayout2 = this.f65832y;
        if (linearLayout2 != null) {
            linearLayout2.addView(textView);
            android.widget.LinearLayout linearLayout3 = new android.widget.LinearLayout(getContext());
            linearLayout3.setOrientation(1);
            linearLayout3.setGravity(17);
            linearLayout3.setVisibility(8);
            this.f65833z = linearLayout3;
            android.widget.LinearLayout linearLayout4 = new android.widget.LinearLayout(getContext());
            linearLayout4.setOrientation(0);
            linearLayout4.setGravity(16);
            android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-2, -2);
            layoutParams2.topMargin = a(8.0f);
            layoutParams2.bottomMargin = a(8.0f);
            linearLayout4.setLayoutParams(layoutParams2);
            android.widget.TextView textView2 = new android.widget.TextView(getContext());
            textView2.setText("Upload Profile");
            textView2.setTextColor(-1);
            textView2.setTextSize(12.0f);
            linearLayout4.addView(textView2);
            android.widget.Switch r96 = new android.widget.Switch(getContext());
            r96.setChecked(this.f65829v);
            r96.setTextColor(-1);
            r96.setTextSize(12.0f);
            r96.setTrackTintList(android.content.res.ColorStateList.valueOf(android.graphics.Color.parseColor("#07C160")));
            r96.setThumbTintList(android.content.res.ColorStateList.valueOf(-1));
            r96.setOnCheckedChangeListener(new p10.n(this));
            this.f65825r = r96;
            android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(a(50.0f), a(26.0f));
            layoutParams3.leftMargin = a(8.0f);
            android.widget.Switch r142 = this.f65825r;
            if (r142 != null) {
                r142.setLayoutParams(layoutParams3);
                android.widget.Switch r97 = this.f65825r;
                if (r97 != null) {
                    linearLayout4.addView(r97);
                    android.widget.LinearLayout linearLayout5 = this.f65833z;
                    if (linearLayout5 != null) {
                        linearLayout5.addView(linearLayout4);
                        android.widget.TextView textView3 = new android.widget.TextView(getContext());
                        textView3.setText("Start Profile");
                        textView3.setTextColor(-1);
                        textView3.setTextSize(14.0f);
                        textView3.setGravity(17);
                        android.graphics.drawable.GradientDrawable gradientDrawable3 = new android.graphics.drawable.GradientDrawable();
                        gradientDrawable3.setShape(0);
                        gradientDrawable3.setCornerRadius(a(8.0f));
                        gradientDrawable3.setColor(android.graphics.Color.parseColor("#07C160"));
                        textView3.setBackground(gradientDrawable3);
                        textView3.setOnClickListener(new p10.j(this));
                        this.f65820m = textView3;
                        android.widget.LinearLayout.LayoutParams layoutParams4 = new android.widget.LinearLayout.LayoutParams(a(120.0f), a(36.0f));
                        layoutParams4.bottomMargin = a(8.0f);
                        android.widget.TextView textView4 = this.f65820m;
                        if (textView4 != null) {
                            textView4.setLayoutParams(layoutParams4);
                            android.widget.LinearLayout linearLayout6 = this.f65833z;
                            if (linearLayout6 == null) {
                                kotlin.jvm.internal.o.o("expandedContentLayout");
                                throw null;
                            }
                            android.widget.TextView textView5 = this.f65820m;
                            if (textView5 != null) {
                                linearLayout6.addView(textView5);
                                android.widget.TextView textView6 = new android.widget.TextView(getContext());
                                textView6.setText("Take Heap Snapshot");
                                textView6.setTextColor(-1);
                                textView6.setTextSize(14.0f);
                                textView6.setGravity(17);
                                android.graphics.drawable.GradientDrawable gradientDrawable4 = new android.graphics.drawable.GradientDrawable();
                                gradientDrawable4.setShape(0);
                                gradientDrawable4.setCornerRadius(a(8.0f));
                                gradientDrawable4.setColor(android.graphics.Color.parseColor("#1AAD19"));
                                textView6.setBackground(gradientDrawable4);
                                textView6.setOnClickListener(new p10.i(this));
                                this.f65821n = textView6;
                                android.widget.LinearLayout.LayoutParams layoutParams5 = new android.widget.LinearLayout.LayoutParams(a(120.0f), a(36.0f));
                                layoutParams5.bottomMargin = a(8.0f);
                                android.widget.TextView textView7 = this.f65821n;
                                if (textView7 != null) {
                                    textView7.setLayoutParams(layoutParams5);
                                    android.widget.LinearLayout linearLayout7 = this.f65833z;
                                    if (linearLayout7 == null) {
                                        kotlin.jvm.internal.o.o("expandedContentLayout");
                                        throw null;
                                    }
                                    android.widget.TextView textView8 = this.f65821n;
                                    if (textView8 != null) {
                                        linearLayout7.addView(textView8);
                                        android.widget.TextView textView9 = new android.widget.TextView(getContext());
                                        textView9.setText("Speed: 1000 px/s");
                                        textView9.setTextColor(-1);
                                        textView9.setTextSize(12.0f);
                                        this.f65823p = textView9;
                                        android.widget.LinearLayout.LayoutParams layoutParams6 = new android.widget.LinearLayout.LayoutParams(-2, -2);
                                        layoutParams6.bottomMargin = a(4.0f);
                                        android.widget.TextView textView10 = this.f65823p;
                                        if (textView10 != null) {
                                            textView10.setLayoutParams(layoutParams6);
                                            android.widget.LinearLayout linearLayout8 = this.f65833z;
                                            if (linearLayout8 == null) {
                                                kotlin.jvm.internal.o.o("expandedContentLayout");
                                                throw null;
                                            }
                                            android.widget.TextView textView11 = this.f65823p;
                                            if (textView11 != null) {
                                                linearLayout8.addView(textView11);
                                                android.widget.SeekBar seekBar = new android.widget.SeekBar(getContext());
                                                if (android.os.Build.VERSION.SDK_INT >= 26) {
                                                    seekBar.setMin(100);
                                                    seekBar.setMax(30000);
                                                } else {
                                                    seekBar.setMax(29900);
                                                }
                                                seekBar.setProgress(900);
                                                seekBar.setOnSeekBarChangeListener(new p10.l(100, this));
                                                this.f65824q = seekBar;
                                                android.widget.LinearLayout.LayoutParams layoutParams7 = new android.widget.LinearLayout.LayoutParams(a(120.0f), a(20.0f));
                                                layoutParams7.bottomMargin = a(8.0f);
                                                android.widget.SeekBar seekBar2 = this.f65824q;
                                                if (seekBar2 != null) {
                                                    seekBar2.setLayoutParams(layoutParams7);
                                                    android.widget.LinearLayout linearLayout9 = this.f65833z;
                                                    if (linearLayout9 == null) {
                                                        kotlin.jvm.internal.o.o("expandedContentLayout");
                                                        throw null;
                                                    }
                                                    android.widget.SeekBar seekBar3 = this.f65824q;
                                                    if (seekBar3 != null) {
                                                        linearLayout9.addView(seekBar3);
                                                        android.widget.TextView textView12 = new android.widget.TextView(getContext());
                                                        textView12.setText("Simulate Swipe");
                                                        textView12.setTextColor(-1);
                                                        textView12.setTextSize(14.0f);
                                                        textView12.setGravity(17);
                                                        android.graphics.drawable.GradientDrawable gradientDrawable5 = new android.graphics.drawable.GradientDrawable();
                                                        gradientDrawable5.setShape(0);
                                                        gradientDrawable5.setCornerRadius(a(8.0f));
                                                        gradientDrawable5.setColor(android.graphics.Color.parseColor("#07C160"));
                                                        textView12.setBackground(gradientDrawable5);
                                                        textView12.setOnClickListener(new p10.k(this));
                                                        this.f65822o = textView12;
                                                        android.widget.LinearLayout.LayoutParams layoutParams8 = new android.widget.LinearLayout.LayoutParams(a(120.0f), a(36.0f));
                                                        android.widget.TextView textView13 = this.f65822o;
                                                        if (textView13 != null) {
                                                            textView13.setLayoutParams(layoutParams8);
                                                            android.widget.LinearLayout linearLayout10 = this.f65833z;
                                                            if (linearLayout10 == null) {
                                                                kotlin.jvm.internal.o.o("expandedContentLayout");
                                                                throw null;
                                                            }
                                                            android.widget.TextView textView14 = this.f65822o;
                                                            if (textView14 != null) {
                                                                linearLayout10.addView(textView14);
                                                                android.widget.LinearLayout linearLayout11 = this.f65832y;
                                                                if (linearLayout11 == null) {
                                                                    kotlin.jvm.internal.o.o("rootLayout");
                                                                    throw null;
                                                                }
                                                                android.widget.LinearLayout linearLayout12 = this.f65833z;
                                                                if (linearLayout12 != null) {
                                                                    linearLayout11.addView(linearLayout12);
                                                                    android.view.View view = this.f65832y;
                                                                    if (view != null) {
                                                                        addView(view);
                                                                        setClickable(true);
                                                                        return;
                                                                    } else {
                                                                        kotlin.jvm.internal.o.o("rootLayout");
                                                                        throw null;
                                                                    }
                                                                }
                                                                kotlin.jvm.internal.o.o("expandedContentLayout");
                                                                throw null;
                                                            }
                                                            kotlin.jvm.internal.o.o("swipeButton");
                                                            throw null;
                                                        }
                                                        kotlin.jvm.internal.o.o("swipeButton");
                                                        throw null;
                                                    }
                                                    kotlin.jvm.internal.o.o("swipeSpeedSeekBar");
                                                    throw null;
                                                }
                                                kotlin.jvm.internal.o.o("swipeSpeedSeekBar");
                                                throw null;
                                            }
                                            kotlin.jvm.internal.o.o("swipeSpeedLabel");
                                            throw null;
                                        }
                                        kotlin.jvm.internal.o.o("swipeSpeedLabel");
                                        throw null;
                                    }
                                    kotlin.jvm.internal.o.o("heapSnapshotButton");
                                    throw null;
                                }
                                kotlin.jvm.internal.o.o("heapSnapshotButton");
                                throw null;
                            }
                            kotlin.jvm.internal.o.o("profileButton");
                            throw null;
                        }
                        kotlin.jvm.internal.o.o("profileButton");
                        throw null;
                    }
                    kotlin.jvm.internal.o.o("expandedContentLayout");
                    throw null;
                }
                kotlin.jvm.internal.o.o("uploadSwitch");
                throw null;
            }
            kotlin.jvm.internal.o.o("uploadSwitch");
            throw null;
        }
        kotlin.jvm.internal.o.o("rootLayout");
        throw null;
    }
}
