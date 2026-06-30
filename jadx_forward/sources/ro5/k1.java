package ro5;

/* loaded from: classes14.dex */
public final /* synthetic */ class k1 extends p3321xbce91901.jvm.p3324x21ffc6bd.m implements yz5.l {
    public k1(java.lang.Object obj) {
        super(1, obj, ro5.m1.class, "onEncodeQosParamUpdate", "onEncodeQosParamUpdate(Lcom/tencent/mm/voipmp/v2/render/raw/hw_codec/QoSParams;)V", 0);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        uo5.u p07 = (uo5.u) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        ro5.m1 m1Var = (ro5.m1) this.f72685xcfcbe9ef;
        m1Var.getClass();
        ro5.m mVar = (ro5.m) m1Var.f479773b;
        mVar.getClass();
        ro5.b0 b0Var = mVar.f479770a;
        er4.r rVar = b0Var.f479679c;
        if (rVar == er4.r.MP_ROOM_TYPE_MULTI_TALK || rVar == er4.r.MP_ROOM_TYPE_TRANS_MUTLTI) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPRenderController", "current is in multitalk,not allow to switch preview");
        } else if (p07.f511287k != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPRenderController", "current remote user ui is not full screen,not allow to switch preview");
        } else if ((p07.f511286j & 128) == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPRenderController", "0x80");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPRenderController", "onEncodeParamsUpdate");
            so5.k0 k0Var = b0Var.f479682f;
            if (k0Var != null) {
                p3325xe03a0797.p3326xc267989b.l.d(k0Var.f492390d, null, null, new so5.f0(k0Var, p07, null), 3, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
