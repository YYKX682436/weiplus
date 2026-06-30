package bq;

/* loaded from: classes2.dex */
public final class z0 extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f23540o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(java.util.LinkedList sendMarkReadList, r45.qt2 qt2Var) {
        super(qt2Var);
        kotlin.jvm.internal.o.g(sendMarkReadList, "sendMarkReadList");
        this.f23540o = sendMarkReadList;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.qf2 qf2Var = new r45.qf2();
        qf2Var.set(2, sendMarkReadList);
        r45.kv0 b17 = db2.t4.f228171a.b(3520, qt2Var);
        java.util.Iterator it = sendMarkReadList.iterator();
        while (it.hasNext()) {
            r45.ni4 ni4Var = (r45.ni4) it.next();
            java.util.LinkedList list = b17.getList(7);
            if (list != null) {
                r45.fl2 fl2Var = new r45.fl2();
                fl2Var.set(1, ni4Var.getString(4));
                fl2Var.set(0, java.lang.Long.valueOf(ni4Var.getLong(0)));
                list.add(fl2Var);
            }
        }
        qf2Var.set(1, b17);
        lVar.f70664a = qf2Var;
        r45.rf2 rf2Var = new r45.rf2();
        rf2Var.set(0, new r45.ie());
        lVar.f70665b = rf2Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findermarkread";
        lVar.f70667d = 3520;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.FinderMarkReadCGI", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
    }
}
