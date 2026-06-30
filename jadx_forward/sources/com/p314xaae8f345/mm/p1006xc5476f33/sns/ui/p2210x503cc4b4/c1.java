package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4;

/* loaded from: classes4.dex */
public class c1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i f251298d;

    public c1(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar) {
        this.f251298d = iVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar;
        int i17;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 s17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$6");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() == null || !(view.getTag() instanceof java.lang.Long)) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$6");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 y07 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Vi().y0(((java.lang.Long) view.getTag()).longValue());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 m70298xd15b2ed8 = y07.m70298xd15b2ed8();
        i64.o1 o1Var = i64.o1.Sight;
        i64.n1 n1Var = i64.n1.DetailTimeline;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 m70298xd15b2ed82 = y07.m70298xd15b2ed8();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar2 = this.f251298d;
        i64.s1.a(o1Var, n1Var, m70298xd15b2ed82, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.n(iVar2));
        y07.m70310x2fa78b11();
        java.lang.String m70348x7741d701 = m70298xd15b2ed8.m70348x7741d701();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m70348x7741d701)) {
            m70348x7741d701 = m70298xd15b2ed8.m70349x104289b3();
        }
        java.lang.String str3 = m70348x7741d701;
        if (m70298xd15b2ed8.m70377x3172ed()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimelineClickListener", "ad ontag click");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 s18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.s(iVar2, m70298xd15b2ed8);
            if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.v.a(m70298xd15b2ed8)) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6038x5a6f40a8 c6038x5a6f40a8 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6038x5a6f40a8();
                c6038x5a6f40a8.f136327g.f87938a = ca4.z0.T(m70298xd15b2ed8);
                c6038x5a6f40a8.e();
            }
            java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.n4g);
            if ((tag instanceof w64.k) && com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.t(iVar2) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.t(iVar2).w((w64.k) tag);
            }
            w64.x i18 = w64.x.i(view);
            if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.c(iVar2, m70298xd15b2ed8)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.d(iVar2, view, m70298xd15b2ed8, i18);
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$6");
                return;
            }
            str = "MicroMsg.TimelineClickListener";
            if (ca4.m0.R(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.e(iVar2), m70298xd15b2ed8, s18, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.n(iVar2), iVar2.f251338h, 3, 0)) {
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$6");
                return;
            }
            if (s18 != null && s18.f38067xf8d8cf13 == 1) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_card_id", s18.f38055x5adefb40);
                intent.putExtra("key_card_ext", s18.f38053xea280278);
                intent.putExtra("key_from_scene", 21);
                intent.putExtra("key_stastic_scene", 15);
                j45.l.j(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.e(iVar2), "card", ".ui.CardDetailUI", intent, null);
                com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad c11137xb05b06ad = new com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.n(iVar2), com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.n(iVar2) == 0 ? 1 : 2, m70298xd15b2ed8.f68891x29d1292e, 3, 11);
                ca4.m0.f(c11137xb05b06ad, iVar2.f251338h, m70298xd15b2ed8, 3);
                ca4.z0.x0(c11137xb05b06ad);
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$6");
                return;
            }
            iVar = iVar2;
            i17 = 3;
            if (s18 == null || s18.f38067xf8d8cf13 != 3) {
                if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.g(iVar, s18, m70298xd15b2ed8, false)) {
                    com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad c11137xb05b06ad2 = new com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.n(iVar), com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.n(iVar) == 0 ? 1 : 2, m70298xd15b2ed8.f68891x29d1292e, 3, 31);
                    ca4.m0.f(c11137xb05b06ad2, iVar.f251338h, m70298xd15b2ed8, 3);
                    ca4.z0.x0(c11137xb05b06ad2);
                    yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$6");
                    return;
                }
                if (l44.s4.b(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.e(iVar), m70298xd15b2ed8.m70354x74235b3e(), m70298xd15b2ed8.m70346x10413e67(), m70298xd15b2ed8.f68891x29d1292e, 2)) {
                    com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad c11137xb05b06ad3 = new com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.n(iVar), com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.n(iVar) == 0 ? 1 : 2, m70298xd15b2ed8.f68891x29d1292e, 3, 41);
                    ca4.m0.f(c11137xb05b06ad3, iVar.f251338h, m70298xd15b2ed8, 3);
                    ca4.z0.x0(c11137xb05b06ad3);
                    yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$6");
                    return;
                }
                if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.c(iVar, m70298xd15b2ed8)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.d(iVar, view, m70298xd15b2ed8, i18);
                    yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$6");
                    return;
                }
            } else if (m70298xd15b2ed8.m70354x74235b3e().m70146xae00c4ba() && za4.z0.u(m70298xd15b2ed8.m70351xaa22b9ed().f67593x28cf0d8f)) {
                java.lang.String a17 = za4.z0.a(m70298xd15b2ed8);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17)) {
                    y07.f67593x28cf0d8f = a17;
                }
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("sns_landing_pages_share_sns_id", m70298xd15b2ed8.m70367x7525eefd());
                intent2.putExtra("sns_landing_pages_rawSnsId", m70298xd15b2ed8.m70371x485d7().Id);
                intent2.putExtra("sns_landing_pages_ux_info", m70298xd15b2ed8.m70375x338a8cc7());
                intent2.putExtra("sns_landing_pages_aid", m70298xd15b2ed8.m70355xb5882a06());
                intent2.putExtra("sns_landing_pages_traceid", m70298xd15b2ed8.m70372xfe2dfcea());
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = m70298xd15b2ed8.m70371x485d7();
                if (m70371x485d7 != null) {
                    java.util.LinkedList linkedList = m70371x485d7.f39014x86965dde.f451373h;
                    if (linkedList.size() > 0) {
                        intent2.putExtra("sns_landing_pages_share_thumb_url", ((r45.jj4) linkedList.get(0)).f459393i);
                    }
                    if (m70371x485d7.f39014x86965dde.f451370e == 15) {
                        intent2.putExtra("sns_landing_is_native_sight_ad", true);
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.f(iVar, intent2, m70298xd15b2ed8);
                java.lang.String str4 = m70298xd15b2ed8.m70351xaa22b9ed().f67593x28cf0d8f;
                a54.g.b(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.e(iVar), intent2, str4);
                intent2.putExtra("sns_landig_pages_from_source", com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.n(iVar) == 2 ? 16 : com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.n(iVar) == 1 ? 10 : 9);
                intent2.putExtra("sns_landing_pages_xml", str4);
                intent2.putExtra("sns_landing_pages_rec_src", m70298xd15b2ed8.m70350x13c652ad());
                intent2.putExtra("sns_landing_pages_xml_prefix", dm.n.f67493x36901555);
                intent2.putExtra("sns_landing_pages_need_enter_and_exit_animation", false);
                intent2.putExtra("sns_landing_page_start_time", java.lang.System.currentTimeMillis());
                w64.x.g(intent2, i18, m70298xd15b2ed8.m70354x74235b3e().f38248xdb8989da);
                iVar.U(i18, m70298xd15b2ed8.m70354x74235b3e().f38248xdb8989da);
                android.app.Activity e17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.e(iVar);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent2);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(e17, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$6", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                e17.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(e17, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$6", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                if (!m70298xd15b2ed8.m70354x74235b3e().f38248xdb8989da && i18 != null && i18.l() != 0 && w64.x.h(i18)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.e(iVar).overridePendingTransition(0, 0);
                }
                com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad c11137xb05b06ad4 = new com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.n(iVar), com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.n(iVar) == 0 ? 1 : 2, m70298xd15b2ed8.f68891x29d1292e, 3, 21);
                ca4.m0.f(c11137xb05b06ad4, iVar.f251338h, m70298xd15b2ed8, 3);
                ca4.z0.x0(c11137xb05b06ad4);
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$6");
                return;
            }
        } else {
            str = "MicroMsg.TimelineClickListener";
            iVar = iVar2;
            i17 = 3;
        }
        com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad c11137xb05b06ad5 = new com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.n(iVar), com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.n(iVar) == 0 ? 1 : 2, m70298xd15b2ed8.f68891x29d1292e, 3, 0);
        ca4.m0.f(c11137xb05b06ad5, iVar.f251338h, m70298xd15b2ed8, i17);
        ca4.z0.x0(c11137xb05b06ad5);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "adTagClick, adlink url " + str3 + " " + m70298xd15b2ed8.m70354x74235b3e().f38280x3e1f3ab);
        android.content.Intent intent3 = new android.content.Intent();
        boolean z17 = m70298xd15b2ed8.m70354x74235b3e().f38280x3e1f3ab == 0;
        if (x51.o1.f533604x) {
            z17 = false;
        }
        if (!m70298xd15b2ed8.m70377x3172ed() || (s17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.s(iVar, m70298xd15b2ed8)) == null) {
            str2 = str3;
        } else {
            intent3.putExtra("KsnsViewId", s17.f38105xcf532ea0);
            str2 = f44.a.e((m70298xd15b2ed8.m70354x74235b3e().f38138xa11ce7c3 == null || m70298xd15b2ed8.m70354x74235b3e().f38138xa11ce7c3.f244112f) ? str3 : ca4.z0.b(str3, s17.f38104xce64ddf1));
            ca4.z0.c(intent3, s17.f38104xce64ddf1);
        }
        intent3.putExtra("KRightBtn", z17);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("KSnsAdTag", c11137xb05b06ad5);
        bundle.putString("key_snsad_statextstr", y07.m70311x485d7().f39040xbd345fc4);
        intent3.putExtra("jsapiargs", bundle);
        intent3.putExtra("rawUrl", str2);
        intent3.putExtra("useJs", true);
        intent3.putExtra("srcUsername", m70298xd15b2ed8.f68896xdde069b);
        intent3.putExtra("sns_local_id", m70298xd15b2ed8.m70363x51f8f990());
        intent3.putExtra("stastic_scene", 15);
        intent3.putExtra("KPublisherId", "sns_" + ca4.z0.t0(m70298xd15b2ed8.f68891x29d1292e));
        intent3.putExtra("pre_username", m70298xd15b2ed8.f68896xdde069b);
        intent3.putExtra("prePublishId", "sns_" + ca4.z0.t0(m70298xd15b2ed8.f68891x29d1292e));
        intent3.putExtra("preUsername", m70298xd15b2ed8.f68896xdde069b);
        iVar.u(intent3);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.D(intent3, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.e(iVar));
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$6");
    }
}
