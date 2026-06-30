package zd4;

/* loaded from: classes4.dex */
public class m implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f553171d;

    public m(java.lang.ref.WeakReference weakReference) {
        this.f553171d = weakReference;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSceneEnd", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$BaseSelectVisibleRangeNetCallback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "dz:[onSceneEnd]errType:%d errCode:%d errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        java.lang.ref.WeakReference weakReference = this.f553171d;
        if (weakReference == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "[onSceneEnd] WeakRef null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSceneEnd", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$BaseSelectVisibleRangeNetCallback");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2223xf2e0c00b.AbstractActivityC18396x51e3f06c abstractActivityC18396x51e3f06c = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2223xf2e0c00b.AbstractActivityC18396x51e3f06c) weakReference.get();
        if (abstractActivityC18396x51e3f06c == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "[onSceneEnd] activity null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSceneEnd", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$BaseSelectVisibleRangeNetCallback");
            return;
        }
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2223xf2e0c00b.AbstractActivityC18396x51e3f06c.D;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        boolean z17 = abstractActivityC18396x51e3f06c.f252220u;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSceneEnd", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$BaseSelectVisibleRangeNetCallback");
            return;
        }
        int mo808xfb85f7b0 = m1Var.mo808xfb85f7b0();
        if (mo808xfb85f7b0 != 290) {
            if (mo808xfb85f7b0 != 635) {
                if (mo808xfb85f7b0 == 638) {
                    if (i17 == 0 && i18 == 0) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1300", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1300", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
                        throw null;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2223xf2e0c00b.AbstractActivityC18396x51e3f06c.U6(abstractActivityC18396x51e3f06c);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "dz: error at modify label list!");
                }
            } else if (i17 == 0 && i18 == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1000", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1000", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1100", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addContactToLabels", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
                java.util.ArrayList arrayList = abstractActivityC18396x51e3f06c.B;
                if (arrayList != null && arrayList.size() != 0) {
                    abstractActivityC18396x51e3f06c.B.iterator();
                    throw null;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addContactToLabels", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1100", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2223xf2e0c00b.AbstractActivityC18396x51e3f06c.U6(abstractActivityC18396x51e3f06c);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "dz: error at add contact label!");
            }
        } else if (i17 == 0 && i18 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "[onSceneEnd] delete tag list success");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "dz: error at delete tag list!");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSceneEnd", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$BaseSelectVisibleRangeNetCallback");
    }
}
