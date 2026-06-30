package p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010$\u001a\u00020#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\b\b\u0002\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R(\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR(\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00028\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R0\u0010\u001e\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00158F@FX\u0087\u000e¢\u0006\u0018\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u00158TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0019R\u0011\u0010\"\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b!\u0010\u0019¨\u0006+"}, d2 = {"Landroidx/compose/ui/platform/AbstractComposeView;", "Landroid/view/ViewGroup;", "Ln0/g1;", "parent", "Ljz5/f0;", "setParentCompositionContext", "Landroidx/compose/ui/platform/j4;", "strategy", "setViewCompositionStrategy", "Landroid/os/IBinder;", "value", "e", "Landroid/os/IBinder;", "setPreviousAttachedWindowToken", "(Landroid/os/IBinder;)V", "previousAttachedWindowToken", "g", "Ln0/g1;", "setParentContext", "(Ln0/g1;)V", "parentContext", "", "i", "Z", "getShowLayoutBounds", "()Z", "setShowLayoutBounds", "(Z)V", "getShowLayoutBounds$annotations", "()V", "showLayoutBounds", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "getHasComposition", "hasComposition", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui_release"}, k = 1, mv = {1, 6, 0})
/* renamed from: androidx.compose.ui.platform.AbstractComposeView */
/* loaded from: classes14.dex */
public abstract class AbstractC1058x6d8e7db5 extends android.view.ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f91982d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public android.os.IBinder previousAttachedWindowToken;

    /* renamed from: f, reason: collision with root package name */
    public n0.f1 f91984f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public n0.g1 parentContext;

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f91986h;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public boolean showLayoutBounds;

    /* renamed from: m, reason: collision with root package name */
    public boolean f91988m;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC1058x6d8e7db5(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* renamed from: getDisposeViewCompositionStrategy$annotations */
    private static /* synthetic */ void m7009xadae8e2f() {
    }

    /* renamed from: getShowLayoutBounds$annotations */
    public static /* synthetic */ void m7010x9fb04b12() {
    }

    /* renamed from: setParentContext */
    private final void m7011xa609b463(n0.g1 g1Var) {
        if (this.parentContext != g1Var) {
            this.parentContext = g1Var;
            if (g1Var != null) {
                this.f91982d = null;
            }
            n0.f1 f1Var = this.f91984f;
            if (f1Var != null) {
                f1Var.mo7062x63a5261f();
                this.f91984f = null;
                if (isAttachedToWindow()) {
                    d();
                }
            }
        }
    }

    /* renamed from: setPreviousAttachedWindowToken */
    private final void m7012x1832016c(android.os.IBinder iBinder) {
        if (this.previousAttachedWindowToken != iBinder) {
            this.previousAttachedWindowToken = iBinder;
            this.f91982d = null;
        }
    }

    public abstract void a(n0.o oVar, int i17);

    @Override // android.view.ViewGroup
    public void addView(android.view.View view) {
        b();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(android.view.View view, int i17, android.view.ViewGroup.LayoutParams layoutParams) {
        b();
        return super.addViewInLayout(view, i17, layoutParams);
    }

    public final void b() {
        if (this.f91988m) {
            return;
        }
        throw new java.lang.UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void c() {
        if (!(this.parentContext != null || isAttachedToWindow())) {
            throw new java.lang.IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.".toString());
        }
        d();
    }

    public final void d() {
        if (this.f91984f == null) {
            try {
                this.f91988m = true;
                this.f91984f = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.s5.a(this, h(), u0.j.c(-656146368, true, new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.a(this)));
            } finally {
                this.f91988m = false;
            }
        }
    }

    public void e(boolean z17, int i17, int i18, int i19, int i27) {
        android.view.View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i19 - i17) - getPaddingRight(), (i27 - i18) - getPaddingBottom());
        }
    }

    public void f(int i17, int i18) {
        android.view.View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i17, i18);
            return;
        }
        childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.max(0, (android.view.View.MeasureSpec.getSize(i17) - getPaddingLeft()) - getPaddingRight()), android.view.View.MeasureSpec.getMode(i17)), android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.max(0, (android.view.View.MeasureSpec.getSize(i18) - getPaddingTop()) - getPaddingBottom()), android.view.View.MeasureSpec.getMode(i18)));
        setMeasuredDimension(childAt.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    public final boolean g(n0.g1 g1Var) {
        return !(g1Var instanceof n0.b4) || ((n0.o3) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((n0.b4) g1Var).f414991o).mo144003x754a37bb()).compareTo(n0.o3.ShuttingDown) > 0;
    }

    /* renamed from: getHasComposition */
    public final boolean m7013xb68d27a6() {
        return this.f91984f != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final n0.g1 h() {
        oz5.l lVar;
        final n0.b3 b3Var;
        n0.g1 g1Var = this.parentContext;
        if (g1Var == null) {
            g1Var = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k5.b(this);
            if (g1Var == null) {
                for (android.view.ViewParent parent = getParent(); g1Var == null && (parent instanceof android.view.View); parent = parent.getParent()) {
                    g1Var = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k5.b((android.view.View) parent);
                }
            }
            if (g1Var != null) {
                n0.g1 g1Var2 = g(g1Var) ? g1Var : null;
                if (g1Var2 != null) {
                    this.f91982d = new java.lang.ref.WeakReference(g1Var2);
                }
            } else {
                g1Var = null;
            }
            if (g1Var == null) {
                java.lang.ref.WeakReference weakReference = this.f91982d;
                if (weakReference == null || (g1Var = (n0.g1) weakReference.get()) == null || !g(g1Var)) {
                    g1Var = null;
                }
                if (g1Var == null) {
                    if (!isAttachedToWindow()) {
                        throw new java.lang.IllegalStateException(("Cannot locate windowRecomposer; View " + this + " is not attached to a window").toString());
                    }
                    java.lang.Object parent2 = getParent();
                    android.view.View view = this;
                    while (parent2 instanceof android.view.View) {
                        android.view.View view2 = (android.view.View) parent2;
                        if (view2.getId() == 16908290) {
                            break;
                        }
                        view = view2;
                        parent2 = view2.getParent();
                    }
                    n0.g1 b17 = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k5.b(view);
                    if (b17 == null) {
                        ((p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.x4) ((p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.z4) p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.c5.f92065a.get())).getClass();
                        oz5.m mVar = oz5.m.f431862d;
                        n0.q2 q2Var = n0.q2.f415218d;
                        jz5.g gVar = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.i1.f92120r;
                        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
                            lVar = (oz5.l) ((jz5.n) p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.i1.f92120r).mo141623x754a37bb();
                        } else {
                            lVar = (oz5.l) p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.i1.f92121s.get();
                            if (lVar == null) {
                                throw new java.lang.IllegalStateException("no AndroidUiDispatcher for this thread".toString());
                            }
                        }
                        oz5.l mo7096x348d9a = lVar.mo7096x348d9a(mVar);
                        n0.r2 r2Var = (n0.r2) mo7096x348d9a.get(q2Var);
                        if (r2Var != null) {
                            n0.b3 b3Var2 = new n0.b3(r2Var);
                            n0.n2 n2Var = b3Var2.f414974e;
                            synchronized (n2Var.f415155a) {
                                n2Var.f415158d = false;
                                b3Var = b3Var2;
                            }
                        } else {
                            b3Var = 0;
                        }
                        final p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
                        oz5.l lVar2 = (z0.v) mo7096x348d9a.get(z0.u.f550456d);
                        if (lVar2 == null) {
                            lVar2 = new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.o3();
                            h0Var.f391656d = lVar2;
                        }
                        if (b3Var != 0) {
                            mVar = b3Var;
                        }
                        oz5.l mo7096x348d9a2 = mo7096x348d9a.mo7096x348d9a(mVar).mo7096x348d9a(lVar2);
                        final n0.b4 b4Var = new n0.b4(mo7096x348d9a2);
                        final p3325xe03a0797.p3326xc267989b.y0 a17 = p3325xe03a0797.p3326xc267989b.z0.a(mo7096x348d9a2);
                        p012xc85e97e9.p093xedfae76a.y a18 = p012xc85e97e9.p093xedfae76a.n1.a(view);
                        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4 = a18 != null ? a18.mo273xed6858b4() : null;
                        if (mo273xed6858b4 == null) {
                            throw new java.lang.IllegalStateException(("ViewTreeLifecycleOwner not found from " + view).toString());
                        }
                        view.addOnAttachStateChangeListener(new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.d5(view, b4Var));
                        final android.view.View view3 = view;
                        mo273xed6858b4.a(new p012xc85e97e9.p093xedfae76a.v() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2
                            @Override // p012xc85e97e9.p093xedfae76a.v
                            /* renamed from: onStateChanged */
                            public void mo2520xaba1ac62(p012xc85e97e9.p093xedfae76a.y lifecycleOwner, p012xc85e97e9.p093xedfae76a.m event) {
                                boolean z17;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycleOwner, "lifecycleOwner");
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                                int i17 = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.e5.f92090a[event.ordinal()];
                                if (i17 == 1) {
                                    p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.y0.this, null, p3325xe03a0797.p3326xc267989b.a1.UNDISPATCHED, new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.h5(h0Var, b4Var, lifecycleOwner, this, view3, null), 1, null);
                                    return;
                                }
                                if (i17 != 2) {
                                    if (i17 != 3) {
                                        if (i17 != 4) {
                                            return;
                                        }
                                        b4Var.r();
                                        return;
                                    }
                                    n0.b3 b3Var3 = b3Var;
                                    if (b3Var3 != null) {
                                        n0.n2 n2Var2 = b3Var3.f414974e;
                                        synchronized (n2Var2.f415155a) {
                                            n2Var2.f415158d = false;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                n0.b3 b3Var4 = b3Var;
                                if (b3Var4 != null) {
                                    n0.n2 n2Var3 = b3Var4.f414974e;
                                    synchronized (n2Var3.f415155a) {
                                        synchronized (n2Var3.f415155a) {
                                            z17 = n2Var3.f415158d;
                                        }
                                        if (z17) {
                                            return;
                                        }
                                        java.util.List list = n2Var3.f415156b;
                                        n2Var3.f415156b = n2Var3.f415157c;
                                        n2Var3.f415157c = list;
                                        n2Var3.f415158d = true;
                                        int size = list.size();
                                        for (int i18 = 0; i18 < size; i18++) {
                                            p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) list.get(i18);
                                            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                                            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a));
                                        }
                                        list.clear();
                                    }
                                }
                            }
                        });
                        view.setTag(com.p314xaae8f345.mm.R.id.f564571ux, b4Var);
                        p3325xe03a0797.p3326xc267989b.i2 i2Var = p3325xe03a0797.p3326xc267989b.i2.f392010d;
                        android.os.Handler handler = view.getHandler();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(handler, "rootView.handler");
                        int i17 = t26.e.f496887a;
                        view.addOnAttachStateChangeListener(new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.a5(p3325xe03a0797.p3326xc267989b.l.d(i2Var, new t26.a(handler, "windowRecomposer cleanup", false).f496880h, null, new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.b5(b4Var, view, null), 2, null)));
                        g1Var = b4Var;
                    } else {
                        if (!(b17 instanceof n0.b4)) {
                            throw new java.lang.IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer".toString());
                        }
                        g1Var = (n0.b4) b17;
                    }
                    n0.g1 g1Var3 = g(g1Var) ? g1Var : null;
                    if (g1Var3 != null) {
                        this.f91982d = new java.lang.ref.WeakReference(g1Var3);
                    }
                }
            }
        }
        return g1Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m7012x1832016c(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            d();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        e(z17, i17, i18, i19, i27);
    }

    @Override // android.view.View
    public final void onMeasure(int i17, int i18) {
        d();
        f(i17, i18);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i17) {
        android.view.View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(i17);
    }

    /* renamed from: setParentCompositionContext */
    public final void m7016xae77971(n0.g1 g1Var) {
        m7011xa609b463(g1Var);
    }

    /* renamed from: setShowLayoutBounds */
    public final void m7017x4c87ee9e(boolean z17) {
        this.showLayoutBounds = z17;
        android.view.KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((u1.r1) childAt).mo7059x4c87ee9e(z17);
        }
    }

    /* renamed from: setViewCompositionStrategy */
    public final void m7018xdfef8d96(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.j4 strategy) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(strategy, "strategy");
        yz5.a aVar = this.f91986h;
        if (aVar != null) {
            ((p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.g4) aVar).mo152xb9724478();
        }
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.h4 h4Var = new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.h4(this);
        addOnAttachStateChangeListener(h4Var);
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.i4 i4Var = new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.i4(this);
        s3.a.b(this).f483913a.add(i4Var);
        this.f91986h = new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.g4(this, h4Var, i4Var);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public /* synthetic */ AbstractC1058x6d8e7db5(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1058x6d8e7db5(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        setClipChildren(false);
        setClipToPadding(false);
        int i18 = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.j4.f92147a;
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.h4 h4Var = new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.h4(this);
        addOnAttachStateChangeListener(h4Var);
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.i4 i4Var = new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.i4(this);
        s3.a.b(this).f483913a.add(i4Var);
        this.f91986h = new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.g4(this, h4Var, i4Var);
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i17) {
        b();
        super.addView(view, i17);
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(android.view.View view, int i17, android.view.ViewGroup.LayoutParams layoutParams, boolean z17) {
        b();
        return super.addViewInLayout(view, i17, layoutParams, z17);
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i17, int i18) {
        b();
        super.addView(view, i17, i18);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i17, android.view.ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, i17, layoutParams);
    }
}
