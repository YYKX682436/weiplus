package oa2;

/* loaded from: classes2.dex */
public final class x extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.x10 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public x(oa2.y r12, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf r13, int r14, int r15, boolean r16, boolean r17, int r18, p3321xbce91901.jvm.p3324x21ffc6bd.i r19) {
        /*
            r11 = this;
            r0 = r18 & 8
            r1 = 0
            if (r0 == 0) goto L7
            r6 = r1
            goto L9
        L7:
            r6 = r16
        L9:
            r0 = r18 & 16
            if (r0 == 0) goto Lf
            r7 = r1
            goto L11
        Lf:
            r7 = r17
        L11:
            java.lang.String r0 = "context"
            r1 = r13
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r13, r0)
            r8 = 0
            r9 = 32
            r10 = 0
            r2 = r11
            r3 = r13
            r4 = r14
            r5 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oa2.x.<init>(oa2.y, com.tencent.mm.ui.MMActivity, int, int, boolean, boolean, int, kotlin.jvm.internal.i):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public void J(in5.s0 holder, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (i17 < 0 || i17 >= z().f188689e.m56393xfb854877()) {
            return;
        }
        so2.j5 j5Var = (so2.j5) z().f188689e.m56388xcaeb60d0().get(i17);
        if (j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = this.K;
            r45.qt2 V6 = (componentCallbacksC1101xa17d4670 == null || (nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.b(componentCallbacksC1101xa17d4670).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)) == null) ? null : nyVar.V6();
            android.view.View itemView = holder.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
            jz5.l[] lVarArr = new jz5.l[6];
            lVarArr[0] = new jz5.l("feed_id", pm0.v.u(j5Var.mo2128x1ed62e84()));
            lVarArr[1] = new jz5.l(ya.b.f77479x42930b2, java.lang.Integer.valueOf(i17));
            lVarArr[2] = new jz5.l("finder_context_id", V6 != null ? V6.m75945x2fec8307(1) : null);
            lVarArr[3] = new jz5.l("finder_tab_context_id", V6 != null ? V6.m75945x2fec8307(2) : null);
            lVarArr[4] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.m75939xb282bd08(5)) : null);
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            lVarArr[5] = new jz5.l("session_buffer", ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17).ek(j5Var.mo2128x1ed62e84(), null, V6 != null ? V6.m75939xb282bd08(5) : 0));
            hc2.v0.e(itemView, "finder_dstream_feed", 40, 0, false, false, kz5.c1.k(lVarArr), null, 92, null);
        }
    }
}
