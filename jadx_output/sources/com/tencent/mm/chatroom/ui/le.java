package com.tencent.mm.chatroom.ui;

/* loaded from: classes14.dex */
public class le extends android.view.View {

    /* renamed from: l1, reason: collision with root package name */
    public static int f64322l1;

    /* renamed from: p0, reason: collision with root package name */
    public static int f64323p0;

    /* renamed from: p1, reason: collision with root package name */
    public static int f64324p1;

    /* renamed from: x0, reason: collision with root package name */
    public static int f64325x0;

    /* renamed from: y0, reason: collision with root package name */
    public static int f64326y0;
    public final int A;
    public int B;
    public int C;
    public int D;
    public final java.lang.Boolean E;
    public int F;
    public final int G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public final android.text.format.Time f64327J;
    public final java.util.Calendar K;
    public final java.util.Calendar L;
    public final java.lang.Boolean M;
    public final android.content.Context N;
    public int P;
    public final java.text.DateFormatSymbols Q;
    public com.tencent.mm.chatroom.ui.ie R;
    public final com.tencent.mm.chatroom.ui.ke S;
    public java.util.Collection T;
    public int U;
    public int V;
    public final java.util.Map W;

    /* renamed from: d, reason: collision with root package name */
    public final int f64328d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Paint f64329e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Paint f64330f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Paint f64331g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Paint f64332h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Paint f64333i;

    /* renamed from: m, reason: collision with root package name */
    public final int f64334m;

    /* renamed from: n, reason: collision with root package name */
    public final int f64335n;

    /* renamed from: o, reason: collision with root package name */
    public final int f64336o;

    /* renamed from: p, reason: collision with root package name */
    public final int f64337p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.StringBuilder f64338q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f64339r;

    /* renamed from: s, reason: collision with root package name */
    public int f64340s;

    /* renamed from: t, reason: collision with root package name */
    public int f64341t;

    /* renamed from: u, reason: collision with root package name */
    public int f64342u;

    /* renamed from: v, reason: collision with root package name */
    public int f64343v;

    /* renamed from: w, reason: collision with root package name */
    public int f64344w;

    /* renamed from: x, reason: collision with root package name */
    public int f64345x;

    /* renamed from: y, reason: collision with root package name */
    public int f64346y;

    /* renamed from: z, reason: collision with root package name */
    public int f64347z;

