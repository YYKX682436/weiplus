package ei4;

/* loaded from: classes11.dex */
public final class h extends wn.a {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f334748e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f334749f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public yz5.q f334750g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.q f334751h;

    public static final void B(ei4.h hVar, hi4.a aVar) {
        int i17;
        java.util.HashMap hashMap = hVar.f334749f;
        hi4.a aVar2 = (hi4.a) hashMap.get(aVar.f76582xbed8694c);
        java.util.LinkedList linkedList = hVar.f334748e;
        int c07 = kz5.n0.c0(linkedList, aVar2);
        if (c07 >= 0) {
            linkedList.remove(c07);
            hVar.m8155x27702c4(c07);
        }
        aVar.t0();
        java.util.ListIterator listIterator = linkedList.listIterator(linkedList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i17 = -1;
                break;
            }
            hi4.a aVar3 = (hi4.a) listIterator.previous();
            if (aVar3.f76576xa97e89ae > 0 || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(aVar3.f76582xbed8694c, "textstatussayhisessionholder")) {
                i17 = listIterator.nextIndex();
                break;
            }
        }
        int i18 = i17 >= 0 ? i17 + 1 : 0;
        linkedList.add(i18, aVar);
        hVar.m8149x8b456734(i18);
        hashMap.remove(aVar.f76582xbed8694c);
        java.lang.String field_sessionId = aVar.f76582xbed8694c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_sessionId, "field_sessionId");
        hashMap.put(field_sessionId, aVar);
    }

    public static final void E(ei4.h hVar) {
        hVar.getClass();
        ni4.x.f419309d.k().getClass();
        java.util.LinkedList linkedList = hVar.f334748e;
        if (linkedList.size() > 0) {
            java.lang.Object obj = linkedList.get(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            if (ii4.b.a((hi4.a) obj)) {
                linkedList.remove(0);
                hVar.m8155x27702c4(0);
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f334748e.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        java.lang.CharSequence charSequence;
        java.lang.String str;
        wn.j holder = (wn.j) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        x4.a aVar = holder.f374656g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.databinding.TextStatusConversationItemBinding");
        ui4.b bVar = (ui4.b) aVar;
        java.lang.Object obj = this.f334748e.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        hi4.a aVar2 = (hi4.a) obj;
        holder.f374658i = aVar2;
        if (ii4.b.a(aVar2)) {
            bVar.f509654c.setText(aVar2.f363073l1);
            ni4.x xVar = ni4.x.f419309d;
            hi4.e z07 = xVar.k().z0();
            str = "";
            if (z07 != null) {
                mj4.w Ai = ((ki4.x) i95.n0.c(ki4.x.class)).Ai(z07.f76597x1c3513c9);
                java.lang.String str2 = Ai != null ? Ai.f76640x21f9b213 : null;
                str = (str2 != null ? str2 : "") + (char) 65306 + z07.f76596x29a5ba45;
            }
            bVar.f509655d.setText(str);
            bVar.f509658g.setVisibility(li4.b.y0(xVar.k(), 0, 1, null) <= 0 ? 8 : 0);
            bVar.f509657f.setVisibility(8);
            ng5.a.a(bVar.f509653b, aVar2.f76582xbed8694c);
            return;
        }
        ng5.a.a(bVar.f509653b, aVar2.f76582xbed8694c);
        xe0.l0 l0Var = (xe0.l0) i95.n0.c(xe0.l0.class);
        java.lang.String str3 = aVar2.f76582xbed8694c;
        java.lang.CharSequence charSequence2 = aVar2.f363075y0;
        bi4.c cVar = bi4.c.PRIVATE_CONVERSATION_LIST;
        android.widget.TextView textView = bVar.f509654c;
        textView.setText(((we0.j1) l0Var).Ai(textView, str3, charSequence2, cVar, textView.getTextSize()));
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.String str4 = aVar2.f76572x51f5672e;
        if (str4 == null || r26.n0.N(str4)) {
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str5 = aVar2.f76569xf66fcca9;
            ((ke0.e) xVar2).getClass();
            charSequence = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str5);
        } else {
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jw8));
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561015a31)), 0, spannableStringBuilder.length(), 33);
            android.text.SpannableStringBuilder append = spannableStringBuilder.append((java.lang.CharSequence) " ");
            le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str6 = aVar2.f76572x51f5672e;
            ((ke0.e) xVar3).getClass();
            append.append((java.lang.CharSequence) com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str6));
            charSequence = spannableStringBuilder;
        }
        bVar.f509655d.setText(charSequence);
        android.content.Context context2 = itemView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        bVar.f509656e.setText(java.lang.String.valueOf(aVar2.f76583x10a0fed7 == 1 ? context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.juv) : k35.m1.f(context2, aVar2.f76587xa783a79b, true, false)));
        int i18 = (aVar2.f76586xa35b5abb <= 0 || aVar2.f76577x9b4f418d != 0) ? 8 : 0;
        android.widget.TextView textView2 = bVar.f509657f;
        textView2.setVisibility(i18);
        textView2.setText(java.lang.String.valueOf(aVar2.f76586xa35b5abb));
        textView2.setBackgroundResource(com.p314xaae8f345.mm.ui.p2740x696c9db.pd.b(itemView.getContext(), aVar2.f76586xa35b5abb));
        textView2.setTextSize(0, i65.a.f(itemView.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f562162ad3) * i65.a.m(itemView.getContext()));
        int visibility = textView2.getVisibility();
        android.widget.TextView textView3 = bVar.f509658g;
        if (visibility != 0 && aVar2.f76577x9b4f418d == 0 && aVar2.f76573xe363a67 == 1) {
            textView3.setVisibility(0);
        } else {
            textView3.setVisibility(8);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571091cz0, parent, false);
        int i18 = com.p314xaae8f345.mm.R.id.a9o;
        android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.a9o);
        if (imageView != null) {
            i18 = com.p314xaae8f345.mm.R.id.civ;
            android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.civ);
            if (textView != null) {
                i18 = com.p314xaae8f345.mm.R.id.cua;
                android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.cua);
                if (textView2 != null) {
                    i18 = com.p314xaae8f345.mm.R.id.o7m;
                    android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.o7m);
                    if (textView3 != null) {
                        i18 = com.p314xaae8f345.mm.R.id.o_4;
                        android.widget.TextView textView4 = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.o_4);
                        if (textView4 != null) {
                            i18 = com.p314xaae8f345.mm.R.id.o_5;
                            android.widget.TextView textView5 = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.o_5);
                            if (textView5 != null) {
                                android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) inflate;
                                ui4.b bVar = new ui4.b(relativeLayout, imageView, textView, textView2, textView3, textView4, textView5);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(relativeLayout, "getRoot(...)");
                                wn.j jVar = new wn.j(relativeLayout, bVar);
                                android.view.View itemView = jVar.f3639x46306858;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
                                itemView.setOnClickListener(new ei4.e(jVar, this));
                                itemView.setOnLongClickListener(new ei4.f(jVar, this));
                                return jVar;
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i18)));
    }

    @Override // wn.a
    public java.util.List x() {
        return this.f334748e;
    }

    @Override // wn.a
    public void y(boolean z17, java.util.List convs) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(convs, "convs");
        pm0.v.X(new ei4.g(this, convs));
    }

    @Override // wn.a
    public boolean z(java.lang.String str, l75.w0 w0Var) {
        if (str == null || w0Var == null) {
            return false;
        }
        java.lang.Object obj = w0Var.f398509d;
        if (obj instanceof hi4.a) {
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.conversation.data.TextStatusConversation");
            h0Var.f391656d = (hi4.a) obj;
            pm0.v.X(new ei4.a(w0Var, this, h0Var));
        } else {
            java.lang.String str2 = w0Var.f398506a;
            java.lang.String[] strArr = li4.b.f400319e;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, li4.b.f400320f)) {
                pm0.v.X(new ei4.b(this));
            } else {
                java.lang.Object obj2 = w0Var.f398509d;
                if (obj2 instanceof hi4.e) {
                    pm0.v.X(new ei4.c(w0Var, this));
                } else {
                    if (!(obj2 instanceof mj4.w)) {
                        return false;
                    }
                    pm0.v.X(new ei4.d(this, w0Var));
                }
            }
        }
        return true;
    }
}
