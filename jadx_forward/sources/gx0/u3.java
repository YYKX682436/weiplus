package gx0;

/* loaded from: classes5.dex */
public final class u3 implements gy0.j {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f358547a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f358548b;

    /* renamed from: c, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f358549c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.y3 f358550d;

    public u3(gx0.y3 y3Var) {
        this.f358550d = y3Var;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16094x2a998d44;
        this.f358547a = c4128x879fba0a;
        this.f358548b = c4128x879fba0a;
    }

    @Override // gy0.j
    public void a(boolean z17) {
        gx0.y3 y3Var = this.f358550d;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.p891x89444d94.C10939x5805e934 o76 = y3Var.o7();
        o76.state = jv0.h.f383724d;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p915x577a0666.AbstractC11003x25486817.i(o76, false, 1, null);
        p3325xe03a0797.p3326xc267989b.l.d(y3Var.m158345xefc66565(), null, null, new gx0.s3(y3Var, null), 3, null);
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.p891x89444d94.C10939x5805e934 o77 = y3Var.o7();
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a moveToTime = this.f358548b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(moveToTime, "moveToTime");
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p915x577a0666.AbstractC11003x25486817.l(o77, moveToTime, false, 2, null);
        this.f358548b = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16094x2a998d44;
    }

    @Override // gy0.j
    public void b(boolean z17, boolean z18) {
    }

    @Override // gy0.j
    public void c(boolean z17) {
        gx0.y3 y3Var = this.f358550d;
        y3Var.R6().V6();
        j();
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.p891x89444d94.C10939x5805e934 o76 = y3Var.o7();
        o76.state = jv0.h.f383725e;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p915x577a0666.AbstractC11003x25486817.i(o76, false, 1, null);
    }

    @Override // gy0.j
    public void d() {
        gx0.y3 y3Var = this.f358550d;
        ex0.f fVar = y3Var.f383721q;
        this.f358548b = fVar != null ? fVar.k() : y3Var.z7().h7();
        gx0.bf z76 = y3Var.z7();
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a moveToTime = this.f358548b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(moveToTime, "moveToTime");
        gx0.bf.q7(z76, moveToTime, false, 0L, 4, null);
    }

    @Override // gy0.j
    public void e() {
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0084  */
    @Override // gy0.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f() {
        /*
            r11 = this;
            com.tencent.maas.model.time.MJTime r0 = r11.f358547a
            boolean r0 = r0.m33983x7b953cf2()
            r1 = 1
            r2 = 0
            gx0.y3 r3 = r11.f358550d
            if (r0 != 0) goto L13
            com.tencent.maas.model.time.MJTime r0 = r11.f358547a
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r0)
            goto L89
        L13:
            ex0.f r0 = r3.f383721q
            if (r0 == 0) goto L25
            com.tencent.maas.model.time.MJTime r0 = r0.k()
            com.tencent.maas.model.time.MJTime r4 = r11.f358547a
            boolean r0 = r0.m33971xf922bec1(r4)
            if (r0 != r1) goto L25
            r0 = r1
            goto L26
        L25:
            r0 = r2
        L26:
            if (r0 == 0) goto L37
            ex0.f r0 = r3.f383721q
            if (r0 == 0) goto L31
            com.tencent.maas.model.time.MJTime r0 = r0.k()
            goto L33
        L31:
            com.tencent.maas.model.time.MJTime r0 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5
        L33:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r0)
            goto L89
        L37:
            ex0.f r0 = r3.f383721q
            if (r0 == 0) goto L60
            com.tencent.maas.model.time.MJTimeRange r0 = r0.l()
            com.tencent.maas.model.time.MJTime r0 = r0.m34007xde00a612()
            if (r0 == 0) goto L60
            com.tencent.maas.model.time.MJTime r4 = r11.f358547a
            java.lang.String r5 = "trimPreviewTime"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, r5)
            boolean r5 = r0.m33986x9f3f7b48(r4)
            if (r5 != 0) goto L5b
            boolean r0 = r0.m33975x22a7969a(r4)
            if (r0 == 0) goto L59
            goto L5b
        L59:
            r0 = r2
            goto L5c
        L5b:
            r0 = r1
        L5c:
            if (r0 != r1) goto L60
            r0 = r1
            goto L61
        L60:
            r0 = r2
        L61:
            if (r0 == 0) goto L84
            ex0.f r0 = r3.f383721q
            if (r0 == 0) goto L7e
            com.tencent.maas.model.time.MJTimeRange r0 = r0.l()
            com.tencent.maas.model.time.MJTime r0 = r0.m34007xde00a612()
            if (r0 == 0) goto L7e
            com.tencent.maas.model.time.MJTime r4 = new com.tencent.maas.model.time.MJTime
            r5 = 1
            r4.<init>(r5)
            com.tencent.maas.model.time.MJTime r0 = r0.sub(r4)
            if (r0 != 0) goto L80
        L7e:
            com.tencent.maas.model.time.MJTime r0 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5
        L80:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r0)
            goto L89
        L84:
            com.tencent.maas.model.time.MJTime r0 = r11.f358547a
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r0)
        L89:
            kotlinx.coroutines.y0 r4 = r3.m158345xefc66565()
            r5 = 0
            r6 = 0
            gx0.t3 r7 = new gx0.t3
            r10 = 0
            r7.<init>(r3, r0, r10)
            r8 = 3
            r9 = 0
            p3325xe03a0797.p3326xc267989b.l.d(r4, r5, r6, r7, r8, r9)
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.duration.DurationModifyTimelineView r4 = r3.o7()
            jv0.h r5 = jv0.h.f383724d
            r4.state = r5
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p915x577a0666.AbstractC11003x25486817.i(r4, r2, r1, r10)
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.duration.DurationModifyTimelineView r1 = r3.o7()
            r1.k(r0, r2)
            gx0.x4 r0 = r3.y7()
            r0.w7()
            com.tencent.maas.model.time.MJTime r0 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16094x2a998d44
            r11.f358547a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.u3.f():void");
    }

    @Override // gy0.j
    public void g() {
        j();
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.p891x89444d94.C10939x5805e934 o76 = this.f358550d.o7();
        o76.state = jv0.h.f383726f;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p915x577a0666.AbstractC11003x25486817.i(o76, false, 1, null);
    }

    @Override // gy0.j
    public void h() {
        java.lang.Object obj;
        java.lang.Object obj2;
        gx0.y3 y3Var = this.f358550d;
        ex0.f fVar = y3Var.f383721q;
        if (fVar == null) {
            return;
        }
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m34007xde00a612 = gx0.q3.f358398a[fVar.f338667j.ordinal()] == 1 ? fVar.l().m34007xde00a612() : fVar.k();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m34007xde00a612);
        ex0.f fVar2 = y3Var.f383721q;
        if (fVar2 != null && fVar2.f338666i) {
            ax0.a aVar = fVar2.f338667j;
            ax0.a aVar2 = ax0.a.f96494e;
            java.util.List list = y3Var.f383722r;
            if (aVar == aVar2) {
                java.util.Iterator it = ((java.util.ArrayList) list).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it.next();
                        if (((jv0.p) obj2).f383738a.m33975x22a7969a(m34007xde00a612)) {
                            break;
                        }
                    }
                }
                jv0.p pVar = (jv0.p) obj2;
                if (pVar != null) {
                    y3Var.B7(m34007xde00a612);
                    if (!pVar.f383739b) {
                        m34007xde00a612 = m34007xde00a612.sub(new com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a(1L));
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m34007xde00a612);
                    }
                    y3Var.z7().p7(m34007xde00a612, true, 8L);
                }
                y3Var.f358728v = null;
                y3Var.z7().p7(m34007xde00a612, true, 8L);
                y3Var.y7().w7();
            } else {
                if (aVar == ax0.a.f96495f) {
                    java.util.Iterator it6 = ((java.util.ArrayList) list).iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it6.next();
                            if (((jv0.p) obj).f383738a.m33975x22a7969a(m34007xde00a612)) {
                                break;
                            }
                        }
                    }
                    jv0.p pVar2 = (jv0.p) obj;
                    if (pVar2 != null) {
                        y3Var.B7(m34007xde00a612);
                        if (!pVar2.f383739b) {
                            m34007xde00a612 = m34007xde00a612.sub(new com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a(1L));
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m34007xde00a612);
                        }
                        y3Var.z7().p7(m34007xde00a612, true, 8L);
                    }
                }
                y3Var.f358728v = null;
                y3Var.z7().p7(m34007xde00a612, true, 8L);
                y3Var.y7().w7();
            }
        }
        this.f358547a = m34007xde00a612;
        jv0.a aVar3 = (jv0.a) y3Var.f150773i;
        if (aVar3 != null) {
            aVar3.J();
        }
    }

    @Override // gy0.j
    public void i() {
    }

    public final void j() {
        ex0.f fVar;
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78;
        ex0.f n76;
        gx0.y3 y3Var = this.f358550d;
        ex0.a0 A7 = y3Var.A7();
        if (A7 == null || (fVar = y3Var.f383721q) == null || (c3971x241f78 = fVar.f338701b) == null || (n76 = y3Var.n7(c3971x241f78)) == null) {
            return;
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f358549c;
        boolean z17 = false;
        if (r2Var != null && !r2Var.A()) {
            z17 = true;
        }
        if (z17) {
            return;
        }
        this.f358549c = p3325xe03a0797.p3326xc267989b.l.d(y3Var.m158345xefc66565(), null, null, new gx0.r3(A7, n76, y3Var, null), 3, null);
    }
}
