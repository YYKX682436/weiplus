package bq;

/* loaded from: classes.dex */
public final class d1 extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public final int f23482o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(r45.qt2 qt2Var, java.lang.String finderUsername, int i17, com.tencent.mm.protobuf.g gVar) {
        super(qt2Var);
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.zj2 zj2Var = new r45.zj2();
        this.f23482o = i17;
        zj2Var.set(1, db2.t4.f228171a.b(23915, qt2Var));
        zj2Var.set(2, finderUsername);
        zj2Var.set(3, gVar);
        lVar.f70664a = zj2Var;
        r45.ak2 ak2Var = new r45.ak2();
        ak2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) ak2Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = ak2Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findernativedramauserpage";
        lVar.f70667d = 23915;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.FinderBaseCgi", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
    }
}
