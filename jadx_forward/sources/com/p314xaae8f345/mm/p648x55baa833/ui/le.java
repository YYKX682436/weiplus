package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes14.dex */
public class le extends android.view.View {

    /* renamed from: l1, reason: collision with root package name */
    public static int f145855l1;

    /* renamed from: p0, reason: collision with root package name */
    public static int f145856p0;

    /* renamed from: p1, reason: collision with root package name */
    public static int f145857p1;

    /* renamed from: x0, reason: collision with root package name */
    public static int f145858x0;

    /* renamed from: y0, reason: collision with root package name */
    public static int f145859y0;
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
    public final android.text.format.Time f145860J;
    public final java.util.Calendar K;
    public final java.util.Calendar L;
    public final java.lang.Boolean M;
    public final android.content.Context N;
    public int P;
    public final java.text.DateFormatSymbols Q;
    public com.p314xaae8f345.mm.p648x55baa833.ui.ie R;
    public final com.p314xaae8f345.mm.p648x55baa833.ui.ke S;
    public java.util.Collection T;
    public int U;
    public int V;
    public final java.util.Map W;

    /* renamed from: d, reason: collision with root package name */
    public final int f145861d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Paint f145862e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Paint f145863f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Paint f145864g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Paint f145865h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Paint f145866i;

    /* renamed from: m, reason: collision with root package name */
    public final int f145867m;

    /* renamed from: n, reason: collision with root package name */
    public final int f145868n;

    /* renamed from: o, reason: collision with root package name */
    public final int f145869o;

    /* renamed from: p, reason: collision with root package name */
    public final int f145870p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.StringBuilder f145871q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f145872r;

    /* renamed from: s, reason: collision with root package name */
    public int f145873s;

    /* renamed from: t, reason: collision with root package name */
    public int f145874t;

    /* renamed from: u, reason: collision with root package name */
    public int f145875u;

    /* renamed from: v, reason: collision with root package name */
    public int f145876v;

    /* renamed from: w, reason: collision with root package name */
    public int f145877w;

    /* renamed from: x, reason: collision with root package name */
    public int f145878x;

    /* renamed from: y, reason: collision with root package name */
    public int f145879y;

    /* renamed from: z, reason: collision with root package name */
    public int f145880z;

