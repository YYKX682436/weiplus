package fr5;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final fr5.c f347453a;

    /* renamed from: b, reason: collision with root package name */
    public final int f347454b;

    /* renamed from: c, reason: collision with root package name */
    public final int f347455c;

    /* renamed from: d, reason: collision with root package name */
    public float f347456d;

    /* renamed from: e, reason: collision with root package name */
    public float f347457e;

    /* renamed from: f, reason: collision with root package name */
    public float f347458f;

    /* renamed from: g, reason: collision with root package name */
    public int f347459g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.GestureDetector f347460h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f347461i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f347462j;

    /* renamed from: k, reason: collision with root package name */
    public float f347463k;

    /* renamed from: l, reason: collision with root package name */
    public float f347464l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f347465m;

    /* renamed from: n, reason: collision with root package name */
    public float f347466n;

    /* renamed from: o, reason: collision with root package name */
    public float f347467o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f347468p;

    public f(android.content.Context mContext, fr5.c mListener, android.os.Handler handler, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        handler = (i17 & 4) != 0 ? null : handler;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mContext, "mContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mListener, "mListener");
        this.f347453a = mListener;
        int scaledTouchSlop = android.view.ViewConfiguration.get(mContext).getScaledTouchSlop() * 2;
        this.f347454b = scaledTouchSlop;
        this.f347455c = scaledTouchSlop;
        int i18 = mContext.getApplicationInfo().targetSdkVersion;
        if (i18 > 18) {
            this.f347462j = true;
            if (this.f347460h == null) {
                this.f347460h = new android.view.GestureDetector(mContext, new fr5.e(this), handler);
            }
        }
        if (i18 > 22) {
            this.f347465m = true;
        }
    }

    public final boolean a() {
        return this.f347459g != 0;
    }

    public final boolean b(android.view.MotionEvent event) {
        float f17;
        float f18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        event.getEventTime();
        int actionMasked = event.getActionMasked();
        boolean z17 = false;
        if (this.f347462j) {
            android.view.GestureDetector gestureDetector = this.f347460h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(gestureDetector);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(event);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/zoomimage/view/zoom/internal/FasterScaleGestureDetector", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0)), "com/tencent/mm/zoomimage/view/zoom/internal/FasterScaleGestureDetector", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        }
        int pointerCount = event.getPointerCount();
        boolean z18 = (event.getButtonState() & 32) != 0;
        boolean z19 = this.f347459g == 2 && !z18;
        boolean z27 = actionMasked == 1 || actionMasked == 3 || z19;
        fr5.c cVar = this.f347453a;
        float f19 = 0.0f;
        if (actionMasked == 0 || z27) {
            if (this.f347468p) {
                fr5.d dVar = (fr5.d) cVar;
                dVar.getClass();
                yz5.l lVar = dVar.f347444c;
                if (lVar != null) {
                    lVar.mo146xb9724478(this);
                }
                this.f347468p = false;
                this.f347456d = 0.0f;
                this.f347459g = 0;
            } else if (a() && z27) {
                this.f347468p = false;
                this.f347456d = 0.0f;
                this.f347459g = 0;
            }
            if (z27) {
                return true;
            }
        }
        if (!this.f347468p && this.f347465m && !a() && !z27 && z18) {
            this.f347457e = event.getX();
            this.f347458f = event.getY();
            this.f347459g = 2;
            this.f347456d = 0.0f;
        }
        boolean z28 = actionMasked == 0 || actionMasked == 6 || actionMasked == 5 || z19;
        boolean z29 = actionMasked == 6;
        int actionIndex = z29 ? event.getActionIndex() : -1;
        int i17 = z29 ? pointerCount - 1 : pointerCount;
        if (a()) {
            f18 = this.f347457e;
            f17 = this.f347458f;
            this.f347461i = event.getY() < f17;
        } else {
            float f27 = 0.0f;
            float f28 = 0.0f;
            for (int i18 = 0; i18 < pointerCount; i18++) {
                if (actionIndex != i18) {
                    f27 += event.getX(i18);
                    f28 += event.getY(i18);
                }
            }
            float f29 = i17;
            float f37 = f27 / f29;
            f17 = f28 / f29;
            f18 = f37;
        }
        float f38 = 0.0f;
        for (int i19 = 0; i19 < pointerCount; i19++) {
            if (actionIndex != i19) {
                f19 += java.lang.Math.abs(event.getX(i19) - f18);
                f38 += java.lang.Math.abs(event.getY(i19) - f17);
            }
        }
        float f39 = i17;
        float f47 = f19 / f39;
        float f48 = f38 / f39;
        float f49 = 2;
        float f57 = f47 * f49;
        float f58 = f48 * f49;
        if (!a()) {
            f58 = (float) java.lang.Math.hypot(f57, f58);
        }
        boolean z37 = this.f347468p;
        this.f347463k = f18;
        this.f347464l = f17;
        boolean a17 = a();
        int i27 = this.f347455c;
        if (!a17 && this.f347468p && (f58 < i27 || z28)) {
            fr5.d dVar2 = (fr5.d) cVar;
            dVar2.getClass();
            yz5.l lVar2 = dVar2.f347444c;
            if (lVar2 != null) {
                lVar2.mo146xb9724478(this);
            }
            this.f347468p = false;
            this.f347456d = f58;
        }
        if (z28) {
            this.f347466n = f58;
            this.f347467o = f58;
            this.f347456d = f58;
        }
        boolean a18 = a();
        int i28 = this.f347454b;
        if (a18) {
            i27 = i28;
        }
        if (!this.f347468p && f58 >= i27 && (z37 || java.lang.Math.abs(f58 - this.f347456d) > i28)) {
            this.f347466n = f58;
            this.f347467o = f58;
            fr5.d dVar3 = (fr5.d) cVar;
            dVar3.getClass();
            yz5.l lVar3 = dVar3.f347443b;
            this.f347468p = lVar3 != null ? ((java.lang.Boolean) lVar3.mo146xb9724478(this)).booleanValue() : true;
        }
        if (actionMasked == 2) {
            this.f347466n = f58;
            if (this.f347468p) {
                fr5.d dVar4 = (fr5.d) cVar;
                dVar4.getClass();
                yz5.l lVar4 = dVar4.f347442a;
                if (lVar4 != null) {
                    z17 = ((java.lang.Boolean) lVar4.mo146xb9724478(this)).booleanValue();
                }
            } else {
                z17 = true;
            }
            if (z17) {
                this.f347467o = this.f347466n;
            }
        }
        return true;
    }
}
