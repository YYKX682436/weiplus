package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes8.dex */
public class b4 implements android.widget.AdapterView.OnItemClickListener, android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public int f222579d = 0;

    public final void a(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b bVar) {
        int i17;
        int o17;
        int i18 = bVar.f221738h2;
        if (i18 == 1) {
            o17 = r53.f.v(context, bVar.f221741k2, null, null);
        } else {
            if (i18 != 0) {
                i17 = 0;
                com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.g(context, bVar.f221745o2, bVar.f221746p2, bVar.f221747q2, i17, bVar.f67370x28d45f97, this.f222579d, bVar.f221743m2, bVar.f221754x2);
            }
            if (bVar.I0() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.C2.f405188i)) {
                ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
                if (!com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.q(context, bVar)) {
                    o17 = r53.f.v(context, bVar.C2.f405188i, null, null);
                }
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.Q) || bVar.T != 4) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putCharSequence("game_app_id", bVar.f67370x28d45f97);
                int i19 = bVar.f221746p2;
                if (i19 == 1601) {
                    bundle.putInt("game_report_from_scene", this.f222579d);
                } else {
                    bundle.putInt("game_report_from_scene", i19);
                }
                o17 = r53.f.o(context, bVar.f67370x28d45f97, bVar.f221741k2, bundle, 0);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameItemClickListener", "Download via Google Play");
                ((yb0.c) ((zb0.y) i95.n0.c(zb0.y.class))).wi(context, bVar.Q);
                o17 = 25;
            }
        }
        i17 = o17;
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.g(context, bVar.f221745o2, bVar.f221746p2, bVar.f221747q2, i17, bVar.f67370x28d45f97, this.f222579d, bVar.f221743m2, bVar.f221754x2);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameItemClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() == null || !(view.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b)) {
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameItemClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        a(view.getContext(), (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b) view.getTag());
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameItemClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameItemClickListener", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        java.lang.Object item = adapterView.getAdapter().getItem(i17);
        if (item == null || !(item instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b)) {
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameItemClickListener", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b bVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b) item;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.f67370x28d45f97)) {
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameItemClickListener", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        } else {
            a(view.getContext(), bVar);
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameItemClickListener", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }
}
