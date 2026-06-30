package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000\u0084\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\u0007B\u0013\u0012\b\u0010¸\u0001\u001a\u00030·\u0001¢\u0006\u0006\b¹\u0001\u0010º\u0001J\u001a\u0010\n\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00158\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010!\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010'\u001a\u00020\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010-\u001a\u00020(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u00103\u001a\u00020.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R.\u0010;\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\b0\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001a\u0010A\u001a\u00020<8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010G\u001a\u00020B8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010M\u001a\u00020H8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR(\u0010W\u001a\u00020N8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\bO\u0010P\u0012\u0004\bU\u0010V\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u001a\u0010]\u001a\u00020X8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R(\u0010f\u001a\u00020^8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b_\u0010`\u0012\u0004\be\u0010V\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR/\u0010m\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u00078F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR \u0010t\u001a\u00020n8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bo\u0010p\u0012\u0004\bs\u0010V\u001a\u0004\bq\u0010rR \u0010{\u001a\u00020u8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\bv\u0010w\u0012\u0004\bz\u0010V\u001a\u0004\bx\u0010yR.\u0010\u0082\u0001\u001a\u00020|2\u0006\u0010\u0016\u001a\u00020|8V@RX\u0096\u008e\u0002¢\u0006\u0014\n\u0004\b}\u0010h\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R3\u0010\u0089\u0001\u001a\u00030\u0083\u00012\u0007\u0010\u0016\u001a\u00030\u0083\u00018V@RX\u0096\u008e\u0002¢\u0006\u0017\n\u0005\b\u0084\u0001\u0010h\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R \u0010\u008f\u0001\u001a\u00030\u008a\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R \u0010\u0095\u0001\u001a\u00030\u0090\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R \u0010\u009b\u0001\u001a\u00030\u0096\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0017\u0010\u009e\u0001\u001a\u00020\r8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0018\u0010¢\u0001\u001a\u00030\u009f\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b \u0001\u0010¡\u0001R\u0018\u0010¦\u0001\u001a\u00030£\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b¤\u0001\u0010¥\u0001R\u001a\u0010ª\u0001\u001a\u0005\u0018\u00010§\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b¨\u0001\u0010©\u0001R\u0018\u0010®\u0001\u001a\u00030«\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R\u0016\u0010°\u0001\u001a\u00020^8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¯\u0001\u0010bR\u0016\u0010²\u0001\u001a\u00020N8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b±\u0001\u0010RR\u0018\u0010¶\u0001\u001a\u00030³\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b´\u0001\u0010µ\u0001¨\u0006»\u0001"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "Landroid/view/ViewGroup;", "Lu1/r1;", "Landroidx/compose/ui/platform/t4;", "Lp1/j0;", "Landroidx/lifecycle/f;", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/m;", "Ljz5/f0;", "callback", "setOnViewTreeOwnersAvailable", "", "accessibilityId", "Landroid/view/View;", "findViewByAccessibilityIdTraversal", "Lu1/o0;", "f", "Lu1/o0;", "getSharedDrawScope", "()Lu1/o0;", "sharedDrawScope", "Lp2/f;", "<set-?>", "g", "Lp2/f;", "getDensity", "()Lp2/f;", "density", "Lu1/w;", "o", "Lu1/w;", "getRoot", "()Lu1/w;", "root", "Lu1/z1;", "p", "Lu1/z1;", "getRootForTest", "()Lu1/z1;", "rootForTest", "Ly1/a0;", "q", "Ly1/a0;", "getSemanticsOwner", "()Ly1/a0;", "semanticsOwner", "La1/f;", "s", "La1/f;", "getAutofillTree", "()La1/f;", "autofillTree", "Landroid/content/res/Configuration;", "y", "Lyz5/l;", "getConfigurationChangeObserver", "()Lyz5/l;", "setConfigurationChangeObserver", "(Lyz5/l;)V", "configurationChangeObserver", "Landroidx/compose/ui/platform/l;", "B", "Landroidx/compose/ui/platform/l;", "getClipboardManager", "()Landroidx/compose/ui/platform/l;", "clipboardManager", "Landroidx/compose/ui/platform/k;", "C", "Landroidx/compose/ui/platform/k;", "getAccessibilityManager", "()Landroidx/compose/ui/platform/k;", "accessibilityManager", "Lu1/w1;", "D", "Lu1/w1;", "getSnapshotObserver", "()Lu1/w1;", "snapshotObserver", "", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "Z", "getShowLayoutBounds", "()Z", "setShowLayoutBounds", "(Z)V", "getShowLayoutBounds$annotations", "()V", "showLayoutBounds", "Landroidx/compose/ui/platform/k4;", "K", "Landroidx/compose/ui/platform/k4;", "getViewConfiguration", "()Landroidx/compose/ui/platform/k4;", "viewConfiguration", "", "R", "J", "getLastMatrixRecalculationAnimationTime$ui_release", "()J", "setLastMatrixRecalculationAnimationTime$ui_release", "(J)V", "getLastMatrixRecalculationAnimationTime$ui_release$annotations", "lastMatrixRecalculationAnimationTime", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Ln0/v2;", "getViewTreeOwners", "()Landroidx/compose/ui/platform/m;", "setViewTreeOwners", "(Landroidx/compose/ui/platform/m;)V", "viewTreeOwners", "Lg2/g0;", "p1", "Lg2/g0;", "getTextInputService", "()Lg2/g0;", "getTextInputService$annotations", "textInputService", "Lf2/f;", "x1", "Lf2/f;", "getFontLoader", "()Lf2/f;", "getFontLoader$annotations", "fontLoader", "Lf2/g;", "y1", "getFontFamilyResolver", "()Lf2/g;", "setFontFamilyResolver", "(Lf2/g;)V", "fontFamilyResolver", "Lp2/s;", "A1", "getLayoutDirection", "()Lp2/s;", "setLayoutDirection", "(Lp2/s;)V", "layoutDirection", "Lk1/a;", "B1", "Lk1/a;", "getHapticFeedBack", "()Lk1/a;", "hapticFeedBack", "Landroidx/compose/ui/platform/c4;", "D1", "Landroidx/compose/ui/platform/c4;", "getTextToolbar", "()Landroidx/compose/ui/platform/c4;", "textToolbar", "Lp1/q;", "P1", "Lp1/q;", "getPointerIconService", "()Lp1/q;", "pointerIconService", "getView", "()Landroid/view/View;", "view", "Lc1/k;", "getFocusManager", "()Lc1/k;", "focusManager", "Landroidx/compose/ui/platform/v4;", "getWindowInfo", "()Landroidx/compose/ui/platform/v4;", "windowInfo", "La1/b;", "getAutofill", "()La1/b;", "autofill", "Landroidx/compose/ui/platform/p1;", "getAndroidViewsHandler$ui_release", "()Landroidx/compose/ui/platform/p1;", "androidViewsHandler", "getMeasureIteration", "measureIteration", "getHasPendingMeasureOrLayout", "hasPendingMeasureOrLayout", "Ll1/b;", "getInputModeManager", "()Ll1/b;", "inputModeManager", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "ui_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes14.dex */
public final class AndroidComposeView extends android.view.ViewGroup implements u1.r1, androidx.compose.ui.platform.t4, p1.j0, androidx.lifecycle.f {
    public static java.lang.Class Q1;
    public static java.lang.reflect.Method R1;
    public boolean A;

    /* renamed from: A1, reason: from kotlin metadata */
    public final n0.v2 layoutDirection;

