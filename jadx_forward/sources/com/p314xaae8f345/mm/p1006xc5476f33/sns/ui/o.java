package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f251593a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f251594b;

    public o() {
        this.f251593a = null;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f251594b = linkedList;
        this.f251593a = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Tj();
        linkedList.clear();
    }

    public void a(boolean z17) {
        boolean z18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initData", "com.tencent.mm.plugin.sns.ui.AdapterLoader");
        int i17 = !z17 ? 1 : 0;
        java.util.List list = this.f251594b;
        if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTypeNum", "com.tencent.mm.plugin.sns.ui.AdapterLoader");
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTypeNum", "com.tencent.mm.plugin.sns.ui.AdapterLoader");
                    z18 = false;
                    break;
                } else if (((java.lang.Integer) it.next()).intValue() == i17) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTypeNum", "com.tencent.mm.plugin.sns.ui.AdapterLoader");
                    z18 = true;
                    break;
                }
            }
            if (z18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdapterLoader", "thread is loading ui should be not load any");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initData", "com.tencent.mm.plugin.sns.ui.AdapterLoader");
                return;
            }
        }
        if (z17) {
            ((java.util.LinkedList) list).size();
        }
        java.util.LinkedList linkedList = (java.util.LinkedList) list;
        if (linkedList.size() > 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initData", "com.tencent.mm.plugin.sns.ui.AdapterLoader");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addType", "com.tencent.mm.plugin.sns.ui.AdapterLoader");
        linkedList.add(java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addType", "com.tencent.mm.plugin.sns.ui.AdapterLoader");
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Uj().mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l(this, z17));
        } else {
            java.util.List b17 = b();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("notifyInUI", "com.tencent.mm.plugin.sns.ui.AdapterLoader");
            this.f251593a.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.m(this, b17, true));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notifyInUI", "com.tencent.mm.plugin.sns.ui.AdapterLoader");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initData", "com.tencent.mm.plugin.sns.ui.AdapterLoader");
    }

    public abstract java.util.List b();

    public abstract void c(java.util.List list);
}
