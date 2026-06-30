package xe2;

/* loaded from: classes3.dex */
public final class g extends we2.z {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f535395c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f535395c = "LiveAudienceActionInfoInterceptor";
    }

    @Override // we2.z
    public void d(java.util.LinkedList msgList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgList, "msgList");
        r45.ch1 ch1Var = (r45.ch1) kz5.n0.k0(msgList);
        r45.nh1 nh1Var = new r45.nh1();
        if (ch1Var != null) {
            if (!(ch1Var.m75934xbce7f2f(4) != null)) {
                ch1Var = null;
            }
            if (ch1Var != null) {
                com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = ch1Var.m75934xbce7f2f(4);
                nh1Var.mo11468x92b714fd(m75934xbce7f2f != null ? m75934xbce7f2f.g() : null);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f535395c, "receive audience action msg:" + pm0.b0.g(nh1Var));
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.x4) this.f526800a.a(mm2.x4.class)).A).k(nh1Var);
    }

    @Override // we2.z
    public int[] g() {
        return new int[]{20084};
    }
}
