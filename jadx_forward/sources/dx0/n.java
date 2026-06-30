package dx0;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final dx0.h f325990a;

    /* renamed from: b, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p0 f325991b;

    /* renamed from: c, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p0 f325992c;

    /* renamed from: d, reason: collision with root package name */
    public ex0.a0 f325993d;

    /* renamed from: e, reason: collision with root package name */
    public android.util.Size f325994e;

    /* renamed from: f, reason: collision with root package name */
    public bx0.h f325995f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f325996g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f325997h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f325998i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f325999j;

    public n(dx0.h thumbnailProviderCallback, p3325xe03a0797.p3326xc267989b.p0 uiDispatcher, p3325xe03a0797.p3326xc267989b.p0 ioDispatcher, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        if ((i17 & 2) != 0) {
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            uiDispatcher = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
        }
        ioDispatcher = (i17 & 4) != 0 ? p3325xe03a0797.p3326xc267989b.q1.f392103c : ioDispatcher;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbnailProviderCallback, "thumbnailProviderCallback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiDispatcher, "uiDispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ioDispatcher, "ioDispatcher");
        this.f325990a = thumbnailProviderCallback;
        this.f325991b = uiDispatcher;
        this.f325992c = ioDispatcher;
        this.f325998i = new java.util.concurrent.ConcurrentHashMap();
    }

    public final void a(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        ex0.a0 a0Var = this.f325993d;
        if (a0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("timelineVM");
            throw null;
        }
        com.p314xaae8f345.p457x3304c6.p479x4179489f.o0 p17 = a0Var.p(segmentID);
        if (p17 != null) {
            p17.a();
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f325998i;
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            dx0.r rVar = (dx0.r) ((java.util.Map.Entry) it.next()).getKey();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(rVar.f326006a, segmentID)) {
                concurrentHashMap.remove(rVar);
            }
        }
    }

    public final android.util.Size b() {
        android.util.Size size = this.f325994e;
        if (size != null) {
            return size;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("thumbnailSize");
        throw null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:10)(2:15|16))(2:17|(2:19|(2:23|(6:25|(1:27)(1:48)|28|(1:30)|31|(1:33)(2:34|(4:41|(1:43)(1:47)|44|(1:46))(1:40)))(2:49|50))(1:22))(2:51|52))|11|12))|54|6|7|(0)(0)|11|12) */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 r13, boolean r14, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof dx0.j
            if (r0 == 0) goto L13
            r0 = r15
            dx0.j r0 = (dx0.j) r0
            int r1 = r0.f325978f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f325978f = r1
            goto L18
        L13:
            dx0.j r0 = new dx0.j
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.f325976d
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f325978f
            r3 = 1
            jz5.f0 r4 = jz5.f0.f384359a
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r15)     // Catch: java.lang.Exception -> L93
            goto L93
        L2a:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L32:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r15)
            ex0.a0 r15 = r12.f325993d
            java.lang.String r2 = "timelineVM"
            r5 = 0
            if (r15 == 0) goto L98
            com.tencent.maas.moviecomposing.o0 r15 = r15.p(r13)
            if (r15 == 0) goto L45
            if (r14 != 0) goto L45
            return r4
        L45:
            ex0.a0 r15 = r12.f325993d
            if (r15 == 0) goto L94
            ex0.v r15 = r15.f338630g
            ex0.r r15 = r15.g(r13)
            if (r15 == 0) goto L54
            com.tencent.maas.moviecomposing.segments.Segment r15 = r15.f338700a
            goto L55
        L54:
            r15 = r5
        L55:
            boolean r2 = r15 instanceof com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3
            if (r2 == 0) goto L5c
            r5 = r15
            com.tencent.maas.moviecomposing.segments.ClipSegment r5 = (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3) r5
        L5c:
            r10 = r5
            if (r10 != 0) goto L60
            return r4
        L60:
            ug.m r15 = r10.C()
            ug.m r2 = ug.m.ImageClip
            if (r15 == r2) goto L79
            ug.m r15 = r10.C()
            ug.m r2 = ug.m.MovieClip
            if (r15 == r2) goto L79
            ug.m r15 = r10.C()
            ug.m r2 = ug.m.VideoClip
            if (r15 == r2) goto L79
            return r4
        L79:
            kotlinx.coroutines.p0 r15 = r12.f325992c     // Catch: java.lang.Exception -> L93
            dx0.l r2 = new dx0.l     // Catch: java.lang.Exception -> L93
            if (r14 == 0) goto L81
            r9 = r3
            goto L83
        L81:
            r14 = 0
            r9 = r14
        L83:
            r11 = 0
            r6 = r2
            r7 = r12
            r8 = r13
            r6.<init>(r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L93
            r0.f325978f = r3     // Catch: java.lang.Exception -> L93
            java.lang.Object r13 = p3325xe03a0797.p3326xc267989b.l.g(r15, r2, r0)     // Catch: java.lang.Exception -> L93
            if (r13 != r1) goto L93
            return r1
        L93:
            return r4
        L94:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r2)
            throw r5
        L98:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r2)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: dx0.n.c(com.tencent.maas.base.MJID, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void d(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        ex0.a0 a0Var = this.f325993d;
        if (a0Var != null) {
            a0Var.H.f(segmentID);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("timelineVM");
            throw null;
        }
    }

    public final void e(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID, android.graphics.Rect screenVisibleRect) {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.m0 m0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(screenVisibleRect, "screenVisibleRect");
        ex0.a0 a0Var = this.f325993d;
        if (a0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("timelineVM");
            throw null;
        }
        if (a0Var.h(segmentID)) {
            bx0.h hVar = this.f325995f;
            if (hVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("timelineCalc");
                throw null;
            }
            android.graphics.Rect b17 = hVar.b(segmentID, false);
            ex0.a0 a0Var2 = this.f325993d;
            if (a0Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("timelineVM");
                throw null;
            }
            com.p314xaae8f345.p457x3304c6.p479x4179489f.o0 p17 = a0Var2.p(segmentID);
            if (p17 != null && b17.width() > 0) {
                int width = screenVisibleRect.width();
                int i17 = screenVisibleRect.left;
                int i18 = screenVisibleRect.right;
                int i19 = b17.left;
                while (i19 < b17.right) {
                    int width2 = b().getWidth() + i19;
                    double d17 = i19;
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4176xaeba704a c4176xaeba704a = new com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4176xaeba704a(d17, width2 - d17);
                    com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 f17 = f(segmentID, c4176xaeba704a);
                    dx0.r rVar = new dx0.r(segmentID, f17);
                    int i27 = i17 - width;
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f325998i;
                    if (width2 <= i27 || i19 >= i18 + width) {
                        if (concurrentHashMap.containsKey(rVar)) {
                            dx0.q qVar = (dx0.q) concurrentHashMap.get(rVar);
                            if (qVar == null || (m0Var = qVar.f326002a) == null) {
                                return;
                            }
                            if ((!m0Var.m34362xb2c87fbf(com.p314xaae8f345.p457x3304c6.p479x4179489f.m0.f130044b)) && !m0Var.m34362xb2c87fbf(com.p314xaae8f345.p457x3304c6.p479x4179489f.m0.f130045c)) {
                                m0Var.m34364x9616526c();
                                p17.b(m0Var);
                            }
                            concurrentHashMap.remove(rVar);
                        } else {
                            continue;
                        }
                    } else if (!concurrentHashMap.containsKey(rVar)) {
                        concurrentHashMap.put(rVar, new dx0.q(null, f17, null, null));
                        com.p314xaae8f345.p457x3304c6.p479x4179489f.m0 d18 = p17.d(f17, new dx0.m(this, rVar, segmentID, c4176xaeba704a));
                        java.util.Objects.toString(d18);
                        segmentID.m32424x9616526c();
                        c4176xaeba704a.m34329x9616526c();
                        dx0.o.c(f17);
                        dx0.q qVar2 = (dx0.q) concurrentHashMap.get(rVar);
                        if (qVar2 != null) {
                            qVar2.f326002a = d18;
                        }
                    }
                    i19 = width2;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 f(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 r11, com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4176xaeba704a r12) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dx0.n.f(com.tencent.maas.base.MJID, com.tencent.maas.moviecomposing.layout.OffsetRange):com.tencent.maas.model.time.MJTimeRange");
    }
}
