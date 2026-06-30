package r72;

/* loaded from: classes16.dex */
public abstract class v {
    public static final r45.mv2 a(r72.u finderTopicItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderTopicItem, "finderTopicItem");
        r45.mv2 mv2Var = new r45.mv2();
        mv2Var.set(0, finderTopicItem.q());
        mv2Var.set(1, java.lang.Integer.valueOf(finderTopicItem.r()));
        mv2Var.set(2, finderTopicItem.m162031x9f7ace00());
        mv2Var.set(3, finderTopicItem.j());
        mv2Var.set(7, finderTopicItem.l());
        mv2Var.set(5, finderTopicItem.o());
        r72.w n17 = finderTopicItem.n();
        if (n17 != null) {
            r45.hv2 hv2Var = new r45.hv2();
            hv2Var.set(0, n17.j());
            hv2Var.set(1, java.lang.Float.valueOf(n17.m162033x79d7af9()));
            hv2Var.set(2, java.lang.Float.valueOf(n17.m162032x2605e9e2()));
            mv2Var.set(4, hv2Var);
        }
        r72.t k17 = finderTopicItem.k();
        if (k17 != null) {
            r45.ht0 ht0Var = new r45.ht0();
            ht0Var.set(0, k17.m162030xf9e58274());
            ht0Var.set(1, k17.m162028xfb82e301());
            ht0Var.set(2, k17.j());
            ht0Var.set(4, java.lang.Long.valueOf(k17.k()));
            ht0Var.set(5, k17.m162029x7531c8a2());
            mv2Var.set(6, ht0Var);
        }
        r72.x p17 = finderTopicItem.p();
        if (p17 != null) {
            r45.ub4 ub4Var = new r45.ub4();
            ub4Var.set(0, p17.j());
            ub4Var.set(1, java.lang.Integer.valueOf(p17.k()));
            mv2Var.set(8, ub4Var);
        }
        return mv2Var;
    }

    public static final r72.u b(r45.mv2 originFinderTopic) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originFinderTopic, "originFinderTopic");
        r72.u uVar = new r72.u();
        uVar.A(originFinderTopic.m75945x2fec8307(0));
        uVar.B(originFinderTopic.m75939xb282bd08(1));
        uVar.w(originFinderTopic.m75945x2fec8307(2));
        uVar.s(originFinderTopic.m75945x2fec8307(3));
        uVar.u(originFinderTopic.m75945x2fec8307(7));
        uVar.y(originFinderTopic.m75945x2fec8307(5));
        r45.hv2 hv2Var = (r45.hv2) originFinderTopic.m75936x14adae67(4);
        if (hv2Var != null) {
            r72.w wVar = new r72.w();
            wVar.n(hv2Var.m75945x2fec8307(0));
            wVar.l(hv2Var.m75938x746dc8a6(1));
            wVar.k(hv2Var.m75938x746dc8a6(2));
            uVar.x(wVar);
        }
        r45.ht0 ht0Var = (r45.ht0) originFinderTopic.m75936x14adae67(6);
        if (ht0Var != null) {
            r72.t tVar = new r72.t();
            tVar.q(ht0Var.m75945x2fec8307(0));
            tVar.o(ht0Var.m75945x2fec8307(1));
            tVar.l(ht0Var.m75945x2fec8307(2));
            tVar.n(ht0Var.m75942xfb822ef2(4));
            tVar.p(ht0Var.m75945x2fec8307(5));
            uVar.t(tVar);
        }
        r45.ub4 ub4Var = (r45.ub4) originFinderTopic.m75936x14adae67(8);
        if (ub4Var != null) {
            r72.x xVar = new r72.x();
            xVar.l(ub4Var.m75945x2fec8307(0));
            xVar.n(ub4Var.m75939xb282bd08(1));
            uVar.z(xVar);
        }
        return uVar;
    }
}
