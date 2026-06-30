package p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a;

/* loaded from: classes14.dex */
public final class x implements n0.e4, p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.u, java.lang.Runnable, android.view.Choreographer.FrameCallback {

    /* renamed from: q, reason: collision with root package name */
    public static long f91967q;

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.v f91968d;

    /* renamed from: e, reason: collision with root package name */
    public final s1.k2 f91969e;

    /* renamed from: f, reason: collision with root package name */
    public final p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.k f91970f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f91971g;

    /* renamed from: h, reason: collision with root package name */
    public final o0.i f91972h;

    /* renamed from: i, reason: collision with root package name */
    public long f91973i;

    /* renamed from: m, reason: collision with root package name */
    public long f91974m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f91975n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.Choreographer f91976o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f91977p;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x004d, code lost:
    
        if (r3 >= 30.0f) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public x(p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.v r3, s1.k2 r4, p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.k r5, android.view.View r6) {
        /*
            r2 = this;
            java.lang.String r0 = "prefetchState"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r3, r0)
            java.lang.String r0 = "subcomposeLayoutState"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r0)
            java.lang.String r0 = "itemContentFactory"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r0)
            java.lang.String r0 = "view"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r0)
            r2.<init>()
            r2.f91968d = r3
            r2.f91969e = r4
            r2.f91970f = r5
            r2.f91971g = r6
            o0.i r3 = new o0.i
            r4 = 16
            androidx.compose.foundation.lazy.layout.w[] r4 = new p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.w[r4]
            r5 = 0
            r3.<init>(r4, r5)
            r2.f91972h = r3
            android.view.Choreographer r3 = android.view.Choreographer.getInstance()
            r2.f91976o = r3
            long r3 = p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.x.f91967q
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
            p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.x.f91967q = r3
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.x.<init>(androidx.compose.foundation.lazy.layout.v, s1.k2, androidx.compose.foundation.lazy.layout.k, android.view.View):void");
    }

    @Override // n0.e4
    public void b() {
        ((n0.q4) this.f91968d.f91962a).mo148714x53d8522f(this);
        this.f91977p = true;
    }

    @Override // n0.e4
    public void c() {
    }

    @Override // n0.e4
    public void d() {
        this.f91977p = false;
        ((n0.q4) this.f91968d.f91962a).mo148714x53d8522f(null);
        this.f91971g.removeCallbacks(this);
        this.f91976o.removeFrameCallback(this);
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j17) {
        if (this.f91977p) {
            this.f91971g.post(this);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17;
        o0.i r17;
        o0.i iVar = this.f91972h;
        boolean z17 = false;
        if (!iVar.i() && this.f91975n && this.f91977p) {
            android.view.View view = this.f91971g;
            if (view.getWindowVisibility() == 0) {
                long nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime()) + f91967q;
                boolean z18 = false;
                while (iVar.j() && !z18) {
                    p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.w wVar = (p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.w) iVar.f423383d[z17 ? 1 : 0];
                    p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.k kVar = this.f91970f;
                    p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.l lVar = (p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.l) kVar.f91944b.mo152xb9724478();
                    if (!wVar.f91966d) {
                        int e17 = lVar.e();
                        int i17 = wVar.f91963a;
                        if ((i17 < 0 || i17 >= e17) ? z17 ? 1 : 0 : true) {
                            if (wVar.f91965c == null) {
                                long nanoTime = java.lang.System.nanoTime();
                                if ((nanoTime > nanos || nanoTime + this.f91973i < nanos) ? true : z17 ? 1 : 0) {
                                    java.lang.Object c17 = lVar.c(i17);
                                    wVar.f91965c = this.f91969e.b(c17, kVar.a(i17, c17));
                                    long nanoTime2 = java.lang.System.nanoTime() - nanoTime;
                                    long j18 = this.f91973i;
                                    if (j18 != 0) {
                                        long j19 = 4;
                                        nanoTime2 = (nanoTime2 / j19) + ((j18 / j19) * 3);
                                    }
                                    this.f91973i = nanoTime2;
                                } else {
                                    z18 = true;
                                }
                            } else {
                                long nanoTime3 = java.lang.System.nanoTime();
                                if ((nanoTime3 > nanos || this.f91974m + nanoTime3 < nanos) ? true : z17 ? 1 : 0) {
                                    s1.g2 g2Var = wVar.f91965c;
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g2Var);
                                    s1.o0 o0Var = (s1.o0) g2Var;
                                    u1.w wVar2 = (u1.w) ((java.util.LinkedHashMap) o0Var.f483581a.f483601h).get(o0Var.f483582b);
                                    int i18 = (wVar2 == null || (r17 = wVar2.r()) == null) ? z17 ? 1 : 0 : r17.f423385f;
                                    int i19 = z17 ? 1 : 0;
                                    while (i19 < i18) {
                                        o0Var.a(i19, wVar.f91964b);
                                        i19++;
                                        nanos = nanos;
                                    }
                                    j17 = nanos;
                                    long nanoTime4 = java.lang.System.nanoTime() - nanoTime3;
                                    long j27 = this.f91974m;
                                    if (j27 != 0) {
                                        long j28 = 4;
                                        nanoTime4 = (nanoTime4 / j28) + ((j27 / j28) * 3);
                                    }
                                    this.f91974m = nanoTime4;
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
                    this.f91976o.postFrameCallback(this);
                    return;
                } else {
                    this.f91975n = z17;
                    return;
                }
            }
        }
        this.f91975n = false;
    }
}
