package xe2;

/* loaded from: classes3.dex */
public final class h extends we2.z {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f535398c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f535398c = "LiveAudienceInterceptor";
    }

    @Override // we2.z
    public void d(java.util.LinkedList msgList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgList, "msgList");
        r45.ch1 ch1Var = (r45.ch1) kz5.n0.k0(msgList);
        r45.kk1 kk1Var = new r45.kk1();
        if (ch1Var != null) {
            if (!(ch1Var.m75934xbce7f2f(4) != null)) {
                ch1Var = null;
            }
            if (ch1Var != null) {
                com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = ch1Var.m75934xbce7f2f(4);
                kk1Var.mo11468x92b714fd(m75934xbce7f2f != null ? m75934xbce7f2f.g() : null);
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("from msg audience: ");
        r45.ou0 ou0Var = (r45.ou0) kk1Var.m75936x14adae67(0);
        sb6.append(ou0Var != null ? java.lang.Integer.valueOf(ou0Var.m75939xb282bd08(2)) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f535398c, sb6.toString());
    }

    @Override // we2.z
    public int[] g() {
        return new int[]{20097};
    }
}
