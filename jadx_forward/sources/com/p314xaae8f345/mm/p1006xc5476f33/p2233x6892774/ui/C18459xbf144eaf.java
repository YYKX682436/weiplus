package com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.ui;

/* renamed from: com.tencent.mm.plugin.sport.ui.SportChartView */
/* loaded from: classes13.dex */
public class C18459xbf144eaf extends android.view.View {
    public final float A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public final android.graphics.Typeface f253366J;
    public int K;
    public boolean L;
    public int M;
    public int N;
    public final we4.d P;
    public final int Q;
    public we4.e[] R;
    public android.graphics.Paint S;
    public android.graphics.Path T;
    public android.graphics.Path U;
    public int V;
    public int W;

    /* renamed from: d, reason: collision with root package name */
    public final java.text.SimpleDateFormat f253367d;

    /* renamed from: e, reason: collision with root package name */
    public final java.text.SimpleDateFormat f253368e;

    /* renamed from: f, reason: collision with root package name */
    public final int f253369f;

    /* renamed from: g, reason: collision with root package name */
    public final int f253370g;

    /* renamed from: h, reason: collision with root package name */
    public final int f253371h;

    /* renamed from: i, reason: collision with root package name */
    public int f253372i;

    /* renamed from: l1, reason: collision with root package name */
    public android.view.GestureDetector f253373l1;

    /* renamed from: m, reason: collision with root package name */
    public int f253374m;

    /* renamed from: n, reason: collision with root package name */
    public int f253375n;

    /* renamed from: o, reason: collision with root package name */
    public final int f253376o;

    /* renamed from: p, reason: collision with root package name */
    public final int f253377p;

    /* renamed from: p0, reason: collision with root package name */
    public int f253378p0;

    /* renamed from: p1, reason: collision with root package name */
    public final android.view.GestureDetector.OnGestureListener f253379p1;

    /* renamed from: q, reason: collision with root package name */
    public final int f253380q;

    /* renamed from: r, reason: collision with root package name */
    public final int f253381r;

    /* renamed from: s, reason: collision with root package name */
    public final int f253382s;

    /* renamed from: t, reason: collision with root package name */
    public final int f253383t;

    /* renamed from: u, reason: collision with root package name */
    public final int f253384u;

    /* renamed from: v, reason: collision with root package name */
    public final int f253385v;

    /* renamed from: w, reason: collision with root package name */
    public final int f253386w;

    /* renamed from: x, reason: collision with root package name */
    public final int f253387x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f253388x0;

    /* renamed from: y, reason: collision with root package name */
    public final int f253389y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f253390y0;

    /* renamed from: z, reason: collision with root package name */
    public final float f253391z;

