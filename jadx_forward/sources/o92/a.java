package o92;

/* loaded from: classes2.dex */
public final class a extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final r45.hr5 f425242e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f425243f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f425244g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f425245h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f425246i;

    public a(r45.hr5 requestContactReq) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestContactReq, "requestContactReq");
        this.f425242e = requestContactReq;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.adg;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        j92.a item = (j92.a) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.view.View findViewById = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f563921d7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f425243f = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f563936dm);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f425244g = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f563918d4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f425245h = findViewById3;
        android.view.View findViewById4 = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f563917d3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f425246i = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById4;
        android.view.View findViewById5 = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f563931dh);
        m92.b bVar = item.f379885d;
        java.lang.String str = bVar.f68723xdec927b;
        boolean z18 = str == null || str.length() == 0;
        android.content.Context context = holder.f374654e;
        if (!z18) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById5, arrayList.toArray(), "com/tencent/mm/plugin/finder/account/convert/FinderAccountConvertForNewLife", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/account/api/convert/model/FinderAccountData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById5.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById5, "com/tencent/mm/plugin/finder/account/convert/FinderAccountConvertForNewLife", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/account/api/convert/model/FinderAccountData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView = this.f425244g;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nameTv");
                throw null;
            }
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str2 = bVar.f68710x21f9b213;
            ((ke0.e) xVar).getClass();
            textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str2));
            r45.ui4 ui4Var = (r45.ui4) bVar.u0().m75936x14adae67(27);
            if (ui4Var != null) {
                ui4Var.m75945x2fec8307(0);
            }
            android.widget.ImageView imageView = this.f425243f;
            if (imageView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("avatarIv");
                throw null;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.f68693x81118c51)) {
                mn2.g1 g1Var = mn2.g1.f411508a;
                g1Var.a().c(new mn2.n(bVar.f68693x81118c51, null, 2, null), imageView, g1Var.h(mn2.f1.f411490h));
            }
            android.widget.ImageView imageView2 = this.f425243f;
            if (imageView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("avatarIv");
                throw null;
            }
            imageView2.setVisibility(0);
            android.view.View view = this.f425245h;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("addLayout");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/account/convert/FinderAccountConvertForNewLife", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/account/api/convert/model/FinderAccountData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/account/convert/FinderAccountConvertForNewLife", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/account/api/convert/model/FinderAccountData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int color = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832);
            android.widget.TextView textView2 = this.f425244g;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nameTv");
                throw null;
            }
            textView2.setTextColor(color);
            android.view.View itemView = holder.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
            dy1.a.c(itemView);
            return;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById5, arrayList3.toArray(), "com/tencent/mm/plugin/finder/account/convert/FinderAccountConvertForNewLife", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/account/api/convert/model/FinderAccountData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById5.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById5, "com/tencent/mm/plugin/finder/account/convert/FinderAccountConvertForNewLife", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/account/api/convert/model/FinderAccountData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView3 = this.f425244g;
        if (textView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nameTv");
            throw null;
        }
        textView3.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572779ci0));
        android.widget.ImageView imageView3 = this.f425243f;
        if (imageView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("avatarIv");
            throw null;
        }
        imageView3.setVisibility(8);
        android.view.View view2 = this.f425245h;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("addLayout");
            throw null;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/account/convert/FinderAccountConvertForNewLife", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/account/api/convert/model/FinderAccountData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/account/convert/FinderAccountConvertForNewLife", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/account/api/convert/model/FinderAccountData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (item.f379888g) {
            android.widget.TextView textView4 = this.f425244g;
            if (textView4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nameTv");
                throw null;
            }
            textView4.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f425246i;
            if (c22699x3dcdb352 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("addIv");
                throw null;
            }
            c22699x3dcdb352.m82040x7541828(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        } else {
            android.widget.TextView textView5 = this.f425244g;
            if (textView5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nameTv");
                throw null;
            }
            textView5.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f425246i;
            if (c22699x3dcdb3522 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("addIv");
                throw null;
            }
            c22699x3dcdb3522.m82040x7541828(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
        }
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.Tj(holder.f3639x46306858, 40, 3, false);
        aVar.pk(holder.f3639x46306858, "create_finder_account_button");
        android.view.View view3 = holder.f3639x46306858;
        r45.hr5 hr5Var = this.f425242e;
        aVar.gk(view3, kz5.c1.k(new jz5.l("enter_source", java.lang.Integer.valueOf(hr5Var.m75939xb282bd08(0))), new jz5.l("source_feedid", pm0.v.u(hr5Var.m75942xfb822ef2(1))), new jz5.l("my_finder_username", "")));
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
