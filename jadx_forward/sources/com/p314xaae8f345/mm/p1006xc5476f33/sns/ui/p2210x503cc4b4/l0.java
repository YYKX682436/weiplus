package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4;

/* loaded from: classes4.dex */
public class l0 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i f251369d;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar) {
        this.f251369d = iVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onItemClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$33");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$33", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimelineClickListener", "unlike click");
        if (!(adapterView.getAdapter() instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.k)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TimelineClickListener", "unknown unlike adapter click");
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$33", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onItemClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$33");
            return;
        }
        ca4.j jVar = (ca4.j) view.getTag();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(jVar.f121487c);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar = this.f251369d;
        if (k17 == null) {
            try {
                iVar.H(view);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TimelineClickListener", "onUnLikeFinishError exp=" + e17.toString());
            }
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$33", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onItemClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$33");
            return;
        }
        ca4.i iVar2 = jVar.f121485a;
        if (i17 == 0) {
            if (k17.m70377x3172ed()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 s17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.s(iVar, k17);
                ((p34.p) ((p94.f0) i95.n0.c(p94.f0.class))).Bi(11855, k17.m70350x13c652ad(), 3, s17 == null ? "" : s17.f38105xcf532ea0, java.lang.Integer.valueOf(k17.m70350x13c652ad()));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.d dVar = iVar2.f121473b.f38084x2725a301;
            dVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hasReasonOptions", "com.tencent.mm.plugin.sns.storage.ADInfo$AdUnlikeInfo");
            boolean z17 = dVar.a().size() > 0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasReasonOptions", "com.tencent.mm.plugin.sns.storage.ADInfo$AdUnlikeInfo");
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.k kVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.k) adapterView.getAdapter();
                kVar.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stepForward", "com.tencent.mm.plugin.sns.ui.AdUnLikeReasonAdapter");
                kVar.f251129g++;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stepForward", "com.tencent.mm.plugin.sns.ui.AdUnLikeReasonAdapter");
                kVar.notifyDataSetChanged();
                adapterView.setOnItemClickListener(iVar.Q);
                iVar.F(view);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.c cVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.c();
                cVar.f247478d = 101;
                cVar.f247481g = jVar.f121489e;
                cVar.f247482h = 0L;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q2 q2Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q2(k17.f68891x29d1292e, 8, cVar);
                gm0.j1.i();
                gm0.j1.n().f354821b.g(q2Var);
            } else {
                if (iVar2.f121473b.f38094x6a99a254) {
                    yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$33", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onItemClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$33");
                    return;
                }
                iVar.G(view);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.c cVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.c();
                cVar2.f247481g = jVar.f121489e;
                cVar2.f247482h = java.lang.System.currentTimeMillis();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q2 q2Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q2(k17.f68891x29d1292e, 8, cVar2);
                gm0.j1.i();
                gm0.j1.n().f354821b.g(q2Var2);
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l lVar = iVar2.f121472a.f38173x6320bd96;
            if (lVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TimelineClickListener", "click feedback item but no report url");
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$33", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onItemClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$33");
                return;
            }
            int i18 = i17 - 1;
            if (i18 < ((java.util.LinkedList) lVar.f247572a).size()) {
                java.lang.String str = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m) ((java.util.LinkedList) lVar.f247572a).get(i18)).f247593d;
                try {
                    str = za4.z0.d(str, java.lang.String.format("snsid=%s", k17.m70371x485d7().Id), java.lang.String.format("aid=%s", k17.m70355xb5882a06()), java.lang.String.format("traceid=%s", k17.m70372xfe2dfcea()), java.lang.String.format("uin=%s", gm0.j1.b().j()));
                } catch (java.lang.Exception unused) {
                }
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", str);
                intent.putExtra("useJs", true);
                intent.putExtra("KPublisherId", "sns_" + ca4.z0.t0(k17.f68891x29d1292e));
                intent.putExtra("pre_username", k17.f68896xdde069b);
                intent.putExtra("prePublishId", "sns_" + ca4.z0.t0(k17.f68891x29d1292e));
                intent.putExtra("preUsername", k17.f68896xdde069b);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.D(intent, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.e(iVar));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$33", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onItemClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$33");
    }
}
