package ex0;

/* loaded from: classes5.dex */
public final class o extends ex0.c {

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4188xeef5596e f338687q;

    /* renamed from: r, reason: collision with root package name */
    public yt0.d f338688r;

    /* renamed from: s, reason: collision with root package name */
    public float[] f338689s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 f338690t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4188xeef5596e musicSegment) {
        super(musicSegment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicSegment, "musicSegment");
        this.f338687q = musicSegment;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof ex0.n
            if (r0 == 0) goto L13
            r0 = r11
            ex0.n r0 = (ex0.n) r0
            int r1 = r0.f338686h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f338686h = r1
            goto L18
        L13:
            ex0.n r0 = new ex0.n
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f338684f
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f338686h
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r1 = r0.f338683e
            com.tencent.maas.model.time.MJTimeRange r1 = (com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553) r1
            java.lang.Object r0 = r0.f338682d
            ex0.o r0 = (ex0.o) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto L67
        L30:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L38:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            com.tencent.maas.model.time.MJTimeRange r11 = r10.H()
            yt0.d r2 = r10.f338688r
            if (r2 == 0) goto L6e
            com.tencent.maas.model.time.MJTime r5 = r11.m34005x51e8b0a()
            java.lang.String r6 = "getDuration(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r5, r6)
            r0.f338682d = r10
            r0.f338683e = r11
            r0.f338686h = r4
            du0.s1 r2 = (du0.s1) r2
            kotlinx.coroutines.p0 r6 = p3325xe03a0797.p3326xc267989b.q1.f392103c
            du0.r1 r7 = new du0.r1
            com.tencent.maas.moviecomposing.segments.MusicSegment r8 = r10.f338687q
            r7.<init>(r2, r8, r5, r3)
            java.lang.Object r0 = p3325xe03a0797.p3326xc267989b.l.g(r6, r7, r0)
            if (r0 != r1) goto L64
            return r1
        L64:
            r1 = r11
            r11 = r0
            r0 = r10
        L67:
            float[] r11 = (float[]) r11
            r9 = r0
            r0 = r11
            r11 = r1
            r1 = r9
            goto L70
        L6e:
            r1 = r10
            r0 = r3
        L70:
            r1.f338690t = r11
            if (r0 == 0) goto L7c
            r11 = 1060554932(0x3f36c8b4, float:0.714)
            r2 = 0
            float[] r3 = by0.w.a(r0, r2, r11, r4, r3)
        L7c:
            r1.f338689s = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ex0.o.G(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 H() {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4188xeef5596e c4188xeef5596e = this.f338687q;
        return new com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5, c4188xeef5596e.i0().add(c4188xeef5596e.z()).add(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33969x7905b775(120.0d)));
    }

    public final boolean I(java.lang.String styleID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(styleID, "styleID");
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4188xeef5596e c4188xeef5596e = this.f338687q;
        c4188xeef5596e.getClass();
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4188xeef5596e.D();
        java.lang.String H1 = D != null ? com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4188xeef5596e.H1(c4188xeef5596e, D) : "";
        c4188xeef5596e.getClass();
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D2 = c4188xeef5596e.D();
        java.lang.String A1 = D2 != null ? com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4188xeef5596e.A1(c4188xeef5596e, D2) : "";
        c4188xeef5596e.getClass();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D3 = c4188xeef5596e.D();
        boolean booleanValue = (D3 != null ? com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4188xeef5596e.J1(c4188xeef5596e, styleID, D3) : bool).booleanValue();
        c4188xeef5596e.getClass();
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D4 = c4188xeef5596e.D();
        boolean booleanValue2 = (D4 != null ? com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4188xeef5596e.L1(c4188xeef5596e, A1, D4) : bool).booleanValue();
        c4188xeef5596e.getClass();
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D5 = c4188xeef5596e.D();
        if (D5 != null) {
            bool = com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4188xeef5596e.B1(c4188xeef5596e, H1, D5);
        }
        return booleanValue && booleanValue2 && bool.booleanValue();
    }

    @Override // ex0.f
    public android.graphics.PointF v() {
        return new android.graphics.PointF(0.5f, 0.88f);
    }

    @Override // ex0.f
    public android.graphics.PointF w() {
        return new android.graphics.PointF(0.5f, 0.82f);
    }

    @Override // ex0.f
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a x(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a duration) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(duration, "duration");
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a p07 = this.f338687q.p0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p07, "getTotalDurationIncludingExpandable(...)");
        if (duration.m33971xf922bec1(p07)) {
            duration = p07;
        }
        return super.x(duration);
    }
}
