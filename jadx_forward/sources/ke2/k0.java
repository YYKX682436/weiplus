package ke2;

/* loaded from: classes2.dex */
public final class k0 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f388494t;

    /* renamed from: u, reason: collision with root package name */
    public final zy2.l5 f388495u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i17, float f17, float f18, zy2.l5 callback) {
        super(null, null, 3, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f388494t = "Finder.CgiFinderLiveStream";
        this.f388495u = callback;
        r45.wa2 wa2Var = new r45.wa2();
        wa2Var.set(2, gVar);
        wa2Var.set(3, java.lang.Integer.valueOf(i17));
        wa2Var.set(4, java.lang.Float.valueOf(f17));
        wa2Var.set(5, java.lang.Float.valueOf(f18));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = wa2Var;
        r45.xa2 xa2Var = new r45.xa2();
        xa2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) xa2Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = xa2Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivestream";
        lVar.f152200d = 4151;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLiveStream", "CgiFinderLiveStream init " + wa2Var.m75939xb282bd08(3) + ',' + wa2Var.m75934xbce7f2f(2));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        r45.nw1 m76794xd0557130;
        r45.xa2 resp = (r45.xa2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f388494t, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ph phVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ph) this.f388495u;
        phVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.th thVar = phVar.f185796a;
        thVar.f186151m = false;
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.th.n(thVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedLiveListConvert", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + '}');
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.th.n(thVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedLiveListConvert", "before merge live list:" + thVar.f186150i);
        so2.i1 i1Var = thVar.f186150i;
        i1Var.getClass();
        java.util.LinkedList m75941xfb821914 = resp.m75941xfb821914(1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedLiveList", "merge remote list size:" + m75941xfb821914.size());
        i1Var.f491949d = resp.m75934xbce7f2f(2);
        i1Var.f491952g = resp.m75939xb282bd08(3) > 0;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = m75941xfb821914.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            arrayList = i1Var.f491950e;
            if (!hasNext) {
                break;
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) it.next();
            java.util.Iterator it6 = arrayList.iterator();
            int i19 = 0;
            while (true) {
                if (!it6.hasNext()) {
                    i19 = -1;
                    break;
                } else {
                    if (((so2.j5) it6.next()).mo2128x1ed62e84() == c19792x256d2725.m76784x5db1b11()) {
                        break;
                    } else {
                        i19++;
                    }
                }
            }
            java.util.Iterator it7 = linkedList.iterator();
            int i27 = 0;
            while (true) {
                if (!it7.hasNext()) {
                    i27 = -1;
                    break;
                } else {
                    if (((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) it7.next()).m76784x5db1b11() == c19792x256d2725.m76784x5db1b11()) {
                        break;
                    } else {
                        i27++;
                    }
                }
            }
            if (i19 == -1 && i27 == -1 && cm2.a.f124861a.t(c19792x256d2725)) {
                linkedList.add(c19792x256d2725);
            } else {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("merge live list feed:");
                sb6.append((c19792x256d2725 == null || (m76794xd0557130 = c19792x256d2725.m76794xd0557130()) == null) ? 0L : m76794xd0557130.m75942xfb822ef2(0));
                sb6.append(',');
                sb6.append(c19792x256d2725.m76801x8010e5e4());
                sb6.append(" exist!");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedLiveList", sb6.toString());
            }
        }
        if (linkedList.size() > 0) {
            arrayList2 = i1Var.i(linkedList);
            arrayList.addAll(arrayList2);
            i1Var.k();
            i1Var.g();
        } else {
            arrayList2 = null;
        }
        if (!(arrayList2 == null || arrayList2.isEmpty())) {
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.oh(thVar, arrayList2));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.th.n(thVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedLiveListConvert", "after merge live list:" + thVar.f186150i);
    }
}
