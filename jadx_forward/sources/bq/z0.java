package bq;

/* loaded from: classes2.dex */
public final class z0 extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f105073o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(java.util.LinkedList sendMarkReadList, r45.qt2 qt2Var) {
        super(qt2Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sendMarkReadList, "sendMarkReadList");
        this.f105073o = sendMarkReadList;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.qf2 qf2Var = new r45.qf2();
        qf2Var.set(2, sendMarkReadList);
        r45.kv0 b17 = db2.t4.f309704a.b(3520, qt2Var);
        java.util.Iterator it = sendMarkReadList.iterator();
        while (it.hasNext()) {
            r45.ni4 ni4Var = (r45.ni4) it.next();
            java.util.LinkedList m75941xfb821914 = b17.m75941xfb821914(7);
            if (m75941xfb821914 != null) {
                r45.fl2 fl2Var = new r45.fl2();
                fl2Var.set(1, ni4Var.m75945x2fec8307(4));
                fl2Var.set(0, java.lang.Long.valueOf(ni4Var.m75942xfb822ef2(0)));
                m75941xfb821914.add(fl2Var);
            }
        }
        qf2Var.set(1, b17);
        lVar.f152197a = qf2Var;
        r45.rf2 rf2Var = new r45.rf2();
        rf2Var.set(0, new r45.ie());
        lVar.f152198b = rf2Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findermarkread";
        lVar.f152200d = 3520;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMarkReadCGI", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
    }
}
