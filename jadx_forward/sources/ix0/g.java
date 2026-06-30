package ix0;

/* loaded from: classes5.dex */
public final class g implements pv0.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 f376838a;

    /* renamed from: b, reason: collision with root package name */
    public final pv0.y f376839b;

    /* renamed from: c, reason: collision with root package name */
    public final gx0.kh f376840c;

    /* renamed from: d, reason: collision with root package name */
    public final gx0.bf f376841d;

    /* renamed from: e, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f376842e;

    /* renamed from: f, reason: collision with root package name */
    public final ix0.a f376843f;

    /* JADX WARN: Multi-variable type inference failed */
    public g(com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 originSegment, pv0.y timbrePanelUIC, gx0.kh timelineUIC, gx0.bf playbackControlUIC, p3325xe03a0797.p3326xc267989b.y0 mainScope) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originSegment, "originSegment");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timbrePanelUIC, "timbrePanelUIC");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timelineUIC, "timelineUIC");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(playbackControlUIC, "playbackControlUIC");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mainScope, "mainScope");
        this.f376838a = originSegment;
        this.f376839b = timbrePanelUIC;
        this.f376840c = timelineUIC;
        this.f376841d = playbackControlUIC;
        this.f376842e = mainScope;
        this.f376843f = new ix0.a(this, (ug.n) originSegment);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final java.lang.Object h(ix0.g gVar, com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713, java.lang.String str, java.lang.String str2, java.lang.String str3, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        gVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ElementSegmentTextReadL", "applyAdjustableSpeech: roleFilePath " + str3 + " roleID " + str + " roleFilePath " + str3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c4190xd8dd3713, "null cannot be cast to non-null type com.tencent.maas.moviecomposing.segments.TextToSpeechAdjustable");
        ug.n nVar = (ug.n) c4190xd8dd3713;
        nVar.k(str, str2);
        java.lang.String e17 = nVar.e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "getAudioFilePath(...)");
        if (e17.length() == 0) {
            nVar.i(str3);
        } else {
            nVar.h(str3);
        }
        java.lang.Object d76 = gx0.bf.d7(gVar.f376841d, null, null, false, interfaceC29045xdcb5ca57, 7, null);
        return d76 == pz5.a.f440719d ? d76 : jz5.f0.f384359a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0077 -> B:10:0x0079). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0086 -> B:11:0x008f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0088 -> B:12:0x0090). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(ix0.g r7, dw0.c r8, java.util.List r9, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r10) {
        /*
            r7.getClass()
            boolean r0 = r10 instanceof ix0.f
            if (r0 == 0) goto L16
            r0 = r10
            ix0.f r0 = (ix0.f) r0
            int r1 = r0.f376837m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f376837m = r1
            goto L1b
        L16:
            ix0.f r0 = new ix0.f
            r0.<init>(r7, r10)
        L1b:
            java.lang.Object r10 = r0.f376835h
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f376837m
            r3 = 1
            if (r2 == 0) goto L42
            if (r2 != r3) goto L3a
            java.lang.Object r7 = r0.f376834g
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r8 = r0.f376833f
            java.util.Collection r8 = (java.util.Collection) r8
            java.lang.Object r9 = r0.f376832e
            dw0.c r9 = (dw0.c) r9
            java.lang.Object r2 = r0.f376831d
            ix0.g r2 = (ix0.g) r2
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L79
        L3a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L42:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r9 = r9.iterator()
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r6
        L52:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L96
            java.lang.Object r2 = r7.next()
            com.tencent.maas.moviecomposing.segments.Segment r2 = (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713) r2
            boolean r4 = r9.b()
            if (r4 == 0) goto L7c
            r0.f376831d = r8
            r0.f376832e = r9
            r0.f376833f = r10
            r0.f376834g = r7
            r0.f376837m = r3
            java.lang.String r4 = "onTimbreAudition"
            java.lang.Object r2 = r8.j(r2, r4, r0)
            if (r2 != r1) goto L77
            goto L99
        L77:
            r2 = r8
            r8 = r10
        L79:
            r10 = r8
            r8 = r2
            goto L8f
        L7c:
            com.tencent.maas.base.MJID r4 = r2.f130065a
            com.tencent.maas.moviecomposing.segments.Segment r5 = r8.f376838a
            com.tencent.maas.base.MJID r5 = r5.f130065a
            boolean r4 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r4, r5)
            if (r4 != 0) goto L8f
            com.tencent.maas.material.MJMaterialInfo r4 = r9.f325619a
            yu0.t r2 = ru0.a.f(r2, r4)
            goto L90
        L8f:
            r2 = 0
        L90:
            if (r2 == 0) goto L52
            r10.add(r2)
            goto L52
        L96:
            r1 = r10
            java.util.List r1 = (java.util.List) r1
        L99:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ix0.g.i(ix0.g, dw0.c, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // pv0.a
    public void a(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID, java.lang.String roleID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roleID, "roleID");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ElementSegmentTextReadL", "onError: segmentID " + segmentID + " roleID " + roleID);
    }

    @Override // pv0.a
    public void b(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ElementSegmentTextReadL", "onSubmitted: segmentID " + segmentID);
    }

    @Override // pv0.a
    public void c(dw0.c timbreInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timbreInfo, "timbreInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ElementSegmentTextReadL", "onPreSelect: ");
    }

    @Override // pv0.a
    public void d(dw0.c timbreInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timbreInfo, "timbreInfo");
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713 = timbreInfo.f325620b;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 k17 = k(c4190xd8dd3713 != null ? c4190xd8dd3713.f130065a : null);
        if (k17 == null) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            k17 = null;
        }
        if (k17 == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ElementSegmentTextReadL", "onTimbreAudition: ");
        p3325xe03a0797.p3326xc267989b.l.d(this.f376842e, null, null, new ix0.e(timbreInfo, this, k17, null), 3, null);
    }

    @Override // pv0.a
    public void e(ru0.e roleResult) {
        com.p314xaae8f345.mm.vfs.r6 r6Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roleResult, "roleResult");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ElementSegmentTextReadL", "onRoleResult: roleResult " + roleResult);
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 k17 = k(roleResult.f481195a);
        if (k17 == null) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            k17 = null;
        }
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713 = k17;
        if (c4190xd8dd3713 == null || (r6Var = roleResult.f481198d) == null) {
            return;
        }
        p3325xe03a0797.p3326xc267989b.l.d(this.f376842e, null, null, new ix0.d(this, c4190xd8dd3713, roleResult, r6Var, null), 3, null);
    }

    @Override // pv0.a
    public boolean f(dw0.c timbreInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timbreInfo, "timbreInfo");
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713 = null;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd37132 = timbreInfo.f325620b;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 k17 = k(c4190xd8dd37132 != null ? c4190xd8dd37132.f130065a : null);
        if (k17 == null) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        } else {
            c4190xd8dd3713 = k17;
        }
        boolean z17 = true;
        if (c4190xd8dd3713 == null) {
            return true;
        }
        int ordinal = c4190xd8dd3713.C().ordinal();
        if (ordinal != 5) {
            if (ordinal == 6) {
                java.util.List d76 = this.f376840c.d7();
                p3325xe03a0797.p3326xc267989b.l.d(this.f376842e, null, null, new ix0.b(this, timbreInfo, d76, c4190xd8dd3713, null), 3, null);
                if (d76.size() > 1 && !timbreInfo.b()) {
                    z17 = false;
                }
            } else if (ordinal != 7) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ElementSegmentTextReadL", "onApplyTimbre:  why segmentType " + c4190xd8dd3713.C());
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ElementSegmentTextReadL", "onApplyTimbre: segmentType " + c4190xd8dd3713.C() + " result " + z17);
        return z17;
    }

    @Override // pv0.a
    public void g(dw0.c timbreInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timbreInfo, "timbreInfo");
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713 = timbreInfo.f325620b;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 k17 = k(c4190xd8dd3713 != null ? c4190xd8dd3713.f130065a : null);
        if (k17 == null) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            k17 = null;
        }
        if (k17 == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ElementSegmentTextReadL", "onCancelTimbre: segmentType " + k17.C());
        ug.m C = k17.C();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(C, "getSegmentType(...)");
        pv0.y yVar = this.f376839b;
        yVar.getClass();
        pv0.g gVar = (pv0.g) yVar.f440097r.get(C);
        if (gVar != null) {
            ((vu0.s) ((jz5.n) gVar.f440056d).mo141623x754a37bb()).a();
        }
        p3325xe03a0797.p3326xc267989b.l.d(this.f376842e, null, null, new ix0.c(this, k17, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object j(com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c4190xd8dd3713, "null cannot be cast to non-null type com.tencent.maas.moviecomposing.segments.TextToSpeechAdjustable");
        ug.n nVar = (ug.n) c4190xd8dd3713;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ElementSegmentTextReadL", "clearSpeech: tag " + str);
        nVar.d();
        nVar.f();
        java.lang.Object d76 = gx0.bf.d7(this.f376841d, null, null, false, interfaceC29045xdcb5ca57, 7, null);
        return d76 == pz5.a.f440719d ? d76 : jz5.f0.f384359a;
    }

    public final com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 k(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78) {
        if (c3971x241f78 == null) {
            return null;
        }
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 b76 = this.f376840c.b7(c3971x241f78);
        if (b76 instanceof ug.n) {
            return b76;
        }
        return null;
    }
}
