package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

/* loaded from: classes10.dex */
public final class s3 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.AbstractC16697x9da72997 f233480e;

    public s3(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.AbstractC16697x9da72997 abstractC16697x9da72997) {
        this.f233480e = abstractC16697x9da72997;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c4s;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e;
        java.lang.String str;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016662;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e2;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.q3 item = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.q3) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.t3 t3Var = item.f233460d;
        long j17 = t3Var.f233484a;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = t3Var.f233485b;
        java.util.Objects.toString(c19792x256d2725);
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.AbstractC16697x9da72997 abstractC16697x9da72997 = this.f233480e;
        if (list != null && list.contains(1)) {
            android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.p0n);
            if (c19792x256d2725 == null || (m76802x2dd016662 = c19792x256d2725.m76802x2dd01666()) == null || (m76962x74cd162e2 = m76802x2dd016662.m76962x74cd162e()) == null || (c19788xd7cfd73e2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.Z(m76962x74cd162e2)) == null) {
                return;
            }
            if (c19788xd7cfd73e2.m76629x36bbd779() < lm3.d0.c(abstractC16697x9da72997.f233256s) || c19788xd7cfd73e2.m76629x36bbd779() > lm3.d0.b(abstractC16697x9da72997.f233255r)) {
                if (p17.getAlpha() == 1.0f) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Float.valueOf(0.1f));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    p17.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                    yj0.a.f(p17, "com/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    return;
                }
                return;
            }
            if (p17.getAlpha() == 0.1f) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                p17.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                return;
            }
            return;
        }
        android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.p0n);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList3.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(p18, arrayList3.toArray(), "com/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        p18.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
        yj0.a.f(p18, "com/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        if (c19792x256d2725 != null && (m76802x2dd01666 = c19792x256d2725.m76802x2dd01666()) != null && (m76962x74cd162e = m76802x2dd01666.m76962x74cd162e()) != null && (c19788xd7cfd73e = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.Z(m76962x74cd162e)) != null) {
            o11.f fVar = new o11.f();
            fVar.f423615f = ll3.i1.f400715a.b("thumb_" + t3Var.f233484a);
            fVar.f423611b = true;
            fVar.f423610a = true;
            n11.a.b().h(c19788xd7cfd73e.m76623xd93f812f() + c19788xd7cfd73e.m76624x4c9b7dca(), (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.p0n), fVar.a());
            android.view.View p19 = holder.p(com.p314xaae8f345.mm.R.id.p0n);
            if (c19788xd7cfd73e.m76629x36bbd779() < lm3.d0.c(abstractC16697x9da72997.f233256s) || c19788xd7cfd73e.m76629x36bbd779() > lm3.d0.b(abstractC16697x9da72997.f233255r)) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(java.lang.Float.valueOf(0.1f));
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(p19, arrayList4.toArray(), "com/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                p19.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
                yj0.a.f(p19, "com/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            } else {
                if (p19.getAlpha() == 0.1f) {
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    arrayList5.add(java.lang.Float.valueOf(1.0f));
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(p19, arrayList5.toArray(), "com/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    p19.setAlpha(((java.lang.Float) arrayList5.get(0)).floatValue());
                    yj0.a.f(p19, "com/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
            }
            android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.oyt);
            if (textView != null) {
                int m76629x36bbd779 = c19788xd7cfd73e.m76629x36bbd779();
                if (m76629x36bbd779 > 0) {
                    long j18 = m76629x36bbd779;
                    if (j18 < 86400) {
                        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(j18 < 3600 ? "mm:ss" : "HH:mm:ss");
                        simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone("GMT+0:00"));
                        str = simpleDateFormat.format(java.lang.Long.valueOf(j18 * 1000));
                        textView.setText(str);
                    }
                }
                str = null;
                textView.setText(str);
            }
        }
        android.content.Context context = abstractC16697x9da72997.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.c3 c3Var = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.c3) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.c3.class);
        android.widget.CheckBox checkBox = (android.widget.CheckBox) holder.p(com.p314xaae8f345.mm.R.id.g8b);
        if (checkBox != null) {
            checkBox.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.r3(item, i17, abstractC16697x9da72997, checkBox));
        }
        if (!c3Var.P6()) {
            checkBox.setVisibility(8);
            return;
        }
        checkBox.setChecked(t3Var.f233486c);
        android.view.View p27 = holder.p(com.p314xaae8f345.mm.R.id.p0n);
        if (checkBox.isChecked()) {
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(java.lang.Float.valueOf(0.1f));
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(p27, arrayList6.toArray(), "com/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            p27.setAlpha(((java.lang.Float) arrayList6.get(0)).floatValue());
            yj0.a.f(p27, "com/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        } else {
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(p27, arrayList7.toArray(), "com/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            p27.setAlpha(((java.lang.Float) arrayList7.get(0)).floatValue());
            yj0.a.f(p27, "com/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        checkBox.setVisibility(0);
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.AbstractC16697x9da72997 abstractC16697x9da72997 = this.f233480e;
        int screenWidth = (abstractC16697x9da72997.getScreenWidth() - i65.a.b(abstractC16697x9da72997.getContext(), 4)) / 3;
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) holder.p(com.p314xaae8f345.mm.R.id.m7j);
        android.view.ViewGroup.LayoutParams layoutParams = relativeLayout != null ? relativeLayout.getLayoutParams() : null;
        if (layoutParams != null) {
            layoutParams.width = screenWidth;
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = relativeLayout != null ? relativeLayout.getLayoutParams() : null;
        if (layoutParams2 == null) {
            return;
        }
        layoutParams2.height = screenWidth;
    }
}
