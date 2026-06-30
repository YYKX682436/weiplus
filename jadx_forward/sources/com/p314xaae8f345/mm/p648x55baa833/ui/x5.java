package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes5.dex */
public final class x5 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f146180d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f146181e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a f146182f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Float f146183g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Float f146184h;

    /* renamed from: i, reason: collision with root package name */
    public final android.content.Context f146185i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f146186m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View.OnTouchListener f146187n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View.OnLongClickListener f146188o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View.OnLongClickListener f146189p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p648x55baa833.ui.i5 f146190q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10349x67700120 f146191r;

    public x5(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10349x67700120 activityC10349x67700120, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, java.util.List items, com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a lifecycleScope) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(items, "items");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycleScope, "lifecycleScope");
        this.f146191r = activityC10349x67700120;
        this.f146180d = recyclerView;
        this.f146181e = items;
        this.f146182f = lifecycleScope;
        java.lang.Float valueOf = java.lang.Float.valueOf(0.0f);
        this.f146183g = valueOf;
        this.f146184h = valueOf;
        this.f146185i = recyclerView.getContext();
        this.f146186m = jz5.h.b(new com.p314xaae8f345.mm.p648x55baa833.ui.j5(this));
        this.f146187n = new com.p314xaae8f345.mm.p648x55baa833.ui.w5(this);
        this.f146188o = new com.p314xaae8f345.mm.p648x55baa833.ui.m5(this);
        this.f146189p = new com.p314xaae8f345.mm.p648x55baa833.ui.t5(this, activityC10349x67700120);
        this.f146190q = new com.p314xaae8f345.mm.p648x55baa833.ui.i5(this);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f146181e.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        java.lang.String str;
        java.util.LinkedList linkedList;
        java.lang.String string;
        int i18;
        int i19;
        java.util.LinkedList linkedList2;
        com.p314xaae8f345.mm.p648x55baa833.ui.t6 holder = (com.p314xaae8f345.mm.p648x55baa833.ui.t6) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        in.b bVar = new in.b();
        java.util.List list = this.f146181e;
        bVar.mo11468x92b714fd(((dm.w9) list.get(i17)).f69026x225a93cf);
        int i27 = ((dm.w9) list.get(i17)).f69031x29d3a50c;
        java.lang.String field_chatRoomName = ((dm.w9) list.get(i17)).f69025x3b2058a3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_chatRoomName, "field_chatRoomName");
        android.content.Context context = holder.f3639x46306858.getContext();
        in.c inviter = bVar.f374251d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inviter, "inviter");
        android.content.Context context2 = holder.k().getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        android.widget.TextView k17 = holder.k();
        com.p314xaae8f345.mm.p648x55baa833.ui.u6 u6Var = com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10349x67700120.f145361i;
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10349x67700120 activityC10349x67700120 = holder.f146078v;
        android.text.SpannableString V6 = activityC10349x67700120.V6(field_chatRoomName, inviter, context2, k17);
        java.lang.String str2 = "";
        java.lang.String str3 = V6 != null ? V6 : "";
        boolean z17 = bVar.f374251d.f374260m == 1;
        android.widget.TextView k18 = holder.k();
        java.util.LinkedList memberlist = bVar.f374252e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(memberlist, "memberlist");
        boolean z18 = z17;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(memberlist, 10));
        java.util.Iterator it = memberlist.iterator();
        while (true) {
            str = str2;
            if (!it.hasNext()) {
                break;
            }
            in.c cVar = (in.c) it.next();
            java.lang.String str4 = cVar.f374255e;
            if (str4 == null || r26.n0.N(str4)) {
                str4 = null;
            }
            if (str4 == null) {
                str4 = activityC10349x67700120.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ndd);
                linkedList2 = memberlist;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str4, "getString(...)");
            } else {
                linkedList2 = memberlist;
            }
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0(str4.concat(activityC10349x67700120.W6(cVar.f374258h, cVar.f374259i)));
            f0Var.c(new com.p314xaae8f345.mm.p648x55baa833.ui.e6(), 0, f0Var.length(), 33);
            arrayList.add(f0Var);
            it = it;
            str3 = str3;
            str2 = str;
            memberlist = linkedList2;
        }
        java.util.LinkedList linkedList3 = memberlist;
        java.lang.CharSequence charSequence = str3;
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        kz5.n0.f0(arrayList, spannableStringBuilder, "、", null, null, 0, null, null, 124, null);
        k18.setText(spannableStringBuilder);
        int i28 = 0;
        holder.k().setOnClickListener(new com.p314xaae8f345.mm.p648x55baa833.ui.f6(bVar, holder, holder.f146078v, context, field_chatRoomName));
        int size = linkedList3.size();
        jz5.g gVar = holder.f146071o;
        jz5.g gVar2 = holder.f146067h;
        if (size > 1) {
            holder.l().setVisibility(8);
            java.lang.Object mo141623x754a37bb = ((jz5.n) gVar2).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
            ((android.view.ViewGroup) mo141623x754a37bb).setVisibility(0);
            java.lang.Object mo141623x754a37bb2 = ((jz5.n) gVar).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
            ((android.widget.TextView) mo141623x754a37bb2).setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.p6c, java.lang.Integer.valueOf(linkedList3.size())));
            java.lang.Object mo141623x754a37bb3 = ((jz5.n) gVar2).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb3, "getValue(...)");
            ((android.view.ViewGroup) mo141623x754a37bb3).setOnClickListener(new com.p314xaae8f345.mm.p648x55baa833.ui.g6(bVar, holder, activityC10349x67700120));
            java.lang.Object mo141623x754a37bb4 = ((jz5.n) gVar).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb4, "getValue(...)");
            ((android.widget.TextView) mo141623x754a37bb4).setOnClickListener(new com.p314xaae8f345.mm.p648x55baa833.ui.h6(holder, activityC10349x67700120, bVar));
            jz5.g gVar3 = holder.f146068i;
            java.lang.Object mo141623x754a37bb5 = ((jz5.n) gVar3).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb5, "getValue(...)");
            int measuredWidth = ((android.widget.ImageView) mo141623x754a37bb5).getMeasuredWidth();
            java.lang.Object mo141623x754a37bb6 = ((jz5.n) gVar3).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb6, "getValue(...)");
            gk0.k kVar = new gk0.k(measuredWidth, ((android.widget.ImageView) mo141623x754a37bb6).getMeasuredHeight());
            kVar.f353966d = 0.1f;
            kVar.f353967e = com.p314xaae8f345.mm.R.C30861xcebc809e.bhm;
            gk0.n0 n0Var = (gk0.n0) i95.n0.c(gk0.n0.class);
            java.lang.Object mo141623x754a37bb7 = ((jz5.n) gVar3).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb7, "getValue(...)");
            android.widget.ImageView imageView = (android.widget.ImageView) mo141623x754a37bb7;
            linkedList = linkedList3;
            in.c cVar2 = (in.c) linkedList.get(0);
            java.lang.String str5 = cVar2 != null ? cVar2.f374256f : null;
            if (str5 == null) {
                str5 = str;
            }
            ((h83.g) n0Var).wi(imageView, str5, kVar);
            gk0.n0 n0Var2 = (gk0.n0) i95.n0.c(gk0.n0.class);
            java.lang.Object mo141623x754a37bb8 = ((jz5.n) holder.f146069m).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb8, "getValue(...)");
            android.widget.ImageView imageView2 = (android.widget.ImageView) mo141623x754a37bb8;
            in.c cVar3 = (in.c) linkedList.get(1);
            java.lang.String str6 = cVar3 != null ? cVar3.f374256f : null;
            ((h83.g) n0Var2).wi(imageView2, str6 == null ? str : str6, kVar);
        } else {
            linkedList = linkedList3;
            if (linkedList.size() == 1) {
                holder.l().setVisibility(0);
                holder.l().setOnClickListener(new com.p314xaae8f345.mm.p648x55baa833.ui.i6(bVar, holder, context, field_chatRoomName));
                java.lang.Object mo141623x754a37bb9 = ((jz5.n) gVar2).mo141623x754a37bb();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb9, "getValue(...)");
                ((android.view.ViewGroup) mo141623x754a37bb9).setVisibility(8);
                java.lang.Object mo141623x754a37bb10 = ((jz5.n) gVar).mo141623x754a37bb();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb10, "getValue(...)");
                ((android.widget.TextView) mo141623x754a37bb10).setVisibility(8);
                gk0.k kVar2 = new gk0.k(holder.l().getMeasuredWidth(), holder.l().getMeasuredHeight());
                kVar2.f353966d = 0.1f;
                kVar2.f353967e = com.p314xaae8f345.mm.R.C30861xcebc809e.bhm;
                gk0.n0 n0Var3 = (gk0.n0) i95.n0.c(gk0.n0.class);
                android.widget.ImageView l17 = holder.l();
                java.lang.String headimgurl = ((in.c) linkedList.get(0)).f374256f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(headimgurl, "headimgurl");
                ((h83.g) n0Var3).wi(l17, headimgurl, kVar2);
            }
        }
        if (z18) {
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.p6g, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, charSequence));
        } else {
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.p6_, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, charSequence));
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        int L = r26.n0.L(string, charSequence.toString(), 0, false, 6, null);
        jz5.g gVar4 = holder.f146072p;
        java.lang.Object mo141623x754a37bb11 = ((jz5.n) gVar4).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb11, "getValue(...)");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var2 = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0(string);
        f0Var2.c(new com.p314xaae8f345.mm.p648x55baa833.ui.j6(context, field_chatRoomName, bVar), L, charSequence.length() + L, 33);
        ((android.widget.TextView) mo141623x754a37bb11).setText(f0Var2);
        java.lang.Object mo141623x754a37bb12 = ((jz5.n) gVar4).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb12, "getValue(...)");
        ((android.widget.TextView) mo141623x754a37bb12).setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        jz5.g gVar5 = holder.f146074r;
        if (i27 == 0) {
            holder.j().setVisibility(0);
            java.lang.Object mo141623x754a37bb13 = ((jz5.n) gVar5).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb13, "getValue(...)");
            ((android.widget.TextView) mo141623x754a37bb13).setVisibility(8);
        } else {
            holder.j().setVisibility(8);
            java.lang.Object mo141623x754a37bb14 = ((jz5.n) gVar5).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb14, "getValue(...)");
            ((android.widget.TextView) mo141623x754a37bb14).setVisibility(0);
        }
        holder.j().setTag(java.lang.Integer.valueOf(holder.m8188xa86cd69f()));
        holder.j().setOnClickListener(holder.f146063d);
        java.util.LinkedList linkedList4 = bVar.f374253f;
        int size2 = linkedList4.size();
        jz5.g gVar6 = holder.f146076t;
        if (size2 > 0) {
            java.lang.Object mo141623x754a37bb15 = ((jz5.n) gVar6).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb15, "getValue(...)");
            android.widget.TextView textView = (android.widget.TextView) mo141623x754a37bb15;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : linkedList4) {
                java.lang.String str7 = ((in.a) obj).f374249f;
                if (!(str7 == null || str7.length() == 0)) {
                    arrayList2.add(obj);
                }
            }
            textView.setText(kz5.n0.g0(arrayList2, "\n", null, null, 0, null, new com.p314xaae8f345.mm.p648x55baa833.ui.k6(z18, bVar, charSequence), 30, null));
            java.lang.CharSequence text = textView.getText();
            textView.setVisibility(text == null || text.length() == 0 ? 8 : 0);
        }
        jz5.g gVar7 = holder.f146077u;
        java.lang.Object mo141623x754a37bb16 = ((jz5.n) gVar7).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb16, "getValue(...)");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) mo141623x754a37bb16;
        viewGroup.setOnTouchListener(holder.f146064e);
        viewGroup.setTag(java.lang.Integer.valueOf(holder.m8188xa86cd69f()));
        viewGroup.removeAllViews();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj2 : linkedList) {
            java.lang.String str8 = ((in.c) obj2).f374257g;
            if (!(str8 == null || str8.length() == 0)) {
                arrayList3.add(obj2);
            }
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(arrayList3, 10));
        java.util.Iterator it6 = arrayList3.iterator();
        while (it6.hasNext()) {
            in.c cVar4 = (in.c) it6.next();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var3 = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0(cVar4.f374255e + cVar4.f374257g + activityC10349x67700120.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.p6a));
            com.p314xaae8f345.mm.p648x55baa833.ui.s6 s6Var = new com.p314xaae8f345.mm.p648x55baa833.ui.s6(activityC10349x67700120, cVar4);
            int length = f0Var3.length();
            int i29 = i28;
            while (true) {
                if (i29 >= length) {
                    i29 = -1;
                    break;
                } else if (f0Var3.charAt(i29) == 8203) {
                    break;
                } else {
                    i29++;
                }
            }
            int length2 = f0Var3.length() - 1;
            if (length2 >= 0) {
                while (true) {
                    int i37 = length2 - 1;
                    if (f0Var3.charAt(length2) == 8203) {
                        i19 = length2;
                        i18 = 33;
                        break;
                    } else if (i37 < 0) {
                        break;
                    } else {
                        length2 = i37;
                    }
                }
            }
            i18 = 33;
            i19 = -1;
            f0Var3.c(s6Var, i29, i19, i18);
            arrayList4.add(f0Var3);
            i28 = 0;
        }
        java.util.Iterator it7 = arrayList4.iterator();
        int i38 = 0;
        while (it7.hasNext()) {
            java.lang.Object next = it7.next();
            int i39 = i38 + 1;
            if (i38 < 0) {
                kz5.c0.p();
                throw null;
            }
            android.view.View inflate = activityC10349x67700120.mo55332x76847179().getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e0k, (android.view.ViewGroup) null);
            android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.t9k);
            textView2.setText((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0) next);
            textView2.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            viewGroup.addView(inflate);
            i38 = i39;
        }
        java.lang.Object mo141623x754a37bb17 = ((jz5.n) gVar6).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb17, "getValue(...)");
        if (((android.widget.TextView) mo141623x754a37bb17).getVisibility() == 8) {
            java.lang.Object mo141623x754a37bb18 = ((jz5.n) gVar7).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb18, "getValue(...)");
            if (((android.view.ViewGroup) mo141623x754a37bb18).getChildCount() == 0) {
                java.lang.Object mo141623x754a37bb19 = ((jz5.n) holder.f146075s).mo141623x754a37bb();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb19, "getValue(...)");
                ((android.view.ViewGroup) mo141623x754a37bb19).setVisibility(8);
            }
        }
        android.view.View view = holder.f3639x46306858;
        view.setOnTouchListener(this.f146187n);
        view.setTag(java.lang.Integer.valueOf(i17));
        if (bVar.f374251d.f374260m == 1) {
            view.setOnLongClickListener(this.f146189p);
        } else {
            view.setOnLongClickListener(this.f146188o);
        }
        int i47 = ((dm.w9) list.get(i17)).f69030x2260fdbb;
        jz5.g gVar8 = holder.f146065f;
        if (i47 == 1 && i17 > 0 && ((dm.w9) list.get(i17 - 1)).f69030x2260fdbb == 0) {
            java.lang.Object mo141623x754a37bb20 = ((jz5.n) gVar8).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb20, "getValue(...)");
            ((android.widget.TextView) mo141623x754a37bb20).setVisibility(0);
        } else {
            java.lang.Object mo141623x754a37bb21 = ((jz5.n) gVar8).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb21, "getValue(...)");
            ((android.widget.TextView) mo141623x754a37bb21).setVisibility(8);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10349x67700120 activityC10349x67700120 = this.f146191r;
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e0j, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new com.p314xaae8f345.mm.p648x55baa833.ui.t6(activityC10349x67700120, inflate, this.f146190q, null, this.f146187n);
    }
}