    public C18459xbf144eaf(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f253367d = new java.text.SimpleDateFormat(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jjl));
        this.f253368e = new java.text.SimpleDateFormat("d");
        this.f253369f = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a6t);
        this.f253370g = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a6u);
        this.f253371h = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a6u);
        this.f253372i = Integer.MAX_VALUE;
        this.f253374m = 0;
        this.f253375n = 0;
        this.f253376o = (int) c(1, 2.5f);
        this.f253377p = (int) c(1, 4.0f);
        this.f253380q = (int) c(1, 1.8f);
        this.f253381r = (int) c(1, 1.0f);
        this.f253382s = (int) c(1, 8.0f);
        this.f253383t = (int) c(1, 22.0f);
        this.f253384u = (int) c(1, 67.0f);
        this.f253385v = (int) c(1, 40.0f);
        this.f253386w = (int) c(1, 22.0f);
        c(1, 55.0f);
        this.f253387x = (int) c(1, 35.0f);
        this.f253389y = (int) c(1, 45.0f);
        this.f253391z = (int) c(1, 8.0f);
        this.A = (int) c(1, 8.0f);
        this.B = (int) c(1, 2.0f);
        this.C = (int) c(1, 15.0f);
        this.D = (int) c(1, 33.0f);
        this.E = (int) c(1, 8.0f);
        this.F = (int) c(1, 35.0f);
        this.G = (int) c(1, 10.0f);
        this.H = (int) c(1, 58.0f);
        c(1, 1.0f);
        this.I = 0;
        this.f253366J = android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT_BOLD, 0);
        android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT_BOLD, 1);
        this.K = 0;
        this.M = -1;
        this.N = -1;
        this.P = we4.d.WEEK;
        this.Q = 7;
        this.R = new we4.e[7];
        this.f253379p1 = new we4.c(this);
        d();
    }

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.ui.C18459xbf144eaf c18459xbf144eaf, boolean z17) {
        c18459xbf144eaf.f253372i = Integer.MAX_VALUE;
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        int i17 = c18459xbf144eaf.Q;
        c18459xbf144eaf.R = new we4.e[i17];
        int i18 = 0;
        while (true) {
            we4.e[] eVarArr = c18459xbf144eaf.R;
            if (i18 >= eVarArr.length) {
                break;
            }
            eVarArr[i18] = new we4.e(c18459xbf144eaf, null);
            i18++;
        }
        c18459xbf144eaf.L = true;
        calendar.add(5, -i17);
        for (int i19 = 0; i19 < c18459xbf144eaf.R.length; i19++) {
            calendar.add(5, 1);
            c18459xbf144eaf.R[i19].f526826a = calendar.getTimeInMillis();
            c18459xbf144eaf.R[i19].f526827b = 0;
        }
    }

    public final void b(android.graphics.Canvas canvas, boolean z17) {
        int i17 = 0;
        if (z17) {
            this.U.reset();
            android.graphics.Path path = this.U;
            we4.e eVar = this.R[0];
            path.moveTo(eVar.f526828c, eVar.f526829d);
            int i18 = 0;
            while (true) {
                we4.e[] eVarArr = this.R;
                if (i18 >= eVarArr.length) {
                    android.graphics.Path path2 = this.U;
                    float f17 = eVarArr[eVarArr.length - 1].f526828c;
                    int i19 = this.f253375n;
                    int i27 = this.f253387x;
                    path2.lineTo(f17, (i19 - i27) - 1);
                    android.graphics.Path path3 = this.U;
                    int i28 = this.f253382s;
                    path3.lineTo(i28, (this.f253375n - i27) - 1);
                    this.U.lineTo(i28, this.R[0].f526829d);
                    canvas.drawPath(this.U, this.S);
                    return;
                }
                android.graphics.Path path4 = this.U;
                we4.e eVar2 = eVarArr[i18];
                path4.lineTo(eVar2.f526828c, eVar2.f526829d);
                i18++;
            }
        } else {
            this.U.reset();
            android.graphics.Path path5 = this.U;
            we4.e eVar3 = this.R[0];
            path5.moveTo(eVar3.f526828c, eVar3.f526829d);
            while (true) {
                we4.e[] eVarArr2 = this.R;
                if (i17 >= eVarArr2.length) {
                    return;
                }
                if (i17 <= 0) {
                    e();
                } else if (eVarArr2[i17 - 1].f526829d == this.f253375n - this.f253385v) {
                    this.S.reset();
                    this.S.setPathEffect(new android.graphics.DashPathEffect(new float[]{5.0f, 5.0f}, 0.0f));
                    this.S.setAntiAlias(true);
                    this.S.setStrokeWidth(this.f253380q);
                    this.S.setStyle(android.graphics.Paint.Style.STROKE);
                    this.S.setColor(-1);
                } else {
                    e();
                }
                android.graphics.Path path6 = this.U;
                we4.e eVar4 = this.R[i17];
                path6.lineTo(eVar4.f526828c, eVar4.f526829d);
                canvas.drawPath(this.U, this.S);
                this.U.reset();
                android.graphics.Path path7 = this.U;
                we4.e eVar5 = this.R[i17];
                path7.moveTo(eVar5.f526828c, eVar5.f526829d);
                i17++;
            }
        }
    }

    public float c(int i17, float f17) {
        android.content.Context context = getContext();
        return android.util.TypedValue.applyDimension(i17, f17, (context == null ? android.content.res.Resources.getSystem() : context.getResources()).getDisplayMetrics());
    }

    public final void d() {
        this.S = new android.graphics.Paint();
        this.T = new android.graphics.Path();
        this.U = new android.graphics.Path();
        int i17 = this.Q;
        this.R = new we4.e[i17];
        int i18 = 0;
        while (true) {
            we4.e[] eVarArr = this.R;
            if (i18 >= eVarArr.length) {
                break;
            }
            eVarArr[i18] = new we4.e(this, null);
            i18++;
        }
        for (int i19 = 0; i19 < i17; i19++) {
            if (i19 == i17 - 1) {
                this.R[i19].f526830e = true;
            } else {
                this.R[i19].f526830e = false;
            }
        }
        this.f253373l1 = new android.view.GestureDetector(getContext(), this.f253379p1);
    }

    public final void e() {
        this.S.reset();
        this.S.setAntiAlias(true);
        this.S.setStrokeWidth(this.f253380q);
        this.S.setStyle(android.graphics.Paint.Style.STROKE);
        this.S.setColor(-1);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02dd  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDraw(android.graphics.Canvas r20) {
        /*
            Method dump skipped, instructions count: 1382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.ui.C18459xbf144eaf.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.GestureDetector gestureDetector = this.f253373l1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/plugin/sport/ui/SportChartView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0)), "com/tencent/mm/plugin/sport/ui/SportChartView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        return true;
    }

    /* renamed from: setHasSwitchBtn */
    public void m71372xb8ebfa90(boolean z17) {
        this.f253390y0 = z17;
    }

    /* renamed from: setTodayStep */
    public void m71373xebabc36b(int i17) {
        this.V = i17;
    }

    public C18459xbf144eaf(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f253367d = new java.text.SimpleDateFormat(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jjl));
        this.f253368e = new java.text.SimpleDateFormat("d");
        this.f253369f = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a6t);
        this.f253370g = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a6u);
        this.f253371h = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a6u);
        this.f253372i = Integer.MAX_VALUE;
        this.f253374m = 0;
        this.f253375n = 0;
        this.f253376o = (int) c(1, 2.5f);
        this.f253377p = (int) c(1, 4.0f);
        this.f253380q = (int) c(1, 1.8f);
        this.f253381r = (int) c(1, 1.0f);
        this.f253382s = (int) c(1, 8.0f);
        this.f253383t = (int) c(1, 22.0f);
        this.f253384u = (int) c(1, 67.0f);
        this.f253385v = (int) c(1, 40.0f);
        this.f253386w = (int) c(1, 22.0f);
        c(1, 55.0f);
        this.f253387x = (int) c(1, 35.0f);
        this.f253389y = (int) c(1, 45.0f);
        this.f253391z = (int) c(1, 8.0f);
        this.A = (int) c(1, 8.0f);
        this.B = (int) c(1, 2.0f);
        this.C = (int) c(1, 15.0f);
        this.D = (int) c(1, 33.0f);
        this.E = (int) c(1, 8.0f);
        this.F = (int) c(1, 35.0f);
        this.G = (int) c(1, 10.0f);
        this.H = (int) c(1, 58.0f);
        c(1, 1.0f);
        this.I = 0;
        this.f253366J = android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT_BOLD, 0);
        android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT_BOLD, 1);
        this.K = 0;
        this.M = -1;
        this.N = -1;
        this.P = we4.d.WEEK;
        this.Q = 7;
        this.R = new we4.e[7];
        this.f253379p1 = new we4.c(this);
        d();
    }
}
