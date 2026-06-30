package oi4;

/* loaded from: classes11.dex */
public final class c extends oi4.n {

    /* renamed from: g, reason: collision with root package name */
    public final yz5.q f427161g;

    public c(yz5.q qVar) {
        this.f427161g = qVar;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cyu;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String field_Description;
        int i19;
        mj4.e eVar;
        int i27;
        kj4.a item = (kj4.a) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        holder.f3639x46306858.setOnLongClickListener(new oi4.a(this, holder, i17));
        android.content.Context context = holder.f374654e;
        this.f427179f = context;
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.ols);
        mj4.e eVar2 = item.f389984d;
        java.lang.String str = eVar2.f76558x75873205;
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.oog);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        android.text.SpannableStringBuilder append = spannableStringBuilder.append((java.lang.CharSequence) c01.a2.e(str));
        xe0.l0 l0Var = (xe0.l0) i95.n0.c(xe0.l0.class);
        bi4.c cVar2 = bi4.c.CONVERSATION_LIST;
        android.content.Context context2 = holder.f374654e;
        android.text.style.ReplacementSpan Zi = ((we0.j1) l0Var).Zi(textView2, str, cVar2, i65.a.h(context2, com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia));
        if (Zi != null) {
            append.append((java.lang.CharSequence) " ");
            append.setSpan(Zi, append.length() - 1, append.length(), 17);
        }
        textView2.setText(append);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai((android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.hke), str, null);
        if (textView != null) {
            textView.setText(eVar2.f76552xa8350b1f);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var.f391656d = eVar2.f76554xb8f426b5;
        java.lang.String str2 = eVar2.f76563x5493d43f;
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(holder.f3639x46306858, "textstatus_single_notif_cell");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(holder.f3639x46306858, 8, 28809);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("textstatusid", str2);
        hashMap.put("status_rootcommentid", eVar2.f76562x940fbe73);
        hashMap.put("status_commentid", h0Var.f391656d);
        hashMap.put("status_interaction_type", 2);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(holder.f3639x46306858, hashMap);
        holder.f3639x46306858.setOnClickListener(new oi4.b(item, h0Var, str2, this, context));
        ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.oqb)).setText(k35.m1.f(context2, eVar2.f76555x81959a6e * 1000, true, false));
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.jue);
        java.lang.String str3 = eVar2.f76557x685e8417;
        if (str3 == null || str3.length() == 0) {
            bk4.f a17 = bk4.i.a();
            pj4.o0 o0Var = new pj4.o0();
            byte[] bArr = eVar2.f76565x2931c158;
            if (bArr != null) {
                o0Var.mo11468x92b714fd(bArr);
            }
            field_Description = a17.m(o0Var);
        } else {
            field_Description = eVar2.f76557x685e8417;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_Description, "field_Description");
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        float textSize = textView3.getTextSize();
        ((ke0.e) xVar).getClass();
        textView3.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context2, field_Description, textSize));
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.f566970ho3);
        java.lang.String str4 = eVar2.f76566x7b284d5e;
        imageView.setImageDrawable(null);
        if (str4 == null || r26.n0.N(str4)) {
            i19 = 1;
            eVar = eVar2;
            i27 = 8;
        } else {
            dj4.u uVar = dj4.u.f314582a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str4);
            i27 = 8;
            i19 = 1;
            eVar = eVar2;
            uVar.e(context, imageView, str4, java.lang.String.valueOf(eVar2.hashCode()), (eVar2.f76560xd302a37a & 1) != 0, 1.0f);
        }
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) holder.p(com.p314xaae8f345.mm.R.id.hyd);
        frameLayout.removeAllViews();
        pj4.o0 o0Var2 = new pj4.o0();
        byte[] bArr2 = eVar.f76565x2931c158;
        if (bArr2 != null) {
            o0Var2.mo11468x92b714fd(bArr2);
        }
        java.lang.String d17 = wi4.a.d(o0Var2);
        if (((d17 == null || r26.n0.N(d17)) ? i19 : 0) == 0) {
            bi4.o0 b17 = sj4.z0.f490441a.b(oi4.k.b(o0Var2));
            if (b17 != null) {
                b17.m(eVar.f76563x5493d43f, oi4.k.a(o0Var2));
            }
            if (b17 != null) {
                b17.q(frameLayout);
            }
            wi4.a.d(o0Var2);
            java.util.Objects.toString(b17);
        }
        android.widget.TextView textView4 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.olt);
        if (eVar.f76559xb0238158 == i19) {
            if (textView4 != null) {
                textView4.setVisibility(0);
            }
            if (textView == null) {
                return;
            }
            textView.setVisibility(i27);
            return;
        }
        if (textView != null) {
            textView.setVisibility(0);
        }
        if (textView4 == null) {
            return;
        }
        textView4.setVisibility(i27);
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
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18672xb885c992.f255226f.a(context, userName, textStatusItem, str);
        }
    }
}
