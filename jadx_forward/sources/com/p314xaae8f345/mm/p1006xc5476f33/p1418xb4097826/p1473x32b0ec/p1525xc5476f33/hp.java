package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class hp {
    public hp(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(java.lang.String str, int i17, java.lang.String str2, int i18, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fp localGiftMsgParams, java.util.List list) {
        int i19;
        int i27;
        java.lang.String str3;
        java.util.LinkedList linkedList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localGiftMsgParams, "localGiftMsgParams");
        java.lang.String str4 = "Finder.FinderLiveGiftSendPlugin";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftSendPlugin", "addLocalGiftMsg giftId: " + str + " diffCnt: " + i18 + " isFromPatchSend: " + z17 + " comboId: " + str2);
        if (list == null || !(!list.isEmpty())) {
            i19 = 1;
        } else {
            i19 = 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftSendPlugin", "addLocalGiftMsg random gift, animation id:".concat(kz5.n0.g0(list, null, null, null, 0, null, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gp.f194256d, 31, null)));
        }
        dk2.u7 u7Var = dk2.u7.f315714a;
        ce2.i e17 = u7Var.e(str);
        boolean g17 = u7Var.g(e17);
        if (e17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftSendPlugin", "addLocalGiftMsg giftInfo is null,giftId:" + str + ",cnt:" + i17 + ",comboId:" + str2 + ",diffCnt:" + i18);
            return;
        }
        r45.ch1 ch1Var = new r45.ch1();
        r45.cj1 cj1Var = new r45.cj1();
        cj1Var.set(0, e17.f67814x2c488eb6);
        cj1Var.set(3, e17.c1());
        r45.bt5 bt5Var = new r45.bt5();
        r45.b82 b82Var = localGiftMsgParams.f194117c;
        bt5Var.set(0, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(b82Var.mo14344x5f01b1f6()));
        bt5Var.set(i19, 0);
        cj1Var.set(8, bt5Var);
        if (e17.Z0()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (list != null) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    r45.yv1 yv1Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.go0) it.next()).f194253a;
                    if (yv1Var != null) {
                        arrayList.add(yv1Var);
                    }
                }
            }
            cj1Var.m75941xfb821914(9).addAll(arrayList);
        } else if (e17.Y0()) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            if (list != null) {
                java.util.Iterator it6 = list.iterator();
                while (it6.hasNext()) {
                    r45.ov1 ov1Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.go0) it6.next()).f194254b;
                    if (ov1Var != null) {
                        arrayList2.add(ov1Var);
                    }
                }
            }
            cj1Var.m75941xfb821914(11).addAll(arrayList2);
        } else {
            mm2.n2 n2Var = (mm2.n2) dk2.ef.f314905a.i(mm2.n2.class);
            if (((n2Var == null || n2Var.f410814i != i19) ? 0 : i19) != 0) {
                if (list != null) {
                    java.util.Iterator it7 = list.iterator();
                    i27 = 0;
                    while (it7.hasNext()) {
                        r45.c42 c42Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.go0) it7.next()).f194255c;
                        i27 += c42Var != null ? c42Var.m75939xb282bd08(i19) : 0;
                    }
                } else {
                    i27 = 0;
                }
                cj1Var.set(12, java.lang.Integer.valueOf(i27));
            }
        }
        cj1Var.set(10, java.lang.Integer.valueOf(localGiftMsgParams.f194118d));
        ch1Var.set(4, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(cj1Var.mo14344x5f01b1f6()));
        r45.xn1 xn1Var = new r45.xn1();
        gk2.e eVar = localGiftMsgParams.f194115a;
        java.util.LinkedList linkedList2 = ((mm2.c1) eVar.a(mm2.c1.class)).f410345h;
        if (linkedList2 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator it8 = linkedList2.iterator();
            while (it8.hasNext()) {
                java.lang.Object next = it8.next();
                java.util.Iterator it9 = it8;
                java.lang.String str5 = str4;
                if (((r45.yl1) next).m75939xb282bd08(0) != 4) {
                    arrayList3.add(next);
                }
                it8 = it9;
                str4 = str5;
            }
            str3 = str4;
            linkedList = new java.util.LinkedList(arrayList3);
        } else {
            str3 = "Finder.FinderLiveGiftSendPlugin";
            linkedList = null;
        }
        xn1Var.set(11, linkedList);
        zl2.r4 r4Var = zl2.r4.f555483a;
        xn1Var.set(0, r4Var.m0(eVar));
        xn1Var.set(7, java.lang.Integer.valueOf(r4Var.g0()));
        ch1Var.set(13, xn1Var);
        ch1Var.set(1, 20009);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1 l1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1(ch1Var);
        l1Var.f197126h = str2;
        if (z17) {
            l1Var.f197127i = 0;
            l1Var.f197128m = i17;
        } else {
            l1Var.f197127i = i17;
            l1Var.f197128m = 1;
        }
        l1Var.f197123e = l1Var.f197127i > 1 ? g17 ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m1.f197152d : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m1.f197154f : g17 ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m1.f197153e : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m1.f197155g;
        java.lang.String str6 = localGiftMsgParams.f194116b;
        if (str6.length() == 0) {
            str6 = ((mm2.c1) eVar.a(mm2.c1.class)).f410385o;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str6, "<set-?>");
        l1Var.f197134s = str6;
        l1Var.f197137v = b82Var.m75939xb282bd08(0) == 9;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "addLocalGiftMsg local add GiftShowInfo:" + l1Var + ",diffCnt:" + i18);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.j1) ((mm2.c1) eVar.a(mm2.c1.class)).f410339g).g(l1Var);
    }
}