    public le(android.content.Context context, android.content.res.TypedArray typedArray) {
        super(context);
        this.f64328d = 80;
        this.f64339r = false;
        this.f64340s = -1;
        this.f64341t = -1;
        this.f64342u = -1;
        this.f64343v = -1;
        this.f64344w = -1;
        this.f64345x = -1;
        this.f64346y = -1;
        this.f64347z = 1;
        this.A = 7;
        this.B = 7;
        this.C = 0;
        this.F = 32;
        this.G = 0;
        this.P = 6;
        this.Q = new java.text.DateFormatSymbols();
        this.S = new com.tencent.mm.chatroom.ui.ke(this);
        this.T = new java.util.ArrayList();
        this.U = Integer.MIN_VALUE;
        this.V = Integer.MIN_VALUE;
        this.W = new java.util.HashMap();
        this.N = context;
        android.content.res.Resources resources = context.getResources();
        this.L = java.util.Calendar.getInstance();
        this.K = java.util.Calendar.getInstance();
        android.text.format.Time time = new android.text.format.Time(android.text.format.Time.getCurrentTimezone());
        this.f64327J = time;
        time.setToNow();
        typedArray.getColor(2, resources.getColor(com.tencent.mm.R.color.a0_));
        typedArray.getColor(5, resources.getColor(com.tencent.mm.R.color.a0_));
        typedArray.getColor(3, resources.getColor(com.tencent.mm.R.color.a0_));
        int color = typedArray.getColor(3, resources.getColor(com.tencent.mm.R.color.a0a));
        this.f64334m = typedArray.getColor(6, resources.getColor(com.tencent.mm.R.color.a0_));
        this.f64335n = typedArray.getColor(7, resources.getColor(com.tencent.mm.R.color.a0_));
        this.f64336o = typedArray.getColor(4, resources.getColor(com.tencent.mm.R.color.f479387y3));
        int color2 = typedArray.getColor(8, resources.getColor(com.tencent.mm.R.color.a3z));
        this.f64337p = color2;
        int color3 = typedArray.getColor(9, resources.getColor(com.tencent.mm.R.color.f479497a40));
        this.E = java.lang.Boolean.valueOf(typedArray.getBoolean(11, false));
        this.f64338q = new java.lang.StringBuilder(50);
        f64325x0 = typedArray.getDimensionPixelSize(18, resources.getDimensionPixelSize(com.tencent.mm.R.dimen.abv));
        f64324p1 = typedArray.getDimensionPixelSize(20, resources.getDimensionPixelSize(com.tencent.mm.R.dimen.abx));
        f64326y0 = typedArray.getDimensionPixelSize(19, resources.getDimensionPixelSize(com.tencent.mm.R.dimen.abw));
        f64322l1 = typedArray.getDimensionPixelOffset(14, resources.getDimensionPixelOffset(com.tencent.mm.R.dimen.a2_));
        f64323p0 = typedArray.getDimensionPixelSize(17, resources.getDimensionPixelOffset(com.tencent.mm.R.dimen.a9m));
        this.F = (typedArray.getDimensionPixelSize(0, resources.getDimensionPixelOffset(com.tencent.mm.R.dimen.f480164q5)) - f64322l1) / 6;
        this.G = typedArray.getDimensionPixelSize(1, resources.getDimensionPixelOffset(com.tencent.mm.R.dimen.f480204rb));
        this.M = java.lang.Boolean.valueOf(typedArray.getBoolean(12, true));
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f64332h = paint;
        paint.setAntiAlias(true);
        this.f64332h.setTextSize(f64324p1);
        this.f64332h.setTypeface(android.graphics.Typeface.create(android.graphics.Typeface.SANS_SERIF, 0));
        this.f64332h.setColor(color);
        this.f64332h.setTextAlign(android.graphics.Paint.Align.LEFT);
        this.f64332h.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f64331g = paint2;
        paint2.setFakeBoldText(true);
        this.f64331g.setAntiAlias(true);
        this.f64331g.setColor(color3);
        this.f64331g.setTextAlign(android.graphics.Paint.Align.CENTER);
        this.f64331g.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.f64333i = paint3;
        paint3.setFakeBoldText(true);
        this.f64333i.setAntiAlias(true);
        this.f64333i.setColor(color2);
        this.f64333i.setTextAlign(android.graphics.Paint.Align.CENTER);
        this.f64333i.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint paint4 = new android.graphics.Paint();
        this.f64329e = paint4;
        paint4.setAntiAlias(true);
        this.f64329e.setTextSize(f64326y0);
        this.f64329e.setColor(color);
        this.f64329e.setTypeface(android.graphics.Typeface.create(android.graphics.Typeface.SANS_SERIF, 0));
        this.f64329e.setStyle(android.graphics.Paint.Style.FILL);
        this.f64329e.setTextAlign(android.graphics.Paint.Align.CENTER);
        this.f64329e.setFakeBoldText(true);
        android.graphics.Paint paint5 = new android.graphics.Paint();
        this.f64330f = paint5;
        paint5.setAntiAlias(true);
        this.f64330f.setTextSize(f64325x0);
        this.f64330f.setStyle(android.graphics.Paint.Style.FILL);
        this.f64330f.setTextAlign(android.graphics.Paint.Align.CENTER);
        this.f64330f.setFakeBoldText(false);
        setAccessibilityDelegate(new com.tencent.mm.chatroom.ui.je(this));
    }

