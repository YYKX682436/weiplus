package xe2;

/* loaded from: classes3.dex */
public final class l1 extends we2.z {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
    }

    @Override // we2.z
    public void d(java.util.LinkedList msgList) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgList, "msgList");
        r45.ch1 ch1Var = (r45.ch1) kz5.n0.Z(msgList);
        r45.gk1 gk1Var = new r45.gk1();
        byte[] g17 = (ch1Var == null || (m75934xbce7f2f = ch1Var.m75934xbce7f2f(4)) == null) ? null : m75934xbce7f2f.g();
        if (g17 != null) {
            try {
                gk1Var.mo11468x92b714fd(g17);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
            }
        }
        r45.lq1 lq1Var = (r45.lq1) gk1Var.m75936x14adae67(0);
        if (lq1Var != null) {
            dk2.vf vfVar = new dk2.vf(lq1Var);
            ((mm2.f6) this.f526800a.a(mm2.f6.class)).X6(vfVar);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
            if (k0Var != null) {
                if (lq1Var.m75939xb282bd08(0) != 0) {
                    hg2.h hVar = (hg2.h) k0Var.mo57658x143f1b92(hg2.h.class);
                    if (hVar != null) {
                        pm0.v.X(new hg2.b(hVar));
                        return;
                    }
                    return;
                }
                hg2.h hVar2 = (hg2.h) k0Var.mo57658x143f1b92(hg2.h.class);
                if (hVar2 != null) {
                    hVar2.Z6();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var2 = dk2.ef.f314913e;
                android.content.Context context = k0Var2 != null ? k0Var2.getContext() : null;
                if (context == null) {
                    context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                }
                hg2.s.b(vfVar, context, k0Var);
            }
        }
    }

    @Override // we2.z
    public int[] g() {
        return new int[]{20087};
    }
}
