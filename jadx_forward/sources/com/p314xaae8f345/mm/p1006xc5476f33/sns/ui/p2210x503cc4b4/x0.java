package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4;

/* loaded from: classes4.dex */
public class x0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i f251395d;

    public x0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar) {
        this.f251395d = iVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18146x7d99d446 c18146x7d99d446;
        com.p314xaae8f345.mm.ui.C21405x85fc1ce0 c21405x85fc1ce0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 s17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$42");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$42", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Object tag = view.getTag();
        if (tag instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder) view.getTag();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 a17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l1.a(baseViewHolder.f250797d);
            c18146x7d99d446 = baseViewHolder.f250833v;
            c17933xe8d1b226 = a17;
            c21405x85fc1ce0 = null;
        } else if (tag instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) {
            c17933xe8d1b226 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) tag;
            c21405x85fc1ce0 = (com.p314xaae8f345.mm.ui.C21405x85fc1ce0) view.getTag(com.p314xaae8f345.mm.R.id.i2r);
            c18146x7d99d446 = null;
        } else {
            c18146x7d99d446 = null;
            c21405x85fc1ce0 = null;
            c17933xe8d1b226 = null;
        }
        if (c17933xe8d1b226 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 m70351xaa22b9ed = c17933xe8d1b226.m70351xaa22b9ed();
            boolean m70377x3172ed = c17933xe8d1b226.m70377x3172ed();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar = this.f251395d;
            if (m70377x3172ed) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 s18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.s(iVar, c17933xe8d1b226);
                if (c17933xe8d1b226.m70354x74235b3e().m70146xae00c4ba() && za4.z0.u(c17933xe8d1b226.m70351xaa22b9ed().f67593x28cf0d8f)) {
                    java.lang.String a18 = za4.z0.a(c17933xe8d1b226);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a18)) {
                        m70351xaa22b9ed.f67593x28cf0d8f = a18;
                    }
                    int[] iArr = new int[2];
                    view.getLocationInWindow(iArr);
                    int width = view.getWidth();
                    int height = view.getHeight();
                    if (c18146x7d99d446 != null) {
                        c18146x7d99d446.getLocationInWindow(iArr);
                        width = c18146x7d99d446.getWidth();
                        height = c18146x7d99d446.getHeight();
                    } else if (c21405x85fc1ce0 != null) {
                        c21405x85fc1ce0.getLocationInWindow(iArr);
                        width = c21405x85fc1ce0.getWidth();
                        height = c21405x85fc1ce0.getHeight();
                    }
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("img_gallery_left", iArr[0]);
                    intent.putExtra("img_gallery_top", iArr[1]);
                    intent.putExtra("img_gallery_width", width);
                    intent.putExtra("img_gallery_height", height);
                    intent.putExtra("sns_landing_pages_share_sns_id", c17933xe8d1b226.m70367x7525eefd());
                    intent.putExtra("sns_landing_pages_rawSnsId", c17933xe8d1b226.m70371x485d7().Id);
                    intent.putExtra("sns_landing_pages_ux_info", c17933xe8d1b226.m70375x338a8cc7());
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = c17933xe8d1b226.m70371x485d7();
                    if (m70371x485d7 != null) {
                        java.util.LinkedList linkedList = m70371x485d7.f39014x86965dde.f451373h;
                        if (linkedList.size() > 0) {
                            intent.putExtra("sns_landing_pages_share_thumb_url", ((r45.jj4) linkedList.get(0)).f459393i);
                        }
                    }
                    java.lang.String str = c17933xe8d1b226.m70351xaa22b9ed().f67593x28cf0d8f;
                    a54.g.b(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.e(iVar), intent, str);
                    intent.putExtra("sns_landig_pages_from_source", com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.n(iVar) == 2 ? 16 : com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.n(iVar) == 1 ? 10 : 9);
                    intent.putExtra("sns_landing_pages_xml", str);
                    intent.putExtra("sns_landing_pages_rec_src", c17933xe8d1b226.m70350x13c652ad());
                    intent.putExtra("sns_landing_pages_xml_prefix", dm.n.f67493x36901555);
                    intent.putExtra("sns_landing_pages_need_enter_and_exit_animation", true);
                    intent.putExtra("sns_landing_is_native_sight_ad", true);
                    intent.putExtra("sns_landing_page_start_time", java.lang.System.currentTimeMillis());
                    android.app.Activity e17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.e(iVar);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(intent);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(e17, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$42", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    e17.startActivity((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(e17, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$42", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.e(iVar).overridePendingTransition(0, 0);
                    ca4.z0.x0(new com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.n(iVar), com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.n(iVar) == 0 ? 1 : 2, c17933xe8d1b226.f68891x29d1292e, 23, 21));
                    yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$42", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$42");
                    return;
                }
                if (s18 != null && s18.f38067xf8d8cf13 == 1) {
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("key_card_id", s18.f38055x5adefb40);
                    intent2.putExtra("key_card_ext", s18.f38053xea280278);
                    intent2.putExtra("key_from_scene", 21);
                    intent2.putExtra("key_stastic_scene", 15);
                    j45.l.j(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.e(iVar), "card", ".ui.CardDetailUI", intent2, null);
                    ca4.z0.x0(new com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.n(iVar), com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.n(iVar) == 0 ? 1 : 2, c17933xe8d1b226.f68891x29d1292e, 23, 11));
                    yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$42", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$42");
                    return;
                }
                if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.g(iVar, s18, c17933xe8d1b226, false)) {
                    ca4.z0.x0(new com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.n(iVar), com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.n(iVar) == 0 ? 1 : 2, c17933xe8d1b226.f68891x29d1292e, 23, 31));
                    yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$42", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$42");
                    return;
                }
            }
            com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad c11137xb05b06ad = new com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.n(iVar), com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.n(iVar) == 0 ? 1 : 2, c17933xe8d1b226.f68891x29d1292e, 23, 0);
            ca4.z0.x0(c11137xb05b06ad);
            java.lang.String m70348x7741d701 = c17933xe8d1b226.m70348x7741d701();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m70348x7741d701)) {
                m70348x7741d701 = c17933xe8d1b226.m70349x104289b3();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimelineClickListener", "linkAdClick, adlink url " + m70348x7741d701 + " " + c17933xe8d1b226.m70354x74235b3e().f38280x3e1f3ab);
            android.content.Intent intent3 = new android.content.Intent();
            boolean z17 = x51.o1.f533604x ? false : c17933xe8d1b226.m70354x74235b3e().f38280x3e1f3ab == 0;
            if (c17933xe8d1b226.m70377x3172ed() && (s17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.s(iVar, c17933xe8d1b226)) != null) {
                intent3.putExtra("KsnsViewId", s17.f38105xcf532ea0);
                m70348x7741d701 = ca4.z0.b(m70348x7741d701, s17.f38104xce64ddf1);
                ca4.z0.c(intent3, s17.f38104xce64ddf1);
            }
            intent3.putExtra("KRightBtn", z17);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("KSnsAdTag", c11137xb05b06ad);
            bundle.putString("key_snsad_statextstr", m70351xaa22b9ed.m70311x485d7().f39040xbd345fc4);
            intent3.putExtra("jsapiargs", bundle);
            intent3.putExtra("rawUrl", m70348x7741d701);
            intent3.putExtra("useJs", true);
            intent3.putExtra("srcUsername", c17933xe8d1b226.f68896xdde069b);
            intent3.putExtra("stastic_scene", 15);
            intent3.putExtra("KPublisherId", "sns_" + ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e));
            intent3.putExtra("pre_username", c17933xe8d1b226.f68896xdde069b);
            intent3.putExtra("prePublishId", "sns_" + ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e));
            intent3.putExtra("preUsername", c17933xe8d1b226.f68896xdde069b);
            iVar.u(intent3);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.D(intent3, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.e(iVar));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$42", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$42");
    }
}