    public static void a(com.tencent.mm.chatroom.ui.le leVar) {
        int i17 = leVar.H;
        int i18 = leVar.f64328d;
        int i19 = ((i17 - (i18 * 2)) / (leVar.A * 2)) + i18;
        int i27 = f64324p1;
        int i28 = i19 - (i27 / 2);
        int i29 = ((f64322l1 - i27) / 2) + i27;
        android.graphics.Rect rect = new android.graphics.Rect();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(leVar.getMonthAndYearString().toLowerCase());
        sb6.setCharAt(0, java.lang.Character.toUpperCase(sb6.charAt(0)));
        leVar.f64332h.getTextBounds(sb6.toString(), 0, sb6.length(), rect);
        rect.set(rect.left - 20, rect.top - 20, rect.right + 20, rect.bottom + 20);
        rect.offset(i28, i29);
        ((java.util.HashMap) leVar.W).put(0, new android.util.Pair(null, rect));
    }

    public static android.view.accessibility.AccessibilityNodeInfo b(com.tencent.mm.chatroom.ui.le leVar, int i17) {
        leVar.getClass();
        android.view.accessibility.AccessibilityNodeInfo obtain = android.view.accessibility.AccessibilityNodeInfo.obtain();
        o3.l lVar = new o3.l(obtain);
        java.util.HashMap hashMap = (java.util.HashMap) leVar.W;
        if (!hashMap.isEmpty()) {
            int[] iArr = new int[2];
            leVar.getLocationOnScreen(iArr);
            if (i17 == -1) {
                java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                java.lang.Object f17 = n3.u0.f(leVar);
                if (f17 instanceof android.view.View) {
                    lVar.f342643b = -1;
                    obtain.setParent((android.view.View) f17);
                }
                leVar.onInitializeAccessibilityNodeInfo(obtain);
                lVar.f342644c = i17;
                obtain.setSource(leVar, i17);
                lVar.n("com.tencent.mm.chatroom.ui.SimpleMonthView");
                java.util.Iterator it = hashMap.keySet().iterator();
                while (it.hasNext()) {
                    lVar.f342642a.addChild(leVar, ((java.lang.Integer) it.next()).intValue());
                }
                return obtain;
            }
            if (i17 == 0) {
                if (hashMap.get(java.lang.Integer.valueOf(i17)) == null) {
                    return obtain;
                }
                lVar.f342643b = -1;
                obtain.setParent(leVar, -1);
                android.graphics.Rect rect = new android.graphics.Rect((android.graphics.Rect) ((android.util.Pair) hashMap.get(java.lang.Integer.valueOf(i17))).second);
                rect.offset(iArr[0], iArr[1]);
                lVar.l(rect);
                lVar.f342644c = i17;
                obtain.setSource(leVar, i17);
                lVar.n("android.view.View");
                obtain.setPackageName(leVar.getContext().getPackageName());
                lVar.p(leVar.getMonthAndYearString());
                lVar.s(true);
                lVar.r(true);
                lVar.q(true);
                obtain.setVisibleToUser(true);
                obtain.setClickable(false);
                obtain.setLongClickable(false);
                lVar.m(false);
                if (leVar.U == 0) {
                    lVar.i(true);
                } else {
                    lVar.i(false);
                }
                lVar.b(o3.f.f342626h);
                lVar.b(o3.f.f342629k);
                lVar.b(o3.f.f342628j);
                return obtain;
            }
            lVar.f342643b = -1;
            obtain.setParent(leVar, -1);
            if (hashMap.containsKey(java.lang.Integer.valueOf(i17))) {
                android.graphics.Rect rect2 = new android.graphics.Rect((android.graphics.Rect) ((android.util.Pair) hashMap.get(java.lang.Integer.valueOf(i17))).second);
                rect2.offset(iArr[0], iArr[1]);
                lVar.l(rect2);
                lVar.f342644c = i17;
                obtain.setSource(leVar, i17);
                kn.a aVar = (kn.a) ((android.util.Pair) hashMap.get(java.lang.Integer.valueOf(i17))).first;
                lVar.n(com.tencent.mm.accessibility.core.provider.TypeModifier.BUTTON_CLASS);
                obtain.setPackageName(leVar.getContext().getPackageName());
                lVar.v("" + aVar.f309371b);
                lVar.s(true);
                lVar.r(true);
                lVar.q(true);
                obtain.setVisibleToUser(true);
                obtain.setClickable(true);
                obtain.setLongClickable(false);
                lVar.m(false);
                if (leVar.U == i17) {
                    lVar.i(true);
                } else {
                    lVar.i(false);
                }
                lVar.b(o3.f.f342625g);
                lVar.b(o3.f.f342626h);
                lVar.b(o3.f.f342629k);
                lVar.b(o3.f.f342628j);
                return obtain;
            }
        }
        return null;
    }

