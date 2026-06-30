package lb3;

/* loaded from: classes9.dex */
public abstract class g implements gm5.a {
    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        lb3.j jVar;
        nb3.h hVar = (nb3.h) this;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        nb3.i iVar = hVar.f417585b;
        iVar.f417590e = false;
        if (iVar.f417586a == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaLuckyMoneyLogicDetail", "CgiQueryWxaHB got its response. but ui is destroyed.");
        } else {
            int i17 = fVar.f152148a;
            if (i17 == 0 && fVar.f152149b == 0) {
                r45.yh5 yh5Var = (r45.yh5) fVar.f152151d;
                int i18 = yh5Var.f472639x;
                if (i18 != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaLuckyMoneyLogicDetail", "CgiQueryWxaHB error wxahb_status = [%d] errorwording = [%s]", java.lang.Integer.valueOf(i18), ((r45.yh5) fVar.f152151d).f472640y);
                    nb3.i.a(iVar, ((r45.yh5) fVar.f152151d).f472640y, new android.content.Intent().putExtra("result_error_code", -1).putExtra("result_error_msg", "fail:system error {{service error query red packet fail errStatus = " + ((r45.yh5) fVar.f152151d).f472639x + ",errMsg" + ((r45.yh5) fVar.f152151d).f472640y + "}}"));
                } else {
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(yh5Var.f472635t);
                    java.lang.Integer valueOf2 = java.lang.Integer.valueOf(((r45.yh5) fVar.f152151d).f472628m.size());
                    java.util.List list = iVar.f417591f;
                    java.util.LinkedList linkedList = (java.util.LinkedList) list;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaLuckyMoneyLogicDetail", "CgiQueryWxaHB succeed. hasmore = [%b] rcvd_user_list.size() = [%d], currentlist.size = [%d]", valueOf, valueOf2, java.lang.Integer.valueOf(linkedList.size()));
                    r45.yh5 yh5Var2 = (r45.yh5) fVar.f152151d;
                    iVar.f417589d = yh5Var2.f472635t;
                    linkedList.addAll(yh5Var2.f472628m);
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1822xb06a1851.ActivityC16324x5371571d) iVar.f417586a).V6();
                    if (hVar.f417584a == 0) {
                        nb3.b bVar = iVar.f417586a;
                        r45.yh5 yh5Var3 = (r45.yh5) fVar.f152151d;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1822xb06a1851.ActivityC16324x5371571d activityC16324x5371571d = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1822xb06a1851.ActivityC16324x5371571d) bVar;
                        if (yh5Var3 == null) {
                            jVar = null;
                        } else {
                            activityC16324x5371571d.getClass();
                            jVar = new lb3.j();
                            jVar.f399296a = yh5Var3.f472630o;
                            jVar.f399297b = yh5Var3.f472632q;
                            jVar.f399298c = yh5Var3.f472631p;
                            jVar.f399299d = yh5Var3.f472622d;
                            jVar.f399303h = yh5Var3.f472636u;
                            jVar.f399304i = yh5Var3.f472634s;
                            jVar.f399301f = yh5Var3.f472627i;
                            jVar.f399300e = yh5Var3.f472638w;
                            jVar.f399302g = yh5Var3.f472629n;
                        }
                        activityC16324x5371571d.U6(jVar);
                        int i19 = yh5Var3.f472635t;
                        java.util.LinkedList linkedList2 = yh5Var3.f472628m;
                        activityC16324x5371571d.W6(i19, linkedList2, linkedList2);
                    } else {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1822xb06a1851.ActivityC16324x5371571d) iVar.f417586a).W6(iVar.f417589d, ((r45.yh5) fVar.f152151d).f472628m, list);
                    }
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaLuckyMoneyLogicDetail", "CgiQueryWxaHB failed [%d, %d, %s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(fVar.f152149b), fVar.f152150c);
                nb3.i.a(iVar, fVar.f152150c, new android.content.Intent().putExtra("result_error_code", -1).putExtra("result_error_msg", "fail:system error {{service error query errType = " + fVar.f152148a + ",errCode" + fVar.f152149b + "}}"));
            }
        }
        return null;
    }
}
