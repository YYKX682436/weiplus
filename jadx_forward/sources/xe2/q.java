package xe2;

/* loaded from: classes3.dex */
public final class q extends we2.z {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
    }

    @Override // we2.z
    public void d(java.util.LinkedList msgList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgList, "msgList");
        r45.ch1 ch1Var = (r45.ch1) kz5.n0.k0(msgList);
        if (ch1Var != null) {
            dk2.xa xaVar = dk2.xa.f315877a;
            r45.u63 u63Var = new r45.u63();
            com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = ch1Var.m75934xbce7f2f(4);
            byte[] g17 = m75934xbce7f2f != null ? m75934xbce7f2f.g() : null;
            if (g17 != null) {
                try {
                    u63Var.mo11468x92b714fd(g17);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                }
                xaVar.c(this.f526800a, u63Var);
            }
            u63Var = null;
            xaVar.c(this.f526800a, u63Var);
        }
    }

    @Override // we2.z
    public int[] g() {
        return new int[]{20040};
    }
}
