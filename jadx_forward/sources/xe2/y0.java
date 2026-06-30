package xe2;

/* loaded from: classes3.dex */
public final class y0 extends we2.z {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f535462c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f535462c = "LiveNoticeTriggerInterceptor";
    }

    @Override // we2.z
    public void d(java.util.LinkedList msgList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgList, "msgList");
        r45.m32 m32Var = new r45.m32();
        r45.ch1 ch1Var = (r45.ch1) kz5.n0.Z(msgList);
        if (ch1Var != null) {
            if (!(ch1Var.m75934xbce7f2f(4) != null)) {
                ch1Var = null;
            }
            if (ch1Var != null) {
                com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = ch1Var.m75934xbce7f2f(4);
                byte[] g17 = m75934xbce7f2f != null ? m75934xbce7f2f.g() : null;
                if (g17 != null) {
                    try {
                        m32Var.mo11468x92b714fd(g17);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                    }
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f535462c, "pb = " + pm0.b0.g(m32Var));
        mm2.c1 c1Var = (mm2.c1) this.f526800a.a(mm2.c1.class);
        c1Var.f410355i5 = (c1Var.T || c1Var.N7()) ? (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) m32Var.m75936x14adae67(0) : null;
    }

    @Override // we2.z
    public int[] g() {
        return new int[]{20105};
    }
}
