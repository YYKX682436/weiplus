package av2;

/* loaded from: classes5.dex */
public final class i implements av2.f {

    /* renamed from: b, reason: collision with root package name */
    public static final av2.i f95743b = new av2.i();

    @Override // av2.f
    public void a(android.view.ViewGroup pager) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pager, "pager");
    }

    @Override // av2.f
    public int b() {
        return 600;
    }

    @Override // av2.f
    public void c(int i17, int i18, int i19, boolean z17, int i27, int i28, boolean z18, float f17, float f18, int i29, int i37) {
    }

    @Override // av2.f
    public int d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Sb).mo141623x754a37bb()).r()).intValue();
    }

    @Override // av2.f
    public void e(android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
    }

    @Override // av2.f
    public int f() {
        return 0;
    }

    @Override // av2.f
    public void g() {
    }

    @Override // av2.f
    /* renamed from: getDuration */
    public int mo9071x51e8b0a() {
        return 400;
    }

    @Override // av2.f
    /* renamed from: getLeftPercent */
    public float mo9072x6b58dd08() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        return 1.0f - ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Rb).mo141623x754a37bb()).r()).floatValue();
    }

    @Override // av2.f
    /* renamed from: getRightPercent */
    public float mo9073xb1fe74ff() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Rb).mo141623x754a37bb()).r()).floatValue();
    }

    @Override // av2.f
    public void h(android.view.View avatarView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(avatarView, "avatarView");
    }

    @Override // av2.f
    public float i(float f17, int i17) {
        if (i17 > 0) {
            if (!(f17 == 0.0f)) {
                float f18 = i17;
                if (java.lang.Math.abs(f17) >= f18) {
                    return f17;
                }
                float e17 = e06.p.e((float) ((-(java.lang.Math.cos((r1 / f18) * 3.141592653589793d) - 1.0d)) / 2.0d), 0.0f, 1.0f) * f18;
                return f17 >= 0.0f ? e17 : -e17;
            }
        }
        return 0.0f;
    }
}
