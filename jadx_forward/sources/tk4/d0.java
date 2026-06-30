package tk4;

/* loaded from: classes9.dex */
public final class d0 extends com.p314xaae8f345.mm.p944x882e457a.i {
    public d0(int i17, bw5.y40 y40Var) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        bw5.z40 z40Var = new bw5.z40();
        z40Var.f117347d = i17;
        boolean[] zArr = z40Var.f117350g;
        zArr[2] = true;
        if (y40Var != null) {
            z40Var.f117349f = y40Var;
            zArr[4] = true;
        }
        byte[] mo14344x5f01b1f6 = z40Var.mo14344x5f01b1f6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
        lVar.f152197a = new qk.s9(mo14344x5f01b1f6);
        lVar.f152198b = new qk.t9();
        lVar.f152199c = "/cgi-bin/mmlistenappsvr/listenaudiopush";
        lVar.f152200d = 11313;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingGetAudioPushCGI", "MMListenAudioPushRequese scene: " + i17);
    }
}
