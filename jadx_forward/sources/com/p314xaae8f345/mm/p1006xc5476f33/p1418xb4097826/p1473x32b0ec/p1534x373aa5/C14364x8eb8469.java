package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019B!\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u001bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0002R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0013\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderMaxSizeLayout;", "Landroid/widget/FrameLayout;", "", "maxWidth", "Ljz5/f0;", "setMaxWidth", "getMaxWidth", "getMaxHeight", "", "e", "Z", "getDisallowInterceptTouch", "()Z", "setDisallowInterceptTouch", "(Z)V", "disallowInterceptTouch", "f", "getForbidHorizontalScroll", "setForbidHorizontalScroll", "forbidHorizontalScroll", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderMaxSizeLayout */
/* loaded from: classes3.dex */
public final class C14364x8eb8469 extends android.widget.FrameLayout {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f197653n = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f197654d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean disallowInterceptTouch;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean forbidHorizontalScroll;

    /* renamed from: g, reason: collision with root package name */
    public int f197657g;

    /* renamed from: h, reason: collision with root package name */
    public int f197658h;

    /* renamed from: i, reason: collision with root package name */
    public int f197659i;

    /* renamed from: m, reason: collision with root package name */
    public int f197660m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14364x8eb8469(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.f197654d = "Finder.FinderMaxSizeLayout";
        a(attrs, 0);
    }

    public final void a(android.util.AttributeSet attributeSet, int i17) {
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, vd2.x5.f517546h, i17, 0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
            this.f197657g = (int) obtainStyledAttributes.getDimension(0, 0.0f);
            this.f197658h = (int) obtainStyledAttributes.getDimension(1, 0.0f);
            obtainStyledAttributes.recycle();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f197654d, "[initAttribute],maxHeight:" + this.f197657g + ", maxWidth:" + this.f197658h);
        }
    }

    public final void b(int i17, boolean z17) {
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var;
        r45.nw1 nw1Var;
        this.f197657g = i17;
        dk2.ef efVar = dk2.ef.f314905a;
        mm2.e1 e1Var = (mm2.e1) efVar.i(mm2.e1.class);
        boolean z18 = false;
        int m75939xb282bd08 = (e1Var == null || (nw1Var = e1Var.f410521r) == null) ? 0 : nw1Var.m75939xb282bd08(37);
        boolean z19 = pm0.v.z(m75939xb282bd08, 65536);
        boolean z27 = getContext().getResources().getConfiguration().orientation == 2;
        mm2.e0 e0Var = (mm2.e0) efVar.i(mm2.e0.class);
        if (e0Var != null && (j2Var = e0Var.f410499f) != null && ((java.lang.Boolean) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).mo144003x754a37bb()).booleanValue()) {
            z18 = true;
        }
        java.lang.String str = "flag = " + m75939xb282bd08 + ", check = " + z19 + ", isLandScape = " + z27 + ", isBoxLive = " + z18;
        java.lang.String str2 = this.f197654d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
        if (z19 && !z27 && z17) {
            this.f197657g = i17 / 2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "[setMaxHeight],maxHeight:" + this.f197657g + ", maxWidth:" + this.f197658h);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(this.disallowInterceptTouch);
        if (this.forbidHorizontalScroll) {
            java.lang.Integer valueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getAction()) : null;
            if (valueOf != null && valueOf.intValue() == 0) {
                this.f197659i = (int) motionEvent.getX();
                this.f197660m = (int) motionEvent.getY();
                getParent().requestDisallowInterceptTouchEvent(true);
            } else if (valueOf != null && valueOf.intValue() == 2) {
                int x17 = (int) motionEvent.getX();
                if (java.lang.Math.abs(x17 - this.f197659i) > java.lang.Math.abs(((int) motionEvent.getY()) - this.f197660m)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f197654d, " canScrollHorizontally: " + canScrollHorizontally(this.f197659i - x17));
                    getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(this.f197659i - x17));
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean getDisallowInterceptTouch() {
        return this.disallowInterceptTouch;
    }

    public final boolean getForbidHorizontalScroll() {
        return this.forbidHorizontalScroll;
    }

    /* renamed from: getMaxHeight, reason: from getter */
    public final int getF197657g() {
        return this.f197657g;
    }

    /* renamed from: getMaxWidth, reason: from getter */
    public final int getF197658h() {
        return this.f197658h;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        int i19 = this.f197657g;
        if (i19 > 0) {
            i18 = android.view.View.MeasureSpec.makeMeasureSpec(i19, Integer.MIN_VALUE);
        }
        int i27 = this.f197658h;
        if (i27 > 0) {
            i17 = android.view.View.MeasureSpec.makeMeasureSpec(i27, 1073741824);
        }
        super.onMeasure(i17, i18);
    }

    /* renamed from: setDisallowInterceptTouch */
    public final void m57535x876afa(boolean z17) {
        this.disallowInterceptTouch = z17;
    }

    /* renamed from: setForbidHorizontalScroll */
    public final void m57536x1ff432c7(boolean z17) {
        this.forbidHorizontalScroll = z17;
    }

    /* renamed from: setMaxWidth */
    public final void m57537x8e6ff544(int i17) {
        this.f197658h = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f197654d, "[setMaxWidth],maxHeight:" + this.f197657g + ", maxWidth:" + i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14364x8eb8469(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.f197654d = "Finder.FinderMaxSizeLayout";
        a(attrs, i17);
    }
}
