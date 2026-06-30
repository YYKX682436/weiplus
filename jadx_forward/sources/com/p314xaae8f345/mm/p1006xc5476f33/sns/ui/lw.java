package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class lw implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw f251412d;

    public lw(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw kwVar) {
        this.f251412d = kwVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.py pyVar;
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.b8 b8Var;
        java.lang.String str3;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$10");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() == null || !(view.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.py) || (pyVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.py) view.getTag()) == null) {
            str = "onClick";
            str2 = "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$10";
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k7 k7Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k7.f245900a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clickWsFriendFeed", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
            java.lang.String str4 = pyVar.f251818a;
            long j17 = pyVar.f251819b;
            if (android.text.TextUtils.isEmpty(str4)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsWsFoldManager", "[clickWsFriendFeed] userName empty and return function");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clickWsFriendFeed", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
                str = "onClick";
                str2 = "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$10";
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str4);
                java.lang.String d17 = k7Var.d(str4);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k7.f245901b;
                java.lang.String string = o4Var2.getString(d17, "");
                if (android.text.TextUtils.isEmpty(string)) {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsWsFoldManager", "userName=" + str4 + ", first clickWsFriendFeed and record, now = " + currentTimeMillis);
                    long j18 = pyVar.f251819b;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.model.WsFoldData");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.model.WsFoldData");
                    o4Var2.D(d17, str4 + ",-1," + currentTimeMillis + ",1," + j18 + ",1");
                    str = "onClick";
                    str2 = "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$10";
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.b8 a17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.b8.f245635g.a(string);
                    str = "onClick";
                    str2 = "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$10";
                    long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("userName=");
                    sb6.append(str4);
                    sb6.append(", second clickWsFriendFeed and record, now = ");
                    sb6.append(currentTimeMillis2);
                    sb6.append(", lastClickFeedTime = ");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLastClickFeedTime", "com.tencent.mm.plugin.sns.model.WsFoldData");
                    long j19 = a17.f245638c;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLastClickFeedTime", "com.tencent.mm.plugin.sns.model.WsFoldData");
                    sb6.append(j19);
                    sb6.append(" , secondClickWsFriendFeedTimeInterval = ");
                    long j27 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k7.f245903d;
                    sb6.append(j27);
                    sb6.append(" ,origin clickFeedCount = ");
                    sb6.append(a17.a());
                    sb6.append(", lastUnFoldTime = ");
                    sb6.append(a17.b());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsWsFoldManager", sb6.toString());
                    int a18 = a17.a();
                    int i18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k7.f245902c;
                    if (a18 == i18) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLastClickFeedTime", "com.tencent.mm.plugin.sns.model.WsFoldData");
                        i17 = i18;
                        long j28 = a17.f245638c;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLastClickFeedTime", "com.tencent.mm.plugin.sns.model.WsFoldData");
                        if (currentTimeMillis2 - j28 < j27) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clickWsFriendFeed", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
                            pyVar = pyVar;
                        }
                    } else {
                        i17 = i18;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLastClickFeedTime", "com.tencent.mm.plugin.sns.model.WsFoldData");
                    long j29 = a17.f245638c;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLastClickFeedTime", "com.tencent.mm.plugin.sns.model.WsFoldData");
                    if (currentTimeMillis2 - j29 > j27) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsWsFoldManager", "now - lastClickFeedTime timeout, reset clickFeedCount = 1");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setClickFeedCount", "com.tencent.mm.plugin.sns.model.WsFoldData");
                        a17.f245639d = 1;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setClickFeedCount", "com.tencent.mm.plugin.sns.model.WsFoldData");
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsWsFoldManager", "clickFeedCount++ and record, current clickFeedCount = " + a17.a());
                        int a19 = a17.a() + 1;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setClickFeedCount", "com.tencent.mm.plugin.sns.model.WsFoldData");
                        a17.f245639d = a19;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setClickFeedCount", "com.tencent.mm.plugin.sns.model.WsFoldData");
                        if (a17.a() == i17) {
                            a17.c(currentTimeMillis2);
                            java.lang.String h17 = ca4.z0.h(c01.id.c());
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsWsFoldManager", "[clickWsFriendFeed] report27795 groupId = " + j17 + ", userName = " + str4 + ", session = " + h17);
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                            java.lang.Long valueOf = java.lang.Long.valueOf(j17);
                            b8Var = a17;
                            str3 = "com.tencent.mm.plugin.sns.model.WsFoldData";
                            o4Var = o4Var2;
                            g0Var.d(27795, 1, valueOf, str4, h17, 1, 1);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLastClickFeedTime", str3);
                            b8Var.f245638c = currentTimeMillis2;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLastClickFeedTime", str3);
                            pyVar = pyVar;
                            b8Var.e(pyVar.f251819b);
                            b8Var.d(1);
                            o4Var.D(d17, b8Var.m70023x9616526c());
                        }
                    }
                    b8Var = a17;
                    str3 = "com.tencent.mm.plugin.sns.model.WsFoldData";
                    o4Var = o4Var2;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLastClickFeedTime", str3);
                    b8Var.f245638c = currentTimeMillis2;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLastClickFeedTime", str3);
                    pyVar = pyVar;
                    b8Var.e(pyVar.f251819b);
                    b8Var.d(1);
                    o4Var.D(d17, b8Var.m70023x9616526c());
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clickWsFriendFeed", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw kwVar = this.f251412d;
            android.content.Intent intent = new android.content.Intent(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.b(kwVar), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18144x3e20023a.class);
            intent.putExtra("key_ws_group_id", pyVar.f251819b);
            intent.putExtra("key_ws_detail_max_id", pyVar.f251820c);
            intent.putExtra("key_ws_detail_min_id", pyVar.f251821d);
            intent.putExtra("key_ws_detail_username", pyVar.f251818a);
            java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList<>();
            java.util.List list = pyVar.f251822e;
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                arrayList2.add(ca4.z0.s0(((java.lang.Long) it.next()).longValue()));
            }
            intent.putStringArrayListExtra("key_ws_str_sns_id_list", arrayList2);
            android.content.Context b17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.b(kwVar);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(intent);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(b17, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$10", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            b17.startActivity((android.content.Intent) arrayList3.get(0));
            yj0.a.f(b17, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$10", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0 s0Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0;
            s0Var.i(list, pyVar.f251819b, pyVar.f251818a);
            s0Var.V(pyVar.f251819b, true);
        }
        java.lang.String str5 = str;
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$10", "android/view/View$OnClickListener", str5, "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str5, str2);
    }
}
