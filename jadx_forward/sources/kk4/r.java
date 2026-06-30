package kk4;

/* loaded from: classes15.dex */
public final class r extends java.util.TimerTask {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.g0 f390100d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kk4.v f390101e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.g0 f390102f;

    public r(p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var, kk4.v vVar, p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var2) {
        this.f390100d = g0Var;
        this.f390101e = vVar;
        this.f390102f = g0Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        if (r8 >= r6) goto L39;
     */
    @Override // java.util.TimerTask, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r23 = this;
            r0 = r23
            kotlin.jvm.internal.g0 r1 = r0.f390100d
            kk4.v r2 = r0.f390101e
            kk4.c r2 = r2.f390110b
            r3 = 0
            if (r2 == 0) goto L13
            kk4.f0 r2 = (kk4.f0) r2
            long r5 = r2.mo100915xddd35a52()
            goto L14
        L13:
            r5 = r3
        L14:
            r1.f391654d = r5
            kk4.v r1 = r0.f390101e
            kk4.c r1 = r1.f390110b
            if (r1 == 0) goto L23
            kk4.f0 r1 = (kk4.f0) r1
            long r1 = r1.mo100917x37a7fa50()
            goto L24
        L23:
            r1 = r3
        L24:
            kk4.v r5 = r0.f390101e
            boolean r6 = r5.G
            if (r6 == 0) goto L30
            java.lang.String r6 = r5.f390109a
            kotlin.jvm.internal.g0 r6 = r0.f390100d
            long r6 = r6.f391654d
        L30:
            kotlin.jvm.internal.g0 r6 = r0.f390102f
            long r6 = r6.f391654d
            r8 = -1
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 == 0) goto L4a
            kotlin.jvm.internal.g0 r8 = r0.f390100d
            long r8 = r8.f391654d
            long r10 = r8 - r6
            r12 = 1000(0x3e8, double:4.94E-321)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 > 0) goto L4a
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 >= 0) goto La7
        L4a:
            kk4.c r5 = r5.f390110b
            if (r5 == 0) goto L55
            kk4.f0 r5 = (kk4.f0) r5
            long r5 = r5.mo100920x21a0b6d0()
            goto L56
        L55:
            r5 = r3
        L56:
            kk4.v r7 = r0.f390101e
            kk4.c r7 = r7.f390110b
            if (r7 == 0) goto L63
            kk4.f0 r7 = (kk4.f0) r7
            long r7 = r7.mo100915xddd35a52()
            goto L64
        L63:
            r7 = r3
        L64:
            long r16 = r5 - r7
            kk4.v r5 = r0.f390101e
            dn.o r6 = r5.f390114f
            boolean r7 = r6 instanceof ck4.b
            if (r7 == 0) goto L9f
            nk4.s r5 = r5.f390121m
            if (r5 == 0) goto L9f
            nk4.r r7 = new nk4.r
            boolean r8 = r6 instanceof ck4.b
            if (r8 == 0) goto L7b
            ck4.b r6 = (ck4.b) r6
            goto L7c
        L7b:
            r6 = 0
        L7c:
            if (r6 == 0) goto L80
            long r3 = r6.f124067d2
        L80:
            r10 = r3
            kotlin.jvm.internal.g0 r3 = r0.f390100d
            long r3 = r3.f391654d
            r6 = 1000(0x3e8, float:1.401E-42)
            long r8 = (long) r6
            long r12 = r3 / r8
            long r14 = r1 / r8
            long r18 = android.os.SystemClock.uptimeMillis()
            r20 = 0
            r21 = 32
            r22 = 0
            r9 = r7
            r9.<init>(r10, r12, r14, r16, r18, r20, r21, r22)
            kw2.m0 r5 = (kw2.m0) r5
            r5.v(r7)
        L9f:
            kotlin.jvm.internal.g0 r3 = r0.f390102f
            kotlin.jvm.internal.g0 r4 = r0.f390100d
            long r4 = r4.f391654d
            r3.f391654d = r4
        La7:
            kk4.v r3 = r0.f390101e
            dk4.a r4 = r3.f390111c
            if (r4 != 0) goto Lb2
            dk4.a r4 = new dk4.a
            r4.<init>()
        Lb2:
            r4.f316003g = r1
            pk4.v r1 = r3.f390133y
            if (r1 == 0) goto Lbf
            kotlin.jvm.internal.g0 r2 = r0.f390100d
            long r2 = r2.f391654d
            r1.a(r4, r2)
        Lbf:
            kk4.v r1 = r0.f390101e
            r1.k()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kk4.r.run():void");
    }
}
