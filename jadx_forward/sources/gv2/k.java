package gv2;

/* loaded from: classes10.dex */
public final class k extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.d f357566e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f357567f;

    /* renamed from: g, reason: collision with root package name */
    public final int f357568g;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.d presenter, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(presenter, "presenter");
        this.f357566e = presenter;
        this.f357567f = z17;
        this.f357568g = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561255de);
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569389w;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        int i19;
        android.content.Context context;
        java.util.List m82898xfb7e5820;
        java.lang.Object obj;
        java.lang.String z07;
        jv2.d item = (jv2.d) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        holder.f374658i = item;
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.kbf);
        android.content.Context context2 = holder.f374654e;
        textView.setTextColor(context2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
        textView.setOnClickListener(null);
        holder.p(com.p314xaae8f345.mm.R.id.a_4).setOnClickListener(null);
        holder.w(com.p314xaae8f345.mm.R.id.f566597gf3, 8);
        holder.w(com.p314xaae8f345.mm.R.id.f567916l23, 8);
        java.lang.CharSequence f17 = k35.m1.f(context2, item.f383740d.u0().m76064x3febcdbf() * 1000, true, false);
        holder.s(com.p314xaae8f345.mm.R.id.f565385c85, f17);
        item.f383740d.D0();
        item.f383740d.y0();
        item.f383740d.j();
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.a_4);
        java.lang.String D0 = item.f383740d.D0();
        imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bhm);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, D0, null);
        imageView.setOnClickListener(new gv2.c(holder, D0, this));
        k12.r rVar = (k12.r) i95.n0.c(k12.r.class);
        android.content.Context context3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        textView.setText(((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).Ai(textView, D0, ((h12.b) rVar).Ai(context3, c01.a2.e(D0)), bi4.c.CONVERSATION_LIST, i65.a.h(context2, com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia)));
        textView.setOnClickListener(new gv2.d(holder, D0, this));
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.ehq);
        if (p17 != null) {
            item.f383740d.getClass();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        textView.setTextColor(context2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo));
        java.lang.Object obj2 = "";
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.d dVar = this.f357566e;
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176 c15258xcd50c176 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176) holder.p(com.p314xaae8f345.mm.R.id.f568176lz4);
            java.lang.Object obj3 = holder.f374658i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.uniComments.storge.TextStatusFeedComment");
            c15258xcd50c176.m61734x50e5c22f(((jv2.d) obj3).f383744h);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176 c15258xcd50c1762 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176) holder.p(com.p314xaae8f345.mm.R.id.c6d);
            java.lang.Object obj4 = holder.f374658i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj4, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.uniComments.storge.TextStatusFeedComment");
            c15258xcd50c1762.m61734x50e5c22f(((jv2.d) obj4).f383743g);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176 c15258xcd50c1763 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176) holder.p(com.p314xaae8f345.mm.R.id.c6d);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String j17 = item.f383740d.j();
            ((ke0.e) xVar).getClass();
            c15258xcd50c1763.m61745x765074af(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context2, j17));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onBindViewHolder replyCommentId:");
            sb6.append(item.f383740d.u0().m76092x604d5d06());
            sb6.append(", content:");
            java.lang.String m76095x978206e = item.f383740d.u0().m76095x978206e();
            if (m76095x978206e == null) {
                m76095x978206e = "";
            }
            sb6.append(m76095x978206e);
            sb6.append(", nickname:");
            sb6.append(item.f383740d.z0());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusFeedCommentConvert", sb6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176 c15258xcd50c1764 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176) holder.p(com.p314xaae8f345.mm.R.id.f568176lz4);
            if (item.f383740d.u0().m76092x604d5d06() == 0 || !this.f357567f) {
                holder.w(com.p314xaae8f345.mm.R.id.f568177lz5, 8);
                c15258xcd50c1764.m61745x765074af("");
            } else {
                holder.w(com.p314xaae8f345.mm.R.id.f568177lz5, 0);
                android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0) dVar).f211862n == 2) {
                    i95.m c17 = i95.n0.c(c61.yb.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    c61.yb ybVar = (c61.yb) c17;
                    java.lang.String m76096x37861b81 = item.f383740d.u0().m76096x37861b81();
                    z07 = c61.yb.md(ybVar, m76096x37861b81 == null ? "" : m76096x37861b81, item.f383740d.z0(), false, 4, null);
                } else {
                    z07 = item.f383740d.z0();
                }
                android.text.TextPaint m84162x74f59ea8 = c15258xcd50c1764.m61722x390676d5().m84162x74f59ea8();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m84162x74f59ea8, "getPaint(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
                java.lang.String f18 = hc2.f1.f(m84162x74f59ea8, z07, hc2.t.a(context2, t70Var.p2()), hc2.t.a(context2, t70Var.p2() + 1));
                ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
                spannableStringBuilder.append((java.lang.CharSequence) com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context2, f18));
                spannableStringBuilder.append((java.lang.CharSequence) context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cpa));
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String m76095x978206e2 = item.f383740d.u0().m76095x978206e();
                if (m76095x978206e2 == null) {
                    m76095x978206e2 = "";
                }
                ((ke0.e) xVar2).getClass();
                spannableStringBuilder.append((java.lang.CharSequence) com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context2, m76095x978206e2));
                c15258xcd50c1764.m61745x765074af(spannableStringBuilder);
            }
        }
        if (item.f383740d.f67484x29d3a50c == -1) {
            holder.w(com.p314xaae8f345.mm.R.id.c6y, 0);
            holder.w(com.p314xaae8f345.mm.R.id.c6z, 0);
            if (item.f383740d.f67477xdad0d5ae == 1) {
                holder.r(com.p314xaae8f345.mm.R.id.c6z, com.p314xaae8f345.mm.R.C30867xcad56011.cpe);
                holder.p(com.p314xaae8f345.mm.R.id.f565371c70).setOnClickListener(null);
            } else {
                holder.r(com.p314xaae8f345.mm.R.id.c6z, com.p314xaae8f345.mm.R.C30867xcad56011.cv8);
                holder.p(com.p314xaae8f345.mm.R.id.f565371c70).setOnClickListener(gv2.e.f357536d);
            }
        } else {
            holder.w(com.p314xaae8f345.mm.R.id.c6y, 8);
            holder.w(com.p314xaae8f345.mm.R.id.c6z, 8);
        }
        if ((item.f383740d.u0().m76068x3ffea218() & 1) != 0) {
            holder.w(com.p314xaae8f345.mm.R.id.i1d, 0);
            i19 = 8;
        } else {
            i19 = 8;
            holder.w(com.p314xaae8f345.mm.R.id.i1d, 8);
        }
        holder.w(com.p314xaae8f345.mm.R.id.dz8, i19);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusFeedCommentConvert", "maskView gone " + i17 + ", blink " + item.f383745i + ", hasBlink " + item.f383746m);
        if (!item.f383745i || item.f383746m) {
            context = context2;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusFeedCommentConvert", "begin blink animation " + i17);
            item.f383746m = true;
            android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.dz8);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(p18, arrayList3.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            p18.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            context = context2;
            p18.animate().alpha(0.0f).setDuration(1000L).setListener(new gv2.f(p18, i17)).start();
        }
        android.view.View p19 = holder.p(com.p314xaae8f345.mm.R.id.c7p);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(p19, arrayList4.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p19.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(p19, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View p27 = holder.p(com.p314xaae8f345.mm.R.id.dz_);
        int v07 = item.f383740d.v0();
        android.view.View p28 = holder.p(com.p314xaae8f345.mm.R.id.mvg);
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jzg, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.g(2, v07));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        boolean d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0) dVar).d(item, true);
        if (v07 <= 0 || !d17) {
            if (d17) {
                boolean z18 = item.f383742f;
                if (p27 != null) {
                    p27.setBackground(z18 ? p27.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.b69) : p27.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.b6_));
                }
            } else {
                n(p27, item.f383742f);
            }
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(p28, arrayList5.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p28.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(p28, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(p28, arrayList6.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p28.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(p28, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((android.widget.TextView) p28.findViewById(com.p314xaae8f345.mm.R.id.mvi)).setText(string);
            android.view.View findViewById = p28.findViewById(com.p314xaae8f345.mm.R.id.mvf);
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(0);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(findViewById, arrayList7.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById2 = p28.findViewById(com.p314xaae8f345.mm.R.id.mvh);
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(8);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(findViewById2, arrayList8.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p28.setOnClickListener(new gv2.g(findViewById, findViewById2, this, item));
            n(p27, item.f383742f);
        }
        textView.setContentDescription(item.f383740d.y0());
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.p(com.p314xaae8f345.mm.R.id.dz_);
        if (viewGroup != null) {
            viewGroup.setTag(com.p314xaae8f345.mm.R.id.e79, "");
            viewGroup.setTag(com.p314xaae8f345.mm.R.id.e5n, f17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176 c15258xcd50c1765 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176) holder.p(com.p314xaae8f345.mm.R.id.c6d);
            if (c15258xcd50c1765 != null && (obj = c15258xcd50c1765.getCom.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT java.lang.String()) != null) {
                obj2 = obj;
            }
            viewGroup.setTag(com.p314xaae8f345.mm.R.id.e5l, obj2);
            viewGroup.setTag(com.p314xaae8f345.mm.R.id.e5w, java.lang.Boolean.FALSE);
            viewGroup.setTag(com.p314xaae8f345.mm.R.id.f565941e61, 0);
        }
        android.view.View p29 = holder.p(com.p314xaae8f345.mm.R.id.dfg);
        if (dVar != null && (m82898xfb7e5820 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0) dVar).e(context).m82898xfb7e5820()) != null) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onBindViewHolder: position：");
            sb7.append(i17);
            sb7.append(" size - 1:");
            sb7.append(m82898xfb7e5820.size() - 1);
            sb7.append(' ');
            sb7.append(p29 != null ? java.lang.Integer.valueOf(p29.getVisibility()) : null);
            sb7.append("item.showEmptyFooterView:");
            sb7.append(item.f383741e);
            sb7.append(' ');
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusFeedCommentConvert", sb7.toString());
            if (m82898xfb7e5820.size() - 1 == i17) {
                if (m82898xfb7e5820.size() - 1 == i17) {
                    if (item.f383741e) {
                        android.view.ViewGroup.LayoutParams layoutParams = p29.getLayoutParams();
                        layoutParams.height = this.f357568g;
                        p29.setLayoutParams(layoutParams);
                        java.util.ArrayList arrayList9 = new java.util.ArrayList();
                        arrayList9.add(0);
                        java.util.Collections.reverse(arrayList9);
                        yj0.a.d(p29, arrayList9.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        p29.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                        yj0.a.f(p29, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    } else {
                        if (p29 != null && p29.getVisibility() == 0) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(p29);
                            android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(p29.getHeight(), 0);
                            ofInt.setDuration(150L);
                            ofInt.setInterpolator(new android.view.animation.LinearInterpolator());
                            ofInt.addUpdateListener(new gv2.a(p29));
                            ofInt.addListener(new gv2.b(p29));
                            ofInt.start();
                        } else if (p29 != null) {
                            java.util.ArrayList arrayList10 = new java.util.ArrayList();
                            arrayList10.add(8);
                            java.util.Collections.reverse(arrayList10);
                            yj0.a.d(p29, arrayList10.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            p29.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
                            yj0.a.f(p29, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                    }
                }
            } else if (p29 != null) {
                java.util.ArrayList arrayList11 = new java.util.ArrayList();
                arrayList11.add(8);
                java.util.Collections.reverse(arrayList11);
                yj0.a.d(p29, arrayList11.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p29.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
                yj0.a.f(p29, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (item.f383742f) {
            java.util.ArrayList arrayList12 = new java.util.ArrayList();
            arrayList12.add(java.lang.Float.valueOf(0.15f));
            java.util.Collections.reverse(arrayList12);
            yj0.a.d(p27, arrayList12.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            p27.setAlpha(((java.lang.Float) arrayList12.get(0)).floatValue());
            yj0.a.f(p27, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            return;
        }
        java.util.ArrayList arrayList13 = new java.util.ArrayList();
        arrayList13.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList13);
        yj0.a.d(p27, arrayList13.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        p27.setAlpha(((java.lang.Float) arrayList13.get(0)).floatValue());
        yj0.a.f(p27, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.nfg);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert", "onCreateViewHolder", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert", "onCreateViewHolder", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.dz_);
        com.p314xaae8f345.mm.ui.xj xjVar = new com.p314xaae8f345.mm.ui.xj(p18);
        p18.setTouchDelegate(xjVar);
        android.content.Context context = holder.f374654e;
        int f17 = i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        android.view.View p19 = holder.p(com.p314xaae8f345.mm.R.id.c7p);
        if (p19 != null) {
            p19.post(new gv2.h(p19, f17, xjVar));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176 c15258xcd50c176 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176) holder.p(com.p314xaae8f345.mm.R.id.f568176lz4);
        c15258xcd50c176.m61741xc3b64c0d(2);
        c15258xcd50c176.m61734x50e5c22f(true);
        c15258xcd50c176.f(false, true);
        c15258xcd50c176.m61743x9bd24cae(new gv2.i(holder));
        c15258xcd50c176.m61746x1c5c5ff4(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77640xad7ef2a));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176 c15258xcd50c1762 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176) holder.p(com.p314xaae8f345.mm.R.id.c6d);
        c15258xcd50c1762.m61741xc3b64c0d(4);
        c15258xcd50c1762.m61734x50e5c22f(true);
        c15258xcd50c1762.f(false, true);
        c15258xcd50c1762.m61743x9bd24cae(new gv2.j(holder));
    }

    public final void n(android.view.View view, boolean z17) {
        if (view != null) {
            view.setBackground(z17 ? view.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.b6a) : view.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.b6b));
        }
    }
}
