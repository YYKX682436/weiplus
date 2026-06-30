package com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui;

/* loaded from: classes12.dex */
public class d3 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11497x3bc191a f156068d;

    public d3(com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11497x3bc191a activityC11497x3bc191a) {
        this.f156068d = activityC11497x3bc191a;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        int i18;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/address/ui/WalletSelectAddrUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        int headerViewsCount = i17 - this.f156068d.f156026i.getHeaderViewsCount();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSelectAddrUI", "select pos " + headerViewsCount);
        synchronized (this.f156068d.f156030p) {
            if (headerViewsCount < ((java.util.LinkedList) this.f156068d.f156021d).size()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11497x3bc191a activityC11497x3bc191a = this.f156068d;
                activityC11497x3bc191a.f156024g = (s71.b) ((java.util.LinkedList) activityC11497x3bc191a.f156021d).get(headerViewsCount);
                com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11497x3bc191a activityC11497x3bc191a2 = this.f156068d;
                if (activityC11497x3bc191a2.f156035u) {
                    android.content.Intent intent = new android.content.Intent();
                    s71.b bVar = this.f156068d.f156024g;
                    if (bVar != null) {
                        try {
                            intent.putExtra("launch_from_select_addr", bVar.mo14344x5f01b1f6());
                        } catch (java.io.IOException e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletSelectAddrUI", "isLaunchFromSelectAddr error:" + e17.getMessage());
                        }
                    }
                    this.f156068d.setResult(-1, intent);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSelectAddrUI", "[setResult] OK, selected address!");
                    this.f156068d.finish();
                } else if (activityC11497x3bc191a2.f156032r || activityC11497x3bc191a2.f156034t || activityC11497x3bc191a2.f156024g == null || activityC11497x3bc191a2.f156023f) {
                    s71.b bVar2 = activityC11497x3bc191a2.f156024g;
                    if (bVar2 != null && (i18 = bVar2.f485503d) != 0) {
                        this.f156068d.f156027m.b(new q71.q(i18), true);
                    }
                } else {
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("enter_scene_address", java.lang.Integer.valueOf(this.f156068d.f156036v));
                    hashMap.put("page_state", java.lang.Integer.valueOf(this.f156068d.f156038x ? 2 : 1));
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("select_address", "view_clk", hashMap, 33328);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11497x3bc191a activityC11497x3bc191a3 = this.f156068d;
                    activityC11497x3bc191a3.U6(activityC11497x3bc191a3.f156024g.f485503d, 1);
                }
            }
        }
        this.f156068d.f156025h.notifyDataSetChanged();
        yj0.a.h(this, "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
