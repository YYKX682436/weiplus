package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class gs extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f185043e = {com.p314xaae8f345.mm.R.id.t0u, com.p314xaae8f345.mm.R.id.t0v, com.p314xaae8f345.mm.R.id.t0w};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f185044f = {com.p314xaae8f345.mm.R.id.t0x, com.p314xaae8f345.mm.R.id.t0y, com.p314xaae8f345.mm.R.id.t0z};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f185045g = {com.p314xaae8f345.mm.R.id.f565506t11, com.p314xaae8f345.mm.R.id.f565507t12, com.p314xaae8f345.mm.R.id.f565508t13};

    public static final int n(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.gs gsVar, in5.s0 s0Var) {
        gsVar.getClass();
        java.lang.Object tag = s0Var.f3639x46306858.getTag(com.p314xaae8f345.mm.R.id.ury);
        java.lang.Integer num = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.edb;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2 d2Var;
        java.lang.String str;
        long j17;
        int i19;
        java.util.List list2;
        android.view.View view;
        java.lang.String str2;
        android.view.View view2;
        so2.t4 t4Var;
        android.view.View view3;
        so2.t4 t4Var2;
        int i27;
        java.lang.String str3;
        in5.s0 s0Var;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        so2.t4 item = (so2.t4) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.vjb);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.vja);
        if (textView != null) {
            textView.setText(item.f492140d);
        }
        java.lang.String str4 = item.f492141e;
        if (textView2 != null) {
            textView2.setText(str4);
        }
        android.content.Context context = holder.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        in5.s0 s0Var2 = holder;
        int i28 = 0;
        while (true) {
            d2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a;
            str = str4;
            j17 = item.f492142f;
            i19 = item.f492146m;
            list2 = item.f492144h;
            if (i28 >= 3) {
                break;
            }
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) s0Var2.p(f185043e[i28]);
            if (i28 < list2.size()) {
                if (frameLayout != null) {
                    frameLayout.setVisibility(0);
                }
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) list2.get(i28);
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = c19792x256d2725.m76802x2dd01666();
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e = (m76802x2dd01666 == null || (m76962x74cd162e = m76802x2dd01666.m76962x74cd162e()) == null) ? null : (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.Z(m76962x74cd162e);
                android.widget.ImageView imageView = (android.widget.ImageView) s0Var2.p(f185044f[i28]);
                if (imageView != null) {
                    if (c19788xd7cfd73e != null) {
                        r45.mb4 i29 = bu2.z.i(c19788xd7cfd73e);
                        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19788xd7cfd73e.m76585x66e287ae());
                        mn2.g1 g1Var = mn2.g1.f411508a;
                        if (K0) {
                            g1Var.e().c(new mn2.c1(i29, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f, null, null, 12, null), imageView, g1Var.h(mn2.f1.B));
                        } else {
                            g1Var.e().c(new mn2.r3(i29, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e, null, 4, null), imageView, g1Var.h(mn2.f1.B));
                        }
                    }
                    t4Var2 = item;
                    i27 = i28;
                    imageView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.cs(item, i28, c19792x256d2725, this, holder));
                    jz5.l[] lVarArr = new jz5.l[9];
                    lVarArr[0] = new jz5.l("finder_context_id", V6 != null ? V6.m75945x2fec8307(1) : null);
                    lVarArr[1] = new jz5.l("finder_tab_context_id", V6 != null ? V6.m75945x2fec8307(2) : null);
                    lVarArr[2] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.m75939xb282bd08(5)) : null);
                    str3 = str;
                    lVarArr[3] = new jz5.l("cluster_reason_recommendation", str3);
                    lVarArr[4] = new jz5.l("cluster_id", pm0.v.u(j17));
                    lVarArr[5] = new jz5.l("card_index", java.lang.Integer.valueOf(i27 + 1));
                    lVarArr[6] = new jz5.l("session_buffer", c19792x256d2725.m76829x97edf6c0());
                    lVarArr[7] = new jz5.l("feed_id", pm0.v.u(c19792x256d2725.m76784x5db1b11()));
                    lVarArr[8] = new jz5.l("cluster_profile_type", java.lang.Integer.valueOf(i19));
                    d2Var.n(imageView, "cluster_profile_card", (r20 & 4) != 0 ? 40 : 40, (r20 & 8) != 0 ? 25496 : 0, (r20 & 16) != 0 ? false : false, (r20 & 32) != 0 ? false : false, (r20 & 64) != 0 ? null : kz5.c1.k(lVarArr), (r20 & 128) != 0 ? null : null);
                } else {
                    t4Var2 = item;
                    i27 = i28;
                    str3 = str;
                }
                s0Var = holder;
                android.widget.TextView textView3 = (android.widget.TextView) s0Var.p(f185045g[i27]);
                if (c19792x256d2725.m76791xf4204902() > 0) {
                    if (textView3 != null) {
                        textView3.setVisibility(0);
                    }
                    if (textView3 != null) {
                        textView3.setText(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.g(2, c19792x256d2725.m76791xf4204902()));
                    }
                } else if (textView3 != null) {
                    textView3.setVisibility(8);
                }
                s0Var2 = s0Var;
            } else {
                t4Var2 = item;
                i27 = i28;
                str3 = str;
                s0Var = holder;
                if (frameLayout != null) {
                    frameLayout.setVisibility(4);
                }
            }
            str4 = str3;
            item = t4Var2;
            i28 = i27 + 1;
        }
        so2.t4 t4Var3 = item;
        android.view.View p17 = s0Var2.p(com.p314xaae8f345.mm.R.id.ury);
        o(s0Var2, t4Var3.f492143g);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        jz5.l[] lVarArr2 = new jz5.l[8];
        if (V6 != null) {
            str2 = V6.m75945x2fec8307(1);
            view = p17;
        } else {
            view = p17;
            str2 = null;
        }
        lVarArr2[0] = new jz5.l("finder_context_id", str2);
        lVarArr2[1] = new jz5.l("finder_tab_context_id", V6 != null ? V6.m75945x2fec8307(2) : null);
        lVarArr2[2] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.m75939xb282bd08(5)) : null);
        lVarArr2[3] = new jz5.l("source_comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.m75939xb282bd08(7)) : null);
        lVarArr2[4] = new jz5.l("cluster_profile_type", java.lang.Integer.valueOf(i19));
        lVarArr2[5] = new jz5.l("cluster_reason_recommendation", str);
        lVarArr2[6] = new jz5.l("cluster_id", pm0.v.u(j17));
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list2, 10));
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(pm0.v.u(((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) it.next()).m76784x5db1b11()));
        }
        lVarArr2[7] = new jz5.l("feedid_list", kz5.n0.g0(arrayList, "#", null, null, 0, null, null, 62, null));
        h0Var.f391656d = kz5.c1.k(lVarArr2);
        if (view != null) {
            int i37 = t4Var3.f492143g;
            if (i37 == 0) {
                view3 = view;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderPostPlaySquareContainerConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderPostPlaySquareContainerData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/convert/FinderPostPlaySquareContainerConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderPostPlaySquareContainerData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (i37 == 1) {
                view3 = view;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderPostPlaySquareContainerConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderPostPlaySquareContainerData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/convert/FinderPostPlaySquareContainerConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderPostPlaySquareContainerData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (i37 != 2) {
                view3 = view;
            } else {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/FinderPostPlaySquareContainerConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderPostPlaySquareContainerData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3 = view;
                view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/convert/FinderPostPlaySquareContainerConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderPostPlaySquareContainerData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            view2 = view3;
            t4Var = t4Var3;
            view2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ds(this, holder, t4Var3, view3, h0Var));
        } else {
            view2 = view;
            t4Var = t4Var3;
        }
        android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.vb6);
        if (p18 != null) {
            p18.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.es(t4Var, this, holder));
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view2);
        d2Var.n(view2, "cluster_profile_shoot", (r20 & 4) != 0 ? 40 : 32, (r20 & 8) != 0 ? 25496 : 0, (r20 & 16) != 0 ? false : false, (r20 & 32) != 0 ? false : false, (r20 & 64) != 0 ? null : (java.util.Map) h0Var.f391656d, (r20 & 128) != 0 ? null : new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.fs(this, holder));
        if (p18 != null) {
            d2Var.n(p18, "cluster_profile_bar", (r20 & 4) != 0 ? 40 : 40, (r20 & 8) != 0 ? 25496 : 0, (r20 & 16) != 0 ? false : false, (r20 & 32) != 0 ? false : false, (r20 & 64) != 0 ? null : (java.util.Map) h0Var.f391656d, (r20 & 128) != 0 ? null : null);
        }
    }

    public final void o(in5.s0 s0Var, int i17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) s0Var.p(com.p314xaae8f345.mm.R.id.uru);
        android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.urv);
        android.content.Context context = s0Var.f374654e;
        if (i17 == 1) {
            if (textView != null) {
                textView.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.p4g));
            }
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f79538x28c40d8b);
            }
        } else if (i17 == 2) {
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f79703xc84d169a);
            }
            if (textView != null) {
                textView.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.p4i));
            }
        }
        s0Var.f3639x46306858.setTag(com.p314xaae8f345.mm.R.id.ury, java.lang.Integer.valueOf(i17));
    }
}
