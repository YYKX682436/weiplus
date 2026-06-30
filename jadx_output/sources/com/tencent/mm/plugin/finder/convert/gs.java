package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class gs extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f103510e = {com.tencent.mm.R.id.t0u, com.tencent.mm.R.id.t0v, com.tencent.mm.R.id.t0w};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f103511f = {com.tencent.mm.R.id.t0x, com.tencent.mm.R.id.t0y, com.tencent.mm.R.id.t0z};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f103512g = {com.tencent.mm.R.id.f483973t11, com.tencent.mm.R.id.f483974t12, com.tencent.mm.R.id.f483975t13};

    public static final int n(com.tencent.mm.plugin.finder.convert.gs gsVar, in5.s0 s0Var) {
        gsVar.getClass();
        java.lang.Object tag = s0Var.itemView.getTag(com.tencent.mm.R.id.ury);
        java.lang.Integer num = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.edb;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.tencent.mm.plugin.finder.report.d2 d2Var;
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
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        so2.t4 item = (so2.t4) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.vjb);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.vja);
        if (textView != null) {
            textView.setText(item.f410607d);
        }
        java.lang.String str4 = item.f410608e;
        if (textView2 != null) {
            textView2.setText(str4);
        }
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        in5.s0 s0Var2 = holder;
        int i28 = 0;
        while (true) {
            d2Var = com.tencent.mm.plugin.finder.report.d2.f124994a;
            str = str4;
            j17 = item.f410609f;
            i19 = item.f410613m;
            list2 = item.f410611h;
            if (i28 >= 3) {
                break;
            }
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) s0Var2.p(f103510e[i28]);
            if (i28 < list2.size()) {
                if (frameLayout != null) {
                    frameLayout.setVisibility(0);
                }
                com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) list2.get(i28);
                com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderObject.getObjectDesc();
                com.tencent.mm.protocal.protobuf.FinderMedia finderMedia = (objectDesc == null || (media = objectDesc.getMedia()) == null) ? null : (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media);
                android.widget.ImageView imageView = (android.widget.ImageView) s0Var2.p(f103511f[i28]);
                if (imageView != null) {
                    if (finderMedia != null) {
                        r45.mb4 i29 = bu2.z.i(finderMedia);
                        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(finderMedia.getCoverUrl());
                        mn2.g1 g1Var = mn2.g1.f329975a;
                        if (K0) {
                            g1Var.e().c(new mn2.c1(i29, com.tencent.mm.plugin.finder.storage.y90.f128356f, null, null, 12, null), imageView, g1Var.h(mn2.f1.B));
                        } else {
                            g1Var.e().c(new mn2.r3(i29, com.tencent.mm.plugin.finder.storage.y90.f128355e, null, 4, null), imageView, g1Var.h(mn2.f1.B));
                        }
                    }
                    t4Var2 = item;
                    i27 = i28;
                    imageView.setOnClickListener(new com.tencent.mm.plugin.finder.convert.cs(item, i28, finderObject, this, holder));
                    jz5.l[] lVarArr = new jz5.l[9];
                    lVarArr[0] = new jz5.l("finder_context_id", V6 != null ? V6.getString(1) : null);
                    lVarArr[1] = new jz5.l("finder_tab_context_id", V6 != null ? V6.getString(2) : null);
                    lVarArr[2] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.getInteger(5)) : null);
                    str3 = str;
                    lVarArr[3] = new jz5.l("cluster_reason_recommendation", str3);
                    lVarArr[4] = new jz5.l("cluster_id", pm0.v.u(j17));
                    lVarArr[5] = new jz5.l("card_index", java.lang.Integer.valueOf(i27 + 1));
                    lVarArr[6] = new jz5.l("session_buffer", finderObject.getSessionBuffer());
                    lVarArr[7] = new jz5.l("feed_id", pm0.v.u(finderObject.getId()));
                    lVarArr[8] = new jz5.l("cluster_profile_type", java.lang.Integer.valueOf(i19));
                    d2Var.n(imageView, "cluster_profile_card", (r20 & 4) != 0 ? 40 : 40, (r20 & 8) != 0 ? 25496 : 0, (r20 & 16) != 0 ? false : false, (r20 & 32) != 0 ? false : false, (r20 & 64) != 0 ? null : kz5.c1.k(lVarArr), (r20 & 128) != 0 ? null : null);
                } else {
                    t4Var2 = item;
                    i27 = i28;
                    str3 = str;
                }
                s0Var = holder;
                android.widget.TextView textView3 = (android.widget.TextView) s0Var.p(f103512g[i27]);
                if (finderObject.getLikeCount() > 0) {
                    if (textView3 != null) {
                        textView3.setVisibility(0);
                    }
                    if (textView3 != null) {
                        textView3.setText(com.tencent.mm.plugin.finder.assist.w2.g(2, finderObject.getLikeCount()));
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
        android.view.View p17 = s0Var2.p(com.tencent.mm.R.id.ury);
        o(s0Var2, t4Var3.f410610g);
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        jz5.l[] lVarArr2 = new jz5.l[8];
        if (V6 != null) {
            str2 = V6.getString(1);
            view = p17;
        } else {
            view = p17;
            str2 = null;
        }
        lVarArr2[0] = new jz5.l("finder_context_id", str2);
        lVarArr2[1] = new jz5.l("finder_tab_context_id", V6 != null ? V6.getString(2) : null);
        lVarArr2[2] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.getInteger(5)) : null);
        lVarArr2[3] = new jz5.l("source_comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.getInteger(7)) : null);
        lVarArr2[4] = new jz5.l("cluster_profile_type", java.lang.Integer.valueOf(i19));
        lVarArr2[5] = new jz5.l("cluster_reason_recommendation", str);
        lVarArr2[6] = new jz5.l("cluster_id", pm0.v.u(j17));
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list2, 10));
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(pm0.v.u(((com.tencent.mm.protocal.protobuf.FinderObject) it.next()).getId()));
        }
        lVarArr2[7] = new jz5.l("feedid_list", kz5.n0.g0(arrayList, "#", null, null, 0, null, null, 62, null));
        h0Var.f310123d = kz5.c1.k(lVarArr2);
        if (view != null) {
            int i37 = t4Var3.f410610g;
            if (i37 == 0) {
                view3 = view;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderPostPlaySquareContainerConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderPostPlaySquareContainerData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/convert/FinderPostPlaySquareContainerConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderPostPlaySquareContainerData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (i37 == 1) {
                view3 = view;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderPostPlaySquareContainerConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderPostPlaySquareContainerData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/convert/FinderPostPlaySquareContainerConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderPostPlaySquareContainerData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (i37 != 2) {
                view3 = view;
            } else {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/FinderPostPlaySquareContainerConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderPostPlaySquareContainerData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3 = view;
                view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/convert/FinderPostPlaySquareContainerConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderPostPlaySquareContainerData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            view2 = view3;
            t4Var = t4Var3;
            view2.setOnClickListener(new com.tencent.mm.plugin.finder.convert.ds(this, holder, t4Var3, view3, h0Var));
        } else {
            view2 = view;
            t4Var = t4Var3;
        }
        android.view.View p18 = holder.p(com.tencent.mm.R.id.vb6);
        if (p18 != null) {
            p18.setOnClickListener(new com.tencent.mm.plugin.finder.convert.es(t4Var, this, holder));
        }
        kotlin.jvm.internal.o.d(view2);
        d2Var.n(view2, "cluster_profile_shoot", (r20 & 4) != 0 ? 40 : 32, (r20 & 8) != 0 ? 25496 : 0, (r20 & 16) != 0 ? false : false, (r20 & 32) != 0 ? false : false, (r20 & 64) != 0 ? null : (java.util.Map) h0Var.f310123d, (r20 & 128) != 0 ? null : new com.tencent.mm.plugin.finder.convert.fs(this, holder));
        if (p18 != null) {
            d2Var.n(p18, "cluster_profile_bar", (r20 & 4) != 0 ? 40 : 40, (r20 & 8) != 0 ? 25496 : 0, (r20 & 16) != 0 ? false : false, (r20 & 32) != 0 ? false : false, (r20 & 64) != 0 ? null : (java.util.Map) h0Var.f310123d, (r20 & 128) != 0 ? null : null);
        }
    }

    public final void o(in5.s0 s0Var, int i17) {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) s0Var.p(com.tencent.mm.R.id.uru);
        android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.urv);
        android.content.Context context = s0Var.f293121e;
        if (i17 == 1) {
            if (textView != null) {
                textView.setText(context.getString(com.tencent.mm.R.string.p4g));
            }
            if (weImageView != null) {
                weImageView.setImageResource(com.tencent.mm.R.raw.icon_filled_subtract);
            }
        } else if (i17 == 2) {
            if (weImageView != null) {
                weImageView.setImageResource(com.tencent.mm.R.raw.icons_filled_done);
            }
            if (textView != null) {
                textView.setText(context.getString(com.tencent.mm.R.string.p4i));
            }
        }
        s0Var.itemView.setTag(com.tencent.mm.R.id.ury, java.lang.Integer.valueOf(i17));
    }
}
