package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class ft implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18127xe071a342 f249892d;

    public ft(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18127xe071a342 c18127xe071a342) {
        this.f249892d = c18127xe071a342;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.SnsUIAction$13");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.e2 Ej = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Ej();
        java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18127xe071a342.d(this.f249892d);
        Ej.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsUserDateInfo", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        java.util.LinkedList<r45.yb6> linkedList = Ej.J0(d17).v0().f452193d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsUserDateInfo", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        ca4.r0 r0Var = new ca4.r0();
        boolean L0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList);
        java.util.ArrayList arrayList = r0Var.f121542a;
        java.util.ArrayList arrayList2 = r0Var.f121543b;
        if (!L0) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.HashMap hashMap = new java.util.HashMap();
            java.lang.String str = "";
            for (r45.yb6 yb6Var : linkedList) {
                java.lang.String valueOf = java.lang.String.valueOf(yb6Var.f472482d);
                java.lang.String valueOf2 = java.lang.String.valueOf(yb6Var.f472483e);
                java.lang.Long valueOf3 = java.lang.Long.valueOf(yb6Var.f472484f);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str, valueOf)) {
                    arrayList3 = new java.util.ArrayList();
                    hashMap = new java.util.HashMap();
                    arrayList.add(valueOf);
                    arrayList2.add(arrayList3);
                    ((java.util.HashMap) r0Var.f121544c).put(valueOf, hashMap);
                    str = valueOf;
                }
                arrayList3.add(valueOf2);
                hashMap.put(valueOf2, valueOf3);
            }
        }
        java.util.Collections.reverse(arrayList);
        java.util.Collections.reverse(arrayList2);
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            java.util.Collections.reverse((java.util.List) it.next());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Tj().mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.et(this, r0Var));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.SnsUIAction$13");
    }
}
