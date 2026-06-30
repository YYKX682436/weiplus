package ch2;

/* loaded from: classes3.dex */
public final class r extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f122983m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
    }

    public final void Z6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1 l1Var) {
        r45.xn1 xn1Var;
        r45.xn1 xn1Var2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        int i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveKTVGiftController", "performKTVGiftAnim");
        if (l1Var != null && ((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).b7() && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(l1Var.f197133r, this.f122983m) && (xn1Var = (r45.xn1) l1Var.f197122d.m75936x14adae67(13)) != null) {
            int i18 = 0;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0);
            if (c19782x23db1cfa2 == null) {
                return;
            }
            ce2.i e17 = dk2.u7.f315714a.e(l1Var.f197133r);
            java.lang.String R0 = e17 != null ? e17.R0() : null;
            if (zl2.r4.f555483a.k2(c19782x23db1cfa2.m76197x6c03c64c())) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveKTVGiftController", "performKTVGiftAnim: myself");
                return;
            }
            java.lang.String str = l1Var.f197134s;
            r45.yx1 Q6 = ((om2.g) m56788xbba4bfc0(om2.g.class)).Q6();
            if (Q6 == null || (xn1Var2 = Q6.f472996i) == null || (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var2.m75936x14adae67(0)) == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c19782x23db1cfa.m76197x6c03c64c(), str)) {
                return;
            }
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((mm2.o4) m56788xbba4bfc0(mm2.o4.class)).a7().f390705c, c19782x23db1cfa2.m76197x6c03c64c())) {
                java.util.List Z6 = ((mm2.o4) m56788xbba4bfc0(mm2.o4.class)).Z6();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Z6, "<get-allLinkMicUserList>(...)");
                synchronized (Z6) {
                    java.util.Iterator it = Z6.iterator();
                    i17 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i17 = -1;
                            break;
                        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((km2.q) it.next()).f390705c, c19782x23db1cfa2.m76197x6c03c64c())) {
                            break;
                        } else {
                            i17++;
                        }
                    }
                }
                if (i17 >= 0 && i17 < 4) {
                    i18 = 1;
                }
                i18 = i18 != 0 ? i17 + 1 : i17;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("to_user_contact", str);
            bundle.putInt("from_user_index", i18);
            bundle.putString("gift_thumb_url", R0);
            X6(qo0.b.T, bundle);
        }
    }
}
