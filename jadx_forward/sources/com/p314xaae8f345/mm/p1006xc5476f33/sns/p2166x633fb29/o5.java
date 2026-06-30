package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class o5 implements com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f246082a = new java.util.HashMap();

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.o5 o5Var, int i17) {
        boolean z17;
        long j17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.model.SnsExtCache");
        o5Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pushImp", "com.tencent.mm.plugin.sns.model.SnsExtCache");
        java.util.HashMap hashMap = o5Var.f246082a;
        if (hashMap == null || hashMap.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsExtCache", "nothing need to pushto snsext");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pushImp", "com.tencent.mm.plugin.sns.model.SnsExtCache");
        } else {
            java.lang.System.currentTimeMillis();
            if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.aj() != null) {
                j17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.aj().F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
                z17 = true;
            } else {
                z17 = false;
                j17 = 0;
            }
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.Iterator it = hashMap.keySet().iterator();
            while (it.hasNext()) {
                linkedList.add((java.lang.String) it.next());
                if (linkedList.size() >= i17) {
                    break;
                }
            }
            java.util.Iterator it6 = linkedList.iterator();
            while (it6.hasNext()) {
                java.lang.String str = (java.lang.String) it6.next();
                if (hashMap.containsKey(str) && !com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Xj()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Ej().n1((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.d2) hashMap.get(str));
                    hashMap.remove(str);
                }
            }
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.aj().w(java.lang.Long.valueOf(j17));
            }
            java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pushImp", "com.tencent.mm.plugin.sns.model.SnsExtCache");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.model.SnsExtCache");
    }
}
