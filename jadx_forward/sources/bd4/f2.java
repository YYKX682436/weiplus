package bd4;

/* loaded from: classes4.dex */
public final class f2 {
    public static final bd4.j1 F = new bd4.j1(null);
    public static java.lang.ref.WeakReference G;
    public static float H;
    public static float I;

    /* renamed from: J, reason: collision with root package name */
    public static boolean f100852J;
    public int A;
    public float B;
    public rl5.r C;
    public final jz5.g D;
    public final android.view.GestureDetector E;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f100853a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f100854b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f100855c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View.OnCreateContextMenuListener f100856d;

    /* renamed from: e, reason: collision with root package name */
    public final db5.t4 f100857e;

    /* renamed from: f, reason: collision with root package name */
    public final bd4.a f100858f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.u1 f100859g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.a f100860h;

    /* renamed from: i, reason: collision with root package name */
    public wl5.x f100861i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.CharSequence f100862j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f100863k;

    /* renamed from: l, reason: collision with root package name */
    public int f100864l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f100865m;

    /* renamed from: n, reason: collision with root package name */
    public e06.k f100866n;

    /* renamed from: o, reason: collision with root package name */
    public int f100867o;

    /* renamed from: p, reason: collision with root package name */
    public int f100868p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f100869q;

    /* renamed from: r, reason: collision with root package name */
    public float f100870r;

    /* renamed from: s, reason: collision with root package name */
    public float f100871s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f100872t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f100873u;

    /* renamed from: v, reason: collision with root package name */
    public int f100874v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f100875w;

    /* renamed from: x, reason: collision with root package name */
    public int f100876x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f100877y;

    /* renamed from: z, reason: collision with root package name */
    public int f100878z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f2(android.content.Context context, android.view.View contentView, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, android.view.View.OnCreateContextMenuListener onCreateContextMenuListener, db5.t4 t4Var, bd4.a aVar) {
        this(context, contentView, c17933xe8d1b226, onCreateContextMenuListener, t4Var, aVar, null, 0, null, com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentView, "contentView");
    }

