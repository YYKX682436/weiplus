package ui2;

/* loaded from: classes8.dex */
public final class o extends ti2.i {
    @Override // ti2.i, in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570378am5;
    }

    @Override // ti2.i, in5.r
    /* renamed from: n */
    public void h(in5.s0 holder, vi2.e item, int i17, int i18, boolean z17, java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        vi2.b bVar = item instanceof vi2.b ? (vi2.b) item : null;
        boolean z18 = true;
        if (bVar == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = holder.f3639x46306858.getLayoutParams();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams layoutParams2 = layoutParams instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.f93474i = true;
        }
        android.view.View view = holder.f3639x46306858;
        view.setBackgroundColor(b3.l.m9702x7444d5ad(view.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        int dimensionPixelSize = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        holder.f3639x46306858.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        android.view.View findViewById = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f6n);
        if (findViewById != null) {
            if (bVar.f519070g) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/convert/FinderLiveMicAnchorItemConvert/FinderLiveMicAnchorWidgetMicItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/mic/pk/data/MicAnchorUserConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/mic/pk/convert/FinderLiveMicAnchorItemConvert/FinderLiveMicAnchorWidgetMicItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/mic/pk/data/MicAnchorUserConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/convert/FinderLiveMicAnchorItemConvert/FinderLiveMicAnchorWidgetMicItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/mic/pk/data/MicAnchorUserConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/mic/pk/convert/FinderLiveMicAnchorItemConvert/FinderLiveMicAnchorWidgetMicItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/mic/pk/data/MicAnchorUserConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        android.widget.TextView textView = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f6u);
        if (textView != null) {
            r45.bh1 bh1Var = bVar.f519072i;
            if (bh1Var == null) {
                r45.xn1 xn1Var = bVar.f519077d;
                bh1Var = xn1Var != null ? (r45.bh1) xn1Var.m75936x14adae67(17) : null;
            }
            if (bh1Var == null) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                java.lang.String m75945x2fec8307 = bh1Var.m75945x2fec8307(1);
                if (m75945x2fec8307 != null && m75945x2fec8307.length() != 0) {
                    z18 = false;
                }
                if (z18) {
                    m75945x2fec8307 = zl2.r4.S(zl2.r4.f555483a, bh1Var.m75942xfb822ef2(0), 0, 2, null);
                }
                java.lang.String string = textView.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573131nr1, zl2.r4.S(zl2.r4.f555483a, bh1Var.m75942xfb822ef2(2), 0, 2, null));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m75945x2fec8307, "0")) {
                    string = string + ' ' + textView.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573130nr0, m75945x2fec8307);
                }
                textView.setText(string);
            }
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f563876bx);
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.a3k);
        if (viewGroup2 == null) {
            return;
        }
        viewGroup2.setVisibility(8);
    }
}
