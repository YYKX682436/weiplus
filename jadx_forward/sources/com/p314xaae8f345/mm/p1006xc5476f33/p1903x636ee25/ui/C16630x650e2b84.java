package com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui;

/* renamed from: com.tencent.mm.plugin.music.ui.LyricView */
/* loaded from: classes10.dex */
public class C16630x650e2b84 extends android.view.View {
    public static final int F = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 16);
    public static final int G = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 10);
    public float A;
    public int B;
    public float C;
    public final int[] D;
    public final int[] E;

    /* renamed from: d, reason: collision with root package name */
    public long f232213d;

    /* renamed from: e, reason: collision with root package name */
    public ll3.g1 f232214e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.GestureDetector f232215f;

    /* renamed from: g, reason: collision with root package name */
    public int f232216g;

    /* renamed from: h, reason: collision with root package name */
    public android.text.TextPaint f232217h;

    /* renamed from: i, reason: collision with root package name */
    public android.text.TextPaint f232218i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.Paint.Align f232219m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f232220n;

    /* renamed from: o, reason: collision with root package name */
    public int f232221o;

    /* renamed from: p, reason: collision with root package name */
    public int f232222p;

    /* renamed from: q, reason: collision with root package name */
    public int f232223q;

    /* renamed from: r, reason: collision with root package name */
    public int f232224r;

    /* renamed from: s, reason: collision with root package name */
    public int f232225s;

    /* renamed from: t, reason: collision with root package name */
    public int f232226t;

    /* renamed from: u, reason: collision with root package name */
    public int f232227u;

    /* renamed from: v, reason: collision with root package name */
    public int f232228v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f232229w;

    /* renamed from: x, reason: collision with root package name */
    public int f232230x;

    /* renamed from: y, reason: collision with root package name */
    public int f232231y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f232232z;

    public C16630x650e2b84(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f232216g = 1;
        this.f232219m = android.graphics.Paint.Align.CENTER;
        this.f232220n = false;
        this.f232221o = 0;
        int i17 = F;
        this.f232222p = i17;
        int i18 = G;
        this.f232223q = i18;
        this.f232226t = -1;
        int i19 = 0 + i17 + i18;
        this.f232227u = i19;
        this.f232228v = i19;
        this.D = new int[2];
        this.E = new int[2];
        a();
    }

    public final void a() {
        setNestedScrollingEnabled(true);
        android.text.TextPaint textPaint = new android.text.TextPaint();
        this.f232217h = textPaint;
        textPaint.setTextSize(this.f232222p);
        this.f232217h.setColor(-1);
        this.f232217h.setAntiAlias(true);
        this.f232217h.setTextAlign(this.f232219m);
        android.text.TextPaint textPaint2 = new android.text.TextPaint();
        this.f232218i = textPaint2;
        textPaint2.setTextSize(this.f232222p);
        this.f232218i.setColor(-1);
        this.f232218i.setAlpha(127);
        this.f232218i.setAntiAlias(true);
        this.f232218i.setTextAlign(this.f232219m);
        android.view.GestureDetector gestureDetector = new android.view.GestureDetector(getContext(), new com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.i(this, null));
        this.f232215f = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
    }

    /* renamed from: getTextSize */
    public float m67230x40077844() {
        return (int) this.f232217h.getTextSize();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        int descent;
        super.onDraw(canvas);
        ll3.g1 g1Var = this.f232214e;
        if (g1Var == null || ((ll3.h1) g1Var).e() <= 2) {
            int i17 = this.f232230x;
            if (i17 > 300) {
                i17 = this.f232227u;
            }
            int descent2 = ((i17 / 2) + this.f232221o) - (((int) (this.f232217h.descent() + this.f232217h.ascent())) / 2);
            if (descent2 >= i17 || descent2 <= 0) {
                return;
            }
            canvas.drawText("", 0.0f, descent2, this.f232217h);
            return;
        }
        if (this.f232230x == 0 || this.f232231y == 0) {
            this.f232230x = getMeasuredHeight();
            this.f232231y = getMeasuredWidth();
        }
        if (this.f232226t < 0) {
            return;
        }
        if (android.graphics.Paint.Align.LEFT == this.f232219m) {
            int i18 = this.f232228v;
            ll3.g1 g1Var2 = this.f232214e;
            if (g1Var2 != null) {
                int e17 = ((ll3.h1) g1Var2).e();
                int i19 = this.f232226t;
                if (e17 > i19) {
                    int i27 = this.f232221o;
                    this.f232227u = this.f232222p + i27 + this.f232223q;
                    if (!this.f232220n) {
                        int i28 = this.f232230x;
                        int i29 = ((i28 / 2) - i18) + i27;
                        if (i29 < i28 && i29 > 0 && ((ll3.h1) this.f232214e).d(i19) != null) {
                            if (!((ll3.h1) this.f232214e).d(this.f232226t).a()) {
                                canvas.drawText(((ll3.h1) this.f232214e).d(this.f232226t).f400701b, 0.0f, i29, this.f232217h);
                            }
                        }
                        int i37 = this.f232226t;
                        while (true) {
                            i37--;
                            if (i37 < 0) {
                                break;
                            }
                            int i38 = i29 - ((this.f232226t - i37) * this.f232227u);
                            if (i38 > 0 && i38 < this.f232230x && ((ll3.h1) this.f232214e).d(i37) != null && !((ll3.h1) this.f232214e).d(i37).a()) {
                                canvas.drawText(((ll3.h1) this.f232214e).d(i37).f400701b, 0.0f, i38, this.f232218i);
                            }
                        }
                        int i39 = this.f232226t;
                        while (true) {
                            i39++;
                            if (i39 >= ((ll3.h1) this.f232214e).e()) {
                                break;
                            }
                            int i47 = ((i39 - this.f232226t) * this.f232227u) + i29;
                            if (i47 < this.f232230x && i47 > 0 && ((ll3.h1) this.f232214e).d(i39) != null && !((ll3.h1) this.f232214e).d(i39).a()) {
                                canvas.drawText(((ll3.h1) this.f232214e).d(i39).f400701b, 0.0f, i47, this.f232218i);
                            }
                        }
                    } else {
                        ll3.g1 g1Var3 = this.f232214e;
                        if (g1Var3 != null && ((ll3.h1) g1Var3).e() > this.f232226t && (descent = ((this.f232230x / 2) + this.f232221o) - (((int) (this.f232217h.descent() + this.f232217h.ascent())) / 2)) < this.f232230x && descent > 0) {
                            if (((ll3.h1) this.f232214e).d(this.f232226t) != null) {
                                if (!((ll3.h1) this.f232214e).d(this.f232226t).a()) {
                                    canvas.drawText(((ll3.h1) this.f232214e).d(this.f232226t).f400701b, 0.0f, descent, this.f232217h);
                                }
                            }
                        }
                    }
                }
            }
        } else {
            int i48 = this.f232228v;
            ll3.g1 g1Var4 = this.f232214e;
            if (g1Var4 != null) {
                int e18 = ((ll3.h1) g1Var4).e();
                int i49 = this.f232226t;
                if (e18 > i49) {
                    int i57 = this.f232230x;
                    int i58 = ((i57 / 2) - i48) + this.f232221o;
                    if (i58 < i57 && i58 > 0 && ((ll3.h1) this.f232214e).d(i49) != null) {
                        canvas.drawText(((ll3.h1) this.f232214e).d(this.f232226t).f400701b, this.f232231y / 2, i58, this.f232217h);
                    }
                    int i59 = this.f232226t;
                    while (true) {
                        i59--;
                        if (i59 < 0) {
                            break;
                        }
                        int i66 = i58 - ((this.f232226t - i59) * this.f232227u);
                        if (i66 > 0 && i66 < this.f232230x && ((ll3.h1) this.f232214e).d(i59) != null) {
                            canvas.drawText(((ll3.h1) this.f232214e).d(i59).f400701b, this.f232231y / 2, i66, this.f232218i);
                        }
                    }
                    int i67 = this.f232226t;
                    while (true) {
                        i67++;
                        if (i67 >= ((ll3.h1) this.f232214e).e()) {
                            break;
                        }
                        int i68 = ((i67 - this.f232226t) * this.f232227u) + i58;
                        if (i68 < this.f232230x && i68 > 0 && ((ll3.h1) this.f232214e).d(i67) != null) {
                            canvas.drawText(((ll3.h1) this.f232214e).d(i67).f400701b, this.f232231y / 2, i68, this.f232218i);
                        }
                    }
                }
            }
        }
        if (this.f232229w) {
            int i69 = this.f232228v;
            if (i69 != 0) {
                this.f232228v = (int) (i69 * 0.9f);
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        this.f232230x = i18;
        this.f232231y = i17;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.GestureDetector gestureDetector = this.f232215f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/plugin/music/ui/LyricView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0)), "com/tencent/mm/plugin/music/ui/LyricView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        int pointerId = motionEvent.getPointerId(0);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.A = motionEvent.getY();
            motionEvent.getX();
            this.B = this.f232228v;
            this.f232232z = true;
            this.f232229w = false;
            int findPointerIndex = motionEvent.findPointerIndex(pointerId);
            float y17 = findPointerIndex < 0 ? -1.0f : motionEvent.getY(findPointerIndex);
            this.C = y17;
            if (y17 == -1.0f) {
                return false;
            }
            if (2 == this.f232216g) {
                startNestedScroll(2);
            }
        } else if (action == 1) {
            this.f232232z = false;
        } else if (action == 2) {
            motionEvent.getX();
            int y18 = this.B - ((int) (motionEvent.getY() - this.A));
            if (y18 > 0) {
                int i17 = this.f232225s;
                if (y18 > i17) {
                    y18 = i17;
                }
                this.f232228v = y18;
            } else {
                int i18 = -this.f232224r;
                if (y18 < i18) {
                    y18 = i18;
                }
                this.f232228v = y18;
            }
            invalidate();
            if (2 == this.f232216g) {
                int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
                float y19 = findPointerIndex2 < 0 ? -1.0f : motionEvent.getY(findPointerIndex2);
                if (y19 == -1.0f) {
                    return false;
                }
                float f17 = y19 - this.C;
                dispatchNestedPreScroll(0, 0, this.D, this.E);
                dispatchNestedScroll(0, (int) f17, 0, 0, null);
            }
        }
        return true;
    }

    /* renamed from: setCurrentTime */
    public void m67231x9411da24(long j17) {
        int i17;
        if (this.f232213d != j17) {
            this.f232213d = j17;
            ll3.g1 g1Var = this.f232214e;
            if (g1Var == null || ((ll3.h1) g1Var).e() == 0) {
                return;
            }
            int i18 = -1;
            int i19 = 0;
            while (true) {
                int i27 = i19;
                i17 = i18;
                i18 = i27;
                if (i18 >= ((ll3.h1) this.f232214e).e() || ((ll3.h1) this.f232214e).d(i18).f400700a >= j17) {
                    break;
                }
                ((ll3.h1) this.f232214e).d(i18).getClass();
                i19 = i18 + 1;
            }
            if (this.f232232z || i17 == this.f232226t) {
                return;
            }
            this.f232226t = i17;
            int i28 = this.f232227u;
            this.f232224r = i17 * i28;
            this.f232225s = i28 * ((((ll3.h1) this.f232214e).e() - this.f232226t) - 1);
            if (this.f232228v == 0) {
                this.f232228v = -this.f232227u;
            }
            this.f232229w = true;
            invalidate();
        }
    }

    /* renamed from: setLyricColor */
    public void m67232xe1418446(int i17) {
        this.f232217h.setColor(i17);
        this.f232217h.setAlpha(255);
        this.f232218i.setColor(i17);
        this.f232218i.setAlpha(127);
    }

    /* renamed from: setLyricObj */
    public void m67233x12e1de9a(ll3.g1 g1Var) {
        this.f232214e = g1Var;
        invalidate();
    }

    /* renamed from: setMode */
    public void m67234x764d6925(int i17) {
        this.f232216g = i17;
        this.f232220n = 1 == i17;
    }

    /* renamed from: setTextSize */
    public void m67235x3abfd950(float f17) {
        this.f232217h.setTextSize(f17);
        this.f232218i.setTextSize(f17);
    }

    public C16630x650e2b84(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f232216g = 1;
        this.f232219m = android.graphics.Paint.Align.CENTER;
        this.f232220n = false;
        this.f232221o = 0;
        int i18 = F;
        this.f232222p = i18;
        int i19 = G;
        this.f232223q = i19;
        this.f232226t = -1;
        int i27 = 0 + i18 + i19;
        this.f232227u = i27;
        this.f232228v = i27;
        this.D = new int[2];
        this.E = new int[2];
        a();
    }
}
