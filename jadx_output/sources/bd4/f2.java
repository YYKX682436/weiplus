package bd4;

/* loaded from: classes4.dex */
public final class f2 {
    public static final bd4.j1 F = new bd4.j1(null);
    public static java.lang.ref.WeakReference G;
    public static float H;
    public static float I;

    /* renamed from: J, reason: collision with root package name */
    public static boolean f19319J;
    public int A;
    public float B;
    public rl5.r C;
    public final jz5.g D;
    public final android.view.GestureDetector E;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f19320a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f19321b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f19322c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View.OnCreateContextMenuListener f19323d;

    /* renamed from: e, reason: collision with root package name */
    public final db5.t4 f19324e;

    /* renamed from: f, reason: collision with root package name */
    public final bd4.a f19325f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.u1 f19326g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.a f19327h;

    /* renamed from: i, reason: collision with root package name */
    public wl5.x f19328i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.CharSequence f19329j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f19330k;

    /* renamed from: l, reason: collision with root package name */
    public int f19331l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f19332m;

    /* renamed from: n, reason: collision with root package name */
    public e06.k f19333n;

    /* renamed from: o, reason: collision with root package name */
    public int f19334o;

    /* renamed from: p, reason: collision with root package name */
    public int f19335p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f19336q;

    /* renamed from: r, reason: collision with root package name */
    public float f19337r;

    /* renamed from: s, reason: collision with root package name */
    public float f19338s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f19339t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f19340u;

    /* renamed from: v, reason: collision with root package name */
    public int f19341v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f19342w;

    /* renamed from: x, reason: collision with root package name */
    public int f19343x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f19344y;

