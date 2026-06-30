package kr2;

/* loaded from: classes8.dex */
public final class s implements com.p314xaae8f345.mm.p944x882e457a.h1 {
    @Override // com.p314xaae8f345.mm.p944x882e457a.n0
    public void b(r45.tp businessInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(businessInfo, "businessInfo");
        r45.al2 al2Var = new r45.al2();
        al2Var.mo11468x92b714fd(businessInfo.f468170e.g());
        kr2.q.f392850h.a().c(al2Var, false, 0L);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("newNpsSurveyTaskConf taskId = ");
        sb6.append(al2Var.m75942xfb822ef2(0));
        sb6.append(" positions = ");
        java.util.LinkedList m75941xfb821914 = al2Var.m75941xfb821914(2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getFeed_pos(...)");
        sb6.append(kz5.n0.g0(m75941xfb821914, null, null, null, 0, null, null, 63, null));
        sb6.append(" conditions = ");
        sb6.append(al2Var.m75939xb282bd08(1));
        sb6.append(" deliver_scenes = ");
        sb6.append(al2Var.m75939xb282bd08(3));
        sb6.append(" startTime = ");
        sb6.append(al2Var.m75942xfb822ef2(4));
        sb6.append(" expireTime = ");
        sb6.append(al2Var.m75942xfb822ef2(5));
        sb6.append(" excludeDays = ");
        sb6.append(al2Var.m75939xb282bd08(6));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NpsSurveyFuncMsgExtension", sb6.toString());
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.n0
    public void c(int i17, com.p314xaae8f345.mm.p944x882e457a.m0 m0Var) {
    }
}
