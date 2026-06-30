package xe2;

/* loaded from: classes3.dex */
public final class p0 extends we2.z {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f535426c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f535426c = "LiveHotCommentAnimationMsgInterceptor";
    }

    @Override // we2.z
    public void d(java.util.LinkedList msgList) {
        df2.k9 k9Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgList, "msgList");
        r45.ch1 ch1Var = (r45.ch1) kz5.n0.k0(msgList);
        r45.ii1 ii1Var = null;
        if (ch1Var != null) {
            if (!(ch1Var.m75934xbce7f2f(4) != null)) {
                ch1Var = null;
            }
            if (ch1Var != null) {
                r45.ii1 ii1Var2 = new r45.ii1();
                com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = ch1Var.m75934xbce7f2f(4);
                byte[] g17 = m75934xbce7f2f != null ? m75934xbce7f2f.g() : null;
                if (g17 != null) {
                    try {
                        ii1Var2.mo11468x92b714fd(g17);
                        ii1Var = ii1Var2;
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                    }
                }
            }
        }
        if (ii1Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f535426c, "receive hot comment animation msg:" + pm0.b0.g(ii1Var));
            dk2.ef efVar = dk2.ef.f314905a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e = dk2.ef.f314904J;
            if (c14197x319b1b9e == null || (k9Var = (df2.k9) c14197x319b1b9e.m56798x25fe639c(df2.k9.class)) == null) {
                return;
            }
            k9Var.Z6(ii1Var);
        }
    }

    @Override // we2.z
    public int[] g() {
        return new int[]{20083};
    }
}
