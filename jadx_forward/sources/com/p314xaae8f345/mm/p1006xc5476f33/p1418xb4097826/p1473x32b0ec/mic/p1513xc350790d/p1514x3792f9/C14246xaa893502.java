package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0018\rB\u001b\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015B#\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¨\u0006\u0019"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/mic/voiceroom/wave/RipperAnimateView;", "Landroid/widget/FrameLayout;", "", "visible", "Ljz5/f0;", "setRipperVisible", "color", "setColor", "strokeWidth", "setStrokeWidth", "", "radius", "setInitRadius", "Ljj2/e;", "mode", "setAnimateMode", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "jj2/d", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView */
/* loaded from: classes10.dex */
public final class C14246xaa893502 extends android.widget.FrameLayout {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f193250o = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f193251d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f193252e;

    /* renamed from: f, reason: collision with root package name */
    public jj2.d f193253f;

    /* renamed from: g, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f193254g;

    /* renamed from: h, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.y0 f193255h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f193256i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f193257m;

    /* renamed from: n, reason: collision with root package name */
    public jj2.e f193258n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14246xaa893502(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setRipperVisible */
    public final void m56874xf2ebdd2c(int i17) {
        setVisibility(i17);
        int childCount = getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            android.view.View childAt = getChildAt(i18);
            if (childAt != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(i17));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(childAt, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/voiceroom/wave/RipperAnimateView", "setRipperVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                childAt.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(childAt, "com/tencent/mm/plugin/finder/live/mic/voiceroom/wave/RipperAnimateView", "setRipperVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    public final void b(p3325xe03a0797.p3326xc267989b.y0 y0Var) {
        if (y0Var == null) {
            oz5.i a17 = p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null);
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            y0Var = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) a17).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a));
        }
        this.f193255h = y0Var;
    }

    public final boolean c() {
        if (this.f193256i) {
            return true;
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f193254g;
        return r2Var != null && r2Var.a();
    }

    public final void d() {
        if (c() || !isAttachedToWindow()) {
            return;
        }
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f193255h;
        this.f193254g = y0Var != null ? p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new jj2.j(this, null), 3, null) : null;
    }

    public final void e(boolean z17) {
        this.f193256i = false;
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f193255h;
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new jj2.l(this, null), 3, null);
        }
        if (z17) {
            for (jj2.a aVar : this.f193252e) {
                java.lang.Object tag = aVar.getTag();
                android.animation.ValueAnimator valueAnimator = tag instanceof android.animation.ValueAnimator ? (android.animation.ValueAnimator) tag : null;
                if (valueAnimator != null) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stopAnimate anim cancel, ");
                    sb6.append(valueAnimator.isRunning());
                    sb6.append(" scope: ");
                    p3325xe03a0797.p3326xc267989b.y0 y0Var2 = this.f193255h;
                    sb6.append(y0Var2 != null ? java.lang.Boolean.valueOf(p3325xe03a0797.p3326xc267989b.z0.h(y0Var2)) : null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RipperAnimateView", sb6.toString());
                    valueAnimator.cancel();
                }
                aVar.setTag(null);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e(true);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        if (z17 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f193257m, "auto")) {
            float f17 = (i19 - i17) / 2.0f;
            java.lang.Float valueOf = java.lang.Float.valueOf(f17 - i65.a.b(getContext(), 8));
            if (!(valueOf.floatValue() > 0.0f)) {
                valueOf = null;
            }
            if (valueOf != null) {
                f17 = valueOf.floatValue();
            }
            m56877x290db7c4(f17);
        }
    }

    /* renamed from: setAnimateMode */
    public final void m56875xb4464262(jj2.e mode) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mode, "mode");
        this.f193258n = mode;
        removeAllViews();
        int i17 = jj2.f.f381515a[mode.ordinal()];
        java.util.LinkedList linkedList = this.f193252e;
        if (i17 == 1) {
            android.content.Context context = getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            jj2.d dVar = this.f193253f;
            if (dVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("initData");
                throw null;
            }
            jj2.b bVar = new jj2.b(context, dVar);
            android.content.Context context2 = getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            jj2.d dVar2 = this.f193253f;
            if (dVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("initData");
                throw null;
            }
            jj2.b bVar2 = new jj2.b(context2, dVar2);
            android.content.Context context3 = getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
            jj2.d dVar3 = this.f193253f;
            if (dVar3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("initData");
                throw null;
            }
            jj2.b bVar3 = new jj2.b(context3, dVar3);
            linkedList.add(bVar);
            linkedList.add(bVar2);
            linkedList.add(bVar3);
            addView(bVar, new android.widget.FrameLayout.LayoutParams(-1, -1));
            addView(bVar2, new android.widget.FrameLayout.LayoutParams(-1, -1));
            addView(bVar3, new android.widget.FrameLayout.LayoutParams(-1, -1));
            return;
        }
        android.content.Context context4 = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context4, "getContext(...)");
        jj2.d dVar4 = this.f193253f;
        if (dVar4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("initData");
            throw null;
        }
        jj2.c cVar = new jj2.c(context4, dVar4);
        android.content.Context context5 = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context5, "getContext(...)");
        jj2.d dVar5 = this.f193253f;
        if (dVar5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("initData");
            throw null;
        }
        jj2.c cVar2 = new jj2.c(context5, dVar5);
        android.content.Context context6 = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context6, "getContext(...)");
        jj2.d dVar6 = this.f193253f;
        if (dVar6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("initData");
            throw null;
        }
        jj2.c cVar3 = new jj2.c(context6, dVar6);
        linkedList.add(cVar);
        linkedList.add(cVar2);
        linkedList.add(cVar3);
        addView(cVar, new android.widget.FrameLayout.LayoutParams(-1, -1));
        addView(cVar2, new android.widget.FrameLayout.LayoutParams(-1, -1));
        addView(cVar3, new android.widget.FrameLayout.LayoutParams(-1, -1));
    }

    /* renamed from: setColor */
    public final void m56876x52d2f021(int i17) {
        if (i17 != -1) {
            jj2.d dVar = this.f193253f;
            if (dVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("initData");
                throw null;
            }
            dVar.f381508b = i17;
            if (c()) {
                return;
            }
            for (jj2.a aVar : this.f193251d) {
                jj2.d dVar2 = this.f193253f;
                if (dVar2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("initData");
                    throw null;
                }
                aVar.b(dVar2);
            }
        }
    }

    /* renamed from: setInitRadius */
    public final void m56877x290db7c4(float f17) {
        e(false);
        jj2.d dVar = this.f193253f;
        if (dVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("initData");
            throw null;
        }
        dVar.f381509c = f17;
        m56875xb4464262(this.f193258n);
    }

    /* renamed from: setStrokeWidth */
    public final void m56878xe2eaa4ac(int i17) {
        if (i17 > 0) {
            jj2.d dVar = this.f193253f;
            if (dVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("initData");
                throw null;
            }
            dVar.f381507a = i17;
            if (c()) {
                return;
            }
            for (jj2.a aVar : this.f193251d) {
                jj2.d dVar2 = this.f193253f;
                if (dVar2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("initData");
                    throw null;
                }
                aVar.b(dVar2);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14246xaa893502(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f193251d = new java.util.LinkedList();
        this.f193252e = new java.util.LinkedList();
        this.f193257m = "manual";
        this.f193258n = jj2.e.f381512d;
        android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, vd2.x5.f517548j);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        java.lang.String string = obtainStyledAttributes.getString(2);
        this.f193257m = string != null ? string : "manual";
        float dimension = obtainStyledAttributes.getDimension(1, 0.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(3, 0.0f);
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        this.f193253f = new jj2.d(dimension2, color, dimension, 255, android.graphics.Paint.Style.STROKE);
    }
}
