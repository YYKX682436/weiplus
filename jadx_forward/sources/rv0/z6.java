package rv0;

/* loaded from: classes5.dex */
public final class z6 extends com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k {
    public p3325xe03a0797.p3326xc267989b.r2 A;
    public final rv0.r6 B;
    public final rv0.p6 C;
    public final rv0.y5 D;
    public final rv0.w6 E;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f481891n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f481892o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f481893p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f481894q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f481895r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f481896s;

    /* renamed from: t, reason: collision with root package name */
    public final sv0.f f481897t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f481898u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f481899v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p892x2ea350.C10941x9ba2abc0 f481900w;

    /* renamed from: x, reason: collision with root package name */
    public final lv0.c f481901x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f481902y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f481903z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f481891n = jz5.h.b(new rv0.r5(this));
        this.f481892o = jz5.h.b(new rv0.x6(this));
        this.f481893p = jz5.h.b(new rv0.v6(this));
        this.f481894q = jz5.h.b(new rv0.s6(this));
        this.f481895r = jz5.h.b(new rv0.t6(this));
        this.f481896s = jz5.h.b(new rv0.v5(this));
        this.f481897t = new sv0.f(new rv0.u5(this));
        this.f481898u = jz5.h.b(new rv0.z5(this));
        this.f481899v = jz5.h.b(new rv0.y6(this));
        this.f481901x = new lv0.c((int) (j65.q.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getDisplayMetrics().density * 12), 0, 0, 0, 0, null, 62, null);
        this.f481902y = jz5.h.b(new rv0.t5(this));
        this.f481903z = new java.util.concurrent.ConcurrentHashMap();
        this.B = new rv0.r6(this);
        this.C = new rv0.p6(this);
        this.D = new rv0.y5(this);
        this.E = new rv0.w6(this);
    }

    public static final void k7(rv0.z6 z6Var) {
        ex0.r n17;
        ex0.a0 v76 = z6Var.v7();
        java.lang.Object obj = (v76 == null || (n17 = v76.n()) == null) ? null : n17.f338700a;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3 = obj instanceof com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 ? (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3) obj : null;
        if (c4181x2248e1a3 == null || c4181x2248e1a3.C() == ug.m.ImageClip) {
            return;
        }
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553.f16108xa1116659;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4181x2248e1a3.D();
        if (D != null) {
            c4129xdee64553 = com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3.T0(c4181x2248e1a3, D);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c4129xdee64553, "getBoundingTimeRangeInMedia(...)");
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m47440x52b3d78f = z6Var.u7().m47440x52b3d78f();
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m34009x8082fb99 = c4129xdee64553.m34009x8082fb99();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m34009x8082fb99, "getStartTime(...)");
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a a17 = ou0.f.a(m47440x52b3d78f, m34009x8082fb99);
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a sub = c4129xdee64553.m34007xde00a612().sub(new com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a(1L));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sub, "sub(...)");
        c4181x2248e1a3.u0(ou0.f.b(a17, sub));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l7(rv0.z6 r11, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 r12, rv0.c7 r13, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r14) {
        /*
            r11.getClass()
            boolean r0 = r14 instanceof rv0.p5
            if (r0 == 0) goto L16
            r0 = r14
            rv0.p5 r0 = (rv0.p5) r0
            int r1 = r0.f481719i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f481719i = r1
            goto L1b
        L16:
            rv0.p5 r0 = new rv0.p5
            r0.<init>(r11, r14)
        L1b:
            java.lang.Object r14 = r0.f481717g
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f481719i
            jz5.f0 r3 = jz5.f0.f384359a
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 != r4) goto L3a
            java.lang.Object r11 = r0.f481716f
            com.tencent.maas.model.time.MJTime r11 = (com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a) r11
            java.lang.Object r12 = r0.f481715e
            ex0.r r12 = (ex0.r) r12
            java.lang.Object r13 = r0.f481714d
            rv0.z6 r13 = (rv0.z6) r13
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            r2 = r11
            r11 = r13
            goto L9d
        L3a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L42:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            ex0.a0 r14 = r11.v7()
            if (r14 != 0) goto L4d
            goto Ld4
        L4d:
            ex0.r r12 = r14.K(r12)
            if (r12 != 0) goto L55
            goto Ld4
        L55:
            com.tencent.maas.moviecomposing.segments.Segment r14 = r12.f338700a
            boolean r2 = r14 instanceof com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3
            if (r2 == 0) goto L5e
            com.tencent.maas.moviecomposing.segments.ClipSegment r14 = (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3) r14
            goto L5f
        L5e:
            r14 = 0
        L5f:
            if (r14 != 0) goto L62
            goto Ld4
        L62:
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.ClipStorylineSegmentTimelineView r2 = r11.u7()
            com.tencent.maas.model.time.MJTime r2 = r2.m47440x52b3d78f()
            ug.m r5 = ug.m.ImageClip
            ug.m r6 = r12.f338702c
            if (r6 != r5) goto L8a
            com.tencent.maas.model.time.MJTime r12 = r12.k()
            gx0.bf r4 = r11.t7()
            com.tencent.maas.model.time.MJTime r5 = r12.add(r2)
            java.lang.String r11 = "add(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r5, r11)
            r6 = 1
            r7 = 0
            r9 = 4
            r10 = 0
            gx0.bf.q7(r4, r5, r6, r7, r9, r10)
            goto Ld4
        L8a:
            gx0.bf r5 = r11.t7()
            r0.f481714d = r11
            r0.f481715e = r12
            r0.f481716f = r2
            r0.f481719i = r4
            java.lang.Object r13 = r5.Z6(r14, r13, r0)
            if (r13 != r1) goto L9d
            goto Ld5
        L9d:
            gx0.bf r13 = r11.t7()
            r13.b7(r2, r4)
            com.tencent.maas.model.time.MJTime r12 = r12.k()
            gx0.bf r13 = r11.t7()
            androidx.lifecycle.g0 r13 = r13.f357791y
            java.lang.Object r13 = r13.mo3195x754a37bb()
            com.tencent.maas.model.time.MJTime r13 = (com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a) r13
            if (r13 != 0) goto Lb8
            com.tencent.maas.model.time.MJTime r13 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16094x2a998d44
        Lb8:
            boolean r14 = r13.m33983x7b953cf2()
            if (r14 == 0) goto Lcb
            jz5.g r14 = r11.f481892o
            jz5.n r14 = (jz5.n) r14
            java.lang.Object r14 = r14.mo141623x754a37bb()
            gx0.bh r14 = (gx0.bh) r14
            r14.i7(r12, r13)
        Lcb:
            gx0.bf r11 = r11.t7()
            r11.getClass()
            r11.M = r12
        Ld4:
            r1 = r3
        Ld5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: rv0.z6.l7(rv0.z6, com.tencent.maas.base.MJID, rv0.c7, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m7(rv0.z6 r9, rv0.c7 r10, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r11) {
        /*
            r9.getClass()
            boolean r0 = r11 instanceof rv0.q5
            if (r0 == 0) goto L16
            r0 = r11
            rv0.q5 r0 = (rv0.q5) r0
            int r1 = r0.f481741i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f481741i = r1
            goto L1b
        L16:
            rv0.q5 r0 = new rv0.q5
            r0.<init>(r9, r11)
        L1b:
            java.lang.Object r11 = r0.f481739g
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f481741i
            jz5.f0 r3 = jz5.f0.f384359a
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L4b
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto L54
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            java.lang.Object r9 = r0.f481738f
            com.tencent.maas.moviecomposing.segments.ClipSegment r9 = (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3) r9
            java.lang.Object r10 = r0.f481737e
            rv0.c7 r10 = (rv0.c7) r10
            java.lang.Object r2 = r0.f481736d
            rv0.z6 r2 = (rv0.z6) r2
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            r8 = r2
            r2 = r9
            r9 = r8
            goto L8d
        L4b:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            ex0.a0 r11 = r9.v7()
            if (r11 != 0) goto L56
        L54:
            r1 = r3
            goto L9f
        L56:
            ex0.r r11 = r11.n()
            if (r11 != 0) goto L5d
            goto L54
        L5d:
            com.tencent.maas.moviecomposing.segments.Segment r2 = r11.f338700a
            boolean r7 = r2 instanceof com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3
            if (r7 == 0) goto L66
            com.tencent.maas.moviecomposing.segments.ClipSegment r2 = (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3) r2
            goto L67
        L66:
            r2 = r6
        L67:
            if (r2 != 0) goto L6a
            goto L54
        L6a:
            gx0.bf r7 = r9.t7()
            boolean r7 = r7.L
            if (r7 == 0) goto L73
            goto L54
        L73:
            ug.m r7 = ug.m.ImageClip
            ug.m r11 = r11.f338702c
            if (r11 != r7) goto L7a
            goto L54
        L7a:
            gx0.bf r11 = r9.t7()
            r0.f481736d = r9
            r0.f481737e = r10
            r0.f481738f = r2
            r0.f481741i = r5
            java.lang.Object r11 = r11.s7(r0)
            if (r11 != r1) goto L8d
            goto L9f
        L8d:
            gx0.bf r9 = r9.t7()
            r0.f481736d = r6
            r0.f481737e = r6
            r0.f481738f = r6
            r0.f481741i = r4
            java.lang.Object r9 = r9.Z6(r2, r10, r0)
            if (r9 != r1) goto L54
        L9f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: rv0.z6.m7(rv0.z6, rv0.c7, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object n7(rv0.z6 r4, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a r5, boolean r6, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r7) {
        /*
            r4.getClass()
            boolean r0 = r7 instanceof rv0.s5
            if (r0 == 0) goto L16
            r0 = r7
            rv0.s5 r0 = (rv0.s5) r0
            int r1 = r0.f481778i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f481778i = r1
            goto L1b
        L16:
            rv0.s5 r0 = new rv0.s5
            r0.<init>(r4, r7)
        L1b:
            java.lang.Object r7 = r0.f481776g
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f481778i
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            boolean r6 = r0.f481775f
            java.lang.Object r4 = r0.f481774e
            r5 = r4
            com.tencent.maas.model.time.MJTime r5 = (com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a) r5
            java.lang.Object r4 = r0.f481773d
            rv0.z6 r4 = (rv0.z6) r4
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L53
        L35:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3d:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            gx0.bf r7 = r4.t7()
            r0.f481773d = r4
            r0.f481774e = r5
            r0.f481775f = r6
            r0.f481778i = r3
            java.lang.Object r7 = r7.s7(r0)
            if (r7 != r1) goto L53
            goto L5c
        L53:
            gx0.bf r4 = r4.t7()
            r4.b7(r5, r6)
            jz5.f0 r1 = jz5.f0.f384359a
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: rv0.z6.n7(rv0.z6, com.tencent.maas.model.time.MJTime, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    public com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6 Y6() {
        rv0.o5 o5Var = new rv0.o5(m158354x19263085());
        o5Var.I(new rv0.i6(this), new rv0.j6(this));
        return o5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [gv0.b, androidx.recyclerview.widget.f2, sv0.f] */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.view.View, androidx.recyclerview.widget.RecyclerView] */
    /* JADX WARN: Type inference failed for: r4v0, types: [kz5.p0] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.util.ArrayList] */
    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    public void a7(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6 abstractC10936x89d53ec6) {
        ?? r47;
        java.lang.Object obj;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a;
        p012xc85e97e9.p093xedfae76a.j0 j0Var;
        p012xc85e97e9.p093xedfae76a.j0 j0Var2;
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78;
        sv0.h hVar;
        ex0.r n17;
        rv0.o5 panel = (rv0.o5) abstractC10936x89d53ec6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        ex0.a0 v76 = v7();
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f782 = (v76 == null || (n17 = v76.n()) == null) ? null : n17.f338701b;
        if (v76 == null || c3971x241f782 == null) {
            r47 = kz5.p0.f395529d;
        } else {
            java.util.List list = v76.f338630g.f338710e;
            r47 = new java.util.ArrayList();
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                ex0.r rVar = (ex0.r) it.next();
                if (rVar.f338702c != ug.m.Transition) {
                    hVar = new sv0.h(rVar.f338701b, (long) rVar.i().m33987xd22e7c2d(), rVar.f338702c == ug.m.ImageClip, p3321xbce91901.jvm.p3324x21ffc6bd.o.b(rVar.f338701b, c3971x241f782));
                } else {
                    hVar = null;
                }
                if (hVar != null) {
                    r47.add(hVar);
                }
            }
        }
        ?? r07 = this.f481897t;
        r07.y(r47);
        java.util.ArrayList arrayList = r07.f357503d;
        java.util.Iterator it6 = arrayList.iterator();
        while (true) {
            if (!it6.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it6.next();
                if (((sv0.h) obj).f494759d) {
                    break;
                }
            }
        }
        sv0.h hVar2 = (sv0.h) obj;
        if (hVar2 != null && (c3971x241f78 = hVar2.f494756a) != null) {
            p3325xe03a0797.p3326xc267989b.l.d(mo144225x95f74600(), p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new rv0.f6(this, c3971x241f78, null), 2, null);
        }
        java.util.Iterator it7 = arrayList.iterator();
        while (it7.hasNext()) {
            p3325xe03a0797.p3326xc267989b.l.d(mo144225x95f74600(), p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new rv0.g6(this, (sv0.h) it7.next(), null), 2, null);
        }
        ?? p76 = p7();
        p76.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(p76.getContext(), 0, false));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.n2 m7949x5701d990 = p76.m7949x5701d990();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.o3 o3Var = m7949x5701d990 instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.o3 ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.o3) m7949x5701d990 : null;
        if (o3Var != null) {
            o3Var.f93715g = false;
        }
        p76.mo7960x6cab2c8d(r07);
        lv0.c cVar = this.f481901x;
        p76.S0(cVar);
        p76.N(cVar);
        r07.f494755h = new rv0.a6(this);
        rv0.k6 k6Var = new rv0.k6(this);
        ex0.a0 v77 = v7();
        if (v77 != null) {
            android.view.View mo144222x4ff8c0f0 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.s_8);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f0, "findViewById(...)");
            this.f481900w = (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p892x2ea350.C10941x9ba2abc0) mo144222x4ff8c0f0;
            u7().post(new rv0.h6(this, v77, k6Var));
        }
        ex0.a0 v78 = v7();
        if (v78 != null && (j0Var2 = v78.f338648y) != null) {
            j0Var2.mo7806x9d92d11c(W6(), new rv0.b6(this));
        }
        ex0.a0 v79 = v7();
        if (v79 != null && (j0Var = v79.A) != null) {
            j0Var.mo7806x9d92d11c(W6(), new rv0.d6(this));
        }
        ((gx0.gf) ((jz5.n) this.f481895r).mo141623x754a37bb()).f358006f.mo7806x9d92d11c(W6(), new rv0.e6(this));
        panel.H();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f481903z;
        concurrentHashMap.clear();
        ex0.a0 v710 = v7();
        if (v710 != null) {
            java.util.Iterator it8 = ((java.util.ArrayList) v710.f338630g.f338710e).iterator();
            while (it8.hasNext()) {
                ex0.r rVar2 = (ex0.r) it8.next();
                ug.m mVar = rVar2.f338702c;
                if (mVar == ug.m.VideoClip || mVar == ug.m.MovieClip) {
                    com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 m17 = rVar2.m();
                    if (m17 == null || (c4128x879fba0a = m17.m34009x8082fb99()) == null) {
                        c4128x879fba0a = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5;
                    }
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c4128x879fba0a);
                    concurrentHashMap.put(rVar2.f338701b, c4128x879fba0a);
                }
            }
        }
        panel.m47074x209a1f1f(java.lang.Boolean.TRUE);
        gx0.bh bhVar = (gx0.bh) ((jz5.n) this.f481892o).mo141623x754a37bb();
        rv0.l6 l6Var = new rv0.l6(this);
        bhVar.getClass();
        bhVar.L.m144677xb4f1a68f(l6Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r1.m160992x59adcaf2() == true) goto L8;
     */
    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e7() {
        /*
            r10 = this;
            com.tencent.maas.model.time.MJTime r0 = r10.s7()
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel r1 = r10.f150773i
            rv0.o5 r1 = (rv0.o5) r1
            if (r1 == 0) goto L12
            boolean r1 = r1.m160992x59adcaf2()
            r2 = 1
            if (r1 != r2) goto L12
            goto L13
        L12:
            r2 = 0
        L13:
            if (r2 == 0) goto L18
            r10.x7()
        L18:
            gx0.bf r1 = r10.t7()
            r1.getClass()
            com.tencent.maas.model.time.MJTime r2 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16094x2a998d44
            java.lang.String r3 = "InvalidTime"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r3)
            r1.M = r2
            r5 = 0
            r6 = 0
            rv0.m6 r7 = new rv0.m6
            r1 = 0
            r7.<init>(r10, r0, r1)
            r8 = 3
            r9 = 0
            r4 = r10
            pf5.e.m158344xbe96bc24(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rv0.z6.e7():void");
    }

    public final com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p892x2ea350.C10940x12e5c58f o7() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f481902y).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p892x2ea350.C10940x12e5c58f) mo141623x754a37bb;
    }

    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 p7() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f481896s).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) mo141623x754a37bb;
    }

    public final com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 q7() {
        java.lang.Object obj;
        java.util.Iterator it = this.f481897t.f357503d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((sv0.h) obj).f494759d) {
                break;
            }
        }
        sv0.h hVar = (sv0.h) obj;
        if (hVar != null) {
            return hVar.f494756a;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a r7(java.lang.Double r8) {
        /*
            r7 = this;
            ex0.a0 r0 = r7.v7()
            r1 = 0
            if (r0 == 0) goto L14
            com.tencent.maas.base.MJID r2 = r7.q7()
            ex0.r r0 = r0.K(r2)
            if (r0 == 0) goto L14
            com.tencent.maas.moviecomposing.segments.Segment r0 = r0.f338700a
            goto L15
        L14:
            r0 = r1
        L15:
            boolean r2 = r0 instanceof com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3
            if (r2 == 0) goto L1c
            com.tencent.maas.moviecomposing.segments.ClipSegment r0 = (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3) r0
            goto L1d
        L1c:
            r0 = r1
        L1d:
            r2 = 1
            if (r0 == 0) goto L45
            double r3 = r0.v1()
            java.lang.Double r0 = java.lang.Double.valueOf(r3)
            double r3 = r0.doubleValue()
            boolean r5 = java.lang.Double.isInfinite(r3)
            if (r5 != 0) goto L3a
            boolean r3 = java.lang.Double.isNaN(r3)
            if (r3 != 0) goto L3a
            r3 = r2
            goto L3b
        L3a:
            r3 = 0
        L3b:
            if (r3 == 0) goto L3e
            r1 = r0
        L3e:
            if (r1 == 0) goto L45
            double r0 = r1.doubleValue()
            goto L47
        L45:
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L47:
            if (r8 == 0) goto L4e
            double r3 = r8.doubleValue()
            goto L56
        L4e:
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.ClipStorylineCursor r8 = r7.o7()
            double r3 = r8.m47120x43d18c6c()
        L56:
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.ClipStorylineSegmentTimelineView r8 = r7.u7()
            double r5 = r8.m47441x185482f6()
            double r3 = r3 + r5
            ex0.a0 r8 = r7.v7()
            if (r8 == 0) goto L72
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.ClipStorylineSegmentTimelineView r5 = r7.u7()
            bx0.i r5 = r5.getTimelineLayoutType()
            float r8 = r8.s(r5)
            goto L74
        L72:
            r8 = 1065353216(0x3f800000, float:1.0)
        L74:
            double r5 = (double) r8
            double r3 = r3 / r5
            com.tencent.maas.model.time.MJTime r8 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33969x7905b775(r3)
            r8.m33988x124aa384()
            com.tencent.maas.model.time.MJTime r8 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33969x7905b775(r3)
            double r2 = (double) r2
            double r2 = r2 / r0
            com.tencent.maas.model.time.MJTime r8 = r8.m33984x636d539(r2)
            java.lang.String r0 = "multi(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r8, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: rv0.z6.r7(java.lang.Double):com.tencent.maas.model.time.MJTime");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a s7() {
        /*
            r7 = this;
            ex0.a0 r0 = r7.v7()
            r1 = 0
            if (r0 == 0) goto L14
            com.tencent.maas.base.MJID r2 = r7.q7()
            ex0.r r0 = r0.K(r2)
            if (r0 == 0) goto L14
            com.tencent.maas.moviecomposing.segments.Segment r0 = r0.f338700a
            goto L15
        L14:
            r0 = r1
        L15:
            boolean r2 = r0 instanceof com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3
            if (r2 == 0) goto L1c
            com.tencent.maas.moviecomposing.segments.ClipSegment r0 = (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3) r0
            goto L1d
        L1c:
            r0 = r1
        L1d:
            r2 = 1
            if (r0 == 0) goto L45
            double r3 = r0.v1()
            java.lang.Double r0 = java.lang.Double.valueOf(r3)
            double r3 = r0.doubleValue()
            boolean r5 = java.lang.Double.isInfinite(r3)
            if (r5 != 0) goto L3a
            boolean r3 = java.lang.Double.isNaN(r3)
            if (r3 != 0) goto L3a
            r3 = r2
            goto L3b
        L3a:
            r3 = 0
        L3b:
            if (r3 == 0) goto L3e
            r1 = r0
        L3e:
            if (r1 == 0) goto L45
            double r0 = r1.doubleValue()
            goto L47
        L45:
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L47:
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.ClipStorylineCursor r3 = r7.o7()
            double r3 = r3.m47120x43d18c6c()
            ex0.a0 r5 = r7.v7()
            if (r5 == 0) goto L62
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.ClipStorylineSegmentTimelineView r6 = r7.u7()
            bx0.i r6 = r6.getTimelineLayoutType()
            float r5 = r5.s(r6)
            goto L64
        L62:
            r5 = 1065353216(0x3f800000, float:1.0)
        L64:
            double r5 = (double) r5
            double r3 = r3 / r5
            com.tencent.maas.model.time.MJTime r3 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33969x7905b775(r3)
            double r4 = (double) r2
            double r4 = r4 / r0
            com.tencent.maas.model.time.MJTime r0 = r3.m33984x636d539(r4)
            java.lang.String r1 = "multi(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rv0.z6.s7():com.tencent.maas.model.time.MJTime");
    }

    public final gx0.bf t7() {
        return (gx0.bf) ((jz5.n) this.f481894q).mo141623x754a37bb();
    }

    public final com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p892x2ea350.C10941x9ba2abc0 u7() {
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p892x2ea350.C10941x9ba2abc0 c10941x9ba2abc0 = this.f481900w;
        if (c10941x9ba2abc0 != null) {
            return c10941x9ba2abc0;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("timelineView");
        throw null;
    }

    public final ex0.a0 v7() {
        return ((gx0.kh) ((jz5.n) this.f481893p).mo141623x754a37bb()).f358175r;
    }

    public final void w7(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78) {
        ex0.a0 v76 = v7();
        if (v76 == null) {
            return;
        }
        ex0.r K = v76.K(c3971x241f78);
        ex0.c cVar = K instanceof ex0.c ? (ex0.c) K : null;
        if (cVar == null) {
            return;
        }
        t7().o7(cVar.B(), true);
        v76.l(cVar);
        u7().n(c3971x241f78);
        pf5.e.m158344xbe96bc24(this, null, null, new rv0.u6(this, c3971x241f78, null), 3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (r0.m160994x67ad68cc() == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x7() {
        /*
            r3 = this;
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel r0 = r3.f150773i
            rv0.o5 r0 = (rv0.o5) r0
            if (r0 == 0) goto Le
            boolean r0 = r0.m160994x67ad68cc()
            r1 = 1
            if (r0 != r1) goto Le
            goto Lf
        Le:
            r1 = 0
        Lf:
            if (r1 == 0) goto L2f
            jz5.g r0 = r3.f481893p
            jz5.n r0 = (jz5.n) r0
            java.lang.Object r0 = r0.mo141623x754a37bb()
            gx0.kh r0 = (gx0.kh) r0
            android.app.Activity r1 = r3.m80379x76847179()
            r2 = 2131771427(0x7f104023, float:1.9174185E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.String r2 = "getString(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r2)
            r2 = 0
            r0.r7(r1, r2)
        L2f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rv0.z6.x7():void");
    }
}
