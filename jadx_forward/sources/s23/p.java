package s23;

/* loaded from: classes4.dex */
public final /* synthetic */ class p extends p3321xbce91901.jvm.p3324x21ffc6bd.m implements yz5.l {
    public p(java.lang.Object obj) {
        super(1, obj, s23.x.class, "onPositiveClickActivityTip", "onPositiveClickActivityTip(Lcom/tencent/mm/protocal/protobuf/ActivityTemplateTip;)V", 0);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.d2 p07 = (r45.d2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        s23.x xVar = (s23.x) this.f72685xcfcbe9ef;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPositiveClickActivityTip: ");
        k33.b bVar = xVar.f483890u;
        sb6.append(bVar != null ? java.lang.Integer.valueOf(bVar.hashCode()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MJTemplateUI", sb6.toString());
        xVar.b(p07);
        if (!xVar.d()) {
            xVar.e(0, java.lang.Boolean.TRUE);
        }
        ((ez0.f) xVar.a()).a(uy0.n.f513436f);
        return jz5.f0.f384359a;
    }
}
