package bv0;

/* loaded from: classes5.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final bv0.f f106228a;

    /* renamed from: b, reason: collision with root package name */
    public float f106229b;

    /* renamed from: c, reason: collision with root package name */
    public float f106230c;

    /* renamed from: d, reason: collision with root package name */
    public float f106231d;

    /* renamed from: e, reason: collision with root package name */
    public float f106232e;

    /* renamed from: f, reason: collision with root package name */
    public float f106233f;

    /* renamed from: g, reason: collision with root package name */
    public float f106234g;

    /* renamed from: h, reason: collision with root package name */
    public float f106235h;

    /* renamed from: i, reason: collision with root package name */
    public float f106236i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f106237j;

    /* renamed from: k, reason: collision with root package name */
    public float f106238k;

    /* renamed from: l, reason: collision with root package name */
    public final int f106239l;

    /* renamed from: m, reason: collision with root package name */
    public float f106240m;

    /* renamed from: n, reason: collision with root package name */
    public float f106241n;

    /* renamed from: o, reason: collision with root package name */
    public final int f106242o;

    public h(android.content.Context context, bv0.f fVar) {
        this.f106228a = fVar;
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.f106242o = scaledTouchSlop * scaledTouchSlop;
        this.f106239l = viewConfiguration.getScaledTouchSlop() * 2;
    }

    public float a() {
        float f17 = this.f106234g;
        if (f17 > 0.0f) {
            return this.f106233f / f17;
        }
        return 1.0f;
    }

    public boolean b(android.view.MotionEvent motionEvent) {
        float f17;
        float f18;
        float f19;
        float f27;
        float f28;
        motionEvent.getEventTime();
        int actionMasked = motionEvent.getActionMasked();
        int pointerCount = motionEvent.getPointerCount();
        boolean z17 = actionMasked == 1 || actionMasked == 3;
        boolean z18 = actionMasked == 0;
        bv0.f fVar = this.f106228a;
        if (z18 || z17) {
            if (this.f106237j) {
                fVar.a(this);
                this.f106237j = false;
            }
            if (z17) {
                return true;
            }
        }
        boolean z19 = actionMasked == 0 || actionMasked == 6 || actionMasked == 5;
        boolean z27 = actionMasked == 6;
        int actionIndex = z27 ? motionEvent.getActionIndex() : -1;
        int i17 = z27 ? pointerCount - 1 : pointerCount;
        float f29 = 0.0f;
        float f37 = 0.0f;
        for (int i18 = 0; i18 < pointerCount; i18++) {
            if (actionIndex != i18) {
                f29 += motionEvent.getX(i18);
                f37 += motionEvent.getY(i18);
            }
        }
        float f38 = i17;
        float f39 = f29 / f38;
        float f47 = f37 / f38;
        float f48 = 0.0f;
        float f49 = 0.0f;
        for (int i19 = 0; i19 < pointerCount; i19++) {
            if (actionIndex != i19) {
                f48 += java.lang.Math.abs(motionEvent.getX(i19) - f39);
                f49 += java.lang.Math.abs(motionEvent.getY(i19) - f47);
            }
        }
        float hypot = (float) java.lang.Math.hypot((f48 / f38) * 2.0f, (f49 / f38) * 2.0f);
        int i27 = 0;
        loop2: while (true) {
            if (i27 >= pointerCount) {
                f17 = hypot;
                f18 = f39;
                f19 = 0.0f;
                break;
            }
            if (actionIndex != i27) {
                for (int i28 = i27 + 1; i28 < pointerCount; i28++) {
                    if (actionIndex != i28) {
                        f17 = hypot;
                        f18 = f39;
                        f19 = (float) (0.0f + ((java.lang.Math.toDegrees(java.lang.Math.atan2(motionEvent.getY(i27) - motionEvent.getY(i28), motionEvent.getX(i27) - motionEvent.getX(i28))) + 360.0d) % 360.0d));
                        break loop2;
                    }
                }
            }
            i27++;
            hypot = hypot;
            f39 = f39;
        }
        boolean z28 = this.f106237j;
        if (z28 && z19) {
            fVar.a(this);
            this.f106237j = false;
        }
        if (z19) {
            f27 = f17;
            this.f106233f = f27;
            this.f106234g = f27;
            this.f106238k = f27;
            f28 = f18;
            this.f106229b = f28;
            this.f106231d = f28;
            this.f106240m = f28;
            this.f106230c = f47;
            this.f106232e = f47;
            this.f106241n = f47;
            this.f106235h = f19;
            this.f106236i = f19;
        } else {
            f27 = f17;
            f28 = f18;
        }
        if (!this.f106237j && (z28 || java.lang.Math.abs(f27 - this.f106238k) > this.f106239l || java.lang.Math.pow(this.f106229b - this.f106240m, 2.0d) + java.lang.Math.pow(this.f106230c - this.f106241n, 2.0d) > this.f106242o)) {
            this.f106233f = f27;
            this.f106234g = f27;
            this.f106229b = f28;
            this.f106231d = f28;
            this.f106230c = f47;
            this.f106232e = f47;
            this.f106235h = f19;
            this.f106236i = f19;
            this.f106237j = fVar.d(this);
        }
        if (actionMasked != 2) {
            return true;
        }
        this.f106233f = f27;
        this.f106229b = f28;
        this.f106230c = f47;
        this.f106235h = f19;
        if (this.f106237j) {
            if (a() != 1.0f) {
                fVar.getClass();
            }
            if (this.f106235h - this.f106236i != 0.0f) {
                fVar.getClass();
            }
            if (a() != 1.0f || this.f106235h - this.f106236i != 0.0f) {
                fVar.b(this);
            }
            if (this.f106229b - this.f106231d != 0.0f || this.f106230c - this.f106232e != 0.0f) {
                fVar.c(this);
            }
        }
        this.f106234g = this.f106233f;
        this.f106231d = this.f106229b;
        this.f106232e = this.f106230c;
        this.f106236i = this.f106235h;
        return true;
    }
}
