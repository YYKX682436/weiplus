package ex0;

/* loaded from: classes5.dex */
public final class q extends ex0.c implements ex0.h {

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951 f338695q;

    /* renamed from: r, reason: collision with root package name */
    public final cw0.d1 f338696r;

    /* renamed from: s, reason: collision with root package name */
    public float[] f338697s;

    /* renamed from: t, reason: collision with root package name */
    public vu0.u f338698t;

    /* renamed from: u, reason: collision with root package name */
    public vu0.w f338699u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951 narrationSegment) {
        super(narrationSegment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(narrationSegment, "narrationSegment");
        this.f338695q = narrationSegment;
        this.f338696r = new cw0.d1();
        this.f338697s = new float[0];
        this.f338698t = vu0.u.f521693e;
        this.f338699u = vu0.w.f521701f;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ex0.p
            if (r0 == 0) goto L13
            r0 = r8
            ex0.p r0 = (ex0.p) r0
            int r1 = r0.f338694g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f338694g = r1
            goto L18
        L13:
            ex0.p r0 = new ex0.p
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f338692e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f338694g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.f338691d
            ex0.q r0 = (ex0.q) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L5a
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L33:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            com.tencent.maas.moviecomposing.segments.NarrationSegment r8 = r7.f338695q
            com.tencent.maas.model.time.MJTime r2 = r8.p0()
            java.lang.String r4 = "getTotalDurationIncludingExpandable(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r4)
            r0.f338691d = r7
            r0.f338694g = r3
            cw0.d1 r3 = r7.f338696r
            r3.getClass()
            kotlinx.coroutines.p0 r4 = p3325xe03a0797.p3326xc267989b.q1.f392103c
            cw0.c1 r5 = new cw0.c1
            r6 = 0
            r5.<init>(r2, r3, r8, r6)
            java.lang.Object r8 = p3325xe03a0797.p3326xc267989b.l.g(r4, r5, r0)
            if (r8 != r1) goto L59
            return r1
        L59:
            r0 = r7
        L5a:
            float[] r8 = (float[]) r8
            r0.f338697s = r8
            jz5.f0 r8 = jz5.f0.f384359a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ex0.q.G(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.lang.String H() {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951 c4189xeb0c3951 = this.f338695q;
        c4189xeb0c3951.getClass();
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4189xeb0c3951.D();
        return D != null ? com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951.E1(c4189xeb0c3951, D) : "";
    }

    public final java.util.List I() {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4179xedb0cdf9[] P1 = this.f338695q.P1();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(P1, "getCaptionItems(...)");
        return kz5.z.z0(P1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0063, code lost:
    
        if (r0.k().m33975x22a7969a(l().m34007xde00a612()) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a4, code lost:
    
        if (r0.l().m34007xde00a612().m33971xf922bec1(l().m34009x8082fb99()) != false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[LOOP:0: B:8:0x001a->B:18:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean J(ex0.a0 r6) {
        /*
            r5 = this;
            java.lang.String r0 = "timelineViewModel"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r0)
            ex0.v r6 = r6.f338630g
            java.util.List r6 = r6.f338712g
            boolean r0 = r6 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto L16
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L16
            goto Laa
        L16:
            java.util.Iterator r6 = r6.iterator()
        L1a:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto Laa
            java.lang.Object r0 = r6.next()
            ex0.q r0 = (ex0.q) r0
            com.tencent.maas.base.MJID r2 = r0.f338701b
            com.tencent.maas.base.MJID r3 = r5.f338701b
            boolean r2 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r2, r3)
            r3 = 1
            if (r2 == 0) goto L34
        L31:
            r0 = r1
            goto La7
        L34:
            ax0.a r2 = r5.f338667j
            int r2 = r2.ordinal()
            if (r2 == 0) goto L7a
            if (r2 == r3) goto L6d
            r4 = 2
            if (r2 != r4) goto L67
            com.tencent.maas.model.time.MJTimeRange r2 = r0.l()
            com.tencent.maas.model.time.MJTimeRange r4 = r5.l()
            com.tencent.maas.model.time.MJTime r4 = r4.m34007xde00a612()
            boolean r2 = r2.m34002x805f158c(r4)
            if (r2 == 0) goto L31
            com.tencent.maas.model.time.MJTime r0 = r0.k()
            com.tencent.maas.model.time.MJTimeRange r2 = r5.l()
            com.tencent.maas.model.time.MJTime r2 = r2.m34007xde00a612()
            boolean r0 = r0.m33975x22a7969a(r2)
            if (r0 == 0) goto L31
        L65:
            r0 = r3
            goto La7
        L67:
            jz5.j r6 = new jz5.j
            r6.<init>()
            throw r6
        L6d:
            com.tencent.maas.model.time.MJTimeRange r0 = r0.l()
            com.tencent.maas.model.time.MJTime r2 = r5.k()
            boolean r0 = r0.m34002x805f158c(r2)
            goto La7
        L7a:
            com.tencent.maas.model.time.MJTimeRange r2 = r0.l()
            com.tencent.maas.model.time.MJTime r2 = r2.m34009x8082fb99()
            com.tencent.maas.model.time.MJTimeRange r4 = r5.l()
            com.tencent.maas.model.time.MJTime r4 = r4.m34007xde00a612()
            boolean r2 = r2.m33986x9f3f7b48(r4)
            if (r2 == 0) goto L31
            com.tencent.maas.model.time.MJTimeRange r0 = r0.l()
            com.tencent.maas.model.time.MJTime r0 = r0.m34007xde00a612()
            com.tencent.maas.model.time.MJTimeRange r2 = r5.l()
            com.tencent.maas.model.time.MJTime r2 = r2.m34009x8082fb99()
            boolean r0 = r0.m33971xf922bec1(r2)
            if (r0 == 0) goto L31
            goto L65
        La7:
            if (r0 == 0) goto L1a
            r1 = r3
        Laa:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ex0.q.J(ex0.a0):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0051, code lost:
    
        if (r0.right >= r3) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0074, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0059, code lost:
    
        if (r0.right <= r3) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006a, code lost:
    
        if (r0.right >= r3) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0072, code lost:
    
        if (r0.right <= r8.right) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x007e, code lost:
    
        if (r0.right >= r3) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0086, code lost:
    
        if (r0.right >= r5) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x008c, code lost:
    
        if (r0.right <= r5) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[LOOP:0: B:8:0x001a->B:18:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean K(android.graphics.Rect r8, ex0.a0 r9, bx0.h r10) {
        /*
            r7 = this;
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            ex0.v r9 = r9.f338630g
            java.util.List r9 = r9.f338712g
            boolean r1 = r9 instanceof java.util.Collection
            r2 = 0
            if (r1 == 0) goto L16
            boolean r1 = r9.isEmpty()
            if (r1 == 0) goto L16
            goto L92
        L16:
            java.util.Iterator r9 = r9.iterator()
        L1a:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L92
            java.lang.Object r1 = r9.next()
            ex0.q r1 = (ex0.q) r1
            com.tencent.maas.base.MJID r3 = r1.f338701b
            com.tencent.maas.base.MJID r4 = r7.f338701b
            boolean r3 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r3, r4)
            r4 = 1
            if (r3 == 0) goto L33
        L31:
            r1 = r2
            goto L8f
        L33:
            com.tencent.maas.base.MJID r1 = r1.f338701b
            android.graphics.Rect r1 = r10.b(r1, r2)
            r0.set(r1)
            ax0.a r1 = r7.f338667j
            int r1 = r1.ordinal()
            if (r1 == 0) goto L76
            if (r1 == r4) goto L62
            r3 = 2
            if (r1 != r3) goto L5c
            int r1 = r0.left
            int r3 = r8.right
            if (r1 > r3) goto L53
            int r5 = r0.right
            if (r5 >= r3) goto L74
        L53:
            int r5 = r8.left
            if (r1 < r5) goto L31
            int r1 = r0.right
            if (r1 > r3) goto L31
            goto L74
        L5c:
            jz5.j r8 = new jz5.j
            r8.<init>()
            throw r8
        L62:
            int r1 = r0.left
            int r3 = r8.left
            if (r1 > r3) goto L6c
            int r5 = r0.right
            if (r5 >= r3) goto L74
        L6c:
            if (r1 < r3) goto L31
            int r1 = r0.right
            int r3 = r8.right
            if (r1 > r3) goto L31
        L74:
            r1 = r4
            goto L8f
        L76:
            int r1 = r0.left
            int r3 = r8.left
            if (r1 > r3) goto L80
            int r5 = r0.right
            if (r5 >= r3) goto L74
        L80:
            int r5 = r8.right
            if (r1 > r5) goto L88
            int r6 = r0.right
            if (r6 >= r5) goto L74
        L88:
            if (r1 < r3) goto L31
            int r1 = r0.right
            if (r1 > r5) goto L31
            goto L74
        L8f:
            if (r1 == 0) goto L1a
            r2 = r4
        L92:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ex0.q.K(android.graphics.Rect, ex0.a0, bx0.h):boolean");
    }

    public final boolean L(java.lang.String colorStyleID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(colorStyleID, "colorStyleID");
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951 c4189xeb0c3951 = this.f338695q;
        c4189xeb0c3951.getClass();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4189xeb0c3951.D();
        if (D != null) {
            bool = com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951.J1(c4189xeb0c3951, colorStyleID, D);
        }
        return bool.booleanValue();
    }

    public final boolean M(java.lang.String fontName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fontName, "fontName");
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951 c4189xeb0c3951 = this.f338695q;
        c4189xeb0c3951.getClass();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4189xeb0c3951.D();
        if (D != null) {
            bool = com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951.F1(c4189xeb0c3951, fontName, D);
        }
        return bool.booleanValue();
    }

    public final void N(java.util.List captionItems) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(captionItems, "captionItems");
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951 c4189xeb0c3951 = this.f338695q;
        c4189xeb0c3951.getClass();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4189xeb0c3951.D();
        if (D != null) {
            bool = com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951.H1(c4189xeb0c3951, captionItems, D);
        }
        bool.booleanValue();
    }

    public final boolean O(java.lang.String captionStyleID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(captionStyleID, "captionStyleID");
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951 c4189xeb0c3951 = this.f338695q;
        c4189xeb0c3951.getClass();
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4189xeb0c3951.D();
        java.lang.String G1 = D != null ? com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951.G1(c4189xeb0c3951, D) : "";
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D2 = c4189xeb0c3951.D();
        java.lang.String K1 = D2 != null ? com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951.K1(c4189xeb0c3951, D2) : "";
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D3 = c4189xeb0c3951.D();
        if (D3 != null) {
            bool = com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951.D1(c4189xeb0c3951, captionStyleID, D3);
        }
        return bool.booleanValue() && L(G1) && M(K1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
    
        if (r5 == vu0.w.f521700e) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0035, code lost:
    
        if (r5 != vu0.w.f521701f) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        if (r5 != vu0.w.f521701f) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P(vu0.w r5) {
        /*
            r4 = this;
            java.lang.String r0 = "state"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r0)
            vu0.v r1 = vu0.w.f521699d
            vu0.w r2 = r4.f338699u
            r1.getClass()
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r2, r0)
            int r0 = r2.ordinal()
            r1 = 1
            if (r0 == 0) goto L2f
            if (r0 == r1) goto L2a
            r3 = 2
            if (r0 != r3) goto L24
            vu0.w r0 = vu0.w.f521700e
            if (r5 == r0) goto L39
            vu0.w r0 = vu0.w.f521701f
            if (r5 != r0) goto L38
            goto L39
        L24:
            jz5.j r5 = new jz5.j
            r5.<init>()
            throw r5
        L2a:
            vu0.w r0 = vu0.w.f521700e
            if (r5 != r0) goto L38
            goto L39
        L2f:
            vu0.w r0 = vu0.w.f521702g
            if (r5 == r0) goto L39
            vu0.w r0 = vu0.w.f521701f
            if (r5 != r0) goto L38
            goto L39
        L38:
            r1 = 0
        L39:
            if (r1 == 0) goto L3c
            goto L3d
        L3c:
            r5 = r2
        L3d:
            r4.f338699u = r5
            r4.m128275x9616526c()
            vu0.w r5 = r4.f338699u
            java.util.Objects.toString(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ex0.q.P(vu0.w):void");
    }

    @Override // ex0.h
    public vu0.u e() {
        return this.f338698t;
    }

    @Override // ex0.h
    public void f(vu0.u uVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uVar, "<set-?>");
        this.f338698t = uVar;
    }

    @Override // ex0.f
    public android.graphics.PointF v() {
        return new android.graphics.PointF(0.5f, 0.69f);
    }

    @Override // ex0.f
    public android.graphics.PointF w() {
        return new android.graphics.PointF(0.5f, 0.7f);
    }
}
