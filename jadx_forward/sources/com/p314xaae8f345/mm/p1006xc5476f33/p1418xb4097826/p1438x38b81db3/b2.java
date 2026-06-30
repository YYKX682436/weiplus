package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class b2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.k0 f184456d;

    public b2(so2.k0 k0Var) {
        this.f184456d = k0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderDraftInfoConvert$updateProgress$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).getClass();
        mv2.f0 f0Var = mv2.f0.f413094a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 draft = this.f184456d.f491985d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(draft, "draft");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostManager", "Finder.PostLog repost draft " + draft.f66236x88be67a1 + ", " + draft.f66238x2327e25f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 D0 = ((c61.l7) i95.n0.c(c61.l7.class)).Oj().D0(draft.f66236x88be67a1);
        if (D0 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LogPost.FinderPostManager", "repost draftItem empty, " + draft.v0());
        } else {
            D0.f66235x52c1d072 = 1;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 t07 = D0.t0();
            r45.qb4 m59277xa8f45ee4 = t07.m59277xa8f45ee4();
            m59277xa8f45ee4.set(1, 0);
            m59277xa8f45ee4.set(4, 0);
            if (m59277xa8f45ee4.m75939xb282bd08(2) == 2) {
                m59277xa8f45ee4.set(2, 0);
            }
            java.util.Iterator<T> it = t07.m59264x7efe73ec().iterator();
            while (it.hasNext()) {
                r45.dd4 dd4Var = (r45.dd4) ((r45.mb4) it.next()).m75936x14adae67(14);
                if (dd4Var != null) {
                    dd4Var.set(7, 0);
                }
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = t07.f66946x284ddcb8;
            if (c19783xd9a946b7 != null) {
                c19783xd9a946b7.m76364xfc30156(c19783xd9a946b7.m76257x6bc66c4a() + 1);
                hc2.p0.b(c19783xd9a946b7, "clickRepost");
            }
            if (t07.m59317xe8cd5cb1()) {
                java.util.Iterator<T> it6 = t07.m59214x2de915fd().iterator();
                while (it6.hasNext()) {
                    java.util.Iterator<T> it7 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) it6.next()).m59264x7efe73ec().iterator();
                    while (it7.hasNext()) {
                        r45.dd4 dd4Var2 = (r45.dd4) ((r45.mb4) it7.next()).m75936x14adae67(14);
                        if (dd4Var2 != null) {
                            dd4Var2.set(7, 0);
                        }
                    }
                }
            }
            cu2.o.f303963a.b(D0);
            f0Var.c();
            boolean m59314x4d5c4d55 = D0.t0().m59314x4d5c4d55();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.C(1718L, 15L, 1L);
            if (m59314x4d5c4d55) {
                g0Var.C(1719L, 15L, 1L);
            }
            boolean m59314x4d5c4d552 = D0.t0().m59314x4d5c4d55();
            g0Var.C(1718L, 42L, 1L);
            if (m59314x4d5c4d552) {
                g0Var.C(1719L, 42L, 1L);
            }
            if (D0.t0().m59314x4d5c4d55()) {
                g0Var.C(1718L, 53L, 1L);
                g0Var.C(1719L, 53L, 1L);
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5442xd807898f c5442xd807898f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5442xd807898f();
            long j17 = D0.f66236x88be67a1;
            am.ga gaVar = c5442xd807898f.f135783g;
            gaVar.f88282a = j17;
            gaVar.f88283b = D0.m60705xa8f45ee4().m75939xb282bd08(4);
            c5442xd807898f.e();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderDraftInfoConvert$updateProgress$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
