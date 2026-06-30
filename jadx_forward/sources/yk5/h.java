package yk5;

/* loaded from: classes11.dex */
public class h implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2745x3238195a.ActivityC22592xd42f1efc f544416d;

    public h(com.p314xaae8f345.mm.ui.p2745x3238195a.ActivityC22592xd42f1efc activityC22592xd42f1efc) {
        this.f544416d = activityC22592xd42f1efc;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/voicesearch/SearchConversationResultUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.ui.p2745x3238195a.ActivityC22592xd42f1efc activityC22592xd42f1efc = this.f544416d;
        if (i17 < activityC22592xd42f1efc.f292703d.getHeaderViewsCount()) {
            yj0.a.h(this, "com/tencent/mm/ui/voicesearch/SearchConversationResultUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        int headerViewsCount = i17 - activityC22592xd42f1efc.f292703d.getHeaderViewsCount();
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = (com.p314xaae8f345.mm.p2621x8fb0427b.l4) activityC22592xd42f1efc.f292704e.getItem(headerViewsCount);
        if (l4Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoiceSearchResultUI", "null user at position = " + headerViewsCount);
            yj0.a.h(this, "com/tencent/mm/ui/voicesearch/SearchConversationResultUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.f4(l4Var.h1())) {
            if ((c01.z1.n() & 2) == 0) {
                j45.l.j(activityC22592xd42f1efc.mo55332x76847179(), "tmessage", ".ui.TConversationUI", new android.content.Intent().putExtra("finish_direct", true), null);
            } else {
                j45.l.j(activityC22592xd42f1efc, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", new android.content.Intent().putExtra("Contact_User", l4Var.h1()), null);
            }
        } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.u4(l4Var.h1())) {
            j45.l.j(activityC22592xd42f1efc, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", new android.content.Intent().putExtra("Contact_User", l4Var.h1()), null);
        } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.W3(l4Var.h1())) {
            j45.l.j(activityC22592xd42f1efc, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", new android.content.Intent().putExtra("Contact_User", l4Var.h1()), null);
        } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.v4(l4Var.h1())) {
            ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).h(l4Var.h1());
            j45.l.j(activityC22592xd42f1efc, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", new android.content.Intent().putExtra("Contact_User", l4Var.h1()), null);
        } else {
            if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.t4(l4Var.h1())) {
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.w4(l4Var.h1())) {
                    if (c01.z1.E()) {
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("type", 20);
                        j45.l.j(activityC22592xd42f1efc, "readerapp", ".ui.ReaderAppUI", intent, null);
                    } else {
                        j45.l.j(activityC22592xd42f1efc, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", new android.content.Intent().putExtra("Contact_User", l4Var.h1()), null);
                    }
                } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.x4(l4Var.h1())) {
                    if ((c01.z1.n() & 262144) == 0) {
                        android.content.Intent intent2 = new android.content.Intent();
                        intent2.putExtra("type", 11);
                        j45.l.j(activityC22592xd42f1efc, "readerapp", ".ui.ReaderAppUI", intent2, null);
                    } else {
                        j45.l.j(activityC22592xd42f1efc, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", new android.content.Intent().putExtra("Contact_User", l4Var.h1()), null);
                    }
                } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.Q3(l4Var.h1())) {
                    j45.l.j(activityC22592xd42f1efc, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", new android.content.Intent().putExtra("Contact_User", l4Var.h1()), null);
                } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.d4(l4Var.h1())) {
                    if (c01.z1.D()) {
                        j45.l.j(activityC22592xd42f1efc, "masssend", ".ui.MassSendHistoryUI", new android.content.Intent().putExtra("finish_direct", true), null);
                    } else {
                        j45.l.j(activityC22592xd42f1efc, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", new android.content.Intent().putExtra("Contact_User", l4Var.h1()), null);
                    }
                } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.e4(l4Var.h1())) {
                    if ((c01.z1.n() & 16) == 0) {
                        activityC22592xd42f1efc.m78604xa4df9991(com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a.class, new android.content.Intent().putExtra("Chat_User", l4Var.h1()).putExtra("finish_direct", true));
                    } else {
                        j45.l.j(activityC22592xd42f1efc, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", new android.content.Intent().putExtra("Contact_User", l4Var.h1()), null);
                    }
                } else {
                    if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.c4(activityC22592xd42f1efc.f292705f) && !com.p314xaae8f345.mm.p2621x8fb0427b.z3.C4(activityC22592xd42f1efc.f292705f)) {
                        java.lang.String str2 = activityC22592xd42f1efc.f292705f;
                        if (!(str2 != null && str2.equalsIgnoreCase("feedsapp"))) {
                            java.lang.String str3 = activityC22592xd42f1efc.f292705f;
                            if (!(str3 != null && str3.equalsIgnoreCase("voipapp"))) {
                                java.lang.String str4 = activityC22592xd42f1efc.f292705f;
                                if (!(str4 != null && str4.equalsIgnoreCase("voicevoipapp")) && !com.p314xaae8f345.mm.p2621x8fb0427b.z3.Y3(activityC22592xd42f1efc.f292705f)) {
                                    java.lang.String str5 = activityC22592xd42f1efc.f292705f;
                                    if (!(str5 != null && str5.equalsIgnoreCase("qqfriend"))) {
                                        activityC22592xd42f1efc.m78604xa4df9991(com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a.class, new android.content.Intent().putExtra("Chat_User", l4Var.h1()).putExtra("finish_direct", true));
                                    }
                                }
                            }
                        }
                    }
                    j45.l.j(activityC22592xd42f1efc, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", new android.content.Intent().putExtra("Contact_User", l4Var.h1()), null);
                }
                str = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V";
                yj0.a.h(this, "com/tencent/mm/ui/voicesearch/SearchConversationResultUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", str);
            }
            if ((c01.z1.n() & 1) == 0) {
                activityC22592xd42f1efc.m78604xa4df9991(com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a.class, new android.content.Intent().putExtra("Chat_User", l4Var.h1()).putExtra("finish_direct", true));
            } else {
                j45.l.j(activityC22592xd42f1efc, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", new android.content.Intent().putExtra("Contact_User", l4Var.h1()), null);
            }
        }
        str = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V";
        yj0.a.h(this, "com/tencent/mm/ui/voicesearch/SearchConversationResultUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", str);
    }
}
