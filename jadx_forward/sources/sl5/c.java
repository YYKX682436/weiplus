package sl5;

/* loaded from: classes10.dex */
public final class c implements p012xc85e97e9.p103xe821e364.p104xd1075a44.v2, android.view.ScaleGestureDetector.OnScaleGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f490821d;

    /* renamed from: e, reason: collision with root package name */
    public final sl5.b f490822e;

    /* renamed from: f, reason: collision with root package name */
    public final sl5.a f490823f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.ScaleGestureDetector f490824g;

    /* renamed from: h, reason: collision with root package name */
    public int f490825h;

    /* renamed from: i, reason: collision with root package name */
    public int f490826i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f490827m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f490828n;

    /* renamed from: o, reason: collision with root package name */
    public float f490829o;

    /* renamed from: p, reason: collision with root package name */
    public int f490830p;

    public c(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, sl5.b callback, sl5.a config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        this.f490821d = recyclerView;
        this.f490822e = callback;
        this.f490823f = config;
        this.f490824g = new android.view.ScaleGestureDetector(recyclerView.getContext(), this);
        this.f490829o = 1.0f;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.v2
    public void a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, android.view.MotionEvent event) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(event);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/pinchzoom/PinchZoomGestureListener", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        d(event);
        yj0.a.h(this, "com/tencent/mm/ui/widget/pinchzoom/PinchZoomGestureListener", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.v2
    public boolean b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        d(event);
        return this.f490827m;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.v2
    public void c(boolean z17) {
    }

    public final void d(android.view.MotionEvent motionEvent) {
        android.view.ViewParent parent;
        int actionMasked = motionEvent.getActionMasked();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f490821d;
        if (actionMasked == 0) {
            this.f490827m = false;
            this.f490828n = false;
            this.f490826i = 0;
            this.f490829o = 1.0f;
            this.f490830p = 0;
            android.view.ViewParent parent2 = c1163xf1deaba4.getParent();
            if (parent2 != null) {
                parent2.requestDisallowInterceptTouchEvent(false);
            }
        } else if (actionMasked == 5) {
            this.f490827m = true;
            android.view.ViewParent parent3 = c1163xf1deaba4.getParent();
            if (parent3 != null) {
                parent3.requestDisallowInterceptTouchEvent(true);
            }
        } else if (actionMasked == 6 && motionEvent.getPointerCount() <= 2 && this.f490828n && (parent = c1163xf1deaba4.getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        if (motionEvent.getPointerCount() >= 2) {
            this.f490824g.onTouchEvent(motionEvent);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onScale(android.view.ScaleGestureDetector r38) {
        /*
            Method dump skipped, instructions count: 1140
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sl5.c.onScale(android.view.ScaleGestureDetector):boolean");
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(android.view.ScaleGestureDetector detector) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(detector, "detector");
        this.f490827m = true;
        this.f490826i = 0;
        this.f490828n = false;
        this.f490829o = 1.0f;
        this.f490830p = 0;
        android.view.ViewParent parent = this.f490821d.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(android.view.ScaleGestureDetector detector) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(detector, "detector");
        if (this.f490828n || this.f490826i == 0) {
            return;
        }
        float scaleFactor = detector.getScaleFactor();
        sl5.g gVar = ((sl5.f) this.f490822e).f490836a;
        int i17 = gVar.f490842f;
        if (i17 == 0) {
            return;
        }
        float f17 = gVar.f490841e * scaleFactor;
        gVar.f490841e = f17;
        float a17 = h3.a.a(i17 > 0 ? f17 - 1.0f : 1.0f - f17, 0.0f, 1.0f);
        boolean z17 = a17 >= gVar.f490838b.f490817b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PinchZoomManager", "onScaleEnd: progress=" + a17 + ", apply=" + z17);
        tl5.s sVar = gVar.f490839c;
        int ordinal = sVar.f501920c.ordinal();
        if (ordinal == 1) {
            sVar.f501930m = new tl5.k(z17, a17);
            sVar.f501929l = a17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PinchZoomEngine", "endTransition: deferred (PREPARING), apply=" + z17);
            if (!sVar.f501928k) {
                sVar.d();
            }
        } else if (ordinal != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("PinchZoomEngine", "endTransition: unexpected state=" + sVar.f501920c);
        } else {
            sVar.c(z17, a17);
        }
        gVar.f490841e = 1.0f;
        gVar.f490842f = 0;
    }
}
