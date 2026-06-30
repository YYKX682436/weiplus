package gv2;

/* loaded from: classes10.dex */
public final class w extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.d f357620e;

    /* renamed from: f, reason: collision with root package name */
    public final int f357621f;

    /* renamed from: g, reason: collision with root package name */
    public final int f357622g;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.d presenter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(presenter, "presenter");
        this.f357620e = presenter;
        this.f357621f = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561181bn);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        this.f357622g = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561255de);
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569390x;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        android.text.Spanned i19;
        int i27;
        java.lang.String str;
        java.lang.String string;
        java.lang.String z07;
        java.util.List m82898xfb7e5820;
        java.lang.CharSequence charSequence;
        int i28;
        jv2.a aVar;
        jv2.d item = (jv2.d) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        holder.f374658i = item;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.p(com.p314xaae8f345.mm.R.id.dza);
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.f565371c70);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.kbf);
        android.content.Context context = holder.f374654e;
        textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
        textView.setOnClickListener(null);
        holder.p(com.p314xaae8f345.mm.R.id.a_4).setOnClickListener(null);
        holder.w(com.p314xaae8f345.mm.R.id.f566597gf3, 8);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.d dVar = this.f357620e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0 o0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0) dVar;
        java.util.ArrayList arrayList = o0Var.f211859h.f211875a;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(arrayList)) {
            jv2.d dVar2 = (jv2.d) kz5.n0.Z(arrayList);
            if (dVar2 != null && (aVar = dVar2.f383740d) != null) {
                if ((aVar.u0().m76072xefec40f7() & 1) > 0) {
                }
            }
        }
        java.util.ArrayList arrayList2 = o0Var.f211859h.f211875a;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(arrayList2)) {
            java.util.Iterator it = arrayList2.iterator();
            int i29 = 0;
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                int i37 = i29 + 1;
                if (i29 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                jv2.d dVar3 = (jv2.d) next;
                if (dVar3.f383740d.A0() == 0) {
                    if (!((dVar3.f383740d.u0().m76072xefec40f7() & 1) > 0)) {
                        break;
                    }
                }
                i29 = i37;
            }
        }
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0) dVar).f211862n == 2) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            i95.m c17 = i95.n0.c(c61.yb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            java.lang.String md6 = c61.yb.md((c61.yb) c17, item.f383740d.D0(), item.f383740d.y0(), false, 4, null);
            ((ke0.e) xVar).getClass();
            android.text.Spanned spannableStringBuilder = new android.text.SpannableStringBuilder(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, md6));
            android.text.SpannableStringBuilder append = new android.text.SpannableStringBuilder().append((java.lang.CharSequence) spannableStringBuilder);
            if (((c61.l7) i95.n0.c(c61.l7.class)).Gk(item.f383740d.D0()) || hc2.l.i(item.f383740d.D0())) {
                i95.m c18 = i95.n0.c(c61.yb.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                c61.yb ybVar = (c61.yb) c18;
                android.content.Context context2 = textView.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                android.text.TextPaint paint = textView.getPaint();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(paint, "getPaint(...)");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(append);
                textView.setText(c61.yb.nf(ybVar, context2, paint, append, 0, 8, null));
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.q()) {
                    textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo));
                    textView.setOnClickListener(new gv2.o(item, holder));
                    holder.p(com.p314xaae8f345.mm.R.id.a_4).setOnClickListener(new gv2.p(item, holder));
                    i19 = spannableStringBuilder;
                }
            } else {
                i95.m c19 = i95.n0.c(c61.yb.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
                c61.yb ybVar2 = (c61.yb) c19;
                android.content.Context context3 = textView.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
                android.text.TextPaint paint2 = textView.getPaint();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(paint2, "getPaint(...)");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(append);
                textView.setText(c61.yb.nf(ybVar2, context3, paint2, append, 0, 8, null));
            }
            i19 = spannableStringBuilder;
        } else {
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String y07 = item.f383740d.y0();
            ((ke0.e) xVar2).getClass();
            i19 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, y07);
            i95.m c27 = i95.n0.c(c61.yb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c27, "getService(...)");
            c61.yb ybVar3 = (c61.yb) c27;
            android.content.Context context4 = textView.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context4, "getContext(...)");
            android.text.TextPaint paint3 = textView.getPaint();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(paint3, "getPaint(...)");
            textView.setText(c61.yb.nf(ybVar3, context4, paint3, i19, 0, 8, null));
        }
        java.lang.CharSequence f17 = k35.m1.f(context, item.f383740d.u0().m76064x3febcdbf() * 1000, true, false);
        holder.s(com.p314xaae8f345.mm.R.id.f565385c85, f17);
        item.f383740d.D0();
        item.f383740d.y0();
        item.f383740d.j();
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.a_4);
        java.lang.String D0 = item.f383740d.D0();
        imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bhm);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, D0, null);
        imageView.setOnClickListener(new gv2.q(holder, D0, this));
        k12.r rVar = (k12.r) i95.n0.c(k12.r.class);
        android.content.Context context5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        android.text.Spanned spanned = i19;
        textView.setText(((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).Ai(textView, D0, ((h12.b) rVar).Ai(context5, c01.a2.e(D0)), bi4.c.CONVERSATION_LIST, i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia)));
        textView.setOnClickListener(new gv2.r(holder, D0, this));
        android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.ehq);
        if (p18 != null) {
            item.f383740d.getClass();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(p18, arrayList3.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentLevel2Convert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentLevel2Convert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo));
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176 c15258xcd50c176 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176) holder.p(com.p314xaae8f345.mm.R.id.c6d);
            java.lang.Object obj = holder.f374658i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.uniComments.storge.TextStatusFeedComment");
            c15258xcd50c176.m61734x50e5c22f(((jv2.d) obj).f383743g);
            le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String j17 = item.f383740d.j();
            ((ke0.e) xVar3).getClass();
            c15258xcd50c176.m61745x765074af(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, j17));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusFeedCommentLevel2Convert", sb6.toString());
        }
        if ((item.f383740d.u0().m76068x3ffea218() & 1) != 0) {
            i27 = 0;
            holder.w(com.p314xaae8f345.mm.R.id.i1d, 0);
        } else {
            i27 = 0;
            holder.w(com.p314xaae8f345.mm.R.id.i1d, 8);
        }
        if (item.f383740d.f67484x29d3a50c == -1) {
            holder.w(com.p314xaae8f345.mm.R.id.c6y, i27);
            holder.w(com.p314xaae8f345.mm.R.id.c6z, i27);
            if (item.f383740d.f67477xdad0d5ae == 1) {
                holder.r(com.p314xaae8f345.mm.R.id.c6z, com.p314xaae8f345.mm.R.C30867xcad56011.cpe);
                holder.p(com.p314xaae8f345.mm.R.id.f565371c70).setOnClickListener(null);
            } else {
                holder.r(com.p314xaae8f345.mm.R.id.c6z, com.p314xaae8f345.mm.R.C30867xcad56011.cv8);
                holder.p(com.p314xaae8f345.mm.R.id.f565371c70).setOnClickListener(gv2.s.f357603d);
            }
        } else {
            holder.w(com.p314xaae8f345.mm.R.id.c6y, 8);
            holder.w(com.p314xaae8f345.mm.R.id.c6z, 8);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusFeedCommentLevel2Convert", "maskView gone " + i17 + ", blink " + item.f383745i + ", hasBlink " + item.f383746m);
        if (!item.f383745i || item.f383746m) {
            holder.w(com.p314xaae8f345.mm.R.id.dz9, 8);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusFeedCommentLevel2Convert", "begin blink animation " + i17);
            item.f383746m = true;
            android.view.View p19 = holder.p(com.p314xaae8f345.mm.R.id.dz9);
            p19.post(new gv2.u(p19, viewGroup, i17));
        }
        android.view.View p27 = holder.p(com.p314xaae8f345.mm.R.id.i0p);
        p27.setPadding(p27.getPaddingLeft(), p27.getPaddingTop(), p27.getPaddingRight(), i65.a.b(context, 6));
        jv2.d h17 = o0Var.h(item.f383740d.A0());
        android.view.View p28 = holder.p(com.p314xaae8f345.mm.R.id.i0r);
        android.view.View p29 = holder.p(com.p314xaae8f345.mm.R.id.i0q);
        boolean d17 = o0Var.d(item, true);
        if (h17 == null) {
            if (d17) {
                o(viewGroup, p17, item.f383742f);
            } else {
                p(viewGroup, p17, item.f383742f);
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(p28, arrayList4.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentLevel2Convert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p28.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(p28, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentLevel2Convert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        boolean z18 = h17.f383740d.u0().m76101x5f2113e4() == 1;
        boolean z19 = h17.f383740d.u0().m76063x34008729() == 1;
        java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jzi);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        if (!item.f383748o || (i28 = h17.f383747n) <= 0) {
            str = string2;
            string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jzh);
        } else {
            str = string2;
            string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jzg, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.g(2, i28));
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusFeedCommentLevel2Convert", "onBindViewHolder: downContinue:" + z19 + " isLastLevel2Comment:" + d17);
        if (z19 && d17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(p29);
            n(p29, string, h17, true);
            o(viewGroup, p17, item.f383742f);
        } else {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(p29, arrayList5.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentLevel2Convert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p29.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(p29, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentLevel2Convert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (d17) {
                o(viewGroup, p17, item.f383742f);
            } else {
                p(viewGroup, p17, item.f383742f);
            }
        }
        if (z18 && o0Var.d(item, false)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(p28);
            n(p28, str, h17, false);
        } else {
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(p28, arrayList6.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentLevel2Convert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p28.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(p28, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentLevel2Convert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        textView.setContentDescription(item.f383740d.y0());
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0) dVar).f211862n == 2) {
            i95.m c28 = i95.n0.c(c61.yb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c28, "getService(...)");
            c61.yb ybVar4 = (c61.yb) c28;
            java.lang.String m76096x37861b81 = item.f383740d.u0().m76096x37861b81();
            z07 = c61.yb.md(ybVar4, m76096x37861b81 == null ? "" : m76096x37861b81, item.f383740d.z0(), false, 4, null);
        } else {
            z07 = item.f383740d.z0();
        }
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) holder.p(com.p314xaae8f345.mm.R.id.dza);
        if (viewGroup2 != null) {
            viewGroup2.setTag(com.p314xaae8f345.mm.R.id.e79, spanned);
            viewGroup2.setTag(com.p314xaae8f345.mm.R.id.e5n, f17);
            viewGroup2.setTag(com.p314xaae8f345.mm.R.id.e7f, z07);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176 c15258xcd50c1762 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176) holder.p(com.p314xaae8f345.mm.R.id.c6d);
            viewGroup2.setTag(com.p314xaae8f345.mm.R.id.e5l, (c15258xcd50c1762 == null || (charSequence = c15258xcd50c1762.getCom.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT java.lang.String()) == null) ? "" : charSequence);
        }
        android.view.View p37 = holder.p(com.p314xaae8f345.mm.R.id.dfg);
        if (dVar != null && (m82898xfb7e5820 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0) dVar).e(context).m82898xfb7e5820()) != null) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onBindViewHolder: position：");
            sb7.append(i17);
            sb7.append(" size - 1:");
            sb7.append(m82898xfb7e5820.size() - 1);
            sb7.append(' ');
            sb7.append(p37 != null ? java.lang.Integer.valueOf(p37.getVisibility()) : null);
            sb7.append("item.showEmptyFooterView:");
            sb7.append(item.f383741e);
            sb7.append(' ');
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusFeedCommentLevel2Convert", sb7.toString());
            if (m82898xfb7e5820.size() - 1 != i17) {
                if (p37 != null) {
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
                    arrayList7.add(8);
                    java.util.Collections.reverse(arrayList7);
                    yj0.a.d(p37, arrayList7.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentLevel2Convert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p37.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                    yj0.a.f(p37, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentLevel2Convert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else if (m82898xfb7e5820.size() - 1 == i17) {
                if (item.f383741e) {
                    android.view.ViewGroup.LayoutParams layoutParams = p37.getLayoutParams();
                    layoutParams.height = this.f357622g;
                    p37.setLayoutParams(layoutParams);
                    java.util.ArrayList arrayList8 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal6 = zj0.c.f554818a;
                    arrayList8.add(0);
                    java.util.Collections.reverse(arrayList8);
                    yj0.a.d(p37, arrayList8.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentLevel2Convert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p37.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                    yj0.a.f(p37, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentLevel2Convert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    if (p37 != null && p37.getVisibility() == 0) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(p37);
                        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(p37.getHeight(), 0);
                        ofInt.setDuration(150L);
                        ofInt.setInterpolator(new android.view.animation.LinearInterpolator());
                        ofInt.addUpdateListener(new gv2.m(p37));
                        ofInt.addListener(new gv2.n(p37));
                        ofInt.start();
                    } else if (p37 != null) {
                        java.util.ArrayList arrayList9 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal7 = zj0.c.f554818a;
                        arrayList9.add(8);
                        java.util.Collections.reverse(arrayList9);
                        yj0.a.d(p37, arrayList9.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentLevel2Convert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        p37.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                        yj0.a.f(p37, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentLevel2Convert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
            }
        }
        if (item.f383742f) {
            viewGroup.setAlpha(0.15f);
            viewGroup.setEnabled(false);
        } else {
            viewGroup.setAlpha(1.0f);
            viewGroup.setEnabled(true);
        }
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176 c15258xcd50c176 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176) holder.p(com.p314xaae8f345.mm.R.id.c6d);
        c15258xcd50c176.m61741xc3b64c0d(4);
        c15258xcd50c176.m61734x50e5c22f(true);
        c15258xcd50c176.f(false, true);
        c15258xcd50c176.m61743x9bd24cae(new gv2.v(holder));
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.i0p);
        p17.setTouchDelegate(new com.p314xaae8f345.mm.ui.xj(p17));
        i65.a.f(holder.f374654e, com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
    }

    public final void n(android.view.View view, java.lang.String str, jv2.d dVar, boolean z17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentLevel2Convert", "initTipsLayout", "(Landroid/view/View;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentLevel2Convert", "initTipsLayout", "(Landroid/view/View;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.mvi)).setText(str);
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.mvf);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentLevel2Convert", "initTipsLayout", "(Landroid/view/View;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentLevel2Convert", "initTipsLayout", "(Landroid/view/View;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.mvh);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentLevel2Convert", "initTipsLayout", "(Landroid/view/View;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentLevel2Convert", "initTipsLayout", "(Landroid/view/View;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/uniComments/storge/TextStatusFeedComment;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setOnClickListener(new gv2.l(findViewById, findViewById2, this, dVar, z17));
    }

    public final void o(android.view.View view, android.view.View view2, boolean z17) {
        if (view != null) {
            view.setBackground(z17 ? view.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.b67) : view.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.b68));
        }
        if (view2 != null) {
            view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), this.f357621f);
        }
    }

    public final void p(android.view.View view, android.view.View view2, boolean z17) {
        if (view != null) {
            view.setBackground(z17 ? view.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.b6c) : view.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.b6d));
        }
        if (view2 != null) {
            view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), this.f357621f);
        }
    }
}
