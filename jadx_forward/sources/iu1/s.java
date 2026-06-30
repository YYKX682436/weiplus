package iu1;

/* loaded from: classes9.dex */
public final class s implements vl1.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76 f376485a;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76 activityC13064xaf775f76) {
        this.f376485a = activityC13064xaf775f76;
    }

    @Override // vl1.n
    public final void a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, android.view.View view, int i17, long j17) {
        iu1.c cVar = this.f376485a.f176717m;
        if (cVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mHomePageAdapter");
            throw null;
        }
        iu1.a x17 = cVar.x(i17);
        if (x17 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76 activityC13064xaf775f76 = this.f376485a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardHomePageNewUI", "click type: %s", java.lang.Integer.valueOf(x17.f376365b));
            int i18 = x17.f376365b;
            if (i18 == 2) {
                activityC13064xaf775f76.B = true;
                activityC13064xaf775f76.C = 1;
                r45.wt wtVar = x17.f376364a;
                activityC13064xaf775f76.f176715J = wtVar;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wtVar);
                int i19 = wtVar.f470965i;
                if (i19 == 1) {
                    r45.wt wtVar2 = x17.f376364a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wtVar2);
                    lu1.d.j(activityC13064xaf775f76, wtVar2.f470966m, 0);
                } else if (i19 == 2) {
                    r45.wt wtVar3 = x17.f376364a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wtVar3);
                    r45.iu iuVar = wtVar3.f470967n;
                    lu1.d.f(iuVar.f458861d, iuVar.f458862e, iuVar.f458863f);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                r45.wt wtVar4 = x17.f376364a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wtVar4);
                g0Var.d(16324, 2, wtVar4.f470960d, 0, 0, 1, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(activityC13064xaf775f76.E));
                return;
            }
            if (i18 == 4) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardHomePageNewUI", "click ticket item");
                android.content.Intent intent = new android.content.Intent(activityC13064xaf775f76, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13068x5a32e52e.class);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(activityC13064xaf775f76, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$initView$3", "onItemClick", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activityC13064xaf775f76.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(activityC13064xaf775f76, "com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$initView$3", "onItemClick", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16322, 5);
                return;
            }
            if (i18 == 5) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16322, 13);
                return;
            }
            if (i18 != 6) {
                return;
            }
            r45.bu buVar = x17.f376369f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(buVar);
            int i27 = buVar.f452591g;
            if (i27 == 1) {
                r45.bu buVar2 = x17.f376369f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(buVar2);
                lu1.d.j(activityC13064xaf775f76, buVar2.f452592h, 0);
                activityC13064xaf775f76.G = true;
            } else if (i27 == 2) {
                r45.bu buVar3 = x17.f376369f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(buVar3);
                r45.iu iuVar2 = buVar3.f452593i;
                lu1.d.f(iuVar2.f458861d, iuVar2.f458862e, iuVar2.f458863f);
                activityC13064xaf775f76.G = true;
            } else if (i27 == 3) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click native url: ");
                r45.bu buVar4 = x17.f376369f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(buVar4);
                sb6.append(buVar4.f452594m);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardHomePageNewUI", sb6.toString());
                r45.bu buVar5 = x17.f376369f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(buVar5);
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("weixin://mktcard/cert", buVar5.f452594m)) {
                    android.content.Intent intent2 = new android.content.Intent(activityC13064xaf775f76, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13068x5a32e52e.class);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(intent2);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(activityC13064xaf775f76, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$initView$3", "onItemClick", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    activityC13064xaf775f76.startActivity((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(activityC13064xaf775f76, "com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$initView$3", "onItemClick", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    activityC13064xaf775f76.G = true;
                }
            }
            r45.bu buVar6 = x17.f376369f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(buVar6);
            buVar6.f452596o = 0;
            r45.bu buVar7 = x17.f376369f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(buVar7);
            buVar7.f452595n = 0;
            iu1.c cVar2 = activityC13064xaf775f76.f176717m;
            if (cVar2 != null) {
                cVar2.m8147xed6e4d18(i17);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mHomePageAdapter");
                throw null;
            }
        }
    }
}
