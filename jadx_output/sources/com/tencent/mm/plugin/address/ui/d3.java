package com.tencent.mm.plugin.address.ui;

/* loaded from: classes12.dex */
public class d3 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.WalletSelectAddrUI f74535d;

    public d3(com.tencent.mm.plugin.address.ui.WalletSelectAddrUI walletSelectAddrUI) {
        this.f74535d = walletSelectAddrUI;
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
        int headerViewsCount = i17 - this.f74535d.f74493i.getHeaderViewsCount();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSelectAddrUI", "select pos " + headerViewsCount);
        synchronized (this.f74535d.f74497p) {
            if (headerViewsCount < ((java.util.LinkedList) this.f74535d.f74488d).size()) {
                com.tencent.mm.plugin.address.ui.WalletSelectAddrUI walletSelectAddrUI = this.f74535d;
                walletSelectAddrUI.f74491g = (s71.b) ((java.util.LinkedList) walletSelectAddrUI.f74488d).get(headerViewsCount);
                com.tencent.mm.plugin.address.ui.WalletSelectAddrUI walletSelectAddrUI2 = this.f74535d;
                if (walletSelectAddrUI2.f74502u) {
                    android.content.Intent intent = new android.content.Intent();
                    s71.b bVar = this.f74535d.f74491g;
                    if (bVar != null) {
                        try {
                            intent.putExtra("launch_from_select_addr", bVar.toByteArray());
                        } catch (java.io.IOException e17) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.WalletSelectAddrUI", "isLaunchFromSelectAddr error:" + e17.getMessage());
                        }
                    }
                    this.f74535d.setResult(-1, intent);
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletSelectAddrUI", "[setResult] OK, selected address!");
                    this.f74535d.finish();
                } else if (walletSelectAddrUI2.f74499r || walletSelectAddrUI2.f74501t || walletSelectAddrUI2.f74491g == null || walletSelectAddrUI2.f74490f) {
                    s71.b bVar2 = walletSelectAddrUI2.f74491g;
                    if (bVar2 != null && (i18 = bVar2.f403970d) != 0) {
                        this.f74535d.f74494m.b(new q71.q(i18), true);
                    }
                } else {
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("enter_scene_address", java.lang.Integer.valueOf(this.f74535d.f74503v));
                    hashMap.put("page_state", java.lang.Integer.valueOf(this.f74535d.f74505x ? 2 : 1));
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("select_address", "view_clk", hashMap, 33328);
                    com.tencent.mm.plugin.address.ui.WalletSelectAddrUI walletSelectAddrUI3 = this.f74535d;
                    walletSelectAddrUI3.U6(walletSelectAddrUI3.f74491g.f403970d, 1);
                }
            }
        }
        this.f74535d.f74492h.notifyDataSetChanged();
        yj0.a.h(this, "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