    public le(android.content.Context context, android.content.res.TypedArray typedArray) {
        super(context);
        this.f145861d = 80;
        this.f145872r = false;
        this.f145873s = -1;
        this.f145874t = -1;
        this.f145875u = -1;
        this.f145876v = -1;
        this.f145877w = -1;
        this.f145878x = -1;
        this.f145879y = -1;
        this.f145880z = 1;
        this.A = 7;
        this.B = 7;
        this.C = 0;
        this.F = 32;
        this.G = 0;
        this.P = 6;
        this.Q = new java.text.DateFormatSymbols();
        this.S = new com.p314xaae8f345.mm.p648x55baa833.ui.ke(this);
        this.T = new java.util.ArrayList();
        this.U = Integer.MIN_VALUE;
        this.V = Integer.MIN_VALUE;
        this.W = new java.util.HashMap();
        this.N = context;
        android.content.res.Resources resources = context.getResources();
        this.L = java.util.Calendar.getInstance();
        this.K = java.util.Calendar.getInstance();
        android.text.format.Time time = new android.text.format.Time(android.text.format.Time.getCurrentTimezone());
        this.f145860J = time;
        time.setToNow();
        typedArray.getColor(2, resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0_));
        typedArray.getColor(5, resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0_));
        typedArray.getColor(3, resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0_));
        int color = typedArray.getColor(3, resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0a));
        this.f145867m = typedArray.getColor(6, resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0_));
        this.f145868n = typedArray.getColor(7, resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0_));
        this.f145869o = typedArray.getColor(4, resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560920y3));
        int color2 = typedArray.getColor(8, resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a3z));
        this.f145870p = color2;
        int color3 = typedArray.getColor(9, resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561030a40));
        this.E = java.lang.Boolean.valueOf(typedArray.getBoolean(11, false));
        this.f145871q = new java.lang.StringBuilder(50);
        f145858x0 = typedArray.getDimensionPixelSize(18, resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.abv));
        f145857p1 = typedArray.getDimensionPixelSize(20, resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.abx));
        f145859y0 = typedArray.getDimensionPixelSize(19, resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.abw));
        f145855l1 = typedArray.getDimensionPixelOffset(14, resources.getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.a2_));
        f145856p0 = typedArray.getDimensionPixelSize(17, resources.getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.a9m));
        this.F = (typedArray.getDimensionPixelSize(0, resources.getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561697q5)) - f145855l1) / 6;
        this.G = typedArray.getDimensionPixelSize(1, resources.getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561737rb));
        this.M = java.lang.Boolean.valueOf(typedArray.getBoolean(12, true));
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f145865h = paint;
        paint.setAntiAlias(true);
        this.f145865h.setTextSize(f145857p1);
        this.f145865h.setTypeface(android.graphics.Typeface.create(android.graphics.Typeface.SANS_SERIF, 0));
        this.f145865h.setColor(color);
        this.f145865h.setTextAlign(android.graphics.Paint.Align.LEFT);
        this.f145865h.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f145864g = paint2;
        paint2.setFakeBoldText(true);
        this.f145864g.setAntiAlias(true);
        this.f145864g.setColor(color3);
        this.f145864g.setTextAlign(android.graphics.Paint.Align.CENTER);
        this.f145864g.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.f145866i = paint3;
        paint3.setFakeBoldText(true);
        this.f145866i.setAntiAlias(true);
        this.f145866i.setColor(color2);
        this.f145866i.setTextAlign(android.graphics.Paint.Align.CENTER);
        this.f145866i.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint paint4 = new android.graphics.Paint();
        this.f145862e = paint4;
        paint4.setAntiAlias(true);
        this.f145862e.setTextSize(f145859y0);
        this.f145862e.setColor(color);
        this.f145862e.setTypeface(android.graphics.Typeface.create(android.graphics.Typeface.SANS_SERIF, 0));
        this.f145862e.setStyle(android.graphics.Paint.Style.FILL);
        this.f145862e.setTextAlign(android.graphics.Paint.Align.CENTER);
        this.f145862e.setFakeBoldText(true);
        android.graphics.Paint paint5 = new android.graphics.Paint();
        this.f145863f = paint5;
        paint5.setAntiAlias(true);
        this.f145863f.setTextSize(f145858x0);
        this.f145863f.setStyle(android.graphics.Paint.Style.FILL);
        this.f145863f.setTextAlign(android.graphics.Paint.Align.CENTER);
        this.f145863f.setFakeBoldText(false);
        setAccessibilityDelegate(new com.p314xaae8f345.mm.p648x55baa833.ui.je(this));
    }

    public static void a(com.p314xaae8f345.mm.p648x55baa833.ui.le leVar) {
        int i17 = leVar.H;
        int i18 = leVar.f145861d;
        int i19 = ((i17 - (i18 * 2)) / (leVar.A * 2)) + i18;
        int i27 = f145857p1;
        int i28 = i19 - (i27 / 2);
        int i29 = ((f145855l1 - i27) / 2) + i27;
        android.graphics.Rect rect = new android.graphics.Rect();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(leVar.m43543x17dea73b().toLowerCase());
        sb6.setCharAt(0, java.lang.Character.toUpperCase(sb6.charAt(0)));
        leVar.f145865h.getTextBounds(sb6.toString(), 0, sb6.length(), rect);
        rect.set(rect.left - 20, rect.top - 20, rect.right + 20, rect.bottom + 20);
        rect.offset(i28, i29);
        ((java.util.HashMap) leVar.W).put(0, new android.util.Pair(null, rect));
    }

    public static android.view.accessibility.AccessibilityNodeInfo b(com.p314xaae8f345.mm.p648x55baa833.ui.le leVar, int i17) {
        leVar.getClass();
        android.view.accessibility.AccessibilityNodeInfo obtain = android.view.accessibility.AccessibilityNodeInfo.obtain();
        o3.l lVar = new o3.l(obtain);
        java.util.HashMap hashMap = (java.util.HashMap) leVar.W;
        if (!hashMap.isEmpty()) {
            int[] iArr = new int[2];
            leVar.getLocationOnScreen(iArr);
            if (i17 == -1) {
                java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                java.lang.Object f17 = n3.u0.f(leVar);
                if (f17 instanceof android.view.View) {
                    lVar.f424176b = -1;
                    obtain.setParent((android.view.View) f17);
                }
                leVar.onInitializeAccessibilityNodeInfo(obtain);
                lVar.f424177c = i17;
                obtain.setSource(leVar, i17);
                lVar.n("com.tencent.mm.chatroom.ui.SimpleMonthView");
                java.util.Iterator it = hashMap.keySet().iterator();
                while (it.hasNext()) {
                    lVar.f424175a.addChild(leVar, ((java.lang.Integer) it.next()).intValue());
                }
                return obtain;
            }
            if (i17 == 0) {
                if (hashMap.get(java.lang.Integer.valueOf(i17)) == null) {
                    return obtain;
                }
                lVar.f424176b = -1;
                obtain.setParent(leVar, -1);
                android.graphics.Rect rect = new android.graphics.Rect((android.graphics.Rect) ((android.util.Pair) hashMap.get(java.lang.Integer.valueOf(i17))).second);
                rect.offset(iArr[0], iArr[1]);
                lVar.l(rect);
                lVar.f424177c = i17;
                obtain.setSource(leVar, i17);
                lVar.n("android.view.View");
                obtain.setPackageName(leVar.getContext().getPackageName());
                lVar.p(leVar.m43543x17dea73b());
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
                lVar.b(o3.f.f424159h);
                lVar.b(o3.f.f424162k);
                lVar.b(o3.f.f424161j);
                return obtain;
            }
            lVar.f424176b = -1;
            obtain.setParent(leVar, -1);
            if (hashMap.containsKey(java.lang.Integer.valueOf(i17))) {
                android.graphics.Rect rect2 = new android.graphics.Rect((android.graphics.Rect) ((android.util.Pair) hashMap.get(java.lang.Integer.valueOf(i17))).second);
                rect2.offset(iArr[0], iArr[1]);
                lVar.l(rect2);
                lVar.f424177c = i17;
                obtain.setSource(leVar, i17);
                kn.a aVar = (kn.a) ((android.util.Pair) hashMap.get(java.lang.Integer.valueOf(i17))).first;
                lVar.n(com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4930x24ae7051.f21227xcdc820b);
                obtain.setPackageName(leVar.getContext().getPackageName());
                lVar.v("" + aVar.f390904b);
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
                lVar.b(o3.f.f424158g);
                lVar.b(o3.f.f424159h);
                lVar.b(o3.f.f424162k);
                lVar.b(o3.f.f424161j);
                return obtain;
            }
        }
        return null;
    }

    /* renamed from: getMonthAndYearString */
    private java.lang.String m43543x17dea73b() {
        this.f145871q.setLength(0);
        long timeInMillis = this.K.getTimeInMillis();
        return android.text.format.DateUtils.formatDateRange(getContext(), timeInMillis, timeInMillis, 52);
    }

    public final void c(kn.a aVar) {
        if (this.R != null) {
            if (!this.M.booleanValue()) {
                int i17 = aVar.f390905c;
                android.text.format.Time time = this.f145860J;
                if (i17 == time.month && aVar.f390906d == time.year && aVar.f390904b < time.monthDay) {
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
        if (com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4966x1d004c03.f21354x4fbc8495.m42840x2061f65d()) {
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
    
        if (r16.f145873s != (-1)) goto L210;
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p648x55baa833.ui.le.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        setMeasuredDimension(android.view.View.MeasureSpec.getSize(i17), (this.F * this.P) + f145855l1 + this.G);
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
            int i17 = this.f145861d;
            float f17 = i17;
            if (x17 >= f17) {
                if (x17 <= this.H - i17) {
                    float f18 = f145855l1;
                    if (y17 >= f18) {
                        int i18 = ((int) (y17 - f18)) / this.F;
                        float f19 = x17 - f17;
                        int i19 = this.A;
                        int i27 = (int) ((f19 * i19) / (r4 - i17));
                        int i28 = this.C;
                        int i29 = this.f145880z;
                        if (i28 < i29) {
                            i28 += i19;
                        }
                        int i37 = (i27 - (i28 - i29)) + 1 + (i18 * i19);
                        int i38 = this.D;
                        if (i38 <= 11 && i38 >= 0 && vn.a.a(i38, this.I) >= i37 && i37 >= 1) {
                            kn.a aVar = new kn.a(this.I, this.D, i37);
                            for (kn.a aVar2 : this.T) {
                                if (aVar2.m143721xb2c87fbf(aVar)) {
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

    /* renamed from: setMarkDate */
    public void m43544x853bda9d(java.util.Collection<kn.a> collection) {
        if (collection == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SimpleMonthView", "markDateList is null");
        } else {
            this.T = collection;
            post(new com.p314xaae8f345.mm.p648x55baa833.ui.ge(this, collection));
        }
    }

    /* renamed from: setMonthParams */
    public void m43545x947be264(java.util.HashMap<java.lang.String, java.lang.Integer> hashMap) {
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
            this.f145873s = hashMap.get("selected_begin_day").intValue();
        }
        if (hashMap.containsKey("selected_last_day")) {
            this.f145874t = hashMap.get("selected_last_day").intValue();
        }
        if (hashMap.containsKey("selected_begin_month")) {
            this.f145875u = hashMap.get("selected_begin_month").intValue();
        }
        if (hashMap.containsKey("selected_last_month")) {
            this.f145876v = hashMap.get("selected_last_month").intValue();
        }
        if (hashMap.containsKey("selected_begin_year")) {
            this.f145877w = hashMap.get("selected_begin_year").intValue();
        }
        if (hashMap.containsKey("selected_last_year")) {
            this.f145878x = hashMap.get("selected_last_year").intValue();
        }
        this.D = hashMap.get("month").intValue();
        this.I = hashMap.get("year").intValue();
        this.f145872r = false;
        this.f145879y = -1;
        int i18 = this.D;
        java.util.Calendar calendar = this.K;
        calendar.set(2, i18);
        calendar.set(1, this.I);
        calendar.set(5, 1);
        this.C = calendar.get(7);
        if (hashMap.containsKey("week_start")) {
            this.f145880z = hashMap.get("week_start").intValue();
        } else {
            calendar.setFirstDayOfWeek(1);
            this.f145880z = calendar.getFirstDayOfWeek();
        }
        this.B = vn.a.a(this.D, this.I);
        int i19 = 0;
        while (true) {
            i17 = this.B;
            if (i19 >= i17) {
                break;
            }
            i19++;
            android.text.format.Time time = this.f145860J;
            if (this.I == time.year && this.D == time.month && i19 == time.monthDay) {
                this.f145872r = true;
                this.f145879y = i19;
            }
            d(i19, time);
        }
        int i27 = this.C;
        int i28 = this.f145880z;
        int i29 = this.A;
        if (i27 < i28) {
            i27 += i29;
        }
        int i37 = (i27 - i28) + i17;
        this.P = (i37 / i29) + (i37 % i29 > 0 ? 1 : 0);
    }

    /* renamed from: setOnDayClickListener */
    public void m43546xc99ee821(com.p314xaae8f345.mm.p648x55baa833.ui.ie ieVar) {
        this.R = ieVar;
    }
}
