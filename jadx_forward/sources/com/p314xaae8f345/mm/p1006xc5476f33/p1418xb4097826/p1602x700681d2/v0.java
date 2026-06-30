package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2;

/* loaded from: classes2.dex */
public final class v0 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.s1 f204011d;

    public v0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.s1 s1Var) {
        this.f204011d = s1Var;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        java.lang.String str;
        long j17;
        int i18;
        java.lang.Object obj;
        java.lang.Object obj2;
        int i19;
        java.lang.Object obj3;
        java.lang.Object obj4;
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1 z1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1) holder.f374658i;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPlayListDrawerPresenter", "onItemClick: position:" + i17 + ", item:" + z1Var.mo2128x1ed62e84() + ", scene:" + this.f204011d.f203975v);
        boolean z17 = !this.f204011d.j() && (this.f204011d.f203954a instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6);
        if (this.f204011d.j()) {
            android.content.Context context = this.f204011d.f203954a;
            if (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56068x4905e9fa = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6) context).p7().m56068x4905e9fa();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.s1 s1Var = this.f204011d;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = m56068x4905e9fa.getLayoutManager();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 c15415x74224fd8 = layoutManager instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8) layoutManager : null;
                if (c15415x74224fd8 == null) {
                    return;
                }
                java.util.Iterator it = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6) s1Var.f203954a).E7().m56387xe6796cde().iterator();
                int i27 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i27 = -1;
                        break;
                    } else if (((so2.j5) it.next()).mo2128x1ed62e84() == z1Var.mo2128x1ed62e84()) {
                        break;
                    } else {
                        i27++;
                    }
                }
                if (i27 == -1) {
                    return;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                arrayList.add(java.lang.Integer.valueOf(i27));
                java.util.Collections.reverse(arrayList);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 c15415x74224fd82 = c15415x74224fd8;
                yj0.a.d(c15415x74224fd82, arrayList.toArray(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerPresenter$getAdapter$2", "onItemClick", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroid/view/View;ILcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                c15415x74224fd8.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
                yj0.a.f(c15415x74224fd82, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerPresenter$getAdapter$2", "onItemClick", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroid/view/View;ILcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                m56068x4905e9fa.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.t0(s1Var, m56068x4905e9fa, c15415x74224fd8));
                java.util.Iterator it6 = s1Var.f203955b.f203829a.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it6.next();
                    so2.j5 j5Var = (so2.j5) obj3;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1 z1Var2 = j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1) j5Var : null;
                    if (z1Var2 != null && z1Var2.f204041d) {
                        break;
                    }
                }
                so2.j5 j5Var2 = (so2.j5) obj3;
                if (j5Var2 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1 z1Var3 = j5Var2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1) j5Var2 : null;
                    if (z1Var3 != null) {
                        z1Var3.f204041d = false;
                    }
                }
                java.util.Iterator it7 = s1Var.f203955b.f203829a.iterator();
                while (true) {
                    if (it7.hasNext()) {
                        obj4 = it7.next();
                        if (((so2.j5) obj4).mo2128x1ed62e84() == z1Var.mo2128x1ed62e84()) {
                            break;
                        }
                    } else {
                        obj4 = null;
                        break;
                    }
                }
                so2.j5 j5Var3 = (so2.j5) obj4;
                if (j5Var3 != null) {
                    boolean z18 = j5Var3 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1;
                    if (z18) {
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1 z1Var4 = z18 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1) j5Var3 : null;
                    if (z1Var4 != null) {
                        z1Var4.f204041d = true;
                    }
                }
                adapter.m8146xced61ae5();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.C14604x9e435b69 c14604x9e435b69 = s1Var.f203957d;
                if (c14604x9e435b69 != null) {
                    c14604x9e435b69.u();
                    return;
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("drawer");
                    throw null;
                }
            }
        }
        if (!(this.f204011d.f203954a instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14104x32508bfe)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_topic_type", 16);
            r45.vx0 vx0Var = this.f204011d.h().f203818e;
            if (vx0Var != null) {
                if (vx0Var.m75939xb282bd08(21) != 0) {
                    intent.putExtra("key_topic_type", vx0Var.m75939xb282bd08(21));
                }
                intent.putExtra("key_topic_type", vx0Var.m75939xb282bd08(21));
                com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = vx0Var.m75934xbce7f2f(22);
                intent.putExtra("KEY_HOT_TOPIC_BUFFER", m75934xbce7f2f != null ? m75934xbce7f2f.f273689a : null);
            }
            r45.vx0 vx0Var2 = this.f204011d.h().f203818e;
            str = "";
            if (vx0Var2 != null) {
                java.lang.String m75945x2fec8307 = vx0Var2.m75945x2fec8307(1);
                str = m75945x2fec8307 != null ? m75945x2fec8307 : "";
                j17 = vx0Var2.m75942xfb822ef2(0);
            } else {
                j17 = 0;
            }
            intent.putExtra("key_topic_title", str);
            intent.putExtra("KEY_TOPIC_ID", j17);
            r45.vx0 vx0Var3 = this.f204011d.h().f203818e;
            intent.putExtra("key_topic_type", vx0Var3 != null ? java.lang.Integer.valueOf(vx0Var3.m75939xb282bd08(21)) : 0L);
            intent.putExtra("key_ref_object_id", this.f204011d.h().f203814a);
            intent.putExtra("key_ref_object_dup_flag", this.f204011d.h().f203815b);
            intent.putExtra("KEY_CLICK_FEED_ID", z1Var.mo2128x1ed62e84());
            intent.putExtra("KEY_CLICK_FEED_POSITION", i17);
            intent.putExtra("KEY_PASSIVE_ENTER", z17);
            r45.vx0 vx0Var4 = this.f204011d.h().f203818e;
            intent.putExtra("KEY_COLLECTION_INFO", vx0Var4 != null ? vx0Var4.mo14344x5f01b1f6() : null);
            intent.putExtra("KEY_UP_CONTINUE_FLAG", this.f204011d.f203972s);
            intent.putExtra("KEY_DOWN_CONTINUE_FLAG", this.f204011d.f203973t);
            intent.putExtra("KEY_FEED_ID", this.f204011d.h().f203814a);
            intent.putExtra("KEY_OBJECT_NONCE_ID", this.f204011d.h().f203816c);
            intent.putExtra("KEY_OBJECT_NONCE_ID", this.f204011d.h().f203816c);
            intent.putExtra("key_member_preview_mode", this.f204011d.h().f203822i);
            intent.putExtra("key_reuqest_scene", ((java.lang.Number) ((jz5.n) this.f204011d.f203963j).mo141623x754a37bb()).intValue());
            intent.putExtra("tab_type", ((java.lang.Number) ((jz5.n) this.f204011d.f203964k).mo141623x754a37bb()).intValue());
            intent.putExtra("key_from_user_name", (java.lang.String) ((jz5.n) this.f204011d.f203965l).mo141623x754a37bb());
            intent.putExtra("key_to_user_name", (java.lang.String) ((jz5.n) this.f204011d.f203966m).mo141623x754a37bb());
            intent.putExtra("key_session_id", (java.lang.String) ((jz5.n) this.f204011d.f203967n).mo141623x754a37bb());
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.s1 s1Var2 = this.f204011d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.e2 e2Var = s1Var2.f203955b;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g30 g30Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g30(null, s1Var2.f203970q);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f204011d.f203970q;
            e2Var.getClass();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.ArrayList arrayList3 = e2Var.f203829a;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.util.Iterator it8 = arrayList3.iterator();
            while (it8.hasNext()) {
                java.lang.Object next = it8.next();
                if (next instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1) {
                    arrayList4.add(next);
                }
            }
            java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1> S0 = kz5.n0.S0(arrayList4);
            java.util.ArrayList arrayList5 = new java.util.ArrayList(kz5.d0.q(S0, 10));
            for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1 z1Var5 : S0) {
                z1Var5.getFeedObject().m59358xc5f6eaef(0);
                arrayList5.add(cu2.u.f303974a.p(z1Var5.getFeedObject()));
            }
            arrayList2.addAll(arrayList5);
            e2Var.f203830b.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r9(arrayList2, gVar, i17, g30Var, null, 16, null), intent);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1, this.f204011d.f203954a, intent, 0L, null, 0, 0, false, 0, null, 508, null);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).il(this.f204011d.f203954a, intent);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.C14604x9e435b69 c14604x9e435b692 = this.f204011d.f203957d;
            if (c14604x9e435b692 != null) {
                c14604x9e435b692.u();
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("drawer");
                throw null;
            }
        }
        if (z1Var.getFeedObject().getMediaType() == 15) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v20 v20Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14104x32508bfe) this.f204011d.f203954a).E;
        if (v20Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56068x4905e9fa2 = v20Var.m56068x4905e9fa();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.s1 s1Var3 = this.f204011d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager2 = m56068x4905e9fa2.getLayoutManager();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 c15415x74224fd83 = layoutManager2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8) layoutManager2 : null;
        if (c15415x74224fd83 == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.AbstractC13819x84acce8e abstractC13819x84acce8e = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14104x32508bfe) s1Var3.f203954a).F;
        if (abstractC13819x84acce8e == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedLoader");
            throw null;
        }
        java.util.ArrayList m56387xe6796cde = abstractC13819x84acce8e.m56387xe6796cde();
        java.util.Iterator it9 = m56387xe6796cde.iterator();
        int i28 = 0;
        while (true) {
            if (!it9.hasNext()) {
                i18 = -1;
                break;
            }
            if (((so2.j5) it9.next()).mo2128x1ed62e84() == z1Var.mo2128x1ed62e84()) {
                i18 = i28;
                break;
            }
            i28++;
        }
        if (i18 == -1) {
            m56387xe6796cde.clear();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.e2 e2Var2 = s1Var3.f203955b;
            boolean z19 = s1Var3.h().f203822i;
            e2Var2.getClass();
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            java.util.ArrayList arrayList8 = e2Var2.f203829a;
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            java.util.Iterator it10 = arrayList8.iterator();
            while (it10.hasNext()) {
                java.lang.Object next2 = it10.next();
                if (next2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1) {
                    arrayList9.add(next2);
                }
            }
            for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1 z1Var6 : kz5.n0.S0(arrayList9)) {
                if (z1Var6.getFeedObject().getMediaType() != 15) {
                    z1Var6.getFeedObject().m59358xc5f6eaef(0);
                    cu2.t tVar = cu2.u.f303974a;
                    tVar.p(z1Var6.getFeedObject());
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 p17 = tVar.p(z1Var6.getFeedObject());
                    p17.k1(z19);
                    arrayList7.add(p17);
                }
            }
            arrayList6.addAll(arrayList7);
            m56387xe6796cde.addAll(arrayList6);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = m56068x4905e9fa2.mo7946xf939df19();
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = mo7946xf939df19 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df19 : null;
            if (c22848x6ddd90cf != null) {
                c22848x6ddd90cf.m8146xced61ae5();
            }
            java.util.Iterator it11 = m56387xe6796cde.iterator();
            int i29 = 0;
            while (true) {
                if (!it11.hasNext()) {
                    i19 = -1;
                    break;
                }
                if (((so2.j5) it11.next()).mo2128x1ed62e84() == z1Var.mo2128x1ed62e84()) {
                    i19 = i29;
                    break;
                }
                i29++;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.AbstractC13819x84acce8e abstractC13819x84acce8e2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14104x32508bfe) s1Var3.f203954a).F;
            if (abstractC13819x84acce8e2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedLoader");
                throw null;
            }
            yz5.a aVar = abstractC13819x84acce8e2.f187692f;
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
            i18 = i19;
        }
        java.util.ArrayList arrayList10 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList10.add(0);
        arrayList10.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList10);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 c15415x74224fd84 = c15415x74224fd83;
        yj0.a.d(c15415x74224fd84, arrayList10.toArray(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerPresenter$getAdapter$2", "onItemClick", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroid/view/View;ILcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        c15415x74224fd83.P(((java.lang.Integer) arrayList10.get(0)).intValue(), ((java.lang.Integer) arrayList10.get(1)).intValue());
        yj0.a.f(c15415x74224fd84, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerPresenter$getAdapter$2", "onItemClick", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroid/view/View;ILcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        m56068x4905e9fa2.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.u0(s1Var3, m56068x4905e9fa2, c15415x74224fd83));
        java.util.Iterator it12 = s1Var3.f203955b.f203829a.iterator();
        while (true) {
            if (!it12.hasNext()) {
                obj = null;
                break;
            }
            obj = it12.next();
            so2.j5 j5Var4 = (so2.j5) obj;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1 z1Var7 = j5Var4 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1) j5Var4 : null;
            if (z1Var7 != null && z1Var7.f204041d) {
                break;
            }
        }
        so2.j5 j5Var5 = (so2.j5) obj;
        if (j5Var5 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1 z1Var8 = j5Var5 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1) j5Var5 : null;
            if (z1Var8 != null) {
                z1Var8.f204041d = false;
            }
        }
        java.util.Iterator it13 = s1Var3.f203955b.f203829a.iterator();
        while (true) {
            if (it13.hasNext()) {
                obj2 = it13.next();
                if (((so2.j5) obj2).mo2128x1ed62e84() == z1Var.mo2128x1ed62e84()) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        so2.j5 j5Var6 = (so2.j5) obj2;
        if (j5Var6 != null) {
            boolean z27 = j5Var6 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1;
            if (z27) {
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1 z1Var9 = z27 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1) j5Var6 : null;
            if (z1Var9 != null) {
                z1Var9.f204041d = true;
            }
        }
        adapter.m8146xced61ae5();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.C14604x9e435b69 c14604x9e435b693 = s1Var3.f203957d;
        if (c14604x9e435b693 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("drawer");
            throw null;
        }
        c14604x9e435b693.u();
    }
}
