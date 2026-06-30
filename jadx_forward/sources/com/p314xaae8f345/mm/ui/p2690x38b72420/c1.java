package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class c1 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22292xa218e7a1 f288171d;

    public c1(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22292xa218e7a1 activityC22292xa218e7a1) {
        this.f288171d = activityC22292xa218e7a1;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.lang.String str;
        java.lang.String str2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/ChatroomContactUI$8", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22292xa218e7a1 activityC22292xa218e7a1 = this.f288171d;
        yk5.u uVar = activityC22292xa218e7a1.f287879n;
        java.lang.Object obj = uVar;
        if (uVar != null) {
            obj = java.lang.Boolean.valueOf(uVar.f544447x);
        }
        java.util.Objects.toString(obj);
        java.lang.String str3 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V";
        if (i17 < activityC22292xa218e7a1.f287872d.getHeaderViewsCount()) {
            yj0.a.h(this, "com/tencent/mm/ui/contact/ChatroomContactUI$8", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        int headerViewsCount = i17 - activityC22292xa218e7a1.f287872d.getHeaderViewsCount();
        yk5.u uVar2 = activityC22292xa218e7a1.f287879n;
        if (uVar2 == null || !uVar2.f544447x) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.z3) activityC22292xa218e7a1.f287878m.getItem(headerViewsCount);
            if (z3Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatroomContactUI", "position=%s cont is null", java.lang.Integer.valueOf(headerViewsCount));
                yj0.a.h(this, "com/tencent/mm/ui/contact/ChatroomContactUI$8", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.q4(z3Var.d1())) {
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6800x63c0d5b8 c6800x63c0d5b8 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6800x63c0d5b8();
                c6800x63c0d5b8.p(z3Var.d1());
                c6800x63c0d5b8.f141319e = 2L;
                c6800x63c0d5b8.k();
            }
            java.lang.String d17 = z3Var.d1();
            if (d17 != null && d17.length() > 0) {
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.k4(d17)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatroomContactUI", "error, 4.5 do not contain this contact %s", d17);
                } else {
                    android.content.Intent intent = new android.content.Intent(activityC22292xa218e7a1.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a.class);
                    intent.putExtra("Chat_User", d17);
                    intent.putExtra("Chat_Mode", 1);
                    intent.putExtra("finish_direct", true);
                    intent.putExtra("specific_chat_from_scene", 10);
                    intent.putExtra("chat_from_scene_for_group_chats", 4);
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC22292xa218e7a1.mo55332x76847179();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(intent);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(mo55332x76847179, arrayList2.toArray(), "com/tencent/mm/ui/contact/ChatroomContactUI", "dealSelectContact", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    mo55332x76847179.startActivity((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(mo55332x76847179, "com/tencent/mm/ui/contact/ChatroomContactUI", "dealSelectContact", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            }
            yj0.a.h(this, "com/tencent/mm/ui/contact/ChatroomContactUI$8", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        boolean p17 = uVar2.p(headerViewsCount);
        if (activityC22292xa218e7a1.f287879n.v(headerViewsCount)) {
            yk5.u uVar3 = activityC22292xa218e7a1.f287879n;
            a31.v vVar = activityC22292xa218e7a1.f287876h;
            java.lang.String g17 = vVar != null ? vVar.g() : "";
            uVar3.getClass();
            uVar3.x(new yk5.o(uVar3, g17));
            str = "onItemClick";
        } else if (p17) {
            r45.gw5 u17 = activityC22292xa218e7a1.f287879n.u(headerViewsCount);
            java.lang.String str4 = u17.f457094d.f454289d;
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(str4, true);
            if (n17.r2()) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("Contact_User", str4);
                intent2.putExtra("Contact_Scene", 3);
                if (str4 != null && str4.length() > 0) {
                    if (n17.k2()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(10298, str4.concat(",3"));
                    }
                    com.p314xaae8f345.mm.ui.p2690x38b72420.g1.c(intent2, str4);
                    j45.l.j(activityC22292xa218e7a1, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent2, null);
                }
                str2 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V";
                str = "onItemClick";
            } else {
                android.content.Intent intent3 = new android.content.Intent();
                intent3.putExtra("Contact_User", u17.f457094d.f454289d);
                intent3.putExtra("Contact_Alias", u17.f457107t);
                intent3.putExtra("Contact_Nick", u17.f457095e.f454289d);
                intent3.putExtra("Contact_Signature", u17.f457102o);
                str2 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V";
                intent3.putExtra("Contact_RegionCode", com.p314xaae8f345.mm.p2621x8fb0427b.ha.q(u17.A, u17.f457100m, u17.f457101n));
                intent3.putExtra("Contact_Sex", u17.f457098h);
                intent3.putExtra("Contact_VUser_Info", u17.f457105r);
                intent3.putExtra("Contact_VUser_Info_Flag", u17.f457104q);
                intent3.putExtra("Contact_KWeibo_flag", u17.f457109v);
                intent3.putExtra("Contact_KWeibo", u17.f457106s);
                intent3.putExtra("Contact_KWeiboNick", u17.f457108u);
                intent3.putExtra("Contact_KSnsIFlag", u17.f457113z.f452961d);
                str = "onItemClick";
                intent3.putExtra("Contact_KSnsBgId", u17.f457113z.f452963f);
                intent3.putExtra("Contact_KSnsBgUrl", u17.f457113z.f452962e);
                r45.va0 va0Var = u17.C;
                if (va0Var != null) {
                    try {
                        intent3.putExtra("Contact_customInfo", va0Var.mo14344x5f01b1f6());
                    } catch (java.io.IOException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChatroomContactUI", e17, "", new java.lang.Object[0]);
                    }
                }
                if ((u17.f457104q & 8) > 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(10298, str4 + ",3");
                }
                j45.l.j(activityC22292xa218e7a1, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent3, null);
            }
            str3 = str2;
        } else {
            str = "onItemClick";
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 item = activityC22292xa218e7a1.f287879n.getItem(headerViewsCount);
            if (item == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatroomContactUI", "on Contact ListView ItemClick, the item contact shoud not be null. count:%d, pos:%d ", java.lang.Integer.valueOf(activityC22292xa218e7a1.f287879n.getCount()), java.lang.Integer.valueOf(headerViewsCount));
                yj0.a.h(this, "com/tencent/mm/ui/contact/ChatroomContactUI$8", "android/widget/AdapterView$OnItemClickListener", str, "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            str3 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V";
            com.p314xaae8f345.mm.ui.p2690x38b72420.c9.a(activityC22292xa218e7a1.f287876h.g(), 9, 3, headerViewsCount + 1);
            java.lang.String d18 = item.d1();
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.q4(d18)) {
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6800x63c0d5b8 c6800x63c0d5b82 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6800x63c0d5b8();
                c6800x63c0d5b82.p(d18);
                c6800x63c0d5b82.f141319e = 2L;
                c6800x63c0d5b82.k();
            }
            android.content.Intent intent4 = new android.content.Intent(activityC22292xa218e7a1.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a.class);
            intent4.putExtra("Chat_User", d18);
            intent4.putExtra("finish_direct", true);
            intent4.putExtra("Chat_Mode", 1);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = activityC22292xa218e7a1.mo55332x76847179();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(intent4);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(mo55332x768471792, arrayList3.toArray(), "com/tencent/mm/ui/contact/ChatroomContactUI$8", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            mo55332x768471792.startActivity((android.content.Intent) arrayList3.get(0));
            yj0.a.f(mo55332x768471792, "com/tencent/mm/ui/contact/ChatroomContactUI$8", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        yj0.a.h(this, "com/tencent/mm/ui/contact/ChatroomContactUI$8", "android/widget/AdapterView$OnItemClickListener", str, str3);
    }
}
