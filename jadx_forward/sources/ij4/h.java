package ij4;

/* loaded from: classes11.dex */
public final class h extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final bi4.m0 f373259e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f373260f;

    /* renamed from: g, reason: collision with root package name */
    public final bi4.k1 f373261g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f373262h;

    /* renamed from: i, reason: collision with root package name */
    public final android.content.Context f373263i;

    public h(bi4.m0 m0Var, java.lang.String str, java.util.ArrayList likeList, android.content.Context context, bi4.k1 k1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(likeList, "likeList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f373259e = m0Var;
        this.f373260f = str;
        this.f373261g = k1Var;
        this.f373262h = likeList;
        this.f373263i = context;
    }

    @Override // in5.r
    public in5.s0 d(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, android.view.View convertView) {
        android.view.ViewGroup.LayoutParams layoutParams;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(convertView, "convertView");
        if (recyclerView.getWidth() != 0 && (layoutParams = convertView.getLayoutParams()) != null) {
            convertView.setLayoutParams(layoutParams);
        }
        return new in5.s0(convertView);
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cyo;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        ij4.d item = (ij4.d) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        holder.m8211x9616526c();
        java.util.Objects.toString(list);
        java.lang.Object obj = holder.f374657h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.ui.StatusCardView");
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3 q3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3) obj;
        q3Var.f255729m.setTag(com.p314xaae8f345.mm.R.id.nwq, java.lang.Integer.valueOf(i17));
        android.view.View view = q3Var.f255729m;
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.ovl);
        if (imageView != null) {
            java.lang.Object tag = imageView.getTag(com.p314xaae8f345.mm.R.id.rrh);
            java.lang.String f17 = dj4.u.f314582a.f(item.f373250d);
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tag, "") && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(f17, tag)) {
                imageView.setImageBitmap(null);
            }
            imageView.hashCode();
            java.util.Objects.toString(tag);
        }
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.hmt);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/model/feed/CardFeedItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/textstatus/model/feed/CardFeedItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/textstatus/model/feed/CardFeedItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/textstatus/model/feed/CardFeedItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        bi4.p0.U2(q3Var, ((mj4.k) item.f373250d).o(), item.f373250d, null, 4, null);
        boolean i19 = bi4.v1.i();
        android.content.Context context = holder.f374654e;
        if (i19) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("userName = ");
            sb6.append(((mj4.k) item.f373250d).o());
            sb6.append(", like list = ");
            java.util.ArrayList arrayList2 = this.f373262h;
            sb6.append(arrayList2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.CardFeedItemConvert", sb6.toString());
            if (!en1.a.a().equals(((mj4.k) item.f373250d).o())) {
                boolean O = kz5.n0.O(arrayList2, ((mj4.k) item.f373250d).l());
                android.widget.ImageView imageView2 = q3Var.f255741w;
                if (O) {
                    if (imageView2 != null) {
                        android.graphics.drawable.Drawable i27 = i65.a.i(context, com.p314xaae8f345.mm.R.raw.f79526xc76cc485);
                        com.p314xaae8f345.mm.ui.uk.f(i27, i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23));
                        imageView2.setImageDrawable(i27);
                    }
                    if (imageView2 != null) {
                        imageView2.setTag(java.lang.Boolean.TRUE);
                    }
                    android.content.Context context2 = this.f373263i;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
                    pf5.z zVar = pf5.z.f435481a;
                    if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782.class)).f255315p.put(((mj4.k) item.f373250d).l(), java.lang.Boolean.TRUE);
                } else {
                    if (imageView2 != null) {
                        android.graphics.drawable.Drawable i28 = i65.a.i(context, com.p314xaae8f345.mm.R.raw.f79526xc76cc485);
                        com.p314xaae8f345.mm.ui.uk.f(i28, i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
                        imageView2.setImageDrawable(i28);
                    }
                    if (imageView2 != null) {
                        imageView2.setTag(java.lang.Boolean.FALSE);
                    }
                }
            }
        }
        android.view.View view2 = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view2, "null cannot be cast to non-null type android.widget.RelativeLayout");
        q3Var.D1 = new ij4.e(this, item, holder, (android.widget.RelativeLayout) view2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar2 = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        recyclerView.toString();
        holder.m8211x9616526c();
        android.view.View view = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type android.widget.RelativeLayout");
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) view;
        boolean z17 = false;
        java.lang.String str = this.f373260f;
        bi4.k1 k1Var = this.f373261g;
        if (k1Var == null) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "SCENE_HISTORY_FEED")) {
                k1Var = new bi4.k1();
                k1Var.e(true);
                k1Var.f(true);
                k1Var.q(true);
                k1Var.j(false);
                k1Var.f102600g = 9;
                k1Var.f102597d |= 32;
                k1Var.r(true);
                k1Var.d(false);
                k1Var.i(false);
                k1Var.c(true);
                k1Var.g(false);
                k1Var.h(true);
                k1Var.o(true);
                k1Var.f102598e = true;
                k1Var.f102599f = true;
                k1Var.n(true);
                k1Var.p(true);
                k1Var.f102597d = k1Var.f102597d | 524288 | 4194304;
                k1Var.m(true);
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "SCENE_DIALOG")) {
                k1Var = new bi4.k1();
                k1Var.q(true);
                k1Var.o(true);
                java.text.SimpleDateFormat simpleDateFormat = bi4.v1.f102626a;
                k1Var.r(true);
                k1Var.m(true);
                k1Var.f102597d |= 2097152;
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "SCENE_MULTIPLE_DIALOG")) {
                k1Var = bi4.k1.a();
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "SCENE_CONTACT_PROFILE")) {
                k1Var = bi4.k1.b(4, true, false);
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "SCENE_MORE_TAB")) {
                k1Var = bi4.k1.b(5, false, true);
            } else {
                k1Var = new bi4.k1();
                k1Var.e(true);
                k1Var.f(true);
                k1Var.q(true);
                k1Var.j(false);
                k1Var.f102600g = 8;
                k1Var.f102597d |= 32;
                k1Var.r(true);
                k1Var.d(false);
                k1Var.i(false);
                k1Var.c(true);
                k1Var.g(false);
                k1Var.h(true);
                k1Var.o(true);
                java.text.SimpleDateFormat simpleDateFormat2 = bi4.v1.f102626a;
                k1Var.k(true);
                k1Var.p(true);
                k1Var.m(true);
                k1Var.f102597d |= 1024;
            }
        }
        xe0.l0 l0Var = (xe0.l0) i95.n0.c(xe0.l0.class);
        android.content.Context context = recyclerView.getContext();
        ((we0.j1) l0Var).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3 n2Var = k1Var.l(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb) ? new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.n2(context, k1Var) : new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3(context, k1Var);
        android.view.View view2 = n2Var.f255729m;
        relativeLayout.addView(view2, 0);
        holder.f374657h = n2Var;
        holder.hashCode();
        n2Var.hashCode();
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "SCENE_DEFAULT");
        android.content.Context context2 = holder.f374654e;
        if (b17 || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "SCENE_MULTIPLE_DIALOG") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "SCENE_MORE_TAB") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "SCENE_CONTACT_PROFILE")) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            uj4.m mVar = (uj4.m) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(uj4.m.class);
            if (mVar != null && ((java.lang.Boolean) ((jz5.n) mVar.f509975d).mo141623x754a37bb()).booleanValue()) {
                z17 = true;
            }
            if (z17) {
                view2.setOnTouchListener(new ij4.f(holder, n2Var));
            }
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "SCENE_HISTORY_FEED")) {
            view2.setOnTouchListener(new ij4.g(holder, n2Var));
        }
        android.view.ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        ((android.widget.RelativeLayout.LayoutParams) layoutParams).width = -1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        pf5.z zVar2 = pf5.z.f435481a;
        if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
    }

    @Override // in5.r
    public void l(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        holder.m8211x9616526c();
    }
}