    /* renamed from: B, reason: from kotlin metadata */
    public final androidx.compose.ui.platform.l clipboardManager;

    /* renamed from: B1, reason: from kotlin metadata */
    public final k1.a hapticFeedBack;

    /* renamed from: C, reason: from kotlin metadata */
    public final androidx.compose.ui.platform.k accessibilityManager;
    public final l1.c C1;

    /* renamed from: D, reason: from kotlin metadata */
    public final u1.w1 snapshotObserver;

    /* renamed from: D1, reason: from kotlin metadata */
    public final androidx.compose.ui.platform.c4 textToolbar;

    /* renamed from: E, reason: from kotlin metadata */
    public boolean showLayoutBounds;
    public android.view.MotionEvent E1;
    public androidx.compose.ui.platform.p1 F;
    public long F1;
    public androidx.compose.ui.platform.v2 G;
    public final androidx.compose.ui.platform.u4 G1;
    public p2.c H;
    public final o0.i H1;
    public boolean I;
    public final androidx.compose.ui.platform.t I1;

    /* renamed from: J, reason: collision with root package name */
    public final u1.d1 f10456J;
    public final java.lang.Runnable J1;

    /* renamed from: K, reason: from kotlin metadata */
    public final androidx.compose.ui.platform.k4 viewConfiguration;
    public boolean K1;
    public long L;
    public final yz5.a L1;
    public final int[] M;
    public final boolean M1;
    public final float[] N;
    public android.graphics.Canvas N1;
    public int O1;
    public final float[] P;

    /* renamed from: P1, reason: from kotlin metadata */
    public final p1.q pointerIconService;
    public final float[] Q;

    /* renamed from: R, reason: from kotlin metadata */
    public long lastMatrixRecalculationAnimationTime;
    public boolean S;
    public long T;
    public boolean U;

    /* renamed from: V, reason: from kotlin metadata */
    public final n0.v2 viewTreeOwners;
    public yz5.l W;

    /* renamed from: d, reason: collision with root package name */
    public long f10457d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f10458e;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final u1.o0 sharedDrawScope;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public p2.f density;

    /* renamed from: h, reason: collision with root package name */
    public final c1.m f10461h;

    /* renamed from: i, reason: collision with root package name */
    public final androidx.compose.ui.platform.w4 f10462i;

    /* renamed from: l1, reason: collision with root package name */
    public final g2.p0 f10463l1;

    /* renamed from: m, reason: collision with root package name */
    public final n1.d f10464m;

    /* renamed from: n, reason: collision with root package name */
    public final e1.v f10465n;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final u1.w root;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final u1.z1 rootForTest;

    /* renamed from: p0, reason: collision with root package name */
    public final android.view.ViewTreeObserver.OnGlobalLayoutListener f10468p0;

    /* renamed from: p1, reason: collision with root package name and from kotlin metadata */
    public final g2.g0 textInputService;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final y1.a0 semanticsOwner;

    /* renamed from: r, reason: collision with root package name */
    public final androidx.compose.ui.platform.x f10471r;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final a1.f autofillTree;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.List f10473t;

    /* renamed from: u, reason: collision with root package name */
    public java.util.List f10474u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f10475v;

    /* renamed from: w, reason: collision with root package name */
    public final p1.h f10476w;

    /* renamed from: x, reason: collision with root package name */
    public final p1.x f10477x;

    /* renamed from: x0, reason: collision with root package name */
    public final android.view.ViewTreeObserver.OnScrollChangedListener f10478x0;

    /* renamed from: x1, reason: collision with root package name and from kotlin metadata */
    public final f2.f fontLoader;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public yz5.l configurationChangeObserver;

    /* renamed from: y0, reason: collision with root package name */
    public final android.view.ViewTreeObserver.OnTouchModeChangeListener f10481y0;

    /* renamed from: y1, reason: collision with root package name and from kotlin metadata */
    public final n0.v2 fontFamilyResolver;

    /* renamed from: z, reason: collision with root package name */
    public final a1.a f10483z;

