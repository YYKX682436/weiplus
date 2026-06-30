package fk2;

/* loaded from: classes3.dex */
public final class m0 extends we2.o {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(we2.a commentItemDependency) {
        super(commentItemDependency);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentItemDependency, "commentItemDependency");
    }

    @Override // we2.o
    public void d(android.content.Context context, bm2.h1 holder, dk2.zf msg, int i17) {
        java.lang.Object[] objArr;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.Object D = msg.D();
        r45.tq1 tq1Var = D instanceof r45.tq1 ? (r45.tq1) D : null;
        if (tq1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("CommentItemGameChallengeArena", "payload is not FinderLiveGameChallengeArenaSuccessInfo");
            return;
        }
        java.lang.String m75945x2fec8307 = tq1Var.m75945x2fec8307(0);
        java.lang.String m75945x2fec83072 = tq1Var.m75945x2fec8307(1);
        if (m75945x2fec8307 != null) {
            if (!(m75945x2fec83072 == null || m75945x2fec83072.length() == 0)) {
                android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
                spannableStringBuilder.append((java.lang.CharSequence) g());
                int i18 = gm2.i1.f354944f;
                gm2.e1 e1Var = new gm2.e1();
                int color = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77673x8113c22b);
                gm2.h1 h1Var = e1Var.f354891a;
                h1Var.f354915m = color;
                h1Var.f354905c = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an);
                e1Var.f((int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561124a1));
                e1Var.c((int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561181bn));
                e1Var.e(g());
                spannableStringBuilder.setSpan(e1Var.a(), 0, g().length(), 33);
                spannableStringBuilder.append((java.lang.CharSequence) m75945x2fec8307.concat(" "));
                spannableStringBuilder.setSpan(this.f526778f, g().length(), g().length() + m75945x2fec8307.length(), 33);
                i95.m c17 = i95.n0.c(zy2.s6.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                float f17 = this.f526780h;
                android.text.SpannableString l66 = zy2.s6.l6((zy2.s6) c17, m75945x2fec83072, (int) f17, false, null, 0, false, null, 124, null);
                spannableStringBuilder.append((java.lang.CharSequence) l66);
                java.lang.Object[] spans = l66.getSpans(0, l66.length(), java.lang.Object.class);
                int length = g().length() + m75945x2fec8307.length() + 1;
                if (spans != null) {
                    int length2 = spans.length;
                    int i19 = 0;
                    while (i19 < length2) {
                        java.lang.Object obj = spans[i19];
                        int spanStart = l66.getSpanStart(obj);
                        int spanEnd = l66.getSpanEnd(obj);
                        int spanFlags = l66.getSpanFlags(obj);
                        if (spanStart >= 0 && spanStart <= spanEnd) {
                            objArr = spans;
                            if (spanEnd <= l66.length()) {
                                spannableStringBuilder.setSpan(obj, spanStart + length, spanEnd + length, spanFlags);
                                i19++;
                                spans = objArr;
                            }
                        } else {
                            objArr = spans;
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("CommentItemGameChallengeArena", "Invalid span range: start=" + spanStart + ", end=" + spanEnd + ", spanMsgContent.length=" + l66.length());
                        i19++;
                        spans = objArr;
                    }
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = holder.f103460e;
                c22624x85d69039.b(spannableStringBuilder);
                c22624x85d69039.m84185x3abfd950(f17);
                c22624x85d69039.setOnClickListener(new fk2.k0(tq1Var, this, context));
                holder.f103462g.setBackground(context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a1k));
                android.view.ViewParent parent = c22624x85d69039.getParent();
                android.widget.RelativeLayout relativeLayout = parent instanceof android.widget.RelativeLayout ? (android.widget.RelativeLayout) parent : null;
                if (relativeLayout != null) {
                    relativeLayout.setPadding(0, relativeLayout.getPaddingTop(), relativeLayout.getPaddingRight(), relativeLayout.getPaddingBottom());
                    return;
                }
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("CommentItemGameChallengeArena", "onBindGameChallengeArenaMsg fail, nickName is " + m75945x2fec8307 + ", msgContent is " + m75945x2fec83072);
    }

    @Override // we2.o
    public dk2.zf e(r45.ch1 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        return new dk2.v6(msg);
    }

    @Override // we2.o
    public int n() {
        return 20134;
    }

    public final void q(android.content.Context context, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862, java.lang.String str) {
        android.content.Intent intent;
        java.lang.String stringExtra;
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("CommentItemGameChallengeArena", "Game challenge arena message preInjectData is empty or null");
        } else {
            jSONObject.put("backendExtData", str);
        }
        jSONObject.put("uxInfo", zl2.r4.f555483a.j0(context));
        ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
        java.lang.String str2 = a52.a.f83117l;
        java.lang.String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        jSONObject.put("commentScene", str2);
        jSONObject.put("enterImmerseType", dk2.q4.f315471a.f(((ml2.r0) i95.n0.c(ml2.r0.class)).M, "enter_immerse_type"));
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
        if (abstractActivityC21394xb3d2c0cf != null && (intent = abstractActivityC21394xb3d2c0cf.getIntent()) != null && (stringExtra = intent.getStringExtra("KEY_GAMECENTER_PARAMS_ID")) != null) {
            str3 = stringExtra;
        }
        jSONObject.put("gameClientParams", str3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CommentItemGameChallengeArena", "onclick-tag, json = " + jSONObject);
        sVar.d(kz5.b1.e(new jz5.l("preInjectData", jSONObject.toString())));
        ((c61.p2) ybVar).Oj(context, c19786x6a1e2862, sVar);
    }
}
