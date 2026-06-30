package ei4;

/* loaded from: classes9.dex */
public final class s extends wn.a {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f334772e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public yz5.q f334773f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.q f334774g;

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f334772e.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        wn.j holder = (wn.j) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        x4.a aVar = holder.f374656g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.databinding.TextStatusGreetingItemBinding");
        ui4.d dVar = (ui4.d) aVar;
        java.lang.Object obj = this.f334772e.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        hi4.e eVar = (hi4.e) obj;
        holder.f374658i = eVar;
        ng5.a.a(dVar.f509665b, eVar.f76597x1c3513c9);
        int i18 = eVar.M;
        boolean z17 = false;
        android.widget.TextView textView = dVar.f509669f;
        if (i18 == 0) {
            textView.setVisibility(8);
        } else if (i18 == 1) {
            textView.setVisibility(0);
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f574900jw4);
        } else if (i18 == 2) {
            textView.setVisibility(0);
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.jwm);
        }
        mj4.w Ai = ((ki4.x) i95.n0.c(ki4.x.class)).Ai(eVar.f76597x1c3513c9);
        xe0.l0 l0Var = (xe0.l0) i95.n0.c(xe0.l0.class);
        java.lang.String str = eVar.f76597x1c3513c9;
        java.lang.String str2 = Ai != null ? Ai.f76640x21f9b213 : null;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = str2;
        bi4.c cVar = bi4.c.PRIVATE_CONVERSATION_LIST;
        android.widget.TextView textView2 = dVar.f509667d;
        textView2.setText(((we0.j1) l0Var).Ai(textView2, str, str3, cVar, textView2.getTextSize()));
        dVar.f509668e.setText(eVar.f76596x29a5ba45);
        mj4.w Ai2 = ((ki4.x) i95.n0.c(ki4.x.class)).Ai(eVar.f76597x1c3513c9);
        if (Ai2 != null && Ai2.f76637x95576e57 == 1) {
            z17 = true;
        }
        dVar.f509666c.setText(holder.f374654e.getResources().getString(z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.jvw : com.p314xaae8f345.mm.R.C30867xcad56011.jvx));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.czg, parent, false);
        int i18 = com.p314xaae8f345.mm.R.id.a9o;
        android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.a9o);
        if (imageView != null) {
            i18 = com.p314xaae8f345.mm.R.id.azj;
            android.widget.Button button = (android.widget.Button) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.azj);
            if (button != null) {
                i18 = com.p314xaae8f345.mm.R.id.civ;
                android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.civ);
                if (textView != null) {
                    i18 = com.p314xaae8f345.mm.R.id.cua;
                    android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.cua);
                    if (textView2 != null) {
                        i18 = com.p314xaae8f345.mm.R.id.o7j;
                        android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.o7j);
                        if (textView3 != null) {
                            i18 = com.p314xaae8f345.mm.R.id.o_5;
                            android.widget.TextView textView4 = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.o_5);
                            if (textView4 != null) {
                                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate;
                                ui4.d dVar = new ui4.d(linearLayout, imageView, button, textView, textView2, textView3, textView4);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linearLayout, "getRoot(...)");
                                wn.j jVar = new wn.j(linearLayout, dVar);
                                android.view.View itemView = jVar.f3639x46306858;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
                                itemView.setOnClickListener(new ei4.p(jVar, this));
                                itemView.setOnLongClickListener(new ei4.q(jVar, this));
                                button.setOnClickListener(new ei4.r(itemView));
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
        return this.f334772e;
    }

    @Override // wn.a
    public void y(boolean z17, java.util.List convs) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(convs, "convs");
        int mo1894x7e414b06 = mo1894x7e414b06();
        this.f334772e.addAll(convs);
        m8153xd399a4d9(mo1894x7e414b06, convs.size());
    }

    @Override // wn.a
    public boolean z(java.lang.String str, l75.w0 w0Var) {
        if (str == null || w0Var == null) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusGreetingAdapter", "[onConversationStorageChange] eventData.eventId = " + w0Var.f398507b + ",obj=" + w0Var.f398509d);
        java.lang.Object obj = w0Var.f398509d;
        if (obj instanceof hi4.e) {
            pm0.v.X(new ei4.m(w0Var, this));
        } else if (obj instanceof mj4.w) {
            pm0.v.X(new ei4.n(w0Var, this));
        } else {
            if (!(obj instanceof hi4.a)) {
                return false;
            }
            pm0.v.X(new ei4.o(w0Var, this));
        }
        return true;
    }
}