    private java.lang.String getMonthAndYearString() {
        this.f64338q.setLength(0);
        long timeInMillis = this.K.getTimeInMillis();
        return android.text.format.DateUtils.formatDateRange(getContext(), timeInMillis, timeInMillis, 52);
    }

    public final void c(kn.a aVar) {
        if (this.R != null) {
            if (!this.M.booleanValue()) {
                int i17 = aVar.f309372c;
                android.text.format.Time time = this.f64327J;
                if (i17 == time.month && aVar.f309373d == time.year && aVar.f309371b < time.monthDay) {
                    return;
                }
            }
            gn.d dVar = (gn.d) this.R;
            if (aVar != null) {
                dVar.x(aVar);
            } else {
                dVar.getClass();
            }
        }
    }

    public final boolean d(int i17, android.text.format.Time time) {
        int i18 = this.I;
        int i19 = time.year;
        return i18 < i19 || (i18 == i19 && this.D < time.month) || (this.D == time.month && i17 < time.monthDay);
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(android.view.MotionEvent motionEvent) {
        int i17;
        if (com.tencent.mm.accessibility.uitl.AccUtil.INSTANCE.isAccessibilityEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x17 = motionEvent.getX();
                float y17 = motionEvent.getY();
                java.util.Iterator it = ((java.util.HashMap) this.W).entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i17 = Integer.MIN_VALUE;
                        break;
                    }
                    java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                    if (((android.graphics.Rect) ((android.util.Pair) entry.getValue()).second).contains((int) x17, (int) y17)) {
                        i17 = ((java.lang.Integer) entry.getKey()).intValue();
                        break;
                    }
                }
                int i18 = this.V;
                if (i18 != i17) {
                    this.V = i17;
                    if (i17 != Integer.MIN_VALUE) {
                        e(i17, 128);
                    }
                    e(i18, 256);
                }
                return true;
            }
            if (action == 10) {
                int i19 = this.V;
                if (i19 != Integer.MIN_VALUE && i19 != Integer.MIN_VALUE) {
                    this.V = Integer.MIN_VALUE;
                    e(i19, 256);
                }
                return true;
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final boolean e(int i17, int i18) {
        if (i17 == Integer.MIN_VALUE) {
            return false;
        }
        android.view.accessibility.AccessibilityEvent obtain = android.view.accessibility.AccessibilityEvent.obtain(i18);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        obtain.setPackageName(getContext().getPackageName());
        obtain.setSource(this, i17);
        return getParent().requestSendAccessibilityEvent(this, obtain);
    }

    /* JADX WARN: Code restructure failed: missing block: B:211:0x0322, code lost:
    
        if (r16.f64340s != (-1)) goto L210;
     */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0352 A[SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDraw(android.graphics.Canvas r17) {
        /*
            Method dump skipped, instructions count: 858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.chatroom.ui.le.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        setMeasuredDimension(android.view.View.MeasureSpec.getSize(i17), (this.F * this.P) + f64322l1 + this.G);
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        this.H = i17;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            float x17 = motionEvent.getX();
            float y17 = motionEvent.getY();
            int i17 = this.f64328d;
            float f17 = i17;
            if (x17 >= f17) {
                if (x17 <= this.H - i17) {
                    float f18 = f64322l1;
                    if (y17 >= f18) {
                        int i18 = ((int) (y17 - f18)) / this.F;
                        float f19 = x17 - f17;
                        int i19 = this.A;
                        int i27 = (int) ((f19 * i19) / (r4 - i17));
                        int i28 = this.C;
                        int i29 = this.f64347z;
                        if (i28 < i29) {
                            i28 += i19;
                        }
                        int i37 = (i27 - (i28 - i29)) + 1 + (i18 * i19);
                        int i38 = this.D;
                        if (i38 <= 11 && i38 >= 0 && vn.a.a(i38, this.I) >= i37 && i37 >= 1) {
                            kn.a aVar = new kn.a(this.I, this.D, i37);
                            for (kn.a aVar2 : this.T) {
                                if (aVar2.equals(aVar)) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            aVar2 = null;
            if (aVar2 != null) {
                c(aVar2);
            }
        }
        return true;
    }

    public void setMarkDate(java.util.Collection<kn.a> collection) {
        if (collection == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SimpleMonthView", "markDateList is null");
        } else {
            this.T = collection;
            post(new com.tencent.mm.chatroom.ui.ge(this, collection));
        }
    }

    public void setMonthParams(java.util.HashMap<java.lang.String, java.lang.Integer> hashMap) {
        int i17;
        if (!hashMap.containsKey("month") && !hashMap.containsKey("year")) {
            throw new java.security.InvalidParameterException("You must specify month and year for this view");
        }
        setTag(hashMap);
        if (hashMap.containsKey("height")) {
            int intValue = hashMap.get("height").intValue();
            this.F = intValue;
            if (intValue < 10) {
                this.F = 10;
            }
        }
        if (hashMap.containsKey("selected_begin_day")) {
            this.f64340s = hashMap.get("selected_begin_day").intValue();
        }
        if (hashMap.containsKey("selected_last_day")) {
            this.f64341t = hashMap.get("selected_last_day").intValue();
        }
        if (hashMap.containsKey("selected_begin_month")) {
            this.f64342u = hashMap.get("selected_begin_month").intValue();
        }
        if (hashMap.containsKey("selected_last_month")) {
            this.f64343v = hashMap.get("selected_last_month").intValue();
        }
        if (hashMap.containsKey("selected_begin_year")) {
            this.f64344w = hashMap.get("selected_begin_year").intValue();
        }
        if (hashMap.containsKey("selected_last_year")) {
            this.f64345x = hashMap.get("selected_last_year").intValue();
        }
        this.D = hashMap.get("month").intValue();
        this.I = hashMap.get("year").intValue();
        this.f64339r = false;
        this.f64346y = -1;
        int i18 = this.D;
        java.util.Calendar calendar = this.K;
        calendar.set(2, i18);
        calendar.set(1, this.I);
        calendar.set(5, 1);
        this.C = calendar.get(7);
        if (hashMap.containsKey("week_start")) {
            this.f64347z = hashMap.get("week_start").intValue();
        } else {
            calendar.setFirstDayOfWeek(1);
            this.f64347z = calendar.getFirstDayOfWeek();
        }
        this.B = vn.a.a(this.D, this.I);
        int i19 = 0;
        while (true) {
            i17 = this.B;
            if (i19 >= i17) {
                break;
            }
            i19++;
            android.text.format.Time time = this.f64327J;
            if (this.I == time.year && this.D == time.month && i19 == time.monthDay) {
                this.f64339r = true;
                this.f64346y = i19;
            }
            d(i19, time);
        }
        int i27 = this.C;
        int i28 = this.f64347z;
        int i29 = this.A;
        if (i27 < i28) {
            i27 += i29;
        }
        int i37 = (i27 - i28) + i17;
        this.P = (i37 / i29) + (i37 % i29 > 0 ? 1 : 0);
    }

    public void setOnDayClickListener(com.tencent.mm.chatroom.ui.ie ieVar) {
        this.R = ieVar;
    }
}
