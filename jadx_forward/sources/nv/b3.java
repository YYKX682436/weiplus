package nv;

/* loaded from: classes4.dex */
public class b3 implements c01.yc {
    @Override // c01.yc
    public void O0(com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupCore.MsgSynchronize", "appMsgListener onreceive appmsg");
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(x51.j1.g(p0Var.f152259a.f459094h), "appmsg", null);
        if (((java.lang.String) d17.get(".appmsg.action")).equals("phone")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupCore.MsgSynchronize", "this appmsg is from phone, ignore.");
            return;
        }
        gm0.j1.e().j(new nv.a3(this, (java.lang.String) d17.get(".appmsg.messageaction"), (java.lang.String) d17.get(".appmsg.extinfo"), ((java.lang.String) d17.get(".appmsg.appattach.aeskey")).getBytes()));
    }

    @Override // c01.yc
    public void g1(com.p314xaae8f345.mm.p944x882e457a.r0 r0Var) {
    }
}
