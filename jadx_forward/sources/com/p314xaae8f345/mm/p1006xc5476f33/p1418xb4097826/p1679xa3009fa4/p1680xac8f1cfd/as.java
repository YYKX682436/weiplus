package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class as extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.hs f215333d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f215334e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public as(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.hs hsVar, in5.s0 s0Var) {
        super(1);
        this.f215333d = hsVar;
        this.f215334e = s0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Object obj2;
        pq5.g l17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 it = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showSurveyLayout-1 feedId = ");
        long mo2128x1ed62e84 = it.mo2128x1ed62e84();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.hs hsVar = this.f215333d;
        sb6.append(hsVar.T6(mo2128x1ed62e84));
        sb6.append(", holder=");
        in5.s0 s0Var = this.f215334e;
        sb6.append(hsVar.V6(s0Var));
        sb6.append(", itemView=");
        android.view.View itemView = s0Var.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        sb6.append(hsVar.W6(itemView));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNpsSurveyUIC", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.hs.A.add(java.lang.Long.valueOf(it.mo2128x1ed62e84()));
        r45.al2 al2Var = (r45.al2) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.hs.C.get(java.lang.Long.valueOf(it.mo2128x1ed62e84()));
        if (al2Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.hs.D.put(java.lang.Long.valueOf(it.mo2128x1ed62e84()), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pq(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.rq.f217356d, 0L, 0, hsVar.f216191n, null, null, null, null, null, null, null, null, 4086, null));
            kr2.q.f392850h.a().g(al2Var.m75942xfb822ef2(0));
            r45.yk2 w76 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.hs.w7(hsVar, s0Var, null, 2, null);
            if (w76 != null) {
                java.util.LinkedList m75941xfb821914 = w76.m75941xfb821914(1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getQuestions(...)");
                java.util.Iterator it6 = m75941xfb821914.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it6.next();
                    if (((r45.zk2) obj2).m75942xfb822ef2(0) == w76.m75942xfb822ef2(2)) {
                        break;
                    }
                }
                r45.zk2 zk2Var = (r45.zk2) obj2;
                if (zk2Var != null) {
                    if (hsVar.g7(s0Var)) {
                        hsVar.k7(s0Var, zk2Var, null);
                    } else {
                        if (zk2Var.m75939xb282bd08(3) != 1) {
                            int m75939xb282bd08 = zk2Var.m75939xb282bd08(4);
                            if (m75939xb282bd08 == 1) {
                                hsVar.n7(s0Var, zk2Var, null);
                            } else if (m75939xb282bd08 == 2) {
                                hsVar.m7(s0Var, zk2Var, null);
                            }
                        } else {
                            hsVar.l7(s0Var, zk2Var, null);
                        }
                    }
                    r45.al2 al2Var2 = (r45.al2) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.hs.C.get(java.lang.Long.valueOf(((so2.j5) s0Var.f374658i).mo2128x1ed62e84()));
                    if (al2Var2 != null) {
                        long m75942xfb822ef2 = al2Var2.m75942xfb822ef2(0);
                        long m75942xfb822ef22 = w76.m75942xfb822ef2(0);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNpsSurveyUIC", "surveyShow taskId=" + m75942xfb822ef2 + ", surveyId=" + m75942xfb822ef22);
                        if (hsVar.m158354x19263085() instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
                            l17 = new db2.x2(m75942xfb822ef2, m75942xfb822ef22).l();
                            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = hsVar.m158354x19263085();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                            l17.f((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085);
                        } else {
                            l17 = new db2.x2(m75942xfb822ef2, m75942xfb822ef22).l();
                        }
                        l17.h(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ds.f215694a);
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.P9).mo141623x754a37bb()).r()).intValue();
            long m75938x746dc8a6 = intValue == 0 ? al2Var.m75938x746dc8a6(9) * 1000 : intValue * 1000;
            if (m75938x746dc8a6 > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNpsSurveyUIC", "showSurveyLayout timerHandler.postDelayed " + m75938x746dc8a6 + " ms");
                hsVar.f216186f.mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.zr(hsVar, s0Var), m75938x746dc8a6);
            }
        }
        return jz5.f0.f384359a;
    }
}
