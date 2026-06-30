package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class m30 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f50 f216652d;

    public m30(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f50 f50Var) {
        this.f216652d = f50Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$21", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f50 f50Var = this.f216652d;
        f50Var.V6();
        r45.lk2 lk2Var = f50Var.f215872e;
        int m75939xb282bd08 = lk2Var != null ? lk2Var.m75939xb282bd08(12) : gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_PURCHASE_LIVE_TOTAL_COUNT_INT, 0);
        r45.lk2 lk2Var2 = f50Var.f215872e;
        int m75939xb282bd082 = lk2Var2 != null ? lk2Var2.m75939xb282bd08(29) : gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_PURCHASE_MEMBER_TOTAL_COUNT_INT, 0);
        r45.lk2 lk2Var3 = f50Var.f215872e;
        int m75939xb282bd083 = lk2Var3 != null ? lk2Var3.m75939xb282bd08(33) : gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_PURCHASE_COURSE_TOTAL_COUNT_INT, 0);
        r45.lk2 lk2Var4 = f50Var.f215872e;
        int m75939xb282bd084 = lk2Var4 != null ? lk2Var4.m75939xb282bd08(35) : gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_PURCHASE_COLLECTION_TOTAL_COUNT_INT, 0);
        r45.lk2 lk2Var5 = f50Var.f215872e;
        int m75939xb282bd085 = lk2Var5 != null ? lk2Var5.m75939xb282bd08(36) : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f50.f215869z1;
        android.content.Intent intent = new android.content.Intent();
        r45.lk2 lk2Var6 = f50Var.f215872e;
        if (lk2Var6 == null || (c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) lk2Var6.m75936x14adae67(37)) == null) {
            c19786x6a1e2862 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f50.f215868y1;
        }
        if (c19786x6a1e2862 != null) {
            intent.putExtra("KEY_PURCHASE_PAY_MIC_COURSE_JUMP_INTENT", c19786x6a1e2862.mo14344x5f01b1f6());
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).nk(f50Var.m158354x19263085(), intent, m75939xb282bd082, m75939xb282bd08, m75939xb282bd083, m75939xb282bd084, m75939xb282bd085);
        ((c61.l7) i95.n0.c(c61.l7.class)).nk().N("PersonalCenterPurchasedContentEntry");
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.Mj((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17, f50Var.m158354x19263085(), 8L, 2L, false, 0, 0, null, 120, null);
        i95.m c18 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c18).Jj(f50Var.m158354x19263085(), f50Var.G, f50Var.E, 2L, 11L, (r30 & 32) != 0 ? false : false, (r30 & 64) != 0 ? 0L : 0L, (r30 & 128) != 0 ? "" : null, (r30 & 256) != 0 ? "" : null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$21", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
