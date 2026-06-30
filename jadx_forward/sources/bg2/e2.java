package bg2;

/* loaded from: classes10.dex */
public final class e2 extends tc2.c implements tc2.h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(tc2.g store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
    }

    @Override // tc2.h
    public void d4(r45.hc1 resp) {
        zy2.a8 liveFeedDecorator;
        r45.xn1 xn1Var;
        r45.up1 up1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        uc2.g gVar = (uc2.g) O6(uc2.g.class);
        zy2.g5 Z6 = gVar != null ? ((sb2.l) gVar).Z6() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b c15182x1607686b = Z6 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b) Z6 : null;
        if (c15182x1607686b == null || (liveFeedDecorator = c15182x1607686b.getLiveFeedDecorator()) == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uf ufVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uf) liveFeedDecorator;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.kf kfVar = ufVar.f190701n;
        kfVar.getClass();
        kfVar.K = resp;
        r45.wz1 wz1Var = (r45.wz1) resp.m75936x14adae67(4);
        if (wz1Var != null) {
        }
        r45.hc1 hc1Var = kfVar.K;
        if (hc1Var != null && (up1Var = (r45.up1) hc1Var.m75936x14adae67(68)) != null) {
            kfVar.f188731l = pm0.v.A(up1Var.m75942xfb822ef2(0), 16384);
        }
        r45.ic1 ic1Var = (r45.ic1) resp.m75936x14adae67(85);
        if (ic1Var == null || (xn1Var = (r45.xn1) ic1Var.m75936x14adae67(6)) == null) {
            return;
        }
        ufVar.f190707t = xn1Var;
        km2.q qVar = (km2.q) ufVar.f190708u.get(ufVar.f190696i.f558867a);
        if (qVar != null) {
            qVar.f390720r = ufVar.f190707t;
        }
        ufVar.t(true);
    }
}
