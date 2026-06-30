package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public abstract class em extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final int f103269e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.convert.bm f103270f;

    public em(int i17, com.tencent.mm.plugin.finder.convert.bm data) {
        kotlin.jvm.internal.o.g(data, "data");
        this.f103269e = i17;
        this.f103270f = data;
    }

    @Override // in5.r
    public int e() {
        return this.f103269e;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        android.text.SpannableString spannableString;
        android.widget.ImageView imageView;
        com.tencent.mm.plugin.finder.feed.widget.FinderLiveMentionTitleView finderLiveMentionTitleView;
        cd2.b item = (cd2.b) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        boolean z18 = list == null || list.isEmpty();
        cd2.c cVar2 = item.f40655d;
        if (!z18) {
            for (java.lang.Object obj : list) {
                if (kotlin.jvm.internal.o.b(obj, 1)) {
                    n(holder, item);
                } else if (kotlin.jvm.internal.o.b(obj, 2)) {
                    com.tencent.mm.plugin.finder.feed.widget.FinderLiveMentionTitleView finderLiveMentionTitleView2 = (com.tencent.mm.plugin.finder.feed.widget.FinderLiveMentionTitleView) holder.p(com.tencent.mm.R.id.f485897rx5);
                    if (finderLiveMentionTitleView2 != null) {
                        finderLiveMentionTitleView2.b(o(cVar2, java.lang.Boolean.TRUE));
                    }
                } else if (kotlin.jvm.internal.o.b(obj, 3) && (finderLiveMentionTitleView = (com.tencent.mm.plugin.finder.feed.widget.FinderLiveMentionTitleView) holder.p(com.tencent.mm.R.id.f485897rx5)) != null) {
                    finderLiveMentionTitleView.b(o(cVar2, java.lang.Boolean.FALSE));
                }
            }
            return;
        }
        jz5.f0 f0Var = null;
        if (!cVar2.t() && (imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.e_c)) != null) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.m1 m1Var = ya2.m1.f460511a;
            com.tencent.mm.protocal.protobuf.FinderContact b17 = cVar2.b();
            zy2.tb.a(m1Var, imageView, b17 != null ? b17.getAuthInfo() : null, 0, 4, null);
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ag6);
        if (textView != null) {
            textView.setVisibility(item.f40656e ? 0 : 8);
        }
        android.content.Context context = holder.f293121e;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479723df);
        android.view.View p17 = holder.p(com.tencent.mm.R.id.a_4);
        if (p17 != null) {
            p17.getLayoutParams().width = dimensionPixelSize;
            p17.getLayoutParams().height = dimensionPixelSize;
        }
        android.widget.ImageView imageView2 = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.f485546i22);
        if (imageView2 != null && (imageView2.getLayoutParams() instanceof android.widget.LinearLayout.LayoutParams)) {
            android.view.ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.setMargins(context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479734dr), 0, 0, 0);
            }
        }
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ag6);
        if (textView2 != null) {
            textView2.setTextSize(1, 14.0f);
        }
        com.tencent.mm.plugin.finder.convert.am amVar = (com.tencent.mm.plugin.finder.convert.am) this;
        cd2.c cVar3 = ((cd2.d) item).f40655d;
        mn2.n nVar = new mn2.n(cVar3.h(), null, 2, null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderLiveMention username ");
        java.lang.String q17 = cVar3.q();
        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (q17 == null) {
            q17 = "";
        }
        sb6.append(q17);
        sb6.append(", nickename ");
        java.lang.String k17 = cVar3.k();
        if (k17 == null) {
            k17 = "";
        }
        sb6.append(k17);
        sb6.append(", url ");
        java.lang.String h17 = cVar3.h();
        sb6.append(h17 != null ? h17 : "");
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = amVar.f102893g;
        com.tencent.mars.xlog.Log.i(str, sb7);
        com.tencent.mars.xlog.Log.i(str, "FinderLiveMention flag " + cVar3.f() + " content " + com.tencent.mm.sdk.platformtools.t8.G1(cVar3.c()) + " id " + cVar3.i() + " time " + cVar3.d());
        android.widget.ImageView imageView3 = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.a_4);
        mn2.g1 g1Var = mn2.g1.f329975a;
        if (imageView3 != null) {
            boolean z27 = ((2 & cVar3.f()) == 0 && (cVar3.f() & 1) == 0) ? false : true;
            pf5.u uVar = pf5.u.f353936a;
            (z27 ? new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) uVar.e(zy2.b6.class).c(mn2.i4.class))).K).getValue()) : new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) uVar.e(zy2.b6.class).c(mn2.i4.class))).L).getValue())).c(nVar, imageView3, g1Var.h(z27 ? mn2.f1.f329957h : mn2.f1.f329961o));
        }
        com.tencent.mm.plugin.finder.feed.widget.FinderLiveMentionEllipsizeTextView finderLiveMentionEllipsizeTextView = (com.tencent.mm.plugin.finder.feed.widget.FinderLiveMentionEllipsizeTextView) holder.p(com.tencent.mm.R.id.f485991jt2);
        if (finderLiveMentionEllipsizeTextView != null) {
            java.lang.String c17 = cVar3.c();
            if (c17 != null) {
                i95.m c18 = i95.n0.c(zy2.s6.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                spannableString = zy2.s6.l6((zy2.s6) c18, c17, (int) finderLiveMentionEllipsizeTextView.getTextSize(), false, null, 0, false, null, 124, null);
            } else {
                spannableString = null;
            }
            finderLiveMentionEllipsizeTextView.setText(spannableString);
        }
        android.widget.ImageView imageView4 = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.o78);
        if (imageView4 != null) {
            java.lang.String r17 = cVar3.r();
            if (com.tencent.mm.sdk.platformtools.t8.K0(r17)) {
                r17 = null;
            }
            if (r17 != null) {
                imageView4.setVisibility(0);
                android.view.View p18 = holder.p(com.tencent.mm.R.id.o48);
                kotlin.jvm.internal.o.f(p18, "getView(...)");
                android.widget.TextView textView3 = (android.widget.TextView) p18;
                textView3.setVisibility(8);
                java.lang.String r18 = cVar3.r();
                if (com.tencent.mm.sdk.platformtools.t8.K0(r18)) {
                    imageView4.setVisibility(8);
                    if (cVar3.j() == 1) {
                        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                        android.content.Context context2 = textView3.getContext();
                        java.lang.String e17 = cVar3.e();
                        ((ke0.e) xVar).getClass();
                        textView3.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context2, e17));
                        textView3.setVisibility(0);
                    }
                } else {
                    g1Var.e().c(new mn2.q3(r18, com.tencent.mm.plugin.finder.storage.y90.f128356f), imageView4, g1Var.h(mn2.f1.f329963q));
                    imageView4.setVisibility(0);
                }
                f0Var = jz5.f0.f302826a;
            }
            if (f0Var == null) {
                imageView4.setVisibility(4);
            }
        }
        com.tencent.mars.xlog.Log.i("FinderMsgConvert", "onBindViewHolder: " + getClass().getCanonicalName());
        android.widget.ImageView imageView5 = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.a_4);
        if (imageView5 != null) {
            imageView5.setOnClickListener(new com.tencent.mm.plugin.finder.convert.cm(item, imageView5));
        }
        n(holder, item);
        super.h(holder, item, i17, i18, z17, list);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }

    public final boolean n(in5.s0 s0Var, cd2.b bVar) {
        com.tencent.mm.plugin.finder.feed.widget.FinderLiveMentionTitleView finderLiveMentionTitleView = (com.tencent.mm.plugin.finder.feed.widget.FinderLiveMentionTitleView) s0Var.p(com.tencent.mm.R.id.f485897rx5);
        boolean z17 = false;
        if (finderLiveMentionTitleView == null) {
            return false;
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        cd2.c cVar = bVar.f40655d;
        java.lang.String q17 = cVar.q();
        java.lang.String k17 = cVar.k();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(q17)) {
            i95.m c17 = i95.n0.c(c61.yb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            k17 = c61.yb.md((c61.yb) c17, q17 == null ? "" : q17, k17 == null ? "" : k17, false, 4, null);
        } else if (k17 == null) {
            k17 = "";
        }
        ((ke0.e) xVar).getClass();
        android.content.Context context = s0Var.f293121e;
        android.text.SpannableString i17 = com.tencent.mm.pluginsdk.ui.span.c0.i(context, k17);
        cd2.c cVar2 = bVar.f40655d;
        java.lang.String n17 = com.tencent.mm.plugin.finder.assist.w2.n(context, cVar2.d() * 1000);
        kotlin.jvm.internal.o.f(n17, "formatTimeInForMsg(...)");
        com.tencent.mm.protocal.protobuf.FinderContact b17 = cVar2.b();
        com.tencent.mm.protocal.protobuf.FinderAuthInfo authInfo = b17 != null ? b17.getAuthInfo() : null;
        if (!cVar2.t() && !cVar2.s()) {
            r45.ub1 g17 = cVar2.g();
            if (g17 != null && g17.getInteger(0) == 1) {
                z17 = true;
            }
        }
        finderLiveMentionTitleView.a(new jd2.e(i17, n17, authInfo, z17, o(cVar2, null), cVar2.p()));
        finderLiveMentionTitleView.setListener(new com.tencent.mm.plugin.finder.convert.dm(this, s0Var, bVar));
        return true;
    }

    public final boolean o(cd2.c cVar, java.lang.Boolean bool) {
        int i17 = this.f103270f.f102984a;
        if ((i17 == 2 || i17 == 1) && ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.U1().r()).intValue() != 0) {
            return (cVar.t() || !cVar.s() || (bool != null ? bool.booleanValue() : ya2.g.h(ya2.h.f460484a, cVar.q(), null, false, false, 14, null))) ? false : true;
        }
        return false;
    }
}
