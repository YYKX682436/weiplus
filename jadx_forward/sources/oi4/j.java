package oi4;

/* loaded from: classes11.dex */
public final class j extends oi4.n {

    /* renamed from: g, reason: collision with root package name */
    public final yz5.q f427175g;

    public j(long j17, yz5.q qVar) {
        this.f427175g = qVar;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.czo;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String field_Description;
        kj4.c item = (kj4.c) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.content.Context context = holder.f374654e;
        this.f427179f = context;
        mj4.l lVar = item.f389987d;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = lVar.V.length() > 0 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(lVar.V, true) : ((m73.q) ((n73.e) i95.n0.c(n73.e.class))).wi(lVar.f76605x8d8a3769, 1);
        if (n17 == null || !n17.r2()) {
            ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.oog)).setText(lVar.f76604x3554d688);
            n11.a.b().g(lVar.f76606x75d1dd31, (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.hke));
            holder.f3639x46306858.setOnClickListener(null);
        } else {
            android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.oog);
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(context, n17.g2(), i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia)));
            android.text.style.ReplacementSpan Zi = ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).Zi(textView, n17.d1(), bi4.c.CONVERSATION_LIST, i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia));
            if (Zi != null) {
                spannableStringBuilder.append((java.lang.CharSequence) " ");
                spannableStringBuilder.setSpan(Zi, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
            }
            textView.setText(spannableStringBuilder);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai((android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.hke), n17.d1(), null);
            java.lang.String str = lVar.f76611x5493d43f;
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(holder.f3639x46306858, "textstatus_single_notif_cell");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(holder.f3639x46306858, 8, 28809);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("textstatusid", str);
            hashMap.put("status_interaction_type", 1);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(holder.f3639x46306858, hashMap);
            holder.f3639x46306858.setOnClickListener(new oi4.h(str, item, this, holder));
        }
        holder.f3639x46306858.setOnLongClickListener(new oi4.i(this, holder, i17));
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.haq);
        android.graphics.drawable.Drawable drawable = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f80143xebd704ef);
        com.p314xaae8f345.mm.ui.uk.f(drawable, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560247f5));
        imageView.setImageDrawable(drawable);
        ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.oqb)).setText(k35.m1.f(context, lVar.f76601x81959a6e * 1000, true, false));
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.jue);
        java.lang.String str2 = lVar.f76603x685e8417;
        if (str2 == null || str2.length() == 0) {
            bk4.f a17 = bk4.i.a();
            pj4.o0 o0Var = new pj4.o0();
            byte[] bArr = lVar.f76612x2931c158;
            if (bArr != null) {
                o0Var.mo11468x92b714fd(bArr);
            }
            field_Description = a17.m(o0Var);
        } else {
            field_Description = lVar.f76603x685e8417;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_Description, "field_Description");
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        float textSize = textView2.getTextSize();
        ((ke0.e) xVar).getClass();
        textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, field_Description, textSize));
        android.widget.ImageView imageView2 = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.f566970ho3);
        java.lang.String str3 = lVar.f76615x7b284d5e;
        imageView2.setImageDrawable(null);
        if (!(str3 == null || r26.n0.N(str3))) {
            dj4.u uVar = dj4.u.f314582a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
            uVar.e(context, imageView2, str3, java.lang.String.valueOf(lVar.hashCode()), (lVar.f76609xd302a37a & 1) != 0, 1.0f);
        }
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) holder.p(com.p314xaae8f345.mm.R.id.hyd);
        frameLayout.removeAllViews();
        pj4.o0 o0Var2 = new pj4.o0();
        byte[] bArr2 = lVar.f76612x2931c158;
        if (bArr2 != null) {
            o0Var2.mo11468x92b714fd(bArr2);
        }
        java.lang.String d17 = wi4.a.d(o0Var2);
        if (d17 == null || r26.n0.N(d17)) {
            return;
        }
        bi4.o0 b17 = sj4.z0.f490441a.b(oi4.k.b(o0Var2));
        if (b17 != null) {
            b17.m(lVar.f76611x5493d43f, oi4.k.a(o0Var2));
        }
        if (b17 != null) {
            b17.q(frameLayout);
        }
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }

    @Override // oi4.n
    public void n(java.lang.String userName, mj4.h textStatusItem, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textStatusItem, "textStatusItem");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.CommentHistoryItemConvert", "goToShowTextStatusActivity: id:" + ((mj4.k) textStatusItem).l() + " userName:" + userName + " refCommentId:" + str);
        android.content.Context context = this.f427179f;
        if (context != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18672xb885c992.f255226f.b(context, userName, textStatusItem);
        }
    }
}
