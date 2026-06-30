package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class cq implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.jq f215564d;

    public cq(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.jq jqVar) {
        this.f215564d = jqVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.hi hiVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.hi hiVar2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderNegativeFeedBackUIC$feedBackClickListener$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.jq jqVar = this.f215564d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gi giVar = jqVar.f216414h;
        java.lang.Object obj = null;
        if (((giVar == null || (hiVar2 = giVar.f216068l) == null) ? null : hiVar2.f216168a) != com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fi.f215939e) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feedBack click but displayStatus=");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gi giVar2 = jqVar.f216414h;
            if (giVar2 != null && (hiVar = giVar2.f216068l) != null) {
                obj = hiVar.f216168a;
            }
            sb6.append(obj);
            sb6.append('!');
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderNegativeFeedBackUIC", sb6.toString());
            yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNegativeFeedBackUIC$feedBackClickListener$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc6 = jqVar.m158358x197d1fc6();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 abstractC15124x7bae6180 = m158358x197d1fc6 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180) m158358x197d1fc6 : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gi giVar3 = jqVar.f216414h;
        if (abstractC15124x7bae6180 != null && giVar3 != null) {
            android.view.View a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl.M.a(giVar3);
            if (a17 != null) {
                a17.removeCallbacks(jqVar.f216416m);
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.aq aqVar = jqVar.f216413g;
            if (aqVar == null) {
                aqVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.aq(new java.lang.ref.WeakReference(jqVar));
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.t80 t80Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.t80) pf5.z.f435481a.b(abstractC15124x7bae6180).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.t80.class);
                t80Var.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ct ctVar = t80Var.f217528e;
                if (ctVar == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                    throw null;
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v00) ctVar).f192390r = aqVar;
            }
            jqVar.f216413g = aqVar;
            aqVar.f215330b = currentTimeMillis;
            jqVar.P6();
            abstractC15124x7bae6180.u0(new rn5.a(4, currentTimeMillis, 2));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNegativeFeedBackUIC", "request id=" + currentTimeMillis);
            jqVar.S6(giVar3, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fi.f215940f, null);
            obj = jz5.f0.f384359a;
        }
        if (obj == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderNegativeFeedBackUIC", "request fail,fragment is null!");
        }
        jqVar.Q6();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNegativeFeedBackUIC$feedBackClickListener$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
