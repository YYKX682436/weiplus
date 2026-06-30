package androidx.compose.foundation.lazy.layout;

/* loaded from: classes14.dex */
public final class x implements n0.e4, androidx.compose.foundation.lazy.layout.u, java.lang.Runnable, android.view.Choreographer.FrameCallback {

    /* renamed from: q, reason: collision with root package name */
    public static long f10434q;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.v f10435d;

    /* renamed from: e, reason: collision with root package name */
    public final s1.k2 f10436e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.k f10437f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f10438g;

    /* renamed from: h, reason: collision with root package name */
    public final o0.i f10439h;

    /* renamed from: i, reason: collision with root package name */
    public long f10440i;

    /* renamed from: m, reason: collision with root package name */
    public long f10441m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f10442n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.Choreographer f10443o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f10444p;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x004d, code lost:
    
        if (r3 >= 30.0f) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public x(androidx.compose.foundation.lazy.layout.v r3, s1.k2 r4, androidx.compose.foundation.lazy.layout.k r5, android.view.View r6) {
        /*
            r2 = this;
            java.lang.String r0 = "prefetchState"
            kotlin.jvm.internal.o.g(r3, r0)
            java.lang.String r0 = "subcomposeLayoutState"
            kotlin.jvm.internal.o.g(r4, r0)
            java.lang.String r0 = "itemContentFactory"
            kotlin.jvm.internal.o.g(r5, r0)
            java.lang.String r0 = "view"
            kotlin.jvm.internal.o.g(r6, r0)
            r2.<init>()
            r2.f10435d = r3
            r2.f10436e = r4
            r2.f10437f = r5
            r2.f10438g = r6
            o0.i r3 = new o0.i
            r4 = 16
            androidx.compose.foundation.lazy.layout.w[] r4 = new androidx.compose.foundation.lazy.layout.w[r4]
            r5 = 0
            r3.<init>(r4, r5)
            r2.f10439h = r3
            android.view.Choreographer r3 = android.view.Choreographer.getInstance()
            r2.f10443o = r3
            long r3 = androidx.compose.foundation.lazy.layout.x.f10434q
            r0 = 0
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 != 0) goto L5a
            android.view.Display r3 = r6.getDisplay()
            boolean r4 = r6.isInEditMode()
            if (r4 != 0) goto L50
            if (r3 == 0) goto L50
            float r3 = r3.getRefreshRate()
            r4 = 1106247680(0x41f00000, float:30.0)
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 < 0) goto L50
            goto L52
        L50:
            r3 = 1114636288(0x42700000, float:60.0)
        L52:
            r4 = 1000000000(0x3b9aca00, float:0.0047237873)
            float r4 = (float) r4
            float r4 = r4 / r3
            long r3 = (long) r4
            androidx.compose.foundation.lazy.layout.x.f10434q = r3
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.x.<init>(androidx.compose.foundation.lazy.layout.v, s1.k2, androidx.compose.foundation.lazy.layout.k, android.view.View):void");
    }

    @Override // n0.e4
    public void b() {
        ((n0.q4) this.f10435d.f10429a).setValue(this);
        this.f10444p = true;
    }

    @Override // n0.e4
    public void c() {
    }

    @Override // n0.e4
    public void d() {
        this.f10444p = false;
        ((n0.q4) this.f10435d.f10429a).setValue(null);
        this.f10438g.removeCallbacks(this);
        this.f10443o.removeFrameCallback(this);
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j17) {
        if (this.f10444p) {
            this.f10438g.post(this);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17;
        o0.i r17;
        o0.i iVar = this.f10439h;
        boolean z17 = false;
        if (!iVar.i() && this.f10442n && this.f10444p) {
            android.view.View view = this.f10438g;
            if (view.getWindowVisibility() == 0) {
                long nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime()) + f10434q;
                boolean z18 = false;
                while (iVar.j() && !z18) {
                    androidx.compose.foundation.lazy.layout.w wVar = (androidx.compose.foundation.lazy.layout.w) iVar.f341850d[z17 ? 1 : 0];
                    androidx.compose.foundation.lazy.layout.k kVar = this.f10437f;
                    androidx.compose.foundation.lazy.layout.l lVar = (androidx.compose.foundation.lazy.layout.l) kVar.f10411b.invoke();
                    if (!wVar.f10433d) {
                        int e17 = lVar.e();
                        int i17 = wVar.f10430a;
                        if ((i17 < 0 || i17 >= e17) ? z17 ? 1 : 0 : true) {
                            if (wVar.f10432c == null) {
                                long nanoTime = java.lang.System.nanoTime();
                                if ((nanoTime > nanos || nanoTime + this.f10440i < nanos) ? true : z17 ? 1 : 0) {
                                    java.lang.Object c17 = lVar.c(i17);
                                    wVar.f10432c = this.f10436e.b(c17, kVar.a(i17, c17));
                                    long nanoTime2 = java.lang.System.nanoTime() - nanoTime;
                                    long j18 = this.f10440i;
                                    if (j18 != 0) {
                                        long j19 = 4;
                                        nanoTime2 = (nanoTime2 / j19) + ((j18 / j19) * 3);
                                    }
                                    this.f10440i = nanoTime2;
                                } else {
                                    z18 = true;
                                }
                            } else {
                                long nanoTime3 = java.lang.System.nanoTime();
                                if ((nanoTime3 > nanos || this.f10441m + nanoTime3 < nanos) ? true : z17 ? 1 : 0) {
                                    s1.g2 g2Var = wVar.f10432c;
                                    kotlin.jvm.internal.o.d(g2Var);
                                    s1.o0 o0Var = (s1.o0) g2Var;
                                    u1.w wVar2 = (u1.w) ((java.util.LinkedHashMap) o0Var.f402048a.f402068h).get(o0Var.f402049b);
                                    int i18 = (wVar2 == null || (r17 = wVar2.r()) == null) ? z17 ? 1 : 0 : r17.f341852f;
                                    int i19 = z17 ? 1 : 0;
                                    while (i19 < i18) {
                                        o0Var.a(i19, wVar.f10431b);
                                        i19++;
                                        nanos = nanos;
                                    }
                                    j17 = nanos;
                                    long nanoTime4 = java.lang.System.nanoTime() - nanoTime3;
                                    long j27 = this.f10441m;
                                    if (j27 != 0) {
                                        long j28 = 4;
                                        nanoTime4 = (nanoTime4 / j28) + ((j27 / j28) * 3);
                                    }
                                    this.f10441m = nanoTime4;
                                    z17 = false;
                                    iVar.m(0);
                                    z18 = z18;
                                } else {
                                    j17 = nanos;
                                    z18 = true;
                                }
                                nanos = j17;
                            }
                        }
                    }
                    j17 = nanos;
                    iVar.m(z17 ? 1 : 0);
                    z18 = z18;
                    nanos = j17;
                }
                if (z18) {
                    this.f10443o.postFrameCallback(this);
                    return;
                } else {
                    this.f10442n = z17;
                    return;
                }
            }
        }
        this.f10442n = false;
    }
}
