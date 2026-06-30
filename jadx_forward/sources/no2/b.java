package no2;

/* loaded from: classes10.dex */
public final class b implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ no2.c f420271a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f420272b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.List f420273c;

    public b(no2.c cVar, int i17, java.util.List list) {
        this.f420271a = cVar;
        this.f420272b = i17;
        this.f420273c = list;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.wg2 wg2Var;
        java.lang.Object obj2;
        java.lang.Object obj3;
        int i17;
        java.lang.Object obj4;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i18 = fVar.f152148a;
        int i19 = fVar.f152149b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestDiffData: ");
        sb6.append(i18);
        sb6.append(", ");
        sb6.append(i19);
        sb6.append(", scene=");
        no2.c cVar = this.f420271a;
        sb6.append(cVar.f420274a);
        sb6.append(" tabIndex=");
        sb6.append(this.f420272b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiFinderBatchGetMentionInfo", sb6.toString());
        if (i18 == 0 && i19 == 0 && (wg2Var = (r45.wg2) ((r45.mv0) fVar.f152151d).m75936x14adae67(1)) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiFinderBatchGetMentionInfo", "FinderMentionList size " + wg2Var.m75941xfb821914(0).size());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(wg2Var.m75941xfb821914(0), "getMentions(...)");
            if (!r3.isEmpty()) {
                java.util.LinkedList<r45.pg2> m75941xfb821914 = wg2Var.m75941xfb821914(0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getMentions(...)");
                for (r45.pg2 pg2Var : m75941xfb821914) {
                    int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209155bc).mo141623x754a37bb()).r()).intValue();
                    int i27 = 34;
                    int i28 = cVar.f420274a;
                    java.util.List list = this.f420273c;
                    if (intValue == 1) {
                        java.util.Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                i17 = i28;
                                obj4 = null;
                                break;
                            }
                            obj4 = it.next();
                            i17 = i28;
                            if (pg2Var.m75942xfb822ef2(i27) == ((so2.i) obj4).f491944d.f66124x65f321b) {
                                break;
                            }
                            i28 = i17;
                            i27 = 34;
                        }
                        so2.i iVar = (so2.i) obj4;
                        if (iVar != null) {
                            dm.pd pdVar = iVar.f491944d;
                            if ((pdVar.f66089x404ea322 == pg2Var.m75939xb282bd08(35) && pdVar.f66082x26b1b2e8 == pg2Var.m75939xb282bd08(10) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(pdVar.f66127xca12e5b3, (r45.xg2) pg2Var.m75936x14adae67(38)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(pdVar.f66094x434c90c3, (r45.fb1) pg2Var.m75936x14adae67(54))) ? false : true) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiFinderBatchGetMentionInfo", "requestDiffData update mentionId: " + pdVar.f66124x65f321b + ", extFlag: " + pdVar.f66082x26b1b2e8 + "->" + pg2Var.m75939xb282bd08(10) + ", followFlag: " + pdVar.f66089x404ea322 + "->" + pg2Var.m75939xb282bd08(35) + ", thankInfo: " + pdVar.f66127xca12e5b3 + "->" + ((r45.xg2) pg2Var.m75936x14adae67(38)));
                            }
                            pdVar.f66089x404ea322 = pg2Var.m75939xb282bd08(35);
                            pdVar.f66082x26b1b2e8 = pg2Var.m75939xb282bd08(10);
                            pdVar.f66127xca12e5b3 = (r45.xg2) pg2Var.m75936x14adae67(38);
                            pdVar.f66085x5cf940e9 = (r45.ub1) pg2Var.m75936x14adae67(40);
                            pdVar.f66126xdf83d1d8 = pg2Var.m75939xb282bd08(52);
                            pdVar.f66094x434c90c3 = (r45.fb1) pg2Var.m75936x14adae67(54);
                            pdVar.f66123xabd3e0e0 = pg2Var;
                            int i29 = i17;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMentionLogic", "updateMention mentionId=" + pdVar.f66124x65f321b + " success=" + ((c61.l7) i95.n0.c(c61.l7.class)).fk(i29 != 1 ? i29 != 2 ? 0 : 1 : 2).mo11261xce0038c9(pdVar.f72763xa3c65b86, pdVar));
                        }
                    } else {
                        java.util.Iterator it6 = list.iterator();
                        while (true) {
                            if (!it6.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it6.next();
                            if (pg2Var.m75942xfb822ef2(34) == ((so2.i) obj2).f491944d.f66124x65f321b) {
                                break;
                            }
                        }
                        so2.i iVar2 = (so2.i) obj2;
                        if (iVar2 != null) {
                            int m75939xb282bd08 = pg2Var.m75939xb282bd08(35);
                            dm.pd pdVar2 = iVar2.f491944d;
                            pdVar2.f66089x404ea322 = m75939xb282bd08;
                            pdVar2.f66126xdf83d1d8 = pg2Var.m75939xb282bd08(52);
                            l75.n0 fk6 = ((c61.l7) i95.n0.c(c61.l7.class)).fk(i28 != 1 ? i28 != 2 ? 0 : 1 : 2);
                            char c17 = i28 != 1 ? i28 != 2 ? (char) 0 : (char) 1 : (char) 2;
                            int i37 = dm.x4.f322559a3;
                            java.lang.String str = c17 == 1 ? "WxIdentityMsg" : "FinderIdentityMsg";
                            java.lang.String str2 = "UPDATE " + str + " SET followFlag=" + pdVar2.f66089x404ea322 + " WHERE id=" + pdVar2.f66095xc8a07680;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMentionLogic", "updateMentionFollowFlag sql:" + str2 + ", success:" + fk6.m145253xb158737d(str, str2) + ", flag:" + pdVar2.f66089x404ea322);
                        }
                        java.util.Iterator it7 = list.iterator();
                        while (true) {
                            if (!it7.hasNext()) {
                                obj3 = null;
                                break;
                            }
                            java.lang.Object next = it7.next();
                            if (pg2Var.m75942xfb822ef2(34) == ((so2.i) next).f491944d.f66124x65f321b) {
                                obj3 = next;
                                break;
                            }
                        }
                        so2.i iVar3 = (so2.i) obj3;
                        if (iVar3 != null) {
                            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("requestDiffData updateExtFlag mentionId=");
                            dm.pd pdVar3 = iVar3.f491944d;
                            sb7.append(pdVar3.f66124x65f321b);
                            sb7.append(" originalFlag=");
                            sb7.append(pdVar3.f66082x26b1b2e8);
                            sb7.append(" newFlag=");
                            sb7.append(pg2Var.m75939xb282bd08(10));
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiFinderBatchGetMentionInfo", sb7.toString());
                            pdVar3.f66082x26b1b2e8 = pg2Var.m75939xb282bd08(10);
                            pdVar3.f66126xdf83d1d8 = pg2Var.m75939xb282bd08(52);
                            cu2.b0.f303904a.l(pdVar3, i28);
                        }
                    }
                }
                pm0.v.X(new no2.a(cVar));
            }
        }
        return jz5.f0.f384359a;
    }
}
