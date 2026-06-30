package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class ul extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm f196116d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f196117e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f196118f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f196119g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ul(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm hmVar, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, java.lang.String str) {
        super(0);
        this.f196116d = hmVar;
        this.f196117e = c1163xf1deaba4;
        this.f196118f = i17;
        this.f196119g = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        java.lang.String str2 = this.f196119g;
        java.lang.String str3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm.T1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm hmVar = this.f196116d;
        hmVar.getClass();
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = this.f196117e.mo7946xf939df19();
        bm2.a4 a4Var = mo7946xf939df19 instanceof bm2.a4 ? (bm2.a4) mo7946xf939df19 : null;
        if (a4Var != null) {
            a4Var.B(false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.p1526x373aa5.p1528x306930.C14279xd5b5745d c14279xd5b5745d = hmVar.f194367u;
        int i17 = c14279xd5b5745d.selectedTabIndex;
        java.util.List list = c14279xd5b5745d.f196289g;
        if (list == null || (str = (java.lang.String) list.get(i17)) == null) {
            str = "";
        }
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, str2);
        java.lang.String str4 = hmVar.f194364r;
        if (b17) {
            jz5.l C1 = hmVar.C1();
            java.util.List list2 = (java.util.List) C1.f384366d;
            java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) C1.f384367e;
            java.util.LinkedHashMap linkedHashMap2 = (java.util.LinkedHashMap) hmVar.y1(list2, linkedHashMap, false).f384367e;
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.Iterator it = linkedHashMap2.entrySet().iterator();
            while (it.hasNext()) {
                linkedList.add(new java.util.LinkedList((java.util.Collection) ((java.util.Map.Entry) it.next()).getValue()));
            }
            if (a4Var != null) {
                int mo1894x7e414b06 = a4Var.mo1894x7e414b06();
                a4Var.E(list2, this.f196118f, linkedList, false);
                int mo1894x7e414b062 = a4Var.mo1894x7e414b06();
                int i18 = mo1894x7e414b062 - mo1894x7e414b06;
                ae2.in inVar = ae2.in.f85221a;
                boolean z17 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.H0).mo141623x754a37bb()).r()).intValue() == 1;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[applyLoadMoreResultToAdapter] giftCache:");
                sb6.append(list2.size());
                sb6.append(", eachPage:");
                sb6.append(linkedList.size());
                sb6.append(", tabGifts:");
                java.util.List list3 = (java.util.List) linkedHashMap.get(str2);
                sb6.append(list3 != null ? list3.size() : 0);
                sb6.append(", oldCount:");
                sb6.append(mo1894x7e414b06);
                sb6.append(", newCount:");
                sb6.append(mo1894x7e414b062);
                sb6.append(", added:");
                sb6.append(i18);
                sb6.append(", optEnabled:");
                sb6.append(z17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, sb6.toString());
                if (!z17 || i18 <= 0) {
                    a4Var.m8146xced61ae5();
                } else {
                    a4Var.m8153xd399a4d9(mo1894x7e414b06, i18);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm.Q1(hmVar, str2, true, 0, i18, android.os.SystemClock.uptimeMillis() - uptimeMillis, false, 32, null);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "[applyLoadMoreResultToAdapter] tab changed, skip update. current:" + str + ", loaded:" + str2);
            hmVar.P1(str2, true, 0, 0, 0L, true);
        }
        return jz5.f0.f384359a;
    }
}
