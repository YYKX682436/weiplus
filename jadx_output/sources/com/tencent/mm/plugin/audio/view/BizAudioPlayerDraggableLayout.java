package com.tencent.mm.plugin.audio.view;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b/\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010d\u001a\u00020c\u0012\b\u0010f\u001a\u0004\u0018\u00010e¢\u0006\u0004\bg\u0010hB#\b\u0016\u0012\u0006\u0010d\u001a\u00020c\u0012\b\u0010f\u001a\u0004\u0018\u00010e\u0012\u0006\u0010i\u001a\u00020\u001a¢\u0006\u0004\bg\u0010jJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0006\u0010\b\u001a\u00020\u0003J\u0006\u0010\t\u001a\u00020\u0003J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0003R\"\u0010\u0012\u001a\u00020\u000f8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0019\u001a\u00020\u000f8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\"\u0010!\u001a\u00020\u001a8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010(\u001a\u00020\u00038\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010,\u001a\u00020\u00038\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b)\u0010#\u001a\u0004\b*\u0010%\"\u0004\b+\u0010'R\u001a\u00102\u001a\u00020-8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R \u00108\u001a\b\u0012\u0004\u0012\u00020\n038\u0004X\u0084\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R*\u0010;\u001a\u00020\u000f2\u0006\u00109\u001a\u00020\u000f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010\u0011\u001a\u0004\b;\u0010\u0013\"\u0004\b<\u0010\u0015R\"\u0010@\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010#\u001a\u0004\b>\u0010%\"\u0004\b?\u0010'R\"\u0010D\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010#\u001a\u0004\bB\u0010%\"\u0004\bC\u0010'R\"\u0010H\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010\u0011\u001a\u0004\bF\u0010\u0013\"\u0004\bG\u0010\u0015R\u0014\u0010J\u001a\u00020\u00038DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bI\u0010%R\u0014\u0010L\u001a\u00020\u00038DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bK\u0010%R\u0014\u0010N\u001a\u00020\u00038DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bM\u0010%R\u0014\u0010P\u001a\u00020\u00038DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bO\u0010%R\u0014\u0010R\u001a\u00020\u001a8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010\u001eR\u0014\u0010T\u001a\u00020\u001a8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bS\u0010\u001eR\u0011\u0010V\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bU\u0010%R\u0011\u0010X\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bW\u0010%R\u0011\u0010Z\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bY\u0010%R\u0011\u0010\\\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b[\u0010%R\u0011\u0010^\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b]\u0010%R\u0011\u0010`\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b_\u0010\u0013R$\u0010\r\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\ba\u0010%\"\u0004\bb\u0010'¨\u0006k"}, d2 = {"Lcom/tencent/mm/plugin/audio/view/BizAudioPlayerDraggableLayout;", "Landroid/widget/FrameLayout;", "Landroid/view/GestureDetector$OnGestureListener;", "", "height", "Ljz5/f0;", "setPeekHeight", "setExpandHeight", "getPeekHeight", "getExpandHeight", "Landroid/view/View;", "view", "setContentView", "translation", "setTran", "", "g", "Z", "isSettling", "()Z", "setSettling", "(Z)V", "h", "getHasResetTranslation", "setHasResetTranslation", "hasResetTranslation", "", "i", "I", "getEdgeAttached", "()I", "setEdgeAttached", "(I)V", "edgeAttached", "m", "F", "getDownX", "()F", "setDownX", "(F)V", "downX", "n", "getDownY", "setDownY", "downY", "Landroid/view/GestureDetector;", "o", "Landroid/view/GestureDetector;", "getGestureDetector", "()Landroid/view/GestureDetector;", "gestureDetector", "", "p", "Ljava/util/Set;", "getAttachedViews", "()Ljava/util/Set;", "attachedViews", "value", "q", "isDrawerOpen", "setDrawerOpen", "r", "getOriginalTranslationX", "setOriginalTranslationX", "originalTranslationX", "s", "getOriginalTranslationY", "setOriginalTranslationY", "originalTranslationY", "t", "getCancelSettleOnDown", "setCancelSettleOnDown", "cancelSettleOnDown", "getBorderLeft", "borderLeft", "getBorderRight", "borderRight", "getBorderTop", "borderTop", "getBorderBottom", "borderBottom", "getEdgeLow", "edgeLow", "getEdgeHigh", "edgeHigh", "getBorderLow", "borderLow", "getBorderHigh", "borderHigh", "getBorderPeek", "borderPeek", "getBorderClose", "borderClose", "getBorderExpand", "borderExpand", "getCanPeek", "canPeek", "getTranslation", "setTranslation", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-brandservice_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public abstract class BizAudioPlayerDraggableLayout extends android.widget.FrameLayout implements android.view.GestureDetector.OnGestureListener {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f92492u = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f92493d;

    /* renamed from: e, reason: collision with root package name */
    public float f92494e;

    /* renamed from: f, reason: collision with root package name */
    public float f92495f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean isSettling;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public boolean hasResetTranslation;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public int edgeAttached;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public float downX;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public float downY;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final android.view.GestureDetector gestureDetector;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final java.util.Set attachedViews;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public boolean isDrawerOpen;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public float originalTranslationX;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public float originalTranslationY;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public boolean cancelSettleOnDown;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BizAudioPlayerDraggableLayout(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f92495f = -1.0f;
        this.edgeAttached = 2;
        this.gestureDetector = new android.view.GestureDetector(getContext(), this);
        this.attachedViews = new java.util.LinkedHashSet();
        this.cancelSettleOnDown = true;
    }

    public final boolean a() {
        int i17 = this.edgeAttached;
        return i17 == -1 || i17 == 1;
    }

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public abstract boolean f(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18);

    public abstract boolean g(boolean z17, float f17);

    public final java.util.Set<android.view.View> getAttachedViews() {
        return this.attachedViews;
    }

    public final float getBorderBottom() {
        return this.edgeAttached == 2 ? this.originalTranslationY : this.originalTranslationY + this.f92494e;
    }

    public final float getBorderClose() {
        return this.edgeAttached == getEdgeLow() ? getBorderLow() : getBorderHigh();
    }

    public final float getBorderExpand() {
        return this.edgeAttached == getEdgeLow() ? getBorderHigh() : getBorderLow();
    }

    public final float getBorderHigh() {
        return a() ? getBorderRight() : getBorderBottom();
    }

    public final float getBorderLeft() {
        return this.edgeAttached == 1 ? this.originalTranslationX - this.f92494e : this.originalTranslationX;
    }

    public final float getBorderLow() {
        return a() ? getBorderLeft() : getBorderTop();
    }

    public final float getBorderPeek() {
        float borderLow;
        float f17;
        int i17 = this.edgeAttached;
        if (i17 == -2 || i17 == -1) {
            borderLow = getBorderLow();
            f17 = this.f92495f;
        } else {
            if (i17 == 1 || i17 == 2) {
                return getBorderHigh() - this.f92495f;
            }
            borderLow = getBorderLow();
            f17 = this.f92495f;
        }
        return borderLow + f17;
    }

    public final float getBorderRight() {
        return this.edgeAttached == 1 ? this.originalTranslationX : this.originalTranslationX + this.f92494e;
    }

    public final float getBorderTop() {
        return this.edgeAttached == 2 ? this.originalTranslationY - this.f92494e : this.originalTranslationY;
    }

    public final boolean getCanPeek() {
        return !(this.f92495f == -1.0f);
    }

    public final boolean getCancelSettleOnDown() {
        return this.cancelSettleOnDown;
    }

    public final float getDownX() {
        return this.downX;
    }

    public final float getDownY() {
        return this.downY;
    }

    public final int getEdgeAttached() {
        return this.edgeAttached;
    }

    public final int getEdgeHigh() {
        return a() ? 1 : 2;
    }

    public final int getEdgeLow() {
        return a() ? -1 : -2;
    }

    /* renamed from: getExpandHeight, reason: from getter */
    public final float getF92494e() {
        return this.f92494e;
    }

    public final android.view.GestureDetector getGestureDetector() {
        return this.gestureDetector;
    }

    public final boolean getHasResetTranslation() {
        return this.hasResetTranslation;
    }

    public final float getOriginalTranslationX() {
        return this.originalTranslationX;
    }

    public final float getOriginalTranslationY() {
        return this.originalTranslationY;
    }

    /* renamed from: getPeekHeight, reason: from getter */
    public final float getF92495f() {
        return this.f92495f;
    }

    public final float getTranslation() {
        if (a()) {
            android.view.View view = this.f92493d;
            if (view != null) {
                return view.getTranslationX();
            }
            kotlin.jvm.internal.o.o("contentView");
            throw null;
        }
        android.view.View view2 = this.f92493d;
        if (view2 != null) {
            return view2.getTranslationY();
        }
        kotlin.jvm.internal.o.o("contentView");
        throw null;
    }

    public abstract boolean h(android.view.MotionEvent motionEvent);

    public abstract void i(float f17, java.lang.String str);

    public final void j(int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("Finder.BizAudioPlayerDraggableLayout", "settle isSettling = " + this.isSettling + ", dir=" + i17 + ", isTotally=" + z17);
        if (!this.hasResetTranslation || this.isSettling) {
            return;
        }
        this.isSettling = true;
        float borderLow = getBorderLow();
        float borderHigh = getBorderHigh();
        if (getCanPeek() && !z17) {
            borderLow = getBorderLow();
            borderHigh = getBorderPeek();
        }
        float translation = (borderHigh - getTranslation()) / (borderHigh - borderLow);
        if (i17 == 0) {
            i17 = java.lang.Float.compare(translation, 0.9f) > 0 ? getEdgeLow() : getEdgeHigh();
        }
        if (i17 != getEdgeLow()) {
            borderLow = borderHigh;
        }
        com.tencent.mars.xlog.Log.i("Finder.BizAudioPlayerDraggableLayout", "settle percent = " + translation);
        android.view.animation.Interpolator loadInterpolator = android.view.animation.AnimationUtils.loadInterpolator(getContext(), com.tencent.mm.R.anim.f477822cg);
        float translation2 = borderLow - getTranslation();
        if (translation2 == 0.0f) {
            this.isSettling = false;
        }
        android.view.View view = this.f92493d;
        if (view == null) {
            kotlin.jvm.internal.o.o("contentView");
            throw null;
        }
        android.view.ViewPropertyAnimator translationX = a() ? view.animate().translationX(borderLow) : view.animate().translationY(borderLow);
        kotlin.jvm.internal.o.d(translationX);
        android.view.animation.Interpolator interpolator = loadInterpolator;
        translationX.setDuration(300L).setInterpolator(interpolator).setUpdateListener(new bn1.d(this)).setListener(new bn1.e(this, i17)).start();
        for (android.view.View view2 : this.attachedViews) {
            android.view.ViewPropertyAnimator translationXBy = a() ? view2.animate().translationXBy(translation2) : view2.animate().translationYBy(translation2);
            kotlin.jvm.internal.o.d(translationXBy);
            translationXBy.setDuration(200L).setInterpolator(interpolator).start();
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(e17, "e");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent e27, float f17, float f18) {
        kotlin.jvm.internal.o.g(e27, "e2");
        com.tencent.mars.xlog.Log.i("Finder.BizAudioPlayerDraggableLayout", "onFling vx = " + f17 + ", vy = " + f18);
        if (!f(motionEvent, e27, f17, f18)) {
            return false;
        }
        if (a() && java.lang.Math.abs(f17) > 400.0f) {
            j(f17 > 0.0f ? 1 : -1, !getCanPeek());
        } else if (!a() && java.lang.Math.abs(f18) > 800.0f) {
            j(f18 > 0.0f ? 2 : -2, !getCanPeek());
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.downX = motionEvent.getX();
            this.downY = motionEvent.getY();
        } else if (action == 1) {
            this.downX = 0.0f;
            this.downY = 0.0f;
        } else if (action == 3) {
            this.downX = 0.0f;
            this.downY = 0.0f;
        }
        if (h(motionEvent)) {
            android.view.GestureDetector gestureDetector = this.gestureDetector;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(motionEvent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/plugin/audio/view/BizAudioPlayerDraggableLayout", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            boolean onTouchEvent = gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0));
            yj0.a.g(gestureDetector, onTouchEvent, "com/tencent/mm/plugin/audio/view/BizAudioPlayerDraggableLayout", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            if (onTouchEvent) {
                return true;
            }
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        com.tencent.mars.xlog.Log.i("Finder.BizAudioPlayerDraggableLayout", "onInterceptTouchEvent e.action=" + motionEvent.getAction() + " ret=" + onInterceptTouchEvent);
        return onInterceptTouchEvent;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent e17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/audio/view/BizAudioPlayerDraggableLayout", "android/view/GestureDetector$OnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        kotlin.jvm.internal.o.g(e17, "e");
        yj0.a.h(this, "com/tencent/mm/plugin/audio/view/BizAudioPlayerDraggableLayout", "android/view/GestureDetector$OnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent e27, float f17, float f18) {
        kotlin.jvm.internal.o.g(e27, "e2");
        float f19 = a() ? f17 : f18;
        boolean z17 = java.lang.Math.abs(f17) > java.lang.Math.abs(f18);
        if (g(z17, f19) && a() == z17) {
            float translation = getTranslation() - java.lang.Math.min(getCanPeek() ? getBorderPeek() : getBorderHigh(), java.lang.Math.max(getBorderLow(), getTranslation() - f19));
            com.tencent.mars.xlog.Log.i("Finder.BizAudioPlayerDraggableLayout", "onScroll isHorizontal = " + z17 + " exactlyMoved = " + translation);
            if (java.lang.Float.compare(java.lang.Math.abs(translation), 0.01f) > 0) {
                setTranslation(getTranslation() - translation);
                boolean a17 = a();
                java.util.Set<android.view.View> set = this.attachedViews;
                if (a17) {
                    for (android.view.View view : set) {
                        view.setTranslationX(view.getTranslationX() - translation);
                    }
                } else {
                    for (android.view.View view2 : set) {
                        view2.setTranslationY(view2.getTranslationY() - translation);
                    }
                }
                i(getTranslation(), "onScroll");
                return true;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(e17, "e");
    }

    public boolean onSingleTapUp(android.view.MotionEvent e17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/audio/view/BizAudioPlayerDraggableLayout", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        kotlin.jvm.internal.o.g(e17, "e");
        yj0.a.i(false, this, "com/tencent/mm/plugin/audio/view/BizAudioPlayerDraggableLayout", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(e17, "e");
        android.view.GestureDetector gestureDetector = this.gestureDetector;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/plugin/audio/view/BizAudioPlayerDraggableLayout", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        boolean onTouchEvent = gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0));
        yj0.a.g(gestureDetector, onTouchEvent, "com/tencent/mm/plugin/audio/view/BizAudioPlayerDraggableLayout", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        if (e17.getAction() == 1 || e17.getAction() == 3) {
            j(0, false);
        }
        return onTouchEvent;
    }

    public final void setCancelSettleOnDown(boolean z17) {
        this.cancelSettleOnDown = z17;
    }

    public final void setContentView(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        if (!kotlin.jvm.internal.o.b(view.getParent(), this)) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            com.tencent.mars.xlog.Log.e("Finder.BizAudioPlayerDraggableLayout", "setContentView contentView should be child of FinderDrawerLayout");
        }
        this.f92493d = view;
    }

    public final void setDownX(float f17) {
        this.downX = f17;
    }

    public final void setDownY(float f17) {
        this.downY = f17;
    }

    public final void setDrawerOpen(boolean z17) {
        boolean z18 = this.isDrawerOpen != z17;
        this.isDrawerOpen = z17;
        if (z18) {
            if (z17) {
                d();
            } else {
                b();
            }
        }
    }

    public final void setEdgeAttached(int i17) {
        this.edgeAttached = i17;
    }

    public void setExpandHeight(float f17) {
        this.f92494e = f17;
        android.view.View view = this.f92493d;
        if (view == null) {
            kotlin.jvm.internal.o.o("contentView");
            throw null;
        }
        view.setTranslationX(0.0f);
        android.view.View view2 = this.f92493d;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("contentView");
            throw null;
        }
        view2.setTranslationY(0.0f);
        int i17 = this.edgeAttached;
        if (i17 == -2) {
            android.view.View view3 = this.f92493d;
            if (view3 == null) {
                kotlin.jvm.internal.o.o("contentView");
                throw null;
            }
            view3.setTranslationY(view3.getTranslationY() - this.f92494e);
        } else if (i17 == -1) {
            android.view.View view4 = this.f92493d;
            if (view4 == null) {
                kotlin.jvm.internal.o.o("contentView");
                throw null;
            }
            view4.setTranslationX(view4.getTranslationX() - this.f92494e);
        } else if (i17 == 1) {
            android.view.View view5 = this.f92493d;
            if (view5 == null) {
                kotlin.jvm.internal.o.o("contentView");
                throw null;
            }
            view5.setTranslationX(view5.getTranslationX() + this.f92494e);
        } else if (i17 == 2) {
            android.view.View view6 = this.f92493d;
            if (view6 == null) {
                kotlin.jvm.internal.o.o("contentView");
                throw null;
            }
            view6.setTranslationY(view6.getTranslationY() + this.f92494e);
        }
        android.view.View view7 = this.f92493d;
        if (view7 == null) {
            kotlin.jvm.internal.o.o("contentView");
            throw null;
        }
        this.originalTranslationX = view7.getTranslationX();
        android.view.View view8 = this.f92493d;
        if (view8 == null) {
            kotlin.jvm.internal.o.o("contentView");
            throw null;
        }
        this.originalTranslationY = view8.getTranslationY();
        this.hasResetTranslation = true;
        i(getTranslation(), "resetTranslation");
    }

    public final void setHasResetTranslation(boolean z17) {
        this.hasResetTranslation = z17;
    }

    public final void setOriginalTranslationX(float f17) {
        this.originalTranslationX = f17;
    }

    public final void setOriginalTranslationY(float f17) {
        this.originalTranslationY = f17;
    }

    public final void setPeekHeight(float f17) {
        this.f92495f = f17;
    }

    public final void setSettling(boolean z17) {
        this.isSettling = z17;
    }

    public final void setTran(float f17) {
        this.isSettling = true;
        android.view.animation.Interpolator loadInterpolator = android.view.animation.AnimationUtils.loadInterpolator(getContext(), com.tencent.mm.R.anim.f477822cg);
        android.view.View view = this.f92493d;
        if (view == null) {
            kotlin.jvm.internal.o.o("contentView");
            throw null;
        }
        android.view.ViewPropertyAnimator translationX = a() ? view.animate().translationX(f17) : view.animate().translationY(f17);
        kotlin.jvm.internal.o.d(translationX);
        translationX.setDuration(200L).setInterpolator(loadInterpolator).setUpdateListener(new bn1.b(this, f17)).setListener(new bn1.c(this)).start();
    }

    public final void setTranslation(float f17) {
        if (a()) {
            android.view.View view = this.f92493d;
            if (view != null) {
                view.setTranslationX(f17);
                return;
            } else {
                kotlin.jvm.internal.o.o("contentView");
                throw null;
            }
        }
        android.view.View view2 = this.f92493d;
        if (view2 != null) {
            view2.setTranslationY(f17);
        } else {
            kotlin.jvm.internal.o.o("contentView");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BizAudioPlayerDraggableLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f92495f = -1.0f;
        this.edgeAttached = 2;
        this.gestureDetector = new android.view.GestureDetector(getContext(), this);
        this.attachedViews = new java.util.LinkedHashSet();
        this.cancelSettleOnDown = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BizAudioPlayerDraggableLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f92495f = -1.0f;
        this.edgeAttached = 2;
        this.gestureDetector = new android.view.GestureDetector(getContext(), this);
        this.attachedViews = new java.util.LinkedHashSet();
        this.cancelSettleOnDown = true;
    }
}
