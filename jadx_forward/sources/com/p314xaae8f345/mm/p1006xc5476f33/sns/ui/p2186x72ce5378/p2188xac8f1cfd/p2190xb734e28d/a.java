package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2190xb734e28d;

/* loaded from: classes4.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2190xb734e28d.e f250344d;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2190xb734e28d.e eVar, int i17, int i18) {
        this.f250344d = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2190xb734e28d.a aVar;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262;
        java.lang.String str5;
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle$getNotifyView$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/component/header/HeaderErrorPostHandle$getNotifyView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.ViewParent parent = view.getParent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ((android.view.ViewGroup) parent).removeView(view);
        java.lang.String str6 = "(Landroid/view/View;)V";
        java.lang.String str7 = "android/view/View$OnClickListener";
        java.lang.String str8 = "com/tencent/mm/plugin/sns/ui/improve/component/header/HeaderErrorPostHandle$getNotifyView$1";
        if (view.getTag() instanceof java.lang.String) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getContext$p", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2190xb734e28d.e eVar = this.f250344d;
            android.content.Context context = eVar.f250369d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getContext$p", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle");
            if (context != null) {
                java.lang.Object tag = view.getTag();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type kotlin.String");
                java.lang.String str9 = (java.lang.String) tag;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.ErrorPost", "sns Header tag:".concat(str9));
                android.content.Intent intent = new android.content.Intent();
                com.p314xaae8f345.mm.p2493x1bc889d6.C19769x48b92ec c19769x48b92ec = new com.p314xaae8f345.mm.p2493x1bc889d6.C19769x48b92ec();
                if (r26.i0.y(str9, "feed_", false)) {
                    str5 = str9.substring(5);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str5, "substring(...)");
                    c17933xe8d1b2262 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(str5);
                    str2 = "android/view/View$OnClickListener";
                    str3 = "com/tencent/mm/plugin/sns/ui/improve/component/header/HeaderErrorPostHandle$getNotifyView$1";
                    str4 = str9;
                } else {
                    if (r26.i0.y(str9, "comment_", false)) {
                        java.lang.String substring = str9.substring(8);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(substring, -1);
                        intent.putExtra("INTENT_ERROR_OPTIME", P);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i4 xj6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.xj();
                        xj6.getClass();
                        str2 = "android/view/View$OnClickListener";
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getByOpTime", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
                        java.util.Iterator it = xj6.f245831a.f525783m.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                str3 = str8;
                                str4 = str9;
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getByOpTime", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
                                z17 = false;
                                break;
                            }
                            java.util.Iterator it6 = it;
                            wa4.n nVar = (wa4.n) it.next();
                            str3 = str8;
                            if (P == nVar.f525799e) {
                                str4 = str9;
                                c19769x48b92ec.f38866x6ac9171 = nVar.f525798d;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAsyncQueueMgr", "getByOpTime find %s", java.lang.Integer.valueOf(P));
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getByOpTime", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
                                z17 = true;
                                break;
                            }
                            str8 = str3;
                            it = it6;
                        }
                        if (z17) {
                            c17933xe8d1b226 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().W0(c19769x48b92ec.f38866x6ac9171);
                            intent.putExtra("INTENT_SNSID", c19769x48b92ec.f38866x6ac9171);
                            c17933xe8d1b2262 = c17933xe8d1b226;
                            str5 = "";
                        }
                    } else {
                        str2 = "android/view/View$OnClickListener";
                        str3 = "com/tencent/mm/plugin/sns/ui/improve/component/header/HeaderErrorPostHandle$getNotifyView$1";
                        str4 = str9;
                    }
                    c17933xe8d1b226 = null;
                    c17933xe8d1b2262 = c17933xe8d1b226;
                    str5 = "";
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getContext$p", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getContext$p", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle");
                intent.setClass(eVar.f250369d, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18022x27bfedac.class);
                if (c17933xe8d1b2262 == null || c17933xe8d1b2262.m70374x6bf53a6c() == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c17933xe8d1b2262.m70374x6bf53a6c(), "")) {
                    if (r26.i0.y(str4, "comment_", false)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i4 xj7 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.xj();
                        xj7.getClass();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeAllErrorComments", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAsyncQueueMgr", "removeAllErrorComments");
                        xj7.f245831a.f525783m.clear();
                        if (!xj7.r()) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsAsyncQueueMgr", "removeAllErrorComments error listToFile");
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeAllErrorComments", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
                        eVar.a();
                    }
                    yj0.a.h(this, str3, str2, "onClick", "(Landroid/view/View;)V");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle$getNotifyView$1");
                    return;
                }
                intent.putExtra("INTENT_TALKER", c17933xe8d1b2262.m70374x6bf53a6c());
                intent.putExtra("INTENT_SNS_LOCAL_ID", str5);
                intent.putExtra("INTENT_FROMGALLERY", true);
                m21.w.d(726);
                c17933xe8d1b2262.m70357x3fdd41df();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getContext$p", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle");
                android.content.Context context2 = eVar.f250369d;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getContext$p", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(context2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/improve/component/header/HeaderErrorPostHandle$getNotifyView$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context2.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(context2, "com/tencent/mm/plugin/sns/ui/improve/component/header/HeaderErrorPostHandle$getNotifyView$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                try {
                    com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd = new r45.kj4().mo11468x92b714fd(c17933xe8d1b2262.f68888x5d40d76e);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo11468x92b714fd, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MediaPostInfo");
                    r45.kj4 kj4Var = (r45.kj4) mo11468x92b714fd;
                    int i17 = kj4Var.f460286s;
                    if (i17 == 201 || i17 == 210 || i17 != 211) {
                        kj4Var.G = true;
                        c17933xe8d1b2262.m70455x99ecb2f1(kj4Var.mo14344x5f01b1f6());
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().w3(c17933xe8d1b2262.f38324x142bbdc6, c17933xe8d1b2262);
                        eVar.a();
                    }
                } catch (java.lang.Exception unused) {
                }
                aVar = this;
                str = "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle$getNotifyView$1";
                str6 = "(Landroid/view/View;)V";
                str7 = str2;
                str8 = str3;
                yj0.a.h(aVar, str8, str7, "onClick", str6);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", str);
            }
        }
        aVar = this;
        str = "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle$getNotifyView$1";
        yj0.a.h(aVar, str8, str7, "onClick", str6);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", str);
    }
}
