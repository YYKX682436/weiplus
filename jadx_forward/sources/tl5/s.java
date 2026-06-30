package tl5;

/* loaded from: classes10.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final sl5.d f501918a;

    /* renamed from: b, reason: collision with root package name */
    public final sl5.a f501919b;

    /* renamed from: c, reason: collision with root package name */
    public tl5.l f501920c;

    /* renamed from: d, reason: collision with root package name */
    public tl5.d f501921d;

    /* renamed from: e, reason: collision with root package name */
    public tl5.c f501922e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f501923f;

    /* renamed from: g, reason: collision with root package name */
    public tl5.a f501924g;

    /* renamed from: h, reason: collision with root package name */
    public int f501925h;

    /* renamed from: i, reason: collision with root package name */
    public int f501926i;

    /* renamed from: j, reason: collision with root package name */
    public java.util.List f501927j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f501928k;

    /* renamed from: l, reason: collision with root package name */
    public float f501929l;

    /* renamed from: m, reason: collision with root package name */
    public tl5.k f501930m;

    public s(sl5.d host, sl5.a config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        this.f501918a = host;
        this.f501919b = config;
        this.f501920c = tl5.l.f501902d;
    }

    public final void a(boolean z17) {
        tl5.a aVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PinchZoomEngine", "finishTransition: applied=" + z17);
        java.lang.ref.WeakReference weakReference = this.f501923f;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = weakReference != null ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) weakReference.get() : null;
        if (c1163xf1deaba4 != null) {
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                c1163xf1deaba4.suppressLayout(false);
            } else {
                c1163xf1deaba4.mo7966xf161ffec(false);
            }
        }
        sl5.d dVar = this.f501918a;
        if (z17 && (aVar = this.f501924g) != null && c1163xf1deaba4 != null) {
            int i17 = this.f501926i;
            cd5.a aVar2 = (cd5.a) dVar;
            aVar2.f(i17, aVar.f501863a, aVar.f501864b);
            yz5.l lVar = aVar2.f122193b;
            if (lVar != null) {
                lVar.mo146xb9724478(java.lang.Integer.valueOf(i17));
            }
        }
        tl5.c cVar = this.f501922e;
        if (cVar != null) {
            cVar.a();
        }
        this.f501922e = null;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3 activityC21814x1938a8b3 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) ((cd5.a) dVar).f122192a;
        activityC21814x1938a8b3.x7(false);
        activityC21814x1938a8b3.z7();
        if (c1163xf1deaba4 != null) {
            b(c1163xf1deaba4, 0);
            c1163xf1deaba4.post(new tl5.n(this, c1163xf1deaba4));
            return;
        }
        this.f501921d = null;
        this.f501920c = tl5.l.f501902d;
        this.f501925h = 0;
        this.f501926i = 0;
        this.f501924g = null;
        this.f501927j = null;
        this.f501928k = false;
        this.f501929l = 0.0f;
        this.f501930m = null;
        java.lang.ref.WeakReference weakReference2 = this.f501923f;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.f501923f = null;
    }

    public final void b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17) {
        int childCount = c1163xf1deaba4.getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            android.view.View childAt = c1163xf1deaba4.getChildAt(i18);
            if (childAt != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(i17));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(childAt, arrayList.toArray(), "com/tencent/mm/ui/widget/pinchzoom/transition/PinchZoomTransitionEngine", "setChildrenVisibility", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                childAt.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(childAt, "com/tencent/mm/ui/widget/pinchzoom/transition/PinchZoomTransitionEngine", "setChildrenVisibility", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    public final void c(boolean z17, float f17) {
        java.lang.ref.WeakReference weakReference = this.f501923f;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = weakReference != null ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) weakReference.get() : null;
        if (c1163xf1deaba4 == null) {
            a(false);
            return;
        }
        this.f501920c = tl5.l.f501905g;
        float f18 = z17 ? 1.0f : 0.0f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PinchZoomEngine", "startAutoTransition: " + f17 + (char) 8594 + f18 + ", apply=" + z17);
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            c1163xf1deaba4.suppressLayout(true);
        } else {
            c1163xf1deaba4.mo7966xf161ffec(true);
        }
        tl5.c cVar = this.f501922e;
        if (cVar != null) {
            cVar.a();
        }
        tl5.c cVar2 = new tl5.c(c1163xf1deaba4, this.f501919b.f490818c, new tl5.p(this), new tl5.q(this, z17));
        cVar2.a();
        cVar2.f501871i = f18;
        cVar2.f501870h.startScroll((int) (f17 * 1.0E8f), 0, (int) ((f18 - f17) * 1.0E8f), 0, cVar2.f501866d);
        android.view.View view = (android.view.View) cVar2.f501869g.get();
        if (view != null) {
            view.postOnAnimation(cVar2);
        }
        this.f501922e = cVar2;
    }

    public final void d() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4;
        tl5.a aVar;
        this.f501928k = true;
        java.lang.ref.WeakReference weakReference = this.f501923f;
        if (weakReference == null || (c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) weakReference.get()) == null || (aVar = this.f501924g) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PinchZoomEngine", "startToSideCollection: switching to spanCount=" + this.f501926i);
        ((cd5.a) this.f501918a).f(this.f501926i, aVar.f501863a, aVar.f501864b);
        c1163xf1deaba4.getViewTreeObserver().addOnGlobalLayoutListener(new tl5.r(c1163xf1deaba4, this));
        c1163xf1deaba4.requestLayout();
    }
}
