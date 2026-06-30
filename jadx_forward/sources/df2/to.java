package df2;

/* loaded from: classes3.dex */
public final class to extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f312993m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f312994n;

    /* renamed from: o, reason: collision with root package name */
    public r45.j32 f312995o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14406x76bd35b f312996p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.z10 f312997q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public to(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f312993m = "LiveNoticeBannerController";
    }

    public static final void Z6(df2.to toVar, int i17) {
        toVar.getClass();
        if (zl2.r4.f555483a.w1()) {
            cl0.g gVar = new cl0.g();
            gVar.o("result", i17);
            r45.j32 j32Var = toVar.f312995o;
            gVar.o("display", (j32Var != null ? j32Var.m75939xb282bd08(2) : 0) <= 0 ? 1 : 2);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.f409879c2, gVar.toString(), null, 4, null);
            return;
        }
        cl0.g gVar2 = new cl0.g();
        gVar2.o("result", i17);
        r45.j32 j32Var2 = toVar.f312995o;
        gVar2.o("notice_count", j32Var2 != null ? j32Var2.m75939xb282bd08(2) : 0);
        i95.m c18 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        ml2.r0.hj((ml2.r0) c18, ml2.b4.E2, gVar2.toString(), 0L, null, null, null, null, null, 252, null);
    }

    public static final void a7(df2.to toVar, boolean z17, r45.h32 h32Var) {
        toVar.getClass();
        cl0.g gVar = new cl0.g();
        gVar.o("result", z17 ? 3 : 4);
        gVar.h("notice_id", h32Var.m75945x2fec8307(4));
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.E2, gVar.toString(), 0L, null, null, null, null, null, 252, null);
    }

    public static final void b7(df2.to toVar, r45.j32 j32Var) {
        java.util.LinkedList m75941xfb821914;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar2;
        qo0.c mo57677x2220c3f4;
        toVar.getClass();
        if (zl2.r4.f555483a.w1()) {
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            ml2.y4 y4Var = ml2.j0.f409116i;
            ml2.l1 l1Var = ml2.l1.f409221o;
            y4Var.getClass();
            y4Var.f409828e0 = l1Var;
            r45.j32 j32Var2 = toVar.f312995o;
            java.util.LinkedList m75941xfb8219142 = j32Var2 != null ? j32Var2.m75941xfb821914(0) : null;
            boolean z17 = m75941xfb8219142 == null || m75941xfb8219142.isEmpty();
            pk2.i2 i2Var = pk2.l2.f437471m;
            if (z17) {
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N6 = toVar.N6();
                if (N6 != null) {
                    i2Var.c(N6, j32Var, null, true);
                    return;
                }
                return;
            }
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N62 = toVar.N6();
            if (N62 != null) {
                i2Var.d(N62, j32Var, null, true);
                return;
            }
            return;
        }
        if (j32Var == null || (m75941xfb821914 = j32Var.m75941xfb821914(0)) == null) {
            return;
        }
        java.util.LinkedList linkedList = m75941xfb821914.isEmpty() ^ true ? m75941xfb821914 : null;
        if (linkedList != null) {
            if (linkedList.size() != 1) {
                i95.m c17 = i95.n0.c(vd2.i5.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                zy2.ic T6 = vd2.i5.T6((vd2.i5) c17, ((mm2.c1) toVar.m56788xbba4bfc0(mm2.c1.class)).f410385o, toVar.O6(), false, new r45.qt2(), 0, 16, null);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4 s4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4) T6;
                s4Var.F = true;
                java.lang.String valueOf = java.lang.String.valueOf(c01.id.c());
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(valueOf, "<set-?>");
                s4Var.E = valueOf;
                s4Var.G = new df2.so(toVar);
                s4Var.H = 105;
                zy2.ic.a(T6, j32Var, null, false, null, 0, 0, null, 126, null);
                return;
            }
            r45.h32 h32Var = (r45.h32) kz5.n0.Z(linkedList);
            if (h32Var == null || (ubVar = toVar.f372632e) == null || ubVar.mo57677x2220c3f4() == null) {
                return;
            }
            if (toVar.f312997q == null && (ubVar2 = toVar.f372632e) != null && (mo57677x2220c3f4 = ubVar2.mo57677x2220c3f4()) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.z10 z10Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.z10(toVar.O6(), toVar.getStore().getLiveRoomData(), mo57677x2220c3f4, null, null);
                z10Var.f196802u = new df2.ko(toVar);
                z10Var.f196803v = 105;
                toVar.f312997q = z10Var;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.z10 z10Var2 = toVar.f312997q;
            if (z10Var2 != null) {
                z10Var2.f0(new cm2.y(h32Var));
                z10Var2.f196801t = false;
                z10Var2.f196794m.performClick();
            }
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14400x1527540f c7() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14400x1527540f) S6(com.p314xaae8f345.mm.R.id.ubl);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14406x76bd35b d7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14406x76bd35b c14406x76bd35b = this.f312996p;
        if (c14406x76bd35b != null) {
            return c14406x76bd35b;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14406x76bd35b c14406x76bd35b2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14406x76bd35b(O6());
        c14406x76bd35b2.setOnClickListener(new df2.lo(this));
        ym5.a1.h(c14406x76bd35b2, new df2.mo(this));
        this.f312996p = c14406x76bd35b2;
        return c14406x76bd35b2;
    }

    public final void e7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14400x1527540f c76;
        java.util.LinkedList m75941xfb821914;
        if (c7() == null) {
            return;
        }
        r45.j32 j32Var = this.f312995o;
        boolean z17 = false;
        r45.h32 h32Var = (j32Var == null || (m75941xfb821914 = j32Var.m75941xfb821914(0)) == null) ? null : (r45.h32) kz5.n0.Z(m75941xfb821914);
        if (h32Var != null || zl2.r4.f555483a.w1()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14400x1527540f c77 = c7();
            if (c77 != null) {
                if (!c77.f199183p.contains(d7())) {
                    z17 = true;
                }
            }
            if (z17 && (c76 = c7()) != null) {
                c76.c(d7());
            }
            d7().b(h32Var);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14406x76bd35b d76 = d7();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14400x1527540f c78 = c7();
            if (c78 != null) {
                c78.f(d76);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14400x1527540f c79 = c7();
        if (c79 != null) {
            c79.post(new df2.ro(this));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009c A[LOOP:1: B:32:0x0096->B:34:0x009c, LOOP_END] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveMsg */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo14867x5aa1c816(r45.r71 r14) {
        /*
            r13 = this;
            super.mo14867x5aa1c816(r14)
            boolean r0 = r13.f312994n
            if (r0 == 0) goto Lcb
            if (r14 == 0) goto Lcb
            r0 = 15
            java.util.LinkedList r14 = r14.m75941xfb821914(r0)
            if (r14 == 0) goto Lcb
            java.util.Iterator r14 = r14.iterator()
        L15:
            boolean r0 = r14.hasNext()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L33
            java.lang.Object r0 = r14.next()
            r4 = r0
            r45.gd2 r4 = (r45.gd2) r4
            int r4 = r4.m75939xb282bd08(r2)
            r5 = 30023(0x7547, float:4.2071E-41)
            if (r4 != r5) goto L2f
            r4 = r1
            goto L30
        L2f:
            r4 = r2
        L30:
            if (r4 == 0) goto L15
            goto L34
        L33:
            r0 = r3
        L34:
            r45.gd2 r0 = (r45.gd2) r0
            if (r0 == 0) goto Lcb
            r45.j32 r14 = new r45.j32
            r14.<init>()
            com.tencent.mm.protobuf.g r0 = r0.m75934xbce7f2f(r1)
            if (r0 == 0) goto L48
            byte[] r0 = r0.g()
            goto L49
        L48:
            r0 = r3
        L49:
            if (r0 != 0) goto L4d
        L4b:
            r14 = r3
            goto L5e
        L4d:
            r14.mo11468x92b714fd(r0)     // Catch: java.lang.Exception -> L51
            goto L5e
        L51:
            r14 = move-exception
            java.lang.String r0 = ""
            java.lang.Object[] r14 = new java.lang.Object[]{r14}
            java.lang.String r1 = "safeParser"
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(r1, r0, r14)
            goto L4b
        L5e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onLiveMsg: update notice list, size="
            r0.<init>(r1)
            if (r14 == 0) goto L76
            java.util.LinkedList r1 = r14.m75941xfb821914(r2)
            if (r1 == 0) goto L76
            int r1 = r1.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L77
        L76:
            r1 = r3
        L77:
            r0.append(r1)
            java.lang.String r1 = ", ids = "
            r0.append(r1)
            if (r14 == 0) goto Lba
            java.util.LinkedList r1 = r14.m75941xfb821914(r2)
            if (r1 == 0) goto Lba
            java.util.ArrayList r4 = new java.util.ArrayList
            r2 = 10
            int r2 = kz5.d0.q(r1, r2)
            r4.<init>(r2)
            java.util.Iterator r1 = r1.iterator()
        L96:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lab
            java.lang.Object r2 = r1.next()
            r45.h32 r2 = (r45.h32) r2
            r3 = 4
            java.lang.String r2 = r2.m75945x2fec8307(r3)
            r4.add(r2)
            goto L96
        Lab:
            java.lang.String r5 = "|"
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 62
            r12 = 0
            java.lang.String r3 = kz5.n0.g0(r4, r5, r6, r7, r8, r9, r10, r11, r12)
        Lba:
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r13.f312993m
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            r13.f312995o = r14
            r13.e7()
        Lcb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.to.mo14867x5aa1c816(r45.r71):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStart */
    public void mo14863x39a513b7(r45.hc1 hc1Var) {
        super.mo14863x39a513b7(hc1Var);
        boolean F1 = zl2.r4.F1(getStore().getLiveRoomData());
        java.lang.String str = this.f312993m;
        if (F1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "noticeBannerSwitch set to false");
            this.f312994n = false;
            return;
        }
        boolean z17 = pm0.v.z(hc1Var != null ? hc1Var.m75939xb282bd08(12) : 0, 8);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "noticeBannerSwitch set to " + z17);
        this.f312994n = z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        if (((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).a8() && this.f312994n) {
            e7();
        }
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        this.f312996p = null;
        this.f312997q = null;
    }
}
