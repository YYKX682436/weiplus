package g63;

/* loaded from: classes8.dex */
public final class j extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 implements g63.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final g63.s f350660d = new g63.s(this);

    /* renamed from: e, reason: collision with root package name */
    public final g63.a f350661e = new g63.a(this);

    /* renamed from: f, reason: collision with root package name */
    public final g63.s0 f350662f = new g63.s0(this);

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f350663g = new java.util.LinkedList();

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f350663g.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        java.lang.CharSequence charSequence;
        g63.b holder = (g63.b) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        g63.s sVar = this.f350660d;
        sVar.getClass();
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        java.lang.Object obj = ((g63.j) sVar.f350697a).f350663g.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        z53.i iVar = (z53.i) obj;
        x4.a aVar = holder.f374656g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.gamelife.databinding.GamelifeConversationNormalItemBinding");
        a63.b bVar = (a63.b) aVar;
        holder.f374658i = iVar;
        itemView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562839q2);
        bVar.f83274d.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 q57 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().q5(iVar.f67669xbed8694c);
        android.widget.TextView textView = bVar.f83274d;
        if (q57 != null && q57.P0() == 5) {
            android.graphics.drawable.Drawable drawable = itemView.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f80663xc7a973a9);
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            } else {
                drawable = null;
            }
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        }
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if ((iVar.f67664x6b18c3b5 & 1) > 0) {
            iVar.f67665x195d889b = i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.fqa);
            iVar.f67664x6b18c3b5 = 0L;
        }
        java.lang.String str = iVar.f67665x195d889b;
        if (str == null || str.length() == 0) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str2 = iVar.f67663xf66fcca9;
            ((ke0.e) xVar).getClass();
            charSequence = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str2);
        } else {
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(iVar.f67665x195d889b);
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac)), 0, spannableStringBuilder.length(), 33);
            android.text.SpannableStringBuilder append = spannableStringBuilder.append((java.lang.CharSequence) " ");
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str3 = iVar.f67663xf66fcca9;
            ((ke0.e) xVar2).getClass();
            append.append((java.lang.CharSequence) com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str3));
            charSequence = spannableStringBuilder;
        }
        textView.setText(charSequence);
        bVar.f83278h.setText(java.lang.String.valueOf(k35.m1.f(itemView.getContext(), iVar.f67672xa783a79b, true, false)));
        android.widget.TextView textView2 = bVar.f83280j;
        textView2.setVisibility(8);
        int i18 = iVar.f67671xa35b5abb > 0 ? 0 : 8;
        android.widget.TextView textView3 = bVar.f83279i;
        textView3.setVisibility(i18);
        int i19 = iVar.f67671xa35b5abb;
        textView3.setText(i19 > 99 ? "..." : java.lang.String.valueOf(i19));
        textView3.setBackgroundResource(com.p314xaae8f345.mm.ui.p2740x696c9db.pd.b(itemView.getContext(), iVar.f67671xa35b5abb));
        boolean u07 = iVar.u0();
        android.widget.ImageView imageView = bVar.f83272b;
        android.widget.TextView textView4 = bVar.f83273c;
        if (!u07) {
            itemView.setOnClickListener(new g63.q(sVar, iVar, i17, holder, itemView));
            itemView.setOnLongClickListener(new g63.r(sVar, iVar, i17, holder, itemView));
            textView4.setText(iVar.G);
            ng5.a.a(imageView, iVar.f67669xbed8694c);
            return;
        }
        android.view.View view = holder.f3639x46306858;
        textView3.setVisibility(8);
        int i27 = iVar.f67671xa35b5abb;
        textView2.setVisibility((i27 == Integer.MAX_VALUE || i27 == 0) ? 8 : 0);
        imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.af_);
        textView4.setText(i65.a.r(view.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.fqe));
        view.setOnClickListener(new g63.o(iVar, sVar, i17, view));
        view.setOnLongClickListener(new g63.p(sVar, iVar, i17, holder, view));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        this.f350660d.getClass();
        a63.b a17 = a63.b.a(com.p314xaae8f345.mm.ui.id.b(parent.getContext()), parent, false);
        android.widget.LinearLayout linearLayout = a17.f83271a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linearLayout, "getRoot(...)");
        return new g63.b(linearLayout, a17);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onViewAttachedToWindow */
    public void mo8160xd8bfd53(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        g63.b holder = (g63.b) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.mo8160xd8bfd53(holder);
        z53.i iVar = (z53.i) holder.f374658i;
        if (iVar != null) {
            int m8183xf806b362 = holder.m8183xf806b362();
            boolean u07 = iVar.u0();
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.d dVar = com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.e.f149727a;
            if (u07) {
                int i17 = m8183xf806b362 + 1;
                int x17 = x();
                java.lang.String field_sessionId = iVar.f67669xbed8694c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_sessionId, "field_sessionId");
                dVar.e(i17, 1L, x17, field_sessionId, 0L, "", 0L, "", iVar.t0(), e63.a.f331350a, (r35 & 1024) != 0 ? null : null);
                return;
            }
            y53.m Di = ((y53.x) ((u53.y) i95.n0.c(u53.y.class))).Di(iVar.f67668x5568d387);
            if (Di != null) {
                int i18 = m8183xf806b362 + 1;
                int x18 = x();
                java.lang.String field_sessionId2 = iVar.f67669xbed8694c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_sessionId2, "field_sessionId");
                long j17 = Di.f67426x9f600742;
                java.lang.String field_selfUserName = iVar.f67668x5568d387;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_selfUserName, "field_selfUserName");
                y53.m mVar = iVar.F;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mVar);
                long j18 = mVar.f67426x9f600742;
                java.lang.String field_talker = iVar.f67670x114ef53e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_talker, "field_talker");
                dVar.e(i18, 1L, x18, field_sessionId2, j17, field_selfUserName, j18, field_talker, iVar.t0(), e63.a.f331350a, (r35 & 1024) != 0 ? null : null);
            }
        }
    }

    public int x() {
        return this.f350663g.size();
    }
}
