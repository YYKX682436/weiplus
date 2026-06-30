package jv3;

/* loaded from: classes14.dex */
public final class a extends com.p314xaae8f345.mm.p944x882e457a.i {
    public a(int i17, int i18, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, long j17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2, java.util.LinkedList linkedList, java.util.List list, java.lang.String str, java.lang.String str2, java.lang.String str3, int i19, int i27, int i28, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3, int i29, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = (i29 & 4) != 0 ? null : gVar;
        long j18 = (i29 & 8) != 0 ? 0L : j17;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar5 = (i29 & 16) != 0 ? null : gVar2;
        java.util.LinkedList linkedList2 = (i29 & 32) != 0 ? null : linkedList;
        java.util.List list2 = (i29 & 64) != 0 ? null : list;
        java.lang.String str4 = (i29 & 128) != 0 ? null : str;
        java.lang.String str5 = (i29 & 256) != 0 ? null : str2;
        java.lang.String str6 = (i29 & 512) != 0 ? null : str3;
        int i37 = (i29 & 1024) != 0 ? 0 : i19;
        int i38 = (i29 & 2048) != 0 ? 0 : i27;
        int i39 = (i29 & 4096) != 0 ? 0 : i28;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar6 = (i29 & 8192) != 0 ? null : gVar3;
        r45.wv0 wv0Var = new r45.wv0();
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar7 = gVar6;
        r45.xv0 xv0Var = new r45.xv0();
        int i47 = i38;
        xv0Var.mo11485x1f73abb4(new r45.ie());
        xv0Var.mo11484xe92ab0a8().f458493e = new r45.du5();
        wv0Var.f471014d = i17;
        wv0Var.f471015e = i18;
        wv0Var.f471016f = gVar4;
        i95.m c17 = i95.n0.c(zy2.b6.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        jz5.l ck6 = ((c61.l7) ((zy2.b6) c17)).ck(false);
        wv0Var.f471018h = ((java.lang.Number) ck6.f384366d).floatValue();
        wv0Var.f471017g = ((java.lang.Number) ck6.f384367e).floatValue();
        wv0Var.f471019i = j18;
        wv0Var.f471020m = gVar5;
        wv0Var.f471030w = linkedList2;
        if (list2 != null && (!list2.isEmpty())) {
            wv0Var.f471021n.addAll(list2);
        }
        wv0Var.f471022o = str4;
        wv0Var.f471028u = str5;
        wv0Var.f471029v = str6;
        wv0Var.f471023p = i39;
        wv0Var.f471024q = i37;
        wv0Var.f471025r = i47;
        int i48 = i39 > 0 ? 1 : j18 > 0 ? 2 : 0;
        wv0Var.f471026s = i48;
        wv0Var.f471027t = gVar7;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = wv0Var;
        lVar.f152198b = xv0Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderbgmlist";
        lVar.f152200d = 21113;
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("type:");
        sb6.append(i17);
        sb6.append(" count:");
        sb6.append(i18);
        sb6.append(" location:");
        sb6.append(ck6);
        sb6.append(" videoDuration:");
        sb6.append(j18);
        sb6.append(" searchQuery:");
        sb6.append(str5);
        sb6.append(" forRecommendExtraInfo:");
        sb6.append(str4);
        sb6.append(" miaoJianMusicIdList:");
        sb6.append(list2);
        sb6.append(" scene:");
        sb6.append(i37);
        sb6.append(" camera:");
        sb6.append(i47);
        sb6.append(" assetType:");
        sb6.append(i48);
        sb6.append(" picNum:");
        sb6.append(i39);
        sb6.append(" hasPromptRawText:");
        sb6.append(gVar7 != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderBgmList", sb6.toString());
    }
}