    /* renamed from: z, reason: collision with root package name */
    public int f19345z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f2(android.content.Context context, android.view.View contentView, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, android.view.View.OnCreateContextMenuListener onCreateContextMenuListener, db5.t4 t4Var, bd4.a aVar) {
        this(context, contentView, snsInfo, onCreateContextMenuListener, t4Var, aVar, null, 0, null, com.tencent.wcdb.FileUtils.S_IRWXU, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(contentView, "contentView");
    }

    public static /* synthetic */ void H(bd4.f2 f2Var, boolean z17, int i17, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("userSwitchContentState$default", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        f2Var.G(z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("userSwitchContentState$default", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
    }

    public static final /* synthetic */ android.view.View a(bd4.f2 f2Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getContentView$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        android.view.View view = f2Var.f19321b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getContentView$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        return view;
    }

    public static final /* synthetic */ android.content.Context b(bd4.f2 f2Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getContext$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        android.content.Context context = f2Var.f19320a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getContext$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        return context;
    }

    public static final /* synthetic */ boolean c(bd4.f2 f2Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getLongPressing$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        boolean z17 = f2Var.f19344y;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getLongPressing$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        return z17;
    }

    public static final /* synthetic */ java.lang.CharSequence d(bd4.f2 f2Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSelectContent$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        java.lang.CharSequence charSequence = f2Var.f19329j;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSelectContent$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        return charSequence;
    }

    public static final /* synthetic */ java.lang.ref.WeakReference e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSelector$cp", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        java.lang.ref.WeakReference weakReference = G;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSelector$cp", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        return weakReference;
    }

    public static final int f(bd4.f2 f2Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTouchSlop", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        f2Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTouchSlop", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        int intValue = ((java.lang.Number) ((jz5.n) f2Var.f19339t).getValue()).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTouchSlop", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTouchSlop", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        return intValue;
    }

    public static final /* synthetic */ void g(bd4.f2 f2Var, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setLastBubPullType$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        f2Var.f19334o = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setLastBubPullType$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
    }

    public final boolean A(android.view.MotionEvent e17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("selectLinkText", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        kotlin.jvm.internal.o.g(e17, "e");
        if (wl5.y.o(this.f19321b).length() <= 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("selectLinkText", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            return false;
        }
        this.f19321b.getLocationOnScreen(new int[2]);
        int k17 = wl5.y.k(this.f19321b, (int) (e17.getRawX() - r4[0]), (int) (e17.getRawY() - r4[1]));
        java.lang.CharSequence o17 = wl5.y.o(this.f19321b);
        java.lang.String obj = o17.toString();
        android.util.Pair a17 = bd4.i1.f19357a.a(obj, k17, o17 instanceof android.text.Spannable ? (android.text.Spannable) o17 : null);
        if (a17 != null) {
            java.lang.Integer num = (java.lang.Integer) a17.first;
            java.lang.Integer num2 = (java.lang.Integer) a17.second;
            kotlin.jvm.internal.o.d(num2);
            int intValue = num2.intValue();
            kotlin.jvm.internal.o.d(num);
            int intValue2 = num.intValue();
            if ((intValue2 >= 0 && intValue2 < intValue) && num2.intValue() <= obj.length()) {
                p();
                wl5.x xVar = this.f19328i;
                if (xVar != null) {
                    xVar.s(num.intValue(), num2.intValue());
                }
                h(num2.intValue());
                this.f19335p = 2;
                D();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("selectLinkText", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                return true;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("selectLinkText", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        return false;
    }

    public final boolean B(android.view.MotionEvent e17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("selectPartText", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        kotlin.jvm.internal.o.g(e17, "e");
        boolean z17 = false;
        if (wl5.y.o(this.f19321b).length() <= 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("selectPartText", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            return false;
        }
        this.f19321b.getLocationOnScreen(new int[2]);
        int k17 = wl5.y.k(this.f19321b, (int) (e17.getRawX() - r2[0]), (int) (e17.getRawY() - r2[1]));
        java.lang.String obj = wl5.y.o(this.f19321b).toString();
        android.util.Pair d17 = bd4.i1.d(bd4.i1.f19357a, obj, k17, this.f19330k, this.f19331l, null, 16, null);
        if (d17 != null) {
            java.lang.Integer num = (java.lang.Integer) d17.first;
            java.lang.Integer num2 = (java.lang.Integer) d17.second;
            kotlin.jvm.internal.o.d(num2);
            int intValue = num2.intValue();
            kotlin.jvm.internal.o.d(num);
            int intValue2 = num.intValue();
            if ((intValue2 >= 0 && intValue2 < intValue) && num2.intValue() <= obj.length()) {
                wl5.x xVar = this.f19328i;
                android.util.Pair e18 = xVar != null ? xVar.e() : null;
                boolean z18 = e18 != null && kotlin.jvm.internal.o.b(e18.first, num) && kotlin.jvm.internal.o.b(e18.second, num2);
                this.f19335p = 3;
                if (z18) {
                    wl5.x xVar2 = this.f19328i;
                    if (xVar2 != null && xVar2.M) {
                        z17 = true;
                    }
                    if (z17) {
                        D();
                    }
                } else {
                    p();
                    wl5.x xVar3 = this.f19328i;
                    if (xVar3 != null) {
                        xVar3.s(num.intValue(), num2.intValue());
                    }
                    h(num2.intValue());
                    D();
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("selectPartText", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        return true;
    }

    public final void C(boolean z17, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCollapsedState", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        boolean z18 = this.f19330k;
        this.f19330k = z17;
        this.f19331l = i17;
        this.f19329j.length();
        if (this.f19329j.length() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCollapsedState", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            return;
        }
        if (!z18 || z17) {
            if (!z18 && z17) {
                H(this, false, 1, null);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCollapsedState", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("restoreLogicalSelectionIfNeeded", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        wl5.x xVar = this.f19328i;
        if (xVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("restoreLogicalSelectionIfNeeded", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        } else {
            e06.k kVar = this.f19333n;
            if (kVar == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("restoreLogicalSelectionIfNeeded", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            } else {
                android.util.Pair e17 = xVar.e();
                java.lang.Integer num = (java.lang.Integer) e17.first;
                int i18 = kVar.f246209d;
                boolean z19 = num != null && num.intValue() == i18;
                int i19 = kVar.f246210e;
                if (z19) {
                    java.lang.Integer num2 = (java.lang.Integer) e17.second;
                    int i27 = i19 + 1;
                    if (num2 != null && num2.intValue() == i27) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("restoreLogicalSelectionIfNeeded", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                    }
                }
                this.f19332m = true;
                try {
                    xVar.s(i18, i19 + 1);
                } finally {
                    this.f19332m = false;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("restoreLogicalSelectionIfNeeded", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                }
            }
        }
        H(this, false, 1, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCollapsedState", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
    }

    public final void D() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showMenuAndCursor", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        if (this.f19329j.length() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showMenuAndCursor", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showMenuAndCursor called, canShowLeft=");
        sb6.append(i(true));
        sb6.append(" canShowRight=");
        sb6.append(i(false));
        sb6.append(" selectedIndex=");
        wl5.x xVar = this.f19328i;
        sb6.append(xVar != null ? xVar.e() : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.SnsSelectableTextHelper", sb6.toString());
        E();
        wl5.x xVar2 = this.f19328i;
        if (xVar2 != null) {
            xVar2.N = false;
        }
        if (xVar2 != null) {
            xVar2.o();
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("showMenuAndCursor done, isCursorHide=");
        wl5.x xVar3 = this.f19328i;
        sb7.append(xVar3 != null ? java.lang.Boolean.valueOf(xVar3.N) : null);
        sb7.append(" isMenuHide=");
        wl5.x xVar4 = this.f19328i;
        sb7.append(xVar4 != null ? java.lang.Boolean.valueOf(xVar4.M) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.SnsSelectableTextHelper", sb7.toString());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showMenuAndCursor", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
    }

    public final void E() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showOperateMenuInternal", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        wl5.x xVar = this.f19328i;
        if (xVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showOperateMenuInternal", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            return;
        }
        rl5.r rVar = this.C;
        if (rVar != null && rVar.d()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showOperateMenuInternal", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("applyMenuPlacement", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        rl5.r rVar2 = this.C;
        if (rVar2 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("applyMenuPlacement", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        } else {
            android.util.Pair e17 = xVar.e();
            java.lang.Integer num = (java.lang.Integer) e17.first;
            java.lang.Integer num2 = (java.lang.Integer) e17.second;
            kotlin.jvm.internal.o.d(num);
            if (num.intValue() >= 0) {
                kotlin.jvm.internal.o.d(num2);
                if (num2.intValue() > num.intValue()) {
                    int intValue = num2.intValue() - 1;
                    int d17 = wl5.y.d(this.f19321b, num.intValue());
                    int d18 = wl5.y.d(this.f19321b, intValue);
                    int i17 = wl5.y.i(this.f19321b, d17);
                    int c17 = wl5.y.c(this.f19321b, d18);
                    int[] iArr = new int[2];
                    this.f19321b.getLocationOnScreen(iArr);
                    int i18 = iArr[1] + i17;
                    android.content.Context context = this.f19320a;
                    int a17 = com.tencent.mm.ui.bl.a(context);
                    int a18 = i65.a.a(context, 80.0f);
                    int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.u_);
                    if (i18 - a17 < a18) {
                        rVar2.V = true;
                        xVar.S = ((c17 - i17) - this.f19321b.getHeight()) - dimensionPixelSize;
                    } else {
                        rVar2.V = false;
                        xVar.S = this.f19343x;
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("applyMenuPlacement", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("applyMenuPlacement", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        }
        boolean z17 = xVar.M;
        xVar.M = false;
        xVar.q();
        if (z17) {
            ta4.y0 y0Var = ta4.y0.f416863a;
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f19322c;
            java.lang.String localid = snsInfo != null ? snsInfo.getLocalid() : null;
            if (localid == null) {
                localid = "";
            }
            ta4.y0.e(y0Var, 14, localid, 1, null, y0Var.a(this.f19334o, this.f19335p), 8, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showOperateMenuInternal", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
    }

    public final void F(android.view.View newTextView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.mm.plugin.appbrand.jsapi.coverview.p0.NAME, "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        kotlin.jvm.internal.o.g(newTextView, "newTextView");
        wl5.x xVar = this.f19328i;
        if (xVar != null) {
            android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = xVar.G;
            android.view.ViewTreeObserver.OnPreDrawListener onPreDrawListener = xVar.F;
            android.view.ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = xVar.E;
            android.view.View.OnAttachStateChangeListener onAttachStateChangeListener = xVar.D;
            java.util.Objects.toString(xVar.f447165j);
            newTextView.toString();
            try {
                xVar.f447165j.removeCallbacks(xVar.U);
                xVar.f447165j.removeCallbacks(xVar.V);
                xVar.f447165j.getViewTreeObserver().removeOnScrollChangedListener(onScrollChangedListener);
                xVar.f447165j.getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
                xVar.f447165j.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
                xVar.f447165j.removeOnAttachStateChangeListener(onAttachStateChangeListener);
                xVar.f447165j.setOnTouchListener(null);
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.ui.yk.f("SelectableTextHelper", "updateTextView: detach old listeners err: %s", th6);
            }
            xVar.f447165j = newTextView;
            xVar.f447164i = newTextView.getContext();
            xVar.B = wl5.y.e(xVar.f447165j);
            xVar.f447181z = (int) wl5.y.p(xVar.f447165j);
            try {
                xVar.f447165j.addOnAttachStateChangeListener(onAttachStateChangeListener);
                xVar.f447165j.getViewTreeObserver().addOnPreDrawListener(onPreDrawListener);
                xVar.f447165j.getViewTreeObserver().addOnScrollChangedListener(onScrollChangedListener);
                xVar.f447165j.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
                xVar.f447165j.setOnTouchListener(xVar.H);
            } catch (java.lang.Throwable th7) {
                com.tencent.mm.ui.yk.f("SelectableTextHelper", "updateTextView: attach new listeners err: %s", th7);
            }
        }
        this.f19321b = newTextView;
        newTextView.setOnClickListener(null);
        this.f19321b.setOnLongClickListener(null);
        wl5.x xVar2 = this.f19328i;
        if (xVar2 != null) {
            xVar2.f447165j.getViewTreeObserver().removeOnPreDrawListener(xVar2.F);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.SnsSelectableTextHelper", "updateTextView done:");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.mm.plugin.appbrand.jsapi.coverview.p0.NAME, "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
    }

    public final void G(boolean z17) {
        wl5.x xVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("userSwitchContentState", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        if (this.f19329j.length() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("userSwitchContentState", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            return;
        }
        if (z17 && (xVar = this.f19328i) != null) {
            xVar.L = true;
        }
        android.view.View view = this.f19321b;
        view.getViewTreeObserver().addOnPreDrawListener(new bd4.d2(view, this, z17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("userSwitchContentState", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
    }

    public final void h(int i17) {
        wl5.x xVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("applyCollapsedCursorVisibility", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        if (!this.f19330k) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("applyCollapsedCursorVisibility", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            return;
        }
        int i18 = i17 - 1;
        boolean z17 = false;
        if (i18 < 0) {
            i18 = 0;
        }
        if (s(i18) && (xVar = this.f19328i) != null) {
            android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) xVar.f447164i.getSystemService("accessibility");
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                z17 = true;
            }
            if (!z17) {
                if (xVar.f447155a == null) {
                    xVar.j();
                }
                xVar.p(xVar.f447155a);
                wl5.q qVar = xVar.f447157b;
                if (qVar != null) {
                    qVar.f447130d.dismiss();
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("applyCollapsedCursorVisibility", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
    }

    public final boolean i(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("canShowCursorHandle", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        wl5.x xVar = this.f19328i;
        android.util.Pair e17 = xVar != null ? xVar.e() : null;
        if (e17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canShowCursorHandle", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            return false;
        }
        java.lang.Integer num = (java.lang.Integer) e17.first;
        java.lang.Integer num2 = (java.lang.Integer) e17.second;
        kotlin.jvm.internal.o.d(num);
        if (num.intValue() >= 0) {
            kotlin.jvm.internal.o.d(num2);
            if (num2.intValue() > num.intValue()) {
                int intValue = num2.intValue() - 1;
                if (z17) {
                    intValue = num.intValue();
                }
                int[] iArr = new int[2];
                this.f19321b.getLocationOnScreen(iArr);
                int i17 = iArr[1];
                android.content.Context context = this.f19320a;
                int a17 = i65.a.a(context, 18.0f);
                float f17 = wl5.y.l(this.f19321b).getFontMetrics().descent;
                android.view.View view = this.f19321b;
                float b17 = wl5.y.b(view, wl5.y.d(view, intValue)) + f17;
                float f18 = a17 + b17;
                float f19 = i17;
                float f27 = b17 + f19;
                float f28 = f19 + f18;
                com.tencent.mm.ui.ah a18 = com.tencent.mm.ui.bh.a(context);
                int a19 = com.tencent.mm.ui.bl.a(context);
                int c17 = a18.f197136b - com.tencent.mm.ui.bl.c(context);
                if (f27 <= a19 || f28 >= c17) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canShowCursorHandle", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                    return false;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canShowCursorHandle", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                return true;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canShowCursorHandle", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        return false;
    }

    public final wl5.x j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createSelectableTextHelper", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        wl5.x xVar = this.f19328i;
        if (xVar != null) {
            xVar.c();
        }
        bd4.u1 u1Var = new bd4.u1(this);
        android.view.View view = this.f19321b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildInnerMenu", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        rl5.r rVar = new rl5.r(this.f19320a, this.f19321b);
        rVar.C = true;
        rVar.I = true;
        rVar.f397355y = new bd4.l1(this);
        rVar.f397354x = new bd4.m1(this);
        rVar.Q = false;
        rVar.R = false;
        rVar.f397352v = new bd4.o1(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildInnerMenu", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        this.C = rVar;
        wl5.o oVar = new wl5.o(view, rVar, u1Var, null, new bd4.p1(this));
        oVar.f447123g = com.tencent.mm.R.color.f478810hv;
        oVar.f447124h = 18;
        oVar.f447122f = com.tencent.mm.R.color.f478808ht;
        int i17 = this.f19343x;
        com.tencent.mm.ui.yk.a("SelectableTextHelper", "setMenuAdjustY:%s", java.lang.Integer.valueOf(i17));
        oVar.f447126j = i17;
        oVar.f447128l = false;
        oVar.f447129m = false;
        wl5.x xVar2 = new wl5.x(oVar);
        this.f19328i = xVar2;
        xVar2.X = new bd4.q1(this);
        bd4.r1 r1Var = new bd4.r1(this);
        xVar2.Z = r1Var;
        wl5.q qVar = xVar2.f447155a;
        if (qVar != null) {
            qVar.f447147x = r1Var;
        }
        wl5.q qVar2 = xVar2.f447157b;
        if (qVar2 != null) {
            qVar2.f447147x = r1Var;
        }
        xVar2.f447159d = new bd4.s1(this);
        xVar2.f447161f = false;
        xVar2.f447163h = bd4.t1.f19394a;
        this.f19321b.setOnClickListener(null);
        this.f19321b.setOnLongClickListener(null);
        wl5.x xVar3 = this.f19328i;
        if (xVar3 != null) {
            xVar3.f447165j.getViewTreeObserver().removeOnPreDrawListener(xVar3.F);
        }
        wl5.x xVar4 = this.f19328i;
        kotlin.jvm.internal.o.d(xVar4);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createSelectableTextHelper", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        return xVar4;
    }

    public final void k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("destroy", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        java.lang.ref.WeakReference weakReference = G;
        if ((weakReference != null ? (bd4.f2) weakReference.get() : null) == this) {
            G = null;
        }
        this.f19329j = "";
        this.f19333n = null;
        wl5.x xVar = this.f19328i;
        if (xVar != null) {
            xVar.d();
            xVar.N = true;
            xVar.f();
            xVar.M = true;
            xVar.g();
            xVar.h();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("destroy", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
    }

    public final java.lang.String l() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMenuActionContent", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        java.lang.String obj = this.f19329j.toString();
        if (!q()) {
            obj = r26.n0.u0(obj).toString();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMenuActionContent", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        return obj;
    }

    public final wl5.x m() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSelectableTextHelper", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        wl5.x xVar = this.f19328i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSelectableTextHelper", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        return xVar;
    }

    public final void n(android.view.MotionEvent e17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleGlobalClick", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        kotlin.jvm.internal.o.g(e17, "e");
        if (this.f19342w) {
            this.f19342w = false;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleGlobalClick", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            return;
        }
        if (this.f19329j.length() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleGlobalClick", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            return;
        }
        boolean r17 = r(e17.getRawX(), e17.getRawY());
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.SnsSelectableTextHelper", "handleGlobalClick inSelection=" + r17);
        if (z17) {
            wl5.x xVar = this.f19328i;
            if (xVar != null) {
                xVar.M = true;
            }
            if (xVar != null) {
                xVar.g();
            }
            wl5.x xVar2 = this.f19328i;
            if (xVar2 != null) {
                xVar2.h();
            }
        } else if (!r17) {
            x(1);
            k();
        } else {
            if (this.f19340u) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleGlobalClick", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                return;
            }
            D();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleGlobalClick", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
    }

    public final void o(android.view.MotionEvent e17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleGlobalEventDown", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        kotlin.jvm.internal.o.g(e17, "e");
        if (this.f19329j.length() == 0) {
            this.f19336q = false;
        } else {
            this.f19336q = r(e17.getRawX(), e17.getRawY());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleGlobalEventDown", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
    }

    public final void p() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideMenuAndCursor", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        wl5.x xVar = this.f19328i;
        if (xVar != null) {
            xVar.N = true;
        }
        if (xVar != null) {
            xVar.f();
        }
        wl5.x xVar2 = this.f19328i;
        if (xVar2 != null) {
            xVar2.M = true;
        }
        if (xVar2 != null) {
            xVar2.g();
        }
        wl5.x xVar3 = this.f19328i;
        if (xVar3 != null) {
            xVar3.h();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideMenuAndCursor", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
    }

    public final boolean q() {
        java.lang.Integer num;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAllTextSelected", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        wl5.x xVar = this.f19328i;
        android.util.Pair e17 = xVar != null ? xVar.e() : null;
        boolean z17 = false;
        if (e17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAllTextSelected", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTextLength", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        int length = wl5.y.o(this.f19321b).length();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTextLength", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        java.lang.Integer num2 = (java.lang.Integer) e17.first;
        if (num2 != null && num2.intValue() == 0 && (num = (java.lang.Integer) e17.second) != null && num.intValue() == length) {
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAllTextSelected", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        return z17;
    }

    public final boolean r(float f17, float f18) {
        float width;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isClickInSelection", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        if (this.f19329j.length() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isClickInSelection", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            return false;
        }
        wl5.x xVar = this.f19328i;
        android.util.Pair e17 = xVar != null ? xVar.e() : null;
        if (e17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isClickInSelection", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            return false;
        }
        java.lang.Integer num = (java.lang.Integer) e17.first;
        java.lang.Integer num2 = (java.lang.Integer) e17.second;
        kotlin.jvm.internal.o.d(num);
        if (num.intValue() >= 0) {
            kotlin.jvm.internal.o.d(num2);
            if (num2.intValue() > num.intValue()) {
                if (this.f19330k && num.intValue() >= this.f19331l) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isClickInSelection", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                    return false;
                }
                if (this.f19330k) {
                    int intValue = num2.intValue();
                    int i17 = this.f19331l;
                    if (intValue >= i17) {
                        num2 = java.lang.Integer.valueOf(i17);
                    }
                }
                int intValue2 = num2.intValue() - 1;
                this.f19321b.getLocationOnScreen(new int[2]);
                int i18 = (int) (f17 - r7[0]);
                int i19 = (int) (f18 - r7[1]);
                int d17 = wl5.y.d(this.f19321b, num.intValue());
                int d18 = wl5.y.d(this.f19321b, intValue2);
                if (d17 <= d18) {
                    int i27 = d17;
                    while (true) {
                        int i28 = wl5.y.i(this.f19321b, i27);
                        int c17 = wl5.y.c(this.f19321b, i27);
                        float f19 = wl5.y.f(this.f19321b, i27);
                        if (i27 == d17) {
                            f19 = wl5.y.m(this.f19321b, num.intValue());
                        }
                        if (i27 == d18) {
                            width = wl5.y.m(this.f19321b, intValue2 + 1);
                            if (width <= f19) {
                                width = wl5.y.g(this.f19321b, i27);
                            }
                        } else {
                            width = this.f19321b.getWidth();
                        }
                        if (i19 >= i28 && i19 <= c17) {
                            float f27 = i18;
                            if (f27 >= f19 && f27 <= width) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isClickInSelection", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                                return true;
                            }
                        }
                        if (i27 == d18) {
                            break;
                        }
                        i27++;
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isClickInSelection", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                return false;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isClickInSelection", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        return false;
    }

    public final boolean s(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isOffsetCollapsedAway", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        if (!this.f19330k) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isOffsetCollapsedAway", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            return false;
        }
        if (i17 < 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isOffsetCollapsedAway", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            return false;
        }
        try {
            int d17 = wl5.y.d(this.f19321b, i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("currentShrinkShowLineCount", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            yz5.a aVar = this.f19327h;
            int intValue = aVar != null ? ((java.lang.Number) aVar.invoke()).intValue() : 5;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("currentShrinkShowLineCount", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            r3 = d17 >= intValue;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isOffsetCollapsedAway", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            return r3;
        } catch (java.lang.Throwable unused) {
            int i18 = this.f19331l;
            if (i18 > 0 && i17 >= i18) {
                r3 = true;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isOffsetCollapsedAway", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            return r3;
        }
    }

    public final boolean t() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSelectionOutOfVisibleArea", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        boolean z17 = true;
        if (this.f19329j.length() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSelectionOutOfVisibleArea", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            return false;
        }
        wl5.x xVar = this.f19328i;
        android.util.Pair e17 = xVar != null ? xVar.e() : null;
        if (e17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSelectionOutOfVisibleArea", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            return false;
        }
        java.lang.Integer num = (java.lang.Integer) e17.first;
        java.lang.Integer num2 = (java.lang.Integer) e17.second;
        kotlin.jvm.internal.o.d(num);
        if (num.intValue() >= 0) {
            kotlin.jvm.internal.o.d(num2);
            if (num2.intValue() > num.intValue()) {
                int intValue = num2.intValue() - 1;
                int[] iArr = new int[2];
                this.f19321b.getLocationOnScreen(iArr);
                int i17 = iArr[1];
                android.view.View view = this.f19321b;
                int i18 = wl5.y.i(view, wl5.y.d(view, num.intValue()));
                android.view.View view2 = this.f19321b;
                int i19 = i18 + i17;
                int c17 = i17 + wl5.y.c(view2, wl5.y.d(view2, intValue));
                android.content.Context context = this.f19320a;
                com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(context);
                int a18 = com.tencent.mm.ui.bl.a(context);
                int c18 = a17.f197136b - com.tencent.mm.ui.bl.c(context);
                if (c17 >= a18 && i19 <= c18) {
                    z17 = false;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSelectionOutOfVisibleArea", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                return z17;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSelectionOutOfVisibleArea", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        return false;
    }

    public final void u() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onListViewScrollEnd", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        if (this.f19329j.length() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onListViewScrollEnd", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            return;
        }
        int i17 = this.f19341v;
        boolean t17 = t();
        if (t17) {
            k();
        }
        this.f19321b.postDelayed(new bd4.y1(this, i17, t17), 300L);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onListViewScrollEnd", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
    }

    public final void v() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onListViewScrollStart", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        if (this.f19329j.length() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onListViewScrollStart", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            return;
        }
        this.f19341v++;
        this.f19340u = true;
        wl5.x xVar = this.f19328i;
        if (xVar != null) {
            xVar.K = true;
            xVar.i();
        }
        wl5.x xVar2 = this.f19328i;
        if (xVar2 != null) {
            xVar2.N = true;
        }
        if (xVar2 != null) {
            xVar2.L = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onListViewScrollStart", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
    }

    public final void w(int i17) {
        int i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportMenuActionByItemId", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        if (i17 != 0) {
            if (i17 == 1) {
                i18 = 4;
            } else if (i17 != 11) {
                i18 = 12;
                if (i17 == 12 || i17 == 27 || i17 == 29) {
                    i18 = 7;
                } else if (i17 == 38) {
                    i18 = 15;
                } else if (i17 != 34 && i17 != 35) {
                    switch (i17) {
                        case 14:
                        case 15:
                            i18 = 5;
                            break;
                        case 16:
                        case 17:
                            i18 = 10;
                            break;
                        default:
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportMenuActionByItemId", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                            return;
                    }
                }
            }
            x(i18);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportMenuActionByItemId", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        }
        i18 = 2;
        x(i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportMenuActionByItemId", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
    }

    public final void x(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportTextMenuAction", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        ta4.y0 y0Var = ta4.y0.f416863a;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f19322c;
        java.lang.String localid = snsInfo != null ? snsInfo.getLocalid() : null;
        if (localid == null) {
            localid = "";
        }
        java.lang.String str = localid;
        int i18 = this.f19335p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildSnsTextUdfKv$default", "com.tencent.mm.plugin.sns.report.SnsMenuActionReporter");
        java.util.Map a17 = y0Var.a(0, i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildSnsTextUdfKv$default", "com.tencent.mm.plugin.sns.report.SnsMenuActionReporter");
        ta4.y0.e(y0Var, i17, str, 1, null, a17, 8, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportTextMenuAction", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
    }

    public final void y(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("restoreCursorHandleIfAllowed", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        if (this.f19329j.length() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("restoreCursorHandleIfAllowed", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            return;
        }
        if (!z17 && this.f19340u) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Improve.SnsSelectableTextHelper", "restoreCursorHandleIfAllowed skip: list is scrolling");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("restoreCursorHandleIfAllowed", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            return;
        }
        wl5.x xVar = this.f19328i;
        if (xVar != null) {
            xVar.N = false;
        }
        if (xVar != null) {
            xVar.o();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("restoreCursorHandleIfAllowed", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
    }

    public final boolean z() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("selectAllText", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        int length = wl5.y.o(this.f19321b).length();
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.SnsSelectableTextHelper", "selectAllText: textLength=" + length);
        if (length <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Improve.SnsSelectableTextHelper", "selectAllText: abort, textLength <= 0");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("selectAllText", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            return false;
        }
        p();
        wl5.x xVar = this.f19328i;
        boolean z17 = xVar != null ? xVar.L : false;
        if (xVar != null) {
            xVar.L = true;
        }
        if (xVar != null) {
            xVar.s(0, length);
        }
        h(wl5.y.o(this.f19321b).length());
        this.f19335p = 1;
        D();
        this.f19321b.post(new bd4.a2(this, z17));
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.SnsSelectableTextHelper", "selectAllText: done, selectContent=" + ((java.lang.Object) this.f19329j));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("selectAllText", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f2(android.content.Context context, android.view.View contentView, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, android.view.View.OnCreateContextMenuListener onCreateContextMenuListener, db5.t4 t4Var, bd4.a aVar, com.tencent.mm.plugin.sns.ui.u1 u1Var, int i17) {
        this(context, contentView, snsInfo, onCreateContextMenuListener, t4Var, aVar, u1Var, i17, null, 256, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(contentView, "contentView");
    }

    public f2(android.content.Context context, android.view.View contentView, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, android.view.View.OnCreateContextMenuListener onCreateContextMenuListener, db5.t4 t4Var, bd4.a aVar, com.tencent.mm.plugin.sns.ui.u1 u1Var, int i17, yz5.a aVar2, int i18, kotlin.jvm.internal.i iVar) {
        snsInfo = (i18 & 4) != 0 ? null : snsInfo;
        onCreateContextMenuListener = (i18 & 8) != 0 ? null : onCreateContextMenuListener;
        t4Var = (i18 & 16) != 0 ? null : t4Var;
        aVar = (i18 & 32) != 0 ? null : aVar;
        u1Var = (i18 & 64) != 0 ? null : u1Var;
        aVar2 = (i18 & 256) != 0 ? null : aVar2;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(contentView, "contentView");
        this.f19320a = context;
        this.f19321b = contentView;
        this.f19322c = snsInfo;
        this.f19323d = onCreateContextMenuListener;
        this.f19324e = t4Var;
        this.f19325f = aVar;
        this.f19326g = u1Var;
        this.f19327h = aVar2;
        this.f19329j = "";
        this.f19331l = -1;
        this.f19335p = 3;
        this.f19339t = jz5.h.b(new bd4.c2(this));
        this.f19343x = -context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.u_);
        this.B = -1.0f;
        this.D = jz5.h.b(new bd4.x1(this));
        this.E = new android.view.GestureDetector(context, new bd4.v1(this));
    }
}
