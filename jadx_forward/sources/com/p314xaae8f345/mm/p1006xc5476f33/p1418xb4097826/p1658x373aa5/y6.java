package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes10.dex */
public final class y6 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 f214911d;

    public y6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 c15270x6d877a34) {
        this.f214911d = c15270x6d877a34;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 c15270x6d877a34 = this.f214911d;
        c15270x6d877a34.m61859xdb574fcd().postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.w6(c15270x6d877a34), 160L);
        java.lang.String valueOf = java.lang.String.valueOf(editable);
        android.text.Editable editableText = c15270x6d877a34.m61859xdb574fcd().getEditableText();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(editableText, "getEditableText(...)");
        rx2.d dVar = c15270x6d877a34.D1;
        dVar.b(valueOf, editableText);
        dVar.f482498a.clear();
        java.util.Iterator it = dVar.f482499b.iterator();
        while (it.hasNext()) {
            r45.gb4 gb4Var = (r45.gb4) it.next();
            if (gb4Var.m75939xb282bd08(5) != 5) {
                dVar.a(gb4Var);
            }
        }
        if (hc2.f0.a(c15270x6d877a34.getFeedObj(), c15270x6d877a34.getFromMention(), c15270x6d877a34.getMentionExtFlag())) {
            c15270x6d877a34.m61894x14cd10dd().mo75358x658d5272(java.lang.String.valueOf(editable));
        }
        int commentTextLimit = (c15270x6d877a34.getCommentTextLimit() / 2) - com.p314xaae8f345.mm.ui.p2740x696c9db.v4.g(java.lang.String.valueOf(editable));
        if (commentTextLimit < -999) {
            commentTextLimit = -999;
        }
        boolean z17 = false;
        if (commentTextLimit <= c15270x6d877a34.getCommentTextLimitStart()) {
            c15270x6d877a34.m61871xbfa692db().setVisibility(0);
            c15270x6d877a34.m61871xbfa692db().setTextColor(c15270x6d877a34.getContext().getResources().getColor(commentTextLimit >= 0 ? com.p314xaae8f345.mm.R.C30859x5a72f63.f560422pr : com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23));
            c15270x6d877a34.m61871xbfa692db().setText(java.lang.String.valueOf(commentTextLimit));
            c15270x6d877a34.m61871xbfa692db().post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.x6(editable, c15270x6d877a34));
            return;
        }
        c15270x6d877a34.m61871xbfa692db().setVisibility(8);
        android.view.ViewGroup.LayoutParams layoutParams = c15270x6d877a34.m61859xdb574fcd().getLayoutParams();
        if (layoutParams != null && layoutParams.height == -2) {
            z17 = true;
        }
        if (z17) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = c15270x6d877a34.m61859xdb574fcd().getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = -2;
        }
        c15270x6d877a34.m61859xdb574fcd().requestLayout();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        if (i19 == 1) {
            if ((charSequence != null ? charSequence.charAt(i17) : ' ') == '@') {
                int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34.N1;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 c15270x6d877a34 = this.f214911d;
                c15270x6d877a34.getClass();
                if (((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.j0().r()).intValue() == 1) {
                    c15270x6d877a34.isFrozen = true;
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("key_scene", 2);
                    intent.putExtra("key_remind_finder_half_screen_source", 2);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = c15270x6d877a34.feedObj;
                    intent.putExtra("key_finder_object_id", c14994x9b99c079 != null ? java.lang.Long.valueOf(c14994x9b99c079.m59251x5db1b11()) : null);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
                    android.content.Context context = c15270x6d877a34.getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                    i0Var.Yk((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context, intent, 501, true);
                }
            }
        }
    }
}
