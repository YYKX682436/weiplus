package ln5;

/* loaded from: classes15.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 f401453d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f401454e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f401455f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f401456g;

    public c(com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x22587864, float f17, int i17, boolean z17) {
        this.f401453d = c22851x22587864;
        this.f401454e = f17;
        this.f401455f = i17;
        this.f401456g = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x22587864 = this.f401453d;
        if (c22851x22587864.f295271h.f502385c == sn5.b.f491697w) {
            tn5.f fVar = c22851x22587864.A;
            fVar.b();
            c22851x22587864.m82913x4b20af2f().f411751k = c22851x22587864.getMeasuredWidth() / 2.0f;
            c22851x22587864.f295271h.e(sn5.b.f491692r);
            float f17 = c22851x22587864.m82919xbce906a5().f411768a == 0 ? c22851x22587864.m82919xbce906a5().f411771d : c22851x22587864.m82919xbce906a5().f411768a;
            float f18 = this.f401454e;
            if (f18 < 10.0f) {
                f18 *= f17;
            }
            android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(c22851x22587864.m82913x4b20af2f().f411742b, (int) f18);
            ofInt.setDuration(this.f401455f);
            ofInt.setInterpolator(new pn5.a(0));
            boolean z17 = this.f401456g;
            ofInt.addUpdateListener(new ln5.a(c22851x22587864, z17));
            ofInt.addListener(new ln5.b(c22851x22587864, z17));
            ofInt.start();
            fVar.f502405e = ofInt;
        }
    }
}