    /* renamed from: z1, reason: collision with root package name */
    public int f10484z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f10457d = d1.e.f225625d;
        this.f10458e = true;
        this.sharedDrawScope = new u1.o0(null, 1, null);
        this.density = p2.a.a(context);
        java.util.concurrent.atomic.AtomicInteger atomicInteger = y1.q.f458785f;
        y1.q qVar = new y1.q(y1.q.f458785f.addAndGet(1), false, false, androidx.compose.ui.platform.v.f10759d);
        c1.m mVar = new c1.m(null, 1, null);
        this.f10461h = mVar;
        this.f10462i = new androidx.compose.ui.platform.w4();
        n1.d dVar = new n1.d(new androidx.compose.ui.platform.q(this), null);
        this.f10464m = dVar;
        z0.p pVar = z0.p.f468921d;
        androidx.compose.ui.platform.u uVar = androidx.compose.ui.platform.u.f10752d;
        t1.f fVar = r1.c.f368570a;
        z0.t a17 = androidx.compose.ui.platform.f3.a(pVar, androidx.compose.ui.platform.e3.f10553d, new m1.b(new r1.b(uVar), null, r1.c.f368570a));
        this.f10465n = new e1.v();
        u1.w wVar = new u1.w(false, 1, null);
        wVar.L(s1.w1.f402090b);
        wVar.M(qVar.k(a17).k(mVar.f37757b).k(dVar));
        wVar.K(getDensity());
        this.root = wVar;
        this.rootForTest = this;
        this.semanticsOwner = new y1.a0(getRoot());
        androidx.compose.ui.platform.x xVar = new androidx.compose.ui.platform.x(this);
        this.f10471r = xVar;
        this.autofillTree = new a1.f();
        this.f10473t = new java.util.ArrayList();
        this.f10476w = new p1.h();
        this.f10477x = new p1.x(getRoot());
        this.configurationChangeObserver = androidx.compose.ui.platform.p.f10679d;
        int i17 = android.os.Build.VERSION.SDK_INT;
        this.f10483z = i17 >= 26 ? new a1.a(this, getAutofillTree()) : null;
        this.clipboardManager = new androidx.compose.ui.platform.l(context);
        this.accessibilityManager = new androidx.compose.ui.platform.k(context);
        this.snapshotObserver = new u1.w1(new androidx.compose.ui.platform.w(this));
        this.f10456J = new u1.d1(getRoot());
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        kotlin.jvm.internal.o.f(viewConfiguration, "get(context)");
        this.viewConfiguration = new androidx.compose.ui.platform.o1(viewConfiguration);
        this.L = p2.m.f351388b;
        this.M = new int[]{0, 0};
        this.N = e1.j0.a(null, 1, null);
        this.P = e1.j0.a(null, 1, null);
        this.Q = e1.j0.a(null, 1, null);
        this.lastMatrixRecalculationAnimationTime = -1L;
        this.T = d1.e.f225624c;
        this.U = true;
        this.viewTreeOwners = n0.s4.c(null, null, 2, null);
        this.f10468p0 = new android.view.ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.compose.ui.platform.AndroidComposeView$$a
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                java.lang.Class cls = androidx.compose.ui.platform.AndroidComposeView.Q1;
                androidx.compose.ui.platform.AndroidComposeView this$0 = androidx.compose.ui.platform.AndroidComposeView.this;
                kotlin.jvm.internal.o.g(this$0, "this$0");
                this$0.x();
            }
        };
        this.f10478x0 = new android.view.ViewTreeObserver.OnScrollChangedListener() { // from class: androidx.compose.ui.platform.AndroidComposeView$$b
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                java.lang.Class cls = androidx.compose.ui.platform.AndroidComposeView.Q1;
                androidx.compose.ui.platform.AndroidComposeView this$0 = androidx.compose.ui.platform.AndroidComposeView.this;
                kotlin.jvm.internal.o.g(this$0, "this$0");
                this$0.x();
            }
        };
        this.f10481y0 = new android.view.ViewTreeObserver.OnTouchModeChangeListener() { // from class: androidx.compose.ui.platform.AndroidComposeView$$c
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z17) {
                java.lang.Class cls = androidx.compose.ui.platform.AndroidComposeView.Q1;
                androidx.compose.ui.platform.AndroidComposeView this$0 = androidx.compose.ui.platform.AndroidComposeView.this;
                kotlin.jvm.internal.o.g(this$0, "this$0");
                ((n0.q4) this$0.C1.f314970a).setValue(new l1.a(z17 ? 1 : 2));
                c1.n.b(this$0.f10461h.f37756a);
            }
        };
        g2.p0 p0Var = new g2.p0(this);
        this.f10463l1 = p0Var;
        this.textInputService = new g2.g0(p0Var);
        this.fontLoader = new androidx.compose.ui.platform.b1(context);
        this.fontFamilyResolver = n0.s4.b(f2.m.a(context), n0.c4.f333474a);
        android.content.res.Configuration configuration = context.getResources().getConfiguration();
        kotlin.jvm.internal.o.f(configuration, "context.resources.configuration");
        this.f10484z1 = i17 >= 31 ? configuration.fontWeightAdjustment : 0;
        android.content.res.Configuration configuration2 = context.getResources().getConfiguration();
        kotlin.jvm.internal.o.f(configuration2, "context.resources.configuration");
        int layoutDirection = configuration2.getLayoutDirection();
        p2.s sVar = p2.s.Ltr;
        if (layoutDirection != 0 && layoutDirection == 1) {
            sVar = p2.s.Rtl;
        }
        this.layoutDirection = n0.s4.c(sVar, null, 2, null);
        this.hapticFeedBack = new k1.b(this);
        this.C1 = new l1.c(isInTouchMode() ? 1 : 2, new androidx.compose.ui.platform.n(this), null);
        this.textToolbar = new androidx.compose.ui.platform.c1(this);
        this.G1 = new androidx.compose.ui.platform.u4();
        this.H1 = new o0.i(new yz5.a[16], 0);
        this.I1 = new androidx.compose.ui.platform.t(this);
        this.J1 = new androidx.compose.ui.platform.AndroidComposeView$$d(this);
        this.L1 = new androidx.compose.ui.platform.s(this);
        setWillNotDraw(false);
        setFocusable(true);
        if (i17 >= 26) {
            androidx.compose.ui.platform.k0.f10616a.a(this, 1, false);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        setTransitionGroup(true);
        n3.l1.l(this, xVar);
        getRoot().a(this);
        if (i17 >= 29) {
            androidx.compose.ui.platform.i0.f10586a.a(this);
        }
        java.lang.String BRAND = android.os.Build.BRAND;
        kotlin.jvm.internal.o.f(BRAND, "BRAND");
        this.M1 = r26.n0.B(BRAND, "vivo", false);
        this.pointerIconService = new androidx.compose.ui.platform.r(this);
    }

    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    public static /* synthetic */ void getTextInputService$annotations() {
    }

    private void setFontFamilyResolver(f2.g gVar) {
        ((n0.q4) this.fontFamilyResolver).setValue(gVar);
    }

    private void setLayoutDirection(p2.s sVar) {
        ((n0.q4) this.layoutDirection).setValue(sVar);
    }

    private final void setViewTreeOwners(androidx.compose.ui.platform.m mVar) {
        ((n0.q4) this.viewTreeOwners).setValue(mVar);
    }

    public final void a(android.view.ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = viewGroup.getChildAt(i17);
            if (childAt instanceof androidx.compose.ui.platform.AndroidComposeView) {
                ((androidx.compose.ui.platform.AndroidComposeView) childAt).l();
            } else if (childAt instanceof android.view.ViewGroup) {
                a((android.view.ViewGroup) childAt);
            }
        }
    }

    @Override // android.view.View
    public void autofill(android.util.SparseArray values) {
        a1.a aVar;
        kotlin.jvm.internal.o.g(values, "values");
        if (!(android.os.Build.VERSION.SDK_INT >= 26) || (aVar = this.f10483z) == null) {
            return;
        }
        int size = values.size();
        for (int i17 = 0; i17 < size; i17++) {
            int keyAt = values.keyAt(i17);
            android.view.autofill.AutofillValue value = (android.view.autofill.AutofillValue) values.get(keyAt);
            a1.d dVar = a1.d.f483a;
            kotlin.jvm.internal.o.f(value, "value");
            if (dVar.d(value)) {
                java.lang.String value2 = dVar.i(value).toString();
                a1.f fVar = aVar.f480b;
                fVar.getClass();
                kotlin.jvm.internal.o.g(value2, "value");
                android.support.v4.media.f.a(((java.util.LinkedHashMap) fVar.f485a).get(java.lang.Integer.valueOf(keyAt)));
            } else {
                if (dVar.b(value)) {
                    throw new jz5.k("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (dVar.c(value)) {
                    throw new jz5.k("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (dVar.e(value)) {
                    throw new jz5.k("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    public final jz5.l b(int i17) {
        int mode = android.view.View.MeasureSpec.getMode(i17);
        int size = android.view.View.MeasureSpec.getSize(i17);
        if (mode == Integer.MIN_VALUE) {
            return new jz5.l(0, java.lang.Integer.valueOf(size));
        }
        if (mode == 0) {
            return new jz5.l(0, Integer.MAX_VALUE);
        }
        if (mode == 1073741824) {
            return new jz5.l(java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(size));
        }
        throw new java.lang.IllegalStateException();
    }

    public final android.view.View c(int i17, android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return null;
        }
        java.lang.reflect.Method declaredMethod = android.view.View.class.getDeclaredMethod("getAccessibilityViewId", new java.lang.Class[0]);
        declaredMethod.setAccessible(true);
        if (kotlin.jvm.internal.o.b(declaredMethod.invoke(view, new java.lang.Object[0]), java.lang.Integer.valueOf(i17))) {
            return view;
        }
        if (!(view instanceof android.view.ViewGroup)) {
            return null;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            android.view.View childAt = viewGroup.getChildAt(i18);
            kotlin.jvm.internal.o.f(childAt, "currentView.getChildAt(i)");
            android.view.View c17 = c(i17, childAt);
            if (c17 != null) {
                return c17;
            }
        }
        return null;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i17) {
        return this.f10471r.b(false, i17, this.f10457d);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i17) {
        return this.f10471r.b(true, i17, this.f10457d);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0081 A[Catch: all -> 0x00f1, Merged into TryCatch #1 {all -> 0x00f3, blocks: (B:3:0x0008, B:5:0x004d, B:6:0x0050, B:53:0x00e8, B:61:0x00f2, B:8:0x0053, B:10:0x005c, B:14:0x0067, B:16:0x0071, B:21:0x0081, B:26:0x0099, B:27:0x009f, B:30:0x00a9, B:31:0x0088, B:39:0x00b5, B:47:0x00c7, B:49:0x00cd, B:51:0x00db, B:52:0x00de), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0099 A[Catch: all -> 0x00f1, Merged into TryCatch #1 {all -> 0x00f3, blocks: (B:3:0x0008, B:5:0x004d, B:6:0x0050, B:53:0x00e8, B:61:0x00f2, B:8:0x0053, B:10:0x005c, B:14:0x0067, B:16:0x0071, B:21:0x0081, B:26:0x0099, B:27:0x009f, B:30:0x00a9, B:31:0x0088, B:39:0x00b5, B:47:0x00c7, B:49:0x00cd, B:51:0x00db, B:52:0x00de), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009f A[Catch: all -> 0x00f1, Merged into TryCatch #1 {all -> 0x00f3, blocks: (B:3:0x0008, B:5:0x004d, B:6:0x0050, B:53:0x00e8, B:61:0x00f2, B:8:0x0053, B:10:0x005c, B:14:0x0067, B:16:0x0071, B:21:0x0081, B:26:0x0099, B:27:0x009f, B:30:0x00a9, B:31:0x0088, B:39:0x00b5, B:47:0x00c7, B:49:0x00cd, B:51:0x00db, B:52:0x00de), top: B:2:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.d(android.view.MotionEvent):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0084, code lost:
    
        if (r7 != null) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008b A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void dispatchDraw(android.graphics.Canvas r10) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(android.view.MotionEvent event) {
        float a17;
        m1.b bVar;
        kotlin.jvm.internal.o.g(event, "event");
        if (event.getActionMasked() != 8) {
            return super.dispatchGenericMotionEvent(event);
        }
        if (event.isFromSource(4194304)) {
            android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(getContext());
            float f17 = -event.getAxisValue(26);
            android.content.Context context = getContext();
            int i17 = android.os.Build.VERSION.SDK_INT;
            if (i17 >= 26) {
                java.lang.reflect.Method method = n3.o1.f334378a;
                a17 = n3.m1.b(viewConfiguration);
            } else {
                a17 = n3.o1.a(viewConfiguration, context);
            }
            r1.d dVar = new r1.d(a17 * f17, f17 * (i17 >= 26 ? n3.m1.a(viewConfiguration) : n3.o1.a(viewConfiguration, getContext())), event.getEventTime());
            c1.p a18 = c1.n.a(this.f10461h.f37756a);
            if (a18 == null || (bVar = a18.f37770i) == null) {
                return false;
            }
            if (!bVar.b(dVar) && !bVar.a(dVar)) {
                return false;
            }
        } else if ((d(event) & 1) == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00fd, code lost:
    
        if (r3 != Integer.MIN_VALUE) goto L51;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchHoverEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent event) {
        c1.p b17;
        u1.w wVar;
        kotlin.jvm.internal.o.g(event, "event");
        if (!isFocused()) {
            return super.dispatchKeyEvent(event);
        }
        n1.d dVar = this.f10464m;
        dVar.getClass();
        c1.p pVar = dVar.f334032f;
        if (pVar != null && (b17 = c1.l0.b(pVar)) != null) {
            u1.c1 c1Var = b17.f37775q;
            n1.d dVar2 = null;
            if (c1Var != null && (wVar = c1Var.f423554h) != null) {
                o0.i iVar = b17.f37778t;
                int i17 = iVar.f341852f;
                if (i17 > 0) {
                    java.lang.Object[] objArr = iVar.f341850d;
                    int i18 = 0;
                    do {
                        n1.d dVar3 = (n1.d) objArr[i18];
                        if (kotlin.jvm.internal.o.b(dVar3.f334034h, wVar)) {
                            if (dVar2 != null) {
                                u1.w wVar2 = dVar3.f334034h;
                                n1.d dVar4 = dVar2;
                                while (!kotlin.jvm.internal.o.b(dVar4, dVar3)) {
                                    dVar4 = dVar4.f334033g;
                                    if (dVar4 != null && kotlin.jvm.internal.o.b(dVar4.f334034h, wVar2)) {
                                    }
                                }
                            }
                            dVar2 = dVar3;
                            break;
                        }
                        i18++;
                    } while (i18 < i17);
                }
                if (dVar2 == null) {
                    dVar2 = b17.f37777s;
                }
            }
            if (dVar2 != null) {
                if (dVar2.b(event)) {
                    return true;
                }
                return dVar2.a(event);
            }
        }
        throw new java.lang.IllegalStateException("KeyEvent can't be processed because this key input node is not active.".toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        kotlin.jvm.internal.o.g(motionEvent, "motionEvent");
        if (this.K1) {
            java.lang.Runnable runnable = this.J1;
            removeCallbacks(runnable);
            android.view.MotionEvent motionEvent2 = this.E1;
            kotlin.jvm.internal.o.d(motionEvent2);
            if (motionEvent.getActionMasked() == 0) {
                if (!((motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) ? false : true)) {
                    this.K1 = false;
                }
            }
            ((androidx.compose.ui.platform.AndroidComposeView$$d) runnable).run();
        }
        if (g(motionEvent)) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !i(motionEvent)) {
            return false;
        }
        int d17 = d(motionEvent);
        if ((d17 & 2) != 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return (d17 & 1) != 0;
    }

    public final void e(u1.w wVar) {
        wVar.v();
        o0.i r17 = wVar.r();
        int i17 = r17.f341852f;
        if (i17 > 0) {
            java.lang.Object[] objArr = r17.f341850d;
            int i18 = 0;
            do {
                e((u1.w) objArr[i18]);
                i18++;
            } while (i18 < i17);
        }
    }

    public final void f(u1.w wVar) {
        int i17 = 0;
        this.f10456J.i(wVar, false);
        o0.i r17 = wVar.r();
        int i18 = r17.f341852f;
        if (i18 > 0) {
            java.lang.Object[] objArr = r17.f341850d;
            do {
                f((u1.w) objArr[i17]);
                i17++;
            } while (i17 < i18);
        }
    }

    public final android.view.View findViewByAccessibilityIdTraversal(int accessibilityId) {
        android.view.View view = null;
        try {
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                java.lang.reflect.Method declaredMethod = android.view.View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", java.lang.Integer.TYPE);
                declaredMethod.setAccessible(true);
                java.lang.Object invoke = declaredMethod.invoke(this, java.lang.Integer.valueOf(accessibilityId));
                if (invoke instanceof android.view.View) {
                    view = (android.view.View) invoke;
                }
            } else {
                view = c(accessibilityId, this);
            }
        } catch (java.lang.NoSuchMethodException unused) {
        }
        return view;
    }

    public final boolean g(android.view.MotionEvent motionEvent) {
        return java.lang.Float.isNaN(motionEvent.getX()) || java.lang.Float.isNaN(motionEvent.getY()) || java.lang.Float.isNaN(motionEvent.getRawX()) || java.lang.Float.isNaN(motionEvent.getRawY());
    }

    public final androidx.compose.ui.platform.p1 getAndroidViewsHandler$ui_release() {
        if (this.F == null) {
            android.content.Context context = getContext();
            kotlin.jvm.internal.o.f(context, "context");
            androidx.compose.ui.platform.p1 p1Var = new androidx.compose.ui.platform.p1(context);
            this.F = p1Var;
            addView(p1Var);
        }
        androidx.compose.ui.platform.p1 p1Var2 = this.F;
        kotlin.jvm.internal.o.d(p1Var2);
        return p1Var2;
    }

    @Override // u1.r1
    public a1.b getAutofill() {
        return this.f10483z;
    }

    @Override // u1.r1
    public a1.f getAutofillTree() {
        return this.autofillTree;
    }

    public final yz5.l getConfigurationChangeObserver() {
        return this.configurationChangeObserver;
    }

    @Override // u1.r1
    public p2.f getDensity() {
        return this.density;
    }

    @Override // u1.r1
    public c1.k getFocusManager() {
        return this.f10461h;
    }

    @Override // android.view.View
    public void getFocusedRect(android.graphics.Rect rect) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(rect, "rect");
        c1.p a17 = c1.n.a(this.f10461h.f37756a);
        if (a17 != null) {
            d1.g d17 = c1.l0.d(a17);
            rect.left = a06.d.b(d17.f225629a);
            rect.top = a06.d.b(d17.f225630b);
            rect.right = a06.d.b(d17.f225631c);
            rect.bottom = a06.d.b(d17.f225632d);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            super.getFocusedRect(rect);
        }
    }

    @Override // u1.r1
    public f2.g getFontFamilyResolver() {
        return (f2.g) this.fontFamilyResolver.getValue();
    }

    @Override // u1.r1
    public f2.f getFontLoader() {
        return this.fontLoader;
    }

    @Override // u1.r1
    public k1.a getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return !this.f10456J.f423573b.f423606a.isEmpty();
    }

    @Override // u1.r1
    public l1.b getInputModeManager() {
        return this.C1;
    }

    /* renamed from: getLastMatrixRecalculationAnimationTime$ui_release, reason: from getter */
    public final long getLastMatrixRecalculationAnimationTime() {
        return this.lastMatrixRecalculationAnimationTime;
    }

    @Override // android.view.View, android.view.ViewParent, u1.r1
    public p2.s getLayoutDirection() {
        return (p2.s) this.layoutDirection.getValue();
    }

    public long getMeasureIteration() {
        u1.d1 d1Var = this.f10456J;
        if (d1Var.f423574c) {
            return d1Var.f423577f;
        }
        throw new java.lang.IllegalArgumentException("measureIteration should be only used during the measure/layout pass".toString());
    }

    @Override // u1.r1
    public p1.q getPointerIconService() {
        return this.pointerIconService;
    }

    public u1.w getRoot() {
        return this.root;
    }

    public u1.z1 getRootForTest() {
        return this.rootForTest;
    }

    public y1.a0 getSemanticsOwner() {
        return this.semanticsOwner;
    }

    @Override // u1.r1
    public u1.o0 getSharedDrawScope() {
        return this.sharedDrawScope;
    }

    @Override // u1.r1
    public boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    @Override // u1.r1
    public u1.w1 getSnapshotObserver() {
        return this.snapshotObserver;
    }

    @Override // u1.r1
    public g2.g0 getTextInputService() {
        return this.textInputService;
    }

    @Override // u1.r1
    public androidx.compose.ui.platform.c4 getTextToolbar() {
        return this.textToolbar;
    }

    public android.view.View getView() {
        return this;
    }

    @Override // u1.r1
    public androidx.compose.ui.platform.k4 getViewConfiguration() {
        return this.viewConfiguration;
    }

    public final androidx.compose.ui.platform.m getViewTreeOwners() {
        return (androidx.compose.ui.platform.m) this.viewTreeOwners.getValue();
    }

    @Override // u1.r1
    public androidx.compose.ui.platform.v4 getWindowInfo() {
        return this.f10462i;
    }

    public final boolean h(android.view.MotionEvent motionEvent) {
        float x17 = motionEvent.getX();
        float y17 = motionEvent.getY();
        if (0.0f <= x17 && x17 <= ((float) getWidth())) {
            if (0.0f <= y17 && y17 <= ((float) getHeight())) {
                return true;
            }
        }
        return false;
    }

    public final boolean i(android.view.MotionEvent motionEvent) {
        android.view.MotionEvent motionEvent2;
        if (motionEvent.getPointerCount() != 1 || (motionEvent2 = this.E1) == null) {
            return true;
        }
        if (motionEvent.getRawX() == motionEvent2.getRawX()) {
            return !((motionEvent.getRawY() > motionEvent2.getRawY() ? 1 : (motionEvent.getRawY() == motionEvent2.getRawY() ? 0 : -1)) == 0);
        }
        return true;
    }

    public long j(long j17) {
        p();
        long b17 = e1.j0.b(this.N, j17);
        return d1.f.a(d1.e.c(b17) + d1.e.c(this.T), d1.e.d(b17) + d1.e.d(this.T));
    }

    public final void k(u1.o1 layer, boolean z17) {
        kotlin.jvm.internal.o.g(layer, "layer");
        java.util.List list = this.f10473t;
        if (!z17) {
            if (!this.f10475v && !list.remove(layer)) {
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            if (!this.f10475v) {
                list.add(layer);
                return;
            }
            java.util.List list2 = this.f10474u;
            if (list2 == null) {
                list2 = new java.util.ArrayList();
                this.f10474u = list2;
            }
            list2.add(layer);
        }
    }

    public void l() {
        if (this.A) {
            x0.r0 r0Var = getSnapshotObserver().f423710a;
            r0Var.getClass();
            synchronized (r0Var.f450935d) {
                o0.i iVar = r0Var.f450935d;
                int i17 = iVar.f341852f;
                if (i17 > 0) {
                    java.lang.Object[] objArr = iVar.f341850d;
                    int i18 = 0;
                    do {
                        o0.e eVar = ((x0.n0) objArr[i18]).f450914b;
                        int i19 = eVar.f341843d;
                        int i27 = 0;
                        for (int i28 = 0; i28 < i19; i28++) {
                            int i29 = eVar.f341840a[i28];
                            o0.d dVar = eVar.f341842c[i29];
                            kotlin.jvm.internal.o.d(dVar);
                            int i37 = dVar.f341838d;
                            int i38 = 0;
                            for (int i39 = 0; i39 < i37; i39++) {
                                java.lang.Object obj = dVar.f341839e[i39];
                                if (obj == null) {
                                    throw new java.lang.NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                }
                                if (!java.lang.Boolean.valueOf(!((u1.s1) obj).isValid()).booleanValue()) {
                                    if (i38 != i39) {
                                        dVar.f341839e[i38] = obj;
                                    }
                                    i38++;
                                }
                            }
                            int i47 = dVar.f341838d;
                            for (int i48 = i38; i48 < i47; i48++) {
                                dVar.f341839e[i48] = null;
                            }
                            dVar.f341838d = i38;
                            if (i38 > 0) {
                                if (i27 != i28) {
                                    int[] iArr = eVar.f341840a;
                                    int i49 = iArr[i27];
                                    iArr[i27] = i29;
                                    iArr[i28] = i49;
                                }
                                i27++;
                            }
                        }
                        int i57 = eVar.f341843d;
                        for (int i58 = i27; i58 < i57; i58++) {
                            eVar.f341841b[eVar.f341840a[i58]] = null;
                        }
                        eVar.f341843d = i27;
                        i18++;
                    } while (i18 < i17);
                }
            }
            this.A = false;
        }
        androidx.compose.ui.platform.p1 p1Var = this.F;
        if (p1Var != null) {
            a(p1Var);
        }
        while (this.H1.j()) {
            int i59 = this.H1.f341852f;
            for (int i66 = 0; i66 < i59; i66++) {
                java.lang.Object[] objArr2 = this.H1.f341850d;
                yz5.a aVar = (yz5.a) objArr2[i66];
                objArr2[i66] = null;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
            o0.i iVar2 = this.H1;
            if (i59 > 0) {
                int i67 = iVar2.f341852f;
                if (i59 < i67) {
                    java.lang.Object[] objArr3 = iVar2.f341850d;
                    kz5.v.k(objArr3, objArr3, 0, i59, i67);
                }
                int i68 = iVar2.f341852f;
                int i69 = i68 - (i59 + 0);
                int i76 = i68 - 1;
                if (i69 <= i76) {
                    int i77 = i69;
                    while (true) {
                        iVar2.f341850d[i77] = null;
                        if (i77 == i76) {
                            break;
                        } else {
                            i77++;
                        }
                    }
                }
                iVar2.f341852f = i69;
            } else {
                iVar2.getClass();
            }
        }
    }

    public void m(u1.w layoutNode) {
        kotlin.jvm.internal.o.g(layoutNode, "layoutNode");
        androidx.compose.ui.platform.x xVar = this.f10471r;
        xVar.getClass();
        xVar.f10799t = true;
        if (xVar.j()) {
            xVar.k(layoutNode);
        }
    }

    public void n() {
        androidx.compose.ui.platform.x xVar = this.f10471r;
        xVar.f10799t = true;
        if (!xVar.j() || xVar.f10805z) {
            return;
        }
        xVar.f10805z = true;
        xVar.f10790h.post(xVar.A);
    }

    public final void o(float[] fArr, float f17, float f18) {
        float[] fArr2 = this.Q;
        e1.j0.d(fArr2);
        e1.j0.e(this.Q, f17, f18, 0.0f, 4, null);
        androidx.compose.ui.platform.l0.a(fArr, fArr2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        androidx.lifecycle.y yVar;
        androidx.lifecycle.o mo133getLifecycle;
        androidx.lifecycle.y yVar2;
        a1.a aVar;
        super.onAttachedToWindow();
        f(getRoot());
        e(getRoot());
        getSnapshotObserver().f423710a.c();
        boolean z17 = true;
        if ((android.os.Build.VERSION.SDK_INT >= 26) && (aVar = this.f10483z) != null) {
            a1.e.f484a.a(aVar);
        }
        androidx.lifecycle.y a17 = androidx.lifecycle.n1.a(this);
        o4.g a18 = o4.j.a(this);
        androidx.compose.ui.platform.m viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null && (a17 == null || a18 == null || (a17 == (yVar2 = viewTreeOwners.f10638a) && a18 == yVar2))) {
            z17 = false;
        }
        if (z17) {
            if (a17 == null) {
                throw new java.lang.IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (a18 == null) {
                throw new java.lang.IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (yVar = viewTreeOwners.f10638a) != null && (mo133getLifecycle = yVar.mo133getLifecycle()) != null) {
                mo133getLifecycle.c(this);
            }
            a17.mo133getLifecycle().a(this);
            androidx.compose.ui.platform.m mVar = new androidx.compose.ui.platform.m(a17, a18);
            setViewTreeOwners(mVar);
            yz5.l lVar = this.W;
            if (lVar != null) {
                lVar.invoke(mVar);
            }
            this.W = null;
        }
        androidx.compose.ui.platform.m viewTreeOwners2 = getViewTreeOwners();
        kotlin.jvm.internal.o.d(viewTreeOwners2);
        viewTreeOwners2.f10638a.mo133getLifecycle().a(this);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f10468p0);
        getViewTreeObserver().addOnScrollChangedListener(this.f10478x0);
        getViewTreeObserver().addOnTouchModeChangeListener(this.f10481y0);
    }

    @Override // android.view.View
    public boolean onCheckIsTextEditor() {
        return this.f10463l1.f267734c;
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "context");
        this.density = p2.a.a(context);
        int i17 = android.os.Build.VERSION.SDK_INT;
        if ((i17 >= 31 ? newConfig.fontWeightAdjustment : 0) != this.f10484z1) {
            this.f10484z1 = i17 >= 31 ? newConfig.fontWeightAdjustment : 0;
            android.content.Context context2 = getContext();
            kotlin.jvm.internal.o.f(context2, "context");
            setFontFamilyResolver(f2.m.a(context2));
        }
        this.configurationChangeObserver.invoke(newConfig);
    }

    @Override // android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo outAttrs) {
        int i17;
        int i18;
        java.lang.CharSequence charSequence;
        int i19;
        java.lang.CharSequence subSequence;
        kotlin.jvm.internal.o.g(outAttrs, "outAttrs");
        g2.p0 p0Var = this.f10463l1;
        p0Var.getClass();
        if (!p0Var.f267734c) {
            return null;
        }
        g2.l imeOptions = p0Var.f267738g;
        g2.e0 textFieldValue = p0Var.f267737f;
        kotlin.jvm.internal.o.g(imeOptions, "imeOptions");
        kotlin.jvm.internal.o.g(textFieldValue, "textFieldValue");
        int i27 = imeOptions.f267721e;
        boolean z17 = i27 == 1;
        boolean z18 = imeOptions.f267717a;
        if (z17) {
            if (!z18) {
                i17 = 0;
            }
            i17 = 6;
        } else {
            if (i27 == 0) {
                i17 = 1;
            } else {
                if (i27 == 2) {
                    i17 = 2;
                } else {
                    if (i27 == 6) {
                        i17 = 5;
                    } else {
                        if (i27 == 5) {
                            i17 = 7;
                        } else {
                            if (i27 == 3) {
                                i17 = 3;
                            } else {
                                if (i27 == 4) {
                                    i17 = 4;
                                } else {
                                    if (!(i27 == 7)) {
                                        throw new java.lang.IllegalStateException("invalid ImeAction".toString());
                                    }
                                    i17 = 6;
                                }
                            }
                        }
                    }
                }
            }
        }
        outAttrs.imeOptions = i17;
        int i28 = imeOptions.f267720d;
        if (i28 == 1) {
            outAttrs.inputType = 1;
        } else {
            if (i28 == 2) {
                outAttrs.inputType = 1;
                outAttrs.imeOptions = Integer.MIN_VALUE | i17;
            } else {
                if (i28 == 3) {
                    outAttrs.inputType = 2;
                } else {
                    if (i28 == 4) {
                        outAttrs.inputType = 3;
                    } else {
                        if (i28 == 5) {
                            outAttrs.inputType = 17;
                        } else {
                            if (i28 == 6) {
                                outAttrs.inputType = 33;
                            } else {
                                if (i28 == 7) {
                                    outAttrs.inputType = 129;
                                } else {
                                    if (i28 == 8) {
                                        outAttrs.inputType = 18;
                                    } else {
                                        if (!(i28 == 9)) {
                                            throw new java.lang.IllegalStateException("Invalid Keyboard Type".toString());
                                        }
                                        outAttrs.inputType = 8194;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!z18) {
            int i29 = outAttrs.inputType;
            if ((i29 & 1) == 1) {
                outAttrs.inputType = i29 | 131072;
                if (i27 == 1) {
                    outAttrs.imeOptions |= 1073741824;
                }
            }
        }
        int i37 = outAttrs.inputType;
        if ((i37 & 1) == 1) {
            int i38 = imeOptions.f267718b;
            if (i38 == 1) {
                outAttrs.inputType = i37 | 4096;
            } else {
                if (i38 == 2) {
                    outAttrs.inputType = i37 | 8192;
                } else {
                    if (i38 == 3) {
                        outAttrs.inputType = i37 | 16384;
                    }
                }
            }
            if (imeOptions.f267719c) {
                outAttrs.inputType |= 32768;
            }
        }
        int i39 = a2.m1.f782c;
        long j17 = textFieldValue.f267694b;
        outAttrs.initialSelStart = (int) (j17 >> 32);
        outAttrs.initialSelEnd = a2.m1.c(j17);
        java.lang.String str = textFieldValue.f267693a.f681d;
        int i47 = android.os.Build.VERSION.SDK_INT;
        if (i47 >= 30) {
            outAttrs.setInitialSurroundingSubText(str, 0);
        } else {
            str.getClass();
            if (i47 >= 30) {
                outAttrs.setInitialSurroundingSubText(str, 0);
            } else {
                int i48 = outAttrs.initialSelStart;
                int i49 = outAttrs.initialSelEnd;
                int i57 = i48 > i49 ? i49 + 0 : i48 + 0;
                int i58 = i48 > i49 ? i48 - 0 : i49 + 0;
                int length = str.length();
                if (i57 < 0) {
                    i18 = 0;
                    charSequence = null;
                } else if (i58 > length) {
                    charSequence = null;
                    i18 = 0;
                } else {
                    int i59 = outAttrs.inputType & 4095;
                    if (i59 == 129 || i59 == 225 || i59 == 18) {
                        q3.a.b(outAttrs, null, 0, 0);
                    } else if (length <= 2048) {
                        q3.a.b(outAttrs, str, i57, i58);
                    } else {
                        int i66 = i58 - i57;
                        int i67 = i66 > 1024 ? 0 : i66;
                        int i68 = 2048 - i67;
                        int min = java.lang.Math.min(str.length() - i58, i68 - java.lang.Math.min(i57, (int) (i68 * 0.8d)));
                        int min2 = java.lang.Math.min(i57, i68 - min);
                        int i69 = i57 - min2;
                        if (java.lang.Character.isLowSurrogate(str.charAt(i69))) {
                            i69++;
                            min2--;
                        }
                        if (java.lang.Character.isHighSurrogate(str.charAt((i58 + min) - 1))) {
                            min--;
                        }
                        int i76 = min2 + i67 + min;
                        if (i67 != i66) {
                            java.lang.CharSequence subSequence2 = str.subSequence(i69, i69 + min2);
                            java.lang.CharSequence subSequence3 = str.subSequence(i58, min + i58);
                            i19 = 0;
                            subSequence = android.text.TextUtils.concat(subSequence2, subSequence3);
                        } else {
                            i19 = 0;
                            subSequence = str.subSequence(i69, i76 + i69);
                        }
                        int i77 = min2 + i19;
                        q3.a.b(outAttrs, subSequence, i77, i67 + i77);
                    }
                }
                q3.a.b(outAttrs, charSequence, i18, i18);
            }
        }
        outAttrs.imeOptions |= com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62;
        g2.y yVar = new g2.y(p0Var.f267737f, new g2.j0(p0Var), p0Var.f267738g.f267719c);
        p0Var.f267739h = yVar;
        return yVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        a1.a aVar;
        androidx.lifecycle.y yVar;
        androidx.lifecycle.o mo133getLifecycle;
        super.onDetachedFromWindow();
        x0.r0 r0Var = getSnapshotObserver().f423710a;
        x0.i iVar = r0Var.f450936e;
        if (iVar != null) {
            ((x0.k) iVar).dispose();
        }
        r0Var.a();
        androidx.compose.ui.platform.m viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null && (yVar = viewTreeOwners.f10638a) != null && (mo133getLifecycle = yVar.mo133getLifecycle()) != null) {
            mo133getLifecycle.c(this);
        }
        if ((android.os.Build.VERSION.SDK_INT >= 26) && (aVar = this.f10483z) != null) {
            a1.e.f484a.b(aVar);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f10468p0);
        getViewTreeObserver().removeOnScrollChangedListener(this.f10478x0);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.f10481y0);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z17, int i17, android.graphics.Rect rect) {
        super.onFocusChanged(z17, i17, rect);
        c1.m mVar = this.f10461h;
        if (!z17) {
            c1.k0.c(mVar.f37756a, true);
            return;
        }
        c1.p pVar = mVar.f37756a;
        if (pVar.f37767f == c1.j0.Inactive) {
            pVar.a(c1.j0.Active);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        this.H = null;
        x();
        if (this.F != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i19 - i17, i27 - i18);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        u1.d1 d1Var = this.f10456J;
        if (!isAttachedToWindow()) {
            f(getRoot());
        }
        jz5.l b17 = b(i17);
        int intValue = ((java.lang.Number) b17.f302833d).intValue();
        int intValue2 = ((java.lang.Number) b17.f302834e).intValue();
        jz5.l b18 = b(i18);
        long a17 = p2.d.a(intValue, intValue2, ((java.lang.Number) b18.f302833d).intValue(), ((java.lang.Number) b18.f302834e).intValue());
        p2.c cVar = this.H;
        if (cVar == null) {
            this.H = new p2.c(a17);
            this.I = false;
        } else {
            if (!(cVar != null ? p2.c.b(cVar.f351377a, a17) : false)) {
                this.I = true;
            }
        }
        d1Var.j(a17);
        d1Var.e(this.L1);
        setMeasuredDimension(getRoot().f423682J.f402050d, getRoot().f423682J.f402051e);
        if (this.F != null) {
            getAndroidViewsHandler$ui_release().measure(android.view.View.MeasureSpec.makeMeasureSpec(getRoot().f423682J.f402050d, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(getRoot().f423682J.f402051e, 1073741824));
        }
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(android.view.ViewStructure viewStructure, int i17) {
        a1.a aVar;
        if (!(android.os.Build.VERSION.SDK_INT >= 26) || viewStructure == null || (aVar = this.f10483z) == null) {
            return;
        }
        a1.c cVar = a1.c.f482a;
        a1.f fVar = aVar.f480b;
        int a17 = cVar.a(viewStructure, fVar.f485a.size());
        for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) fVar.f485a).entrySet()) {
            int intValue = ((java.lang.Number) entry.getKey()).intValue();
            android.support.v4.media.f.a(entry.getValue());
            android.view.ViewStructure b17 = cVar.b(viewStructure, a17);
            if (b17 != null) {
                a1.d dVar = a1.d.f483a;
                android.view.autofill.AutofillId a18 = dVar.a(viewStructure);
                kotlin.jvm.internal.o.d(a18);
                dVar.g(b17, a18, intValue);
                cVar.d(b17, intValue, aVar.f479a.getContext().getPackageName(), null, null);
                dVar.h(b17, 1);
                throw null;
            }
            a17++;
        }
    }

    @Override // androidx.lifecycle.f, androidx.lifecycle.h
    public void onResume(androidx.lifecycle.y owner) {
        kotlin.jvm.internal.o.g(owner, "owner");
        boolean z17 = false;
        try {
            if (Q1 == null) {
                java.lang.Class<?> cls = java.lang.Class.forName("android.os.SystemProperties");
                Q1 = cls;
                R1 = cls.getDeclaredMethod("getBoolean", java.lang.String.class, java.lang.Boolean.TYPE);
            }
            java.lang.reflect.Method method = R1;
            java.lang.Object invoke = method != null ? method.invoke(null, "debug.layout", java.lang.Boolean.FALSE) : null;
            java.lang.Boolean bool = invoke instanceof java.lang.Boolean ? (java.lang.Boolean) invoke : null;
            if (bool != null) {
                z17 = bool.booleanValue();
            }
        } catch (java.lang.Exception unused) {
        }
        setShowLayoutBounds(z17);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i17) {
        if (this.f10458e) {
            p2.s sVar = p2.s.Ltr;
            if (i17 != 0 && i17 == 1) {
                sVar = p2.s.Rtl;
            }
            setLayoutDirection(sVar);
            c1.m mVar = this.f10461h;
            mVar.getClass();
            mVar.f37758c = sVar;
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z17) {
        ((n0.q4) this.f10462i.f10786a).setValue(java.lang.Boolean.valueOf(z17));
        super.onWindowFocusChanged(z17);
    }

    public final void p() {
        if (this.S) {
            return;
        }
        long currentAnimationTimeMillis = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
        if (currentAnimationTimeMillis != this.lastMatrixRecalculationAnimationTime) {
            this.lastMatrixRecalculationAnimationTime = currentAnimationTimeMillis;
            float[] fArr = this.N;
            e1.j0.d(fArr);
            w(this, fArr);
            androidx.compose.ui.platform.j3.a(fArr, this.P);
            android.view.ViewParent parent = getParent();
            android.view.View view = this;
            while (parent instanceof android.view.ViewGroup) {
                view = (android.view.View) parent;
                parent = ((android.view.ViewGroup) view).getParent();
            }
            int[] iArr = this.M;
            view.getLocationOnScreen(iArr);
            float f17 = iArr[0];
            float f18 = iArr[1];
            view.getLocationInWindow(iArr);
            this.T = d1.f.a(f17 - iArr[0], f18 - iArr[1]);
        }
    }

    public final boolean q(u1.o1 layer) {
        androidx.compose.ui.platform.u4 u4Var;
        java.lang.ref.Reference poll;
        kotlin.jvm.internal.o.g(layer, "layer");
        if (this.G != null) {
            androidx.compose.ui.platform.n4 n4Var = androidx.compose.ui.platform.p4.f10683s;
        }
        do {
            u4Var = this.G1;
            poll = u4Var.f10758b.poll();
            if (poll != null) {
                u4Var.f10757a.k(poll);
            }
        } while (poll != null);
        u4Var.f10757a.b(new java.lang.ref.WeakReference(layer, u4Var.f10758b));
        return true;
    }

    public void r(yz5.a listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        o0.i iVar = this.H1;
        if (iVar.f(listener)) {
            return;
        }
        iVar.b(listener);
    }

    public final void s(u1.w wVar) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (this.I && wVar != null) {
            while (wVar != null && wVar.E == u1.e0.InMeasureBlock) {
                wVar = wVar.p();
            }
            if (wVar == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final void setConfigurationChangeObserver(yz5.l lVar) {
        kotlin.jvm.internal.o.g(lVar, "<set-?>");
        this.configurationChangeObserver = lVar;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j17) {
        this.lastMatrixRecalculationAnimationTime = j17;
    }

    public final void setOnViewTreeOwnersAvailable(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        androidx.compose.ui.platform.m viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            callback.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.W = callback;
    }

    @Override // u1.r1
    public void setShowLayoutBounds(boolean z17) {
        this.showLayoutBounds = z17;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public long t(long j17) {
        p();
        return e1.j0.b(this.P, d1.f.a(d1.e.c(j17) - d1.e.c(this.T), d1.e.d(j17) - d1.e.d(this.T)));
    }

    public final int u(android.view.MotionEvent motionEvent) {
        java.lang.Object obj;
        p1.h hVar = this.f10476w;
        p1.v a17 = hVar.a(motionEvent, this);
        p1.x xVar = this.f10477x;
        if (a17 == null) {
            xVar.b();
            return 0;
        }
        java.util.List list = a17.f350903a;
        java.util.ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((p1.w) obj).f350913e) {
                break;
            }
        }
        p1.w wVar = (p1.w) obj;
        if (wVar != null) {
            this.f10457d = wVar.f350912d;
        }
        int a18 = xVar.a(a17, this, h(motionEvent));
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 || actionMasked == 5) {
            if (!((a18 & 1) != 0)) {
                int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                hVar.f350826c.delete(pointerId);
                hVar.f350825b.delete(pointerId);
            }
        }
        return a18;
    }

    public final void v(android.view.MotionEvent motionEvent, int i17, long j17, boolean z17) {
        int actionMasked = motionEvent.getActionMasked();
        int i18 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i18 = motionEvent.getActionIndex();
            }
        } else if (i17 != 9 && i17 != 10) {
            i18 = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (i18 >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        android.view.MotionEvent.PointerProperties[] pointerPropertiesArr = new android.view.MotionEvent.PointerProperties[pointerCount];
        for (int i19 = 0; i19 < pointerCount; i19++) {
            pointerPropertiesArr[i19] = new android.view.MotionEvent.PointerProperties();
        }
        android.view.MotionEvent.PointerCoords[] pointerCoordsArr = new android.view.MotionEvent.PointerCoords[pointerCount];
        for (int i27 = 0; i27 < pointerCount; i27++) {
            pointerCoordsArr[i27] = new android.view.MotionEvent.PointerCoords();
        }
        int i28 = 0;
        while (i28 < pointerCount) {
            int i29 = ((i18 < 0 || i28 < i18) ? 0 : 1) + i28;
            motionEvent.getPointerProperties(i29, pointerPropertiesArr[i28]);
            android.view.MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i28];
            motionEvent.getPointerCoords(i29, pointerCoords);
            long j18 = j(d1.f.a(pointerCoords.x, pointerCoords.y));
            pointerCoords.x = d1.e.c(j18);
            pointerCoords.y = d1.e.d(j18);
            i28++;
        }
        android.view.MotionEvent event = android.view.MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j17 : motionEvent.getDownTime(), j17, i17, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z17 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        kotlin.jvm.internal.o.f(event, "event");
        p1.v a17 = this.f10476w.a(event, this);
        kotlin.jvm.internal.o.d(a17);
        this.f10477x.a(a17, this, true);
        event.recycle();
    }

    public final void w(android.view.View view, float[] fArr) {
        java.lang.Object parent = view.getParent();
        if (parent instanceof android.view.View) {
            w((android.view.View) parent, fArr);
            o(fArr, -view.getScrollX(), -view.getScrollY());
            o(fArr, view.getLeft(), view.getTop());
        } else {
            view.getLocationInWindow(this.M);
            o(fArr, -view.getScrollX(), -view.getScrollY());
            o(fArr, r0[0], r0[1]);
        }
        android.graphics.Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        float[] fArr2 = this.Q;
        e1.f.a(fArr2, matrix);
        androidx.compose.ui.platform.l0.a(fArr, fArr2);
    }

    public final void x() {
        int[] iArr = this.M;
        getLocationOnScreen(iArr);
        long j17 = this.L;
        int i17 = p2.m.f351389c;
        boolean z17 = false;
        if (((int) (j17 >> 32)) != iArr[0] || p2.m.b(j17) != iArr[1]) {
            this.L = p2.n.a(iArr[0], iArr[1]);
            z17 = true;
        }
        this.f10456J.b(z17);
    }

    @Override // u1.r1
    public androidx.compose.ui.platform.k getAccessibilityManager() {
        return this.accessibilityManager;
    }

    @Override // u1.r1
    public androidx.compose.ui.platform.l getClipboardManager() {
        return this.clipboardManager;
    }
}
