package st2;

/* loaded from: classes3.dex */
public final class d0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.nd {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ st2.h1 f493785a;

    public d0(st2.h1 h1Var) {
        this.f493785a = h1Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.nd
    public void a(cm2.k0 item, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15317x5870b165 view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        st2.h1 h1Var = this.f493785a;
        boolean w17 = h1Var.w();
        dk2.xf xfVar = h1Var.f493869g;
        android.view.ViewGroup viewGroup = h1Var.f493866d;
        java.lang.String str = item.f124895x;
        if (w17) {
            boolean z17 = !item.G;
            if (h1Var.x()) {
                ((ml2.r0) i95.n0.c(ml2.r0.class)).sj(1, 4, 0);
            } else {
                st2.s2.f493989a.a(h1Var.f493868f, z17);
            }
            az2.c cVar = az2.f.f97658d;
            android.content.Context context = viewGroup.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            az2.f a17 = az2.c.a(cVar, context, null, 0L, null, 14, null);
            a17.a();
            if (xfVar != null) {
                android.content.Context context2 = viewGroup.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context2;
                java.lang.String str2 = str == null ? "" : str;
                int i17 = z17 ? 1 : 2;
                int i18 = item.f124893v.m75939xb282bd08(26) == 1 ? 1 : 0;
                r45.n90 n90Var = (r45.n90) item.f124893v.m75936x14adae67(24);
                ((dk2.r4) xfVar).Z(abstractActivityC21394xb3d2c0cf, str2, i17, i18, n90Var != null ? n90Var.m75942xfb822ef2(0) : 0L, new st2.a0(a17, h1Var, z17, item));
                return;
            }
            return;
        }
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.Fj((ml2.r0) c17, ml2.f4.f408980u, item, null, null, 12, null);
        if (((bw5.x7) item.f124893v.m75936x14adae67(36)) != null) {
            bw5.x7 x7Var = (bw5.x7) item.f124893v.m75936x14adae67(36);
            if (x7Var != null) {
                i95.m c18 = i95.n0.c(pq.q.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                pq.q qVar = (pq.q) c18;
                android.content.Context context3 = viewGroup.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
                pq.q.Lb(qVar, new pq.a(context3), x7Var, null, 4, null);
                return;
            }
            return;
        }
        int m75939xb282bd08 = item.f124893v.m75939xb282bd08(21);
        if (m75939xb282bd08 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = h1Var.f493870h;
            if (lVar != null) {
                p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(lVar, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new st2.b0(h1Var, item, null), 2, null);
                return;
            }
            return;
        }
        if (m75939xb282bd08 != 2) {
            if (m75939xb282bd08 != 3) {
                return;
            }
            h1Var.t(true, true);
            i95.m c19 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
            ml2.r0.Fj((ml2.r0) c19, ml2.f4.D, item, "0", null, 8, null);
            return;
        }
        zl2.r4 r4Var = zl2.r4.f555483a;
        android.content.Context context4 = viewGroup.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context4, "getContext(...)");
        r4Var.h3(context4, true);
        if (xfVar != null) {
            android.content.Context context5 = viewGroup.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context5, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context5;
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(str != null ? str : "");
            ((dk2.r4) xfVar).m0(abstractActivityC21394xb3d2c0cf2, linkedList, true, new st2.c0(h1Var, item, view));
        }
    }
}
