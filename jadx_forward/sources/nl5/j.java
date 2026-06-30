package nl5;

/* loaded from: classes15.dex */
public final class j extends android.view.View {
    public static final /* synthetic */ int A = 0;

    /* renamed from: d, reason: collision with root package name */
    public final nl5.s0 f419827d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.PopupWindow f419828e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Paint f419829f;

    /* renamed from: g, reason: collision with root package name */
    public final int f419830g;

    /* renamed from: h, reason: collision with root package name */
    public final int f419831h;

    /* renamed from: i, reason: collision with root package name */
    public final int f419832i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.Path f419833m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.Point f419834n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.Point f419835o;

    /* renamed from: p, reason: collision with root package name */
    public android.graphics.Point f419836p;

    /* renamed from: q, reason: collision with root package name */
    public android.graphics.Point f419837q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f419838r;

    /* renamed from: s, reason: collision with root package name */
    public int f419839s;

    /* renamed from: t, reason: collision with root package name */
    public int f419840t;

    /* renamed from: u, reason: collision with root package name */
    public final int[] f419841u;

    /* renamed from: v, reason: collision with root package name */
    public final int[] f419842v;

    /* renamed from: w, reason: collision with root package name */
    public int f419843w;

    /* renamed from: x, reason: collision with root package name */
    public int f419844x;

    /* renamed from: y, reason: collision with root package name */
    public final int f419845y;

    /* renamed from: z, reason: collision with root package name */
    public final int f419846z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(nl5.s0 helper, android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f419827d = helper;
        int i17 = helper.f419904v / 2;
        this.f419830g = i17;
        int i18 = i17 * 2;
        this.f419831h = i18;
        int a17 = com.p314xaae8f345.mm.ui.zk.a(helper.f419889g, 9);
        this.f419832i = a17;
        this.f419833m = new android.graphics.Path();
        this.f419834n = new android.graphics.Point(i17, 0);
        double d17 = 1;
        double d18 = 2;
        double d19 = i17;
        this.f419835o = new android.graphics.Point((int) ((d17 - (java.lang.Math.sqrt(2.0d) / d18)) * d19), (int) ((java.lang.Math.sqrt(2.0d) / d18) * d19));
        this.f419836p = new android.graphics.Point((int) ((d17 + (java.lang.Math.sqrt(2.0d) / d18)) * d19), (int) ((java.lang.Math.sqrt(2.0d) / d18) * d19));
        this.f419837q = new android.graphics.Point(i17, (int) (java.lang.Math.sqrt(2.0d) * d19));
        nl5.i iVar = new nl5.i(this);
        this.f419841u = new int[2];
        this.f419842v = new int[2];
        this.f419845y = 1;
        this.f419846z = 2;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f419829f = paint;
        paint.setColor(helper.f419903u);
        android.widget.PopupWindow popupWindow = new android.widget.PopupWindow(this);
        this.f419828e = popupWindow;
        popupWindow.setClippingEnabled(false);
        popupWindow.setWidth(i18 + (a17 * 2));
        popupWindow.setHeight(i18 + (a17 / 2));
        invalidate();
        setOnClickListener(iVar);
    }

