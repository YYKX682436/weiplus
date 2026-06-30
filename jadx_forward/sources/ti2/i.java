package ti2;

/* loaded from: classes8.dex */
public class i extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.amq;
    }

    @Override // in5.r
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void h(in5.s0 holder, vi2.e item, int i17, int i18, boolean z17, java.util.List list) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa3;
        java.lang.String str;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa4;
        java.lang.String m76184x8010e5e4;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa5;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.view.View findViewById = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f6n);
        boolean z18 = true;
        if (findViewById != null) {
            if (i17 == holder.f374655f.mo1894x7e414b06() - 1) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/convert/MicAnchorUserConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/mic/pk/data/MicAnchorUserConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/mic/pk/convert/MicAnchorUserConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/mic/pk/data/MicAnchorUserConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/convert/MicAnchorUserConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/mic/pk/data/MicAnchorUserConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/mic/pk/convert/MicAnchorUserConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/mic/pk/data/MicAnchorUserConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        android.widget.ImageView imageView = (android.widget.ImageView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f6l);
        java.lang.String str2 = null;
        r45.xn1 xn1Var = item.f519077d;
        if (imageView != null) {
            mn2.g1 g1Var = mn2.g1.f411508a;
            g1Var.a().c(new mn2.n((xn1Var == null || (c19782x23db1cfa6 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa6.m76175x6d346f39(), null, 2, null), imageView, g1Var.h(mn2.f1.f411490h));
        }
        android.widget.TextView textView = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f6q);
        if (textView != null) {
            zl2.q4 q4Var = zl2.q4.f555466a;
            java.lang.String str3 = "";
            if (xn1Var == null || (c19782x23db1cfa5 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null || (str = c19782x23db1cfa5.m76197x6c03c64c()) == null) {
                str = "";
            }
            if (xn1Var != null && (c19782x23db1cfa4 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) != null && (m76184x8010e5e4 = c19782x23db1cfa4.m76184x8010e5e4()) != null) {
                str3 = m76184x8010e5e4;
            }
            textView.setText(q4Var.p(str, str3, false));
        }
        android.widget.ImageView imageView2 = (android.widget.ImageView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f6r);
        if (imageView2 != null) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            zy2.tb.a(ya2.m1.f542044a, imageView2, (xn1Var == null || (c19782x23db1cfa3 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa3.m76160xd133dfec(), 0, 4, null);
        }
        android.widget.TextView textView2 = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f6u);
        if (textView2 != null) {
            java.lang.String m76192x3f6b0a02 = (xn1Var == null || (c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa2.m76192x3f6b0a02();
            if (m76192x3f6b0a02 != null && m76192x3f6b0a02.length() != 0) {
                z18 = false;
            }
            if (z18) {
                textView2.setVisibility(8);
                return;
            }
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            if (xn1Var != null && (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) != null) {
                str2 = c19782x23db1cfa.m76192x3f6b0a02();
            }
            float textSize = textView2.getTextSize();
            ((ke0.e) xVar).getClass();
            textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(holder.f374654e, str2, textSize));
            textView2.setVisibility(0);
        }
    }
}
