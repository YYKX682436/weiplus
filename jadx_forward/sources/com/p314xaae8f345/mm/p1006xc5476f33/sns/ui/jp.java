package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes.dex */
public class jp implements com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.lp {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f251067a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f251068b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.u3 f251069c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f251070d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsSettingUI f251071e;

    public jp(com.tencent.mm.plugin.sns.ui.SnsSettingUI snsSettingUI, java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var, java.util.List list, java.lang.Object obj) {
        this.f251071e = snsSettingUI;
        this.f251067a = "";
        this.f251068b = null;
        this.f251069c = null;
        this.f251070d = null;
        this.f251067a = str;
        this.f251069c = u3Var;
        this.f251068b = list;
        this.f251070d = obj;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.lp
    public java.lang.String a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ChoiceItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ChoiceItem");
        return this.f251067a;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.lp
    public void b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showAlert", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ChoiceItem");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        int i17 = 0;
        while (true) {
            java.util.List list = this.f251068b;
            if (i17 >= list.size()) {
                db5.e1.b(this.f251071e, "", linkedList, linkedList2, "", new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ip(this));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showAlert", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ChoiceItem");
                return;
            } else {
                linkedList.add((java.lang.String) list.get(i17));
                linkedList2.add(java.lang.Integer.valueOf(i17));
                i17++;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.lp
    /* renamed from: value */
    public java.lang.String mo71141x6ac9171() {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("value", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ChoiceItem");
        java.lang.Object obj = this.f251070d;
        boolean z17 = obj instanceof int[];
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = this.f251069c;
        int i17 = 0;
        java.util.List list = this.f251068b;
        if (z17) {
            if (gm0.j1.a()) {
                int r17 = gm0.j1.u().c().r(u3Var, 0);
                str = (java.lang.String) list.get(0);
                while (true) {
                    if (i17 < ((int[]) obj).length) {
                        if (r17 == ((int[]) obj)[i17] && i17 < list.size()) {
                            str = (java.lang.String) list.get(i17);
                            break;
                        }
                        i17++;
                    } else {
                        break;
                    }
                }
            }
            str = "";
        } else {
            if ((obj instanceof long[]) && gm0.j1.a()) {
                long t17 = gm0.j1.u().c().t(u3Var, 0L);
                java.lang.String str2 = (java.lang.String) list.get(0);
                while (true) {
                    if (i17 >= ((long[]) obj).length) {
                        str = str2;
                        break;
                    }
                    if (t17 == ((long[]) obj)[i17] && i17 < list.size()) {
                        str = (java.lang.String) list.get(i17);
                        break;
                    }
                    i17++;
                }
            }
            str = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("value", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ChoiceItem");
        return str;
    }
}
