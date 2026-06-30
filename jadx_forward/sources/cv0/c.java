package cv0;

/* loaded from: classes5.dex */
public abstract class c extends au0.a {

    /* renamed from: c, reason: collision with root package name */
    public final dv0.a f304061c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f304062d;

    public c(cv0.d handleBoxChange, boolean z17, dv0.a handleBoxCallback) {
        java.util.List k17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handleBoxChange, "handleBoxChange");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handleBoxCallback, "handleBoxCallback");
        this.f304061c = handleBoxCallback;
        this.f304062d = new java.util.ArrayList();
        handleBoxCallback.r6(handleBoxChange);
        cv0.l lVar = cv0.h.f304071a;
        java.util.Map map = lVar.f304074a;
        ((java.util.LinkedHashMap) map).clear();
        for (bu0.b bVar : lVar.f304075b) {
            yy0.m0 m0Var = (yy0.m0) ((pp0.h0) i95.n0.c(pp0.h0.class));
            m0Var.getClass();
            boolean z18 = false;
            if (pp0.h0.Q2(m0Var, false, 1, null)) {
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2545xe20e94ff.p2546x5be56f80.C20406x2d233141()) == 1) {
                    z18 = true;
                }
            }
            switch (bVar.ordinal()) {
                case 1:
                    k17 = kz5.c0.k(new cv0.k(com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999.MJRectCorner.MJRectCornerTopLeft, cv0.m.f304077f), new cv0.k(com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999.MJRectCorner.MJRectCornerTopRight, cv0.m.f304078g));
                    if (z17) {
                        k17.add(new cv0.k(com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999.MJRectCorner.MJRectCornerBottomRight, cv0.m.f304079h));
                        if (z18) {
                            k17.add(new cv0.k(com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999.MJRectCorner.MJRectCornerBottomLeft, cv0.m.f304080i));
                            break;
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                case 2:
                    k17 = kz5.c0.k(new cv0.k(com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999.MJRectCorner.MJRectCornerTopLeft, cv0.m.f304077f), new cv0.k(com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999.MJRectCorner.MJRectCornerTopRight, cv0.m.f304078g));
                    if (z17) {
                        k17.add(new cv0.k(com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999.MJRectCorner.MJRectCornerBottomRight, cv0.m.f304079h));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    k17 = kz5.c0.k(new cv0.k(com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999.MJRectCorner.MJRectCornerTopLeft, cv0.m.f304077f));
                    if (z17) {
                        k17.add(new cv0.k(com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999.MJRectCorner.MJRectCornerBottomRight, cv0.m.f304079h));
                        break;
                    } else {
                        break;
                    }
                case 4:
                default:
                    k17 = kz5.p0.f395529d;
                    break;
                case 5:
                    k17 = kz5.c0.k(new cv0.k(com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999.MJRectCorner.MJRectCornerTopLeft, cv0.m.f304077f), new cv0.k(com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999.MJRectCorner.MJRectCornerTopRight, cv0.m.f304078g), new cv0.k(com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999.MJRectCorner.MJRectCornerBottomRight, cv0.m.f304079h));
                    if (z18) {
                        k17.add(new cv0.k(com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999.MJRectCorner.MJRectCornerBottomLeft, cv0.m.f304080i));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    k17 = kz5.c0.k(new cv0.k(com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999.MJRectCorner.MJRectCornerTopLeft, cv0.m.f304077f), new cv0.k(com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999.MJRectCorner.MJRectCornerTopRight, cv0.m.f304078g));
                    if (z18) {
                        k17.add(new cv0.k(com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999.MJRectCorner.MJRectCornerBottomLeft, cv0.m.f304080i));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    k17 = kz5.c0.i(new cv0.k(com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999.MJRectCorner.MJRectCornerTopLeft, cv0.m.f304077f), new cv0.k(com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999.MJRectCorner.MJRectCornerTopRight, cv0.m.f304078g));
                    break;
                case 8:
                    k17 = kz5.b0.c(new cv0.k(com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999.MJRectCorner.MJRectCornerTopRight, cv0.m.f304078g));
                    break;
                case 9:
                    k17 = kz5.c0.i(new cv0.k(com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999.MJRectCorner.MJRectCornerTopLeft, cv0.m.f304077f), new cv0.k(com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999.MJRectCorner.MJRectCornerTopRight, cv0.m.f304078g));
                    break;
            }
            map.put(bVar, k17);
        }
    }

    @Override // bv0.a
    public void a(float f17, float f18) {
        au0.b n17;
        if (k("onMove") && (n17 = n()) != null) {
            dv0.a aVar = this.f304061c;
            if (aVar.P4(n17) && n17.mo9048xdac2174d()) {
                com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e b76 = ((du0.o) aVar).b7();
                aVar.a4(n17, -(f17 / b76.f129332x), -(f18 / b76.f129333y), f());
            }
        }
    }

    @Override // bv0.a
    public void b() {
        au0.b n17;
        if (k("onEnd") && (n17 = n()) != null && n17.mo9048xdac2174d()) {
            this.f304061c.F5(n17);
        }
    }

    @Override // bv0.a
    public void c(float f17, float f18, boolean z17) {
        au0.b n17;
        if (k("onScaleAndRotate") && (n17 = n()) != null) {
            dv0.a aVar = this.f304061c;
            if (aVar.P4(n17) && n17.mo9048xdac2174d()) {
                aVar.r2(n17, f17, f18, z17);
            }
        }
    }

    @Override // au0.a
    public boolean d() {
        return this.f304061c.q();
    }

    @Override // au0.a
    public void g(boolean z17, au0.b bVar) {
        du0.o oVar = (du0.o) this.f304061c;
        if (!oVar.a7().A4()) {
            oVar.U6(z17);
            return;
        }
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.q qVar = (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.q) oVar.a7().v6().f421961b.j();
        boolean z18 = false;
        if ((qVar == null ? false : qVar instanceof com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.r) && com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.z.a(qVar)) {
            z18 = true;
        }
        if (z18) {
            return;
        }
        oVar.p7();
    }

    @Override // au0.a
    public boolean i(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 itemID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemID, "itemID");
        return false;
    }

    @Override // au0.a
    public boolean j(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 mjID, android.graphics.PointF pointF, boolean z17, boolean z18) {
        boolean l07;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mjID, "mjID");
        dv0.a aVar = this.f304061c;
        au0.b o66 = aVar.o6(mjID);
        if (o66 != null && o66.mo9048xdac2174d()) {
            java.util.ArrayList arrayList = this.f304062d;
            if (arrayList.size() <= 1) {
                au0.b n17 = n();
                if (!z17) {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(n17 != null ? n17.c() : null, o66.c())) {
                        return false;
                    }
                }
                if (pointF == null && n17 != null && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(n17.c(), o66.c())) {
                    l(false);
                    p(o66, z18);
                    return true;
                }
                if (n17 != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(n17.c(), o66.c()) && pointF != null) {
                    if (d()) {
                        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae f17 = f();
                        h(f17);
                        java.util.Objects.toString(pointF);
                        l07 = aVar.l0(pointF, f17);
                    } else {
                        l07 = false;
                    }
                    if (!l07) {
                        g(false, n17);
                        return false;
                    }
                }
                if (n17 != null && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(n17.c(), o66.c())) {
                    aVar.N2(o66);
                    return true;
                }
                if (n17 != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(n17.c(), o66.c())) {
                    java.util.Objects.toString(o66.c());
                    return aVar.w5(o66);
                }
                if (arrayList.isEmpty()) {
                    java.util.Objects.toString(o66.c());
                    p(o66, z18);
                }
                return true;
            }
        }
        g(false, null);
        return false;
    }

    public final boolean k(java.lang.String str) {
        return d() && !this.f304061c.C5();
    }

    public final void l(boolean z17) {
        if (d()) {
            du0.o oVar = (du0.o) this.f304061c;
            p3325xe03a0797.p3326xc267989b.l.d(oVar.m158345xefc66565(), null, null, new du0.l(oVar, z17, null), 3, null);
        }
        o(null);
    }

    public com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999.MJRectCorner m(android.graphics.PointF pointF) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pointF, "pointF");
        if (!d()) {
            return com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999.MJRectCorner.MJRectCornerInvalid;
        }
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae f17 = f();
        h(f17);
        pointF.toString();
        return this.f304061c.M5(pointF, f17);
    }

    public final au0.b n() {
        cv0.a aVar = (cv0.a) kz5.n0.a0(this.f304062d, 0);
        if (aVar != null) {
            return aVar.f304056a;
        }
        return null;
    }

    public final void o(au0.b bVar) {
        java.util.ArrayList arrayList = this.f304062d;
        arrayList.clear();
        if (bVar != null) {
            arrayList.add(new cv0.a(bVar));
        }
    }

    public final boolean p(au0.b bVar, boolean z17) {
        if (!bVar.a()) {
            return true;
        }
        o(bVar);
        du0.o oVar = (du0.o) this.f304061c;
        oVar.getClass();
        if (!oVar.W6().f7(bVar.b()) && oVar.a7().A4()) {
            oVar.p7();
        }
        oVar.c7(bVar);
        oVar.m7(bVar, z17);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(boolean r5, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof cv0.b
            if (r0 == 0) goto L13
            r0 = r6
            cv0.b r0 = (cv0.b) r0
            int r1 = r0.f304060g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f304060g = r1
            goto L18
        L13:
            cv0.b r0 = new cv0.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f304058e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f304060g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.f304057d
            cv0.c r5 = (cv0.c) r5
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L4a
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            boolean r6 = r4.d()
            if (r6 == 0) goto L49
            r0.f304057d = r4
            r0.f304060g = r3
            dv0.a r6 = r4.f304061c
            java.lang.Object r5 = r6.d5(r5, r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            r5 = r4
        L4a:
            r6 = 0
            r5.o(r6)
            jz5.f0 r5 = jz5.f0.f384359a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: cv0.c.q(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
