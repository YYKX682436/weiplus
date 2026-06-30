package gx0;

/* loaded from: classes5.dex */
public final class h0 extends uw0.o {
    public final jz5.g B;
    public final jz5.g C;
    public final jz5.g D;
    public final jz5.g E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.B = jz5.h.b(new gx0.g0(this));
        this.C = jz5.h.b(new gx0.e0(this));
        this.D = jz5.h.b(new gx0.f0(this));
        this.E = jz5.h.b(new gx0.z(this));
    }

    @Override // uw0.o
    public java.util.List A7() {
        return W7().d7();
    }

    @Override // uw0.o
    public ex0.c B7(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        return W7().f7(segmentID);
    }

    @Override // uw0.o
    public ex0.d C7(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        gx0.kh W7 = W7();
        W7.getClass();
        ex0.a0 a0Var = W7.f358175r;
        if (a0Var == null) {
            return null;
        }
        ex0.r g17 = a0Var.f338630g.g(segmentID);
        ex0.d dVar = g17 instanceof ex0.d ? (ex0.d) g17 : null;
        if (dVar != null) {
            return dVar;
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // uw0.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4182xb2a3bd49 D7() {
        /*
            r5 = this;
            gx0.kh r0 = r5.W7()
            ex0.a0 r0 = r0.f358175r
            r1 = 0
            if (r0 == 0) goto L34
            ex0.v r0 = r0.f338630g
            java.util.List r0 = r0.f338711f
            if (r0 == 0) goto L34
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r0.next()
            r3 = r2
            ex0.r r3 = (ex0.r) r3
            ug.m r3 = r3.f338702c
            ug.m r4 = ug.m.ContentDesc
            if (r3 != r4) goto L28
            r3 = 1
            goto L29
        L28:
            r3 = 0
        L29:
            if (r3 == 0) goto L13
            goto L2d
        L2c:
            r2 = r1
        L2d:
            ex0.r r2 = (ex0.r) r2
            if (r2 == 0) goto L34
            com.tencent.maas.moviecomposing.segments.Segment r0 = r2.f338700a
            goto L35
        L34:
            r0 = r1
        L35:
            boolean r2 = r0 instanceof com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4182xb2a3bd49
            if (r2 == 0) goto L3c
            r1 = r0
            com.tencent.maas.moviecomposing.segments.ContentDescSegment r1 = (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4182xb2a3bd49) r1
        L3c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.h0.D7():com.tencent.maas.moviecomposing.segments.ContentDescSegment");
    }

    @Override // uw0.o
    public void H7(uw0.a panel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        super.H7(panel);
        ((gx0.gf) ((jz5.n) this.D).mo141623x754a37bb()).f358006f.mo7806x9d92d11c(W6(), new gx0.y(this, panel));
    }

    @Override // uw0.o
    public boolean I7(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78) {
        ex0.v vVar;
        ex0.a0 a0Var = W7().f358175r;
        return (a0Var == null || (vVar = a0Var.f338630g) == null || !vVar.b(c3971x241f78)) ? false : true;
    }

    @Override // uw0.o
    public gx0.w J7() {
        return (gx0.w) T6(gx0.f4.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0044  */
    @Override // uw0.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void K7(sw0.d r6, com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 r7) {
        /*
            r5 = this;
            java.lang.String r0 = "data"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r0)
            java.lang.String r0 = "belongingSegment"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r0)
            gx0.kh r0 = r5.W7()
            com.tencent.maas.material.MJMaterialInfo r6 = r6.f494955a
            java.lang.String r6 = r6.f129757b
            java.lang.String r1 = "getMaterialID(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r6, r1)
            com.tencent.maas.base.MJID r7 = r7.f130065a
            java.lang.String r1 = "getSegmentID(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r7, r1)
            r0.getClass()
            ex0.a0 r0 = r0.f358175r
            r2 = 0
            if (r0 != 0) goto L27
            goto L35
        L27:
            com.tencent.maas.moviecomposing.Timeline r3 = r0.f338625b
            r4 = 1
            com.tencent.maas.base.MJID r6 = r3.c(r6, r7, r4)
            if (r6 != 0) goto L33
            java.lang.String r6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a
            r6 = r2
        L33:
            if (r6 != 0) goto L37
        L35:
            r6 = r2
            goto L42
        L37:
            cx0.d r7 = cx0.d.f306043f
            cx0.d r3 = cx0.d.f306042e
            java.util.EnumSet r7 = r7.a(r3)
            r0.J(r7, r2)
        L42:
            if (r6 != 0) goto L47
            java.lang.String r6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a
            r6 = r2
        L47:
            r7 = 0
            if (r6 != 0) goto L4d
            r5.f513123z = r7
            return
        L4d:
            ex0.d r6 = r5.C7(r6)
            if (r6 != 0) goto L56
            java.lang.String r6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a
            r6 = r2
        L56:
            gx0.bf r0 = r5.V7()
            com.tencent.maas.moviecomposing.PlaybackSession r0 = r0.k7()
            if (r6 == 0) goto Lc4
            if (r0 != 0) goto L63
            goto Lc4
        L63:
            java.util.List r7 = r5.A7()
            java.lang.Object r7 = kz5.n0.Z(r7)
            com.tencent.maas.moviecomposing.segments.ContentDescSegment r7 = (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4182xb2a3bd49) r7
            if (r7 != 0) goto L89
            gx0.bf r7 = r5.V7()
            gx0.kh r0 = r5.W7()
            jz5.g r3 = r5.E
            jz5.n r3 = (jz5.n) r3
            java.lang.Object r3 = r3.mo141623x754a37bb()
            gx0.w8 r3 = (gx0.w8) r3
            android.util.SizeF r3 = r3.C7()
            ou0.e0.a(r6, r7, r0, r3)
            goto La8
        L89:
            android.graphics.PointF r0 = r7.m0()
            java.lang.String r3 = "getLayerPosition(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r3)
            float r3 = r7.n0()
            android.graphics.PointF r7 = r7.o0()
            java.lang.String r4 = "getLayerScale(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r7, r4)
            r6.r(r0)
            r6.s(r3)
            r6.t(r7)
        La8:
            jz5.g r7 = r5.f513119v
            jz5.n r7 = (jz5.n) r7
            java.lang.Object r7 = r7.mo141623x754a37bb()
            gx0.kc r7 = (gx0.kc) r7
            com.tencent.maas.moviecomposing.segments.Segment r6 = r6.f338700a
            com.tencent.maas.base.MJID r6 = r6.f130065a
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r6, r1)
            com.tencent.maas.model.time.MJTimeRange r0 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553.f16108xa1116659
            java.lang.String r1 = "InvalidTimeRange"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r1)
            r7.W6(r6, r0, r2)
            return
        Lc4:
            r5.f513123z = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.h0.K7(sw0.d, com.tencent.maas.moviecomposing.segments.ClipSegment):void");
    }

    @Override // uw0.o
    public void M7(com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 segment) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segment, "segment");
        gx0.bf V7 = V7();
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a A = segment.A();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(A, "getPresentationStartTime(...)");
        gx0.bf.q7(V7, A, true, 0L, 4, null);
    }

    @Override // uw0.o
    public void N7() {
        p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new gx0.a0(this, null), 3, null);
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3 = this.f513122y;
        if (c4181x2248e1a3 != null) {
            gx0.bf V7 = V7();
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 B = c4181x2248e1a3.B();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(B, "getPresentationTimeRange(...)");
            ou0.d.b(V7, B);
        }
    }

    @Override // uw0.o
    public void O7() {
        p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new gx0.b0(this, null), 3, null);
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3 = this.f513122y;
        if (c4181x2248e1a3 != null) {
            gx0.bf V7 = V7();
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 B = c4181x2248e1a3.B();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(B, "getPresentationTimeRange(...)");
            ou0.d.b(V7, B);
        }
    }

    @Override // uw0.o
    public void P7() {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3 = this.f513122y;
        if (c4181x2248e1a3 != null) {
            gx0.bf V7 = V7();
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 B = c4181x2248e1a3.B();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(B, "getPresentationTimeRange(...)");
            ou0.d.b(V7, B);
        }
        p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new gx0.c0(this, null), 3, null);
    }

    @Override // uw0.o
    public void Q7() {
        p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new gx0.d0(this, null), 3, null);
    }

    public final gx0.bf V7() {
        return (gx0.bf) ((jz5.n) this.C).mo141623x754a37bb();
    }

    public final gx0.kh W7() {
        return (gx0.kh) ((jz5.n) this.B).mo141623x754a37bb();
    }

    @Override // uw0.o
    public void y7(java.lang.String snapshotDesc) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshotDesc, "snapshotDesc");
        gx0.kh W7 = W7();
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3 = this.f513122y;
        W7.r7(snapshotDesc, c4181x2248e1a3 != null ? c4181x2248e1a3.A() : null);
    }

    @Override // uw0.o
    public com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 z7(com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 segment) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segment, "segment");
        gx0.kh W7 = W7();
        W7.getClass();
        ex0.a0 a0Var = W7.f358175r;
        if (a0Var == null) {
            return null;
        }
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m34007xde00a612 = segment.B().m34007xde00a612();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m34007xde00a612);
        ex0.c d17 = ex0.i0.d(a0Var, m34007xde00a612);
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713 = d17 != null ? d17.f338700a : null;
        if (c4190xd8dd3713 instanceof com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3) {
            return (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3) c4190xd8dd3713;
        }
        return null;
    }
}
