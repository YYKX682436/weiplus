package s23;

/* loaded from: classes4.dex */
public final /* synthetic */ class q extends p3321xbce91901.jvm.p3324x21ffc6bd.m implements yz5.a {
    public q(java.lang.Object obj) {
        super(0, obj, s23.x.class, "onNegativeClickActivityTip", "onNegativeClickActivityTip()V", 0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        s23.x xVar = (s23.x) this.f72685xcfcbe9ef;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onNegativeClickActivityTip: ");
        k33.b bVar = xVar.f483890u;
        sb6.append(bVar != null ? java.lang.Integer.valueOf(bVar.hashCode()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MJTemplateUI", sb6.toString());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MJTemplateUI", "hitActivityTipNegativeEvent: ");
        yz5.l lVar = xVar.f483888s;
        if (lVar != null) {
            lVar.mo146xb9724478(0L);
        }
        ((ez0.f) xVar.a()).a(uy0.n.f513437g);
        return jz5.f0.f384359a;
    }
}
