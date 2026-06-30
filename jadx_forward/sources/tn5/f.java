package tn5;

/* loaded from: classes15.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 f502401a;

    /* renamed from: b, reason: collision with root package name */
    public final tn5.a f502402b;

    /* renamed from: c, reason: collision with root package name */
    public mn5.b f502403c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Runnable f502404d;

    /* renamed from: e, reason: collision with root package name */
    public android.animation.ValueAnimator f502405e;

    public f(com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 layout, tn5.a stateCenter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stateCenter, "stateCenter");
        this.f502401a = layout;
        this.f502402b = stateCenter;
    }

    public final android.animation.ValueAnimator a(int i17, int i18, android.view.animation.Interpolator interpolator, int i19) {
        mn5.b bVar = this.f502403c;
        if (bVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cValues");
            throw null;
        }
        if (bVar.f411742b == i17) {
            return null;
        }
        b();
        this.f502404d = null;
        int[] iArr = new int[2];
        mn5.b bVar2 = this.f502403c;
        if (bVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cValues");
            throw null;
        }
        iArr[0] = bVar2.f411742b;
        iArr[1] = i17;
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(iArr);
        ofInt.setDuration(i19);
        ofInt.setInterpolator(interpolator);
        ofInt.addListener(new tn5.d(this));
        ofInt.addUpdateListener(new tn5.e(this));
        ofInt.setStartDelay(i18);
        ofInt.start();
        this.f502405e = ofInt;
        return ofInt;
    }

    public final void b() {
        android.animation.ValueAnimator valueAnimator = this.f502405e;
        if (valueAnimator != null) {
            valueAnimator.setDuration(0L);
            valueAnimator.cancel();
            this.f502405e = null;
        }
    }

    public final boolean c(int i17) {
        if (i17 == 0) {
            android.animation.ValueAnimator valueAnimator = this.f502405e;
            if (valueAnimator != null) {
                tn5.a aVar = this.f502402b;
                sn5.b bVar = aVar.f502384b;
                if (!bVar.f491705h) {
                    if (!(bVar == sn5.b.f491696v)) {
                        if (!(bVar == sn5.b.f491688n)) {
                            if (bVar == sn5.b.f491691q) {
                                aVar.e(sn5.b.f491692r);
                            } else {
                                if (bVar == sn5.b.f491693s) {
                                    aVar.e(sn5.b.f491694t);
                                }
                            }
                            valueAnimator.setDuration(0L);
                            valueAnimator.cancel();
                            this.f502405e = null;
                        }
                    }
                }
                return true;
            }
            this.f502404d = null;
        }
        return this.f502405e != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        if (r5.n(r5.m82914x4c6bcf83().f411727d) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e9, code lost:
    
        if (r6 <= r5.m82919xbce906a5().f411768a) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f8, code lost:
    
        if (r6 >= (-r5.m82917x1ebfd733().f411764a)) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0072, code lost:
    
        if (r5.n(r5.m82914x4c6bcf83().f411727d) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x009e, code lost:
    
        if (r12.f411742b > r5.m82919xbce906a5().f411768a) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x008a, code lost:
    
        if (r12.f411742b >= (-r5.m82917x1ebfd733().f411764a)) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(float r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tn5.f.d(float, boolean):void");
    }
}
