package yj5;

/* loaded from: classes14.dex */
public final class r extends yj5.a implements com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.x {

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.C21424xdbf688d7 f544262f;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.x
    public void b(java.lang.String str) {
        this.f280113d.b0();
        yb5.d dVar = this.f280113d;
        if (dVar == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, dVar.x())) {
            return;
        }
        o0();
    }

    @Override // yj5.l
    public int h() {
        int i17 = xj5.a.f536418g;
        return xj5.a.f536426r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
    
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y.class)).y8() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0098, code lost:
    
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y.class)).kb(r8) != false) goto L44;
     */
    @Override // yj5.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List m(yb5.d r8, yb5.q r9) {
        /*
            r7 = this;
            java.lang.String r0 = "context"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r0)
            java.lang.String r8 = "talkerInfo"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r9, r8)
            java.lang.String r8 = r9.f542275a
            boolean r9 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(r8)
            if (r9 == 0) goto Le2
            java.lang.Class<com.tencent.mm.plugin.multitalk.model.y> r9 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y.class
            i95.m r0 = i95.n0.c(r9)
            com.tencent.mm.plugin.multitalk.model.y r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y) r0
            dm.f8 r0 = r0.O7(r8)
            if (r0 == 0) goto Le2
            java.lang.String r1 = r0.f66530xacb0c0d4
            if (r1 == 0) goto Le2
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto Le2
            yj5.q r1 = new yj5.q
            r1.<init>()
            i95.m r2 = i95.n0.c(r9)
            com.tencent.mm.plugin.multitalk.model.y r2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y) r2
            boolean r2 = r2.q4(r8)
            r3 = 1
            if (r2 != 0) goto L3e
            goto Ld2
        L3e:
            i95.m r2 = i95.n0.c(r9)
            com.tencent.mm.plugin.multitalk.model.y r2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y) r2
            java.util.List r2 = r2.P6(r8)
            int r4 = r2.size()
            if (r4 != 0) goto L59
            i95.m r9 = i95.n0.c(r9)
            com.tencent.mm.plugin.multitalk.model.y r9 = (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y) r9
            r9.d(r8)
            goto Ld2
        L59:
            r1.f544261b = r2
            i95.m r4 = i95.n0.c(r9)
            com.tencent.mm.plugin.multitalk.model.y r4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y) r4
            java.lang.String r5 = en1.a.a()
            int r4 = r4.Og(r8, r5)
            if (r4 == r3) goto L8c
            com.tencent.mm.ui.kf r5 = com.p314xaae8f345.mm.ui.kf.NotInTalking
            r6 = 10
            if (r4 == r6) goto L72
            goto L9b
        L72:
            i95.m r4 = i95.n0.c(r9)
            com.tencent.mm.plugin.multitalk.model.y r4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y) r4
            boolean r4 = r4.kb(r8)
            if (r4 == 0) goto L7f
            goto Ld2
        L7f:
            i95.m r4 = i95.n0.c(r9)
            com.tencent.mm.plugin.multitalk.model.y r4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y) r4
            boolean r4 = r4.y8()
            if (r4 == 0) goto L9b
            goto Ld2
        L8c:
            com.tencent.mm.ui.kf r5 = com.p314xaae8f345.mm.ui.kf.Inviting
            i95.m r4 = i95.n0.c(r9)
            com.tencent.mm.plugin.multitalk.model.y r4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y) r4
            boolean r4 = r4.kb(r8)
            if (r4 == 0) goto L9b
            goto Ld2
        L9b:
            int r4 = r5.ordinal()
            r5 = 0
            if (r4 == 0) goto Lbf
            if (r4 == r3) goto Ld1
            i95.m r8 = i95.n0.c(r9)
            com.tencent.mm.plugin.multitalk.model.y r8 = (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y) r8
            boolean r8 = r8.ff()
            if (r8 == 0) goto Lb1
            goto Lbb
        Lb1:
            int r8 = r2.size()
            int r9 = zj3.j.e()
            if (r8 < r9) goto Lbc
        Lbb:
            r3 = r5
        Lbc:
            r1.f544260a = r3
            goto Ld1
        Lbf:
            i95.m r9 = i95.n0.c(r9)
            com.tencent.mm.plugin.multitalk.model.y r9 = (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y) r9
            java.lang.String r2 = en1.a.a()
            java.lang.String r8 = r9.De(r8, r2)
            if (r8 == 0) goto Ld1
            r1.f544260a = r3
        Ld1:
            r3 = r5
        Ld2:
            if (r3 != 0) goto Le2
            java.util.LinkedList r8 = new java.util.LinkedList
            r8.<init>()
            xj5.g r9 = new xj5.g
            r9.<init>(r0, r1)
            r8.add(r9)
            return r8
        Le2:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: yj5.r.m(yb5.d, yb5.q):java.util.List");
    }

    @Override // yj5.a
    public void n0() {
        com.p314xaae8f345.mm.ui.C21424xdbf688d7 c21424xdbf688d7 = this.f544262f;
        if (c21424xdbf688d7 != null) {
            if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y.class)).q4(this.f280113d.x())) {
                c21424xdbf688d7.d();
            }
            c21424xdbf688d7.setVisibility(8);
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.rf) ((sb5.a1) this.f280113d.f542241c.a(sb5.a1.class))).I0(-1, false);
        }
    }

    @Override // yj5.l
    public wj5.c r(int i17, yb5.d ui6, com.p314xaae8f345.mm.ui.p2738xb1dfbddb.d tipsBarContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tipsBarContext, "tipsBarContext");
        return new wj5.r(ui6, tipsBarContext, this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void x() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y.class);
        if (yVar != null) {
            yVar.Ud(this);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void y() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y.class);
        if (yVar != null) {
            yVar.p2(this);
        }
    }
}
