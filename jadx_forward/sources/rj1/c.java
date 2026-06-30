package rj1;

/* loaded from: classes7.dex */
public final class c extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.o0 {

    /* renamed from: CTRL_INDEX */
    public static final int f76506x366c91de = 1326;

    /* renamed from: NAME */
    public static final java.lang.String f76507x24728b = "onGetNewXmlMsgEvent";

    public final void x(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 service, java.util.List infoList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoList, "infoList");
        if (infoList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EventOnGetNewXmlMsg", "empty list.");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = infoList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1197xb1dfe949.C12627x488d3557 c12627x488d3557 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1197xb1dfe949.C12627x488d3557) it.next();
            arrayList.add(kz5.c1.k(new jz5.l("msg_id", c12627x488d3557.f67164x297eb4f7), new jz5.l("create_time", java.lang.Long.valueOf(c12627x488d3557.f67161xac3be4e)), new jz5.l("expire_time", java.lang.Long.valueOf(c12627x488d3557.f67163x876650f1)), new jz5.l("busi_type", java.lang.Integer.valueOf(c12627x488d3557.f67160xd95c4268)), new jz5.l("msg_type", java.lang.Integer.valueOf(c12627x488d3557.f67165xc4aab016)), new jz5.l("data_json", c12627x488d3557.f67162x88617557)));
            rj1.m.b(c12627x488d3557, 1);
            rj1.m.a(c12627x488d3557);
        }
        t(kz5.b1.e(new jz5.l("msgList", arrayList)));
        u(service);
        m();
    }
}
