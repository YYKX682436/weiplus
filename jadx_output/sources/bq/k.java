package bq;

/* loaded from: classes.dex */
public final class k extends bq.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(r45.qt2 qt2Var, java.lang.String finderUsername, r45.xw4 item) {
        super(qt2Var);
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.ax0 ax0Var = new r45.ax0();
        ax0Var.set(1, db2.t4.f228171a.b(9468, qt2Var));
        ax0Var.set(2, finderUsername);
        java.util.LinkedList list = ax0Var.getList(3);
        if (list != null) {
            list.add(item);
        }
        lVar.f70664a = ax0Var;
        r45.bx0 bx0Var = new r45.bx0();
        bx0Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) bx0Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = bx0Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderclientnotify";
        lVar.f70667d = 9468;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("FinderClientNotifyCGI", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.bx0 resp = (r45.bx0) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("FinderClientNotifyCGI", "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
    }
}
