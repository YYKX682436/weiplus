package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4;

/* loaded from: classes4.dex */
public class m0 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i f251371d;

    public m0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar) {
        this.f251371d = iVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onItemClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$34");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$34", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        if (view.getTag() != null && (view.getTag() instanceof ca4.j)) {
            ca4.j jVar = (ca4.j) view.getTag();
            if (i17 < jVar.f121485a.f121473b.f38084x2725a301.a().size()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 c17902x72cc1771 = jVar.f121485a.f121473b;
                if (c17902x72cc1771.f38094x6a99a254) {
                    yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$34", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onItemClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$34");
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.c cVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.c) c17902x72cc1771.f38084x2725a301.a().get(i17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimelineClickListener", "unlike item click, reason=%s, id=%s", cVar.f247475a, java.lang.Integer.valueOf(cVar.f247478d));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(jVar.f121487c);
                if (k17 == null) {
                    yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$34", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onItemClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$34");
                    return;
                }
                this.f251371d.G(view);
                cVar.f247481g = jVar.f121489e;
                cVar.f247482h = java.lang.System.currentTimeMillis();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q2 q2Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q2(k17.f68891x29d1292e, 8, cVar);
                gm0.j1.i();
                gm0.j1.n().f354821b.g(q2Var);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$34", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onItemClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$34");
    }
}