    public static /* synthetic */ void H(bd4.f2 f2Var, boolean z17, int i17, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("userSwitchContentState$default", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        f2Var.G(z17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("userSwitchContentState$default", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
    }

    public static final /* synthetic */ android.view.View a(bd4.f2 f2Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getContentView$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        android.view.View view = f2Var.f100854b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getContentView$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        return view;
    }

    public static final /* synthetic */ android.content.Context b(bd4.f2 f2Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getContext$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        android.content.Context context = f2Var.f100853a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getContext$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        return context;
    }

    public static final /* synthetic */ boolean c(bd4.f2 f2Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getLongPressing$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        boolean z17 = f2Var.f100877y;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getLongPressing$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        return z17;
    }

    public static final /* synthetic */ java.lang.CharSequence d(bd4.f2 f2Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getSelectContent$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        java.lang.CharSequence charSequence = f2Var.f100862j;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getSelectContent$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        return charSequence;
    }

    public static final /* synthetic */ java.lang.ref.WeakReference e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getSelector$cp", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        java.lang.ref.WeakReference weakReference = G;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getSelector$cp", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        return weakReference;
    }

    public static final int f(bd4.f2 f2Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getTouchSlop", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        f2Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTouchSlop", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        int intValue = ((java.lang.Number) ((jz5.n) f2Var.f100872t).mo141623x754a37bb()).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTouchSlop", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getTouchSlop", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        return intValue;
    }

    public static final /* synthetic */ void g(bd4.f2 f2Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setLastBubPullType$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        f2Var.f100867o = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setLastBubPullType$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
    }

    public final boolean A(android.view.MotionEvent e17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("selectLinkText", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        if (wl5.y.o(this.f100854b).length() <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("selectLinkText", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            return false;
        }
        this.f100854b.getLocationOnScreen(new int[2]);
        int k17 = wl5.y.k(this.f100854b, (int) (e17.getRawX() - r4[0]), (int) (e17.getRawY() - r4[1]));
        java.lang.CharSequence o17 = wl5.y.o(this.f100854b);
        java.lang.String obj = o17.toString();
        android.util.Pair a17 = bd4.i1.f100890a.a(obj, k17, o17 instanceof android.text.Spannable ? (android.text.Spannable) o17 : null);
        if (a17 != null) {
            java.lang.Integer num = (java.lang.Integer) a17.first;
            java.lang.Integer num2 = (java.lang.Integer) a17.second;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num2);
            int intValue = num2.intValue();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
            int intValue2 = num.intValue();
            if ((intValue2 >= 0 && intValue2 < intValue) && num2.intValue() <= obj.length()) {
                p();
                wl5.x xVar = this.f100861i;
                if (xVar != null) {
                    xVar.s(num.intValue(), num2.intValue());
                }
                h(num2.intValue());
                this.f100868p = 2;
                D();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("selectLinkText", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                return true;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("selectLinkText", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        return false;
    }

    public final boolean B(android.view.MotionEvent e17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("selectPartText", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        boolean z17 = false;
        if (wl5.y.o(this.f100854b).length() <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("selectPartText", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            return false;
        }
        this.f100854b.getLocationOnScreen(new int[2]);
        int k17 = wl5.y.k(this.f100854b, (int) (e17.getRawX() - r2[0]), (int) (e17.getRawY() - r2[1]));
        java.lang.String obj = wl5.y.o(this.f100854b).toString();
        android.util.Pair d17 = bd4.i1.d(bd4.i1.f100890a, obj, k17, this.f100863k, this.f100864l, null, 16, null);
        if (d17 != null) {
            java.lang.Integer num = (java.lang.Integer) d17.first;
            java.lang.Integer num2 = (java.lang.Integer) d17.second;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num2);
            int intValue = num2.intValue();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
            int intValue2 = num.intValue();
            if ((intValue2 >= 0 && intValue2 < intValue) && num2.intValue() <= obj.length()) {
                wl5.x xVar = this.f100861i;
                android.util.Pair e18 = xVar != null ? xVar.e() : null;
                boolean z18 = e18 != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(e18.first, num) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(e18.second, num2);
                this.f100868p = 3;
                if (z18) {
                    wl5.x xVar2 = this.f100861i;
                    if (xVar2 != null && xVar2.M) {
                        z17 = true;
                    }
                    if (z17) {
                        D();
                    }
                } else {
                    p();
                    wl5.x xVar3 = this.f100861i;
                    if (xVar3 != null) {
                        xVar3.s(num.intValue(), num2.intValue());
                    }
                    h(num2.intValue());
                    D();
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("selectPartText", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        return true;
    }

    public final void C(boolean z17, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCollapsedState", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        boolean z18 = this.f100863k;
        this.f100863k = z17;
        this.f100864l = i17;
        this.f100862j.length();
        if (this.f100862j.length() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCollapsedState", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            return;
        }
        if (!z18 || z17) {
            if (!z18 && z17) {
                H(this, false, 1, null);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCollapsedState", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("restoreLogicalSelectionIfNeeded", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        wl5.x xVar = this.f100861i;
        if (xVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("restoreLogicalSelectionIfNeeded", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        } else {
            e06.k kVar = this.f100866n;
            if (kVar == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("restoreLogicalSelectionIfNeeded", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            } else {
                android.util.Pair e17 = xVar.e();
                java.lang.Integer num = (java.lang.Integer) e17.first;
                int i18 = kVar.f327742d;
                boolean z19 = num != null && num.intValue() == i18;
                int i19 = kVar.f327743e;
                if (z19) {
                    java.lang.Integer num2 = (java.lang.Integer) e17.second;
                    int i27 = i19 + 1;
                    if (num2 != null && num2.intValue() == i27) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("restoreLogicalSelectionIfNeeded", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                    }
                }
                this.f100865m = true;
                try {
                    xVar.s(i18, i19 + 1);
                } finally {
                    this.f100865m = false;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("restoreLogicalSelectionIfNeeded", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                }
            }
        }
        H(this, false, 1, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCollapsedState", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
    }

    public final void D() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showMenuAndCursor", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        if (this.f100862j.length() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showMenuAndCursor", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showMenuAndCursor called, canShowLeft=");
        sb6.append(i(true));
        sb6.append(" canShowRight=");
        sb6.append(i(false));
        sb6.append(" selectedIndex=");
        wl5.x xVar = this.f100861i;
        sb6.append(xVar != null ? xVar.e() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.SnsSelectableTextHelper", sb6.toString());
        E();
        wl5.x xVar2 = this.f100861i;
        if (xVar2 != null) {
            xVar2.N = false;
        }
        if (xVar2 != null) {
            xVar2.o();
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("showMenuAndCursor done, isCursorHide=");
        wl5.x xVar3 = this.f100861i;
        sb7.append(xVar3 != null ? java.lang.Boolean.valueOf(xVar3.N) : null);
        sb7.append(" isMenuHide=");
        wl5.x xVar4 = this.f100861i;
        sb7.append(xVar4 != null ? java.lang.Boolean.valueOf(xVar4.M) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.SnsSelectableTextHelper", sb7.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showMenuAndCursor", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
    }

    public final void E() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showOperateMenuInternal", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        wl5.x xVar = this.f100861i;
        if (xVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showOperateMenuInternal", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            return;
        }
        rl5.r rVar = this.C;
        if (rVar != null && rVar.d()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showOperateMenuInternal", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("applyMenuPlacement", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        rl5.r rVar2 = this.C;
        if (rVar2 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("applyMenuPlacement", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        } else {
            android.util.Pair e17 = xVar.e();
            java.lang.Integer num = (java.lang.Integer) e17.first;
            java.lang.Integer num2 = (java.lang.Integer) e17.second;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
            if (num.intValue() >= 0) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num2);
                if (num2.intValue() > num.intValue()) {
                    int intValue = num2.intValue() - 1;
                    int d17 = wl5.y.d(this.f100854b, num.intValue());
                    int d18 = wl5.y.d(this.f100854b, intValue);
                    int i17 = wl5.y.i(this.f100854b, d17);
                    int c17 = wl5.y.c(this.f100854b, d18);
                    int[] iArr = new int[2];
                    this.f100854b.getLocationOnScreen(iArr);
                    int i18 = iArr[1] + i17;
                    android.content.Context context = this.f100853a;
                    int a17 = com.p314xaae8f345.mm.ui.bl.a(context);
                    int a18 = i65.a.a(context, 80.0f);
                    int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.u_);
                    if (i18 - a17 < a18) {
                        rVar2.V = true;
                        xVar.S = ((c17 - i17) - this.f100854b.getHeight()) - dimensionPixelSize;
                    } else {
                        rVar2.V = false;
                        xVar.S = this.f100876x;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("applyMenuPlacement", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("applyMenuPlacement", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        }
        boolean z17 = xVar.M;
        xVar.M = false;
        xVar.q();
        if (z17) {
            ta4.y0 y0Var = ta4.y0.f498396a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f100855c;
            java.lang.String m70363x51f8f990 = c17933xe8d1b226 != null ? c17933xe8d1b226.m70363x51f8f990() : null;
            if (m70363x51f8f990 == null) {
                m70363x51f8f990 = "";
            }
            ta4.y0.e(y0Var, 14, m70363x51f8f990, 1, null, y0Var.a(this.f100867o, this.f100868p), 8, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showOperateMenuInternal", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
    }

    public final void F(android.view.View newTextView) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.p0.f34098x24728b, "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newTextView, "newTextView");
        wl5.x xVar = this.f100861i;
        if (xVar != null) {
            android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = xVar.G;
            android.view.ViewTreeObserver.OnPreDrawListener onPreDrawListener = xVar.F;
            android.view.ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = xVar.E;
            android.view.View.OnAttachStateChangeListener onAttachStateChangeListener = xVar.D;
            java.util.Objects.toString(xVar.f528698j);
            newTextView.toString();
            try {
                xVar.f528698j.removeCallbacks(xVar.U);
                xVar.f528698j.removeCallbacks(xVar.V);
                xVar.f528698j.getViewTreeObserver().removeOnScrollChangedListener(onScrollChangedListener);
                xVar.f528698j.getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
                xVar.f528698j.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
                xVar.f528698j.removeOnAttachStateChangeListener(onAttachStateChangeListener);
                xVar.f528698j.setOnTouchListener(null);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.ui.yk.f("SelectableTextHelper", "updateTextView: detach old listeners err: %s", th6);
            }
            xVar.f528698j = newTextView;
            xVar.f528697i = newTextView.getContext();
            xVar.B = wl5.y.e(xVar.f528698j);
            xVar.f528714z = (int) wl5.y.p(xVar.f528698j);
            try {
                xVar.f528698j.addOnAttachStateChangeListener(onAttachStateChangeListener);
                xVar.f528698j.getViewTreeObserver().addOnPreDrawListener(onPreDrawListener);
                xVar.f528698j.getViewTreeObserver().addOnScrollChangedListener(onScrollChangedListener);
                xVar.f528698j.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
                xVar.f528698j.setOnTouchListener(xVar.H);
            } catch (java.lang.Throwable th7) {
                com.p314xaae8f345.mm.ui.yk.f("SelectableTextHelper", "updateTextView: attach new listeners err: %s", th7);
            }
        }
        this.f100854b = newTextView;
        newTextView.setOnClickListener(null);
        this.f100854b.setOnLongClickListener(null);
        wl5.x xVar2 = this.f100861i;
        if (xVar2 != null) {
            xVar2.f528698j.getViewTreeObserver().removeOnPreDrawListener(xVar2.F);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.SnsSelectableTextHelper", "updateTextView done:");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.p0.f34098x24728b, "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
    }

    public final void G(boolean z17) {
        wl5.x xVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("userSwitchContentState", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        if (this.f100862j.length() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("userSwitchContentState", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            return;
        }
        if (z17 && (xVar = this.f100861i) != null) {
            xVar.L = true;
        }
        android.view.View view = this.f100854b;
        view.getViewTreeObserver().addOnPreDrawListener(new bd4.d2(view, this, z17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("userSwitchContentState", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
    }

    public final void h(int i17) {
        wl5.x xVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("applyCollapsedCursorVisibility", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        if (!this.f100863k) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("applyCollapsedCursorVisibility", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            return;
        }
        int i18 = i17 - 1;
        boolean z17 = false;
        if (i18 < 0) {
            i18 = 0;
        }
        if (s(i18) && (xVar = this.f100861i) != null) {
            android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) xVar.f528697i.getSystemService("accessibility");
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                z17 = true;
            }
            if (!z17) {
                if (xVar.f528688a == null) {
                    xVar.j();
                }
                xVar.p(xVar.f528688a);
                wl5.q qVar = xVar.f528690b;
                if (qVar != null) {
                    qVar.f528663d.dismiss();
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("applyCollapsedCursorVisibility", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
    }

    public final boolean i(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("canShowCursorHandle", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        wl5.x xVar = this.f100861i;
        android.util.Pair e17 = xVar != null ? xVar.e() : null;
        if (e17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canShowCursorHandle", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            return false;
        }
        java.lang.Integer num = (java.lang.Integer) e17.first;
        java.lang.Integer num2 = (java.lang.Integer) e17.second;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
        if (num.intValue() >= 0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num2);
            if (num2.intValue() > num.intValue()) {
                int intValue = num2.intValue() - 1;
                if (z17) {
                    intValue = num.intValue();
                }
                int[] iArr = new int[2];
                this.f100854b.getLocationOnScreen(iArr);
                int i17 = iArr[1];
                android.content.Context context = this.f100853a;
                int a17 = i65.a.a(context, 18.0f);
                float f17 = wl5.y.l(this.f100854b).getFontMetrics().descent;
                android.view.View view = this.f100854b;
                float b17 = wl5.y.b(view, wl5.y.d(view, intValue)) + f17;
                float f18 = a17 + b17;
                float f19 = i17;
                float f27 = b17 + f19;
                float f28 = f19 + f18;
                com.p314xaae8f345.mm.ui.ah a18 = com.p314xaae8f345.mm.ui.bh.a(context);
                int a19 = com.p314xaae8f345.mm.ui.bl.a(context);
                int c17 = a18.f278669b - com.p314xaae8f345.mm.ui.bl.c(context);
                if (f27 <= a19 || f28 >= c17) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canShowCursorHandle", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                    return false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canShowCursorHandle", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                return true;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canShowCursorHandle", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        return false;
    }

    public final wl5.x j() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createSelectableTextHelper", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        wl5.x xVar = this.f100861i;
        if (xVar != null) {
            xVar.c();
        }
        bd4.u1 u1Var = new bd4.u1(this);
        android.view.View view = this.f100854b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildInnerMenu", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        rl5.r rVar = new rl5.r(this.f100853a, this.f100854b);
        rVar.C = true;
        rVar.I = true;
        rVar.f478888y = new bd4.l1(this);
        rVar.f478887x = new bd4.m1(this);
        rVar.Q = false;
        rVar.R = false;
        rVar.f478885v = new bd4.o1(this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildInnerMenu", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        this.C = rVar;
        wl5.o oVar = new wl5.o(view, rVar, u1Var, null, new bd4.p1(this));
        oVar.f528656g = com.p314xaae8f345.mm.R.C30859x5a72f63.f560343hv;
        oVar.f528657h = 18;
        oVar.f528655f = com.p314xaae8f345.mm.R.C30859x5a72f63.f560341ht;
        int i17 = this.f100876x;
        com.p314xaae8f345.mm.ui.yk.a("SelectableTextHelper", "setMenuAdjustY:%s", java.lang.Integer.valueOf(i17));
        oVar.f528659j = i17;
        oVar.f528661l = false;
        oVar.f528662m = false;
        wl5.x xVar2 = new wl5.x(oVar);
        this.f100861i = xVar2;
        xVar2.X = new bd4.q1(this);
        bd4.r1 r1Var = new bd4.r1(this);
        xVar2.Z = r1Var;
        wl5.q qVar = xVar2.f528688a;
        if (qVar != null) {
            qVar.f528680x = r1Var;
        }
        wl5.q qVar2 = xVar2.f528690b;
        if (qVar2 != null) {
            qVar2.f528680x = r1Var;
        }
        xVar2.f528692d = new bd4.s1(this);
        xVar2.f528694f = false;
        xVar2.f528696h = bd4.t1.f100927a;
        this.f100854b.setOnClickListener(null);
        this.f100854b.setOnLongClickListener(null);
        wl5.x xVar3 = this.f100861i;
        if (xVar3 != null) {
            xVar3.f528698j.getViewTreeObserver().removeOnPreDrawListener(xVar3.F);
        }
        wl5.x xVar4 = this.f100861i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(xVar4);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createSelectableTextHelper", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        return xVar4;
    }

    public final void k() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("destroy", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        java.lang.ref.WeakReference weakReference = G;
        if ((weakReference != null ? (bd4.f2) weakReference.get() : null) == this) {
            G = null;
        }
        this.f100862j = "";
        this.f100866n = null;
        wl5.x xVar = this.f100861i;
        if (xVar != null) {
            xVar.d();
            xVar.N = true;
            xVar.f();
            xVar.M = true;
            xVar.g();
            xVar.h();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("destroy", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
    }

    public final java.lang.String l() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMenuActionContent", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        java.lang.String obj = this.f100862j.toString();
        if (!q()) {
            obj = r26.n0.u0(obj).toString();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMenuActionContent", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        return obj;
    }

    public final wl5.x m() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSelectableTextHelper", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        wl5.x xVar = this.f100861i;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSelectableTextHelper", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        return xVar;
    }

    public final void n(android.view.MotionEvent e17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleGlobalClick", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        if (this.f100875w) {
            this.f100875w = false;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleGlobalClick", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            return;
        }
        if (this.f100862j.length() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleGlobalClick", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            return;
        }
        boolean r17 = r(e17.getRawX(), e17.getRawY());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.SnsSelectableTextHelper", "handleGlobalClick inSelection=" + r17);
        if (z17) {
            wl5.x xVar = this.f100861i;
            if (xVar != null) {
                xVar.M = true;
            }
            if (xVar != null) {
                xVar.g();
            }
            wl5.x xVar2 = this.f100861i;
            if (xVar2 != null) {
                xVar2.h();
            }
        } else if (!r17) {
            x(1);
            k();
        } else {
            if (this.f100873u) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleGlobalClick", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                return;
            }
            D();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleGlobalClick", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
    }

    public final void o(android.view.MotionEvent e17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleGlobalEventDown", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        if (this.f100862j.length() == 0) {
            this.f100869q = false;
        } else {
            this.f100869q = r(e17.getRawX(), e17.getRawY());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleGlobalEventDown", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
    }

    public final void p() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hideMenuAndCursor", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        wl5.x xVar = this.f100861i;
        if (xVar != null) {
            xVar.N = true;
        }
        if (xVar != null) {
            xVar.f();
        }
        wl5.x xVar2 = this.f100861i;
        if (xVar2 != null) {
            xVar2.M = true;
        }
        if (xVar2 != null) {
            xVar2.g();
        }
        wl5.x xVar3 = this.f100861i;
        if (xVar3 != null) {
            xVar3.h();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hideMenuAndCursor", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
    }

    public final boolean q() {
        java.lang.Integer num;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isAllTextSelected", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        wl5.x xVar = this.f100861i;
        android.util.Pair e17 = xVar != null ? xVar.e() : null;
        boolean z17 = false;
        if (e17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAllTextSelected", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTextLength", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        int length = wl5.y.o(this.f100854b).length();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTextLength", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        java.lang.Integer num2 = (java.lang.Integer) e17.first;
        if (num2 != null && num2.intValue() == 0 && (num = (java.lang.Integer) e17.second) != null && num.intValue() == length) {
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAllTextSelected", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        return z17;
    }

    public final boolean r(float f17, float f18) {
        float width;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isClickInSelection", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        if (this.f100862j.length() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isClickInSelection", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            return false;
        }
        wl5.x xVar = this.f100861i;
        android.util.Pair e17 = xVar != null ? xVar.e() : null;
        if (e17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isClickInSelection", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            return false;
        }
        java.lang.Integer num = (java.lang.Integer) e17.first;
        java.lang.Integer num2 = (java.lang.Integer) e17.second;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
        if (num.intValue() >= 0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num2);
            if (num2.intValue() > num.intValue()) {
                if (this.f100863k && num.intValue() >= this.f100864l) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isClickInSelection", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                    return false;
                }
                if (this.f100863k) {
                    int intValue = num2.intValue();
                    int i17 = this.f100864l;
                    if (intValue >= i17) {
                        num2 = java.lang.Integer.valueOf(i17);
                    }
                }
                int intValue2 = num2.intValue() - 1;
                this.f100854b.getLocationOnScreen(new int[2]);
                int i18 = (int) (f17 - r7[0]);
                int i19 = (int) (f18 - r7[1]);
                int d17 = wl5.y.d(this.f100854b, num.intValue());
                int d18 = wl5.y.d(this.f100854b, intValue2);
                if (d17 <= d18) {
                    int i27 = d17;
                    while (true) {
                        int i28 = wl5.y.i(this.f100854b, i27);
                        int c17 = wl5.y.c(this.f100854b, i27);
                        float f19 = wl5.y.f(this.f100854b, i27);
                        if (i27 == d17) {
                            f19 = wl5.y.m(this.f100854b, num.intValue());
                        }
                        if (i27 == d18) {
                            width = wl5.y.m(this.f100854b, intValue2 + 1);
                            if (width <= f19) {
                                width = wl5.y.g(this.f100854b, i27);
                            }
                        } else {
                            width = this.f100854b.getWidth();
                        }
                        if (i19 >= i28 && i19 <= c17) {
                            float f27 = i18;
                            if (f27 >= f19 && f27 <= width) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isClickInSelection", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                                return true;
                            }
                        }
                        if (i27 == d18) {
                            break;
                        }
                        i27++;
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isClickInSelection", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                return false;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isClickInSelection", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        return false;
    }

    public final boolean s(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isOffsetCollapsedAway", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        if (!this.f100863k) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isOffsetCollapsedAway", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            return false;
        }
        if (i17 < 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isOffsetCollapsedAway", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            return false;
        }
        try {
            int d17 = wl5.y.d(this.f100854b, i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("currentShrinkShowLineCount", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            yz5.a aVar = this.f100860h;
            int intValue = aVar != null ? ((java.lang.Number) aVar.mo152xb9724478()).intValue() : 5;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("currentShrinkShowLineCount", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            r3 = d17 >= intValue;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isOffsetCollapsedAway", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            return r3;
        } catch (java.lang.Throwable unused) {
            int i18 = this.f100864l;
            if (i18 > 0 && i17 >= i18) {
                r3 = true;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isOffsetCollapsedAway", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            return r3;
        }
    }

    public final boolean t() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSelectionOutOfVisibleArea", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        boolean z17 = true;
        if (this.f100862j.length() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSelectionOutOfVisibleArea", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            return false;
        }
        wl5.x xVar = this.f100861i;
        android.util.Pair e17 = xVar != null ? xVar.e() : null;
        if (e17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSelectionOutOfVisibleArea", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            return false;
        }
        java.lang.Integer num = (java.lang.Integer) e17.first;
        java.lang.Integer num2 = (java.lang.Integer) e17.second;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
        if (num.intValue() >= 0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num2);
            if (num2.intValue() > num.intValue()) {
                int intValue = num2.intValue() - 1;
                int[] iArr = new int[2];
                this.f100854b.getLocationOnScreen(iArr);
                int i17 = iArr[1];
                android.view.View view = this.f100854b;
                int i18 = wl5.y.i(view, wl5.y.d(view, num.intValue()));
                android.view.View view2 = this.f100854b;
                int i19 = i18 + i17;
                int c17 = i17 + wl5.y.c(view2, wl5.y.d(view2, intValue));
                android.content.Context context = this.f100853a;
                com.p314xaae8f345.mm.ui.ah a17 = com.p314xaae8f345.mm.ui.bh.a(context);
                int a18 = com.p314xaae8f345.mm.ui.bl.a(context);
                int c18 = a17.f278669b - com.p314xaae8f345.mm.ui.bl.c(context);
                if (c17 >= a18 && i19 <= c18) {
                    z17 = false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSelectionOutOfVisibleArea", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                return z17;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSelectionOutOfVisibleArea", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        return false;
    }

    public final void u() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onListViewScrollEnd", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        if (this.f100862j.length() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onListViewScrollEnd", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            return;
        }
        int i17 = this.f100874v;
        boolean t17 = t();
        if (t17) {
            k();
        }
        this.f100854b.postDelayed(new bd4.y1(this, i17, t17), 300L);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onListViewScrollEnd", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
    }

    public final void v() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onListViewScrollStart", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        if (this.f100862j.length() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onListViewScrollStart", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            return;
        }
        this.f100874v++;
        this.f100873u = true;
        wl5.x xVar = this.f100861i;
        if (xVar != null) {
            xVar.K = true;
            xVar.i();
        }
        wl5.x xVar2 = this.f100861i;
        if (xVar2 != null) {
            xVar2.N = true;
        }
        if (xVar2 != null) {
            xVar2.L = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onListViewScrollStart", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
    }

    public final void w(int i17) {
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportMenuActionByItemId", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
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
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportMenuActionByItemId", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                            return;
                    }
                }
            }
            x(i18);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportMenuActionByItemId", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        }
        i18 = 2;
        x(i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportMenuActionByItemId", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
    }

    public final void x(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportTextMenuAction", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        ta4.y0 y0Var = ta4.y0.f498396a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f100855c;
        java.lang.String m70363x51f8f990 = c17933xe8d1b226 != null ? c17933xe8d1b226.m70363x51f8f990() : null;
        if (m70363x51f8f990 == null) {
            m70363x51f8f990 = "";
        }
        java.lang.String str = m70363x51f8f990;
        int i18 = this.f100868p;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildSnsTextUdfKv$default", "com.tencent.mm.plugin.sns.report.SnsMenuActionReporter");
        java.util.Map a17 = y0Var.a(0, i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildSnsTextUdfKv$default", "com.tencent.mm.plugin.sns.report.SnsMenuActionReporter");
        ta4.y0.e(y0Var, i17, str, 1, null, a17, 8, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportTextMenuAction", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
    }

    public final void y(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("restoreCursorHandleIfAllowed", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        if (this.f100862j.length() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("restoreCursorHandleIfAllowed", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            return;
        }
        if (!z17 && this.f100873u) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.SnsSelectableTextHelper", "restoreCursorHandleIfAllowed skip: list is scrolling");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("restoreCursorHandleIfAllowed", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            return;
        }
        wl5.x xVar = this.f100861i;
        if (xVar != null) {
            xVar.N = false;
        }
        if (xVar != null) {
            xVar.o();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("restoreCursorHandleIfAllowed", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
    }

    public final boolean z() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("selectAllText", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        int length = wl5.y.o(this.f100854b).length();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.SnsSelectableTextHelper", "selectAllText: textLength=" + length);
        if (length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.SnsSelectableTextHelper", "selectAllText: abort, textLength <= 0");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("selectAllText", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            return false;
        }
        p();
        wl5.x xVar = this.f100861i;
        boolean z17 = xVar != null ? xVar.L : false;
        if (xVar != null) {
            xVar.L = true;
        }
        if (xVar != null) {
            xVar.s(0, length);
        }
        h(wl5.y.o(this.f100854b).length());
        this.f100868p = 1;
        D();
        this.f100854b.post(new bd4.a2(this, z17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.SnsSelectableTextHelper", "selectAllText: done, selectContent=" + ((java.lang.Object) this.f100862j));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("selectAllText", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f2(android.content.Context context, android.view.View contentView, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, android.view.View.OnCreateContextMenuListener onCreateContextMenuListener, db5.t4 t4Var, bd4.a aVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.u1 u1Var, int i17) {
        this(context, contentView, c17933xe8d1b226, onCreateContextMenuListener, t4Var, aVar, u1Var, i17, null, 256, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentView, "contentView");
    }

    public f2(android.content.Context context, android.view.View contentView, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, android.view.View.OnCreateContextMenuListener onCreateContextMenuListener, db5.t4 t4Var, bd4.a aVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.u1 u1Var, int i17, yz5.a aVar2, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        c17933xe8d1b226 = (i18 & 4) != 0 ? null : c17933xe8d1b226;
        onCreateContextMenuListener = (i18 & 8) != 0 ? null : onCreateContextMenuListener;
        t4Var = (i18 & 16) != 0 ? null : t4Var;
        aVar = (i18 & 32) != 0 ? null : aVar;
        u1Var = (i18 & 64) != 0 ? null : u1Var;
        aVar2 = (i18 & 256) != 0 ? null : aVar2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentView, "contentView");
        this.f100853a = context;
        this.f100854b = contentView;
        this.f100855c = c17933xe8d1b226;
        this.f100856d = onCreateContextMenuListener;
        this.f100857e = t4Var;
        this.f100858f = aVar;
        this.f100859g = u1Var;
        this.f100860h = aVar2;
        this.f100862j = "";
        this.f100864l = -1;
        this.f100868p = 3;
        this.f100872t = jz5.h.b(new bd4.c2(this));
        this.f100876x = -context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.u_);
        this.B = -1.0f;
        this.D = jz5.h.b(new bd4.x1(this));
        this.E = new android.view.GestureDetector(context, new bd4.v1(this));
    }
}
