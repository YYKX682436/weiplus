package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

/* loaded from: classes10.dex */
public final class o1 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16689xafe4de36 f233446e;

    public o1(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16689xafe4de36 c16689xafe4de36) {
        this.f233446e = c16689xafe4de36;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c4q;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String str;
        r45.ls4 ls4Var;
        r45.os4 os4Var;
        r45.ls4 ls4Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.m1 item = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.m1) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.p1 p1Var = item.f233431d;
        java.lang.String str2 = p1Var.f233453a.f463176f;
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.c6f);
        r45.ns4 ns4Var = p1Var.f233453a;
        boolean z18 = (ns4Var == null || (ls4Var2 = ns4Var.f463174d) == null || 1 != ls4Var2.f461333d) ? false : true;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16689xafe4de36 c16689xafe4de36 = this.f233446e;
        if (z18) {
            java.lang.String str3 = (ns4Var == null || (ls4Var = ns4Var.f463174d) == null || (os4Var = ls4Var.f461334e) == null) ? null : os4Var.f464029d;
            if (str3 != null) {
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context context = c16689xafe4de36.getContext();
                ((ke0.e) xVar).getClass();
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str3));
                java.lang.String str4 = str2 + (char) 65306;
                android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
                spannableStringBuilder.append((java.lang.CharSequence) str4).append((java.lang.CharSequence) f0Var);
                int length = str4.length();
                if (length < 0) {
                    return;
                }
                spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(c16689xafe4de36.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77677xda52e0fb)), 0, length, 33);
                if (textView != null) {
                    textView.setText(spannableStringBuilder);
                }
            }
        }
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.d19);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.oxf);
        if (textView2 != null) {
            textView2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.n1(item, c16689xafe4de36));
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ns4Var != null ? ns4Var.f463184q : null)) {
            if (p17 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/view/MusicMvCommentView$MusicCommentConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/view/MusicMvCommentView$MusicCommentConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/mv/ui/view/MusicMvCommentView$MusicCommentConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/view/MusicMvCommentView$MusicCommentConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (textView2 == null) {
                return;
            }
            textView2.setVisibility(8);
            return;
        }
        if (p17 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/mv/ui/view/MusicMvCommentView$MusicCommentConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/view/MusicMvCommentView$MusicCommentConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/mv/ui/view/MusicMvCommentView$MusicCommentConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/view/MusicMvCommentView$MusicCommentConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        if (ns4Var == null || (str = ns4Var.f463184q) == null) {
            str = "";
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView2);
        java.lang.String valueOf = java.lang.String.valueOf(c16689xafe4de36.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.h3l));
        java.lang.String concat = str.concat("的音乐视频");
        java.lang.String str5 = valueOf + ' ' + concat;
        int P = r26.n0.P(str5, concat, 0, false, 6, null);
        if (P < 0) {
            return;
        }
        int length2 = concat.length() + P;
        android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder(str5);
        spannableStringBuilder2.setSpan(new android.text.style.ForegroundColorSpan(android.graphics.Color.parseColor("#FF7D90A9")), P, length2, 18);
        textView2.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0(c16689xafe4de36.getContext()));
        textView2.setClickable(true);
        textView2.setText(spannableStringBuilder2);
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
