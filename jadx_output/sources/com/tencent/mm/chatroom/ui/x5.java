package com.tencent.mm.chatroom.ui;

/* loaded from: classes5.dex */
public final class x5 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f64647d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f64648e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.coroutines.LifecycleScope f64649f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Float f64650g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Float f64651h;

    /* renamed from: i, reason: collision with root package name */
    public final android.content.Context f64652i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f64653m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View.OnTouchListener f64654n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View.OnLongClickListener f64655o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View.OnLongClickListener f64656p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.chatroom.ui.i5 f64657q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationByQrOrInvitationUI f64658r;

    public x5(com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationByQrOrInvitationUI roomAccessVerifyApplicationByQrOrInvitationUI, androidx.recyclerview.widget.RecyclerView recyclerView, java.util.List items, com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(items, "items");
        kotlin.jvm.internal.o.g(lifecycleScope, "lifecycleScope");
        this.f64658r = roomAccessVerifyApplicationByQrOrInvitationUI;
        this.f64647d = recyclerView;
        this.f64648e = items;
        this.f64649f = lifecycleScope;
        java.lang.Float valueOf = java.lang.Float.valueOf(0.0f);
        this.f64650g = valueOf;
        this.f64651h = valueOf;
        this.f64652i = recyclerView.getContext();
        this.f64653m = jz5.h.b(new com.tencent.mm.chatroom.ui.j5(this));
        this.f64654n = new com.tencent.mm.chatroom.ui.w5(this);
        this.f64655o = new com.tencent.mm.chatroom.ui.m5(this);
        this.f64656p = new com.tencent.mm.chatroom.ui.t5(this, roomAccessVerifyApplicationByQrOrInvitationUI);
        this.f64657q = new com.tencent.mm.chatroom.ui.i5(this);
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f64648e.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        java.lang.String str;
        java.util.LinkedList linkedList;
        java.lang.String string;
        int i18;
        int i19;
        java.util.LinkedList linkedList2;
        com.tencent.mm.chatroom.ui.t6 holder = (com.tencent.mm.chatroom.ui.t6) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        in.b bVar = new in.b();
        java.util.List list = this.f64648e;
        bVar.parseFrom(((dm.w9) list.get(i17)).field_data);
        int i27 = ((dm.w9) list.get(i17)).field_state;
        java.lang.String field_chatRoomName = ((dm.w9) list.get(i17)).field_chatRoomName;
        kotlin.jvm.internal.o.f(field_chatRoomName, "field_chatRoomName");
        android.content.Context context = holder.itemView.getContext();
        in.c inviter = bVar.f292718d;
        kotlin.jvm.internal.o.f(inviter, "inviter");
        android.content.Context context2 = holder.k().getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        android.widget.TextView k17 = holder.k();
        com.tencent.mm.chatroom.ui.u6 u6Var = com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationByQrOrInvitationUI.f63828i;
        com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationByQrOrInvitationUI roomAccessVerifyApplicationByQrOrInvitationUI = holder.f64545v;
        android.text.SpannableString V6 = roomAccessVerifyApplicationByQrOrInvitationUI.V6(field_chatRoomName, inviter, context2, k17);
        java.lang.String str2 = "";
        java.lang.String str3 = V6 != null ? V6 : "";
        boolean z17 = bVar.f292718d.f292727m == 1;
        android.widget.TextView k18 = holder.k();
        java.util.LinkedList memberlist = bVar.f292719e;
        kotlin.jvm.internal.o.f(memberlist, "memberlist");
        boolean z18 = z17;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(memberlist, 10));
        java.util.Iterator it = memberlist.iterator();
        while (true) {
            str = str2;
            if (!it.hasNext()) {
                break;
            }
            in.c cVar = (in.c) it.next();
            java.lang.String str4 = cVar.f292722e;
            if (str4 == null || r26.n0.N(str4)) {
                str4 = null;
            }
            if (str4 == null) {
                str4 = roomAccessVerifyApplicationByQrOrInvitationUI.getString(com.tencent.mm.R.string.ndd);
                linkedList2 = memberlist;
                kotlin.jvm.internal.o.f(str4, "getString(...)");
            } else {
                linkedList2 = memberlist;
            }
            com.tencent.mm.pluginsdk.ui.span.f0 f0Var = new com.tencent.mm.pluginsdk.ui.span.f0(str4.concat(roomAccessVerifyApplicationByQrOrInvitationUI.W6(cVar.f292725h, cVar.f292726i)));
            f0Var.c(new com.tencent.mm.chatroom.ui.e6(), 0, f0Var.length(), 33);
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
        holder.k().setOnClickListener(new com.tencent.mm.chatroom.ui.f6(bVar, holder, holder.f64545v, context, field_chatRoomName));
        int size = linkedList3.size();
        jz5.g gVar = holder.f64538o;
        jz5.g gVar2 = holder.f64534h;
        if (size > 1) {
            holder.l().setVisibility(8);
            java.lang.Object value = ((jz5.n) gVar2).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            ((android.view.ViewGroup) value).setVisibility(0);
            java.lang.Object value2 = ((jz5.n) gVar).getValue();
            kotlin.jvm.internal.o.f(value2, "getValue(...)");
            ((android.widget.TextView) value2).setText(context.getString(com.tencent.mm.R.string.p6c, java.lang.Integer.valueOf(linkedList3.size())));
            java.lang.Object value3 = ((jz5.n) gVar2).getValue();
            kotlin.jvm.internal.o.f(value3, "getValue(...)");
            ((android.view.ViewGroup) value3).setOnClickListener(new com.tencent.mm.chatroom.ui.g6(bVar, holder, roomAccessVerifyApplicationByQrOrInvitationUI));
            java.lang.Object value4 = ((jz5.n) gVar).getValue();
            kotlin.jvm.internal.o.f(value4, "getValue(...)");
            ((android.widget.TextView) value4).setOnClickListener(new com.tencent.mm.chatroom.ui.h6(holder, roomAccessVerifyApplicationByQrOrInvitationUI, bVar));
            jz5.g gVar3 = holder.f64535i;
            java.lang.Object value5 = ((jz5.n) gVar3).getValue();
            kotlin.jvm.internal.o.f(value5, "getValue(...)");
            int measuredWidth = ((android.widget.ImageView) value5).getMeasuredWidth();
            java.lang.Object value6 = ((jz5.n) gVar3).getValue();
            kotlin.jvm.internal.o.f(value6, "getValue(...)");
            gk0.k kVar = new gk0.k(measuredWidth, ((android.widget.ImageView) value6).getMeasuredHeight());
            kVar.f272433d = 0.1f;
            kVar.f272434e = com.tencent.mm.R.drawable.bhm;
            gk0.n0 n0Var = (gk0.n0) i95.n0.c(gk0.n0.class);
            java.lang.Object value7 = ((jz5.n) gVar3).getValue();
            kotlin.jvm.internal.o.f(value7, "getValue(...)");
            android.widget.ImageView imageView = (android.widget.ImageView) value7;
            linkedList = linkedList3;
            in.c cVar2 = (in.c) linkedList.get(0);
            java.lang.String str5 = cVar2 != null ? cVar2.f292723f : null;
            if (str5 == null) {
                str5 = str;
            }
            ((h83.g) n0Var).wi(imageView, str5, kVar);
            gk0.n0 n0Var2 = (gk0.n0) i95.n0.c(gk0.n0.class);
            java.lang.Object value8 = ((jz5.n) holder.f64536m).getValue();
            kotlin.jvm.internal.o.f(value8, "getValue(...)");
            android.widget.ImageView imageView2 = (android.widget.ImageView) value8;
            in.c cVar3 = (in.c) linkedList.get(1);
            java.lang.String str6 = cVar3 != null ? cVar3.f292723f : null;
            ((h83.g) n0Var2).wi(imageView2, str6 == null ? str : str6, kVar);
        } else {
            linkedList = linkedList3;
            if (linkedList.size() == 1) {
                holder.l().setVisibility(0);
                holder.l().setOnClickListener(new com.tencent.mm.chatroom.ui.i6(bVar, holder, context, field_chatRoomName));
                java.lang.Object value9 = ((jz5.n) gVar2).getValue();
                kotlin.jvm.internal.o.f(value9, "getValue(...)");
                ((android.view.ViewGroup) value9).setVisibility(8);
                java.lang.Object value10 = ((jz5.n) gVar).getValue();
                kotlin.jvm.internal.o.f(value10, "getValue(...)");
                ((android.widget.TextView) value10).setVisibility(8);
                gk0.k kVar2 = new gk0.k(holder.l().getMeasuredWidth(), holder.l().getMeasuredHeight());
                kVar2.f272433d = 0.1f;
                kVar2.f272434e = com.tencent.mm.R.drawable.bhm;
                gk0.n0 n0Var3 = (gk0.n0) i95.n0.c(gk0.n0.class);
                android.widget.ImageView l17 = holder.l();
                java.lang.String headimgurl = ((in.c) linkedList.get(0)).f292723f;
                kotlin.jvm.internal.o.f(headimgurl, "headimgurl");
                ((h83.g) n0Var3).wi(l17, headimgurl, kVar2);
            }
        }
        if (z18) {
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            string = context.getString(com.tencent.mm.R.string.p6g, com.tencent.mm.pluginsdk.ui.span.c0.i(context, charSequence));
        } else {
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            string = context.getString(com.tencent.mm.R.string.p6_, com.tencent.mm.pluginsdk.ui.span.c0.i(context, charSequence));
        }
        kotlin.jvm.internal.o.d(string);
        int L = r26.n0.L(string, charSequence.toString(), 0, false, 6, null);
        jz5.g gVar4 = holder.f64539p;
        java.lang.Object value11 = ((jz5.n) gVar4).getValue();
        kotlin.jvm.internal.o.f(value11, "getValue(...)");
        com.tencent.mm.pluginsdk.ui.span.f0 f0Var2 = new com.tencent.mm.pluginsdk.ui.span.f0(string);
        f0Var2.c(new com.tencent.mm.chatroom.ui.j6(context, field_chatRoomName, bVar), L, charSequence.length() + L, 33);
        ((android.widget.TextView) value11).setText(f0Var2);
        java.lang.Object value12 = ((jz5.n) gVar4).getValue();
        kotlin.jvm.internal.o.f(value12, "getValue(...)");
        ((android.widget.TextView) value12).setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        jz5.g gVar5 = holder.f64541r;
        if (i27 == 0) {
            holder.j().setVisibility(0);
            java.lang.Object value13 = ((jz5.n) gVar5).getValue();
            kotlin.jvm.internal.o.f(value13, "getValue(...)");
            ((android.widget.TextView) value13).setVisibility(8);
        } else {
            holder.j().setVisibility(8);
            java.lang.Object value14 = ((jz5.n) gVar5).getValue();
            kotlin.jvm.internal.o.f(value14, "getValue(...)");
            ((android.widget.TextView) value14).setVisibility(0);
        }
        holder.j().setTag(java.lang.Integer.valueOf(holder.getPosition()));
        holder.j().setOnClickListener(holder.f64530d);
        java.util.LinkedList linkedList4 = bVar.f292720f;
        int size2 = linkedList4.size();
        jz5.g gVar6 = holder.f64543t;
        if (size2 > 0) {
            java.lang.Object value15 = ((jz5.n) gVar6).getValue();
            kotlin.jvm.internal.o.f(value15, "getValue(...)");
            android.widget.TextView textView = (android.widget.TextView) value15;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : linkedList4) {
                java.lang.String str7 = ((in.a) obj).f292716f;
                if (!(str7 == null || str7.length() == 0)) {
                    arrayList2.add(obj);
                }
            }
            textView.setText(kz5.n0.g0(arrayList2, "\n", null, null, 0, null, new com.tencent.mm.chatroom.ui.k6(z18, bVar, charSequence), 30, null));
            java.lang.CharSequence text = textView.getText();
            textView.setVisibility(text == null || text.length() == 0 ? 8 : 0);
        }
        jz5.g gVar7 = holder.f64544u;
        java.lang.Object value16 = ((jz5.n) gVar7).getValue();
        kotlin.jvm.internal.o.f(value16, "getValue(...)");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) value16;
        viewGroup.setOnTouchListener(holder.f64531e);
        viewGroup.setTag(java.lang.Integer.valueOf(holder.getPosition()));
        viewGroup.removeAllViews();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj2 : linkedList) {
            java.lang.String str8 = ((in.c) obj2).f292724g;
            if (!(str8 == null || str8.length() == 0)) {
                arrayList3.add(obj2);
            }
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(arrayList3, 10));
        java.util.Iterator it6 = arrayList3.iterator();
        while (it6.hasNext()) {
            in.c cVar4 = (in.c) it6.next();
            com.tencent.mm.pluginsdk.ui.span.f0 f0Var3 = new com.tencent.mm.pluginsdk.ui.span.f0(cVar4.f292722e + cVar4.f292724g + roomAccessVerifyApplicationByQrOrInvitationUI.getContext().getString(com.tencent.mm.R.string.p6a));
            com.tencent.mm.chatroom.ui.s6 s6Var = new com.tencent.mm.chatroom.ui.s6(roomAccessVerifyApplicationByQrOrInvitationUI, cVar4);
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
            android.view.View inflate = roomAccessVerifyApplicationByQrOrInvitationUI.getContext().getLayoutInflater().inflate(com.tencent.mm.R.layout.e0k, (android.view.ViewGroup) null);
            android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.t9k);
            textView2.setText((com.tencent.mm.pluginsdk.ui.span.f0) next);
            textView2.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            viewGroup.addView(inflate);
            i38 = i39;
        }
        java.lang.Object value17 = ((jz5.n) gVar6).getValue();
        kotlin.jvm.internal.o.f(value17, "getValue(...)");
        if (((android.widget.TextView) value17).getVisibility() == 8) {
            java.lang.Object value18 = ((jz5.n) gVar7).getValue();
            kotlin.jvm.internal.o.f(value18, "getValue(...)");
            if (((android.view.ViewGroup) value18).getChildCount() == 0) {
                java.lang.Object value19 = ((jz5.n) holder.f64542s).getValue();
                kotlin.jvm.internal.o.f(value19, "getValue(...)");
                ((android.view.ViewGroup) value19).setVisibility(8);
            }
        }
        android.view.View view = holder.itemView;
        view.setOnTouchListener(this.f64654n);
        view.setTag(java.lang.Integer.valueOf(i17));
        if (bVar.f292718d.f292727m == 1) {
            view.setOnLongClickListener(this.f64656p);
        } else {
            view.setOnLongClickListener(this.f64655o);
        }
        int i47 = ((dm.w9) list.get(i17)).field_read;
        jz5.g gVar8 = holder.f64532f;
        if (i47 == 1 && i17 > 0 && ((dm.w9) list.get(i17 - 1)).field_read == 0) {
            java.lang.Object value20 = ((jz5.n) gVar8).getValue();
            kotlin.jvm.internal.o.f(value20, "getValue(...)");
            ((android.widget.TextView) value20).setVisibility(0);
        } else {
            java.lang.Object value21 = ((jz5.n) gVar8).getValue();
            kotlin.jvm.internal.o.f(value21, "getValue(...)");
            ((android.widget.TextView) value21).setVisibility(8);
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationByQrOrInvitationUI roomAccessVerifyApplicationByQrOrInvitationUI = this.f64658r;
        android.view.View inflate = com.tencent.mm.ui.id.b(parent.getContext()).inflate(com.tencent.mm.R.layout.e0j, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new com.tencent.mm.chatroom.ui.t6(roomAccessVerifyApplicationByQrOrInvitationUI, inflate, this.f64657q, null, this.f64654n);
    }
}