    /* renamed from: setVisible */
    private final void m149738xcd1079b0(boolean z17) {
        android.view.View contentView = this.f419828e.getContentView();
        int i17 = z17 ? 0 : 4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(contentView, arrayList.toArray(), "com/tencent/mm/ui/widget/edittext/InsertHandle", "setVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        contentView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(contentView, "com/tencent/mm/ui/widget/edittext/InsertHandle", "setVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void a(int i17, int i18) {
        this.f419839s = i17;
        this.f419840t = i18;
        com.p314xaae8f345.mm.ui.yk.a("EditHelper.InsertHandle", "showOrUpdate() called with: x = " + i17 + ", y = " + i18, new java.lang.Object[0]);
        android.widget.PopupWindow popupWindow = this.f419828e;
        if (popupWindow.isShowing()) {
            popupWindow.update(i17, i18, -1, -1);
            return;
        }
        nl5.s0 s0Var = this.f419827d;
        popupWindow.showAtLocation(s0Var.f419890h, 0, i17, i18);
        android.widget.TextView textView = s0Var.f419890h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "textView");
        try {
            java.lang.reflect.Field declaredField = android.widget.TextView.class.getDeclaredField("mEditor");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(textView);
            if (obj == null) {
                return;
            }
            java.lang.Class<?> cls = java.lang.Class.forName("android.widget.Editor");
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod("suspendBlink", new java.lang.Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(obj, new java.lang.Object[0]);
                return;
            }
            java.lang.reflect.Field declaredField2 = cls.getDeclaredField("mBlink");
            declaredField2.setAccessible(true);
            java.lang.Object obj2 = declaredField2.get(obj);
            java.lang.Runnable runnable = obj2 instanceof java.lang.Runnable ? (java.lang.Runnable) obj2 : null;
            if (runnable != null) {
                textView.removeCallbacks(runnable);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.mm.ui.yk.b("SelectableEditTextHelper", "suspendBlink err:%s", th6.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b1  */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r5v61 */
    /* JADX WARN: Type inference failed for: r5v62 */
    /* JADX WARN: Type inference failed for: r5v63 */
    /* JADX WARN: Type inference failed for: r5v66 */
    /* JADX WARN: Type inference failed for: r5v67 */
    /* JADX WARN: Type inference failed for: r5v70 */
    /* JADX WARN: Type inference failed for: r5v71 */
    /* JADX WARN: Type inference failed for: r5v77 */
    /* JADX WARN: Type inference failed for: r5v78 */
    /* JADX WARN: Type inference failed for: r5v79 */
    /* JADX WARN: Type inference failed for: r5v81 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.view.MotionEvent r20) {
        /*
            Method dump skipped, instructions count: 834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nl5.j.b(android.view.MotionEvent):void");
    }

    /* renamed from: getExtraX */
    public final int m149739x1842113e() {
        return (this.f419841u[0] - this.f419832i) + this.f419827d.f419890h.getPaddingLeft() + 2;
    }

    /* renamed from: getExtraY */
    public final int m149740x1842113f() {
        int i17 = this.f419841u[1];
        nl5.s0 s0Var = this.f419827d;
        return (i17 + s0Var.f419890h.getPaddingTop()) - s0Var.f419890h.getScrollY();
    }

    /* renamed from: getINSERTION */
    public final int m149741x17290ff9() {
        return 0;
    }

    /* renamed from: getMPath */
    public final android.graphics.Path m149742x74c3807c() {
        return this.f419833m;
    }

    /* renamed from: getMPointR */
    public final android.graphics.Point m149743x52a5bf59() {
        return this.f419837q;
    }

    /* renamed from: getMPointT1 */
    public final android.graphics.Point m149744x2122c36() {
        return this.f419834n;
    }

    /* renamed from: getMPointT2 */
    public final android.graphics.Point m149745x2122c37() {
        return this.f419835o;
    }

    /* renamed from: getMPointT3 */
    public final android.graphics.Point m149746x2122c38() {
        return this.f419836p;
    }

    /* renamed from: getMWindow */
    public final android.widget.PopupWindow m149747x5e453e87() {
        return this.f419828e;
    }

    /* renamed from: getMagnifierHandleTrigger */
    public final int m149748x6b940e08() {
        return 0;
    }

    /* renamed from: getSELECTION_END */
    public final int m149749x8586b3d2() {
        return this.f419846z;
    }

    /* renamed from: getSELECTION_START */
    public final int m149750x3f710999() {
        return this.f419845y;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        super.onDraw(canvas);
        this.f419833m.reset();
        android.graphics.Path path = this.f419833m;
        android.graphics.Point point = this.f419834n;
        path.moveTo(point.x, point.y);
        android.graphics.Path path2 = this.f419833m;
        android.graphics.Point point2 = this.f419835o;
        path2.lineTo(point2.x, point2.y);
        android.graphics.Path path3 = this.f419833m;
        android.graphics.Point point3 = this.f419836p;
        path3.lineTo(point3.x, point3.y);
        android.graphics.Path path4 = this.f419833m;
        android.graphics.Point point4 = this.f419834n;
        path4.lineTo(point4.x, point4.y);
        android.graphics.Path path5 = this.f419833m;
        android.graphics.Paint paint = this.f419829f;
        canvas.drawPath(path5, paint);
        android.graphics.Point point5 = this.f419837q;
        canvas.drawCircle(point5.x, point5.y, this.f419830g, paint);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        if (r1 != 3) goto L51;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nl5.j.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: setMPath */
    public final void m149751x53519af0(android.graphics.Path path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "<set-?>");
        this.f419833m = path;
    }

    /* renamed from: setMPointR */
    public final void m149752xc6170ccd(android.graphics.Point point) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(point, "<set-?>");
        this.f419837q = point;
    }

    /* renamed from: setMPointT1 */
    public final void m149753xfcca8d42(android.graphics.Point point) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(point, "<set-?>");
        this.f419834n = point;
    }

    /* renamed from: setMPointT2 */
    public final void m149754xfcca8d43(android.graphics.Point point) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(point, "<set-?>");
        this.f419835o = point;
    }

    /* renamed from: setMPointT3 */
    public final void m149755xfcca8d44(android.graphics.Point point) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(point, "<set-?>");
        this.f419836p = point;
    }

    /* renamed from: setMoving */
    public final void m149756x189fff50(boolean z17) {
        this.f419838r = z17;
    }
}
