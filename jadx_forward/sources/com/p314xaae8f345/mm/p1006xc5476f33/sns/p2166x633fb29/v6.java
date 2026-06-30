package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class v6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f246255d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.w6 f246256e;

    public v6(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.w6 w6Var, java.util.List list) {
        this.f246256e = w6Var;
        this.f246255d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager$4");
        java.util.List list = this.f246255d;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.w6 w6Var = this.f246256e;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(w6Var.f246272a.f525820d)) {
                long longValue = ((java.lang.Long) list.get(0)).longValue();
                long longValue2 = ((java.lang.Long) list.get(list.size() - 1)).longValue();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = w6Var.f246272a.f525820d.iterator();
                while (it.hasNext()) {
                    wa4.w wVar = (wa4.w) it.next();
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(wVar.f525823d)) {
                        java.util.Iterator it6 = wVar.f525823d.iterator();
                        while (it6.hasNext()) {
                            java.lang.Long l17 = (java.lang.Long) it6.next();
                            if (l17.longValue() < longValue && l17.longValue() > longValue2) {
                                arrayList.add(l17);
                            }
                        }
                    }
                }
                java.util.Iterator it7 = arrayList.iterator();
                while (it7.hasNext()) {
                    java.lang.Long l18 = (java.lang.Long) it7.next();
                    if (!list.contains(l18)) {
                        long longValue3 = l18.longValue();
                        w6Var.getClass();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeFeed", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUnreadTipManager", "removeFeed:%s", java.lang.Long.valueOf(longValue3));
                        wa4.v vVar = w6Var.f246272a;
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(vVar.f525820d)) {
                            java.util.Iterator it8 = vVar.f525820d.iterator();
                            while (it8.hasNext()) {
                                wa4.w wVar2 = (wa4.w) it8.next();
                                wVar2.f525823d.remove(java.lang.Long.valueOf(longValue3));
                                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(wVar2.f525823d)) {
                                    it8.remove();
                                    if (wVar2 == w6Var.f246273b) {
                                        w6Var.f246273b = null;
                                    }
                                }
                            }
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeFeed", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager$4");
    }
}
