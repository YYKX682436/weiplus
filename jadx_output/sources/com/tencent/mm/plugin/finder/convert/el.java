package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public class el extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.afg;
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.View p17 = holder.p(com.tencent.mm.R.id.ffc);
        p17.post(new com.tencent.mm.plugin.finder.convert.dl(p17));
    }

    @Override // in5.r
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void h(in5.s0 holder, so2.v1 item, int i17, int i18, boolean z17, java.util.List list) {
        android.view.View view;
        java.lang.String str;
        com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo;
        java.lang.String str2;
        boolean z18;
        java.lang.String string;
        java.lang.String str3;
        r45.kj kjVar;
        r45.kj kjVar2;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.view.View p17 = holder.p(com.tencent.mm.R.id.ffc);
        ya2.b2 b2Var = item.f410645d;
        int i19 = b2Var.K2 & 4;
        mn2.g1 g1Var = mn2.g1.f329975a;
        android.content.Context context = holder.f293121e;
        if (i19 > 0) {
            android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.a_4);
            android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.kbq);
            android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.a89);
            android.widget.ImageView imageView2 = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.f483299a85);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.frp);
            android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.eom);
            vo0.d a17 = g1Var.a();
            str = "";
            view = p17;
            mn2.n nVar = new mn2.n(b2Var.u0(), null, 2, null);
            kotlin.jvm.internal.o.d(imageView);
            a17.c(nVar, imageView, g1Var.h(mn2.f1.f329957h));
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            r45.xk b17 = ya2.d.b(b2Var, false);
            java.lang.String string2 = b17 != null ? b17.getString(1) : null;
            ((ke0.e) xVar).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, string2));
            r45.xk b18 = ya2.d.b(b2Var, false);
            int integer = (b18 == null || (kjVar2 = (r45.kj) b18.getCustom(5)) == null) ? 0 : kjVar2.getInteger(0);
            textView2.setVisibility(8);
            textView3.setVisibility(0);
            r45.xk b19 = ya2.d.b(b2Var, false);
            java.lang.String string3 = b19 != null ? b19.getString(6) : null;
            if (string3 == null || string3.length() == 0) {
                string = context.getResources().getString(com.tencent.mm.R.string.f490728aj1);
                z18 = false;
            } else {
                z18 = false;
                r45.xk b27 = ya2.d.b(b2Var, false);
                string = b27 != null ? b27.getString(6) : null;
            }
            textView3.setText(string);
            r45.xk b28 = ya2.d.b(b2Var, z18);
            com.tencent.mm.protocal.protobuf.FinderAuthInfo e17 = b28 != null ? ya2.d.e(b28) : null;
            kotlin.jvm.internal.o.d(context);
            o(weImageView, imageView2, b2Var, e17, context);
            if (integer == 1) {
                r45.xk b29 = ya2.d.b(b2Var, false);
                if (b29 == null || (kjVar = (r45.kj) b29.getCustom(5)) == null || (str3 = kjVar.getString(2)) == null) {
                    str3 = str;
                }
                if (str3.length() > 0) {
                    textView2.setVisibility(0);
                    textView2.setText(str3);
                }
            } else if (integer == 2) {
                textView2.setVisibility(8);
            } else if (integer != 100) {
                com.tencent.mars.xlog.Log.i("FinderFollowConvert", "biz unSupport iconType: " + integer);
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(8);
            }
        } else {
            view = p17;
            str = "";
            android.widget.ImageView imageView3 = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.a_4);
            android.widget.TextView textView4 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.kbq);
            android.widget.TextView textView5 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.a89);
            android.widget.ImageView imageView4 = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.f483299a85);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.frp);
            android.widget.TextView textView6 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.eom);
            vo0.d a18 = g1Var.a();
            mn2.n nVar2 = new mn2.n(b2Var.getAvatarUrl(), null, 2, null);
            kotlin.jvm.internal.o.d(imageView3);
            a18.c(nVar2, imageView3, g1Var.h(mn2.f1.f329957h));
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String w07 = b2Var.w0();
            ((ke0.e) xVar2).getClass();
            textView4.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, w07));
            com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo2 = b2Var.field_authInfo;
            int authIconType = finderAuthInfo2 != null ? finderAuthInfo2.getAuthIconType() : 0;
            textView5.setVisibility(8);
            textView6.setVisibility(8);
            r45.xk b37 = ya2.d.b(b2Var, false);
            if (b37 == null || (finderAuthInfo = ya2.d.e(b37)) == null) {
                finderAuthInfo = b2Var.field_authInfo;
            }
            kotlin.jvm.internal.o.d(context);
            o(weImageView2, imageView4, b2Var, finderAuthInfo, context);
            if (authIconType == 1) {
                com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo3 = b2Var.field_authInfo;
                if (finderAuthInfo3 == null || (str2 = finderAuthInfo3.getAuthProfession()) == null) {
                    str2 = str;
                }
                if (str2.length() > 0) {
                    textView5.setVisibility(0);
                    textView5.setText(str2);
                }
            } else if (authIconType != 2) {
                if (authIconType != 100) {
                    com.tencent.mars.xlog.Log.i("FinderFollowConvert", "unSupport iconType: " + authIconType);
                    textView5.setVisibility(8);
                } else {
                    textView5.setVisibility(8);
                }
            }
        }
        if (b2Var.field_liveStatus != 1) {
            android.view.View view2 = view;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFollowConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFollowData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/convert/FinderFollowConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFollowData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.lang.Object parent = view2.getParent();
            android.view.View view3 = parent instanceof android.view.View ? (android.view.View) parent : null;
            if (view3 == null) {
                return;
            }
            view3.setTouchDelegate(null);
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        java.lang.String str4 = str;
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFollowConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFollowData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view4 = view;
        view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/finder/convert/FinderFollowConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFollowData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(view4, "living_label");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(view4, 40, 26236);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(view4, kz5.c1.k(new jz5.l("feed_id", str4), new jz5.l("live_id", str4), new jz5.l("comment_scene", "12"), new jz5.l("finder_username", b2Var.D0()), new jz5.l("session_buffer", " ")));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(view4, com.tencent.mm.plugin.finder.convert.bl.f102983a);
        view4.setOnClickListener(new com.tencent.mm.plugin.finder.convert.cl(view4, holder, item, b2Var));
    }

    public final void o(com.tencent.mm.ui.widget.imageview.WeImageView weImageView, android.widget.ImageView imageView, ya2.b2 b2Var, com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo, android.content.Context context) {
        r45.ub1 ub1Var = b2Var.L2;
        com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo2 = ub1Var != null ? (com.tencent.mm.protocal.protobuf.FinderAuthInfo) ub1Var.getCustom(1) : null;
        boolean z17 = ub1Var != null && ub1Var.getInteger(0) == 1;
        if (!((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.L1().r()).booleanValue()) {
            if (weImageView != null) {
                weImageView.setVisibility(8);
            }
            if (imageView != null) {
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                zy2.tb.a(ya2.m1.f460511a, imageView, finderAuthInfo, 0, 4, null);
                return;
            }
            return;
        }
        if (weImageView == null || imageView == null) {
            return;
        }
        com.tencent.mm.plugin.finder.assist.c3 c3Var = com.tencent.mm.plugin.finder.assist.c3.f102052a;
        if (finderAuthInfo2 == null) {
            finderAuthInfo2 = finderAuthInfo;
        }
        c3Var.a(weImageView, imageView, z17, finderAuthInfo2, (b2Var.K2 & 2) > 0, context);
    }
}
