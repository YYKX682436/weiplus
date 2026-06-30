package vd2;

/* loaded from: classes2.dex */
public final class m3 {

    /* renamed from: a, reason: collision with root package name */
    public static final vd2.m3 f517342a = new vd2.m3();

    public final java.util.Map a() {
        jz5.l[] lVarArr = new jz5.l[3];
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        lVarArr[0] = new jz5.l("behaviour_session_id", Ri);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        if (b17 == null) {
            b17 = "";
        }
        lVarArr[1] = new jz5.l("finder_context_id", b17);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String c17 = b52.b.c();
        lVarArr[2] = new jz5.l("finder_tab_context_id", c17 != null ? c17 : "");
        return kz5.c1.k(lVarArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d0, code lost:
    
        if ((r7 != null && r7.m77224x4236b52c() == 34) != false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00da A[EDGE_INSN: B:42:0x00da->B:43:0x00da BREAK  A[LOOP:2: B:17:0x0087->B:50:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[LOOP:2: B:17:0x0087->B:50:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(in5.s0 r13, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 r14) {
        /*
            r12 = this;
            java.lang.String r0 = "holder"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r13, r0)
            java.lang.String r0 = "item"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r14, r0)
            pf5.u r0 = pf5.u.f435469a
            java.lang.String r1 = "getContext(...)"
            android.content.Context r13 = r13.f374654e
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r13, r1)
            pf5.v r1 = r0.b(r13)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.ny> r2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class
            androidx.lifecycle.c1 r1 = r1.a(r2)
            com.tencent.mm.plugin.finder.viewmodel.component.ny r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) r1
            r45.qt2 r1 = r1.V6()
            r2 = 5
            int r1 = r1.m75939xb282bd08(r2)
            boolean r2 = r13 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
            r3 = 0
            if (r2 == 0) goto L30
            com.tencent.mm.ui.MMActivity r13 = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) r13
            goto L31
        L30:
            r13 = r3
        L31:
            r2 = 0
            if (r13 != 0) goto L35
            return r2
        L35:
            long r4 = r14.mo2128x1ed62e84()
            java.lang.Class<zy2.b6> r13 = zy2.b6.class
            pf5.v r13 = r0.e(r13)
            java.lang.Class<xc2.k0> r0 = xc2.k0.class
            androidx.lifecycle.c1 r13 = r13.a(r0)
            xc2.k0 r13 = (xc2.k0) r13
            java.lang.String r14 = r14.w()
            androidx.lifecycle.j0 r13 = r13.W6(r4, r1, r14)
            java.lang.Object r13 = r13.mo3195x754a37bb()
            java.util.Set r13 = (java.util.Set) r13
            if (r13 == 0) goto Le1
            java.util.Iterator r13 = r13.iterator()
            r14 = r2
        L5c:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto Le0
            java.lang.Object r0 = r13.next()
            xc2.t r0 = (xc2.t) r0
            java.util.List r0 = r0.f534835d
            java.util.Iterator r0 = r0.iterator()
        L6e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5c
            java.lang.Object r1 = r0.next()
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r1 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) r1
            java.util.LinkedList r4 = r1.m76521x7528c3fb()
            java.lang.String r5 = "getStyle(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, r5)
            java.util.Iterator r4 = r4.iterator()
        L87:
            boolean r5 = r4.hasNext()
            r6 = 1
            if (r5 == 0) goto Ld9
            java.lang.Object r5 = r4.next()
            r7 = r5
            r45.wf6 r7 = (r45.wf6) r7
            r8 = 2
            int r9 = r7.m75939xb282bd08(r8)
            r10 = 14
            if (r9 == r10) goto Ld5
            int r9 = r7.m75939xb282bd08(r8)
            r11 = 16
            if (r9 == r11) goto Ld5
            int r7 = r7.m75939xb282bd08(r8)
            r8 = 24
            if (r7 != r8) goto Ld3
            com.tencent.mm.protocal.protobuf.NativeInfo r7 = r1.m76506x42318aa0()
            if (r7 == 0) goto Lbc
            int r7 = r7.m77224x4236b52c()
            if (r7 != r10) goto Lbc
            r7 = r6
            goto Lbd
        Lbc:
            r7 = r2
        Lbd:
            if (r7 != 0) goto Ld5
            com.tencent.mm.protocal.protobuf.NativeInfo r7 = r1.m76506x42318aa0()
            if (r7 == 0) goto Lcf
            int r7 = r7.m77224x4236b52c()
            r8 = 34
            if (r7 != r8) goto Lcf
            r7 = r6
            goto Ld0
        Lcf:
            r7 = r2
        Ld0:
            if (r7 == 0) goto Ld3
            goto Ld5
        Ld3:
            r7 = r2
            goto Ld6
        Ld5:
            r7 = r6
        Ld6:
            if (r7 == 0) goto L87
            goto Lda
        Ld9:
            r5 = r3
        Lda:
            r45.wf6 r5 = (r45.wf6) r5
            if (r5 == 0) goto L6e
            r14 = r6
            goto L6e
        Le0:
            r2 = r14
        Le1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: vd2.m3.b(in5.s0, com.tencent.mm.plugin.finder.model.BaseFinderFeed):boolean");
    }

    public final boolean c(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            if (!(layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de)) {
                layoutManager = null;
            }
            if (layoutManager != null && (mo7946xf939df19 = recyclerView.mo7946xf939df19()) != null) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var = mo7946xf939df19 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf ? mo7946xf939df19 : null;
                if (f2Var != null) {
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager;
                    int w17 = c1162x665295de.w();
                    int y17 = c1162x665295de.y();
                    java.util.List m82898xfb7e5820 = ((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) f2Var).m82898xfb7e5820();
                    int size = m82898xfb7e5820.size();
                    if (w17 <= y17) {
                        while (true) {
                            if (!(w17 >= 0 && w17 < size) || !(m82898xfb7e5820.get(w17) instanceof so2.i1)) {
                                if (w17 == y17) {
                                    break;
                                }
                                w17++;
                            } else {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
