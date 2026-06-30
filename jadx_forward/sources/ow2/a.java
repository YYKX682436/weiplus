package ow2;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: k, reason: collision with root package name */
    public static final double f430896k = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDisplayMetrics().xdpi / 2.54d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f430897a;

    /* renamed from: b, reason: collision with root package name */
    public float f430898b;

    /* renamed from: c, reason: collision with root package name */
    public float f430899c;

    /* renamed from: d, reason: collision with root package name */
    public float f430900d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Rect f430901e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f430902f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.l f430903g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f430904h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.a f430905i;

    /* renamed from: j, reason: collision with root package name */
    public yz5.a f430906j;

    public a(boolean z17) {
        this.f430897a = z17;
    }

    public static final void b(ow2.a aVar, android.view.MotionEvent motionEvent, float f17, float f18) {
        aVar.f430900d = f17;
        yz5.l lVar = aVar.f430903g;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Float.valueOf(f17));
        }
        aVar.f430898b = f18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSpeedGestureDetector", "onSpeedChange " + motionEvent.getX(0));
    }

    public final void a(android.view.MotionEvent motionEvent) {
        android.graphics.Rect rect;
        yz5.a aVar;
        if (motionEvent == null) {
            return;
        }
        int action = motionEvent.getAction() & 255;
        motionEvent.getX(0);
        int y17 = (int) motionEvent.getY(0);
        boolean z17 = (this.f430897a && ((float) y17) - this.f430899c > ((float) ym5.x.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (float) ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.M3).mo141623x754a37bb()).r()).intValue()))) || ((rect = this.f430901e) != null && y17 >= rect.top);
        if (action != 1) {
            if (action == 2) {
                float x17 = motionEvent.getX(0) - this.f430898b;
                float y18 = motionEvent.getY(0) - this.f430899c;
                double abs = java.lang.Math.abs(x17);
                double d17 = f430896k;
                boolean z18 = abs > d17 && !z17 && ((double) y18) < ((double) 1.5f) * d17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSpeedGestureDetector", "touch:" + motionEvent.getX(0) + " init:" + this.f430898b + " offsetX:" + x17 + " absOffsetX:" + java.lang.Math.abs(x17) + " offsetY:" + y18 + " isTouchInLockArea:" + z17 + " threshold:" + d17 + " yThreshold:" + (1.5f * d17) + " handleX:" + z18);
                if (z18) {
                    if (x17 > 0.0f) {
                        float f17 = this.f430900d;
                        if (f17 == 1.5f) {
                            b(this, motionEvent, 2.0f, motionEvent.getX(0));
                        } else {
                            if (f17 == 2.0f) {
                                b(this, motionEvent, 3.0f, motionEvent.getX(0));
                            }
                        }
                    } else {
                        float f18 = this.f430900d;
                        if (f18 == 3.0f) {
                            b(this, motionEvent, 2.0f, motionEvent.getX(0));
                        } else {
                            if (f18 == 2.0f) {
                                b(this, motionEvent, 1.5f, motionEvent.getX(0));
                            }
                        }
                    }
                }
                if (z17) {
                    if (this.f430902f) {
                        return;
                    }
                    yz5.a aVar2 = this.f430904h;
                    if (aVar2 != null) {
                        aVar2.mo152xb9724478();
                    }
                    this.f430902f = true;
                    return;
                }
                if (this.f430902f) {
                    yz5.a aVar3 = this.f430905i;
                    if (aVar3 != null) {
                        aVar3.mo152xb9724478();
                    }
                    this.f430902f = false;
                    return;
                }
                return;
            }
            if (action != 3) {
                return;
            }
        }
        if (!z17 || (aVar = this.f430906j) == null) {
            return;
        }
        aVar.mo152xb9724478();
    }

    public final void c(float f17, android.view.MotionEvent motionEvent, android.graphics.Rect rect) {
        this.f430900d = f17;
        this.f430898b = motionEvent != null ? motionEvent.getX(0) : 0.0f;
        this.f430899c = motionEvent != null ? motionEvent.getY(0) : 0.0f;
        this.f430901e = rect;
        this.f430902f = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSpeedGestureDetector", "onTriggerSpeedPlay " + this.f430898b + ' ' + this.f430899c + " rect:" + this.f430901e);
    }
}
