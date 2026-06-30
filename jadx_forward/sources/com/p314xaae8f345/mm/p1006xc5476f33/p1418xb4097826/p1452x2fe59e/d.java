package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public abstract class d extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 {

    /* renamed from: u, reason: collision with root package name */
    public final p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 f188055u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f188056v;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf r12, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 r13, int r14, int r15, boolean r16, int r17, p3321xbce91901.jvm.p3324x21ffc6bd.i r18) {
        /*
            r11 = this;
            r9 = r11
            r10 = r13
            r0 = r17 & 16
            if (r0 == 0) goto L9
            r0 = 0
            r4 = r0
            goto Lb
        L9:
            r4 = r16
        Lb:
            java.lang.String r0 = "context"
            r1 = r12
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r12, r0)
            java.lang.String r0 = "fragment"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r13, r0)
            r5 = 0
            r6 = 0
            r7 = 48
            r8 = 0
            r0 = r11
            r2 = r14
            r3 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.f188055u = r10
            java.lang.String r0 = "Finder.FinderAllFeedUIContract.AllFeedViewCallback"
            r9.f188056v = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.d.<init>(com.tencent.mm.ui.MMActivity, androidx.fragment.app.Fragment, int, int, boolean, int, kotlin.jvm.internal.i):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public java.lang.CharSequence B(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public void K(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        int a07 = i17 - ((in5.n0) adapter).a0();
        if (a07 < 0 || a07 >= z().f188689e.m56393xfb854877()) {
            return;
        }
        so2.j5 j5Var = (so2.j5) z().f188689e.m56388xcaeb60d0().get(a07);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onGridItemClick dataList:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa<T> m56388xcaeb60d0 = z().f188689e.m56388xcaeb60d0();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m56388xcaeb60d0, 10));
        for (T t17 : m56388xcaeb60d0) {
            arrayList.add("type:" + t17.h() + "_id:" + t17.mo2128x1ed62e84());
        }
        sb6.append(arrayList);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f188056v;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
        boolean z17 = j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = this.f187707d;
        boolean z18 = false;
        java.lang.Integer num = null;
        num = null;
        if (z17) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("onGridItemClick ");
            sb8.append(a07);
            sb8.append(" id:");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var;
            sb8.append(abstractC14490x69736cb5.getFeedObject().m59251x5db1b11());
            sb8.append(", pos:");
            sb8.append(i17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb8.toString());
            if (abstractC14490x69736cb5.getFeedObject().m59311x25315bf4()) {
                r45.nw1 m59258xd0557130 = abstractC14490x69736cb5.getFeedObject().m59258xd0557130();
                if (m59258xd0557130 != null && m59258xd0557130.m75939xb282bd08(2) == 2) {
                    z18 = true;
                }
                if (z18) {
                    long m59251x5db1b11 = abstractC14490x69736cb5.getFeedObject().m59251x5db1b11();
                    java.lang.String m59276x6c285d75 = abstractC14490x69736cb5.getFeedObject().m59276x6c285d75();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
                    new db2.g4(m59251x5db1b11, m59276x6c285d75, 279, 1, "", true, null, null, 0L, null, false, false, null, nyVar != null ? nyVar.V6() : null, 0, null, false, null, null, null, null, null, 0, 0, null, null, false, abstractC14490x69736cb5.w(), null, 402644928, null).l().h(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.b(j5Var, this, a07, view));
                    return;
                }
            }
            W(abstractC14490x69736cb5, a07, view);
            return;
        }
        if (j5Var instanceof so2.a0) {
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder("onGridItemClick item pos:");
            sb9.append(i17);
            sb9.append(" fixPos:");
            sb9.append(a07);
            sb9.append(" topicId ");
            so2.a0 a0Var = (so2.a0) j5Var;
            r45.vx0 vx0Var = (r45.vx0) a0Var.f491777d.m75936x14adae67(2);
            sb9.append(pm0.v.u(vx0Var != null ? vx0Var.m75942xfb822ef2(0) : 0L));
            sb9.append('}');
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb9.toString());
            r45.vx0 vx0Var2 = (r45.vx0) a0Var.f491777d.m75936x14adae67(2);
            if (vx0Var2 != null) {
                android.content.Intent intent = new android.content.Intent();
                ya2.b2 b2Var = a0Var.f491778e;
                intent.putExtra("collection_info", vx0Var2.mo14344x5f01b1f6());
                intent.putExtra("collection_author_username", b2Var != null ? b2Var.D0() : null);
                intent.putExtra("collection_nickname", b2Var != null ? b2Var.w0() : null);
                intent.putExtra("collection_avatar_url", b2Var != null ? b2Var.m176700xe5e0d2a0() : null);
                intent.putExtra("collection_authicon_url", (b2Var == null || (c19780xceb4c4dc2 = b2Var.f69300x731cac1b) == null) ? null : c19780xceb4c4dc2.m76028x11716638());
                if (b2Var != null && (c19780xceb4c4dc = b2Var.f69300x731cac1b) != null) {
                    num = java.lang.Integer.valueOf(c19780xceb4c4dc.m76027x1cbb0791());
                }
                intent.putExtra("collection_authicon_type", num);
                intent.putExtra("collection_ref_comment_scene", 349);
                intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13940x9a1c0918.class);
                wa2.x.e(intent, view, 0L, false, false, null, 30, null);
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f187707d;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(abstractActivityC21394xb3d2c0cf, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderAllFeedUIContract$AllFeedViewCallback", "onGridItemClick", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroid/view/View;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                abstractActivityC21394xb3d2c0cf.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(abstractActivityC21394xb3d2c0cf, "com/tencent/mm/plugin/finder/feed/FinderAllFeedUIContract$AllFeedViewCallback", "onGridItemClick", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroid/view/View;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public void M() {
        if (z().f188689e.m56393xfb854877() <= this.f187712i * 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122 = z().f188689e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(abstractC13919x46aff122, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderMixAllFeedLoader");
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13877xf5f46f3c) abstractC13919x46aff122).f189061g) {
                com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00.K(this.f187713m, false, 1, null);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public boolean R() {
        return !(this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xa);
    }

    public final void W(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, int i17, android.view.View view) {
        int i18;
        java.lang.Integer num;
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k0 z17 = z();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122 = z17.f188689e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa m56387xe6796cde = abstractC13919x46aff122.m56387xe6796cde();
        java.lang.Integer num2 = null;
        if (!(m56387xe6796cde instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa)) {
            m56387xe6796cde = null;
        }
        int i19 = 1;
        if (m56387xe6796cde != null) {
            java.util.Iterator<T> it = abstractC13919x46aff122.m56387xe6796cde().iterator();
            while (it.hasNext()) {
                so2.j5 j5Var = (so2.j5) it.next();
                if (j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var).getFeedObject().m59358xc5f6eaef(0);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator<T> it6 = m56387xe6796cde.iterator();
            while (it6.hasNext()) {
                java.lang.Object next = it6.next();
                if (!(((so2.j5) next) instanceof so2.a0)) {
                    arrayList2.add(next);
                }
            }
            arrayList.addAll(arrayList2);
        }
        pm0.v.b0(arrayList, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c(abstractC14490x69736cb5));
        java.util.Iterator it7 = arrayList.iterator();
        int i27 = 0;
        while (true) {
            if (!it7.hasNext()) {
                i27 = -1;
                break;
            } else {
                if (((so2.j5) it7.next()).mo2128x1ed62e84() == abstractC14490x69736cb5.mo2128x1ed62e84()) {
                    break;
                } else {
                    i27++;
                }
            }
        }
        if (i27 < 0 || i27 == i17) {
            i18 = i17;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f188056v, "saveCache modify pos from " + i17 + " to " + i27);
            i18 = i27;
        }
        abstractC13919x46aff122.m56366xc4abae6c(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r9(arrayList, abstractC13919x46aff122.m56357x44e5026c(), i18, null, null, 16, null), intent);
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment = this.f188055u;
        boolean z18 = fragment instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.C15115xd2dec60f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.C15115xd2dec60f c15115xd2dec60f = z18 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.C15115xd2dec60f) fragment : null;
        if (c15115xd2dec60f != null) {
            int i28 = c15115xd2dec60f.f210798p;
            if (i28 == 100) {
                i19 = 2;
            } else if (i28 != 102) {
                i19 = 7;
            }
            num = java.lang.Integer.valueOf(i19);
        } else {
            num = null;
        }
        intent.putExtra("TabFlag", num);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.C15115xd2dec60f c15115xd2dec60f2 = z18 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.C15115xd2dec60f) fragment : null;
        if (c15115xd2dec60f2 != null) {
            num2 = java.lang.Integer.valueOf(c15115xd2dec60f2.f210798p == 10001 ? 3 : 0);
        }
        intent.putExtra("ItemFlag", num2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy iyVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1;
        iyVar.c(this.f187707d, intent);
        wa2.x.e(intent, view, 0L, false, false, wa2.u.Ui(wa2.u.f525714d, m56022x4905e9fa(), abstractC14490x69736cb5.getFeedObject().m59251x5db1b11(), z().f188689e.m56388xcaeb60d0(), null, 8, null), 14, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
        android.content.Context context = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        android.app.Activity activity = (android.app.Activity) context;
        i0Var.getClass();
        intent.setClass(activity, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13934x1991c070.class);
        iyVar.c(activity, intent);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(intent);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(activity, arrayList3.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterAllTimelineUI", "(Landroid/app/Activity;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList3.get(0));
        yj0.a.f(activity, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterAllTimelineUI", "(Landroid/app/Activity;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.b(fragment).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        long mo2128x1ed62e84 = abstractC14490x69736cb5.mo2128x1ed62e84();
        java.lang.String w17 = abstractC14490x69736cb5.w();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa = this.f187713m.m82555x4905e9fa();
        java.lang.String jSONObject = abstractC14490x69736cb5.getUdfKv().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.wj((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17, V6, mo2128x1ed62e84, w17, m82555x4905e9fa, 0, jSONObject, 0L, null, 208, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.l0.f206642a.b(V6, abstractC14490x69736cb5, 18);
    }

    @Override // fs2.c
    /* renamed from: getActivity */
    public com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f mo978x19263085() {
        return this.f187707d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public void r(java.util.ArrayList data) {
        fc2.o Z6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        super.r(data);
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment = this.f188055u;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.b(fragment).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        if (nyVar == null || (Z6 = nyVar.Z6(-1)) == null) {
            return;
        }
        Z6.d(m56022x4905e9fa());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public java.lang.String s(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public android.view.View t() {
        return this.f187707d.findViewById(com.p314xaae8f345.mm.R.id.f565762dg3);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public android.view.View w() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 x() {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.jj0) this.f187717q).getClass();
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ij0();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager y(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return this.f187717q.d(context);
    }
}
