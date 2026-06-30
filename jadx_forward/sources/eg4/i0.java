package eg4;

/* loaded from: classes11.dex */
public final class i0 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final yz5.p f334262e;

    public i0(yz5.p pVar) {
        this.f334262e = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void n(eg4.i0 r17, android.content.Context r18, com.p314xaae8f345.mm.p2621x8fb0427b.ib r19) {
        /*
            Method dump skipped, instructions count: 704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eg4.i0.n(eg4.i0, android.content.Context, com.tencent.mm.storage.ib):void");
    }

    public static final void o(eg4.i0 i0Var, android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.ib ibVar) {
        i0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ibVar, "<this>");
        com.p314xaae8f345.mm.p2621x8fb0427b.e9 f17 = com.p314xaae8f345.mm.p2621x8fb0427b.e9.f(ibVar.f68084xad49e234);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddFriendVerifyRecord.NewItemConvert", "try to addcontact, username = " + f17.f275392a + ", opcode = MM_VERIFYUSER_VERIFYOK");
        if (f17.C == 1) {
            db5.e1.C(context, f17.D, null, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fbi), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), true, new eg4.h0(i0Var, context, ibVar), null);
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.ya z07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) c01.d9.b().B()).z0(ibVar.f68087x5285fa99);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", f17.f275392a);
        intent.putExtra("Contact_Nick", f17.f275394c);
        if (z07 != null) {
            intent.putExtra("Contact_RemarkName", z07.f66692x4854b29d);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f17.f275417z)) {
            com.p314xaae8f345.mm.p2621x8fb0427b.a3 z08 = ((com.p314xaae8f345.mm.p2621x8fb0427b.b3) c01.d9.b().l()).z0(f17.f275417z);
            if (z08 != null) {
                java.lang.String z09 = z08.z0(f17.f275392a);
                intent.putExtra("Contact_RoomNickname", z09);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddFriendVerifyRecord.NewItemConvert", "getRoom DisplayName: ".concat(z09));
                intent.putExtra("room_name", f17.f275417z);
            }
        }
        intent.putExtra("Contact_Scene", f17.f275399h);
        intent.putExtra("Verify_ticket", i0Var.p(ibVar));
        intent.putExtra("sayhi_with_sns_perm_send_verify", false);
        intent.putExtra("sayhi_with_sns_perm_add_remark", true);
        intent.putExtra("sayhi_with_sns_perm_set_label", true);
        intent.putExtra("sayhi_with_jump_to_profile", true);
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 7);
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_set_default_chatonly, 2);
        java.lang.String str = (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(f17.f275392a) || Ni != 1) ? (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(f17.f275392a) || Ni != 2 || c01.e2.k() < ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_add_friends_without_choose_permission_threshold, 5000)) ? ".ui.SayHiWithSnsPermissionUI" : ".ui.SayHiWithSnsPermissionUI3" : ".ui.SayHiWithSnsPermissionUI2";
        if ((com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(f17.f275392a) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.n4(f17.f275392a)) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.ContactNewFriendWeWeCom.k(context, null)) {
            return;
        }
        j45.l.j(context, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, str, intent, null);
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dyk;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        int i19;
        android.view.View view;
        eg4.h2 item = (eg4.h2) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.content.Context context = holder.f3639x46306858.getContext();
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.s2 s2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.s2.f235148a;
        com.p314xaae8f345.mm.p2621x8fb0427b.ib ibVar = item.f334257d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ibVar, "<this>");
        com.p314xaae8f345.mm.p2621x8fb0427b.e9 f17 = com.p314xaae8f345.mm.p2621x8fb0427b.e9.f(ibVar.f68084xad49e234);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddFriendVerifyRecord.NewItemConvert", "onBindViewHolder: position=%d, encryptTalker=%s, status=%d, isRequester=%b, scene=%d", java.lang.Integer.valueOf(i17), ibVar.f68087x5285fa99, java.lang.Integer.valueOf(ibVar.f68089x10a0fed7), java.lang.Boolean.valueOf(s2Var.b(ibVar)), java.lang.Integer.valueOf(f17.f275399h));
        java.lang.String str = item.f334258e;
        if (str != null) {
            android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.vln);
            if (textView != null) {
                textView.setVisibility(0);
                textView.setText(str);
            }
        } else {
            android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.vln);
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        }
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.vlp);
        if (textView3 != null) {
            textView3.setText(f17.f275394c);
        }
        android.widget.TextView textView4 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.kjp);
        java.lang.String str2 = f17.f275392a;
        if (str2 != null && com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(str2)) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f17.H) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f17.I)) {
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(str2, true);
                if (textView4 != null) {
                    textView4.setText(t41.g.a(n17));
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddFriendVerifyRecord.NewItemConvert", "update openImDescTV from contact");
            } else {
                if (textView4 != null) {
                    textView4.setText(t41.g.c(f17.H, f17.I));
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddFriendVerifyRecord.NewItemConvert", " openimappid: " + f17.H + ", openimdescwordingid: " + f17.I + " from verify");
            }
            if (textView4 != null) {
                textView4.setVisibility(0);
            }
        } else if (textView4 != null) {
            textView4.setVisibility(8);
        }
        android.widget.TextView textView5 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f565629t40);
        android.widget.TextView textView6 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.vlo);
        if (textView6 != null) {
            textView6.setText(f17.f275397f);
        } else {
            textView6 = null;
        }
        if (textView5 != null) {
            textView5.setVisibility(8);
        }
        if (textView5 != null) {
            textView5.setOnClickListener(new eg4.c0(textView5, textView6));
        }
        if (textView6 != null) {
            textView6.post(new eg4.d0(textView6, textView5));
        }
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.vll);
        if (imageView != null) {
            gk0.k kVar = new gk0.k(imageView.getMeasuredWidth(), imageView.getMeasuredHeight());
            kVar.f353966d = 0.1f;
            kVar.f353967e = com.p314xaae8f345.mm.R.C30861xcebc809e.bhm;
            gk0.n0 n0Var = (gk0.n0) i95.n0.c(gk0.n0.class);
            java.lang.String str3 = f17.f275413v;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3, "getSmallHeadImgUrl(...)");
            ((h83.g) n0Var).wi(imageView, str3, kVar);
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.p(com.p314xaae8f345.mm.R.id.vlm);
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new eg4.e0(this, context, ibVar));
        }
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) holder.p(com.p314xaae8f345.mm.R.id.vlm);
        if (viewGroup2 != null) {
            viewGroup2.setOnLongClickListener(new eg4.f0(this, item));
        }
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.vlq);
        if (p17 != null) {
            p17.setOnClickListener(new eg4.g0(this, context, ibVar, f17));
        }
        android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.g9u);
        android.view.View p19 = holder.p(com.p314xaae8f345.mm.R.id.vlq);
        android.view.View p27 = holder.p(com.p314xaae8f345.mm.R.id.g_6);
        android.view.View p28 = holder.p(com.p314xaae8f345.mm.R.id.g9w);
        android.view.View p29 = holder.p(com.p314xaae8f345.mm.R.id.g_1);
        android.widget.ImageView imageView2 = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.hgx);
        if (imageView2 != null) {
            imageView2.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f80302x1bd90479, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77645xad7ef2c, null)));
        }
        int i27 = ibVar.f68089x10a0fed7;
        if (i27 == 1) {
            if (p28 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(p28, arrayList.toArray(), "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p28.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(p28, "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (p18 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(p18, "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (p19 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(p19, arrayList3.toArray(), "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p19.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(p19, "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (p27 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(p27, arrayList4.toArray(), "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p27.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(p27, "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (p29 != null) {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(p29, arrayList5.toArray(), "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p29.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(p29, "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (imageView2 == null) {
                return;
            }
            imageView2.setVisibility(8);
            return;
        }
        if (i27 == 2) {
            if (p29 != null) {
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal6 = zj0.c.f554818a;
                arrayList6.add(0);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(p29, arrayList6.toArray(), "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p29.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(p29, "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (p18 != null) {
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal7 = zj0.c.f554818a;
                arrayList7.add(8);
                java.util.Collections.reverse(arrayList7);
                yj0.a.d(p18, arrayList7.toArray(), "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p18.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                yj0.a.f(p18, "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (p19 != null) {
                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal8 = zj0.c.f554818a;
                arrayList8.add(8);
                java.util.Collections.reverse(arrayList8);
                yj0.a.d(p19, arrayList8.toArray(), "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p19.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                yj0.a.f(p19, "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (p27 != null) {
                java.util.ArrayList arrayList9 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal9 = zj0.c.f554818a;
                arrayList9.add(8);
                java.util.Collections.reverse(arrayList9);
                yj0.a.d(p27, arrayList9.toArray(), "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p27.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                yj0.a.f(p27, "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (p28 != null) {
                java.util.ArrayList arrayList10 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal10 = zj0.c.f554818a;
                arrayList10.add(8);
                java.util.Collections.reverse(arrayList10);
                yj0.a.d(p28, arrayList10.toArray(), "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p28.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
                yj0.a.f(p28, "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (imageView2 == null) {
                return;
            }
            imageView2.setVisibility(8);
            return;
        }
        if (i27 != 3) {
            if (i27 == 4) {
                if (p18 != null) {
                    java.util.ArrayList arrayList11 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal11 = zj0.c.f554818a;
                    arrayList11.add(8);
                    java.util.Collections.reverse(arrayList11);
                    yj0.a.d(p18, arrayList11.toArray(), "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p18.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
                    yj0.a.f(p18, "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (p19 != null) {
                    java.util.ArrayList arrayList12 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal12 = zj0.c.f554818a;
                    arrayList12.add(8);
                    java.util.Collections.reverse(arrayList12);
                    yj0.a.d(p19, arrayList12.toArray(), "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p19.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
                    yj0.a.f(p19, "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (p27 != null) {
                    java.util.ArrayList arrayList13 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal13 = zj0.c.f554818a;
                    arrayList13.add(8);
                    java.util.Collections.reverse(arrayList13);
                    yj0.a.d(p27, arrayList13.toArray(), "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p27.setVisibility(((java.lang.Integer) arrayList13.get(0)).intValue());
                    yj0.a.f(p27, "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (p28 != null) {
                    java.util.ArrayList arrayList14 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal14 = zj0.c.f554818a;
                    arrayList14.add(8);
                    java.util.Collections.reverse(arrayList14);
                    yj0.a.d(p28, arrayList14.toArray(), "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p28.setVisibility(((java.lang.Integer) arrayList14.get(0)).intValue());
                    yj0.a.f(p28, "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (p29 != null) {
                    java.util.ArrayList arrayList15 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal15 = zj0.c.f554818a;
                    arrayList15.add(8);
                    java.util.Collections.reverse(arrayList15);
                    yj0.a.d(p29, arrayList15.toArray(), "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p29.setVisibility(((java.lang.Integer) arrayList15.get(0)).intValue());
                    yj0.a.f(p29, "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (imageView2 == null) {
                    return;
                }
                imageView2.setVisibility(8);
                return;
            }
            if (p19 == null) {
                view = p29;
            } else {
                java.util.ArrayList arrayList16 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal16 = zj0.c.f554818a;
                arrayList16.add(0);
                java.util.Collections.reverse(arrayList16);
                view = p29;
                yj0.a.d(p19, arrayList16.toArray(), "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p19.setVisibility(((java.lang.Integer) arrayList16.get(0)).intValue());
                yj0.a.f(p19, "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (p18 != null) {
                java.util.ArrayList arrayList17 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal17 = zj0.c.f554818a;
                arrayList17.add(8);
                java.util.Collections.reverse(arrayList17);
                yj0.a.d(p18, arrayList17.toArray(), "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p18.setVisibility(((java.lang.Integer) arrayList17.get(0)).intValue());
                yj0.a.f(p18, "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (p27 != null) {
                java.util.ArrayList arrayList18 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal18 = zj0.c.f554818a;
                arrayList18.add(8);
                java.util.Collections.reverse(arrayList18);
                yj0.a.d(p27, arrayList18.toArray(), "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p27.setVisibility(((java.lang.Integer) arrayList18.get(0)).intValue());
                yj0.a.f(p27, "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (p28 != null) {
                java.util.ArrayList arrayList19 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal19 = zj0.c.f554818a;
                arrayList19.add(8);
                java.util.Collections.reverse(arrayList19);
                yj0.a.d(p28, arrayList19.toArray(), "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p28.setVisibility(((java.lang.Integer) arrayList19.get(0)).intValue());
                yj0.a.f(p28, "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (view != null) {
                java.util.ArrayList arrayList20 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal20 = zj0.c.f554818a;
                arrayList20.add(8);
                java.util.Collections.reverse(arrayList20);
                android.view.View view2 = view;
                yj0.a.d(view2, arrayList20.toArray(), "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList20.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (imageView2 == null) {
                return;
            }
            imageView2.setVisibility(8);
            return;
        }
        long c17 = c01.id.c() - ibVar.f68085xac3be4e;
        int i28 = eg4.t1.f334343t;
        if (c17 >= com.p314xaae8f345.mm.p2621x8fb0427b.o7.J0()) {
            if (p29 != null) {
                java.util.ArrayList arrayList21 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal21 = zj0.c.f554818a;
                arrayList21.add(0);
                java.util.Collections.reverse(arrayList21);
                yj0.a.d(p29, arrayList21.toArray(), "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p29.setVisibility(((java.lang.Integer) arrayList21.get(0)).intValue());
                yj0.a.f(p29, "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (p18 != null) {
                java.util.ArrayList arrayList22 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal22 = zj0.c.f554818a;
                arrayList22.add(8);
                java.util.Collections.reverse(arrayList22);
                yj0.a.d(p18, arrayList22.toArray(), "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p18.setVisibility(((java.lang.Integer) arrayList22.get(0)).intValue());
                yj0.a.f(p18, "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (p19 != null) {
                java.util.ArrayList arrayList23 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal23 = zj0.c.f554818a;
                arrayList23.add(8);
                java.util.Collections.reverse(arrayList23);
                yj0.a.d(p19, arrayList23.toArray(), "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p19.setVisibility(((java.lang.Integer) arrayList23.get(0)).intValue());
                yj0.a.f(p19, "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (p27 != null) {
                java.util.ArrayList arrayList24 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal24 = zj0.c.f554818a;
                arrayList24.add(8);
                java.util.Collections.reverse(arrayList24);
                yj0.a.d(p27, arrayList24.toArray(), "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p27.setVisibility(((java.lang.Integer) arrayList24.get(0)).intValue());
                yj0.a.f(p27, "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (p28 != null) {
                java.util.ArrayList arrayList25 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal25 = zj0.c.f554818a;
                arrayList25.add(8);
                java.util.Collections.reverse(arrayList25);
                yj0.a.d(p28, arrayList25.toArray(), "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p28.setVisibility(((java.lang.Integer) arrayList25.get(0)).intValue());
                yj0.a.f(p28, "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (imageView2 == null) {
                return;
            }
            imageView2.setVisibility(8);
            return;
        }
        if (s2Var.b(ibVar)) {
            if (p27 != null) {
                java.util.ArrayList arrayList26 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal26 = zj0.c.f554818a;
                arrayList26.add(0);
                java.util.Collections.reverse(arrayList26);
                yj0.a.d(p27, arrayList26.toArray(), "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p27.setVisibility(((java.lang.Integer) arrayList26.get(0)).intValue());
                yj0.a.f(p27, "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (p19 != null) {
                java.util.ArrayList arrayList27 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal27 = zj0.c.f554818a;
                arrayList27.add(8);
                java.util.Collections.reverse(arrayList27);
                yj0.a.d(p19, arrayList27.toArray(), "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p19.setVisibility(((java.lang.Integer) arrayList27.get(0)).intValue());
                yj0.a.f(p19, "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (p18 != null) {
                java.util.ArrayList arrayList28 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal28 = zj0.c.f554818a;
                arrayList28.add(8);
                java.util.Collections.reverse(arrayList28);
                yj0.a.d(p18, arrayList28.toArray(), "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p18.setVisibility(((java.lang.Integer) arrayList28.get(0)).intValue());
                yj0.a.f(p18, "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
            if (p28 != null) {
                java.util.ArrayList arrayList29 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal29 = zj0.c.f554818a;
                arrayList29.add(8);
                java.util.Collections.reverse(arrayList29);
                yj0.a.d(p28, arrayList29.toArray(), "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p28.setVisibility(((java.lang.Integer) arrayList29.get(0)).intValue());
                yj0.a.f(p28, "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (p29 == null) {
                return;
            }
            java.util.ArrayList arrayList30 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal30 = zj0.c.f554818a;
            arrayList30.add(8);
            java.util.Collections.reverse(arrayList30);
            yj0.a.d(p29, arrayList30.toArray(), "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p29.setVisibility(((java.lang.Integer) arrayList30.get(0)).intValue());
            yj0.a.f(p29, "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (p19 != null) {
            java.util.ArrayList arrayList31 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal31 = zj0.c.f554818a;
            arrayList31.add(0);
            java.util.Collections.reverse(arrayList31);
            yj0.a.d(p19, arrayList31.toArray(), "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p19.setVisibility(((java.lang.Integer) arrayList31.get(0)).intValue());
            yj0.a.f(p19, "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (p18 != null) {
            java.util.ArrayList arrayList32 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal32 = zj0.c.f554818a;
            arrayList32.add(8);
            java.util.Collections.reverse(arrayList32);
            yj0.a.d(p18, arrayList32.toArray(), "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList32.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (p27 != null) {
            java.util.ArrayList arrayList33 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal33 = zj0.c.f554818a;
            arrayList33.add(8);
            java.util.Collections.reverse(arrayList33);
            yj0.a.d(p27, arrayList33.toArray(), "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p27.setVisibility(((java.lang.Integer) arrayList33.get(0)).intValue());
            yj0.a.f(p27, "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (imageView2 == null) {
            i19 = 8;
        } else {
            i19 = 8;
            imageView2.setVisibility(8);
        }
        if (p28 != null) {
            java.util.ArrayList arrayList34 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal34 = zj0.c.f554818a;
            arrayList34.add(java.lang.Integer.valueOf(i19));
            java.util.Collections.reverse(arrayList34);
            yj0.a.d(p28, arrayList34.toArray(), "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p28.setVisibility(((java.lang.Integer) arrayList34.get(0)).intValue());
            yj0.a.f(p28, "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (p29 == null) {
            return;
        }
        java.util.ArrayList arrayList35 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal35 = zj0.c.f554818a;
        arrayList35.add(8);
        java.util.Collections.reverse(arrayList35);
        yj0.a.d(p29, arrayList35.toArray(), "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p29.setVisibility(((java.lang.Integer) arrayList35.get(0)).intValue());
        yj0.a.f(p29, "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/subapp/ui/friend/VerifyRecordNewItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0099, code lost:
    
        if (r1.moveToFirst() != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009b, code lost:
    
        r7 = new com.p314xaae8f345.mm.p2621x8fb0427b.ib();
        r7.mo9015xbf5d97fd(r1);
        r6.add(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00aa, code lost:
    
        if (r1.moveToNext() != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ac, code lost:
    
        vz5.b.a(r1, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String p(com.p314xaae8f345.mm.p2621x8fb0427b.ib r12) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eg4.i0.p(com.tencent.mm.storage.ib):java.lang.String");
    }
}
