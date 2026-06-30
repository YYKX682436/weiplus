package xe2;

/* loaded from: classes3.dex */
public final class b extends we2.z {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
    }

    @Override // we2.z
    public void d(java.util.LinkedList msgList) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgList, "msgList");
        r45.ch1 ch1Var = (r45.ch1) kz5.n0.Z(msgList);
        r45.hh1 hh1Var = new r45.hh1();
        r45.eu0 eu0Var = null;
        byte[] g17 = (ch1Var == null || (m75934xbce7f2f2 = ch1Var.m75934xbce7f2f(4)) == null) ? null : m75934xbce7f2f2.g();
        if (g17 != null) {
            try {
                hh1Var.mo11468x92b714fd(g17);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
            }
        }
        r45.eu0 eu0Var2 = new r45.eu0();
        r45.hg1 hg1Var = (r45.hg1) hh1Var.m75936x14adae67(0);
        byte[] g18 = (hg1Var == null || (m75934xbce7f2f = hg1Var.m75934xbce7f2f(0)) == null) ? null : m75934xbce7f2f.g();
        if (g18 != null) {
            try {
                eu0Var2.mo11468x92b714fd(g18);
                eu0Var = eu0Var2;
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e18);
            }
        }
        ((mm2.f6) this.f526800a.a(mm2.f6.class)).W6(eu0Var);
    }

    @Override // we2.z
    public int[] g() {
        return new int[]{20088};
    }
}
